package notepad.note.notas.notes.notizen.main.search;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.checklist.ChecklistActivity;
import notepad.note.notas.notes.notizen.checklist.ConfirmPasswordChecklistActivity;
import notepad.note.notas.notes.notizen.main.search.b;
import notepad.note.notas.notes.notizen.note.password.ConfirmPasswordActivity;
import notepad.note.notas.notes.notizen.note.view.NoteActivity;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;

public class SearchActivity extends c {
    private b s;
    private MyEditTextView t;
    private d u;
    private notepad.note.notas.notes.notizen.util.a v;
    private LinearLayout w;

    /* access modifiers changed from: package-private */
    public class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            String obj = SearchActivity.this.t.getText().toString();
            if (obj.equals(BuildConfig.FLAVOR)) {
                SearchActivity.this.s.e();
                SearchActivity.this.s.d();
                SearchActivity.this.w.setVisibility(4);
                return;
            }
            SearchActivity.this.w.setVisibility(0);
            SearchActivity.this.s.a(SearchActivity.this.u.a(obj), obj);
            SearchActivity.this.s.d();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements b.a {
        b() {
        }

        @Override // notepad.note.notas.notes.notizen.main.search.b.a
        public void a(int i, String str, boolean z) {
            Intent intent;
            if (SearchActivity.this.v.a()) {
                boolean equals = str.equals(BuildConfig.FLAVOR);
                if (!z) {
                    intent = equals ? new Intent(SearchActivity.this, NoteActivity.class) : new Intent(SearchActivity.this, ConfirmPasswordActivity.class);
                    intent.putExtra("noteId", i);
                    intent.putExtra("search", SearchActivity.this.t.getText().toString());
                } else {
                    intent = equals ? new Intent(SearchActivity.this, ChecklistActivity.class) : new Intent(SearchActivity.this, ConfirmPasswordChecklistActivity.class);
                    intent.putExtra("noteId", i);
                }
                SearchActivity.this.startActivity(intent);
                SearchActivity.this.overridePendingTransition(R.anim.activity_right_to_left, R.anim.activity_hold);
            }
        }
    }

    private void o() {
        this.t.addTextChangedListener(new a());
    }

    private void p() {
        finish();
        overridePendingTransition(0, R.anim.activity_left_to_right);
    }

    private void q() {
        notepad.note.notas.notes.notizen.util.c.a(this, "#181818");
        this.v = new notepad.note.notas.notes.notizen.util.a();
        this.t = (MyEditTextView) findViewById(R.id.editSearch);
        this.w = (LinearLayout) findViewById(R.id.btnRemoveText);
        this.s = new b();
        this.u = new d(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(getResources().getConfiguration().orientation == 2 ? new GridLayoutManager(this, 4) : new GridLayoutManager(this, 2));
        recyclerView.setAdapter(this.s);
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
        } else if (view.getId() == R.id.btnRemoveText) {
            this.t.setText(BuildConfig.FLAVOR);
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
