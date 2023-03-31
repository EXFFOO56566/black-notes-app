package androidx.appcompat.app;

import a.a.n.b;
import a.g.l.e;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

public class g extends Dialog implements d {

    /* renamed from: b  reason: collision with root package name */
    private e f476b;

    /* renamed from: c  reason: collision with root package name */
    private final e.a f477c = new a();

    class a implements e.a {
        a() {
        }

        @Override // a.g.l.e.a
        public boolean a(KeyEvent keyEvent) {
            return g.this.a(keyEvent);
        }
    }

    public g(Context context, int i) {
        super(context, a(context, i));
        e a2 = a();
        a2.d(a(context, i));
        a2.a((Bundle) null);
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.a.a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.d
    public b a(b.a aVar) {
        return null;
    }

    public e a() {
        if (this.f476b == null) {
            this.f476b = e.a(this, this);
        }
        return this.f476b;
    }

    @Override // androidx.appcompat.app.d
    public void a(b bVar) {
    }

    public boolean a(int i) {
        return a().b(i);
    }

    /* access modifiers changed from: package-private */
    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // androidx.appcompat.app.d
    public void b(b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.a(this.f477c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().a(i);
    }

    public void invalidateOptionsMenu() {
        a().e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a().d();
        super.onCreate(bundle);
        a().a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        a().i();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().c(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }
}
