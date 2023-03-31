package b.c.b.a.c;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new r();
    public static final b f = new b(0);

    /* renamed from: b  reason: collision with root package name */
    private final int f1154b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1155c;
    private final PendingIntent d;
    private final String e;

    public b(int i) {
        this(i, null, null);
    }

    b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f1154b = i;
        this.f1155c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final int d() {
        return this.f1155c;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1155c == bVar.f1155c && p.a(this.d, bVar.d) && p.a(this.e, bVar.e);
    }

    public final PendingIntent g() {
        return this.d;
    }

    public final int hashCode() {
        return p.a(Integer.valueOf(this.f1155c), this.d, this.e);
    }

    public final boolean i() {
        return (this.f1155c == 0 || this.d == null) ? false : true;
    }

    public final boolean j() {
        return this.f1155c == 0;
    }

    public final String toString() {
        p.a a2 = p.a(this);
        a2.a("statusCode", a(this.f1155c));
        a2.a("resolution", this.d);
        a2.a("message", this.e);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1154b);
        c.a(parcel, 2, d());
        c.a(parcel, 3, (Parcelable) g(), i, false);
        c.a(parcel, 4, e(), false);
        c.a(parcel, a2);
    }
}
