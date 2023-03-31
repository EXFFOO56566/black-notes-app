package notepad.note.notas.notes.notizen.checklist;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.c;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;

public class AddChecklistActivity extends c {
    private d s;
    private MyEditTextView t;
    private int u;

    /* access modifiers changed from: package-private */
    public class a implements View.OnKeyListener {
        a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 66) {
                return false;
            }
            AddChecklistActivity.this.o();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements MyEditTextView.a {
        b() {
        }

        @Override // notepad.note.notas.notes.notizen.ui.MyEditTextView.a
        public void a() {
            AddChecklistActivity.this.p();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o() {
        String obj = this.t.getText().toString();
        if (!obj.equals(BuildConfig.FLAVOR)) {
            this.s.a(obj, BuildConfig.FLAVOR, 0, this.u, true);
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
        notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
        this.t = (MyEditTextView) findViewById(R.id.editText);
        this.s = new d(this);
        this.u = getIntent().getIntExtra("categoryId", 0);
        this.t.requestFocus();
    }

    private void r() {
        this.t.setOnKeyListener(new a());
        this.t.setEventListener(new b());
    }

    public void btnClick(View view) {
        if (view.getId() == R.id.btnAdd) {
            o();
        } else if (view.getId() == R.id.layout) {
            p();
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
        setContentView(R.layout.activity_add_checklist);
        q();
        r();
    }
}
