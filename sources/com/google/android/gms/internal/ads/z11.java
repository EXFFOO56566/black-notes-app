package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class z11 implements y61<a21> {

    /* renamed from: a  reason: collision with root package name */
    private final y61<b71> f5681a;

    /* renamed from: b  reason: collision with root package name */
    private final zd1 f5682b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5683c;
    private final ik d;

    public z11(q31<b71> q31, zd1 zd1, Context context, ik ikVar) {
        this.f5681a = q31;
        this.f5682b = zd1;
        this.f5683c = context;
        this.d = ikVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ a21 a(b71 b71) {
        boolean z;
        String str;
        int i;
        int i2;
        float f;
        String str2;
        int i3;
        int i4;
        DisplayMetrics displayMetrics;
        um2 um2 = this.f5682b.e;
        um2[] um2Arr = um2.h;
        if (um2Arr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (um2 um22 : um2Arr) {
                if (!um22.j && !z2) {
                    str = um22.f4976b;
                    z2 = true;
                }
                if (um22.j && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = um2.f4976b;
            z = um2.j;
        }
        Resources resources = this.f5683c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f2 = displayMetrics.density;
            int i5 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.d.i().c();
            i2 = i5;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        um2[] um2Arr2 = um2.h;
        if (um2Arr2 != null) {
            boolean z4 = false;
            for (um2 um23 : um2Arr2) {
                if (um23.j) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    sb.append((um23.f != -1 || f == 0.0f) ? um23.f : (int) (((float) um23.g) / f));
                    sb.append("x");
                    if (um23.f4977c == -2) {
                        if (f != 0.0f) {
                            i4 = (int) (((float) um23.d) / f);
                            sb.append(i4);
                        }
                    }
                    i4 = um23.f4977c;
                    sb.append(i4);
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new a21(um2, str, z, sb.toString(), f, i2, i, str2, this.f5682b.o);
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<a21> a() {
        return yn1.a(this.f5681a.a(), new c21(this), jo.f);
    }
}
