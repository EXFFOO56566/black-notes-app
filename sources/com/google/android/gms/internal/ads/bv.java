package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class bv {

    /* renamed from: a  reason: collision with root package name */
    public final String f2015a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f2016b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f2017c;

    @TargetApi(21)
    public bv(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public bv(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private bv(String str, Uri uri, String str2, Map<String, String> map) {
        this.f2015a = str;
        this.f2016b = uri;
        this.f2017c = map == null ? Collections.emptyMap() : map;
    }
}
