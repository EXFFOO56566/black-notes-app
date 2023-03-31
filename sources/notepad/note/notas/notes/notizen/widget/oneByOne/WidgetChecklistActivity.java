package notepad.note.notas.notes.notizen.widget.oneByOne;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import c.a.a.a.a.b.c.d;
import com.github.ajalt.reprint.module.spass.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.i;
import notepad.note.notas.notes.notizen.category.selectCategory.SelectCategoryActivity;
import notepad.note.notas.notes.notizen.checklist.AddCheckboxActivity;
import notepad.note.notas.notes.notizen.checklist.EditCheckboxActivity;
import notepad.note.notas.notes.notizen.checklist.EditChecklistTitleActivity;
import notepad.note.notas.notes.notizen.note.view.DeleteNoteActivity;
import notepad.note.notas.notes.notizen.ui.MyTextView;
import notepad.note.notas.notes.notizen.util.recyclerView.a.e;
import notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.SelectColorActivity;

public class WidgetChecklistActivity extends c implements e {
    private notepad.note.notas.notes.notizen.checklist.b A;
    private c.a.a.a.a.b.b.b B;
    private f C;
    private String D = "purpleLight";
    private SharedPreferences.Editor E;
    private RemoteViews F;
    private d G;
    private boolean H = false;
    private ImageView I;
    private i J;
    private int s;
    private int t;
    private c.a.a.a.a.b.b.d u;
    private c.a.a.a.a.b.b.a v;
    private MyTextView w;
    private MyTextView x;
    private LinearLayout y;
    private notepad.note.notas.notes.notizen.util.a z;

    /* access modifiers changed from: package-private */
    public class a extends com.google.android.gms.ads.b {
        a() {
        }

        @Override // com.google.android.gms.ads.b
        public void d() {
            WidgetChecklistActivity.this.I.setVisibility(8);
            super.d();
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends com.google.android.gms.ads.b {
        b() {
        }

        @Override // com.google.android.gms.ads.b
        public void a() {
            WidgetChecklistActivity.this.finish();
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

    private void o() {
        this.s = getIntent().getIntExtra("noteId", 0);
        this.t = getIntent().getIntExtra("widgetId", 0);
        if (this.s == 0) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("widgetColor", 0);
        this.E = sharedPreferences.edit();
        this.D = sharedPreferences.getString(Integer.toString(this.t), "purpleLight");
        notepad.note.notas.notes.notizen.util.c.a(this);
        this.B = new c.a.a.a.a.b.b.b(this);
        this.z = new notepad.note.notas.notes.notizen.util.a();
        this.u = new c.a.a.a.a.b.b.d(this);
        this.v = new c.a.a.a.a.b.b.a(this);
        this.w = (MyTextView) findViewById(R.id.txtTitle);
        this.x = (MyTextView) findViewById(R.id.txtCategory);
        this.y = (LinearLayout) findViewById(R.id.imgColorBox);
        this.A = new notepad.note.notas.notes.notizen.checklist.b(this, this.s);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.A);
        this.I = (ImageView) findViewById(R.id.imgAdsLoading);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.adsLayout);
        this.F = new RemoteViews(getPackageName(), (int) R.layout.layout_widget_note_one_by_one);
        f fVar = new f(new notepad.note.notas.notes.notizen.util.recyclerView.a.b(this.A));
        this.C = fVar;
        fVar.a(recyclerView);
        i iVar = new i(this);
        this.J = iVar;
        iVar.a(getString(R.string.interstitialAds));
        SharedPreferences sharedPreferences2 = getSharedPreferences("SETTING", 0);
        AdView adView = (AdView) findViewById(R.id.adView);
        adView.setAdListener(new a());
        boolean z2 = sharedPreferences2.getBoolean("isPremium", false);
        if (sharedPreferences2.getLong("endFreeAdsTime", System.currentTimeMillis() - 1000) < System.currentTimeMillis() && !z2) {
            adView.a(new d.a().a());
            if (sharedPreferences2.getInt("interstitialAds", 0) >= 5) {
                this.J.a(new d.a().a());
                return;
            }
            return;
        }
        relativeLayout.setVisibility(8);
    }

    private void p() {
        SharedPreferences sharedPreferences = getSharedPreferences("SETTING", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i = sharedPreferences.getInt("interstitialAds", 0);
        if (i < 5) {
            edit.putInt("interstitialAds", i + 1);
            edit.apply();
        } else if (this.J.b()) {
            edit.putInt("interstitialAds", 0);
            edit.apply();
            this.J.c();
            return;
        }
        finish();
    }

    private void q() {
        this.J.a(new b());
    }

    private void r() {
        this.y.setBackgroundColor(Color.parseColor(notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.a.b(this.D)));
    }

    private void s() {
        String str;
        MyTextView myTextView;
        c.a.a.a.a.b.c.d d = this.u.d(this.s);
        this.G = d;
        if (d != null) {
            if (d.i() == null) {
                this.F.setTextViewText(R.id.widgetTitle, "Deleted note");
                this.F.setOnClickPendingIntent(R.id.note_onebyone, null);
                AppWidgetManager.getInstance(this).updateAppWidget(this.t, this.F);
            } else {
                if (this.G.i() != null) {
                    this.w.setText(this.G.i());
                }
                if (this.G.a() != 0) {
                    myTextView = this.x;
                    str = this.v.b(this.G.a());
                } else {
                    myTextView = this.x;
                    str = getString(R.string.category);
                }
                myTextView.setText(str);
                r();
                return;
            }
        }
        finish();
        overridePendingTransition(0, 0);
    }

    private void t() {
        this.A.a(new b(this));
        q();
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.e
    public void a(RecyclerView.d0 d0Var) {
        this.C.b(d0Var);
    }

    public void btnClick(View view) {
        Intent intent;
        int i;
        if (this.z.a()) {
            if (view.getId() == R.id.btnEdit) {
                intent = new Intent(this, EditChecklistTitleActivity.class);
                intent.putExtra("noteId", this.s);
                intent.putExtra("widgetId", this.t);
                i = 1;
            } else if (view.getId() == R.id.btnDelete) {
                intent = new Intent(this, DeleteNoteActivity.class);
                intent.putExtra("type", "note");
                intent.putExtra("widgetId", this.t);
                i = 2;
            } else if (view.getId() == R.id.btnClose) {
                p();
                return;
            } else if (view.getId() == R.id.btnCategory) {
                startActivityForResult(new Intent(this, SelectCategoryActivity.class), 3);
                overridePendingTransition(R.anim.activity_bottom_to_top, R.anim.activity_hold);
                return;
            } else if (view.getId() == R.id.btnAddCheckbox) {
                intent = new Intent(this, AddCheckboxActivity.class);
                intent.putExtra("noteId", this.s);
                intent.putExtra("widgetId", this.t);
                i = 4;
            } else if (view.getId() == R.id.btnChangeColor) {
                intent = new Intent(this, SelectColorActivity.class);
                i = 5;
            } else {
                return;
            }
            startActivityForResult(intent, i);
            overridePendingTransition(R.anim.activity_fade_in, 0);
        }
    }

    public /* synthetic */ void c(int i) {
        Intent intent = new Intent(this, EditCheckboxActivity.class);
        intent.putExtra("widgetId", this.t);
        intent.putExtra("checkboxId", i);
        startActivityForResult(intent, 6);
        overridePendingTransition(R.anim.activity_fade_in, 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 1) {
                this.u.g(this.s);
                s();
                this.F.setTextViewText(R.id.widgetTitle, this.G.i());
            } else if (i == 2) {
                if (intent.getStringExtra("type").equals("delete")) {
                    this.H = true;
                    this.u.b(this.s);
                    this.B.d(this.s);
                    this.F.setTextViewText(R.id.widgetTitle, "Deleted note");
                    this.F.setOnClickPendingIntent(R.id.note_onebyone, null);
                    AppWidgetManager.getInstance(this).updateAppWidget(this.t, this.F);
                    finish();
                    return;
                }
                return;
            } else if (i == 3) {
                this.u.a(this.s, intent.getIntExtra("categoryId", 0));
                this.x.setText(intent.getStringExtra("categoryName"));
                return;
            } else {
                if (i != 4) {
                    if (i == 5) {
                        String stringExtra = intent.getStringExtra("color");
                        if (stringExtra != null) {
                            this.D = stringExtra;
                            r();
                            this.E.putString(Integer.toString(this.t), stringExtra);
                            this.E.apply();
                            this.F.setInt(R.id.note_onebyone, "setBackgroundColor", Color.parseColor(notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.a.a(stringExtra)));
                        } else {
                            return;
                        }
                    } else if (i != 6) {
                        return;
                    }
                }
                this.u.g(this.s);
                this.A.a(this.B.f(this.s));
                this.A.d();
                return;
            }
            AppWidgetManager.getInstance(this).updateAppWidget(this.t, this.F);
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        p();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_widget_checklist);
        o();
        s();
        t();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onPause() {
        if (!this.H) {
            RemoteViews remoteViews = this.F;
            remoteViews.setTextViewText(R.id.widgetTitle, this.G.i() + " (" + this.B.a(this.s) + ")");
            AppWidgetManager.getInstance(this).updateAppWidget(this.t, this.F);
        }
        super.onPause();
    }
}
