package notepad.note.notas.notes.notizen.util;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.R;

public class RateAppActivity extends c {
    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    public void btnClick(View view) {
        int i;
        String str;
        if (view.getId() == R.id.btnRate) {
            String packageName = getPackageName();
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
            } catch (ActivityNotFoundException unused) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
            }
            ((ImageView) findViewById(R.id.star1)).setImageResource(R.drawable.btn_favorites_green);
            ((ImageView) findViewById(R.id.star2)).setImageResource(R.drawable.btn_favorites_green);
            ((ImageView) findViewById(R.id.star3)).setImageResource(R.drawable.btn_favorites_green);
            ((ImageView) findViewById(R.id.star4)).setImageResource(R.drawable.btn_favorites_green);
            ((ImageView) findViewById(R.id.star5)).setImageResource(R.drawable.btn_favorites_green);
            i = 1;
            str = "Thank you. Please write a review 🙂🙂";
        } else if (view.getId() == R.id.btnClose) {
            i = 0;
            str = "Thank you 🙂";
        } else {
            return;
        }
        Toast.makeText(this, str, i).show();
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
        setContentView(R.layout.activity_rate_app);
        c.a(this, "#000000");
    }
}
