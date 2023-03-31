package b.c.b.a.g.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import b.c.b.a.c.j;
import b.c.b.a.g.e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.c;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s;

public class a extends h<f> implements e {
    private final d A;
    private final Bundle B;
    private Integer C;
    private final boolean z;

    private a(Context context, Looper looper, boolean z2, d dVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.z = true;
        this.A = dVar;
        this.B = bundle;
        this.C = dVar.e();
    }

    public a(Context context, Looper looper, boolean z2, d dVar, b.c.b.a.g.a aVar, f.a aVar2, f.b bVar) {
        this(context, looper, true, dVar, a(dVar), aVar2, bVar);
    }

    public static Bundle a(d dVar) {
        b.c.b.a.g.a i = dVar.i();
        Integer e = dVar.e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (e != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", e.intValue());
        }
        if (i != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", i.i());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", i.h());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", i.f());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", i.g());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", i.c());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", i.d());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", i.j());
            if (i.a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", i.a().longValue());
            }
            if (i.e() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", i.e().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new h(iBinder);
    }

    @Override // b.c.b.a.g.e
    public final void a(d dVar) {
        r.a(dVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c2 = this.A.c();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(c2.name)) {
                googleSignInAccount = c.a(s()).b();
            }
            ((f) w()).a(new j(new s(c2, this.C.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.a(new l(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public int e() {
        return j.f1165a;
    }

    @Override // b.c.b.a.g.e
    public final void j() {
        a(new c.d());
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public boolean k() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public String l() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public Bundle t() {
        if (!s().getPackageName().equals(this.A.g())) {
            this.B.putString("com.google.android.gms.signin.internal.realClientPackageName", this.A.g());
        }
        return this.B;
    }
}
