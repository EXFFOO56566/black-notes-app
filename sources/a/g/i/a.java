package a.g.i;

import a.g.k.h;
import android.util.Base64;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f132a;

    /* renamed from: b  reason: collision with root package name */
    private final String f133b;

    /* renamed from: c  reason: collision with root package name */
    private final String f134c;
    private final List<List<byte[]>> d;
    private final int e = 0;
    private final String f = (this.f132a + "-" + this.f133b + "-" + this.f134c);

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        h.a(str);
        this.f132a = str;
        h.a(str2);
        this.f133b = str2;
        h.a(str3);
        this.f134c = str3;
        h.a(list);
        this.d = list;
    }

    public List<List<byte[]>> a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.f132a;
    }

    public String e() {
        return this.f133b;
    }

    public String f() {
        return this.f134c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f132a + ", mProviderPackage: " + this.f133b + ", mQuery: " + this.f134c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
