package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.common.internal.r;

public final class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        r.a(googleSignInOptions);
        return new b(context, googleSignInOptions);
    }
}
