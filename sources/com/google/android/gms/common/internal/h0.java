package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.c.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.w.b;

public final class h0 implements Parcelable.Creator<g> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        d[] dVarArr = null;
        d[] dVarArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.k(parcel, a2);
                    break;
                case 2:
                    i2 = b.k(parcel, a2);
                    break;
                case 3:
                    i3 = b.k(parcel, a2);
                    break;
                case 4:
                    str = b.d(parcel, a2);
                    break;
                case 5:
                    iBinder = b.j(parcel, a2);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.b(parcel, a2, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel, a2);
                    break;
                case 8:
                    account = (Account) b.a(parcel, a2, Account.CREATOR);
                    break;
                case 9:
                default:
                    b.n(parcel, a2);
                    break;
                case 10:
                    dVarArr = (d[]) b.b(parcel, a2, d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (d[]) b.b(parcel, a2, d.CREATOR);
                    break;
                case 12:
                    z = b.h(parcel, a2);
                    break;
                case 13:
                    i4 = b.k(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new g(i, i2, i3, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z, i4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i) {
        return new g[i];
    }
}
