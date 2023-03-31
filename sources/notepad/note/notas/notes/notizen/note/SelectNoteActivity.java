package notepad.note.notas.notes.notizen.note;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.R;

public class SelectNoteActivity extends c {
    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    public void btnClick(View view) {
        Intent intent;
        String str;
        if (view.getId() == R.id.btnNote) {
            intent = new Intent();
            str = "note";
        } else if (view.getId() == R.id.btnChecklist) {
            intent = new Intent();
            str = "checklist";
        } else {
            if (view.getId() != R.id.layout) {
                return;
            }
            o();
        }
        intent.putExtra("type", str);
        setResult(-1, intent);
        o();
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        o();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_select_note);
        notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
    }
}
