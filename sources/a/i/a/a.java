package a.i.a;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final a f261c = new C0022a();

    /* renamed from: b  reason: collision with root package name */
    private final Parcelable f262b;

    /* renamed from: a.i.a.a$a  reason: collision with other inner class name */
    static class C0022a extends a {
        C0022a() {
            super((C0022a) null);
        }
    }

    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f261c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    private a() {
        this.f262b = null;
    }

    /* synthetic */ a(C0022a aVar) {
        this();
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f262b = readParcelable == null ? f261c : readParcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f262b = parcelable == f261c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public final Parcelable a() {
        return this.f262b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f262b, i);
    }
}
