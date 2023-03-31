package androidx.appcompat.view.menu;

import a.a.j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z;

public class ActionMenuItemView extends z implements n.a, View.OnClickListener, ActionMenuView.a {
    i f;
    private CharSequence g;
    private Drawable h;
    g.b i;
    private h0 j;
    b k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;

    private class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.h0
        public p a() {
            b bVar = ActionMenuItemView.this.k;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.widget.h0
        public boolean b() {
            p a2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.i;
            return bVar != null && bVar.a(actionMenuItemView.f) && (a2 = a()) != null && a2.Q();
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.l = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionMenuItemView, i2, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.o = -1;
        setSaveEnabled(false);
    }

    private boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.g);
        if (this.h != null && (!this.f.n() || (!this.l && !this.m))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.g : null);
        CharSequence contentDescription = this.f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f.getTitle();
            }
            y0.a(this, charSequence);
            return;
        }
        y0.a(this, tooltipText);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void a(i iVar, int i2) {
        this.f = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.a(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.j == null) {
            this.j = new a();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return d();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean b() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return d() && this.f.getIcon() == null;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f;
    }

    public void onClick(View view) {
        g.b bVar = this.i;
        if (bVar != null) {
            bVar.a(this.f);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l = e();
        f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.z
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean d = d();
        if (d && (i4 = this.o) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.n) : this.n;
        if (mode != 1073741824 && this.n > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!d && this.h != null) {
            super.setPadding((getMeasuredWidth() - this.h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (!this.f.hasSubMenu() || (h0Var = this.j) == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.m != z) {
            this.m = z;
            i iVar = this.f;
            if (iVar != null) {
                iVar.b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.p;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            int i3 = this.p;
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
                intrinsicHeight = i3;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.i = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.o = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.g = charSequence;
        f();
    }
}
