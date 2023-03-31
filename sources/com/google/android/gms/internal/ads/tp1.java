package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class tp1 {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList<up1> f4843a = new CopyOnWriteArrayList<>();

    public static up1 a(String str) {
        Iterator<up1> it = f4843a.iterator();
        while (it.hasNext()) {
            up1 next = it.next();
            if (next.b(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
