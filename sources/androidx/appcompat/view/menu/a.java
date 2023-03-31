package androidx.appcompat.view.menu;

import a.g.f.a.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final int f501a;

    /* renamed from: b  reason: collision with root package name */
    private final int f502b;

    /* renamed from: c  reason: collision with root package name */
    private final int f503c;
    private CharSequence d;
    private CharSequence e;
    private Intent f;
    private char g;
    private int h = 4096;
    private char i;
    private int j = 4096;
    private Drawable k;
    private Context l;
    private CharSequence m;
    private CharSequence n;
    private ColorStateList o = null;
    private PorterDuff.Mode p = null;
    private boolean q = false;
    private boolean r = false;
    private int s = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.l = context;
        this.f501a = i3;
        this.f502b = i2;
        this.f503c = i5;
        this.d = charSequence;
    }

    private void b() {
        if (this.k == null) {
            return;
        }
        if (this.q || this.r) {
            Drawable i2 = androidx.core.graphics.drawable.a.i(this.k);
            this.k = i2;
            Drawable mutate = i2.mutate();
            this.k = mutate;
            if (this.q) {
                androidx.core.graphics.drawable.a.a(mutate, this.o);
            }
            if (this.r) {
                androidx.core.graphics.drawable.a.a(this.k, this.p);
            }
        }
    }

    @Override // a.g.f.a.b
    public b a(a.g.l.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // a.g.f.a.b
    public a.g.l.b a() {
        return null;
    }

    @Override // a.g.f.a.b
    public boolean collapseActionView() {
        return false;
    }

    @Override // a.g.f.a.b
    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // a.g.f.a.b
    public View getActionView() {
        return null;
    }

    @Override // a.g.f.a.b
    public int getAlphabeticModifiers() {
        return this.j;
    }

    public char getAlphabeticShortcut() {
        return this.i;
    }

    @Override // a.g.f.a.b
    public CharSequence getContentDescription() {
        return this.m;
    }

    public int getGroupId() {
        return this.f502b;
    }

    public Drawable getIcon() {
        return this.k;
    }

    @Override // a.g.f.a.b
    public ColorStateList getIconTintList() {
        return this.o;
    }

    @Override // a.g.f.a.b
    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    public Intent getIntent() {
        return this.f;
    }

    public int getItemId() {
        return this.f501a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a.g.f.a.b
    public int getNumericModifiers() {
        return this.h;
    }

    public char getNumericShortcut() {
        return this.g;
    }

    public int getOrder() {
        return this.f503c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.e;
        return charSequence != null ? charSequence : this.d;
    }

    @Override // a.g.f.a.b
    public CharSequence getTooltipText() {
        return this.n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    @Override // a.g.f.a.b
    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public b setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // a.g.f.a.b, android.view.MenuItem
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.i = Character.toLowerCase(c2);
        return this;
    }

    @Override // a.g.f.a.b
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.i = Character.toLowerCase(c2);
        this.j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.s = (z ? 1 : 0) | (this.s & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & -3);
        return this;
    }

    @Override // a.g.f.a.b
    public b setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & -17);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.k = a.g.d.a.c(this.l, i2);
        b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.k = drawable;
        b();
        return this;
    }

    @Override // a.g.f.a.b
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        this.q = true;
        b();
        return this;
    }

    @Override // a.g.f.a.b
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.g = c2;
        return this;
    }

    @Override // a.g.f.a.b
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.g = c2;
        this.h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.g = c2;
        this.i = Character.toLowerCase(c3);
        return this;
    }

    @Override // a.g.f.a.b
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.g = c2;
        this.h = KeyEvent.normalizeMetaState(i2);
        this.i = Character.toLowerCase(c3);
        this.j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // a.g.f.a.b
    public void setShowAsAction(int i2) {
    }

    @Override // a.g.f.a.b
    public b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.d = this.l.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    @Override // a.g.f.a.b
    public b setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.s & 8;
        if (z) {
            i2 = 0;
        }
        this.s = i3 | i2;
        return this;
    }
}
