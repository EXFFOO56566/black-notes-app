package b.c.b.b.a0;

import a.e.g;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class a extends a.i.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0061a();
    public final g<String, Bundle> d;

    /* renamed from: b.c.b.b.a0.a$a  reason: collision with other inner class name */
    static class C0061a implements Parcelable.ClassLoaderCreator<a> {
        C0061a() {
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.d = new g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.d.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0061a aVar) {
        this(parcel, classLoader);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.d = new g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.d + "}";
    }

    @Override // a.i.a.a
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.d.b(i2);
            bundleArr[i2] = this.d.d(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
