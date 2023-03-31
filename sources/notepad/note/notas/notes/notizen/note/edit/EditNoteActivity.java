package notepad.note.notas.notes.notizen.note.edit;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.c;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import notepad.note.notas.notes.notizen.ui.MyEditTextView;
import notepad.note.notas.notes.notizen.util.a;

public class EditNoteActivity extends c {
    private boolean A = true;
    private d s;
    private int t;
    private c.a.a.a.a.b.c.d u;
    private MyEditTextView v;
    private MyEditTextView w;
    private a x;
    private int y;
    private ImageView z;

    private void o() {
        String obj = this.v.getText().toString();
        String obj2 = this.w.getText().toString();
        if (!obj.equals(this.u.i()) || !obj2.equals(this.u.c())) {
            startActivityForResult(new Intent(this, DialogChangedNoteActivity.class), 1);
            overridePendingTransition(R.anim.activity_fade_in, 0);
            return;
        }
        p();
    }

    private void p() {
        this.A = false;
        finish();
        if (this.y == 0) {
            overridePendingTransition(0, R.anim.activity_left_to_right);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    private void q() {
        String obj = this.v.getText().toString();
        String obj2 = this.w.getText().toString();
        if ((!obj.equals(BuildConfig.FLAVOR) || !obj2.equals(BuildConfig.FLAVOR)) && (!obj.equals(this.u.i()) || !obj2.equals(this.u.c()))) {
            this.s.a(obj, obj2, this.t);
            setResult(-1);
        }
        p();
    }

    private void r() {
        int intExtra = getIntent().getIntExtra("noteId", 0);
        this.t = intExtra;
        if (intExtra == 0) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        this.x = new a();
        d dVar = new d(this);
        this.s = dVar;
        c.a.a.a.a.b.c.d d = dVar.d(this.t);
        this.u = d;
        if (d == null) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        this.v = (MyEditTextView) findViewById(R.id.editTitle);
        this.w = (MyEditTextView) findViewById(R.id.editContent);
        this.z = (ImageView) findViewById(R.id.imgClose);
    }

    private void s() {
        t();
        u();
        this.v.setText(this.u.i());
        this.w.setText(this.u.c());
        this.w.requestFocus();
        int intExtra = getIntent().getIntExtra("selectedPosition", 0);
        this.y = intExtra;
        if (intExtra <= this.w.length()) {
            this.w.setSelection(this.y);
            if (this.y != 0) {
                this.z.setImageResource(R.drawable.btn_edit_close_x);
            }
        }
    }

    private void t() {
        String str;
        MyEditTextView myEditTextView;
        int i = getSharedPreferences("SETTING", 0).getInt("NOTE_TEXT_COLOR", 0);
        if (i == 0) {
            myEditTextView = this.w;
            str = "#899298";
        } else if (i == 1) {
            myEditTextView = this.w;
            str = "#BFBFBF";
        } else if (i == 2) {
            myEditTextView = this.w;
            str = "#E6E6E6";
        } else {
            return;
        }
        myEditTextView.setTextColor(Color.parseColor(str));
    }

    private void u() {
        float f;
        MyEditTextView myEditTextView;
        switch (notepad.note.notas.notes.notizen.util.d.a(this)) {
            case 1:
                myEditTextView = this.w;
                f = 17.0f;
                break;
            case 2:
                myEditTextView = this.w;
                f = 20.0f;
                break;
            case 3:
                myEditTextView = this.w;
                f = 24.0f;
                break;
            case 4:
                myEditTextView = this.w;
                f = 28.0f;
                break;
            case 5:
                myEditTextView = this.w;
                f = 33.0f;
                break;
            case 6:
                myEditTextView = this.w;
                f = 42.0f;
                break;
            default:
                return;
        }
        myEditTextView.setTextSize(1, f);
    }

    public void btnClick(View view) {
        if (this.x.a()) {
            if (view.getId() == R.id.btnEdit) {
                q();
            } else if (view.getId() == R.id.btnClose) {
                o();
            } else if (view.getId() == R.id.btnRestore) {
                int selectionStart = this.w.getSelectionStart();
                this.v.setText(this.u.i());
                this.w.setText(this.u.c());
                if (selectionStart <= this.w.length()) {
                    this.w.setSelection(selectionStart);
                    return;
                }
                MyEditTextView myEditTextView = this.w;
                myEditTextView.setSelection(myEditTextView.length());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            String stringExtra = intent.getStringExtra("type");
            if (stringExtra.equals("save")) {
                q();
            } else if (stringExtra.equals("close")) {
                p();
            }
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
        setContentView(R.layout.activity_edit_note);
        r();
        s();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.appcompat.app.c
    public void onStop() {
        super.onStop();
        if (this.A) {
            String obj = this.v.getText().toString();
            String obj2 = this.w.getText().toString();
            if (obj.equals(BuildConfig.FLAVOR) && obj2.equals(BuildConfig.FLAVOR)) {
                return;
            }
            if (!obj.equals(this.u.i()) || !obj2.equals(this.u.c())) {
                this.s.a(obj, obj2, this.t);
            }
        }
    }
}
