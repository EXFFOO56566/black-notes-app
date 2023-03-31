package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.m;

public final class dn2 {

    /* renamed from: a  reason: collision with root package name */
    private final e[] f2285a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2286b;

    public dn2(Context context, AttributeSet attributeSet) {
        IllegalArgumentException illegalArgumentException;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, m.AdsAttrs);
        String string = obtainAttributes.getString(m.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(m.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.f2285a = a(string);
        } else if (!z && z2) {
            this.f2285a = a(string2);
        } else if (z) {
            throw illegalArgumentException;
        } else {
            illegalArgumentException = new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
            throw illegalArgumentException;
        }
        String string3 = obtainAttributes.getString(m.AdsAttrs_adUnitId);
        this.f2286b = string3;
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static e[] a(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        e[] eVarArr = new e[length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    eVarArr[i] = new e("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(trim)) {
                eVarArr[i] = e.g;
            } else if ("LARGE_BANNER".equals(trim)) {
                eVarArr[i] = e.i;
            } else if ("FULL_BANNER".equals(trim)) {
                eVarArr[i] = e.h;
            } else if ("LEADERBOARD".equals(trim)) {
                eVarArr[i] = e.j;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                eVarArr[i] = e.k;
            } else if ("SMART_BANNER".equals(trim)) {
                eVarArr[i] = e.m;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                eVarArr[i] = e.l;
            } else if ("FLUID".equals(trim)) {
                eVarArr[i] = e.n;
            } else if ("ICON".equals(trim)) {
                eVarArr[i] = e.p;
            } else {
                String valueOf2 = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf2) : new String("Could not parse XML attribute \"adSize\": "));
            }
        }
        if (length != 0) {
            return eVarArr;
        }
        String valueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(valueOf3.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf3) : new String("Could not parse XML attribute \"adSize\": "));
    }

    public final String a() {
        return this.f2286b;
    }

    public final e[] a(boolean z) {
        if (z || this.f2285a.length == 1) {
            return this.f2285a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
