package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class qg {
    private static long a(String str) {
        try {
            return a().parse(str).getTime();
        } catch (ParseException e) {
            c5.a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static m61 a(ef2 ef2) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = ef2.f2419c;
        String str = map.get("Date");
        long a2 = str != null ? a(str) : 0;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = map.get("Expires");
        long a3 = str3 != null ? a(str3) : 0;
        String str4 = map.get("Last-Modified");
        long a4 = str4 != null ? a(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (a2 <= 0 || a3 < a2) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (a3 - a2);
                j3 = j4;
            }
        }
        m61 m61 = new m61();
        m61.f3669a = ef2.f2418b;
        m61.f3670b = str5;
        m61.f = j4;
        m61.e = j3;
        m61.f3671c = a2;
        m61.d = a4;
        m61.g = map;
        m61.h = ef2.d;
        return m61;
    }

    static String a(long j) {
        return a().format(new Date(j));
    }

    private static SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
