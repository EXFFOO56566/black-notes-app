package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ba0;
import com.google.android.gms.internal.ads.ga0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class zs0 {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5807a = false;

    /* renamed from: b  reason: collision with root package name */
    private static MessageDigest f5808b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f5809c = new Object();
    private static final Object d = new Object();
    static CountDownLatch e = new CountDownLatch(1);

    private static ba0 a(ba0.d dVar) {
        ba0.a x = ba0.x();
        x.u((long) dVar.a());
        return (ba0) ((rz1) x.e());
    }

    static String a(ba0 ba0, String str) {
        byte[] bArr;
        c12 e2;
        byte[] f = ba0.f();
        if (((Boolean) on2.e().a(zr2.f1)).booleanValue()) {
            Vector<byte[]> a2 = a(f, 255);
            if (a2 == null || a2.size() == 0) {
                bArr = a(a(ba0.d.PSN_ENCODE_SIZE_FAIL).f(), str, true);
                return xq0.a(bArr, true);
            }
            ga0.a p = ga0.p();
            Iterator<byte[]> it = a2.iterator();
            while (it.hasNext()) {
                p.a(dy1.a(a(it.next(), str, false)));
            }
            p.b(dy1.a(a(f)));
            e2 = p.e();
        } else if (o52.f3950a != null) {
            byte[] a3 = o52.f3950a.a(f, str != null ? str.getBytes() : new byte[0]);
            ga0.a p2 = ga0.p();
            p2.a(dy1.a(a3));
            p2.a(oh0.TINK_HYBRID);
            e2 = p2.e();
        } else {
            throw new GeneralSecurityException();
        }
        bArr = ((ga0) ((rz1) e2)).f();
        return xq0.a(bArr, true);
    }

    private static Vector<byte[]> a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void a() {
        synchronized (d) {
            if (!f5807a) {
                f5807a = true;
                new Thread(new bv0()).start();
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] digest;
        synchronized (f5809c) {
            MessageDigest b2 = b();
            if (b2 != null) {
                b2.reset();
                b2.update(bArr);
                digest = f5808b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    private static byte[] a(byte[] bArr, String str, boolean z) {
        ByteBuffer byteBuffer;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = a(ba0.d.PSN_ENCODE_SIZE_FAIL).f();
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr);
        }
        byte[] array = byteBuffer.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (g01 g01 : new ey0().N2) {
            g01.a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new ux1(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }

    private static MessageDigest b() {
        boolean z;
        MessageDigest messageDigest;
        a();
        try {
            z = e.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = f5808b) != null) {
            return messageDigest;
        }
        return null;
    }
}
