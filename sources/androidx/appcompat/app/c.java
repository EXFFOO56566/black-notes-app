package androidx.appcompat.app;

import a.a.n.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.b1;
import androidx.core.app.a;
import androidx.core.app.f;
import androidx.core.app.m;
import androidx.fragment.app.d;

public class c extends d implements d, m.a {
    private e q;
    private Resources r;

    private boolean a(int i, KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.d
    public b a(b.a aVar) {
        return null;
    }

    @Override // androidx.appcompat.app.d
    public void a(b bVar) {
    }

    public void a(Intent intent) {
        f.a(this, intent);
    }

    public void a(m mVar) {
        mVar.a((Activity) this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k().a(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        k().a(context);
    }

    /* access modifiers changed from: protected */
    public void b(int i) {
    }

    @Override // androidx.appcompat.app.d
    public void b(b bVar) {
    }

    public void b(m mVar) {
    }

    public boolean b(Intent intent) {
        return f.b(this, intent);
    }

    public void closeOptionsMenu() {
        a l = l();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (l == null || !l.e()) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.m.a
    public Intent d() {
        return f.a(this);
    }

    @Override // androidx.core.app.e
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a l = l();
        if (keyCode != 82 || l == null || !l.a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) k().a(i);
    }

    public MenuInflater getMenuInflater() {
        return k().b();
    }

    public Resources getResources() {
        if (this.r == null && b1.b()) {
            this.r = new b1(this, super.getResources());
        }
        Resources resources = this.r;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        k().e();
    }

    @Override // androidx.fragment.app.d
    public void j() {
        k().e();
    }

    public e k() {
        if (this.q == null) {
            this.q = e.a(this, this);
        }
        return this.q;
    }

    public a l() {
        return k().c();
    }

    @Deprecated
    public void m() {
    }

    public boolean n() {
        Intent d = d();
        if (d == null) {
            return false;
        }
        if (b(d)) {
            m a2 = m.a((Context) this);
            a(a2);
            b(a2);
            a2.a();
            try {
                a.a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            a(d);
            return true;
        }
    }

    @Override // androidx.fragment.app.d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.r != null) {
            this.r.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        k().a(configuration);
    }

    public void onContentChanged() {
        m();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onCreate(Bundle bundle) {
        e k = k();
        k.d();
        k.a(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onDestroy() {
        super.onDestroy();
        k().f();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.d
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a l = l();
        if (menuItem.getItemId() != 16908332 || l == null || (l.g() & 4) == 0) {
            return false;
        }
        return n();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.d
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        k().b(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onPostResume() {
        super.onPostResume();
        k().g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k().c(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onStart() {
        super.onStart();
        k().h();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onStop() {
        super.onStop();
        k().i();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        k().a(charSequence);
    }

    public void openOptionsMenu() {
        a l = l();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (l == null || !l.l()) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        k().c(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        k().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k().b(view, layoutParams);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i) {
        super.setTheme(i);
        k().d(i);
    }
}
