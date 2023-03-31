package b.c.b.a.g.b;

import android.os.Parcel;
import b.c.b.a.c.b;
import b.c.b.a.e.d.a;
import b.c.b.a.e.d.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class g extends a implements d {
    public g() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.e.d.a
    public boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            a((b) c.a(parcel, b.CREATOR), (c) c.a(parcel, c.CREATOR));
        } else if (i == 4) {
            d((Status) c.a(parcel, Status.CREATOR));
        } else if (i == 6) {
            a((Status) c.a(parcel, Status.CREATOR));
        } else if (i == 7) {
            a((Status) c.a(parcel, Status.CREATOR), (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            a((l) c.a(parcel, l.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
