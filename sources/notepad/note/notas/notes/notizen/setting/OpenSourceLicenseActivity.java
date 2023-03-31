package notepad.note.notas.notes.notizen.setting;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.util.a;

public class OpenSourceLicenseActivity extends c {
    private a s;

    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_left_to_right);
    }

    private void p() {
        this.s = new a();
        ((TextView) findViewById(R.id.txt)).setText("Copyright 2015-2017 AJ Alt\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n    http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.");
    }

    public void btnClick(View view) {
        if (view.getId() == R.id.btnClose && this.s.a()) {
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
        setContentView(R.layout.activity_open_source_license);
        p();
    }
}
