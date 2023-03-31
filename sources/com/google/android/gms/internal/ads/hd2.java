package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;

/* access modifiers changed from: package-private */
public final class hd2 {

    /* renamed from: a  reason: collision with root package name */
    private final na2[] f2899a;

    /* renamed from: b  reason: collision with root package name */
    private final pa2 f2900b;

    /* renamed from: c  reason: collision with root package name */
    private na2 f2901c;

    public hd2(na2[] na2Arr, pa2 pa2) {
        this.f2899a = na2Arr;
        this.f2900b = pa2;
    }

    public final na2 a(ma2 ma2, Uri uri) {
        na2 na2 = this.f2901c;
        if (na2 != null) {
            return na2;
        }
        na2[] na2Arr = this.f2899a;
        int length = na2Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            na2 na22 = na2Arr[i];
            try {
                if (na22.a(ma2)) {
                    this.f2901c = na22;
                    ma2.b();
                    break;
                }
                ma2.b();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                ma2.b();
                throw th;
            }
        }
        na2 na23 = this.f2901c;
        if (na23 != null) {
            na23.a(this.f2900b);
            return this.f2901c;
        }
        String a2 = ag2.a(this.f2899a);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(a2);
        sb.append(") could read the stream.");
        throw new ce2(sb.toString(), uri);
    }

    public final void a() {
        na2 na2 = this.f2901c;
        if (na2 != null) {
            na2.a();
            this.f2901c = null;
        }
    }
}
