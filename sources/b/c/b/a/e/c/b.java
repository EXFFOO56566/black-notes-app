package b.c.b.a.e.c;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import b.c.b.a.a.a.c;
import b.c.b.a.c.j;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;

public final class b extends h<c> {
    private final Bundle z;

    public b(Context context, Looper looper, d dVar, c cVar, f.a aVar, f.b bVar) {
        super(context, looper, 16, dVar, aVar, bVar);
        if (cVar == null) {
            this.z = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new d(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int e() {
        return j.f1165a;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final boolean k() {
        d A = A();
        return !TextUtils.isEmpty(A.b()) && !A.a(b.c.b.a.a.a.b.f1151c).isEmpty();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String l() {
        return "com.google.android.gms.auth.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final Bundle t() {
        return this.z;
    }
}
