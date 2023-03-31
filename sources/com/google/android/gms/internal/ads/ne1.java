package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public final class ne1 {
    public static ParcelFileDescriptor a(InputStream inputStream) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        jo.f3256a.execute(new me1(inputStream, createPipe[1]));
        return parcelFileDescriptor;
    }
}
