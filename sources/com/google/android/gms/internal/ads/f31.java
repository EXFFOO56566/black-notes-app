package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.q;

public final class f31 implements y61<c31> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f2525a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2526b;

    public f31(ko1 ko1, Context context) {
        this.f2525a = ko1;
        this.f2526b = context;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<c31> a() {
        return this.f2525a.a(new e31(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ c31 b() {
        AudioManager audioManager = (AudioManager) this.f2526b.getSystemService("audio");
        return new c31(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), q.h().a(), q.h().b());
    }
}
