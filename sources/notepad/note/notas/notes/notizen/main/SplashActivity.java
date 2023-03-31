package notepad.note.notas.notes.notizen.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.R;

public class SplashActivity extends c {
    public /* synthetic */ void o() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(17432576, 17432577);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        notepad.note.notas.notes.notizen.util.c.a(this, "#1C1C1C");
        new Handler().postDelayed(new a(this), 350);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onPause() {
        super.onPause();
        finish();
    }
}
