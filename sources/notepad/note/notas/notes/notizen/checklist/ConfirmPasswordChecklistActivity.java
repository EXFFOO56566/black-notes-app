package notepad.note.notas.notes.notizen.checklist;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;
import notepad.note.notas.notes.notizen.ui.MyTextView;

public class ConfirmPasswordChecklistActivity extends androidx.appcompat.app.c {
    private c.a.a.a.a.b.c.d s;
    private MyEditTextView t;
    private MyTextView u;
    private notepad.note.notas.notes.notizen.util.a v;

    /* access modifiers changed from: package-private */
    public class a implements b.b.a.b.a.b {
        a() {
        }

        @Override // b.b.a.b.a.b
        public void a(int i) {
            if (ConfirmPasswordChecklistActivity.this.v.a()) {
                ConfirmPasswordChecklistActivity.this.s();
            }
        }

        @Override // b.b.a.b.a.b
        public void a(b.b.a.b.a.a aVar, boolean z, CharSequence charSequence, int i, int i2) {
            ConfirmPasswordChecklistActivity.this.u.setText(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements View.OnKeyListener {
        b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            ConfirmPasswordChecklistActivity.this.p();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements TextWatcher {
        c() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() != 4) {
                if (ConfirmPasswordChecklistActivity.this.t.getText().toString().equals(ConfirmPasswordChecklistActivity.this.s.h()) && ConfirmPasswordChecklistActivity.this.v.a()) {
                    ConfirmPasswordChecklistActivity.this.s();
                }
            } else if (charSequence.length() == 4) {
                ConfirmPasswordChecklistActivity.this.p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements MyEditTextView.a {
        d() {
        }

        @Override // notepad.note.notas.notes.notizen.ui.MyEditTextView.a
        public void a() {
            ConfirmPasswordChecklistActivity.this.o();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_left_to_right);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p() {
        if (!this.s.h().equals(this.t.getText().toString())) {
            this.t.setText(BuildConfig.FLAVOR);
            Toast.makeText(this, getString(R.string.notMatchPassword), 0).show();
        } else if (this.v.a()) {
            s();
        }
    }

    private void q() {
        int intExtra = getIntent().getIntExtra("noteId", 0);
        if (intExtra != 0) {
            c.a.a.a.a.b.c.d d2 = new c.a.a.a.a.b.b.d(this).d(intExtra);
            this.s = d2;
            if (d2 != null) {
                this.v = new notepad.note.notas.notes.notizen.util.a();
                MyTextView myTextView = (MyTextView) findViewById(R.id.txtFingerPrintCheck);
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layoutFingerPrint);
                this.t = (MyEditTextView) findViewById(R.id.editPassword);
                this.u = (MyTextView) findViewById(R.id.txtFingerPrintFailure);
                this.t.requestFocus();
                b.b.a.b.a.c.a(this);
                if (!b.b.a.b.a.c.b()) {
                    linearLayout.setVisibility(8);
                    return;
                } else if (b.b.a.b.a.c.a()) {
                    myTextView.setText("On");
                    b.b.a.b.a.c.a(new a());
                    return;
                } else {
                    myTextView.setText("Off");
                    return;
                }
            }
        }
        finish();
        overridePendingTransition(0, 0);
    }

    private void r() {
        this.t.setOnKeyListener(new b());
        this.t.addTextChangedListener(new c());
        this.t.setEventListener(new d());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void s() {
        Intent intent = new Intent(this, ChecklistActivity.class);
        intent.putExtra("noteId", this.s.g());
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
    }

    public void btnClick(View view) {
        if (view.getId() == R.id.btnConfirm) {
            p();
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        o();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_password_confirm);
        q();
        r();
    }
}
