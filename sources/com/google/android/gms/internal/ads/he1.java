package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class he1 {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f2905a;

    public he1() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) on2.e().a(zr2.D3));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f2905a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.f2905a;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
