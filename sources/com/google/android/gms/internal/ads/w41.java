package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.ArrayList;

public final class w41 implements y61<x41> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f5209a;

    /* renamed from: b  reason: collision with root package name */
    private final zd1 f5210b;

    /* renamed from: c  reason: collision with root package name */
    private final PackageInfo f5211c;
    private final yk d;

    public w41(ko1 ko1, zd1 zd1, PackageInfo packageInfo, yk ykVar) {
        this.f5209a = ko1;
        this.f5210b = zd1;
        this.f5211c = packageInfo;
        this.d = ykVar;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<x41> a() {
        return this.f5209a.a(new z41(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
        if (r9 == 3) goto L_0x011a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 314
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w41.a(java.util.ArrayList, android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ x41 b() {
        ArrayList<String> arrayList = this.f5210b.g;
        return arrayList == null ? y41.f5537a : arrayList.isEmpty() ? b51.f1865a : new a51(this, arrayList);
    }
}
