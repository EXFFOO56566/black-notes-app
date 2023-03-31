package notepad.note.notas.notes.notizen.note.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;

public class NoteSearchActivity extends c {
    private InputMethodManager s;
    private MyEditTextView t;
    private notepad.note.notas.notes.notizen.util.a u;

    /* access modifiers changed from: package-private */
    public class a implements View.OnKeyListener {
        a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 66) {
                return false;
            }
            NoteSearchActivity.this.q();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements MyEditTextView.a {
        b() {
        }

        @Override // notepad.note.notas.notes.notizen.ui.MyEditTextView.a
        public void a() {
            NoteSearchActivity.this.o();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    private void p() {
        notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
        this.s = (InputMethodManager) getSystemService("input_method");
        this.t = (MyEditTextView) findViewById(R.id.editText);
        this.u = new notepad.note.notas.notes.notizen.util.a();
        this.s.showSoftInput(this.t, 1);
        this.t.requestFocus();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void q() {
        String obj = this.t.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("noteSearch", obj);
        setResult(-1, intent);
        this.s.hideSoftInputFromWindow(this.t.getWindowToken(), 0);
        o();
    }

    private void r() {
        this.t.setOnKeyListener(new a());
        this.t.setEventListener(new b());
    }

    public void btnClick(View view) {
        if (this.u.a()) {
            if (view.getId() == R.id.btnSearch) {
                q();
            } else if (view.getId() == R.id.layout) {
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
        setContentView(R.layout.activity_note_search);
        p();
        r();
    }
}
