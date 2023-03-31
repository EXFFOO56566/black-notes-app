package com.google.android.gms.ads.s;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.j;
import com.google.android.gms.internal.ads.l1;
import com.google.android.gms.internal.ads.n1;

public class b extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private j f1462b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1463c;
    private l1 d;
    private ImageView.ScaleType e;
    private boolean f;
    private n1 g;

    public b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(l1 l1Var) {
        this.d = l1Var;
        if (this.f1463c) {
            l1Var.a(this.f1462b);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(n1 n1Var) {
        this.g = n1Var;
        if (this.f) {
            n1Var.a(this.e);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f = true;
        this.e = scaleType;
        n1 n1Var = this.g;
        if (n1Var != null) {
            n1Var.a(scaleType);
        }
    }

    public void setMediaContent(j jVar) {
        this.f1463c = true;
        this.f1462b = jVar;
        l1 l1Var = this.d;
        if (l1Var != null) {
            l1Var.a(jVar);
        }
    }
}
