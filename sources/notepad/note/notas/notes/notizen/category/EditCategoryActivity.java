package notepad.note.notas.notes.notizen.category;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;

public class EditCategoryActivity extends c {
    private InputMethodManager s;
    private MyEditTextView t;
    private c.a.a.a.a.b.b.a u;
    private notepad.note.notas.notes.notizen.util.a v;
    private int w;

    /* access modifiers changed from: package-private */
    public class a implements View.OnKeyListener {
        a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 66) {
                return false;
            }
            EditCategoryActivity.this.p();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements MyEditTextView.a {
        b() {
        }

        @Override // notepad.note.notas.notes.notizen.ui.MyEditTextView.a
        public void a() {
            EditCategoryActivity.this.o();
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
        this.s.hideSoftInputFromWindow(this.t.getWindowToken(), 0);
        if (!this.t.getText().toString().replaceAll("\\s", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.u.a(this.w, this.t.getText().toString());
            setResult(-1);
        }
        o();
    }

    private void q() {
        int intExtra = getIntent().getIntExtra("categoryId", 0);
        this.w = intExtra;
        if (intExtra == 0) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
        this.v = new notepad.note.notas.notes.notizen.util.a();
        this.s = (InputMethodManager) getSystemService("input_method");
        this.t = (MyEditTextView) findViewById(R.id.editText);
        c.a.a.a.a.b.b.a aVar = new c.a.a.a.a.b.b.a(this);
        this.u = aVar;
        String b2 = aVar.b(this.w);
        this.t.setHint(b2);
        this.t.setText(b2);
        this.t.setSelection(b2.length());
        this.s.showSoftInput(this.t, 1);
        this.t.requestFocus();
    }

    private void r() {
        this.t.setOnKeyListener(new a());
        this.t.setEventListener(new b());
    }

    public void btnClick(View view) {
        if (this.v.a()) {
            if (view.getId() == R.id.btnEdit) {
                p();
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
        setContentView(R.layout.activity_edit_category);
        q();
        r();
    }
}
