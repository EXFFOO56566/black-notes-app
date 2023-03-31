package notepad.note.notas.notes.notizen.widget.oneByOne.selectColor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.b;

public class SelectColorActivity extends c {
    private b s;

    /* access modifiers changed from: package-private */
    public class a implements b.a {
        a() {
        }

        @Override // notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.b.a
        public void a(String str) {
            Intent intent = new Intent();
            intent.putExtra("color", str);
            SelectColorActivity.this.setResult(-1, intent);
            SelectColorActivity.this.o();
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
        this.s = new b();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 5));
        recyclerView.setAdapter(this.s);
    }

    private void q() {
        this.s.a(new a());
    }

    public void btnClick(View view) {
        if (view.getId() == R.id.layout) {
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
        setContentView(R.layout.activity_widget_select_color);
        p();
        q();
    }
}
