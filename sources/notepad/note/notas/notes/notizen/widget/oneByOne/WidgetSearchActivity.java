package notepad.note.notas.notes.notizen.widget.oneByOne;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;
import notepad.note.notas.notes.notizen.widget.oneByOne.d;

public class WidgetSearchActivity extends c {
    private d s;
    private MyEditTextView t;
    private d u;
    private notepad.note.notas.notes.notizen.util.a v;

    /* access modifiers changed from: package-private */
    public class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            String obj = WidgetSearchActivity.this.t.getText().toString();
            WidgetSearchActivity.this.s.a(WidgetSearchActivity.this.u.b(obj), obj);
            WidgetSearchActivity.this.s.d();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements d.a {
        b() {
        }

        @Override // notepad.note.notas.notes.notizen.widget.oneByOne.d.a
        public void a(int i, String str, boolean z) {
            if (WidgetSearchActivity.this.v.a()) {
                Intent intent = new Intent();
                intent.putExtra("noteId", i);
                WidgetSearchActivity.this.setResult(-1, intent);
                WidgetSearchActivity.this.p();
            }
        }
    }

    private void o() {
        this.t.addTextChangedListener(new a());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p() {
        finish();
        overridePendingTransition(0, R.anim.activity_left_to_right);
    }

    private void q() {
        notepad.note.notas.notes.notizen.util.c.a(this, "#181818");
        this.v = new notepad.note.notas.notes.notizen.util.a();
        this.t = (MyEditTextView) findViewById(R.id.editSearch);
        this.s = new d();
        this.u = new c.a.a.a.a.b.b.d(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(this.s);
        this.s.a(this.u.b(BuildConfig.FLAVOR), BuildConfig.FLAVOR);
        this.s.d();
        this.t.requestFocus();
    }

    private void r() {
        o();
        s();
    }

    private void s() {
        this.s.a(new b());
    }

    public void btnClick(View view) {
        if (view.getId() == R.id.btnClose) {
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
        setContentView(R.layout.activity_search);
        q();
        r();
    }
}
