package androidx.core.app;

import a.e.g;
import a.g.l.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.e;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.p;

public class e extends Activity implements h, e.a {

    /* renamed from: b  reason: collision with root package name */
    private i f776b = new i(this);

    public e() {
        new g();
    }

    @Override // a.g.l.e.a
    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a.g.l.e.a(decorView, keyEvent)) {
            return a.g.l.e.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a.g.l.e.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.a(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f776b.a(e.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
