package com.google.android.material.internal;

import a.g.l.d0.c;
import a.g.l.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.y0;
import b.c.b.b.d;
import b.c.b.b.e;
import b.c.b.b.f;
import b.c.b.b.h;

public class NavigationMenuItemView extends d implements n.a {
    private static final int[] G = {16842912};
    private FrameLayout A;
    private i B;
    private ColorStateList C;
    private boolean D;
    private Drawable E;
    private final a.g.l.a F;
    private int w;
    private boolean x;
    boolean y;
    private final CheckedTextView z;

    class a extends a.g.l.a {
        a() {
        }

        @Override // a.g.l.a
        public void a(View view, c cVar) {
            super.a(view, cVar);
            cVar.b(NavigationMenuItemView.this.y);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = new a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(h.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(f.design_menu_item_text);
        this.z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        u.a(this.z, this.F);
    }

    private void d() {
        int i;
        i0.a aVar;
        if (f()) {
            this.z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                aVar = (i0.a) frameLayout.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.z.setVisibility(0);
            FrameLayout frameLayout2 = this.A;
            if (frameLayout2 != null) {
                aVar = (i0.a) frameLayout2.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        ((ViewGroup.MarginLayoutParams) aVar).width = i;
        this.A.setLayoutParams(aVar);
    }

    private StateListDrawable e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.a.a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean f() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(f.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void a(i iVar, int i) {
        this.B = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            u.a(this, e());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        y0.a(this, iVar.getTooltipText());
        d();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        i iVar = this.B;
        if (iVar != null && iVar.isCheckable() && this.B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.y != z2) {
            this.y = z2;
            this.F.a(this.z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.z.setChecked(z2);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
                androidx.core.graphics.drawable.a.a(drawable, this.C);
            }
            int i = this.w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.x) {
            if (this.E == null) {
                Drawable a2 = a.g.d.c.f.a(getResources(), e.navigation_empty_icon, getContext().getTheme());
                this.E = a2;
                if (a2 != null) {
                    int i2 = this.w;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.E;
        }
        androidx.core.widget.i.a(this.z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.w = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        i iVar = this.B;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.x = z2;
    }

    public void setTextAppearance(int i) {
        androidx.core.widget.i.d(this.z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }
}
