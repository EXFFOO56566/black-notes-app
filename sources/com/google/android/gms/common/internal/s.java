package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new d0();

    /* renamed from: b  reason: collision with root package name */
    private final int f1646b;

    /* renamed from: c  reason: collision with root package name */
    private final Account f1647c;
    private final int d;
    private final GoogleSignInAccount e;

    s(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f1646b = i;
        this.f1647c = account;
        this.d = i2;
        this.e = googleSignInAccount;
    }

    public s(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public Account R() {
        return this.f1647c;
    }

    public int d() {
        return this.d;
    }

    public GoogleSignInAccount e() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1646b);
        c.a(parcel, 2, (Parcelable) R(), i, false);
        c.a(parcel, 3, d());
        c.a(parcel, 4, (Parcelable) e(), i, false);
        c.a(parcel, a2);
    }
}
