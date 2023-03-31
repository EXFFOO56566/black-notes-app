package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class eq1 {
    private static final String[] d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a  reason: collision with root package name */
    private String f2469a = "ad.doubleclick.net";

    /* renamed from: b  reason: collision with root package name */
    private String[] f2470b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c  reason: collision with root package name */
    private wf1 f2471c;

    public eq1(wf1 wf1) {
        this.f2471c = wf1;
    }

    private final Uri a(Uri uri, String str) {
        try {
            boolean c2 = c(uri);
            if (c2) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new ht1("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new ht1("Query parameter already exists: ms");
            }
            if (c2) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + str + ";" + uri2.substring(i));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str + "&" + uri3.substring(i2));
        } catch (UnsupportedOperationException unused) {
            throw new ht1("Provided Uri is not in a valid state");
        }
    }

    private final boolean c(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.f2469a);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw null;
        }
    }

    public final Uri a(Uri uri, Context context) {
        return a(uri, this.f2471c.a(context));
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return a(uri, this.f2471c.a(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new ht1("Provided Uri is not in a valid state");
        }
    }

    public final wf1 a() {
        return this.f2471c;
    }

    public final void a(MotionEvent motionEvent) {
        this.f2471c.a(motionEvent);
    }

    public final boolean a(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String str : this.f2470b) {
                    if (host.endsWith(str)) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw null;
    }

    public final boolean b(Uri uri) {
        if (a(uri)) {
            for (String str : d) {
                if (uri.getPath().endsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
