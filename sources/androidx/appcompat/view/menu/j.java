package androidx.appcompat.view.menu;

import a.g.l.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class j extends c implements MenuItem {
    private final a.g.f.a.b d;
    private Method e;

    private class a extends a.g.l.b {

        /* renamed from: b  reason: collision with root package name */
        final ActionProvider f533b;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f533b = actionProvider;
        }

        @Override // a.g.l.b
        public void a(SubMenu subMenu) {
            this.f533b.onPrepareSubMenu(j.this.a(subMenu));
        }

        @Override // a.g.l.b
        public boolean a() {
            return this.f533b.hasSubMenu();
        }

        @Override // a.g.l.b
        public View c() {
            return this.f533b.onCreateActionView();
        }

        @Override // a.g.l.b
        public boolean d() {
            return this.f533b.onPerformDefaultAction();
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {
        private b.AbstractC0017b d;

        b(j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // a.g.l.b
        public View a(MenuItem menuItem) {
            return this.f533b.onCreateActionView(menuItem);
        }

        @Override // a.g.l.b
        public void a(b.AbstractC0017b bVar) {
            this.d = bVar;
            this.f533b.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // a.g.l.b
        public boolean b() {
            return this.f533b.isVisible();
        }

        @Override // a.g.l.b
        public boolean e() {
            return this.f533b.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            b.AbstractC0017b bVar = this.d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    static class c extends FrameLayout implements a.a.n.c {

        /* renamed from: b  reason: collision with root package name */
        final CollapsibleActionView f535b;

        c(View view) {
            super(view.getContext());
            this.f535b = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // a.a.n.c
        public void a() {
            this.f535b.onActionViewExpanded();
        }

        /* access modifiers changed from: package-private */
        public View b() {
            return (View) this.f535b;
        }

        @Override // a.a.n.c
        public void c() {
            this.f535b.onActionViewCollapsed();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f536a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f536a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f536a.onMenuItemActionCollapse(j.this.a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f536a.onMenuItemActionExpand(j.this.a(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f538a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f538a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f538a.onMenuItemClick(j.this.a(menuItem));
        }
    }

    public j(Context context, a.g.f.a.b bVar) {
        super(context);
        if (bVar != null) {
            this.d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public void a(boolean z) {
        try {
            if (this.e == null) {
                this.e = this.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.e.invoke(this.d, Boolean.valueOf(z));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    public boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        a.g.l.b a2 = this.d.a();
        if (a2 instanceof a) {
            return ((a) a2).f533b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.d.getActionView();
        return actionView instanceof c ? ((c) actionView).b() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    public int getGroupId() {
        return this.d.getGroupId();
    }

    public Drawable getIcon() {
        return this.d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.d.getIntent();
    }

    public int getItemId() {
        return this.d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    public int getOrder() {
        return this.d.getOrder();
    }

    public SubMenu getSubMenu() {
        return a(this.d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.d.isCheckable();
    }

    public boolean isChecked() {
        return this.d.isChecked();
    }

    public boolean isEnabled() {
        return this.d.isEnabled();
    }

    public boolean isVisible() {
        return this.d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a.g.l.b bVar = Build.VERSION.SDK_INT >= 16 ? new b(this, this.f506a, actionProvider) : new a(this.f506a, actionProvider);
        a.g.f.a.b bVar2 = this.d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.d.setActionView(i);
        View actionView = this.d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.d.setAlphabeticShortcut(c2, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i) {
        this.d.setNumericShortcut(c2, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.d.setShortcut(c2, c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.d.setShortcut(c2, c3, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.d.setVisible(z);
    }
}
