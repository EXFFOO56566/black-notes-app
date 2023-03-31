package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;

public final class a21 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final um2 f1682a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1683b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1684c;
    private final String d;
    private final float e;
    private final int f;
    private final int g;
    private final String h;
    private final boolean i;

    public a21(um2 um2, String str, boolean z, String str2, float f2, int i2, int i3, String str3, boolean z2) {
        r.a(um2, "the adSize must not be null");
        this.f1682a = um2;
        this.f1683b = str;
        this.f1684c = z;
        this.d = str2;
        this.e = f2;
        this.f = i2;
        this.g = i3;
        this.h = str3;
        this.i = z2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        ee1.a(bundle2, "smart_w", "full", this.f1682a.f == -1);
        ee1.a(bundle2, "smart_h", "auto", this.f1682a.f4977c == -2);
        ee1.a(bundle2, "ene", (Boolean) true, this.f1682a.k);
        ee1.a(bundle2, "rafmt", "102", this.f1682a.n);
        ee1.a(bundle2, "rafmt", "103", this.f1682a.o);
        ee1.a(bundle2, "inline_adaptive_slot", (Boolean) true, this.i);
        ee1.a(bundle2, "format", this.f1683b);
        ee1.a(bundle2, "fluid", "height", this.f1684c);
        String str = this.d;
        ee1.a(bundle2, "sz", str, !TextUtils.isEmpty(str));
        bundle2.putFloat("u_sd", this.e);
        bundle2.putInt("sw", this.f);
        bundle2.putInt("sh", this.g);
        String str2 = this.h;
        ee1.a(bundle2, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        um2[] um2Arr = this.f1682a.h;
        if (um2Arr == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.f1682a.f4977c);
            bundle3.putInt("width", this.f1682a.f);
            bundle3.putBoolean("is_fluid_height", this.f1682a.j);
            arrayList.add(bundle3);
        } else {
            for (um2 um2 : um2Arr) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", um2.j);
                bundle4.putInt("height", um2.f4977c);
                bundle4.putInt("width", um2.f);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
