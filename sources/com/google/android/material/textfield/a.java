package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import b.c.b.b.i;
import com.google.android.material.textfield.TextInputLayout;

class a extends e {
    private final TextWatcher d = new C0088a();
    private final TextInputLayout.f e = new b();
    private AnimatorSet f;
    private ValueAnimator g;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    class C0088a implements TextWatcher {
        C0088a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!a.b(editable)) {
                a.this.f.cancel();
                a.this.g.start();
            } else if (!a.this.f6015a.a()) {
                a.this.g.cancel();
                a.this.f.start();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.b(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(a.this.d);
            editText.addTextChangedListener(a.this.d);
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            a.this.f6015a.getEditText().setText((CharSequence) null);
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        public void onAnimationStart(Animator animator) {
            a.this.f6015a.setEndIconVisible(true);
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        public void onAnimationEnd(Animator animator) {
            a.this.f6015a.setEndIconVisible(false);
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f6017c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f6017c.setScaleX(floatValue);
            a.this.f6017c.setScaleY(floatValue);
        }
    }

    a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    private ValueAnimator a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(b.c.b.b.l.a.f1254a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new f());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public static boolean b(Editable editable) {
        return editable.length() > 0;
    }

    private ValueAnimator c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(b.c.b.b.l.a.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new g());
        return ofFloat;
    }

    private void d() {
        ValueAnimator c2 = c();
        ValueAnimator a2 = a(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f = animatorSet;
        animatorSet.playTogether(c2, a2);
        this.f.addListener(new d());
        ValueAnimator a3 = a(1.0f, 0.0f);
        this.g = a3;
        a3.addListener(new e());
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        this.f6015a.setEndIconDrawable(a.a.k.a.a.c(this.f6016b, b.c.b.b.e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f6015a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.clear_text_end_icon_content_description));
        this.f6015a.setEndIconOnClickListener(new c());
        this.f6015a.a(this.e);
        d();
    }
}
