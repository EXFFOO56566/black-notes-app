package com.google.android.material.textfield;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import b.c.b.b.z.k;
import com.google.android.material.textfield.TextInputLayout;

class d extends e {
    private static final boolean o = (Build.VERSION.SDK_INT >= 21);
    private final TextWatcher d = new a();
    private final TextInputLayout.e e = new b(this.f6015a);
    private final TextInputLayout.f f = new c();
    private boolean g = false;
    private boolean h = false;
    private long i = Long.MAX_VALUE;
    private StateListDrawable j;
    private b.c.b.b.z.g k;
    private AccessibilityManager l;
    private ValueAnimator m;
    private ValueAnimator n;

    class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        class RunnableC0089a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f6005b;

            RunnableC0089a(AutoCompleteTextView autoCompleteTextView) {
                this.f6005b = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f6005b.isPopupShowing();
                d.this.a((d) isPopupShowing);
                d.this.g = isPopupShowing;
            }
        }

        a() {
        }

        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView a2 = dVar.a((d) dVar.f6015a.getEditText());
            a2.post(new RunnableC0089a(a2));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b extends TextInputLayout.e {
        b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // a.g.l.a, com.google.android.material.textfield.TextInputLayout.e
        public void a(View view, a.g.l.d0.c cVar) {
            super.a(view, cVar);
            cVar.a((CharSequence) Spinner.class.getName());
            if (cVar.s()) {
                cVar.d((CharSequence) null);
            }
        }

        @Override // a.g.l.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView a2 = dVar.a((d) dVar.f6015a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.l.isTouchExplorationEnabled()) {
                d.this.d((d) a2);
            }
        }
    }

    class c implements TextInputLayout.f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView a2 = d.this.a((d) textInputLayout.getEditText());
            d.this.b((d) a2);
            d.this.a((d) a2);
            d.this.c((d) a2);
            a2.setThreshold(0);
            a2.removeTextChangedListener(d.this.d);
            a2.addTextChangedListener(d.this.d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    class View$OnClickListenerC0090d implements View.OnClickListener {
        View$OnClickListenerC0090d() {
        }

        public void onClick(View view) {
            d.this.d((d) ((AutoCompleteTextView) d.this.f6015a.getEditText()));
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f6009b;

        e(AutoCompleteTextView autoCompleteTextView) {
            this.f6009b = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.d()) {
                    d.this.g = false;
                }
                d.this.d((d) this.f6009b);
                view.performClick();
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements View.OnFocusChangeListener {
        f() {
        }

        public void onFocusChange(View view, boolean z) {
            d.this.f6015a.setEndIconActivated(z);
            if (!z) {
                d.this.a((d) false);
                d.this.g = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements AutoCompleteTextView.OnDismissListener {
        g() {
        }

        public void onDismiss() {
            d.this.g = true;
            d.this.i = System.currentTimeMillis();
            d.this.a((d) false);
        }
    }

    /* access modifiers changed from: package-private */
    public class h extends AnimatorListenerAdapter {
        h() {
        }

        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f6017c.setChecked(dVar.h);
            d.this.n.start();
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f6017c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    private ValueAnimator a(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(b.c.b.b.l.a.f1254a);
        ofFloat.setDuration((long) i2);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private AutoCompleteTextView a(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private b.c.b.b.z.g a(float f2, float f3, float f4, int i2) {
        k.b n2 = k.n();
        n2.d(f2);
        n2.e(f2);
        n2.b(f3);
        n2.c(f3);
        k a2 = n2.a();
        b.c.b.b.z.g a3 = b.c.b.b.z.g.a(this.f6016b, f4);
        a3.setShapeAppearanceModel(a2);
        a3.a(0, i2, 0, i2);
        return a3;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.f6015a.getBoxBackgroundMode();
            b.c.b.b.z.g boxBackground = this.f6015a.getBoxBackground();
            int a2 = b.c.b.b.q.a.a(autoCompleteTextView, b.c.b.b.b.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                b(autoCompleteTextView, a2, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                a(autoCompleteTextView, a2, iArr, boxBackground);
            }
        }
    }

    private void a(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, b.c.b.b.z.g gVar) {
        int boxBackgroundColor = this.f6015a.getBoxBackgroundColor();
        int[] iArr2 = {b.c.b.b.q.a.a(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (o) {
            u.a(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        b.c.b.b.z.g gVar2 = new b.c.b.b.z.g(gVar.k());
        gVar2.a(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int t = u.t(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int s = u.s(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        u.a(autoCompleteTextView, layerDrawable);
        u.a(autoCompleteTextView, t, paddingTop, s, paddingBottom);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.n.cancel();
            this.m.start();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (o) {
            int boxBackgroundMode = this.f6015a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.k;
            } else if (boxBackgroundMode == 1) {
                drawable = this.j;
            } else {
                return;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    private void b(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, b.c.b.b.z.g gVar) {
        LayerDrawable layerDrawable;
        int a2 = b.c.b.b.q.a.a(autoCompleteTextView, b.c.b.b.b.colorSurface);
        b.c.b.b.z.g gVar2 = new b.c.b.b.z.g(gVar.k());
        int a3 = b.c.b.b.q.a.a(i2, a2, 0.1f);
        gVar2.a(new ColorStateList(iArr, new int[]{a3, 0}));
        if (o) {
            gVar2.setTint(a2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a3, a2});
            b.c.b.b.z.g gVar3 = new b.c.b.b.z.g(gVar.k());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        u.a(autoCompleteTextView, layerDrawable);
    }

    private void c() {
        this.n = a(67, 0.0f, 1.0f);
        ValueAnimator a2 = a(50, 1.0f, 0.0f);
        this.m = a2;
        a2.addListener(new h());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new f());
        if (o) {
            autoCompleteTextView.setOnDismissListener(new g());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void d(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (d()) {
                this.g = false;
            }
            if (!this.g) {
                if (o) {
                    a(!this.h);
                } else {
                    this.h = !this.h;
                    this.f6017c.toggle();
                }
                if (this.h) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.g = false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean d() {
        long currentTimeMillis = System.currentTimeMillis() - this.i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        float dimensionPixelOffset = (float) this.f6016b.getResources().getDimensionPixelOffset(b.c.b.b.d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f6016b.getResources().getDimensionPixelOffset(b.c.b.b.d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f6016b.getResources().getDimensionPixelOffset(b.c.b.b.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        b.c.b.b.z.g a2 = a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        b.c.b.b.z.g a3 = a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.k = a2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, a2);
        this.j.addState(new int[0], a3);
        this.f6015a.setEndIconDrawable(a.a.k.a.a.c(this.f6016b, o ? b.c.b.b.e.mtrl_dropdown_arrow : b.c.b.b.e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f6015a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(b.c.b.b.i.exposed_dropdown_menu_content_description));
        this.f6015a.setEndIconOnClickListener(new View$OnClickListenerC0090d());
        this.f6015a.a(this.f);
        c();
        u.h(this.f6017c, 2);
        this.l = (AccessibilityManager) this.f6016b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean a(int i2) {
        return i2 != 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean b() {
        return true;
    }
}
