package notepad.note.notas.notes.notizen.note.more;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.c;
import c.a.a.a.a.b.c.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyTextView;

public class NoteInformationActivity extends c {
    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    private void p() {
        int intExtra = getIntent().getIntExtra("noteId", 0);
        if (intExtra == 0) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
        d d = new c.a.a.a.a.b.b.d(this).d(intExtra);
        if (d == null) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        ((MyTextView) findViewById(R.id.txtCreatedDate)).setText(d.d());
        ((MyTextView) findViewById(R.id.txtModifiedDate)).setText(d.e());
        ((MyTextView) findViewById(R.id.txtTextLength)).setText(BuildConfig.FLAVOR + d.c().length());
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
        setContentView(R.layout.activity_note_information);
        p();
    }
}
