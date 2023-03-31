package notepad.note.notas.notes.notizen.checklist.guide;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.util.a;
import notepad.note.notas.notes.notizen.util.recyclerView.a.b;
import notepad.note.notas.notes.notizen.util.recyclerView.a.e;

public class GuideActivity extends c implements e {
    private a s;
    private f t;

    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_left_to_right);
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.e
    public void a(RecyclerView.d0 d0Var) {
        this.t.b(d0Var);
    }

    public void btnClick(View view) {
        if (this.s.a() && view.getId() == R.id.btnClose) {
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
        setContentView(R.layout.activity_checklist_guide);
        notepad.note.notas.notes.notizen.util.c.a(this);
        this.s = new a();
        b bVar = new b(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(bVar);
        f fVar = new f(new b(bVar));
        this.t = fVar;
        fVar.a(recyclerView);
    }
}
