package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.j;
import java.io.IOException;
import java.io.InputStream;

final /* synthetic */ class me1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f3698b;

    /* renamed from: c  reason: collision with root package name */
    private final ParcelFileDescriptor f3699c;

    me1(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3698b = inputStream;
        this.f3699c = parcelFileDescriptor;
    }

    public final void run() {
        InputStream inputStream = this.f3698b;
        try {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.f3699c);
            try {
                j.a(inputStream, autoCloseOutputStream);
                autoCloseOutputStream.close();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                kx1.a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            kx1.a(th, th2);
        }
    }
}
