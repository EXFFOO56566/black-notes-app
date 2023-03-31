package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import java.util.List;

public final class ij2 extends a {
    public static final Parcelable.Creator<ij2> CREATOR = new lj2();

    /* renamed from: b  reason: collision with root package name */
    public final String f3098b;

    /* renamed from: c  reason: collision with root package name */
    private final long f3099c;
    private final String d;
    private final String e;
    private final String f;
    private final Bundle g;
    public final boolean h;
    public long i;

    ij2(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.f3098b = str;
        this.f3099c = j;
        this.d = str2 == null ? BuildConfig.FLAVOR : str2;
        this.e = str3 == null ? BuildConfig.FLAVOR : str3;
        this.f = str4 == null ? BuildConfig.FLAVOR : str4;
        this.g = bundle == null ? new Bundle() : bundle;
        this.h = z;
        this.i = j2;
    }

    public static ij2 a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                co.d(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            q.e();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new ij2(queryParameter, parseLong, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e2) {
            co.c("Unable to parse Uri into cache offering.", e2);
            return null;
        }
    }

    public static ij2 a(String str) {
        return a(Uri.parse(str));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f3098b, false);
        c.a(parcel, 3, this.f3099c);
        c.a(parcel, 4, this.d, false);
        c.a(parcel, 5, this.e, false);
        c.a(parcel, 6, this.f, false);
        c.a(parcel, 7, this.g, false);
        c.a(parcel, 8, this.h);
        c.a(parcel, 9, this.i);
        c.a(parcel, a2);
    }
}
