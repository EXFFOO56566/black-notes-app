package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
public abstract class rp extends TextureView implements lq {

    /* renamed from: b  reason: collision with root package name */
    protected final bq f4529b = new bq();

    /* renamed from: c  reason: collision with root package name */
    protected final mq f4530c;

    public rp(Context context) {
        super(context);
        this.f4530c = new mq(context, this);
    }

    @Override // com.google.android.gms.internal.ads.lq
    public abstract void a();

    public abstract void a(float f, float f2);

    public abstract void a(op opVar);

    public void a(String str, String[] strArr) {
        setVideoPath(str);
    }

    public abstract void b();

    public abstract void b(int i);

    public abstract void c();

    public void c(int i) {
    }

    public abstract void d();

    public void d(int i) {
    }

    public abstract String e();

    public void e(int i) {
    }

    public void f(int i) {
    }

    public void g(int i) {
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
