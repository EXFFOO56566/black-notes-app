package b.c.b.a.e.f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class f0 extends a implements d0 {
    f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(int i, String str, a aVar, a aVar2, a aVar3) {
        Parcel r0 = r0();
        r0.writeInt(i);
        r0.writeString(str);
        q.a(r0, aVar);
        q.a(r0, aVar2);
        q.a(r0, aVar3);
        a(33, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(Bundle bundle, long j) {
        Parcel r0 = r0();
        q.a(r0, bundle);
        r0.writeLong(j);
        a(8, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(Bundle bundle, e0 e0Var, long j) {
        Parcel r0 = r0();
        q.a(r0, bundle);
        q.a(r0, e0Var);
        r0.writeLong(j);
        a(32, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(a aVar, long j) {
        Parcel r0 = r0();
        q.a(r0, aVar);
        r0.writeLong(j);
        a(30, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(a aVar, Bundle bundle, long j) {
        Parcel r0 = r0();
        q.a(r0, aVar);
        q.a(r0, bundle);
        r0.writeLong(j);
        a(27, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(a aVar, e0 e0Var, long j) {
        Parcel r0 = r0();
        q.a(r0, aVar);
        q.a(r0, e0Var);
        r0.writeLong(j);
        a(31, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(a aVar, h0 h0Var, long j) {
        Parcel r0 = r0();
        q.a(r0, aVar);
        q.a(r0, h0Var);
        r0.writeLong(j);
        a(1, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(a aVar, String str, String str2, long j) {
        Parcel r0 = r0();
        q.a(r0, aVar);
        r0.writeString(str);
        r0.writeString(str2);
        r0.writeLong(j);
        a(15, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(e0 e0Var) {
        Parcel r0 = r0();
        q.a(r0, e0Var);
        a(22, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(String str, long j) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeLong(j);
        a(23, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(String str, e0 e0Var) {
        Parcel r0 = r0();
        r0.writeString(str);
        q.a(r0, e0Var);
        a(6, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(String str, String str2, Bundle bundle) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        q.a(r0, bundle);
        a(9, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        q.a(r0, bundle);
        q.a(r0, z);
        q.a(r0, z2);
        r0.writeLong(j);
        a(2, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(String str, String str2, a aVar, boolean z, long j) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        q.a(r0, aVar);
        q.a(r0, z);
        r0.writeLong(j);
        a(4, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(String str, String str2, e0 e0Var) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        q.a(r0, e0Var);
        a(10, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void a(String str, String str2, boolean z, e0 e0Var) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        q.a(r0, z);
        q.a(r0, e0Var);
        a(5, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void b(a aVar, long j) {
        Parcel r0 = r0();
        q.a(r0, aVar);
        r0.writeLong(j);
        a(28, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void b(e0 e0Var) {
        Parcel r0 = r0();
        q.a(r0, e0Var);
        a(19, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void b(String str, long j) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeLong(j);
        a(24, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void c(a aVar, long j) {
        Parcel r0 = r0();
        q.a(r0, aVar);
        r0.writeLong(j);
        a(26, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void c(e0 e0Var) {
        Parcel r0 = r0();
        q.a(r0, e0Var);
        a(16, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void d(a aVar, long j) {
        Parcel r0 = r0();
        q.a(r0, aVar);
        r0.writeLong(j);
        a(25, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void d(e0 e0Var) {
        Parcel r0 = r0();
        q.a(r0, e0Var);
        a(21, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void e(a aVar, long j) {
        Parcel r0 = r0();
        q.a(r0, aVar);
        r0.writeLong(j);
        a(29, r0);
    }

    @Override // b.c.b.a.e.f.d0
    public final void e(e0 e0Var) {
        Parcel r0 = r0();
        q.a(r0, e0Var);
        a(17, r0);
    }
}
