package notepad.note.notas.notes.notizen.note.password;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;
import notepad.note.notas.notes.notizen.ui.MyTextView;

public class RegisterPasswordActivity extends androidx.appcompat.app.c {
    private MyEditTextView s;
    private MyTextView t;
    private String u;
    private c v = c.REGISTER;
    private d w;
    private int x;
    private notepad.note.notas.notes.notizen.util.a y;

    /* access modifiers changed from: package-private */
    public class a implements View.OnKeyListener {
        a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            if (RegisterPasswordActivity.this.v == c.REGISTER) {
                RegisterPasswordActivity.this.r();
            } else if (RegisterPasswordActivity.this.v == c.CONFIRM) {
                RegisterPasswordActivity.this.p();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements MyEditTextView.a {
        b() {
        }

        @Override // notepad.note.notas.notes.notizen.ui.MyEditTextView.a
        public void a() {
            RegisterPasswordActivity.this.o();
        }
    }

    /* access modifiers changed from: private */
    public enum c {
        REGISTER,
        CONFIRM
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
        if (!this.u.equals(this.s.getText().toString())) {
            Toast.makeText(this, getString(R.string.notMatchPassword), 0).show();
        } else if (this.y.a()) {
            this.w.a(this.x, this.s.getText().toString());
            Intent intent = new Intent();
            intent.putExtra("password", this.s.getText().toString());
            setResult(-1, intent);
            o();
        }
    }

    private void q() {
        notepad.note.notas.notes.notizen.util.c.a(this);
        int intExtra = getIntent().getIntExtra("noteId", 0);
        this.x = intExtra;
        if (intExtra == 0) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        this.w = new d(this);
        this.t = (MyTextView) findViewById(R.id.txtBtn);
        this.s = (MyEditTextView) findViewById(R.id.editPassword);
        this.y = new notepad.note.notas.notes.notizen.util.a();
        this.s.requestFocus();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void r() {
        String obj = this.s.getText().toString();
        this.u = obj;
        if (!obj.equals(BuildConfig.FLAVOR)) {
            this.v = c.CONFIRM;
            this.t.setText(getString(R.string.confirm));
            this.s.setText(BuildConfig.FLAVOR);
        }
    }

    private void s() {
        this.s.setOnKeyListener(new a());
        this.s.setEventListener(new b());
    }

    public void btnClick(View view) {
        if (view.getId() == R.id.btn) {
            c cVar = this.v;
            if (cVar == c.REGISTER) {
                r();
            } else if (cVar == c.CONFIRM) {
                p();
            }
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
        setContentView(R.layout.activity_password_generate);
        q();
        s();
    }
}
