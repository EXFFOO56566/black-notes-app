package notepad.note.notas.notes.notizen.note.password;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.util.a;

public class RemovePasswordActivity extends c {
    private a s;

    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    public void btnClick(View view) {
        if (this.s.a()) {
            if (view.getId() == R.id.btnDelete) {
                setResult(-1);
            } else if (!(view.getId() == R.id.btnCancel || view.getId() == R.id.layout)) {
                return;
            }
            o();
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (this.s.a()) {
            o();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_password_remove);
        notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
        this.s = new a();
    }
}
