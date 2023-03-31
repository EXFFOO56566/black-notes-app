package notepad.note.notas.notes.notizen.main.dailyCheck;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;

public class AddDailyCheckboxActivity extends c {
    private notepad.note.notas.notes.notizen.util.a s;
    private c.a.a.a.a.b.b.c t;
    private MyEditTextView u;
    private boolean v = true;

    /* access modifiers changed from: package-private */
    public class a implements View.OnKeyListener {
        a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 66 || !AddDailyCheckboxActivity.this.s.a()) {
                return false;
            }
            AddDailyCheckboxActivity.this.o();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements MyEditTextView.a {
        b() {
        }

        @Override // notepad.note.notas.notes.notizen.ui.MyEditTextView.a
        public void a() {
            AddDailyCheckboxActivity.this.p();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o() {
        String obj = this.u.getText().toString();
        if (!obj.equals(BuildConfig.FLAVOR)) {
            this.t.a(obj, this.v);
            setResult(-1);
        }
        p();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    private void q() {
        String str;
        MyEditTextView myEditTextView;
        this.v = getIntent().getBooleanExtra("isTodo", true);
        notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
        this.t = new c.a.a.a.a.b.b.c(this);
        this.u = (MyEditTextView) findViewById(R.id.editText);
        this.s = new notepad.note.notas.notes.notizen.util.a();
        if (this.v) {
            myEditTextView = this.u;
            str = "To-Do";
        } else {
            myEditTextView = this.u;
            str = "Shopping";
        }
        myEditTextView.setHint(str);
        this.u.requestFocus();
    }

    private void r() {
        this.u.setOnKeyListener(new a());
        this.u.setEventListener(new b());
    }

    public void btnClick(View view) {
        if (this.s.a()) {
            if (view.getId() == R.id.btnAdd) {
                o();
            } else if (view.getId() == R.id.layout) {
                p();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        p();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_checkbox);
        q();
        r();
    }
}
