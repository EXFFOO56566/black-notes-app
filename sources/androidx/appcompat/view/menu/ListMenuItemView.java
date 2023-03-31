package androidx.appcompat.view.menu;

import a.a.a;
import a.a.f;
import a.a.g;
import a.a.j;
import a.g.l.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.w0;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b  reason: collision with root package name */
    private i f499b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f500c;
    private RadioButton d;
    private TextView e;
    private CheckBox f;
    private TextView g;
    private ImageView h;
    private ImageView i;
    private LinearLayout j;
    private Drawable k;
    private int l;
    private Context m;
    private boolean n;
    private Drawable o;
    private boolean p;
    private LayoutInflater q;
    private boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        w0 a2 = w0.a(getContext(), attributeSet, j.MenuView, i2, 0);
        this.k = a2.b(j.MenuView_android_itemBackground);
        this.l = a2.g(j.MenuView_android_itemTextAppearance, -1);
        this.n = a2.a(j.MenuView_preserveIconSpacing, false);
        this.m = context;
        this.o = a2.b(j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.p = obtainStyledAttributes.hasValue(0);
        a2.a();
        obtainStyledAttributes.recycle();
    }

    private void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f = checkBox;
        a(checkBox);
    }

    private void a(View view) {
        a(view, -1);
    }

    private void a(View view, int i2) {
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void c() {
        ImageView imageView = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f500c = imageView;
        a(imageView, 0);
    }

    private void d() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.d = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void a(i iVar, int i2) {
        this.f499b = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.a(this));
        setCheckable(iVar.isCheckable());
        a(iVar.m(), iVar.d());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public void a(boolean z, char c2) {
        int i2 = (!z || !this.f499b.m()) ? 8 : 0;
        if (i2 == 0) {
            this.g.setText(this.f499b.e());
        }
        if (this.g.getVisibility() != i2) {
            this.g.setVisibility(i2);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
            rect.top += this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f499b;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        u.a(this, this.k);
        TextView textView = (TextView) findViewById(f.title);
        this.e = textView;
        int i2 = this.l;
        if (i2 != -1) {
            textView.setTextAppearance(this.m, i2);
        }
        this.g = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(f.group_divider);
        this.j = (LinearLayout) findViewById(f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f500c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f500c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.d != null || this.f != null) {
            if (this.f499b.i()) {
                if (this.d == null) {
                    d();
                }
                compoundButton2 = this.d;
                compoundButton = this.f;
            } else {
                if (this.f == null) {
                    a();
                }
                compoundButton2 = this.f;
                compoundButton = this.d;
            }
            if (z) {
                compoundButton2.setChecked(this.f499b.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f499b.i()) {
            if (this.d == null) {
                d();
            }
            compoundButton = this.d;
        } else {
            if (this.f == null) {
                a();
            }
            compoundButton = this.f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f499b.l() || this.r;
        if (!z && !this.n) {
            return;
        }
        if (this.f500c != null || drawable != null || this.n) {
            if (this.f500c == null) {
                c();
            }
            if (drawable != null || this.n) {
                ImageView imageView = this.f500c;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f500c.getVisibility() != 0) {
                    this.f500c.setVisibility(0);
                    return;
                }
                return;
            }
            this.f500c.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.e.setText(charSequence);
            if (this.e.getVisibility() != 0) {
                textView = this.e;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.e.getVisibility() != 8) {
                textView = this.e;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }
}
