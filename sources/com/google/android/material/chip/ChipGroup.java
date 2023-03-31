package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import b.c.b.b.j;
import b.c.b.b.k;
import com.google.android.material.internal.g;

public class ChipGroup extends com.google.android.material.internal.c {
    private int e;
    private int f;
    private boolean g;
    private d h;
    private final b i;
    private e j;
    private int k;
    private boolean l;

    /* access modifiers changed from: private */
    public class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.l) {
                int id = compoundButton.getId();
                if (z) {
                    if (!(ChipGroup.this.k == -1 || ChipGroup.this.k == id || !ChipGroup.this.g)) {
                        ChipGroup chipGroup = ChipGroup.this;
                        chipGroup.a((ChipGroup) chipGroup.k, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                } else if (ChipGroup.this.k == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, int i);
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f5888b;

        private e() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.i);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f5888b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f5888b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.b.b.b.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = new b();
        this.j = new e();
        this.k = -1;
        this.l = false;
        TypedArray c2 = g.c(context, attributeSet, k.ChipGroup, i2, j.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = c2.getDimensionPixelOffset(k.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(c2.getDimensionPixelOffset(k.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(c2.getDimensionPixelOffset(k.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(c2.getBoolean(k.ChipGroup_singleLine, false));
        setSingleSelection(c2.getBoolean(k.ChipGroup_singleSelection, false));
        int resourceId = c2.getResourceId(k.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.k = resourceId;
        }
        c2.recycle();
        super.setOnHierarchyChangeListener(this.j);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.l = true;
            ((Chip) findViewById).setChecked(z);
            this.l = false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCheckedId(int i2) {
        this.k = i2;
        d dVar = this.h;
        if (dVar != null && this.g) {
            dVar.a(this, i2);
        }
    }

    @Override // com.google.android.material.internal.c
    public boolean a() {
        return super.a();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.k;
                if (i3 != -1 && this.g) {
                    a(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    public void b() {
        this.l = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.l = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.g) {
            return this.k;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.e;
    }

    public int getChipSpacingVertical() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.k;
        if (i2 != -1) {
            a(i2, true);
            setCheckedId(this.k);
        }
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.e != i2) {
            this.e = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.f != i2) {
            this.f = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.h = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.f5888b = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    @Override // com.google.android.material.internal.c
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z) {
        if (this.g != z) {
            this.g = z;
            b();
        }
    }
}
