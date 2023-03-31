package androidx.appcompat.widget;

import a.a.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class i0 extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private boolean f637b;

    /* renamed from: c  reason: collision with root package name */
    private int f638c;
    private int d;
    private int e;
    private int f;
    private int g;
    private float h;
    private boolean i;
    private int[] j;
    private int[] k;
    private Drawable l;
    private int m;
    private int n;
    private int o;
    private int p;

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public float f639a;

        /* renamed from: b  reason: collision with root package name */
        public int f640b;

        public a(int i, int i2) {
            super(i, i2);
            this.f640b = -1;
            this.f639a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f640b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.LinearLayoutCompat_Layout);
            this.f639a = obtainStyledAttributes.getFloat(j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f640b = obtainStyledAttributes.getInt(j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f640b = -1;
        }
    }

    public i0(Context context) {
        this(context, null);
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f637b = true;
        this.f638c = -1;
        this.d = 0;
        this.f = 8388659;
        w0 a2 = w0.a(context, attributeSet, j.LinearLayoutCompat, i2, 0);
        int d2 = a2.d(j.LinearLayoutCompat_android_orientation, -1);
        if (d2 >= 0) {
            setOrientation(d2);
        }
        int d3 = a2.d(j.LinearLayoutCompat_android_gravity, -1);
        if (d3 >= 0) {
            setGravity(d3);
        }
        boolean a3 = a2.a(j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a3) {
            setBaselineAligned(a3);
        }
        this.h = a2.b(j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f638c = a2.d(j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.i = a2.a(j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a2.b(j.LinearLayoutCompat_divider));
        this.o = a2.d(j.LinearLayoutCompat_showDividers, 0);
        this.p = a2.c(j.LinearLayoutCompat_dividerPadding, 0);
        a2.a();
    }

    private void a(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    private void c(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View a2 = a(i4);
            if (a2.getVisibility() != 8) {
                a aVar = (a) a2.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = a2.getMeasuredWidth();
                    measureChildWithMargins(a2, i3, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i5;
                }
            }
        }
    }

    private void d(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View a2 = a(i4);
            if (a2.getVisibility() != 8) {
                a aVar = (a) a2.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = a2.getMeasuredHeight();
                    measureChildWithMargins(a2, makeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int a(View view, int i2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public View a(int i2) {
        return getChildAt(i2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a3, code lost:
        if (r8 > 0) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ae, code lost:
        if (r8 < 0) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b0, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b1, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & -16777216);
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r38, int r39) {
        /*
        // Method dump skipped, instructions count: 1271
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.a(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r25, int r26, int r27, int r28) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.a(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean a2 = c1.a(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View a3 = a(i5);
            if (!(a3 == null || a3.getVisibility() == 8 || !b(i5))) {
                a aVar = (a) a3.getLayoutParams();
                b(canvas, a2 ? a3.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (a3.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.m);
            }
        }
        if (b(virtualChildCount)) {
            View a4 = a(virtualChildCount - 1);
            if (a4 != null) {
                a aVar2 = (a) a4.getLayoutParams();
                if (a2) {
                    i4 = a4.getLeft();
                    i3 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                } else {
                    i2 = a4.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                    b(canvas, i2);
                }
            } else if (a2) {
                i2 = getPaddingLeft();
                b(canvas, i2);
            } else {
                i4 = getWidth();
                i3 = getPaddingRight();
            }
            i2 = (i4 - i3) - this.m;
            b(canvas, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas, int i2) {
        this.l.setBounds(getPaddingLeft() + this.p, i2, (getWidth() - getPaddingRight()) - this.p, this.n + i2);
        this.l.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* access modifiers changed from: package-private */
    public int b(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d0, code lost:
        if (r15 > 0) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02db, code lost:
        if (r15 < 0) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02dd, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02de, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & -256);
        r0 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x031b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(int r34, int r35) {
        /*
        // Method dump skipped, instructions count: 903
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.b(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(int r18, int r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.b(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public void b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View a2 = a(i2);
            if (!(a2 == null || a2.getVisibility() == 8 || !b(i2))) {
                a(canvas, (a2.getTop() - ((ViewGroup.MarginLayoutParams) ((a) a2.getLayoutParams())).topMargin) - this.n);
            }
        }
        if (b(virtualChildCount)) {
            View a3 = a(virtualChildCount - 1);
            a(canvas, a3 == null ? (getHeight() - getPaddingBottom()) - this.n : a3.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) a3.getLayoutParams())).bottomMargin);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Canvas canvas, int i2) {
        this.l.setBounds(i2, getPaddingTop() + this.p, this.m + i2, (getHeight() - getPaddingBottom()) - this.p);
        this.l.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean b(int i2) {
        if (i2 == 0) {
            return (this.o & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.o & 4) != 0;
        }
        if ((this.o & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int c(int i2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* access modifiers changed from: protected */
    public a generateDefaultLayoutParams() {
        int i2 = this.e;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getBaseline() {
        int i2;
        if (this.f638c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f638c;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.d;
                if (this.e == 1 && (i2 = this.f & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.g) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.g;
                    }
                }
                return i4 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.f638c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f638c;
    }

    public Drawable getDividerDrawable() {
        return this.l;
    }

    public int getDividerPadding() {
        return this.p;
    }

    public int getDividerWidth() {
        return this.m;
    }

    public int getGravity() {
        return this.f;
    }

    public int getOrientation() {
        return this.e;
    }

    public int getShowDividers() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.l != null) {
            if (this.e == 1) {
                b(canvas);
            } else {
                a(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.e == 1) {
            b(i2, i3, i4, i5);
        } else {
            a(i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.e == 1) {
            b(i2, i3);
        } else {
            a(i2, i3);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f637b = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f638c = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.l) {
            this.l = drawable;
            boolean z = false;
            if (drawable != null) {
                this.m = drawable.getIntrinsicWidth();
                this.n = drawable.getIntrinsicHeight();
            } else {
                this.m = 0;
                this.n = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.p = i2;
    }

    public void setGravity(int i2) {
        if (this.f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f;
        if ((8388615 & i4) != i3) {
            this.f = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.i = z;
    }

    public void setOrientation(int i2) {
        if (this.e != i2) {
            this.e = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.o) {
            requestLayout();
        }
        this.o = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f;
        if ((i4 & 112) != i3) {
            this.f = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.h = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
