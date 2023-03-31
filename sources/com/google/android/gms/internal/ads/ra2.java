package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.qc2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ra2 {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f4468c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f4469a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f4470b = -1;

    static {
        new qa2();
    }

    private final boolean a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f4468c.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f4469a = parseInt;
                    this.f4470b = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean a() {
        return (this.f4469a == -1 || this.f4470b == -1) ? false : true;
    }

    public final boolean a(qc2 qc2) {
        for (int i = 0; i < qc2.a(); i++) {
            qc2.a a2 = qc2.a(i);
            if (a2 instanceof sc2) {
                sc2 sc2 = (sc2) a2;
                if (a(sc2.d, sc2.e)) {
                    return true;
                }
            }
        }
        return false;
    }
}
