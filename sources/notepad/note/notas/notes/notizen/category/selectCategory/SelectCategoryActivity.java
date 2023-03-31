package notepad.note.notas.notes.notizen.category.selectCategory;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.category.AddCategoryActivity;
import notepad.note.notas.notes.notizen.category.selectCategory.b;

public class SelectCategoryActivity extends c {
    private c.a.a.a.a.b.b.a s;
    private notepad.note.notas.notes.notizen.util.a t;
    private b u;

    /* access modifiers changed from: package-private */
    public class a implements b.a {
        a() {
        }

        @Override // notepad.note.notas.notes.notizen.category.selectCategory.b.a
        public void a(int i, String str) {
            if (SelectCategoryActivity.this.t.a()) {
                Intent intent = new Intent();
                intent.putExtra("categoryId", i);
                intent.putExtra("categoryName", str);
                SelectCategoryActivity.this.setResult(-1, intent);
                SelectCategoryActivity.this.o();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_top_to_bottom);
    }

    private void p() {
        notepad.note.notas.notes.notizen.util.c.a(this);
        this.t = new notepad.note.notas.notes.notizen.util.a();
        b bVar = new b();
        this.u = bVar;
        bVar.a(new c.a.a.a.a.b.b.a(this).a());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.setAdapter(this.u);
        this.s = new c.a.a.a.a.b.b.a(this);
        String stringExtra = getIntent().getStringExtra("type");
        if (stringExtra != null && stringExtra.equals("main")) {
            notepad.note.notas.notes.notizen.util.c.a(this, "#1C1C1C");
            findViewById(R.id.mainLayout).setBackgroundColor(Color.parseColor("#1C1C1C"));
            findViewById(R.id.btnAddCategory).setBackgroundColor(Color.parseColor("#181818"));
        }
    }

    private void q() {
        this.u.a(new a());
    }

    public void btnClick(View view) {
        if (this.t.a()) {
            if (view.getId() == R.id.btnAddCategory) {
                startActivityForResult(new Intent(this, AddCategoryActivity.class), 1);
                overridePendingTransition(R.anim.activity_fade_in, 0);
            } else if (view.getId() == R.id.btnClose) {
                o();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            this.u.a(this.s.a());
            this.u.d();
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
        setContentView(R.layout.activity_select_category);
        p();
        q();
    }
}
