package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.n;
import androidx.lifecycle.e;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final int[] f832b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<String> f833c;
    final int[] d;
    final int[] e;
    final int f;
    final int g;
    final String h;
    final int i;
    final int j;
    final CharSequence k;
    final int l;
    final CharSequence m;
    final ArrayList<String> n;
    final ArrayList<String> o;
    final boolean p;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(Parcel parcel) {
        this.f832b = parcel.createIntArray();
        this.f833c = parcel.createStringArrayList();
        this.d = parcel.createIntArray();
        this.e = parcel.createIntArray();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.readInt();
        this.m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
        this.p = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.f873a.size();
        this.f832b = new int[(size * 5)];
        if (aVar.h) {
            this.f833c = new ArrayList<>(size);
            this.d = new int[size];
            this.e = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                n.a aVar2 = aVar.f873a.get(i2);
                int i4 = i3 + 1;
                this.f832b[i3] = aVar2.f876a;
                ArrayList<String> arrayList = this.f833c;
                Fragment fragment = aVar2.f877b;
                arrayList.add(fragment != null ? fragment.f : null);
                int[] iArr = this.f832b;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f878c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.e;
                iArr[i7] = aVar2.f;
                this.d[i2] = aVar2.g.ordinal();
                this.e[i2] = aVar2.h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.i;
            this.i = aVar.t;
            this.j = aVar.j;
            this.k = aVar.k;
            this.l = aVar.l;
            this.m = aVar.m;
            this.n = aVar.n;
            this.o = aVar.o;
            this.p = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(j jVar) {
        a aVar = new a(jVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f832b.length) {
            n.a aVar2 = new n.a();
            int i4 = i2 + 1;
            aVar2.f876a = this.f832b[i2];
            if (j.I) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f832b[i4]);
            }
            String str = this.f833c.get(i3);
            aVar2.f877b = str != null ? jVar.h.get(str) : null;
            aVar2.g = e.b.values()[this.d[i3]];
            aVar2.h = e.b.values()[this.e[i3]];
            int[] iArr = this.f832b;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar2.f878c = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar2.d = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.e = i10;
            int i11 = iArr[i9];
            aVar2.f = i11;
            aVar.f874b = i6;
            aVar.f875c = i8;
            aVar.d = i10;
            aVar.e = i11;
            aVar.a(aVar2);
            i3++;
            i2 = i9 + 1;
        }
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.i = this.h;
        aVar.t = this.i;
        aVar.h = true;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        aVar.m = this.m;
        aVar.n = this.n;
        aVar.o = this.o;
        aVar.p = this.p;
        aVar.a(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f832b);
        parcel.writeStringList(this.f833c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }
}
