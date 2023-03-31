package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
public final class mq implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f3744a;

    /* renamed from: b  reason: collision with root package name */
    private final lq f3745b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3746c;
    private boolean d;
    private boolean e;
    private float f = 1.0f;

    public mq(Context context, lq lqVar) {
        this.f3744a = (AudioManager) context.getSystemService("audio");
        this.f3745b = lqVar;
    }

    private final void d() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = this.d && !this.e && this.f > 0.0f;
        if (z4 && !(z2 = this.f3746c)) {
            AudioManager audioManager = this.f3744a;
            if (audioManager != null && !z2) {
                if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z3 = true;
                }
                this.f3746c = z3;
            }
            this.f3745b.a();
        } else if (!z4 && (z = this.f3746c)) {
            AudioManager audioManager2 = this.f3744a;
            if (audioManager2 != null && z) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z3 = true;
                }
                this.f3746c = z3;
            }
            this.f3745b.a();
        }
    }

    public final float a() {
        float f2 = this.e ? 0.0f : this.f;
        if (this.f3746c) {
            return f2;
        }
        return 0.0f;
    }

    public final void a(float f2) {
        this.f = f2;
        d();
    }

    public final void a(boolean z) {
        this.e = z;
        d();
    }

    public final void b() {
        this.d = true;
        d();
    }

    public final void c() {
        this.d = false;
        d();
    }

    public final void onAudioFocusChange(int i) {
        this.f3746c = i > 0;
        this.f3745b.a();
    }
}
