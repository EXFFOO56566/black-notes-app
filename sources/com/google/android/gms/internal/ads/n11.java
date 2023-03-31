package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

public final class n11 implements y61<o11> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f3781a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3782b;

    /* renamed from: c  reason: collision with root package name */
    private final zd1 f3783c;
    private final View d;

    public n11(ko1 ko1, Context context, zd1 zd1, ViewGroup viewGroup) {
        this.f3781a = ko1;
        this.f3782b = context;
        this.f3783c = zd1;
        this.d = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<o11> a() {
        return this.f3781a.a(new q11(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ o11 b() {
        Context context = this.f3782b;
        um2 um2 = this.f3783c.e;
        ArrayList arrayList = new ArrayList();
        View view = this.d;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int i = -1;
            if (parent instanceof ViewGroup) {
                i = ((ViewGroup) parent).indexOfChild(view);
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new o11(context, um2, arrayList);
    }
}
