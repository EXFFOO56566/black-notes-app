package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.e;

/* access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final String f871b;

    /* renamed from: c  reason: collision with root package name */
    final String f872c;
    final boolean d;
    final int e;
    final int f;
    final String g;
    final boolean h;
    final boolean i;
    final boolean j;
    final Bundle k;
    final boolean l;
    final int m;
    Bundle n;
    Fragment o;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    m(Parcel parcel) {
        this.f871b = parcel.readString();
        this.f872c = parcel.readString();
        boolean z = true;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readBundle();
        this.l = parcel.readInt() == 0 ? false : z;
        this.n = parcel.readBundle();
        this.m = parcel.readInt();
    }

    m(Fragment fragment) {
        this.f871b = fragment.getClass().getName();
        this.f872c = fragment.f;
        this.d = fragment.n;
        this.e = fragment.w;
        this.f = fragment.x;
        this.g = fragment.y;
        this.h = fragment.B;
        this.i = fragment.m;
        this.j = fragment.A;
        this.k = fragment.g;
        this.l = fragment.z;
        this.m = fragment.R.ordinal();
    }

    public Fragment a(ClassLoader classLoader, g gVar) {
        Bundle bundle;
        Fragment fragment;
        if (this.o == null) {
            Bundle bundle2 = this.k;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment a2 = gVar.a(classLoader, this.f871b);
            this.o = a2;
            a2.m(this.k);
            Bundle bundle3 = this.n;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.o;
                bundle = this.n;
            } else {
                fragment = this.o;
                bundle = new Bundle();
            }
            fragment.f824c = bundle;
            Fragment fragment2 = this.o;
            fragment2.f = this.f872c;
            fragment2.n = this.d;
            fragment2.p = true;
            fragment2.w = this.e;
            fragment2.x = this.f;
            fragment2.y = this.g;
            fragment2.B = this.h;
            fragment2.m = this.i;
            fragment2.A = this.j;
            fragment2.z = this.l;
            fragment2.R = e.b.values()[this.m];
            if (j.I) {
                Log.v("FragmentManager", "Instantiated fragment " + this.o);
            }
        }
        return this.o;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f871b);
        sb.append(" (");
        sb.append(this.f872c);
        sb.append(")}:");
        if (this.d) {
            sb.append(" fromLayout");
        }
        if (this.f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.g);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f871b);
        parcel.writeString(this.f872c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.m);
    }
}
