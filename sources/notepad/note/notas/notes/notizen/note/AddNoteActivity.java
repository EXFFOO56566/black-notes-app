package notepad.note.notas.notes.notizen.note;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.c;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;
import notepad.note.notas.notes.notizen.util.a;

public class AddNoteActivity extends c {
    private int s;
    private MyEditTextView t;
    private MyEditTextView u;
    private d v;
    private a w;
    private boolean x = false;
    private int y = 0;

    private void a(Bundle bundle) {
        this.w = new a();
        this.s = getIntent().getIntExtra("categoryId", 0);
        this.v = new d(this);
        this.t = (MyEditTextView) findViewById(R.id.editTitle);
        this.u = (MyEditTextView) findViewById(R.id.editContent);
        this.t.requestFocus();
        if (bundle != null) {
            this.y = bundle.getInt("noteId", 0);
            this.x = bundle.getBoolean("isCreatedNote", false);
        }
        c(getSharedPreferences("SETTING", 0).getInt("NOTE_TEXT_COLOR", 0));
        v();
        t();
    }

    private void c(int i) {
        MyEditTextView myEditTextView;
        String str;
        if (i == 0) {
            myEditTextView = this.u;
            str = "#899298";
        } else if (i == 1) {
            myEditTextView = this.u;
            str = "#BFBFBF";
        } else if (i == 2) {
            myEditTextView = this.u;
            str = "#E6E6E6";
        } else {
            return;
        }
        myEditTextView.setTextColor(Color.parseColor(str));
    }

    private void o() {
        String obj = this.t.getText().toString();
        String obj2 = this.u.getText().toString();
        if (!obj.equals(BuildConfig.FLAVOR) || !obj2.equals(BuildConfig.FLAVOR)) {
            this.x = true;
            this.v.a(obj, obj2, 0, this.s, false);
            this.y = this.v.c();
        }
    }

    private void p() {
        int i = 0;
        SharedPreferences sharedPreferences = getSharedPreferences("SETTING", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i2 = sharedPreferences.getInt("NOTE_TEXT_COLOR", 0);
        if (i2 < 2) {
            i = i2 + 1;
        }
        edit.putInt("NOTE_TEXT_COLOR", i);
        edit.apply();
        c(i);
    }

    private void q() {
        int i;
        switch (notepad.note.notas.notes.notizen.util.d.a(this)) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 1;
                break;
            default:
                return;
        }
        notepad.note.notas.notes.notizen.util.d.a(this, i);
    }

    private void r() {
        if (this.y != 0) {
            String obj = this.t.getText().toString();
            String obj2 = this.u.getText().toString();
            if (obj.equals(BuildConfig.FLAVOR) && obj2.equals(BuildConfig.FLAVOR)) {
                this.v.b(this.y);
            }
        }
    }

    private void s() {
        finish();
        overridePendingTransition(0, R.anim.activity_left_to_right);
    }

    private void t() {
        Intent intent = getIntent();
        if ("android.intent.action.SEND".equals(intent.getAction()) && intent.getType() != null && "text/plain".equals(intent.getType())) {
            if (intent.getStringExtra("android.intent.extra.SUBJECT") != null) {
                this.t.setText(intent.getStringExtra("android.intent.extra.SUBJECT"));
            }
            if (intent.getStringExtra("android.intent.extra.TEXT") != null) {
                this.u.setText(intent.getStringExtra("android.intent.extra.TEXT"));
            }
        }
    }

    private void u() {
        if (this.x) {
            w();
        } else {
            o();
        }
    }

    private void v() {
        float f;
        MyEditTextView myEditTextView;
        switch (notepad.note.notas.notes.notizen.util.d.a(this)) {
            case 1:
                myEditTextView = this.u;
                f = 17.0f;
                break;
            case 2:
                myEditTextView = this.u;
                f = 20.0f;
                break;
            case 3:
                myEditTextView = this.u;
                f = 24.0f;
                break;
            case 4:
                myEditTextView = this.u;
                f = 28.0f;
                break;
            case 5:
                myEditTextView = this.u;
                f = 33.0f;
                break;
            case 6:
                myEditTextView = this.u;
                f = 42.0f;
                break;
            default:
                return;
        }
        myEditTextView.setTextSize(1, f);
    }

    private void w() {
        if (this.y != 0) {
            this.v.a(this.t.getText().toString(), this.u.getText().toString(), this.y);
        }
    }

    public void btnClick(View view) {
        if (view.getId() == R.id.btnAdd || view.getId() == R.id.btnClose) {
            if (this.w.a()) {
                u();
                r();
                s();
            }
        } else if (view.getId() == R.id.btnChangeTextSize) {
            q();
            v();
        } else if (view.getId() == R.id.btnChangeTextColor) {
            p();
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        u();
        r();
        s();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_note);
        a(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("noteId", this.y);
        bundle.putBoolean("isCreatedNote", this.x);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.appcompat.app.c
    public void onStop() {
        super.onStop();
        u();
    }
}
