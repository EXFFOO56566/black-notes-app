package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

public final class rk {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f4511a = BigInteger.ONE;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private String f4512b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.f4511a.toString();
        this.f4511a = this.f4511a.add(BigInteger.ONE);
        this.f4512b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.f4512b;
    }
}
