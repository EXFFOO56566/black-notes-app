package androidx.appcompat.widget;

import a.a.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public class a0 {
    private static final RectF k = new RectF();
    private static ConcurrentHashMap<String, Method> l = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Field> m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f598a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f599b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f600c = -1.0f;
    private float d = -1.0f;
    private float e = -1.0f;
    private int[] f = new int[0];
    private boolean g = false;
    private TextPaint h;
    private final TextView i;
    private final Context j;

    a0(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
    }

    private int a(RectF rectF) {
        int length = this.f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                if (a(this.f[i5], rectF)) {
                    int i6 = i5 + 1;
                    i4 = i3;
                    i3 = i6;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.h, i2, alignment, ((Float) a(this.i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a((Object) this.i, "mIncludePad", (Object) true)).booleanValue());
    }

    private static <T> T a(Object obj, String str, T t) {
        try {
            Field a2 = a(str);
            return a2 == null ? t : (T) a2.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return t;
        }
    }

    private static Field a(String str) {
        try {
            Field field = m.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                m.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    private void a(float f2) {
        if (f2 != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f2);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.i.isInLayout() : false;
            if (this.i.getLayout() != null) {
                this.f599b = false;
                try {
                    Method b2 = b("nullLayouts");
                    if (b2 != null) {
                        b2.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }

    private void a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.f598a = 1;
            this.d = f2;
            this.e = f3;
            this.f600c = f4;
            this.g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }

    private void a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f = a(iArr);
            j();
        }
    }

    private boolean a(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.i.getMaxLines() : -1;
        a(i2);
        StaticLayout a2 = a(text, (Layout.Alignment) b(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (a2.getLineCount() <= maxLines && a2.getLineEnd(a2.getLineCount() - 1) == text.length())) && ((float) a2.getHeight()) <= rectF.bottom;
    }

    private int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private StaticLayout b(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.h, i2, alignment, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
    }

    private StaticLayout b(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.h, i2);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            obtain.setTextDirection(Build.VERSION.SDK_INT >= 29 ? this.i.getTextDirectionHeuristic() : (TextDirectionHeuristic) b(this.i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private static <T> T b(Object obj, String str, T t) {
        try {
            return (T) b(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    private static Method b(String str) {
        try {
            Method method = l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                l.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    private void h() {
        this.f598a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.f600c = -1.0f;
        this.f = new int[0];
        this.f599b = false;
    }

    private boolean i() {
        if (!k() || this.f598a != 1) {
            this.f599b = false;
        } else {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.e - this.d) / this.f600c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round(this.d + (((float) i2) * this.f600c));
                }
                this.f = a(iArr);
            }
            this.f599b = true;
        }
        return this.f599b;
    }

    private boolean j() {
        int length = this.f.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.f598a = 1;
            int[] iArr = this.f;
            this.d = (float) iArr[0];
            this.e = (float) iArr[length - 1];
            this.f600c = -1.0f;
        }
        return this.g;
    }

    private boolean k() {
        return !(this.i instanceof k);
    }

    /* access modifiers changed from: package-private */
    public StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return i4 >= 23 ? b(charSequence, alignment, i2, i3) : i4 >= 16 ? b(charSequence, alignment, i2) : a(charSequence, alignment, i2);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (g()) {
            if (this.f599b) {
                if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                    int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.i.isHorizontallyScrollable() : ((Boolean) b(this.i, "getHorizontallyScrolling", false)).booleanValue() ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                    int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (k) {
                            k.setEmpty();
                            k.right = (float) measuredWidth;
                            k.bottom = (float) height;
                            float a2 = (float) a(k);
                            if (a2 != this.i.getTextSize()) {
                                a(0, a2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f599b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize((float) i2);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, float f2) {
        Context context = this.j;
        a(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4, int i5) {
        if (k()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (i()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.j.obtainStyledAttributes(attributeSet, j.AppCompatTextView, i2, 0);
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeTextType)) {
            this.f598a = obtainStyledAttributes.getInt(j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!k()) {
            this.f598a = 0;
        } else if (this.f598a == 1) {
            if (!this.g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                a(dimension2, dimension3, dimension);
            }
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int[] iArr, int i2) {
        if (k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                this.f = a(iArr2);
                if (!j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.g = false;
            }
            if (i()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return Math.round(this.e);
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        if (!k()) {
            return;
        }
        if (i2 == 0) {
            h();
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (i()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
        }
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return Math.round(this.d);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return Math.round(this.f600c);
    }

    /* access modifiers changed from: package-private */
    public int[] e() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f598a;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return k() && this.f598a != 0;
    }
}
