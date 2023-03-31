package notepad.note.notas.notes.notizen.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.util.a;

public class SettingActivity extends c {
    private a s;

    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    private void p() {
        notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
        this.s = new a();
        if (getSharedPreferences("SETTING", 0).getBoolean("isPremium", false)) {
            findViewById(R.id.btnRemoveAds).setVisibility(8);
        }
    }

    public void btnClick(View view) {
        if (this.s.a()) {
            if (view.getId() == R.id.btnBackUp) {
                startActivity(new Intent(this, BackUpRestoreActivity.class));
                finish();
                overridePendingTransition(0, 0);
                return;
            }
            if (view.getId() == R.id.btnRemoveAds) {
                Intent intent = new Intent();
                intent.putExtra("type", "removeAds");
                setResult(-1, intent);
            } else if (view.getId() == R.id.btnLicense) {
                startActivity(new Intent(this, OpenSourceLicenseActivity.class));
                overridePendingTransition(R.anim.activity_right_to_left, 0);
                return;
            } else if (view.getId() != R.id.mainLayout) {
                return;
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
        setContentView(R.layout.activity_setting);
        p();
    }
}
