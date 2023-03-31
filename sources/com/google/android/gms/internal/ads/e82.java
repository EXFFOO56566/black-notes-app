package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class e82 implements Parcelable {
    public static final Parcelable.Creator<e82> CREATOR = new d82();
    private final int A;
    private int B;

    /* renamed from: b  reason: collision with root package name */
    private final String f2384b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2385c;
    public final String d;
    private final qc2 e;
    private final String f;
    public final String g;
    public final int h;
    public final List<byte[]> i;
    public final ba2 j;
    public final int k;
    public final int l;
    public final float m;
    public final int n;
    public final float o;
    private final int p;
    private final byte[] q;
    private final gg2 r;
    public final int s;
    public final int t;
    public final int u;
    private final int v;
    private final int w;
    public final long x;
    public final int y;
    public final String z;

    e82(Parcel parcel) {
        this.f2384b = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.d = parcel.readString();
        this.f2385c = parcel.readInt();
        this.h = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readFloat();
        this.n = parcel.readInt();
        this.o = parcel.readFloat();
        this.q = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.p = parcel.readInt();
        this.r = (gg2) parcel.readParcelable(gg2.class.getClassLoader());
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readString();
        this.A = parcel.readInt();
        this.x = parcel.readLong();
        int readInt = parcel.readInt();
        this.i = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.i.add(parcel.createByteArray());
        }
        this.j = (ba2) parcel.readParcelable(ba2.class.getClassLoader());
        this.e = (qc2) parcel.readParcelable(qc2.class.getClassLoader());
    }

    private e82(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, gg2 gg2, int i8, int i9, int i10, int i11, int i12, int i13, String str5, int i14, long j2, List<byte[]> list, ba2 ba2, qc2 qc2) {
        this.f2384b = str;
        this.f = str2;
        this.g = str3;
        this.d = str4;
        this.f2385c = i2;
        this.h = i3;
        this.k = i4;
        this.l = i5;
        this.m = f2;
        this.n = i6;
        this.o = f3;
        this.q = bArr;
        this.p = i7;
        this.r = gg2;
        this.s = i8;
        this.t = i9;
        this.u = i10;
        this.v = i11;
        this.w = i12;
        this.y = i13;
        this.z = str5;
        this.A = i14;
        this.x = j2;
        this.i = list == null ? Collections.emptyList() : list;
        this.j = ba2;
        this.e = qc2;
    }

    public static e82 a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, gg2 gg2, ba2 ba2) {
        return new e82(str, null, str2, null, -1, i3, i4, i5, -1.0f, i6, f3, bArr, i7, gg2, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, ba2, null);
    }

    public static e82 a(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, ba2 ba2, int i7, String str4) {
        return new e82(str, null, str2, null, -1, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, -1, -1, i7, str4, -1, Long.MAX_VALUE, list, ba2, null);
    }

    public static e82 a(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, ba2 ba2, int i6, String str4) {
        return a(str, str2, null, -1, -1, i4, i5, -1, null, ba2, 0, str4);
    }

    public static e82 a(String str, String str2, String str3, int i2, int i3, String str4, int i4, ba2 ba2, long j2, List<byte[]> list) {
        return new e82(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, -1, j2, list, ba2, null);
    }

    public static e82 a(String str, String str2, String str3, int i2, int i3, String str4, ba2 ba2) {
        return a(str, str2, null, -1, i3, str4, -1, ba2, Long.MAX_VALUE, Collections.emptyList());
    }

    public static e82 a(String str, String str2, String str3, int i2, ba2 ba2) {
        return new e82(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static e82 a(String str, String str2, String str3, int i2, List<byte[]> list, String str4, ba2 ba2) {
        return new e82(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, ba2, null);
    }

    @TargetApi(16)
    private static void a(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public final int a() {
        int i2;
        int i3 = this.k;
        if (i3 == -1 || (i2 = this.l) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final e82 a(int i2) {
        return new e82(this.f2384b, this.f, this.g, this.d, this.f2385c, i2, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.y, this.z, this.A, this.x, this.i, this.j, this.e);
    }

    public final e82 a(int i2, int i3) {
        return new e82(this.f2384b, this.f, this.g, this.d, this.f2385c, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, i2, i3, this.y, this.z, this.A, this.x, this.i, this.j, this.e);
    }

    public final e82 a(qc2 qc2) {
        return new e82(this.f2384b, this.f, this.g, this.d, this.f2385c, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.y, this.z, this.A, this.x, this.i, this.j, qc2);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.g);
        String str = this.z;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.h);
        a(mediaFormat, "width", this.k);
        a(mediaFormat, "height", this.l);
        float f2 = this.m;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        a(mediaFormat, "rotation-degrees", this.n);
        a(mediaFormat, "channel-count", this.s);
        a(mediaFormat, "sample-rate", this.t);
        a(mediaFormat, "encoder-delay", this.v);
        a(mediaFormat, "encoder-padding", this.w);
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.i.get(i2)));
        }
        gg2 gg2 = this.r;
        if (gg2 != null) {
            a(mediaFormat, "color-transfer", gg2.d);
            a(mediaFormat, "color-standard", gg2.f2756b);
            a(mediaFormat, "color-range", gg2.f2757c);
            byte[] bArr = gg2.e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final e82 b(long j2) {
        return new e82(this.f2384b, this.f, this.g, this.d, this.f2385c, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.y, this.z, this.A, j2, this.i, this.j, this.e);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e82.class == obj.getClass()) {
            e82 e82 = (e82) obj;
            if (this.f2385c == e82.f2385c && this.h == e82.h && this.k == e82.k && this.l == e82.l && this.m == e82.m && this.n == e82.n && this.o == e82.o && this.p == e82.p && this.s == e82.s && this.t == e82.t && this.u == e82.u && this.v == e82.v && this.w == e82.w && this.x == e82.x && this.y == e82.y && ag2.a(this.f2384b, e82.f2384b) && ag2.a(this.z, e82.z) && this.A == e82.A && ag2.a(this.f, e82.f) && ag2.a(this.g, e82.g) && ag2.a(this.d, e82.d) && ag2.a(this.j, e82.j) && ag2.a(this.e, e82.e) && ag2.a(this.r, e82.r) && Arrays.equals(this.q, e82.q) && this.i.size() == e82.i.size()) {
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    if (!Arrays.equals(this.i.get(i2), e82.i.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.B == 0) {
            String str = this.f2384b;
            int i2 = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.g;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f2385c) * 31) + this.k) * 31) + this.l) * 31) + this.s) * 31) + this.t) * 31;
            String str5 = this.z;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.A) * 31;
            ba2 ba2 = this.j;
            int hashCode6 = (hashCode5 + (ba2 == null ? 0 : ba2.hashCode())) * 31;
            qc2 qc2 = this.e;
            if (qc2 != null) {
                i2 = qc2.hashCode();
            }
            this.B = hashCode6 + i2;
        }
        return this.B;
    }

    public final String toString() {
        String str = this.f2384b;
        String str2 = this.f;
        String str3 = this.g;
        int i2 = this.f2385c;
        String str4 = this.z;
        int i3 = this.k;
        int i4 = this.l;
        float f2 = this.m;
        int i5 = this.s;
        int i6 = this.t;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2384b);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.d);
        parcel.writeInt(this.f2385c);
        parcel.writeInt(this.h);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeFloat(this.m);
        parcel.writeInt(this.n);
        parcel.writeFloat(this.o);
        parcel.writeInt(this.q != null ? 1 : 0);
        byte[] bArr = this.q;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.p);
        parcel.writeParcelable(this.r, i2);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.y);
        parcel.writeString(this.z);
        parcel.writeInt(this.A);
        parcel.writeLong(this.x);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.i.get(i3));
        }
        parcel.writeParcelable(this.j, 0);
        parcel.writeParcelable(this.e, 0);
    }
}
