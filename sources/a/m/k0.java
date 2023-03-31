package a.m;

import android.os.IBinder;

/* access modifiers changed from: package-private */
public class k0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f337a;

    k0(IBinder iBinder) {
        this.f337a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f337a.equals(this.f337a);
    }

    public int hashCode() {
        return this.f337a.hashCode();
    }
}
