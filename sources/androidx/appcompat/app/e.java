package androidx.appcompat.app;

import a.e.b;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class e {

    /* renamed from: b  reason: collision with root package name */
    private static int f452b = -100;

    /* renamed from: c  reason: collision with root package name */
    private static final b<WeakReference<e>> f453c = new b<>();
    private static final Object d = new Object();

    e() {
    }

    public static e a(Activity activity, d dVar) {
        return new f(activity, dVar);
    }

    public static e a(Dialog dialog, d dVar) {
        return new f(dialog, dVar);
    }

    static void a(e eVar) {
        synchronized (d) {
            c(eVar);
            f453c.add(new WeakReference<>(eVar));
        }
    }

    static void b(e eVar) {
        synchronized (d) {
            c(eVar);
        }
    }

    private static void c(e eVar) {
        synchronized (d) {
            Iterator<WeakReference<e>> it = f453c.iterator();
            while (it.hasNext()) {
                e eVar2 = it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static int j() {
        return f452b;
    }

    public int a() {
        return -100;
    }

    public abstract <T extends View> T a(int i);

    public void a(Context context) {
    }

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean b(int i);

    public abstract a c();

    public abstract void c(int i);

    public abstract void c(Bundle bundle);

    public abstract void d();

    public void d(int i) {
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();
}
