package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.s.c;
import java.util.List;

@Deprecated
public class s extends q {
    private String h;
    private List<c.b> i;
    private String j;
    private c.b k;
    private String l;
    private String m;

    public final void a(c.b bVar) {
        this.k = bVar;
    }

    public final void a(String str) {
        this.m = str;
    }

    public final void a(List<c.b> list) {
        this.i = list;
    }

    public final void b(String str) {
        this.j = str;
    }

    public final void c(String str) {
        this.l = str;
    }

    public final void d(String str) {
        this.h = str;
    }

    public final String i() {
        return this.m;
    }

    public final String j() {
        return this.j;
    }

    public final String k() {
        return this.l;
    }

    public final String l() {
        return this.h;
    }

    public final List<c.b> m() {
        return this.i;
    }

    public final c.b n() {
        return this.k;
    }
}
