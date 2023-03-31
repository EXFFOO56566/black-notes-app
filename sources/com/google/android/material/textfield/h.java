package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import b.c.b.b.e;
import b.c.b.b.i;
import com.google.android.material.textfield.TextInputLayout;

class h extends e {
    private final TextWatcher d = new a();
    private final TextInputLayout.f e = new b();
    private final TextInputLayout.g f = new c(this);

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            h hVar = h.this;
            hVar.f6017c.setChecked(!hVar.c());
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
            textInputLayout.setEndIconVisible(true);
            h hVar = h.this;
            hVar.f6017c.setChecked(!hVar.c());
            editText.removeTextChangedListener(h.this.d);
            editText.addTextChangedListener(h.this.d);
        }
    }

    class c implements TextInputLayout.g {
        c(h hVar) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            EditText editText = h.this.f6015a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(h.this.c() ? null : PasswordTransformationMethod.getInstance());
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        }
    }

    h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean c() {
        EditText editText = this.f6015a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        this.f6015a.setEndIconDrawable(a.a.k.a.a.c(this.f6016b, e.design_password_eye));
        TextInputLayout textInputLayout = this.f6015a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.password_toggle_content_description));
        this.f6015a.setEndIconOnClickListener(new d());
        this.f6015a.a(this.e);
        this.f6015a.a(this.f);
    }
}
