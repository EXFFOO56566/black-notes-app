package com.google.android.gms.auth.api.signin.internal;

import a.k.a.a;
import a.k.b.b;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;

@KeepName
public class SignInHubActivity extends d {
    private static boolean v = false;
    private boolean q = false;
    private SignInConfiguration r;
    private boolean s;
    private int t;
    private Intent u;

    /* access modifiers changed from: private */
    public class a implements a.AbstractC0026a<Void> {
        private a() {
        }

        @Override // a.k.a.a.AbstractC0026a
        public final b<Void> a(int i, Bundle bundle) {
            return new h(SignInHubActivity.this, f.c());
        }

        @Override // a.k.a.a.AbstractC0026a
        public final void a(b<Void> bVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.k.b.b, java.lang.Object] */
        @Override // a.k.a.a.AbstractC0026a
        public final /* synthetic */ void a(b<Void> bVar, Void r3) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.t, SignInHubActivity.this.u);
            SignInHubActivity.this.finish();
        }
    }

    private final void b(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        v = false;
    }

    private final void k() {
        h().a(0, null, new a());
        v = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.q) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.b() != null) {
                        GoogleSignInAccount b2 = signInAccount.b();
                        o a2 = o.a(this);
                        GoogleSignInOptions d = this.r.d();
                        b.c.b.a.e.b.b.a(b2);
                        a2.a(d, b2);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", b2);
                        this.s = true;
                        this.t = i2;
                        this.u = intent;
                        k();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        b(intExtra);
                        return;
                    }
                }
                b(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        b.c.b.a.e.b.b.a(action);
        String str = action;
        if ("com.google.android.gms.auth.NO_IMPL".equals(str)) {
            b(12500);
        } else if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            b.c.b.a.e.b.b.a(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.r = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.s = z;
                if (z) {
                    this.t = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    b.c.b.a.e.b.b.a(intent2);
                    this.u = intent2;
                    k();
                }
            } else if (v) {
                setResult(0);
                b(12502);
            } else {
                v = true;
                Intent intent3 = new Intent(str);
                intent3.setPackage(str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
                intent3.putExtra("config", this.r);
                try {
                    startActivityForResult(intent3, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.q = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    b(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.s);
        if (this.s) {
            bundle.putInt("signInResultCode", this.t);
            bundle.putParcelable("signInResultData", this.u);
        }
    }
}
