package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class e {
    private static e e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f5984a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f5985b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f5986c;
    private c d;

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e.this.a((c) message.obj);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
        void a(int i);
    }

    /* access modifiers changed from: private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<b> f5988a;

        /* renamed from: b  reason: collision with root package name */
        int f5989b;

        /* renamed from: c  reason: collision with root package name */
        boolean f5990c;

        /* access modifiers changed from: package-private */
        public boolean a(b bVar) {
            return bVar != null && this.f5988a.get() == bVar;
        }
    }

    private e() {
    }

    static e a() {
        if (e == null) {
            e = new e();
        }
        return e;
    }

    private boolean a(c cVar, int i) {
        b bVar = cVar.f5988a.get();
        if (bVar == null) {
            return false;
        }
        this.f5985b.removeCallbacksAndMessages(cVar);
        bVar.a(i);
        return true;
    }

    private void b(c cVar) {
        int i = cVar.f5989b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f5985b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f5985b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    private boolean c(b bVar) {
        c cVar = this.f5986c;
        return cVar != null && cVar.a(bVar);
    }

    public void a(b bVar) {
        synchronized (this.f5984a) {
            if (c(bVar) && !this.f5986c.f5990c) {
                this.f5986c.f5990c = true;
                this.f5985b.removeCallbacksAndMessages(this.f5986c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        synchronized (this.f5984a) {
            if (this.f5986c == cVar || this.d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public void b(b bVar) {
        synchronized (this.f5984a) {
            if (c(bVar) && this.f5986c.f5990c) {
                this.f5986c.f5990c = false;
                b(this.f5986c);
            }
        }
    }
}
