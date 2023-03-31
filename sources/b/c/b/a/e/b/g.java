package b.c.b.a.e.b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b.c.b.a.a.a.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;

public final class g extends h<i> {
    private final a.C0056a z;

    public g(Context context, Looper looper, d dVar, a.C0056a aVar, f.a aVar2, f.b bVar) {
        super(context, looper, 68, dVar, aVar2, bVar);
        a.C0056a.C0057a aVar3 = new a.C0056a.C0057a(aVar == null ? a.C0056a.e : aVar);
        aVar3.a(a.a());
        this.z = aVar3.a();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new h(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String c() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int e() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String l() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final Bundle t() {
        return this.z.a();
    }
}
