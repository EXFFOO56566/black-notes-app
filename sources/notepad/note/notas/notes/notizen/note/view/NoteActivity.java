package notepad.note.notas.notes.notizen.note.view;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
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
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.i;
import java.util.ArrayList;
import java.util.Iterator;
import notepad.note.notas.notes.notizen.category.selectCategory.SelectCategoryActivity;
import notepad.note.notas.notes.notizen.note.edit.EditNoteActivity;
import notepad.note.notas.notes.notizen.note.more.NoteInformationActivity;
import notepad.note.notas.notes.notizen.note.password.RegisterPasswordActivity;
import notepad.note.notas.notes.notizen.note.password.RemovePasswordActivity;
import notepad.note.notas.notes.notizen.ui.MyTextView;
import notepad.note.notas.notes.notizen.util.RateAppActivity;
import notepad.note.notas.notes.notizen.widget.oneByOne.WidgetOneByOne;

public class NoteActivity extends androidx.appcompat.app.c {
    private ImageView A;
    private ImageView B;
    private ImageView C;
    private GestureDetector D;
    private i E;
    private ArrayList<Integer> F;
    private boolean G = false;
    private RemoteViews H;
    private int s;
    private c.a.a.a.a.b.b.a t;
    private d u;
    private MyTextView v;
    private MyTextView w;
    private MyTextView x;
    private notepad.note.notas.notes.notizen.util.a y;
    private c.a.a.a.a.b.c.d z;

    /* access modifiers changed from: package-private */
    public class a extends com.google.android.gms.ads.b {
        a() {
        }

        @Override // com.google.android.gms.ads.b
        public void d() {
            NoteActivity.this.C.setVisibility(8);
            super.d();
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends com.google.android.gms.ads.b {
        b() {
        }

        @Override // com.google.android.gms.ads.b
        public void a() {
            NoteActivity.this.q();
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
            NoteActivity.this.c((NoteActivity) NoteActivity.this.w.getSelectionStart());
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
        intent.putExtra("noteId", this.s);
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
            myTextView = this.w;
            str = "#899298";
        } else if (i == 1) {
            myTextView = this.w;
            str = "#BFBFBF";
        } else if (i == 2) {
            myTextView = this.w;
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

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void q() {
        finish();
        overridePendingTransition(0, R.anim.activity_left_to_right);
    }

    private void r() {
        notepad.note.notas.notes.notizen.util.c.a(this);
        int intExtra = getIntent().getIntExtra("noteId", 0);
        this.s = intExtra;
        if (intExtra == 0) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        this.F = new ArrayList<>();
        this.H = new RemoteViews(getPackageName(), (int) R.layout.layout_widget_note_one_by_one);
        this.y = new notepad.note.notas.notes.notizen.util.a();
        this.t = new c.a.a.a.a.b.b.a(this);
        this.u = new d(this);
        this.v = (MyTextView) findViewById(R.id.txtTitle);
        this.C = (ImageView) findViewById(R.id.imgAdsLoading);
        this.w = (MyTextView) findViewById(R.id.txtContent);
        this.x = (MyTextView) findViewById(R.id.txtCategory);
        this.A = (ImageView) findViewById(R.id.imgLock);
        this.B = (ImageView) findViewById(R.id.imgBookmark);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.adsLayout);
        i iVar = new i(this);
        this.E = iVar;
        iVar.a(getString(R.string.interstitialAds));
        SharedPreferences sharedPreferences = getSharedPreferences("SETTING", 0);
        AdView adView = (AdView) findViewById(R.id.adView);
        adView.setAdListener(new a());
        boolean z2 = sharedPreferences.getBoolean("isPremium", false);
        if (sharedPreferences.getLong("endFreeAdsTime", System.currentTimeMillis() - 1000) < System.currentTimeMillis() && !z2) {
            adView.a(new d.a().a());
            if (sharedPreferences.getInt("interstitialAds", 0) >= 5) {
                this.E.a(new d.a().a());
            }
        } else {
            relativeLayout.setVisibility(8);
        }
        if (!sharedPreferences.getBoolean("rateAppComplete", false)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (sharedPreferences.getInt("rateApp", 0) == 6) {
                edit.putBoolean("rateAppComplete", true);
                edit.apply();
                startActivity(new Intent(this, RateAppActivity.class));
                overridePendingTransition(R.anim.activity_fade_in, 0);
            } else {
                edit.putInt("rateApp", sharedPreferences.getInt("rateApp", 0) + 1);
                edit.apply();
            }
        }
        int[] appWidgetIds = AppWidgetManager.getInstance(this).getAppWidgetIds(new ComponentName(this, WidgetOneByOne.class));
        SharedPreferences sharedPreferences2 = getSharedPreferences("widgetNoteId", 0);
        for (int i = 0; i < appWidgetIds.length; i++) {
            try {
                if (sharedPreferences2.getInt(Integer.toString(appWidgetIds[i]), 0) == this.s) {
                    this.F.add(Integer.valueOf(appWidgetIds[i]));
                    this.G = true;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    private void s() {
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
        q();
    }

    private void t() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", this.v.getText().toString());
        intent.putExtra("android.intent.extra.TEXT", this.w.getText().toString());
        startActivity(Intent.createChooser(intent, "Send to"));
    }

    private void u() {
        this.E.a(new b());
    }

    private void v() {
        String str;
        MyTextView myTextView;
        c.a.a.a.a.b.c.d d = this.u.d(this.s);
        this.z = d;
        if (d == null || (d.i() == null && this.z.c() == null)) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        if (this.z.i() == null || this.z.i().equals(BuildConfig.FLAVOR)) {
            this.v.setVisibility(8);
        } else {
            this.v.setVisibility(0);
            this.v.setText(this.z.i());
        }
        if (this.z.c() != null) {
            d(getSharedPreferences("SETTING", 0).getInt("NOTE_TEXT_COLOR", 0));
            y();
            this.w.setText(this.z.c());
        }
        if (this.z.a() != 0) {
            myTextView = this.x;
            str = this.t.b(this.z.a());
        } else {
            myTextView = this.x;
            str = getString(R.string.category);
        }
        myTextView.setText(str);
        if (!this.z.h().equals(BuildConfig.FLAVOR)) {
            this.A.setImageResource(R.drawable.btn_note_lock_exist_password);
        }
        if (this.z.k()) {
            this.B.setImageResource(R.drawable.btn_note_favorite_full);
        }
        String stringExtra = getIntent().getStringExtra("search");
        if (stringExtra != null && !stringExtra.equals(BuildConfig.FLAVOR)) {
            a(this.v, stringExtra);
            a(this.w, stringExtra);
        }
    }

    private void w() {
        x();
        z();
        u();
    }

    private void x() {
        this.w.setOnTouchListener(new a(this));
    }

    private void y() {
        float f;
        MyTextView myTextView;
        switch (notepad.note.notas.notes.notizen.util.d.a(this)) {
            case 1:
                myTextView = this.w;
                f = 17.0f;
                break;
            case 2:
                myTextView = this.w;
                f = 20.0f;
                break;
            case 3:
                myTextView = this.w;
                f = 24.0f;
                break;
            case 4:
                myTextView = this.w;
                f = 28.0f;
                break;
            case 5:
                myTextView = this.w;
                f = 33.0f;
                break;
            case 6:
                myTextView = this.w;
                f = 42.0f;
                break;
            default:
                return;
        }
        myTextView.setTextSize(1, f);
    }

    private void z() {
        this.D = new GestureDetector(this, new c());
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
        return this.D.onTouchEvent(motionEvent);
    }

    public void btnClick(View view) {
        ImageView imageView;
        int i;
        Intent intent;
        int i2;
        int i3;
        if (view.getId() != R.id.btnEdit) {
            if (view.getId() == R.id.btnDelete) {
                if (this.y.a()) {
                    intent = new Intent(this, DeleteNoteActivity.class);
                    intent.putExtra("type", "note");
                    i2 = 2;
                } else {
                    return;
                }
            } else if (view.getId() != R.id.btnClose) {
                if (view.getId() == R.id.btnCategory) {
                    if (this.y.a()) {
                        startActivityForResult(new Intent(this, SelectCategoryActivity.class), 3);
                        i3 = R.anim.activity_bottom_to_top;
                    } else {
                        return;
                    }
                } else if (view.getId() == R.id.btnMore) {
                    if (this.y.a()) {
                        intent = new Intent(this, SelectNoteMoreActivity.class);
                        i2 = 4;
                    } else {
                        return;
                    }
                } else if (view.getId() == R.id.btnLock) {
                    if (this.y.a()) {
                        if (this.z.h().equals(BuildConfig.FLAVOR)) {
                            Intent intent2 = new Intent(this, RegisterPasswordActivity.class);
                            intent2.putExtra("noteId", this.s);
                            startActivityForResult(intent2, 5);
                            i3 = R.anim.activity_right_to_left;
                        } else {
                            intent = new Intent(this, RemovePasswordActivity.class);
                            i2 = 6;
                        }
                    } else {
                        return;
                    }
                } else if (view.getId() == R.id.btnBookmark) {
                    if (this.z.k()) {
                        this.z.b(false);
                        this.u.a(this.s, false);
                        imageView = this.B;
                        i = R.drawable.btn_note_favorite;
                    } else {
                        this.z.b(true);
                        this.u.a(this.s, true);
                        imageView = this.B;
                        i = R.drawable.btn_note_favorite_full;
                    }
                    imageView.setImageResource(i);
                    return;
                } else if (view.getId() == R.id.btnChangeTextSize) {
                    p();
                    y();
                    return;
                } else if (view.getId() == R.id.btnSearch) {
                    startActivityForResult(new Intent(this, NoteSearchActivity.class), 7);
                    overridePendingTransition(R.anim.activity_fade_in, R.anim.activity_hold);
                    return;
                } else if (view.getId() == R.id.btnChangeTextColor) {
                    o();
                    return;
                } else {
                    return;
                }
                overridePendingTransition(i3, R.anim.activity_hold);
                return;
            } else if (this.y.a()) {
                s();
                return;
            } else {
                return;
            }
            startActivityForResult(intent, i2);
            overridePendingTransition(R.anim.activity_fade_in, 0);
        } else if (this.y.a()) {
            c(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        ImageView imageView;
        int i3;
        String str;
        RemoteViews remoteViews;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 1) {
            v();
            if (this.G) {
                if (this.z.i().equals(BuildConfig.FLAVOR)) {
                    remoteViews = this.H;
                    str = this.z.f();
                } else {
                    remoteViews = this.H;
                    str = this.z.i();
                }
                remoteViews.setTextViewText(R.id.widgetTitle, str);
                Iterator<Integer> it = this.F.iterator();
                while (it.hasNext()) {
                    AppWidgetManager.getInstance(this).updateAppWidget(it.next().intValue(), this.H);
                }
            }
        } else if (i == 2) {
            if (intent.getStringExtra("type").equals("delete")) {
                this.u.b(this.s);
                if (this.G) {
                    this.H.setTextViewText(R.id.widgetTitle, "Deleted note");
                    this.H.setOnClickPendingIntent(R.id.note_onebyone, null);
                    Iterator<Integer> it2 = this.F.iterator();
                    while (it2.hasNext()) {
                        AppWidgetManager.getInstance(this).updateAppWidget(it2.next().intValue(), this.H);
                    }
                }
                q();
            }
        } else if (i == 3) {
            this.u.a(this.s, intent.getIntExtra("categoryId", 0));
            this.x.setText(intent.getStringExtra("categoryName"));
        } else if (i == 4) {
            String stringExtra2 = intent.getStringExtra("type");
            if (stringExtra2.equals("information")) {
                Intent intent2 = new Intent(this, NoteInformationActivity.class);
                intent2.putExtra("noteId", this.s);
                startActivity(intent2);
                overridePendingTransition(R.anim.activity_fade_in, 0);
            } else if (stringExtra2.equals("send")) {
                t();
            }
        } else {
            if (i == 5) {
                this.z.f(intent.getStringExtra("password"));
                imageView = this.A;
                i3 = R.drawable.btn_note_lock_exist_password;
            } else if (i == 6) {
                this.u.a(this.s, BuildConfig.FLAVOR);
                this.z.f(BuildConfig.FLAVOR);
                imageView = this.A;
                i3 = R.drawable.btn_note_lock;
            } else if (i == 7 && (stringExtra = intent.getStringExtra("noteSearch")) != null) {
                if (this.z.c() != null) {
                    this.w.setText(this.z.c());
                }
                if (!stringExtra.equals(BuildConfig.FLAVOR)) {
                    a(this.w, stringExtra);
                    return;
                }
                return;
            } else {
                return;
            }
            imageView.setImageResource(i3);
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        s();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_note);
        r();
        v();
        w();
    }
}
