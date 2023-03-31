package notepad.note.notas.notes.notizen.main.dailyCheck;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import com.github.ajalt.reprint.module.spass.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.i;
import java.util.ArrayList;
import notepad.note.notas.notes.notizen.checklist.guide.GuideActivity;
import notepad.note.notas.notes.notizen.main.dailyCheck.a;
import notepad.note.notas.notes.notizen.ui.MyTextView;
import notepad.note.notas.notes.notizen.util.recyclerView.a.e;

public class DailyCheckActivity extends androidx.appcompat.app.c implements e {
    private notepad.note.notas.notes.notizen.util.a A;
    private d s = d.TODO;
    private MyTextView t;
    private MyTextView u;
    private c.a.a.a.a.b.b.c v;
    private a w;
    private f x;
    private i y;
    private ImageView z;

    /* access modifiers changed from: package-private */
    public class a extends com.google.android.gms.ads.b {
        a() {
        }

        @Override // com.google.android.gms.ads.b
        public void d() {
            DailyCheckActivity.this.z.setVisibility(8);
            super.d();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements a.AbstractC0097a {
        b() {
        }

        @Override // notepad.note.notas.notes.notizen.main.dailyCheck.a.AbstractC0097a
        public void a() {
            DailyCheckActivity.this.t();
        }

        @Override // notepad.note.notas.notes.notizen.main.dailyCheck.a.AbstractC0097a
        public void a(int i) {
            if (DailyCheckActivity.this.A.a()) {
                Intent intent = new Intent(DailyCheckActivity.this, EditDailyCheckboxActivity.class);
                intent.putExtra("checkboxId", i);
                DailyCheckActivity.this.startActivityForResult(intent, 2);
                DailyCheckActivity.this.overridePendingTransition(R.anim.activity_fade_in, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends com.google.android.gms.ads.b {
        c() {
        }

        @Override // com.google.android.gms.ads.b
        public void a() {
            DailyCheckActivity.this.p();
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
    public enum d {
        TODO,
        SHOPPING
    }

    private void o() {
        Intent intent = new Intent(this, AddDailyCheckboxActivity.class);
        if (this.s == d.TODO) {
            intent.putExtra("isTodo", true);
        } else {
            intent.putExtra("isTodo", false);
        }
        startActivityForResult(intent, 1);
        overridePendingTransition(R.anim.activity_fade_in, 0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p() {
        finish();
        overridePendingTransition(0, R.anim.activity_top_to_bottom);
    }

    private void q() {
        notepad.note.notas.notes.notizen.util.c.a(this, "#1C1C1C");
        this.A = new notepad.note.notas.notes.notizen.util.a();
        this.t = (MyTextView) findViewById(R.id.txtTodo);
        this.u = (MyTextView) findViewById(R.id.txtShopping);
        this.v = new c.a.a.a.a.b.b.c(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        a aVar = new a(this, this.v.b(true));
        this.w = aVar;
        recyclerView.setAdapter(aVar);
        f fVar = new f(new notepad.note.notas.notes.notizen.util.recyclerView.a.b(this.w));
        this.x = fVar;
        fVar.a(recyclerView);
        this.t.setText("To-Do(" + Integer.toString(this.v.a(true)) + ")");
        this.u.setText("Shopping(" + Integer.toString(this.v.a(false)) + ")");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.adsLayout);
        this.z = (ImageView) findViewById(R.id.imgAdsLoading);
        i iVar = new i(this);
        this.y = iVar;
        iVar.a(getString(R.string.interstitialAds));
        SharedPreferences sharedPreferences = getSharedPreferences("SETTING", 0);
        AdView adView = (AdView) findViewById(R.id.adView);
        adView.setAdListener(new a());
        boolean z2 = sharedPreferences.getBoolean("isPremium", false);
        if (sharedPreferences.getLong("endFreeAdsTime", System.currentTimeMillis() - 1000) < System.currentTimeMillis() && !z2) {
            adView.a(new d.a().a());
            if (sharedPreferences.getInt("interstitialAds", 0) >= 5) {
                this.y.a(new d.a().a());
            }
        } else {
            relativeLayout.setVisibility(8);
        }
        String string = sharedPreferences.getString("dailyCheckTab", "todo");
        if (string.equals("todo")) {
            x();
        } else if (string.equals("shopping")) {
            w();
        }
    }

    private void r() {
        SharedPreferences sharedPreferences = getSharedPreferences("SETTING", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i = sharedPreferences.getInt("interstitialAds", 0);
        if (i < 5) {
            edit.putInt("interstitialAds", i + 1);
            edit.apply();
        } else if (this.y.b()) {
            edit.putInt("interstitialAds", 0);
            edit.apply();
            this.y.c();
            return;
        }
        p();
    }

    private void s() {
        this.y.a(new c());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void t() {
        MyTextView myTextView;
        String str;
        if (this.s == d.TODO) {
            str = "To-Do(" + Integer.toString(this.v.a(true)) + ")";
            myTextView = this.t;
        } else {
            str = "Shopping(" + Integer.toString(this.v.a(false)) + ")";
            myTextView = this.u;
        }
        myTextView.setText(str);
    }

    private void u() {
        this.w.a(new b());
    }

    private void v() {
        u();
        s();
    }

    private void w() {
        this.s = d.SHOPPING;
        this.t.setTextColor(Color.parseColor("#899298"));
        this.u.setTextColor(Color.parseColor("#FFFFFF"));
        this.w.a(this.v.b(false));
        this.w.d();
        SharedPreferences.Editor edit = getSharedPreferences("SETTING", 0).edit();
        edit.putString("dailyCheckTab", "shopping");
        edit.apply();
    }

    private void x() {
        this.s = d.TODO;
        this.t.setTextColor(Color.parseColor("#FFFFFF"));
        this.u.setTextColor(Color.parseColor("#899298"));
        this.w.a(this.v.b(true));
        this.w.d();
        SharedPreferences.Editor edit = getSharedPreferences("SETTING", 0).edit();
        edit.putString("dailyCheckTab", "todo");
        edit.apply();
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.e
    public void a(RecyclerView.d0 d0Var) {
        this.x.b(d0Var);
    }

    public void btnClick(View view) {
        switch (view.getId()) {
            case R.id.btnAddCheckbox:
                if (this.A.a()) {
                    o();
                    return;
                }
                return;
            case R.id.btnClose:
                r();
                return;
            case R.id.btnGuide:
                if (this.A.a()) {
                    startActivity(new Intent(this, GuideActivity.class));
                    overridePendingTransition(R.anim.activity_right_to_left, R.anim.activity_hold);
                    return;
                }
                return;
            case R.id.btnShopping:
                w();
                return;
            case R.id.btnTodo:
                x();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<c.a.a.a.a.b.c.b> arrayList;
        a aVar;
        ArrayList<c.a.a.a.a.b.c.b> arrayList2;
        a aVar2;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 1) {
            if (this.s == d.TODO) {
                aVar2 = this.w;
                arrayList2 = this.v.b(true);
            } else {
                aVar2 = this.w;
                arrayList2 = this.v.b(false);
            }
            aVar2.a(arrayList2);
            this.w.d();
            t();
        } else if (i == 2) {
            if (this.s == d.TODO) {
                aVar = this.w;
                arrayList = this.v.b(true);
            } else {
                aVar = this.w;
                arrayList = this.v.b(false);
            }
            aVar.a(arrayList);
            this.w.d();
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
        setContentView(R.layout.activity_daily_check);
        q();
        v();
    }
}
