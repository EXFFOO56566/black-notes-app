package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public interface t extends IInterface {
    void a(GoogleSignInAccount googleSignInAccount, Status status);

    void b(Status status);

    void c(Status status);
}
