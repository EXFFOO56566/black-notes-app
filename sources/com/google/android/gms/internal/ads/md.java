package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.u.a;
import java.util.Map;

public final class md extends wd {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f3689c;
    private final Context d;

    public md(ws wsVar, Map<String, String> map) {
        super(wsVar, "storePicture");
        this.f3689c = map;
        this.d = wsVar.a();
    }

    public final void a() {
        if (this.d == null) {
            a("Activity context is not available");
            return;
        }
        q.c();
        if (!gl.e(this.d).c()) {
            a("Feature is not supported by the device.");
            return;
        }
        String str = this.f3689c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            a("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            a(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            q.c();
            if (!gl.d(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                a(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources b2 = q.g().b();
            q.c();
            AlertDialog.Builder d2 = gl.d(this.d);
            d2.setTitle(b2 != null ? b2.getString(a.s1) : "Save image");
            d2.setMessage(b2 != null ? b2.getString(a.s2) : "Allow Ad to store image in Picture gallery?");
            d2.setPositiveButton(b2 != null ? b2.getString(a.s3) : "Accept", new pd(this, str, lastPathSegment));
            d2.setNegativeButton(b2 != null ? b2.getString(a.s4) : "Decline", new od(this));
            d2.create().show();
        }
    }
}
