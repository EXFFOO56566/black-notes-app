package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class um1 implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f4975a;

    public um1(Pattern pattern) {
        jl1.a(pattern);
        this.f4975a = pattern;
    }

    public final boolean accept(@NullableDecl File file, String str) {
        return this.f4975a.matcher(str).matches();
    }
}
