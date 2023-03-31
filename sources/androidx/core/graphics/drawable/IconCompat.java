package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f794a = -1;

    /* renamed from: b  reason: collision with root package name */
    Object f795b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f796c = null;
    public Parcelable d = null;
    public int e = 0;
    public int f = 0;
    public ColorStateList g = null;
    PorterDuff.Mode h = j;
    public String i = null;

    private static int a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    private static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    private static String b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    public int a() {
        if (this.f794a == -1 && Build.VERSION.SDK_INT >= 23) {
            return a((Icon) this.f795b);
        }
        if (this.f794a == 2) {
            return this.e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public void a(boolean z) {
        this.i = this.h.name();
        int i2 = this.f794a;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.f796c = ((String) this.f795b).getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i2 == 3) {
                    this.f796c = (byte[]) this.f795b;
                    return;
                } else if (i2 == 4) {
                    this.f796c = this.f795b.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i2 != 5) {
                    return;
                }
            }
            if (z) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) this.f795b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f796c = byteArrayOutputStream.toByteArray();
                return;
            }
        } else if (z) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
        this.d = (Parcelable) this.f795b;
    }

    public String b() {
        if (this.f794a == -1 && Build.VERSION.SDK_INT >= 23) {
            return b((Icon) this.f795b);
        }
        if (this.f794a == 2) {
            return ((String) this.f795b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public void c() {
        Parcelable parcelable;
        this.h = PorterDuff.Mode.valueOf(this.i);
        int i2 = this.f794a;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.f795b = this.f796c;
                        return;
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                    }
                }
                this.f795b = new String(this.f796c, Charset.forName("UTF-16"));
                return;
            }
            parcelable = this.d;
            if (parcelable == null) {
                byte[] bArr = this.f796c;
                this.f795b = bArr;
                this.f794a = 3;
                this.e = 0;
                this.f = bArr.length;
                return;
            }
        } else {
            parcelable = this.d;
            if (parcelable == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.f795b = parcelable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
