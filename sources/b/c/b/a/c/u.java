package b.c.b.a.c;

import android.os.RemoteException;
import android.util.Log;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.common.internal.n0;
import com.google.android.gms.common.internal.r;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public abstract class u extends n0 {

    /* renamed from: b  reason: collision with root package name */
    private int f1181b;

    protected u(byte[] bArr) {
        r.a(bArr.length == 25);
        this.f1181b = Arrays.hashCode(bArr);
    }

    protected static byte[] q(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.common.internal.m0
    public final int J() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        a j0;
        if (obj != null && (obj instanceof m0)) {
            try {
                m0 m0Var = (m0) obj;
                if (m0Var.J() == hashCode() && (j0 = m0Var.j0()) != null) {
                    return Arrays.equals(r0(), (byte[]) b.Q(j0));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f1181b;
    }

    @Override // com.google.android.gms.common.internal.m0
    public final a j0() {
        return b.a(r0());
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] r0();
}
