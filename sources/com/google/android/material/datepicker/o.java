package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* access modifiers changed from: package-private */
public class o {
    static long a(long j) {
        Calendar d = d();
        d.setTimeInMillis(j);
        return a(d).getTimeInMillis();
    }

    @TargetApi(24)
    private static DateFormat a(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(c());
        return instanceForSkeleton;
    }

    @TargetApi(24)
    static DateFormat a(Locale locale) {
        return a("MMMEd", locale);
    }

    private static java.text.DateFormat a(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(a());
        return dateInstance;
    }

    static Calendar a(Calendar calendar) {
        Calendar b2 = b(calendar);
        Calendar d = d();
        d.set(b2.get(1), b2.get(2), b2.get(5));
        return d;
    }

    private static TimeZone a() {
        return TimeZone.getTimeZone("UTC");
    }

    static java.text.DateFormat b(Locale locale) {
        return a(0, locale);
    }

    private static SimpleDateFormat b(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(a());
        return simpleDateFormat;
    }

    static Calendar b() {
        return a(Calendar.getInstance());
    }

    static Calendar b(Calendar calendar) {
        Calendar instance = Calendar.getInstance(a());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    static DateFormat c(Locale locale) {
        return a("yMMMEd", locale);
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone c() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    private static SimpleDateFormat d(Locale locale) {
        return b("MMMM, yyyy", locale);
    }

    static Calendar d() {
        return b((Calendar) null);
    }

    static SimpleDateFormat e() {
        return d(Locale.getDefault());
    }
}
