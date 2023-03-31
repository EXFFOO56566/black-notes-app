package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class zr0 implements zn1<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ tf f5801a;

    zr0(mr0 mr0, tf tfVar) {
        this.f5801a = tfVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.f5801a.a(parcelFileDescriptor);
        } catch (RemoteException e) {
            wk.e("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        try {
            this.f5801a.a(lm.a(th, gp0.a(th)));
        } catch (RemoteException e) {
            wk.e("Service can't call client", e);
        }
    }
}
