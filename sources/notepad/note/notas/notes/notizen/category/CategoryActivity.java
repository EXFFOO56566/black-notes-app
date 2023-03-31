package notepad.note.notas.notes.notizen.category;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.category.a;
import notepad.note.notas.notes.notizen.ui.MyTextView;
import notepad.note.notas.notes.notizen.util.recyclerView.a.e;

public class CategoryActivity extends c implements e {
    private notepad.note.notas.notes.notizen.util.a A;
    private f s;
    private c.a.a.a.a.b.b.a t;
    private a u;
    private MyTextView v;
    private MyTextView w;
    private ImageView x;
    private RelativeLayout y;
    private LinearLayout z;

    /* access modifiers changed from: package-private */
    public class a implements a.AbstractC0091a {
        a() {
        }

        @Override // notepad.note.notas.notes.notizen.category.a.AbstractC0091a
        public void a() {
            if (!CategoryActivity.this.u.f()) {
                CategoryActivity.this.a((CategoryActivity) true);
            }
        }

        @Override // notepad.note.notas.notes.notizen.category.a.AbstractC0091a
        public void a(String str, int i, String str2) {
            if (str.equals("select")) {
                if (CategoryActivity.this.A.a()) {
                    Intent intent = new Intent();
                    intent.putExtra("isAllNotes", false);
                    intent.putExtra("categoryId", i);
                    CategoryActivity.this.setResult(-1, intent);
                    CategoryActivity.this.o();
                }
            } else if (str.equals("editName") && CategoryActivity.this.A.a()) {
                Intent intent2 = new Intent(CategoryActivity.this, EditCategoryActivity.class);
                intent2.putExtra("categoryId", i);
                CategoryActivity.this.startActivityForResult(intent2, 1);
                CategoryActivity.this.overridePendingTransition(R.anim.activity_fade_in, 0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(boolean z2) {
        if (z2) {
            this.u.b(true);
            this.u.d();
            this.v.setText(getString(R.string.edit));
            this.w.setVisibility(0);
            this.y.setVisibility(8);
            this.x.setVisibility(8);
            this.z.setVisibility(8);
            return;
        }
        this.u.b(false);
        this.u.d();
        this.v.setText(getString(R.string.category));
        this.w.setVisibility(8);
        this.y.setVisibility(0);
        this.x.setVisibility(0);
        this.z.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_top_to_bottom);
    }

    private void p() {
        notepad.note.notas.notes.notizen.util.c.a(this);
        notepad.note.notas.notes.notizen.util.c.a(this, "#1C1C1C");
        this.t = new c.a.a.a.a.b.b.a(this);
        d dVar = new d(this);
        this.A = new notepad.note.notas.notes.notizen.util.a();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setFocusable(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        a aVar = new a(this, this);
        this.u = aVar;
        aVar.a(this.t.a());
        recyclerView.setAdapter(this.u);
        this.v = (MyTextView) findViewById(R.id.txtCategory);
        this.w = (MyTextView) findViewById(R.id.txtComplete);
        this.x = (ImageView) findViewById(R.id.imgEdit);
        this.y = (RelativeLayout) findViewById(R.id.btnAddCategory);
        this.z = (LinearLayout) findViewById(R.id.btnClose);
        f fVar = new f(new notepad.note.notas.notes.notizen.util.recyclerView.a.a(this.u));
        this.s = fVar;
        fVar.a(recyclerView);
        int a2 = dVar.a(0);
        ((MyTextView) findViewById(R.id.txtUnCategorizedNotes)).setText(getString(R.string.unCategorizedNotes) + " (" + a2 + ")");
    }

    private void q() {
        this.u.a(new a());
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.e
    public void a(RecyclerView.d0 d0Var) {
        this.s.b(d0Var);
    }

    public void btnClick(View view) {
        Intent intent;
        if (view.getId() != R.id.btnAddCategory) {
            if (view.getId() == R.id.btnAllNotes) {
                if (this.A.a() && !this.u.f()) {
                    intent = new Intent();
                    intent.putExtra("isAllNotes", true);
                } else {
                    return;
                }
            } else if (view.getId() == R.id.btnUncategorizedNotes) {
                if (this.A.a() && !this.u.f()) {
                    intent = new Intent();
                    intent.putExtra("isAllNotes", false);
                } else {
                    return;
                }
            } else if (view.getId() == R.id.btnClose) {
                if (this.A.a()) {
                    if (this.u.e()) {
                        intent = new Intent();
                        intent.putExtra("categoryId", 0);
                        intent.putExtra("isAllNotes", true);
                        setResult(-1, intent);
                    }
                    o();
                }
                return;
            } else if (view.getId() != R.id.btnEdit) {
                return;
            } else {
                if (this.u.f()) {
                    a(false);
                    return;
                } else {
                    a(true);
                    return;
                }
            }
            intent.putExtra("categoryId", 0);
            setResult(-1, intent);
            o();
        } else if (this.A.a()) {
            startActivityForResult(new Intent(this, AddCategoryActivity.class), 1);
            overridePendingTransition(R.anim.activity_fade_in, 0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            this.u.a(this.t.a());
            this.u.d();
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (this.u.f()) {
            a(false);
            return;
        }
        if (this.u.e()) {
            Intent intent = new Intent();
            intent.putExtra("categoryId", 0);
            intent.putExtra("isAllNotes", true);
            setResult(-1, intent);
        }
        o();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_category);
        p();
        q();
    }
}
