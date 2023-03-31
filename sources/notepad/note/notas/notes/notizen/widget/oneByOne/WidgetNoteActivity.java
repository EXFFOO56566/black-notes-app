package notepad.note.notas.notes.notizen.widget.oneByOne;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import c.a.a.a.a.b.c.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.i;
import notepad.note.notas.notes.notizen.category.selectCategory.SelectCategoryActivity;
import notepad.note.notas.notes.notizen.note.edit.EditNoteActivity;
import notepad.note.notas.notes.notizen.note.more.NoteInformationActivity;
import notepad.note.notas.notes.notizen.note.view.DeleteNoteActivity;
import notepad.note.notas.notes.notizen.note.view.NoteSearchActivity;
import notepad.note.notas.notes.notizen.note.view.SelectNoteMoreActivity;
import notepad.note.notas.notes.notizen.ui.MyTextView;
import notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.SelectColorActivity;

public class WidgetNoteActivity extends androidx.appcompat.app.c {
    private LinearLayout A;
    private notepad.note.notas.notes.notizen.util.a B;
    private String C = "purpleLight";
    private SharedPreferences.Editor D;
    private i E;
    private RemoteViews F;
    private ImageView G;
    private GestureDetector H;
    private d s;
    private int t;
    private int u;
    private c.a.a.a.a.b.b.a v;
    private c.a.a.a.a.b.b.d w;
    private MyTextView x;
    private MyTextView y;
    private MyTextView z;

    /* access modifiers changed from: package-private */
    public class a extends com.google.android.gms.ads.b {
        a() {
        }

        @Override // com.google.android.gms.ads.b
        public void d() {
            WidgetNoteActivity.this.G.setVisibility(8);
            super.d();
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends com.google.android.gms.ads.b {
        b() {
        }

        @Override // com.google.android.gms.ads.b
        public void a() {
            WidgetNoteActivity.this.finish();
        }

        @Override // com.google.android.gms.ads.b
        public void a(int i) {
        }

        @Override // com.google.android.gms.ads.b
        public void c() {
        }

        @Override // com.google.android.gms.ads.b
        public void d() {
        }

        @Override // com.google.android.gms.ads.b
        public void e() {
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            WidgetNoteActivity.this.c(WidgetNoteActivity.this.y.getSelectionStart());
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c(int i) {
        Intent intent = new Intent(this, EditNoteActivity.class);
        intent.putExtra("noteId", this.t);
        intent.putExtra("widgetId", this.u);
        intent.putExtra("selectedPosition", i);
        startActivityForResult(intent, 1);
        if (i == 0) {
            overridePendingTransition(R.anim.activity_right_to_left, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    private void d(int i) {
        MyTextView myTextView;
        String str;
        if (i == 0) {
            myTextView = this.y;
            str = "#899298";
        } else if (i == 1) {
            myTextView = this.y;
            str = "#BFBFBF";
        } else if (i == 2) {
            myTextView = this.y;
            str = "#E6E6E6";
        } else {
            return;
        }
        myTextView.setTextColor(Color.parseColor(str));
    }

    private void o() {
        int i = 0;
        SharedPreferences sharedPreferences = getSharedPreferences("SETTING", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i2 = sharedPreferences.getInt("NOTE_TEXT_COLOR", 0);
        if (i2 < 2) {
            i = i2 + 1;
        }
        edit.putInt("NOTE_TEXT_COLOR", i);
        edit.apply();
        d(i);
    }

    private void p() {
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

    private void q() {
        this.t = getIntent().getIntExtra("noteId", 0);
        this.u = getIntent().getIntExtra("widgetId", 0);
        if (this.t == 0) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("widgetColor", 0);
        this.D = sharedPreferences.edit();
        this.C = sharedPreferences.getString(Integer.toString(this.u), "purpleLight");
        notepad.note.notas.notes.notizen.util.c.a(this);
        this.B = new notepad.note.notas.notes.notizen.util.a();
        this.v = new c.a.a.a.a.b.b.a(this);
        this.w = new c.a.a.a.a.b.b.d(this);
        this.x = (MyTextView) findViewById(R.id.txtTitle);
        this.y = (MyTextView) findViewById(R.id.txtContent);
        this.z = (MyTextView) findViewById(R.id.txtCategory);
        this.A = (LinearLayout) findViewById(R.id.imgColorBox);
        this.F = new RemoteViews(getPackageName(), (int) R.layout.layout_widget_note_one_by_one);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.adsLayout);
        this.G = (ImageView) findViewById(R.id.imgAdsLoading);
        i iVar = new i(this);
        this.E = iVar;
        iVar.a(getString(R.string.interstitialAds));
        SharedPreferences sharedPreferences2 = getSharedPreferences("SETTING", 0);
        AdView adView = (AdView) findViewById(R.id.adView);
        adView.setAdListener(new a());
        boolean z2 = sharedPreferences2.getBoolean("isPremium", false);
        if (sharedPreferences2.getLong("endFreeAdsTime", System.currentTimeMillis() - 1000) < System.currentTimeMillis() && !z2) {
            adView.a(new d.a().a());
            if (sharedPreferences2.getInt("interstitialAds", 0) >= 5) {
                this.E.a(new d.a().a());
                return;
            }
            return;
        }
        relativeLayout.setVisibility(8);
    }

    private void r() {
        SharedPreferences sharedPreferences = getSharedPreferences("SETTING", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i = sharedPreferences.getInt("interstitialAds", 0);
        if (i < 5) {
            edit.putInt("interstitialAds", i + 1);
            edit.apply();
        } else if (this.E.b()) {
            edit.putInt("interstitialAds", 0);
            edit.apply();
            this.E.c();
            return;
        }
        finish();
    }

    private void s() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", this.x.getText().toString());
        intent.putExtra("android.intent.extra.TEXT", this.y.getText().toString());
        startActivity(Intent.createChooser(intent, "Send to"));
    }

    private void t() {
        this.E.a(new b());
    }

    private void u() {
        this.A.setBackgroundColor(Color.parseColor(notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.a.b(this.C)));
    }

    private void v() {
        String str;
        MyTextView myTextView;
        c.a.a.a.a.b.c.d d = this.w.d(this.t);
        this.s = d;
        if (d != null) {
            if (d.i() == null && this.s.c() == null) {
                this.F.setTextViewText(R.id.widgetTitle, "Deleted note");
                this.F.setOnClickPendingIntent(R.id.note_onebyone, null);
                AppWidgetManager.getInstance(this).updateAppWidget(this.u, this.F);
            } else {
                if (this.s.i() == null || this.s.i().equals(BuildConfig.FLAVOR)) {
                    this.x.setVisibility(8);
                } else {
                    this.x.setVisibility(0);
                    this.x.setText(this.s.i());
                }
                if (this.s.c() != null) {
                    d(getSharedPreferences("SETTING", 0).getInt("NOTE_TEXT_COLOR", 0));
                    y();
                    this.y.setText(this.s.c());
                }
                if (this.s.a() != 0) {
                    myTextView = this.z;
                    str = this.v.b(this.s.a());
                } else {
                    myTextView = this.z;
                    str = getString(R.string.category);
                }
                myTextView.setText(str);
                u();
                return;
            }
        }
        finish();
        overridePendingTransition(0, 0);
    }

    private void w() {
        x();
        z();
        t();
    }

    private void x() {
        this.y.setOnTouchListener(new c(this));
    }

    private void y() {
        float f;
        MyTextView myTextView;
        switch (notepad.note.notas.notes.notizen.util.d.a(this)) {
            case 1:
                myTextView = this.y;
                f = 17.0f;
                break;
            case 2:
                myTextView = this.y;
                f = 20.0f;
                break;
            case 3:
                myTextView = this.y;
                f = 24.0f;
                break;
            case 4:
                myTextView = this.y;
                f = 28.0f;
                break;
            case 5:
                myTextView = this.y;
                f = 33.0f;
                break;
            case 6:
                myTextView = this.y;
                f = 42.0f;
                break;
            default:
                return;
        }
        myTextView.setTextSize(1, f);
    }

    private void z() {
        this.H = new GestureDetector(this, new c());
    }

    public void a(MyTextView myTextView, String str) {
        String lowerCase = myTextView.getText().toString().toLowerCase();
        int i = 0;
        int indexOf = lowerCase.indexOf(str.toLowerCase(), 0);
        SpannableString spannableString = new SpannableString(myTextView.getText());
        int parseColor = Color.parseColor("#8030be91");
        while (i < lowerCase.length() && indexOf != -1 && (indexOf = lowerCase.indexOf(str.toLowerCase(), i)) != -1) {
            spannableString.setSpan(new BackgroundColorSpan(parseColor), indexOf, str.length() + indexOf, 33);
            myTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
            i = indexOf + 1;
        }
    }

    public /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return this.H.onTouchEvent(motionEvent);
    }

    public void btnClick(View view) {
        Intent intent;
        int i;
        if (view.getId() != R.id.btnEdit) {
            if (view.getId() == R.id.btnDelete) {
                if (this.B.a()) {
                    intent = new Intent(this, DeleteNoteActivity.class);
                    intent.putExtra("type", "note");
                    intent.putExtra("widgetId", this.u);
                    i = 2;
                } else {
                    return;
                }
            } else if (view.getId() == R.id.btnClose) {
                if (this.B.a()) {
                    r();
                    return;
                }
                return;
            } else if (view.getId() == R.id.btnCategory) {
                if (this.B.a()) {
                    startActivityForResult(new Intent(this, SelectCategoryActivity.class), 3);
                    overridePendingTransition(R.anim.activity_bottom_to_top, R.anim.activity_hold);
                    return;
                }
                return;
            } else if (view.getId() == R.id.btnMore) {
                if (this.B.a()) {
                    intent = new Intent(this, SelectNoteMoreActivity.class);
                    i = 4;
                } else {
                    return;
                }
            } else if (view.getId() == R.id.btnChangeColor) {
                if (this.B.a()) {
                    intent = new Intent(this, SelectColorActivity.class);
                    i = 5;
                } else {
                    return;
                }
            } else if (view.getId() == R.id.btnChangeTextSize) {
                p();
                y();
                return;
            } else if (view.getId() == R.id.btnSearch) {
                if (this.B.a()) {
                    startActivityForResult(new Intent(this, NoteSearchActivity.class), 6);
                    overridePendingTransition(R.anim.activity_fade_in, R.anim.activity_hold);
                    return;
                }
                return;
            } else if (view.getId() == R.id.btnChangeTextColor) {
                o();
                return;
            } else {
                return;
            }
            startActivityForResult(intent, i);
            overridePendingTransition(R.anim.activity_fade_in, 0);
        } else if (this.B.a()) {
            c(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        String str;
        RemoteViews remoteViews;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 1) {
                v();
                if (this.s.i().equals(BuildConfig.FLAVOR)) {
                    remoteViews = this.F;
                    str = this.s.f();
                } else {
                    remoteViews = this.F;
                    str = this.s.i();
                }
                remoteViews.setTextViewText(R.id.widgetTitle, str);
            } else if (i == 2) {
                if (intent.getStringExtra("type").equals("delete")) {
                    this.w.b(this.t);
                    this.F.setTextViewText(R.id.widgetTitle, "Deleted note");
                    this.F.setOnClickPendingIntent(R.id.note_onebyone, null);
                    AppWidgetManager.getInstance(this).updateAppWidget(this.u, this.F);
                    finish();
                    return;
                }
                return;
            } else if (i == 3) {
                this.w.a(this.t, intent.getIntExtra("categoryId", 0));
                this.z.setText(intent.getStringExtra("categoryName"));
                return;
            } else if (i == 4) {
                String stringExtra2 = intent.getStringExtra("type");
                if (stringExtra2.equals("information")) {
                    Intent intent2 = new Intent(this, NoteInformationActivity.class);
                    intent2.putExtra("noteId", this.t);
                    startActivity(intent2);
                    overridePendingTransition(R.anim.activity_fade_in, 0);
                    return;
                } else if (stringExtra2.equals("send")) {
                    s();
                    return;
                } else {
                    return;
                }
            } else if (i == 5) {
                String stringExtra3 = intent.getStringExtra("color");
                if (stringExtra3 != null) {
                    this.C = stringExtra3;
                    u();
                    this.D.putString(Integer.toString(this.u), stringExtra3);
                    this.D.apply();
                    this.F.setInt(R.id.note_onebyone, "setBackgroundColor", Color.parseColor(notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.a.a(stringExtra3)));
                } else {
                    return;
                }
            } else if (i == 6 && (stringExtra = intent.getStringExtra("noteSearch")) != null) {
                if (this.s.c() != null) {
                    this.y.setText(this.s.c());
                }
                if (!stringExtra.equals(BuildConfig.FLAVOR)) {
                    a(this.y, stringExtra);
                    return;
                }
                return;
            } else {
                return;
            }
            AppWidgetManager.getInstance(this).updateAppWidget(this.u, this.F);
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        r();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_widget_note);
        q();
        v();
        w();
    }
}
