package notepad.note.notas.notes.notizen.checklist;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.i;
import java.util.ArrayList;
import java.util.Iterator;
import notepad.note.notas.notes.notizen.category.selectCategory.SelectCategoryActivity;
import notepad.note.notas.notes.notizen.checklist.guide.GuideActivity;
import notepad.note.notas.notes.notizen.note.password.RegisterPasswordActivity;
import notepad.note.notas.notes.notizen.note.password.RemovePasswordActivity;
import notepad.note.notas.notes.notizen.note.view.DeleteNoteActivity;
import notepad.note.notas.notes.notizen.ui.MyTextView;
import notepad.note.notas.notes.notizen.util.recyclerView.a.e;
import notepad.note.notas.notes.notizen.widget.oneByOne.WidgetOneByOne;

public class ChecklistActivity extends c implements e {
    private notepad.note.notas.notes.notizen.util.a A;
    private b B;
    private c.a.a.a.a.b.b.b C;
    private f D;
    private i E;
    private ImageView F;
    private ArrayList<Integer> G;
    private boolean H = false;
    private RemoteViews I;
    private d s;
    private c.a.a.a.a.b.b.a t;
    private MyTextView u;
    private MyTextView v;
    private int w;
    private c.a.a.a.a.b.c.d x;
    private ImageView y;
    private ImageView z;

    /* access modifiers changed from: package-private */
    public class a extends com.google.android.gms.ads.b {
        a() {
        }

        @Override // com.google.android.gms.ads.b
        public void d() {
            ChecklistActivity.this.F.setVisibility(8);
            super.d();
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends com.google.android.gms.ads.b {
        b() {
        }

        @Override // com.google.android.gms.ads.b
        public void a() {
            ChecklistActivity.this.o();
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

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_left_to_right);
    }

    private void p() {
        notepad.note.notas.notes.notizen.util.c.a(this);
        int intExtra = getIntent().getIntExtra("noteId", 0);
        this.w = intExtra;
        if (intExtra == 0) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        this.G = new ArrayList<>();
        this.I = new RemoteViews(getPackageName(), (int) R.layout.layout_widget_note_one_by_one);
        this.C = new c.a.a.a.a.b.b.b(this);
        this.A = new notepad.note.notas.notes.notizen.util.a();
        this.s = new d(this);
        this.t = new c.a.a.a.a.b.b.a(this);
        this.u = (MyTextView) findViewById(R.id.txtTitle);
        this.v = (MyTextView) findViewById(R.id.txtCategory);
        this.y = (ImageView) findViewById(R.id.imgLock);
        this.z = (ImageView) findViewById(R.id.imgBookmark);
        this.B = new b(this, this.w);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.B);
        f fVar = new f(new notepad.note.notas.notes.notizen.util.recyclerView.a.b(this.B));
        this.D = fVar;
        fVar.a(recyclerView);
        this.F = (ImageView) findViewById(R.id.imgAdsLoading);
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
        int[] appWidgetIds = AppWidgetManager.getInstance(this).getAppWidgetIds(new ComponentName(this, WidgetOneByOne.class));
        SharedPreferences sharedPreferences2 = getSharedPreferences("widgetNoteId", 0);
        for (int i = 0; i < appWidgetIds.length; i++) {
            try {
                if (sharedPreferences2.getInt(Integer.toString(appWidgetIds[i]), 0) == this.w) {
                    this.G.add(Integer.valueOf(appWidgetIds[i]));
                    this.H = true;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    private void q() {
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
        o();
    }

    private void r() {
        ArrayList<c.a.a.a.a.b.c.b> e = this.B.e();
        Iterator<c.a.a.a.a.b.c.b> it = e.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            c.a.a.a.a.b.c.b next = it.next();
            if (!next.c()) {
                str = str + "○ " + next.b() + "\n";
            }
        }
        boolean z2 = false;
        Iterator<c.a.a.a.a.b.c.b> it2 = e.iterator();
        while (it2.hasNext()) {
            c.a.a.a.a.b.c.b next2 = it2.next();
            if (next2.c()) {
                if (!z2) {
                    str = str + "\n";
                    z2 = true;
                }
                str = str + "● " + next2.b() + "\n";
            }
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", this.u.getText().toString());
        intent.putExtra("android.intent.extra.TEXT", str);
        startActivity(Intent.createChooser(intent, "Send to"));
    }

    private void s() {
        this.E.a(new b());
    }

    private void t() {
        String str;
        MyTextView myTextView;
        c.a.a.a.a.b.c.d d = this.s.d(this.w);
        this.x = d;
        if (d == null) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        if (d.i() != null) {
            this.u.setText(this.x.i());
        }
        if (this.x.a() != 0) {
            myTextView = this.v;
            str = this.t.b(this.x.a());
        } else {
            myTextView = this.v;
            str = getString(R.string.category);
        }
        myTextView.setText(str);
        if (!this.x.h().equals(BuildConfig.FLAVOR)) {
            this.y.setImageResource(R.drawable.btn_note_lock_exist_password);
        }
        if (this.x.k()) {
            this.z.setImageResource(R.drawable.btn_note_favorite_full);
        }
    }

    private void u() {
        this.B.a(new a(this));
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.e
    public void a(RecyclerView.d0 d0Var) {
        this.D.b(d0Var);
    }

    public void btnClick(View view) {
        Intent intent;
        int i;
        ImageView imageView;
        int i2;
        if (view.getId() != R.id.btnEdit) {
            if (view.getId() == R.id.btnDelete) {
                if (this.A.a()) {
                    intent = new Intent(this, DeleteNoteActivity.class);
                    intent.putExtra("type", "note");
                    i = 2;
                } else {
                    return;
                }
            } else if (view.getId() == R.id.btnClose) {
                if (this.A.a()) {
                    q();
                    return;
                }
                return;
            } else if (view.getId() != R.id.btnCategory) {
                if (view.getId() == R.id.btnLock) {
                    if (this.A.a()) {
                        if (this.x.h().equals(BuildConfig.FLAVOR)) {
                            Intent intent2 = new Intent(this, RegisterPasswordActivity.class);
                            intent2.putExtra("noteId", this.w);
                            startActivityForResult(intent2, 4);
                        } else {
                            intent = new Intent(this, RemovePasswordActivity.class);
                            i = 5;
                        }
                    } else {
                        return;
                    }
                } else if (view.getId() == R.id.btnBookmark) {
                    if (this.x.k()) {
                        this.x.b(false);
                        this.s.a(this.w, false);
                        imageView = this.z;
                        i2 = R.drawable.btn_note_favorite;
                    } else {
                        this.x.b(true);
                        this.s.a(this.w, true);
                        imageView = this.z;
                        i2 = R.drawable.btn_note_favorite_full;
                    }
                    imageView.setImageResource(i2);
                    return;
                } else if (view.getId() == R.id.btnAddCheckbox) {
                    if (this.A.a()) {
                        intent = new Intent(this, AddCheckboxActivity.class);
                        intent.putExtra("noteId", this.w);
                        i = 6;
                    } else {
                        return;
                    }
                } else if (view.getId() == R.id.btnGuide) {
                    if (this.A.a()) {
                        startActivity(new Intent(this, GuideActivity.class));
                    } else {
                        return;
                    }
                } else if (view.getId() == R.id.btnSend) {
                    if (this.A.a()) {
                        r();
                        return;
                    }
                    return;
                } else if (view.getId() == R.id.btnSelectCheckbox && this.A.a()) {
                    startActivityForResult(new Intent(this, SelectCheckboxActivity.class), 9);
                    overridePendingTransition(R.anim.activity_fade_in, R.anim.activity_hold);
                    return;
                } else {
                    return;
                }
                overridePendingTransition(R.anim.activity_right_to_left, R.anim.activity_hold);
                return;
            } else if (this.A.a()) {
                startActivityForResult(new Intent(this, SelectCategoryActivity.class), 3);
                overridePendingTransition(R.anim.activity_bottom_to_top, R.anim.activity_hold);
                return;
            } else {
                return;
            }
            startActivityForResult(intent, i);
        } else if (this.A.a()) {
            Intent intent3 = new Intent(this, EditChecklistTitleActivity.class);
            intent3.putExtra("noteId", this.w);
            startActivityForResult(intent3, 1);
        } else {
            return;
        }
        overridePendingTransition(R.anim.activity_fade_in, 0);
    }

    public /* synthetic */ void c(int i) {
        Intent intent = new Intent(this, EditCheckboxActivity.class);
        intent.putExtra("checkboxId", i);
        startActivityForResult(intent, 8);
        overridePendingTransition(R.anim.activity_fade_in, 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        ImageView imageView;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 1) {
            this.s.g(this.w);
            t();
            if (this.H) {
                this.I.setTextViewText(R.id.widgetTitle, this.x.i());
                Iterator<Integer> it = this.G.iterator();
                while (it.hasNext()) {
                    AppWidgetManager.getInstance(this).updateAppWidget(it.next().intValue(), this.I);
                }
            }
        } else if (i == 2) {
            if (intent.getStringExtra("type").equals("delete")) {
                this.s.b(this.w);
                this.C.d(this.w);
                if (this.H) {
                    this.I.setTextViewText(R.id.widgetTitle, "Deleted note");
                    this.I.setOnClickPendingIntent(R.id.note_onebyone, null);
                    Iterator<Integer> it2 = this.G.iterator();
                    while (it2.hasNext()) {
                        AppWidgetManager.getInstance(this).updateAppWidget(it2.next().intValue(), this.I);
                    }
                }
                o();
            }
        } else if (i == 3) {
            this.s.a(this.w, intent.getIntExtra("categoryId", 0));
            this.v.setText(intent.getStringExtra("categoryName"));
        } else {
            if (i == 4) {
                this.x.f(intent.getStringExtra("password"));
                imageView = this.y;
                i3 = R.drawable.btn_note_lock_exist_password;
            } else if (i == 5) {
                this.s.a(this.w, BuildConfig.FLAVOR);
                this.x.f(BuildConfig.FLAVOR);
                imageView = this.y;
                i3 = R.drawable.btn_note_lock;
            } else {
                if (i == 6 || i == 8) {
                    this.s.g(this.w);
                } else if (i == 9) {
                    String stringExtra = intent.getStringExtra("type");
                    if (stringExtra.equals("delete")) {
                        this.C.b(this.w);
                    } else if (stringExtra.equals("unCheck")) {
                        this.C.g(this.w);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                this.B.a(this.C.f(this.w));
                this.B.d();
                return;
            }
            imageView.setImageResource(i3);
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        q();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_checklist);
        p();
        t();
        u();
        s();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onPause() {
        if (this.H) {
            RemoteViews remoteViews = this.I;
            remoteViews.setTextViewText(R.id.widgetTitle, this.x.i() + " (" + this.C.a(this.w) + ")");
            Iterator<Integer> it = this.G.iterator();
            while (it.hasNext()) {
                AppWidgetManager.getInstance(this).updateAppWidget(it.next().intValue(), this.I);
            }
        }
        super.onPause();
    }
}
