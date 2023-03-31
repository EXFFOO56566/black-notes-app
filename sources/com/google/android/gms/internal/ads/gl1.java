package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class gl1 {

    static final class a {
        private a() {
        }
    }

    static {
        Logger.getLogger(gl1.class.getName());
        new a();
    }

    private gl1() {
    }

    static String a(@NullableDecl String str) {
        if (b(str)) {
            return null;
        }
        return str;
    }

    static boolean b(@NullableDecl String str) {
        return str == null || str.isEmpty();
    }

    static String c(@NullableDecl String str) {
        return str == null ? BuildConfig.FLAVOR : str;
    }
}
