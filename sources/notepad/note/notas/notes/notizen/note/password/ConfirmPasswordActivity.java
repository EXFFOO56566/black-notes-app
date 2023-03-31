package notepad.note.notas.notes.notizen.note.password;

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
import notepad.note.notas.notes.notizen.note.view.NoteActivity;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;
import notepad.note.notas.notes.notizen.ui.MyTextView;

public class ConfirmPasswordActivity extends androidx.appcompat.app.c {
    private c.a.a.a.a.b.c.d s;
    private String t;
    private MyEditTextView u;
    private MyTextView v;
    private notepad.note.notas.notes.notizen.util.a w;

    /* access modifiers changed from: package-private */
    public class a implements b.b.a.b.a.b {
        a() {
        }

        @Override // b.b.a.b.a.b
        public void a(int i) {
            if (ConfirmPasswordActivity.this.w.a()) {
                ConfirmPasswordActivity.this.s();
            }
        }

        @Override // b.b.a.b.a.b
        public void a(b.b.a.b.a.a aVar, boolean z, CharSequence charSequence, int i, int i2) {
            ConfirmPasswordActivity.this.v.setText(charSequence);
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
            ConfirmPasswordActivity.this.p();
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
                if (ConfirmPasswordActivity.this.u.getText().toString().equals(ConfirmPasswordActivity.this.s.h()) && ConfirmPasswordActivity.this.w.a()) {
                    ConfirmPasswordActivity.this.s();
                }
            } else if (charSequence.length() == 4) {
                ConfirmPasswordActivity.this.p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements MyEditTextView.a {
        d() {
        }

        @Override // notepad.note.notas.notes.notizen.ui.MyEditTextView.a
        public void a() {
            ConfirmPasswordActivity.this.o();
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
        if (!this.s.h().equals(this.u.getText().toString())) {
            this.u.setText(BuildConfig.FLAVOR);
            Toast.makeText(this, getString(R.string.notMatchPassword), 0).show();
        } else if (this.w.a()) {
            s();
        }
    }

    private void q() {
        notepad.note.notas.notes.notizen.util.c.a(this);
        int intExtra = getIntent().getIntExtra("noteId", 0);
        if (intExtra != 0) {
            c.a.a.a.a.b.c.d d2 = new c.a.a.a.a.b.b.d(this).d(intExtra);
            this.s = d2;
            if (d2 != null) {
                if (getIntent().getStringExtra("search") != null) {
                    this.t = getIntent().getStringExtra("search");
                }
                this.w = new notepad.note.notas.notes.notizen.util.a();
                MyTextView myTextView = (MyTextView) findViewById(R.id.txtFingerPrintCheck);
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layoutFingerPrint);
                this.u = (MyEditTextView) findViewById(R.id.editPassword);
                this.v = (MyTextView) findViewById(R.id.txtFingerPrintFailure);
                this.u.requestFocus();
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
        this.u.setOnKeyListener(new b());
        this.u.addTextChangedListener(new c());
        this.u.setEventListener(new d());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void s() {
        Intent intent = new Intent(this, NoteActivity.class);
        intent.putExtra("noteId", this.s.g());
        intent.putExtra("search", this.t);
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
