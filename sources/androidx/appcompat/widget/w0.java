package androidx.appcompat.widget;

import a.a.k.a.a;
import a.g.d.c.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

public class w0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f717a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f718b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f719c;

    private w0(Context context, TypedArray typedArray) {
        this.f717a = context;
        this.f718b = typedArray;
    }

    public static w0 a(Context context, int i, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i, iArr));
    }

    public static w0 a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public float a(int i, float f) {
        return this.f718b.getDimension(i, f);
    }

    public int a(int i, int i2) {
        return this.f718b.getColor(i, i2);
    }

    public ColorStateList a(int i) {
        int resourceId;
        ColorStateList b2;
        return (!this.f718b.hasValue(i) || (resourceId = this.f718b.getResourceId(i, 0)) == 0 || (b2 = a.b(this.f717a, resourceId)) == null) ? this.f718b.getColorStateList(i) : b2;
    }

    public Typeface a(int i, int i2, f.a aVar) {
        int resourceId = this.f718b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f719c == null) {
            this.f719c = new TypedValue();
        }
        return f.a(this.f717a, resourceId, this.f719c, i2, aVar);
    }

    public void a() {
        this.f718b.recycle();
    }

    public boolean a(int i, boolean z) {
        return this.f718b.getBoolean(i, z);
    }

    public float b(int i, float f) {
        return this.f718b.getFloat(i, f);
    }

    public int b(int i, int i2) {
        return this.f718b.getDimensionPixelOffset(i, i2);
    }

    public Drawable b(int i) {
        int resourceId;
        return (!this.f718b.hasValue(i) || (resourceId = this.f718b.getResourceId(i, 0)) == 0) ? this.f718b.getDrawable(i) : a.c(this.f717a, resourceId);
    }

    public int c(int i, int i2) {
        return this.f718b.getDimensionPixelSize(i, i2);
    }

    public Drawable c(int i) {
        int resourceId;
        if (!this.f718b.hasValue(i) || (resourceId = this.f718b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return j.b().a(this.f717a, resourceId, true);
    }

    public int d(int i, int i2) {
        return this.f718b.getInt(i, i2);
    }

    public String d(int i) {
        return this.f718b.getString(i);
    }

    public int e(int i, int i2) {
        return this.f718b.getInteger(i, i2);
    }

    public CharSequence e(int i) {
        return this.f718b.getText(i);
    }

    public int f(int i, int i2) {
        return this.f718b.getLayoutDimension(i, i2);
    }

    public CharSequence[] f(int i) {
        return this.f718b.getTextArray(i);
    }

    public int g(int i, int i2) {
        return this.f718b.getResourceId(i, i2);
    }

    public boolean g(int i) {
        return this.f718b.hasValue(i);
    }
}
