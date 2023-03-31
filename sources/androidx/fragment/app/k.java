package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<m> f867b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<String> f868c;
    b[] d;
    String e = null;
    int f;

    static class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    public k() {
    }

    public k(Parcel parcel) {
        this.f867b = parcel.createTypedArrayList(m.CREATOR);
        this.f868c = parcel.createStringArrayList();
        this.d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.e = parcel.readString();
        this.f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f867b);
        parcel.writeStringList(this.f868c);
        parcel.writeTypedArray(this.d, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }
}
