package com.google.android.material.textfield;

import a.g.l.u;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.w0;
import androidx.appcompat.widget.z;
import b.c.b.b.i;
import b.c.b.b.j;
import b.c.b.b.z.k;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {
    private static final int s0 = j.Widget_Design_TextInputLayout;
    private int A;
    private int B;
    private final Rect C;
    private final Rect D;
    private final RectF E;
    private Typeface F;
    private final CheckableImageButton G;
    private ColorStateList H;
    private boolean I;
    private PorterDuff.Mode J;
    private boolean K;
    private Drawable L;
    private View.OnLongClickListener M;
    private final LinkedHashSet<f> N;
    private int O;
    private final SparseArray<e> P;
    private final CheckableImageButton Q;
    private final LinkedHashSet<g> R;
    private ColorStateList S;
    private boolean T;
    private PorterDuff.Mode U;
    private boolean V;
    private Drawable W;
    private Drawable a0;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f5991b;
    private final CheckableImageButton b0;

    /* renamed from: c  reason: collision with root package name */
    private final FrameLayout f5992c;
    private View.OnLongClickListener c0;
    EditText d;
    private ColorStateList d0;
    private CharSequence e;
    private ColorStateList e0;
    private final f f;
    private final int f0;
    boolean g;
    private final int g0;
    private int h;
    private int h0;
    private boolean i;
    private int i0;
    private TextView j;
    private final int j0;
    private int k;
    private final int k0;
    private int l;
    private final int l0;
    private ColorStateList m;
    private boolean m0;
    private ColorStateList n;
    final com.google.android.material.internal.a n0;
    private boolean o;
    private boolean o0;
    private CharSequence p;
    private ValueAnimator p0;
    private boolean q;
    private boolean q0;
    private b.c.b.b.z.g r;
    private boolean r0;
    private b.c.b.b.z.g s;
    private k t;
    private final int u;
    private int v;
    private final int w;
    private int x;
    private final int y;
    private final int z;

    /* access modifiers changed from: package-private */
    public class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.a(!textInputLayout.r0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.g) {
                textInputLayout2.a(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            TextInputLayout.this.Q.performClick();
            TextInputLayout.this.Q.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            TextInputLayout.this.d.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.n0.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends a.g.l.a {
        private final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            super.a(view, cVar);
            EditText editText = this.d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                cVar.g(text);
            } else if (z2) {
                cVar.g(hint);
            }
            if (z2) {
                cVar.d(hint);
                if (!z && z2) {
                    z4 = true;
                }
                cVar.l(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                cVar.c(error);
                cVar.e(true);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    /* access modifiers changed from: package-private */
    public static class h extends a.i.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();
        CharSequence d;
        boolean e;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.e = parcel.readInt() != 1 ? false : true;
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.d) + "}";
        }

        @Override // a.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.d, parcel, i);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.b.b.b.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) {
        super(com.google.android.material.internal.g.b(context, attributeSet, i2, s0), attributeSet, i2);
        int i3;
        this.f = new f(this);
        this.C = new Rect();
        this.D = new Rect();
        this.E = new RectF();
        this.N = new LinkedHashSet<>();
        this.O = 0;
        this.P = new SparseArray<>();
        this.R = new LinkedHashSet<>();
        this.n0 = new com.google.android.material.internal.a(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f5991b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.f5991b);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f5992c = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        this.f5991b.addView(this.f5992c);
        this.n0.b(b.c.b.b.l.a.f1254a);
        this.n0.a(b.c.b.b.l.a.f1254a);
        this.n0.b(8388659);
        w0 d2 = com.google.android.material.internal.g.d(context2, attributeSet, b.c.b.b.k.TextInputLayout, i2, s0, b.c.b.b.k.TextInputLayout_counterTextAppearance, b.c.b.b.k.TextInputLayout_counterOverflowTextAppearance, b.c.b.b.k.TextInputLayout_errorTextAppearance, b.c.b.b.k.TextInputLayout_helperTextTextAppearance, b.c.b.b.k.TextInputLayout_hintTextAppearance);
        this.o = d2.a(b.c.b.b.k.TextInputLayout_hintEnabled, true);
        setHint(d2.e(b.c.b.b.k.TextInputLayout_android_hint));
        this.o0 = d2.a(b.c.b.b.k.TextInputLayout_hintAnimationEnabled, true);
        this.t = k.a(context2, attributeSet, i2, s0).a();
        this.u = context2.getResources().getDimensionPixelOffset(b.c.b.b.d.mtrl_textinput_box_label_cutout_padding);
        this.w = d2.b(b.c.b.b.k.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.y = d2.c(b.c.b.b.k.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(b.c.b.b.d.mtrl_textinput_box_stroke_width_default));
        this.z = d2.c(b.c.b.b.k.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(b.c.b.b.d.mtrl_textinput_box_stroke_width_focused));
        this.x = this.y;
        float a2 = d2.a(b.c.b.b.k.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float a3 = d2.a(b.c.b.b.k.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float a4 = d2.a(b.c.b.b.k.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float a5 = d2.a(b.c.b.b.k.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        k.b m2 = this.t.m();
        if (a2 >= 0.0f) {
            m2.d(a2);
        }
        if (a3 >= 0.0f) {
            m2.e(a3);
        }
        if (a4 >= 0.0f) {
            m2.c(a4);
        }
        if (a5 >= 0.0f) {
            m2.b(a5);
        }
        this.t = m2.a();
        ColorStateList a6 = b.c.b.b.w.c.a(context2, d2, b.c.b.b.k.TextInputLayout_boxBackgroundColor);
        if (a6 != null) {
            int defaultColor = a6.getDefaultColor();
            this.i0 = defaultColor;
            this.B = defaultColor;
            if (a6.isStateful()) {
                this.j0 = a6.getColorForState(new int[]{-16842910}, -1);
                i3 = a6.getColorForState(new int[]{16843623}, -1);
            } else {
                ColorStateList b2 = a.a.k.a.a.b(context2, b.c.b.b.c.mtrl_filled_background_color);
                this.j0 = b2.getColorForState(new int[]{-16842910}, -1);
                i3 = b2.getColorForState(new int[]{16843623}, -1);
            }
            this.k0 = i3;
        } else {
            this.B = 0;
            this.i0 = 0;
            this.j0 = 0;
            this.k0 = 0;
        }
        if (d2.g(b.c.b.b.k.TextInputLayout_android_textColorHint)) {
            ColorStateList a7 = d2.a(b.c.b.b.k.TextInputLayout_android_textColorHint);
            this.e0 = a7;
            this.d0 = a7;
        }
        ColorStateList a8 = b.c.b.b.w.c.a(context2, d2, b.c.b.b.k.TextInputLayout_boxStrokeColor);
        if (a8 == null || !a8.isStateful()) {
            this.h0 = d2.a(b.c.b.b.k.TextInputLayout_boxStrokeColor, 0);
            this.f0 = a.g.d.a.a(context2, b.c.b.b.c.mtrl_textinput_default_box_stroke_color);
            this.l0 = a.g.d.a.a(context2, b.c.b.b.c.mtrl_textinput_disabled_color);
            this.g0 = a.g.d.a.a(context2, b.c.b.b.c.mtrl_textinput_hovered_box_stroke_color);
        } else {
            this.f0 = a8.getDefaultColor();
            this.l0 = a8.getColorForState(new int[]{-16842910}, -1);
            this.g0 = a8.getColorForState(new int[]{16843623}, -1);
            this.h0 = a8.getColorForState(new int[]{16842908}, -1);
        }
        if (d2.g(b.c.b.b.k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(d2.g(b.c.b.b.k.TextInputLayout_hintTextAppearance, 0));
        }
        int g2 = d2.g(b.c.b.b.k.TextInputLayout_errorTextAppearance, 0);
        boolean a9 = d2.a(b.c.b.b.k.TextInputLayout_errorEnabled, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(b.c.b.b.h.design_text_input_end_icon, (ViewGroup) this.f5991b, false);
        this.b0 = checkableImageButton;
        this.f5991b.addView(checkableImageButton);
        this.b0.setVisibility(8);
        if (d2.g(b.c.b.b.k.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(d2.b(b.c.b.b.k.TextInputLayout_errorIconDrawable));
        }
        if (d2.g(b.c.b.b.k.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(b.c.b.b.w.c.a(context2, d2, b.c.b.b.k.TextInputLayout_errorIconTint));
        }
        if (d2.g(b.c.b.b.k.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(com.google.android.material.internal.h.a(d2.d(b.c.b.b.k.TextInputLayout_errorIconTintMode, -1), (PorterDuff.Mode) null));
        }
        this.b0.setContentDescription(getResources().getText(i.error_icon_content_description));
        u.h(this.b0, 2);
        this.b0.setClickable(false);
        this.b0.setPressable(false);
        this.b0.setFocusable(false);
        int g3 = d2.g(b.c.b.b.k.TextInputLayout_helperTextTextAppearance, 0);
        boolean a10 = d2.a(b.c.b.b.k.TextInputLayout_helperTextEnabled, false);
        CharSequence e2 = d2.e(b.c.b.b.k.TextInputLayout_helperText);
        boolean a11 = d2.a(b.c.b.b.k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(d2.d(b.c.b.b.k.TextInputLayout_counterMaxLength, -1));
        this.l = d2.g(b.c.b.b.k.TextInputLayout_counterTextAppearance, 0);
        this.k = d2.g(b.c.b.b.k.TextInputLayout_counterOverflowTextAppearance, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(b.c.b.b.h.design_text_input_start_icon, (ViewGroup) this.f5991b, false);
        this.G = checkableImageButton2;
        this.f5991b.addView(checkableImageButton2);
        this.G.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (d2.g(b.c.b.b.k.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(d2.b(b.c.b.b.k.TextInputLayout_startIconDrawable));
            if (d2.g(b.c.b.b.k.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(d2.e(b.c.b.b.k.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(d2.a(b.c.b.b.k.TextInputLayout_startIconCheckable, true));
        }
        if (d2.g(b.c.b.b.k.TextInputLayout_startIconTint)) {
            setStartIconTintList(b.c.b.b.w.c.a(context2, d2, b.c.b.b.k.TextInputLayout_startIconTint));
        }
        if (d2.g(b.c.b.b.k.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(com.google.android.material.internal.h.a(d2.d(b.c.b.b.k.TextInputLayout_startIconTintMode, -1), (PorterDuff.Mode) null));
        }
        setHelperTextEnabled(a10);
        setHelperText(e2);
        setHelperTextTextAppearance(g3);
        setErrorEnabled(a9);
        setErrorTextAppearance(g2);
        setCounterTextAppearance(this.l);
        setCounterOverflowTextAppearance(this.k);
        if (d2.g(b.c.b.b.k.TextInputLayout_errorTextColor)) {
            setErrorTextColor(d2.a(b.c.b.b.k.TextInputLayout_errorTextColor));
        }
        if (d2.g(b.c.b.b.k.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(d2.a(b.c.b.b.k.TextInputLayout_helperTextTextColor));
        }
        if (d2.g(b.c.b.b.k.TextInputLayout_hintTextColor)) {
            setHintTextColor(d2.a(b.c.b.b.k.TextInputLayout_hintTextColor));
        }
        if (d2.g(b.c.b.b.k.TextInputLayout_counterTextColor)) {
            setCounterTextColor(d2.a(b.c.b.b.k.TextInputLayout_counterTextColor));
        }
        if (d2.g(b.c.b.b.k.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(d2.a(b.c.b.b.k.TextInputLayout_counterOverflowTextColor));
        }
        setCounterEnabled(a11);
        setBoxBackgroundMode(d2.d(b.c.b.b.k.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(b.c.b.b.h.design_text_input_end_icon, (ViewGroup) this.f5992c, false);
        this.Q = checkableImageButton3;
        this.f5992c.addView(checkableImageButton3);
        this.Q.setVisibility(8);
        this.P.append(-1, new b(this));
        this.P.append(0, new g(this));
        this.P.append(1, new h(this));
        this.P.append(2, new a(this));
        this.P.append(3, new d(this));
        if (d2.g(b.c.b.b.k.TextInputLayout_endIconMode)) {
            setEndIconMode(d2.d(b.c.b.b.k.TextInputLayout_endIconMode, 0));
            if (d2.g(b.c.b.b.k.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(d2.b(b.c.b.b.k.TextInputLayout_endIconDrawable));
            }
            if (d2.g(b.c.b.b.k.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(d2.e(b.c.b.b.k.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(d2.a(b.c.b.b.k.TextInputLayout_endIconCheckable, true));
        } else if (d2.g(b.c.b.b.k.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(d2.a(b.c.b.b.k.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(d2.b(b.c.b.b.k.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(d2.e(b.c.b.b.k.TextInputLayout_passwordToggleContentDescription));
            if (d2.g(b.c.b.b.k.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(b.c.b.b.w.c.a(context2, d2, b.c.b.b.k.TextInputLayout_passwordToggleTint));
            }
            if (d2.g(b.c.b.b.k.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(com.google.android.material.internal.h.a(d2.d(b.c.b.b.k.TextInputLayout_passwordToggleTintMode, -1), (PorterDuff.Mode) null));
            }
        }
        if (!d2.g(b.c.b.b.k.TextInputLayout_passwordToggleEnabled)) {
            if (d2.g(b.c.b.b.k.TextInputLayout_endIconTint)) {
                setEndIconTintList(b.c.b.b.w.c.a(context2, d2, b.c.b.b.k.TextInputLayout_endIconTint));
            }
            if (d2.g(b.c.b.b.k.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(com.google.android.material.internal.h.a(d2.d(b.c.b.b.k.TextInputLayout_endIconTintMode, -1), (PorterDuff.Mode) null));
            }
        }
        d2.a();
        u.h(this, 2);
    }

    private void A() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.j;
        if (textView != null) {
            a(textView, this.i ? this.k : this.l);
            if (!this.i && (colorStateList2 = this.m) != null) {
                this.j.setTextColor(colorStateList2);
            }
            if (this.i && (colorStateList = this.n) != null) {
                this.j.setTextColor(colorStateList);
            }
        }
    }

    private boolean B() {
        int max;
        if (this.d == null || this.d.getMeasuredHeight() >= (max = Math.max(this.Q.getMeasuredHeight(), this.G.getMeasuredHeight()))) {
            return false;
        }
        this.d.setMinimumHeight(max);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean C() {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.C():boolean");
    }

    private void D() {
        if (this.v != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5991b.getLayoutParams();
            int m2 = m();
            if (m2 != layoutParams.topMargin) {
                layoutParams.topMargin = m2;
                this.f5991b.requestLayout();
            }
        }
    }

    private int a(Rect rect, float f2) {
        return u() ? (int) (((float) rect.centerY()) - (f2 / 2.0f)) : rect.top + this.d.getCompoundPaddingTop();
    }

    private int a(Rect rect, Rect rect2, float f2) {
        return this.v == 1 ? (int) (((float) rect2.top) + f2) : rect.bottom - this.d.getCompoundPaddingBottom();
    }

    private Rect a(Rect rect) {
        int i2;
        int i3;
        int i4;
        EditText editText = this.d;
        if (editText != null) {
            Rect rect2 = this.D;
            rect2.bottom = rect.bottom;
            int i5 = this.v;
            if (i5 == 1) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                i2 = rect.top + this.w;
            } else if (i5 != 2) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                i2 = getPaddingTop();
            } else {
                rect2.left = rect.left + editText.getPaddingLeft();
                rect2.top = rect.top - m();
                i3 = rect.right;
                i4 = this.d.getPaddingRight();
                rect2.right = i3 - i4;
                return rect2;
            }
            rect2.top = i2;
            i3 = rect.right;
            i4 = this.d.getCompoundPaddingRight();
            rect2.right = i3 - i4;
            return rect2;
        }
        throw new IllegalStateException();
    }

    private static void a(Context context, TextView textView, int i2, int i3, boolean z2) {
        textView.setContentDescription(context.getString(z2 ? i.character_counter_overflowed_content_description : i.character_counter_content_description, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    private void a(Canvas canvas) {
        b.c.b.b.z.g gVar = this.s;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.x;
            this.s.draw(canvas);
        }
    }

    private void a(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.u;
        rectF.left = f2 - ((float) i2);
        rectF.top -= (float) i2;
        rectF.right += (float) i2;
        rectF.bottom += (float) i2;
    }

    private static void a(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z2);
            }
        }
    }

    private static void a(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a(checkableImageButton, onLongClickListener);
    }

    private static void a(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean x2 = u.x(checkableImageButton);
        boolean z2 = false;
        int i2 = 1;
        boolean z3 = onLongClickListener != null;
        if (x2 || z3) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(x2);
        checkableImageButton.setPressable(x2);
        checkableImageButton.setLongClickable(z3);
        if (!z2) {
            i2 = 2;
        }
        u.h(checkableImageButton, i2);
    }

    private void a(CheckableImageButton checkableImageButton, boolean z2, ColorStateList colorStateList, boolean z3, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z2 || z3)) {
            drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
            if (z2) {
                androidx.core.graphics.drawable.a.a(drawable, colorStateList);
            }
            if (z3) {
                androidx.core.graphics.drawable.a.a(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void a(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        com.google.android.material.internal.a aVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = true;
        boolean z5 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.d;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        }
        boolean c2 = this.f.c();
        ColorStateList colorStateList2 = this.d0;
        if (colorStateList2 != null) {
            this.n0.a(colorStateList2);
            this.n0.b(this.d0);
        }
        if (!isEnabled) {
            this.n0.a(ColorStateList.valueOf(this.l0));
            this.n0.b(ColorStateList.valueOf(this.l0));
        } else if (c2) {
            this.n0.a(this.f.f());
        } else {
            if (this.i && (textView = this.j) != null) {
                aVar = this.n0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.e0) != null) {
                aVar = this.n0;
            }
            aVar.a(colorStateList);
        }
        if (z5 || (isEnabled() && (z4 || c2))) {
            if (z3 || this.m0) {
                b(z2);
            }
        } else if (z3 || !this.m0) {
            c(z2);
        }
    }

    private Rect b(Rect rect) {
        if (this.d != null) {
            Rect rect2 = this.D;
            float e2 = this.n0.e();
            rect2.left = rect.left + this.d.getCompoundPaddingLeft();
            rect2.top = a(rect, e2);
            rect2.right = rect.right - this.d.getCompoundPaddingRight();
            rect2.bottom = a(rect, rect2, e2);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void b(int i2) {
        Iterator<g> it = this.R.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2);
        }
    }

    private void b(Canvas canvas) {
        if (this.o) {
            this.n0.a(canvas);
        }
    }

    private static void b(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a(checkableImageButton, onLongClickListener);
    }

    private void b(boolean z2) {
        ValueAnimator valueAnimator = this.p0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.p0.cancel();
        }
        if (!z2 || !this.o0) {
            this.n0.b(1.0f);
        } else {
            a(1.0f);
        }
        this.m0 = false;
        if (q()) {
            w();
        }
    }

    private void c(Rect rect) {
        b.c.b.b.z.g gVar = this.s;
        if (gVar != null) {
            int i2 = rect.bottom;
            gVar.setBounds(rect.left, i2 - this.z, rect.right, i2);
        }
    }

    private void c(boolean z2) {
        ValueAnimator valueAnimator = this.p0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.p0.cancel();
        }
        if (!z2 || !this.o0) {
            this.n0.b(0.0f);
        } else {
            a(0.0f);
        }
        if (q() && ((c) this.r).s()) {
            p();
        }
        this.m0 = true;
    }

    private void d(boolean z2) {
        if (!z2 || getEndIconDrawable() == null) {
            i();
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.i(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.b(mutate, this.f.e());
        this.Q.setImageDrawable(mutate);
    }

    private void g() {
        b.c.b.b.z.g gVar = this.r;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.t);
            if (n()) {
                this.r.a((float) this.x, this.A);
            }
            int l2 = l();
            this.B = l2;
            this.r.a(ColorStateList.valueOf(l2));
            if (this.O == 3) {
                this.d.getBackground().invalidateSelf();
            }
            h();
            invalidate();
        }
    }

    private e getEndIconDelegate() {
        e eVar = this.P.get(this.O);
        return eVar != null ? eVar : this.P.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.b0.getVisibility() == 0) {
            return this.b0;
        }
        if (!s() || !a()) {
            return null;
        }
        return this.Q;
    }

    private void h() {
        if (this.s != null) {
            if (o()) {
                this.s.a(ColorStateList.valueOf(this.A));
            }
            invalidate();
        }
    }

    private void i() {
        a(this.Q, this.T, this.S, this.V, this.U);
    }

    private void j() {
        a(this.G, this.I, this.H, this.K, this.J);
    }

    private void k() {
        int i2 = this.v;
        if (i2 == 0) {
            this.r = null;
        } else if (i2 == 1) {
            this.r = new b.c.b.b.z.g(this.t);
            this.s = new b.c.b.b.z.g();
            return;
        } else if (i2 == 2) {
            this.r = (!this.o || (this.r instanceof c)) ? new b.c.b.b.z.g(this.t) : new c(this.t);
        } else {
            throw new IllegalArgumentException(this.v + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        this.s = null;
    }

    private int l() {
        return this.v == 1 ? b.c.b.b.q.a.a(b.c.b.b.q.a.a(this, b.c.b.b.b.colorSurface, 0), this.B) : this.B;
    }

    private int m() {
        float c2;
        if (!this.o) {
            return 0;
        }
        int i2 = this.v;
        if (i2 == 0 || i2 == 1) {
            c2 = this.n0.c();
        } else if (i2 != 2) {
            return 0;
        } else {
            c2 = this.n0.c() / 2.0f;
        }
        return (int) c2;
    }

    private boolean n() {
        return this.v == 2 && o();
    }

    private boolean o() {
        return this.x > -1 && this.A != 0;
    }

    private void p() {
        if (q()) {
            ((c) this.r).t();
        }
    }

    private boolean q() {
        return this.o && !TextUtils.isEmpty(this.p) && (this.r instanceof c);
    }

    private void r() {
        Iterator<f> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private boolean s() {
        return this.O != 0;
    }

    private void setEditText(EditText editText) {
        if (this.d == null) {
            if (this.O != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.d = editText;
            v();
            setTextInputAccessibilityDelegate(new e(this));
            this.n0.b(this.d.getTypeface());
            this.n0.a(this.d.getTextSize());
            int gravity = this.d.getGravity();
            this.n0.b((gravity & -113) | 48);
            this.n0.c(gravity);
            this.d.addTextChangedListener(new a());
            if (this.d0 == null) {
                this.d0 = this.d.getHintTextColors();
            }
            if (this.o) {
                if (TextUtils.isEmpty(this.p)) {
                    CharSequence hint = this.d.getHint();
                    this.e = hint;
                    setHint(hint);
                    this.d.setHint((CharSequence) null);
                }
                this.q = true;
            }
            if (this.j != null) {
                a(this.d.getText().length());
            }
            e();
            this.f.a();
            this.G.bringToFront();
            this.f5992c.bringToFront();
            this.b0.bringToFront();
            r();
            a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z2) {
        int i2 = 0;
        this.b0.setVisibility(z2 ? 0 : 8);
        FrameLayout frameLayout = this.f5992c;
        if (z2) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        if (!s()) {
            C();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.p)) {
            this.p = charSequence;
            this.n0.a(charSequence);
            if (!this.m0) {
                w();
            }
        }
    }

    private boolean t() {
        return getStartIconDrawable() != null;
    }

    private boolean u() {
        return this.v == 1 && (Build.VERSION.SDK_INT < 16 || this.d.getMinLines() <= 1);
    }

    private void v() {
        k();
        x();
        f();
        if (this.v != 0) {
            D();
        }
    }

    private void w() {
        if (q()) {
            RectF rectF = this.E;
            this.n0.a(rectF);
            a(rectF);
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((c) this.r).a(rectF);
        }
    }

    private void x() {
        if (y()) {
            u.a(this.d, this.r);
        }
    }

    private boolean y() {
        EditText editText = this.d;
        return (editText == null || this.r == null || editText.getBackground() != null || this.v == 0) ? false : true;
    }

    private void z() {
        if (this.j != null) {
            EditText editText = this.d;
            a(editText == null ? 0 : editText.getText().length());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        if (this.n0.f() != f2) {
            if (this.p0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.p0 = valueAnimator;
                valueAnimator.setInterpolator(b.c.b.b.l.a.f1255b);
                this.p0.setDuration(167L);
                this.p0.addUpdateListener(new d());
            }
            this.p0.setFloatValues(this.n0.f(), f2);
            this.p0.start();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        boolean z2 = this.i;
        if (this.h == -1) {
            this.j.setText(String.valueOf(i2));
            this.j.setContentDescription(null);
            this.i = false;
        } else {
            if (u.d(this.j) == 1) {
                u.g(this.j, 0);
            }
            this.i = i2 > this.h;
            a(getContext(), this.j, i2, this.h, this.i);
            if (z2 != this.i) {
                A();
                if (this.i) {
                    u.g(this.j, 1);
                }
            }
            this.j.setText(getContext().getString(i.character_counter_pattern, Integer.valueOf(i2), Integer.valueOf(this.h)));
        }
        if (this.d != null && z2 != this.i) {
            a(false);
            f();
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(TextView textView, int i2) {
        boolean z2 = true;
        try {
            androidx.core.widget.i.d(textView, i2);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            androidx.core.widget.i.d(textView, j.TextAppearance_AppCompat_Caption);
            textView.setTextColor(a.g.d.a.a(getContext(), b.c.b.b.c.design_error));
        }
    }

    public void a(f fVar) {
        this.N.add(fVar);
        if (this.d != null) {
            fVar.a(this);
        }
    }

    public void a(g gVar) {
        this.R.add(gVar);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        a(z2, false);
    }

    public boolean a() {
        return this.f5992c.getVisibility() == 0 && this.Q.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f5991b.addView(view, layoutParams2);
            this.f5991b.setLayoutParams(layoutParams);
            D();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public boolean b() {
        return this.f.l();
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.q;
    }

    public boolean d() {
        return this.G.getVisibility() == 0;
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText;
        if (this.e == null || (editText = this.d) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        boolean z2 = this.q;
        this.q = false;
        CharSequence hint = editText.getHint();
        this.d.setHint(this.e);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
        } finally {
            this.d.setHint(hint);
            this.q = z2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.r0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.r0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        b(canvas);
        a(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.q0) {
            boolean z2 = true;
            this.q0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.a aVar = this.n0;
            boolean a2 = aVar != null ? aVar.a(drawableState) | false : false;
            if (!u.C(this) || !isEnabled()) {
                z2 = false;
            }
            a(z2);
            e();
            f();
            if (a2) {
                invalidate();
            }
            this.q0 = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.d;
        if (editText != null && this.v == 0 && (background = editText.getBackground()) != null) {
            if (e0.a(background)) {
                background = background.mutate();
            }
            if (this.f.c()) {
                currentTextColor = this.f.e();
            } else if (!this.i || (textView = this.j) == null) {
                androidx.core.graphics.drawable.a.b(background);
                this.d.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(androidx.appcompat.widget.j.a(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.r != null && this.v != 0) {
            boolean z2 = false;
            boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
            boolean z4 = isHovered() || ((editText = this.d) != null && editText.isHovered());
            this.A = !isEnabled() ? this.l0 : this.f.c() ? this.f.e() : (!this.i || (textView = this.j) == null) ? z3 ? this.h0 : z4 ? this.g0 : this.f0 : textView.getCurrentTextColor();
            d(this.f.c() && getEndIconDelegate().b());
            if (getErrorIconDrawable() != null && this.f.k() && this.f.c()) {
                z2 = true;
            }
            setErrorIconVisible(z2);
            this.x = ((z4 || z3) && isEnabled()) ? this.z : this.y;
            if (this.v == 1) {
                this.B = !isEnabled() ? this.j0 : z4 ? this.k0 : this.i0;
            }
            g();
        }
    }

    public int getBaseline() {
        EditText editText = this.d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public b.c.b.b.z.g getBoxBackground() {
        int i2 = this.v;
        if (i2 == 1 || i2 == 2) {
            return this.r;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.B;
    }

    public int getBoxBackgroundMode() {
        return this.v;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.r.b();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.r.c();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.r.n();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.r.m();
    }

    public int getBoxStrokeColor() {
        return this.h0;
    }

    public int getCounterMaxLength() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.g || !this.i || (textView = this.j) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.m;
    }

    public ColorStateList getCounterTextColor() {
        return this.m;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.d0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.Q.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.Q.getDrawable();
    }

    public int getEndIconMode() {
        return this.O;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.Q;
    }

    public CharSequence getError() {
        if (this.f.k()) {
            return this.f.d();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f.e();
    }

    public Drawable getErrorIconDrawable() {
        return this.b0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f.e();
    }

    public CharSequence getHelperText() {
        if (this.f.l()) {
            return this.f.g();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f.h();
    }

    public CharSequence getHint() {
        if (this.o) {
            return this.p;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.n0.c();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.n0.d();
    }

    public ColorStateList getHintTextColor() {
        return this.e0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.Q.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.Q.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.G.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.G.getDrawable();
    }

    public Typeface getTypeface() {
        return this.F;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.d;
        if (editText != null) {
            Rect rect = this.C;
            com.google.android.material.internal.b.a(this, editText, rect);
            c(rect);
            if (this.o) {
                this.n0.a(a(rect));
                this.n0.b(b(rect));
                this.n0.i();
                if (q() && !this.m0) {
                    w();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        boolean B2 = B();
        boolean C2 = C();
        if (B2 || C2) {
            this.d.post(new c());
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.d);
        if (hVar.e) {
            this.Q.post(new b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f.c()) {
            hVar.d = getError();
        }
        hVar.e = s() && this.Q.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.B != i2) {
            this.B = i2;
            this.i0 = i2;
            g();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(a.g.d.a.a(getContext(), i2));
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.v) {
            this.v = i2;
            if (this.d != null) {
                v();
            }
        }
    }

    public void setBoxStrokeColor(int i2) {
        if (this.h0 != i2) {
            this.h0 = i2;
            f();
        }
    }

    public void setCounterEnabled(boolean z2) {
        if (this.g != z2) {
            if (z2) {
                z zVar = new z(getContext());
                this.j = zVar;
                zVar.setId(b.c.b.b.f.textinput_counter);
                Typeface typeface = this.F;
                if (typeface != null) {
                    this.j.setTypeface(typeface);
                }
                this.j.setMaxLines(1);
                this.f.a(this.j, 2);
                A();
                z();
            } else {
                this.f.b(this.j, 2);
                this.j = null;
            }
            this.g = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.h != i2) {
            if (i2 <= 0) {
                i2 = -1;
            }
            this.h = i2;
            if (this.g) {
                z();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.k != i2) {
            this.k = i2;
            A();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            A();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.l != i2) {
            this.l = i2;
            A();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            A();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.d0 = colorStateList;
        this.e0 = colorStateList;
        if (this.d != null) {
            a(false);
        }
    }

    public void setEnabled(boolean z2) {
        a(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.Q.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.Q.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.Q.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? a.a.k.a.a.c(getContext(), i2) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.Q.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i2) {
        int i3 = this.O;
        this.O = i2;
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().a(this.v)) {
            getEndIconDelegate().a();
            i();
            b(i3);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.v + " is not supported by the end icon mode " + i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        a(this.Q, onClickListener, this.c0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c0 = onLongClickListener;
        b(this.Q, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            this.T = true;
            i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.U != mode) {
            this.U = mode;
            this.V = true;
            i();
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (a() != z2) {
            this.Q.setVisibility(z2 ? 0 : 4);
            C();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f.k()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f.a(charSequence);
        } else {
            this.f.i();
        }
    }

    public void setErrorEnabled(boolean z2) {
        this.f.a(z2);
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? a.a.k.a.a.c(getContext(), i2) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.b0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f.k());
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
        }
        if (this.b0.getDrawable() != drawable) {
            this.b0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
            androidx.core.graphics.drawable.a.a(drawable, mode);
        }
        if (this.b0.getDrawable() != drawable) {
            this.b0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i2) {
        this.f.b(i2);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f.a(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!b()) {
                setHelperTextEnabled(true);
            }
            this.f.b(charSequence);
        } else if (b()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f.b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.f.b(z2);
    }

    public void setHelperTextTextAppearance(int i2) {
        this.f.c(i2);
    }

    public void setHint(CharSequence charSequence) {
        if (this.o) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.o0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.o) {
            this.o = z2;
            if (!z2) {
                this.q = false;
                if (!TextUtils.isEmpty(this.p) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.p);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.p)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.q = true;
            }
            if (this.d != null) {
                D();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        this.n0.a(i2);
        this.e0 = this.n0.b();
        if (this.d != null) {
            a(false);
            D();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.e0 != colorStateList) {
            if (this.d0 == null) {
                this.n0.a(colorStateList);
            }
            this.e0 = colorStateList;
            if (this.d != null) {
                a(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.Q.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? a.a.k.a.a.c(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.Q.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.O != 1) {
            setEndIconMode(1);
        } else if (!z2) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.S = colorStateList;
        this.T = true;
        i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.U = mode;
        this.V = true;
        i();
    }

    public void setStartIconCheckable(boolean z2) {
        this.G.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.G.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? a.a.k.a.a.c(getContext(), i2) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.G.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            j();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        a(this.G, onClickListener, this.M);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.M = onLongClickListener;
        b(this.G, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            this.I = true;
            j();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.J != mode) {
            this.J = mode;
            this.K = true;
            j();
        }
    }

    public void setStartIconVisible(boolean z2) {
        if (d() != z2) {
            this.G.setVisibility(z2 ? 0 : 8);
            C();
        }
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.d;
        if (editText != null) {
            u.a(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.F) {
            this.F = typeface;
            this.n0.b(typeface);
            this.f.a(typeface);
            TextView textView = this.j;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }
}
