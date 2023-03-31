package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.q;
import java.util.List;

public final class o11 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3929a;

    /* renamed from: b  reason: collision with root package name */
    private final um2 f3930b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Parcelable> f3931c;

    public o11(Context context, um2 um2, List<Parcelable> list) {
        this.f3929a = context;
        this.f3930b = um2;
        this.f3931c = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (p0.f4079a.a().booleanValue()) {
            Bundle bundle3 = new Bundle();
            q.c();
            bundle3.putString("activity", gl.f(this.f3929a));
            Bundle bundle4 = new Bundle();
            bundle4.putInt("width", this.f3930b.f);
            bundle4.putInt("height", this.f3930b.f4977c);
            bundle3.putBundle("size", bundle4);
            if (this.f3931c.size() > 0) {
                List<Parcelable> list = this.f3931c;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}
