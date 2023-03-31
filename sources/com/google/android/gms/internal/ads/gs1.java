package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class gs1 {

    /* renamed from: a  reason: collision with root package name */
    private static Cipher f2803a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2804b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2805c = new Object();

    public gs1(SecureRandom secureRandom) {
    }

    private static Cipher a() {
        Cipher cipher;
        synchronized (f2805c) {
            if (f2803a == null) {
                f2803a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f2803a;
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f2804b) {
                    a().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = a().doFinal(bArr2);
                    iv = a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return xq0.a(bArr3, false);
            } catch (NoSuchAlgorithmException e) {
                throw new jv1(this, e);
            } catch (InvalidKeyException e2) {
                throw new jv1(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new jv1(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new jv1(this, e4);
            } catch (BadPaddingException e5) {
                throw new jv1(this, e5);
            }
        } else {
            throw new jv1(this);
        }
    }

    public final byte[] a(String str) {
        try {
            byte[] a2 = xq0.a(str, false);
            if (a2.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(a2, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new jv1(this);
        } catch (IllegalArgumentException e) {
            throw new jv1(this, e);
        }
    }

    public final byte[] a(byte[] bArr, String str) {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a2 = xq0.a(str, false);
                if (a2.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(a2.length);
                    allocate.put(a2);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(a2.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f2804b) {
                        a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new jv1(this);
            } catch (NoSuchAlgorithmException e) {
                throw new jv1(this, e);
            } catch (InvalidKeyException e2) {
                throw new jv1(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new jv1(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new jv1(this, e4);
            } catch (BadPaddingException e5) {
                throw new jv1(this, e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new jv1(this, e6);
            } catch (IllegalArgumentException e7) {
                throw new jv1(this, e7);
            }
        } else {
            throw new jv1(this);
        }
    }
}
