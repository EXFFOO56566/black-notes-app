package androidx.versionedparcelable;

import a.e.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.lang.reflect.Method;

class b extends a {
    private final SparseIntArray d;
    private final Parcel e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new a(), new a(), new a());
    }

    private b(Parcel parcel, int i2, int i3, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.e = parcel;
        this.f = i2;
        this.g = i3;
        this.j = i2;
        this.h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i2 = this.i;
        if (i2 >= 0) {
            int i3 = this.d.get(i2);
            int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(i3);
            this.e.writeInt(dataPosition - i3);
            this.e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    public void a(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.a
    public void a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void a(String str) {
        this.e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.a
    public void a(byte[] bArr) {
        if (bArr != null) {
            this.e.writeInt(bArr.length);
            this.e.writeByteArray(bArr);
            return;
        }
        this.e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.a
    public boolean a(int i2) {
        while (this.j < this.g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int readInt = this.e.readInt();
            this.k = this.e.readInt();
            this.j += readInt;
        }
        return this.k == i2;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.a
    public a b() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f) {
            i2 = this.g;
        }
        return new b(parcel, dataPosition, i2, this.h + "  ", this.f1119a, this.f1120b, this.f1121c);
    }

    @Override // androidx.versionedparcelable.a
    public void b(int i2) {
        a();
        this.i = i2;
        this.d.put(i2, this.e.dataPosition());
        c(0);
        c(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void c(int i2) {
        this.e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.a
    public boolean d() {
        return this.e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] e() {
        int readInt = this.e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.a
    public CharSequence f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // androidx.versionedparcelable.a
    public int g() {
        return this.e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T h() {
        return (T) this.e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String i() {
        return this.e.readString();
    }
}
