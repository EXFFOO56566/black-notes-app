package notepad.note.notas.notes.notizen.checklist;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.c;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;

public class EditChecklistTitleActivity extends c {
    private int s;
    private d t;
    private MyEditTextView u;

    /* access modifiers changed from: package-private */
    public class a implements View.OnKeyListener {
        a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 66) {
                return false;
            }
            EditChecklistTitleActivity.this.p();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements MyEditTextView.a {
        b() {
        }

        @Override // notepad.note.notas.notes.notizen.ui.MyEditTextView.a
        public void a() {
            EditChecklistTitleActivity.this.o();
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
        String obj = this.u.getText().toString();
        if (!obj.equals(BuildConfig.FLAVOR)) {
            this.t.a(obj, this.s);
            setResult(-1);
        }
        o();
    }

    private void q() {
        int intExtra = getIntent().getIntExtra("noteId", 0);
        this.s = intExtra;
        if (intExtra != 0) {
            notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
            this.t = new d(this);
            this.u = (MyEditTextView) findViewById(R.id.editText);
            c.a.a.a.a.b.c.d d = this.t.d(this.s);
            if (d != null) {
                if (d.i() != null) {
                    this.u.setHint(d.i());
                    this.u.setText(d.i());
                    this.u.requestFocus();
                    this.u.setSelection(d.i().length());
                    return;
                }
                return;
            }
        }
        finish();
        overridePendingTransition(0, 0);
    }

    private void r() {
        this.u.setOnKeyListener(new a());
        this.u.setEventListener(new b());
    }

    public void btnClick(View view) {
        if (view.getId() == R.id.btnEdit) {
            p();
        } else if (view.getId() == R.id.layout) {
            o();
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
        setContentView(R.layout.activity_edit_checklist);
        q();
        r();
    }
}
