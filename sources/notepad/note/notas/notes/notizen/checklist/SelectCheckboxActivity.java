package notepad.note.notas.notes.notizen.checklist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.util.a;

public class SelectCheckboxActivity extends c {
    private a s;

    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    public void btnClick(View view) {
        Intent intent;
        String str;
        if (this.s.a()) {
            if (view.getId() != R.id.layout) {
                if (view.getId() == R.id.btnDelete) {
                    intent = new Intent();
                    str = "delete";
                } else if (view.getId() == R.id.btnUncheck) {
                    intent = new Intent();
                    str = "unCheck";
                } else {
                    return;
                }
                intent.putExtra("type", str);
                setResult(-1, intent);
            }
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
        setContentView(R.layout.activity_select_checkbox);
        notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
        this.s = new a();
    }
}
