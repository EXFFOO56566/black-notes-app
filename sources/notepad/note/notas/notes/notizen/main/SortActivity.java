package notepad.note.notas.notes.notizen.main;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.R;

public class SortActivity extends c {
    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    private void p() {
        Intent intent = new Intent();
        intent.putExtra("sort", "createdTime");
        setResult(-1, intent);
        o();
    }

    private void q() {
        Intent intent = new Intent();
        intent.putExtra("sort", "editedTime");
        setResult(-1, intent);
        o();
    }

    private void r() {
        Intent intent = new Intent();
        intent.putExtra("sort", "title");
        setResult(-1, intent);
        o();
    }

    public void btnClick(View view) {
        switch (view.getId()) {
            case R.id.btnCreatedTime:
                p();
                return;
            case R.id.btnEditedTime:
                q();
                return;
            case R.id.btnTitle:
                r();
                return;
            case R.id.layout:
                o();
                return;
            default:
                return;
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        o();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: notepad.note.notas.notes.notizen.main.SortActivity.onCreate(android.os.Bundle):void");
    }
}
