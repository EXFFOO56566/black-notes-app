package b.c.b.a.c.o;

import android.util.Log;
import com.google.android.gms.common.internal.j;
import java.util.Locale;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f1170a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1171b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1172c;

    private a(String str, String str2) {
        this.f1171b = str2;
        this.f1170a = str;
        new j(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f1170a, i)) {
            i++;
        }
        this.f1172c = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L_0x0006
            java.lang.String r8 = ""
            goto L_0x0036
        L_0x0006:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r8.length
            r2 = 0
        L_0x0012:
            if (r2 >= r1) goto L_0x0028
            r3 = r8[r2]
            int r4 = r0.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0022
            java.lang.String r4 = ","
            r0.append(r4)
        L_0x0022:
            r0.append(r3)
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0028:
            r8 = 93
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L_0x0036:
            r6.<init>(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.c.o.a.<init>(java.lang.String, java.lang.String[]):void");
    }

    public void a(String str, Object... objArr) {
        if (a(3)) {
            Log.d(this.f1170a, c(str, objArr));
        }
    }

    public boolean a(int i) {
        return this.f1172c <= i;
    }

    public void b(String str, Object... objArr) {
        Log.e(this.f1170a, c(str, objArr));
    }

    /* access modifiers changed from: protected */
    public String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f1171b.concat(str);
    }
}
