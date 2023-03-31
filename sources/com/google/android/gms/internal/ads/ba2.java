package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

public final class ba2 implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<ba2> CREATOR = new da2();

    /* renamed from: b  reason: collision with root package name */
    private final a[] f1908b;

    /* renamed from: c  reason: collision with root package name */
    private int f1909c;
    public final int d;

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new fa2();

        /* renamed from: b  reason: collision with root package name */
        private int f1910b;

        /* renamed from: c  reason: collision with root package name */
        private final UUID f1911c;
        private final String d;
        private final byte[] e;
        public final boolean f;

        a(Parcel parcel) {
            this.f1911c = new UUID(parcel.readLong(), parcel.readLong());
            this.d = parcel.readString();
            this.e = parcel.createByteArray();
            this.f = parcel.readByte() != 0;
        }

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        private a(UUID uuid, String str, byte[] bArr, boolean z) {
            mf2.a(uuid);
            this.f1911c = uuid;
            mf2.a((Object) str);
            this.d = str;
            mf2.a(bArr);
            this.e = bArr;
            this.f = false;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return this.d.equals(aVar.d) && ag2.a(this.f1911c, aVar.f1911c) && Arrays.equals(this.e, aVar.e);
        }

        public final int hashCode() {
            if (this.f1910b == 0) {
                this.f1910b = (((this.f1911c.hashCode() * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.e);
            }
            return this.f1910b;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f1911c.getMostSignificantBits());
            parcel.writeLong(this.f1911c.getLeastSignificantBits());
            parcel.writeString(this.d);
            parcel.writeByteArray(this.e);
            parcel.writeByte(this.f ? (byte) 1 : 0);
        }
    }

    ba2(Parcel parcel) {
        a[] aVarArr = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f1908b = aVarArr;
        this.d = aVarArr.length;
    }

    private ba2(boolean z, a... aVarArr) {
        a[] aVarArr2 = (a[]) aVarArr.clone();
        Arrays.sort(aVarArr2, this);
        for (int i = 1; i < aVarArr2.length; i++) {
            if (aVarArr2[i - 1].f1911c.equals(aVarArr2[i].f1911c)) {
                String valueOf = String.valueOf(aVarArr2[i].f1911c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f1908b = aVarArr2;
        this.d = aVarArr2.length;
    }

    public ba2(a... aVarArr) {
        this(true, aVarArr);
    }

    public final a a(int i) {
        return this.f1908b[i];
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        return p72.f4122b.equals(aVar3.f1911c) ? p72.f4122b.equals(aVar4.f1911c) ? 0 : 1 : aVar3.f1911c.compareTo(aVar4.f1911c);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ba2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1908b, ((ba2) obj).f1908b);
    }

    public final int hashCode() {
        if (this.f1909c == 0) {
            this.f1909c = Arrays.hashCode(this.f1908b);
        }
        return this.f1909c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f1908b, 0);
    }
}
