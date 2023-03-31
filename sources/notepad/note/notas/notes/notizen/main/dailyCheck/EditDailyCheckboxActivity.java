package notepad.note.notas.notes.notizen.main.dailyCheck;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;

public class EditDailyCheckboxActivity extends c {
    private notepad.note.notas.notes.notizen.util.a s;
    private c.a.a.a.a.b.b.c t;
    private int u;
    private MyEditTextView v;

    /* access modifiers changed from: package-private */
    public class a implements View.OnKeyListener {
        a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 66 || !EditDailyCheckboxActivity.this.s.a()) {
                return false;
            }
            EditDailyCheckboxActivity.this.p();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements MyEditTextView.a {
        b() {
        }

        @Override // notepad.note.notas.notes.notizen.ui.MyEditTextView.a
        public void a() {
            EditDailyCheckboxActivity.this.o();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p() {
        String obj = this.v.getText().toString();
        if (!obj.equals(BuildConfig.FLAVOR)) {
            this.t.a(this.u, obj);
            setResult(-1);
        }
        o();
    }

    private void q() {
        int intExtra = getIntent().getIntExtra("checkboxId", this.u);
        this.u = intExtra;
        if (intExtra == 0) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
        this.t = new c.a.a.a.a.b.b.c(this);
        this.v = (MyEditTextView) findViewById(R.id.editText);
        this.s = new notepad.note.notas.notes.notizen.util.a();
        String b2 = this.t.b(this.u);
        this.v.setText(b2);
        this.v.setHint(b2);
        this.v.requestFocus();
        this.v.setSelection(b2.length());
    }

    private void r() {
        this.v.setOnKeyListener(new a());
        this.v.setEventListener(new b());
    }

    public void btnClick(View view) {
        if (this.s.a()) {
            if (view.getId() == R.id.btnEdit) {
                p();
            } else if (view.getId() == R.id.mainLayout) {
                o();
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
        setContentView(R.layout.activity_edit_checkbox);
        q();
        r();
    }
}
