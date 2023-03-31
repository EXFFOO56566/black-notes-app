package com.google.android.gms.internal.ads;

import java.util.Map;

final class td0 implements p20<q20> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, jt0<q20>> f4789a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, jt0<xe0>> f4790b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, mv0<xe0>> f4791c;
    private final e52<p20<n00>> d;
    private final rf0 e;

    td0(Map<String, jt0<q20>> map, Map<String, jt0<xe0>> map2, Map<String, mv0<xe0>> map3, e52<p20<n00>> e52, rf0 rf0) {
        this.f4789a = map;
        this.f4790b = map2;
        this.f4791c = map3;
        this.d = e52;
        this.e = rf0;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final jt0<q20> a(int i, String str) {
        jt0<n00> a2;
        jt0<q20> jt0 = this.f4789a.get(str);
        if (jt0 != null) {
            return jt0;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            mv0<xe0> mv0 = this.f4791c.get(str);
            if (mv0 != null) {
                return q20.a((mv0<? extends k20>) mv0);
            }
            jt0<xe0> jt02 = this.f4790b.get(str);
            if (jt02 != null) {
                return q20.a(jt02);
            }
            return null;
        } else if (this.e.d() == null || (a2 = this.d.get().a(i, str)) == null) {
            return null;
        } else {
            return q20.a(a2);
        }
    }
}
