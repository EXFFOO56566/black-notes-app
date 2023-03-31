package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.e.e.b;
import b.c.b.a.e.e.c;

public interface l extends IInterface {

    public static abstract class a extends b.c.b.a.e.e.a implements l {

        /* renamed from: com.google.android.gms.common.internal.l$a$a  reason: collision with other inner class name */
        public static class C0074a extends b implements l {
            C0074a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.l
            public final Account R() {
                Parcel a2 = a(2, r0());
                Account account = (Account) c.a(a2, Account.CREATOR);
                a2.recycle();
                return account;
            }
        }

        public static l a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof l ? (l) queryLocalInterface : new C0074a(iBinder);
        }
    }

    Account R();
}
