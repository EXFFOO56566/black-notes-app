package notepad.note.notas.notes.notizen.main;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import b.a.a.a.a;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import java.util.ArrayList;
import notepad.note.notas.notes.notizen.category.CategoryActivity;
import notepad.note.notas.notes.notizen.category.selectCategory.SelectCategoryActivity;
import notepad.note.notas.notes.notizen.checklist.AddChecklistActivity;
import notepad.note.notas.notes.notizen.checklist.ChecklistActivity;
import notepad.note.notas.notes.notizen.checklist.ConfirmPasswordChecklistActivity;
import notepad.note.notas.notes.notizen.main.b;
import notepad.note.notas.notes.notizen.main.dailyCheck.DailyCheckActivity;
import notepad.note.notas.notes.notizen.main.search.SearchActivity;
import notepad.note.notas.notes.notizen.note.AddNoteActivity;
import notepad.note.notas.notes.notizen.note.SelectNoteActivity;
import notepad.note.notas.notes.notizen.note.password.ConfirmPasswordActivity;
import notepad.note.notas.notes.notizen.note.view.DeleteNoteActivity;
import notepad.note.notas.notes.notizen.note.view.NoteActivity;
import notepad.note.notas.notes.notizen.setting.SettingActivity;
import notepad.note.notas.notes.notizen.ui.MyTextView;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends androidx.appcompat.app.c {
    public static c G = c.EDITED_TIME;
    public static int H = 0;
    public static boolean I = false;
    public static boolean J = true;
    public static boolean K = false;
    private ImageView A;
    private ImageView B;
    b.a.a.a.a C;
    ServiceConnection D = new a();
    private Bundle E;
    int F = -1;
    private b s;
    private c.a.a.a.a.b.b.a t;
    private d u;
    private notepad.note.notas.notes.notizen.util.a v;
    private MyTextView w;
    private RelativeLayout x;
    private boolean y = false;
    private LinearLayout z;

    class a implements ServiceConnection {
        a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MainActivity.this.C = a.AbstractBinderC0054a.a(iBinder);
            MainActivity.this.p();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            MainActivity.this.C = null;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements b.c {
        b() {
        }

        @Override // notepad.note.notas.notes.notizen.main.b.c
        public void a(int i) {
            MainActivity.this.u.e();
            MainActivity.this.u.h(i);
            MainActivity.this.a((MainActivity) true);
        }

        @Override // notepad.note.notas.notes.notizen.main.b.c
        public void a(int i, String str, boolean z) {
            boolean equals = str.equals(BuildConfig.FLAVOR);
            Intent intent = !z ? equals ? new Intent(MainActivity.this, NoteActivity.class) : new Intent(MainActivity.this, ConfirmPasswordActivity.class) : equals ? new Intent(MainActivity.this, ChecklistActivity.class) : new Intent(MainActivity.this, ConfirmPasswordChecklistActivity.class);
            intent.putExtra("noteId", i);
            MainActivity.this.startActivity(intent);
            MainActivity.this.overridePendingTransition(R.anim.activity_right_to_left, R.anim.activity_hold);
        }
    }

    public enum c {
        TITLE,
        EDITED_TIME,
        CREATED_TIME
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(boolean z2) {
        if (z2) {
            this.y = true;
            this.x.setVisibility(0);
            this.s.e(2);
            this.z.setVisibility(8);
        } else {
            this.y = false;
            this.x.setVisibility(8);
            this.s.e(1);
            this.z.setVisibility(0);
        }
        q();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p() {
        ArrayList<String> stringArrayList;
        b.a.a.a.a aVar = this.C;
        if (aVar != null) {
            try {
                Bundle a2 = aVar.a(3, getPackageName(), "inapp", null);
                this.E = a2;
                this.F = a2.getInt("RESPONSE_CODE");
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            if (this.F == 0 && (stringArrayList = this.E.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null && stringArrayList.size() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(stringArrayList.get(0));
                    SharedPreferences.Editor edit = getSharedPreferences("SETTING", 0).edit();
                    if (jSONObject.getString("productId").equals("remove_ads")) {
                        if (jSONObject.getInt("purchaseState") == 0) {
                            edit.putBoolean("isPremium", true);
                        } else {
                            edit.putBoolean("isPremium", false);
                        }
                        edit.apply();
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private void q() {
        b bVar;
        ArrayList<c.a.a.a.a.b.c.d> a2;
        if (I) {
            s();
            return;
        }
        if (J) {
            K = false;
            this.w.setText(getString(R.string.blackNote));
            bVar = this.s;
            a2 = this.u.a(G);
        } else {
            int i = H;
            if (i == 0) {
                K = true;
                this.w.setText(getString(R.string.unCategorizedNotes));
            } else {
                K = false;
                this.w.setText(this.t.b(i));
            }
            bVar = this.s;
            a2 = this.u.a(H, G);
        }
        bVar.a(a2);
        this.s.d();
        v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        if (r1.equals("TITLE") != false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r() {
        /*
        // Method dump skipped, instructions count: 270
        */
        throw new UnsupportedOperationException("Method not decompiled: notepad.note.notas.notes.notizen.main.MainActivity.r():void");
    }

    private void s() {
        this.B.setVisibility(8);
        H = 0;
        this.w.setText(getString(R.string.favorites));
        this.A.setImageResource(R.drawable.btn_main_favorites_green);
        I = true;
        J = true;
        K = false;
        this.s.a(this.u.d());
        this.s.d();
    }

    private void t() {
        I = false;
        this.A.setImageResource(R.drawable.btn_favorites);
        w();
    }

    private void u() {
        this.s.a(new b());
    }

    private void v() {
        int i;
        ImageView imageView;
        if (this.s.a() != 0 || this.y || I || K) {
            imageView = this.B;
            i = 8;
        } else {
            imageView = this.B;
            i = 0;
        }
        imageView.setVisibility(i);
    }

    private void w() {
        J = true;
        K = false;
        H = 0;
        this.w.setText(getString(R.string.blackNote));
        this.s.a(this.u.a(G));
        this.s.d();
        v();
    }

    public void btnClick(View view) {
        Intent intent;
        int i;
        if (view.getId() != R.id.btnCategory) {
            if (view.getId() == R.id.btnAddNote) {
                if (this.v.a()) {
                    intent = new Intent(this, SelectNoteActivity.class);
                    i = 6;
                } else {
                    return;
                }
            } else if (view.getId() == R.id.btnMore) {
                if (this.v.a()) {
                    intent = new Intent(this, SettingActivity.class);
                    i = 2;
                } else {
                    return;
                }
            } else if (view.getId() == R.id.btnEditBack) {
                if (this.v.a()) {
                    a(false);
                    return;
                }
                return;
            } else if (view.getId() != R.id.btnDeleteSelectedNotes) {
                if (view.getId() == R.id.btnChangeCategory) {
                    if (this.v.a()) {
                        Intent intent2 = new Intent(this, SelectCategoryActivity.class);
                        intent2.putExtra("type", "main");
                        startActivityForResult(intent2, 5);
                    } else {
                        return;
                    }
                } else if (view.getId() == R.id.btnSearch) {
                    if (this.v.a()) {
                        startActivity(new Intent(this, SearchActivity.class));
                        overridePendingTransition(R.anim.activity_right_to_left, 0);
                        return;
                    }
                    return;
                } else if (view.getId() == R.id.btnFavorite) {
                    if (I) {
                        t();
                        return;
                    } else {
                        s();
                        return;
                    }
                } else if (view.getId() == R.id.btnDailyCheck) {
                    if (this.v.a()) {
                        startActivity(new Intent(this, DailyCheckActivity.class));
                    } else {
                        return;
                    }
                } else if (view.getId() != R.id.btnSort) {
                    return;
                } else {
                    if (this.v.a() && !I) {
                        intent = new Intent(this, SortActivity.class);
                        i = 8;
                    } else if (I) {
                        Toast.makeText(this, "Can't change sorting at the favorites.", 0).show();
                        return;
                    } else {
                        return;
                    }
                }
                overridePendingTransition(R.anim.activity_bottom_to_top, R.anim.activity_hold);
                return;
            } else if (this.v.a()) {
                intent = new Intent(this, DeleteNoteActivity.class);
                i = 4;
            } else {
                return;
            }
            startActivityForResult(intent, i);
            overridePendingTransition(R.anim.activity_fade_in, 0);
        } else if (this.v.a()) {
            startActivityForResult(new Intent(this, CategoryActivity.class), 1);
            overridePendingTransition(R.anim.activity_bottom_to_top, 0);
        }
    }

    public void o() {
        Toast makeText;
        try {
            if (this.C != null) {
                PendingIntent pendingIntent = (PendingIntent) this.C.a(3, getPackageName(), "remove_ads", "inapp", "bGoa+V7g/yqDXvKRqq+JTFn4uQZbPiQJo4pf9RzJ").getParcelable("BUY_INTENT");
                if (pendingIntent != null) {
                    IntentSender intentSender = pendingIntent.getIntentSender();
                    Intent intent = new Intent();
                    Integer num = 0;
                    int intValue = num.intValue();
                    Integer num2 = 0;
                    int intValue2 = num2.intValue();
                    Integer num3 = 0;
                    startIntentSenderForResult(intentSender, 3, intent, intValue, intValue2, num3.intValue());
                    return;
                }
                makeText = Toast.makeText(this, "Failed..Please, restart app..", 0);
            } else {
                makeText = Toast.makeText(this, "Please, restart app and try again.", 0);
            }
            makeText.show();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (IntentSender.SendIntentException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 1) {
            I = false;
            this.A.setImageResource(R.drawable.btn_favorites);
            J = intent.getBooleanExtra("isAllNotes", true);
            H = intent.getIntExtra("categoryId", 0);
        } else if (i == 2) {
            if (intent.getStringExtra("type").equals("removeAds")) {
                o();
            }
        } else if (i == 3) {
            finish();
            startActivity(getIntent());
        } else if (i == 4) {
            this.u.a();
        } else if (i == 5) {
            this.u.f(intent.getIntExtra("categoryId", 0));
            this.u.e();
            Toast.makeText(this, "Success", 0).show();
        } else {
            if (i == 6) {
                String stringExtra = intent.getStringExtra("type");
                if (stringExtra.equals("note")) {
                    Intent intent2 = new Intent(this, AddNoteActivity.class);
                    intent2.putExtra("categoryId", H);
                    startActivity(intent2);
                } else if (stringExtra.equals("checklist")) {
                    Intent intent3 = new Intent(this, AddChecklistActivity.class);
                    intent3.putExtra("categoryId", H);
                    startActivityForResult(intent3, 7);
                    overridePendingTransition(R.anim.activity_fade_in, 0);
                    return;
                } else {
                    return;
                }
            } else if (i == 7) {
                int b2 = this.u.b();
                if (b2 != 0) {
                    Intent intent4 = new Intent(this, ChecklistActivity.class);
                    intent4.putExtra("noteId", b2);
                    startActivity(intent4);
                } else {
                    return;
                }
            } else if (i == 8) {
                SharedPreferences.Editor edit = getSharedPreferences("SETTING", 0).edit();
                String stringExtra2 = intent.getStringExtra("sort");
                if (stringExtra2.equals("title")) {
                    G = c.TITLE;
                    str = "TITLE";
                } else if (stringExtra2.equals("editedTime")) {
                    G = c.EDITED_TIME;
                    str = "EDITED_TIME";
                } else {
                    if (stringExtra2.equals("createdTime")) {
                        G = c.CREATED_TIME;
                        str = "CREATED_TIME";
                    }
                    edit.apply();
                    return;
                }
                edit.putString("sort", str);
                edit.apply();
                return;
            } else {
                return;
            }
            overridePendingTransition(R.anim.activity_right_to_left, R.anim.activity_hold);
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (I) {
            t();
        } else if (this.y) {
            a(false);
        } else if (J) {
            super.onBackPressed();
        } else {
            w();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        r();
        u();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onResume() {
        super.onResume();
        p();
        q();
    }
}
