package com.google.android.gms.internal.ads;

import android.util.Log;

public final class g42 extends j42 {

    /* renamed from: a  reason: collision with root package name */
    private String f2703a;

    public g42(String str) {
        this.f2703a = str;
    }

    @Override // com.google.android.gms.internal.ads.j42
    public final void a(String str) {
        String str2 = this.f2703a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
