package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class dl1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f2274a;

    /* renamed from: b  reason: collision with root package name */
    private final cl1 f2275b;

    /* renamed from: c  reason: collision with root package name */
    private cl1 f2276c;

    private dl1(String str) {
        cl1 cl1 = new cl1();
        this.f2275b = cl1;
        this.f2276c = cl1;
        jl1.a(str);
        this.f2274a = str;
    }

    public final dl1 a(@NullableDecl Object obj) {
        cl1 cl1 = new cl1();
        this.f2276c.f2136b = cl1;
        this.f2276c = cl1;
        cl1.f2135a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f2274a);
        sb.append('{');
        cl1 cl1 = this.f2275b.f2136b;
        String str = BuildConfig.FLAVOR;
        while (cl1 != null) {
            Object obj = cl1.f2135a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            cl1 = cl1.f2136b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
