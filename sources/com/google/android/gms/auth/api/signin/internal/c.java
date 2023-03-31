package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f1516c = new ReentrantLock();
    @GuardedBy("sLk")
    private static c d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f1517a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f1518b;

    private c(Context context) {
        this.f1518b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @Nullable
    private final GoogleSignInAccount a(String str) {
        String c2;
        if (!TextUtils.isEmpty(str) && (c2 = c(b("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.a(c2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static c a(Context context) {
        r.a(context);
        f1516c.lock();
        try {
            if (d == null) {
                d = new c(context.getApplicationContext());
            }
            return d;
        } finally {
            f1516c.unlock();
        }
    }

    private final void a(String str, String str2) {
        this.f1517a.lock();
        try {
            this.f1518b.edit().putString(str, str2).apply();
        } finally {
            this.f1517a.unlock();
        }
    }

    @Nullable
    private final GoogleSignInOptions b(String str) {
        String c2;
        if (!TextUtils.isEmpty(str) && (c2 = c(b("googleSignInOptions", str))) != null) {
            try {
                return GoogleSignInOptions.a(c2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    private final String c(String str) {
        this.f1517a.lock();
        try {
            return this.f1518b.getString(str, null);
        } finally {
            this.f1517a.unlock();
        }
    }

    public void a() {
        this.f1517a.lock();
        try {
            this.f1518b.edit().clear().apply();
        } finally {
            this.f1517a.unlock();
        }
    }

    public void a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        r.a(googleSignInAccount);
        r.a(googleSignInOptions);
        a("defaultGoogleSignInAccount", googleSignInAccount.o());
        r.a(googleSignInAccount);
        r.a(googleSignInOptions);
        String o = googleSignInAccount.o();
        a(b("googleSignInAccount", o), googleSignInAccount.p());
        a(b("googleSignInOptions", o), googleSignInOptions.m());
    }

    @Nullable
    public GoogleSignInAccount b() {
        return a(c("defaultGoogleSignInAccount"));
    }

    @Nullable
    public GoogleSignInOptions c() {
        return b(c("defaultGoogleSignInAccount"));
    }

    @Nullable
    public String d() {
        return c("refreshToken");
    }
}
