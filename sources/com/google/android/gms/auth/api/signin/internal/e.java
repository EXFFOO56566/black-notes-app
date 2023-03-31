package com.google.android.gms.auth.api.signin.internal;

import b.c.b.a.c.o.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.r;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class e implements Runnable {
    private static final a d = new a("RevokeAccessOperation", new String[0]);

    /* renamed from: b  reason: collision with root package name */
    private final String f1519b;

    /* renamed from: c  reason: collision with root package name */
    private final o f1520c = new o(null);

    private e(String str) {
        r.b(str);
        this.f1519b = str;
    }

    public static g<Status> a(String str) {
        if (str == null) {
            return h.a((k) new Status(4), (f) null);
        }
        e eVar = new e(str);
        new Thread(eVar).start();
        return eVar.f1520c;
    }

    public final void run() {
        Status status = Status.h;
        try {
            String valueOf = String.valueOf(this.f1519b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f;
            } else {
                d.b("Unable to revoke access!", new Object[0]);
            }
            a aVar = d;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar.a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            a aVar2 = d;
            String valueOf2 = String.valueOf(e.toString());
            aVar2.b(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            a aVar3 = d;
            String valueOf3 = String.valueOf(e2.toString());
            aVar3.b(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f1520c.a((k) status);
    }
}
