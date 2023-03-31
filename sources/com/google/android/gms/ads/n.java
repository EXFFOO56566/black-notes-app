package com.google.android.gms.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n {
    public static final List<String> e = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: a  reason: collision with root package name */
    private final int f1449a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1450b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1451c;
    private final List<String> d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f1452a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f1453b = -1;

        /* renamed from: c  reason: collision with root package name */
        private String f1454c = null;
        private final List<String> d = new ArrayList();

        public n a() {
            return new n(this.f1452a, this.f1453b, this.f1454c, this.d);
        }
    }

    private n(int i, int i2, String str, List<String> list) {
        this.f1449a = i;
        this.f1450b = i2;
        this.f1451c = str;
        this.d = list;
    }

    public String a() {
        String str = this.f1451c;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int b() {
        return this.f1449a;
    }

    public int c() {
        return this.f1450b;
    }

    public List<String> d() {
        return new ArrayList(this.d);
    }
}
