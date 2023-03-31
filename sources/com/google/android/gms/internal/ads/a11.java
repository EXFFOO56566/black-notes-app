package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.ArrayList;
import javax.annotation.Nonnull;

final class a11 implements zn1<ArrayList<Uri>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ se f1675a;

    a11(o01 o01, se seVar) {
        this.f1675a = seVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(@Nonnull ArrayList<Uri> arrayList) {
        try {
            this.f1675a.b(arrayList);
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        try {
            se seVar = this.f1675a;
            String valueOf = String.valueOf(th.getMessage());
            seVar.d(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
    }
}
