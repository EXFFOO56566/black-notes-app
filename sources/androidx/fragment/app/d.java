package androidx.fragment.app;

import a.e.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.c;
import androidx.core.app.a;
import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class d extends ComponentActivity {
    final f h = f.a(new a());
    final i i = new i(this);
    boolean j;
    boolean k;
    boolean l = true;
    boolean m;
    boolean n;
    int o;
    h<String> p;

    class a extends h<d> implements t, c {
        public a() {
            super(d.this);
        }

        @Override // androidx.fragment.app.e, androidx.fragment.app.h
        public View a(int i) {
            return d.this.findViewById(i);
        }

        @Override // androidx.lifecycle.h
        public e a() {
            return d.this.i;
        }

        @Override // androidx.fragment.app.h
        public void a(Fragment fragment) {
            d.this.a(fragment);
        }

        @Override // androidx.fragment.app.h
        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher b() {
            return d.this.b();
        }

        @Override // androidx.fragment.app.h
        public boolean b(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.e, androidx.fragment.app.h
        public boolean d() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.t
        public s e() {
            return d.this.e();
        }

        @Override // androidx.fragment.app.h
        public d i() {
            return d.this;
        }

        @Override // androidx.fragment.app.h
        public LayoutInflater j() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.h
        public int k() {
            Window window = d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h
        public boolean l() {
            return d.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.h
        public void m() {
            d.this.j();
        }
    }

    static void a(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private static boolean a(i iVar, e.b bVar) {
        boolean z = false;
        for (Fragment fragment : iVar.c()) {
            if (fragment != null) {
                if (fragment.a().a().a(e.b.STARTED)) {
                    fragment.S.b(bVar);
                    z = true;
                }
                if (fragment.s() != null) {
                    z |= a(fragment.l(), bVar);
                }
            }
        }
        return z;
    }

    private void k() {
        do {
        } while (a(g(), e.b.CREATED));
    }

    /* access modifiers changed from: package-private */
    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.h.a(view, str, context, attributeSet);
    }

    public void a(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.j);
        printWriter.print(" mResumed=");
        printWriter.print(this.k);
        printWriter.print(" mStopped=");
        printWriter.print(this.l);
        if (getApplication() != null) {
            a.k.a.a.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.h.j().a(str, fileDescriptor, printWriter, strArr);
    }

    public i g() {
        return this.h.j();
    }

    @Deprecated
    public a.k.a.a h() {
        return a.k.a.a.a(this);
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.i.a(e.a.ON_RESUME);
        this.h.f();
    }

    @Deprecated
    public void j() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.h.k();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String a2 = this.p.a(i5);
            this.p.c(i5);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a3 = this.h.a(a2);
            if (a3 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
                return;
            }
            a3.a(i2 & 65535, i3, intent);
            return;
        }
        a.AbstractC0042a a4 = androidx.core.app.a.a();
        if (a4 == null || !a4.a(this, i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h.k();
        this.h.a(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public void onCreate(Bundle bundle) {
        this.h.a((Fragment) null);
        if (bundle != null) {
            this.h.a(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.o = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.p = new h<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.p.c(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.p == null) {
            this.p = new h<>();
            this.o = 0;
        }
        super.onCreate(bundle);
        this.i.a(e.a.ON_CREATE);
        this.h.b();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.h.a(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a2 = a(view, str, context, attributeSet);
        return a2 == null ? super.onCreateView(view, str, context, attributeSet) : a2;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a2 = a(null, str, context, attributeSet);
        return a2 == null ? super.onCreateView(str, context, attributeSet) : a2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.h.c();
        this.i.a(e.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.h.d();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.h.b(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.h.a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.h.a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.h.k();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.h.a(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.k = false;
        this.h.e();
        this.i.a(e.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.h.b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        i();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? a(view, menu) | this.h.b(menu) : super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.h.k();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a2 = this.p.a(i4);
            this.p.c(i4);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a3 = this.h.a(a2);
            if (a3 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
                return;
            }
            a3.a(i2 & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.k = true;
        this.h.k();
        this.h.i();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k();
        this.i.a(e.a.ON_STOP);
        Parcelable l2 = this.h.l();
        if (l2 != null) {
            bundle.putParcelable("android:support:fragments", l2);
        }
        if (this.p.c() > 0) {
            bundle.putInt("android:support:next_request_index", this.o);
            int[] iArr = new int[this.p.c()];
            String[] strArr = new String[this.p.c()];
            for (int i2 = 0; i2 < this.p.c(); i2++) {
                iArr[i2] = this.p.b(i2);
                strArr[i2] = this.p.d(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.l = false;
        if (!this.j) {
            this.j = true;
            this.h.a();
        }
        this.h.k();
        this.h.i();
        this.i.a(e.a.ON_START);
        this.h.g();
    }

    public void onStateNotSaved() {
        this.h.k();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.l = true;
        k();
        this.h.h();
        this.i.a(e.a.ON_STOP);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (!this.n && i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (!this.n && i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (!this.m && i2 != -1) {
            a(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (!this.m && i2 != -1) {
            a(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
