package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import com.google.android.gms.common.internal.w.d;
import com.google.android.gms.common.util.j;
import java.io.DataInputStream;
import java.io.IOException;

public final class yf extends a {
    public static final Parcelable.Creator<yf> CREATOR = new ag();

    /* renamed from: b  reason: collision with root package name */
    private ParcelFileDescriptor f5584b;

    /* renamed from: c  reason: collision with root package name */
    private Parcelable f5585c = null;
    private boolean d = true;

    public yf(ParcelFileDescriptor parcelFileDescriptor) {
        this.f5584b = parcelFileDescriptor;
    }

    private static <T> ParcelFileDescriptor a(byte[] bArr) {
        IOException e;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                jo.f3256a.execute(new xf(autoCloseOutputStream, bArr));
                return createPipe[0];
            } catch (IOException e2) {
                e = e2;
                co.b("Error transporting the ad response", e);
                q.g().a(e, "LargeParcelTeleporter.pipeData.2");
                j.a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = null;
            co.b("Error transporting the ad response", e);
            q.g().a(e, "LargeParcelTeleporter.pipeData.2");
            j.a(autoCloseOutputStream);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void a(java.io.OutputStream r3, byte[] r4) {
        /*
            r0 = 0
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0019 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0019 }
            int r0 = r4.length     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1.writeInt(r0)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1.write(r4)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            com.google.android.gms.common.util.j.a(r1)
            return
        L_0x0011:
            r4 = move-exception
            r0 = r1
            goto L_0x0032
        L_0x0014:
            r4 = move-exception
            r0 = r1
            goto L_0x001a
        L_0x0017:
            r4 = move-exception
            goto L_0x0032
        L_0x0019:
            r4 = move-exception
        L_0x001a:
            java.lang.String r1 = "Error transporting the ad response"
            com.google.android.gms.internal.ads.co.b(r1, r4)     // Catch:{ all -> 0x0017 }
            com.google.android.gms.internal.ads.ik r1 = com.google.android.gms.ads.internal.q.g()     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "LargeParcelTeleporter.pipeData.1"
            r1.a(r4, r2)     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x002e
            com.google.android.gms.common.util.j.a(r3)
            return
        L_0x002e:
            com.google.android.gms.common.util.j.a(r0)
            return
        L_0x0032:
            if (r0 != 0) goto L_0x0038
            com.google.android.gms.common.util.j.a(r3)
            goto L_0x003b
        L_0x0038:
            com.google.android.gms.common.util.j.a(r0)
        L_0x003b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf.a(java.io.OutputStream, byte[]):void");
    }

    /* JADX INFO: finally extract failed */
    private final ParcelFileDescriptor d() {
        if (this.f5584b == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f5585c.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f5584b = a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f5584b;
    }

    /* JADX INFO: finally extract failed */
    public final <T extends d> T a(Parcelable.Creator<T> creator) {
        if (this.d) {
            if (this.f5584b == null) {
                co.b("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f5584b));
            try {
                int readInt = dataInputStream.readInt();
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr, 0, readInt);
                j.a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, readInt);
                    obtain.setDataPosition(0);
                    this.f5585c = creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.d = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                co.b("Could not read from parcel file descriptor", e);
                j.a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                j.a(dataInputStream);
                throw th2;
            }
        }
        return (T) ((d) this.f5585c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        d();
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f5584b, i, false);
        c.a(parcel, a2);
    }
}
