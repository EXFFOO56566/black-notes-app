package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.lf2;
import java.io.IOException;

/* access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
public final class if2<T extends lf2> extends sk1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final T f3074b;

    /* renamed from: c  reason: collision with root package name */
    private final jf2<T> f3075c;
    public final int d;
    private final long e;
    private IOException f;
    private int g;
    private volatile Thread h;
    private volatile boolean i;
    private final /* synthetic */ gf2 j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public if2(gf2 gf2, Looper looper, T t, jf2<T> jf2, int i2, long j2) {
        super(looper);
        this.j = gf2;
        this.f3074b = t;
        this.f3075c = jf2;
        this.d = i2;
        this.e = j2;
    }

    private final void a() {
        this.f = null;
        this.j.f2750a.execute(this.j.f2751b);
    }

    private final void b() {
        this.j.f2751b = null;
    }

    public final void a(int i2) {
        IOException iOException = this.f;
        if (iOException != null && this.g > i2) {
            throw iOException;
        }
    }

    public final void a(long j2) {
        mf2.b(this.j.f2751b == null);
        this.j.f2751b = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            a();
        }
    }

    public final void a(boolean z) {
        this.i = z;
        this.f = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f3074b.b();
            if (this.h != null) {
                this.h.interrupt();
            }
        }
        if (z) {
            b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f3075c.a((lf2) this.f3074b, elapsedRealtime, elapsedRealtime - this.e, true);
        }
    }

    public final void handleMessage(Message message) {
        if (!this.i) {
            int i2 = message.what;
            if (i2 == 0) {
                a();
            } else if (i2 != 4) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.e;
                if (this.f3074b.a()) {
                    this.f3075c.a((lf2) this.f3074b, elapsedRealtime, j2, false);
                    return;
                }
                int i3 = message.what;
                if (i3 == 1) {
                    this.f3075c.a((lf2) this.f3074b, elapsedRealtime, j2, false);
                } else if (i3 == 2) {
                    this.f3075c.a(this.f3074b, elapsedRealtime, j2);
                } else if (i3 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f = iOException;
                    int a2 = this.f3075c.a(this.f3074b, elapsedRealtime, j2, iOException);
                    if (a2 == 3) {
                        this.j.f2752c = this.f;
                    } else if (a2 != 2) {
                        int i4 = a2 == 1 ? 1 : this.g + 1;
                        this.g = i4;
                        a((long) Math.min((i4 - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        try {
            this.h = Thread.currentThread();
            if (!this.f3074b.a()) {
                String valueOf = String.valueOf(this.f3074b.getClass().getSimpleName());
                bg2.a(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                try {
                    this.f3074b.c();
                } finally {
                    bg2.a();
                }
            }
            if (!this.i) {
                sendEmptyMessage(2);
            }
        } catch (IOException e2) {
            if (!this.i) {
                obtainMessage(3, e2).sendToTarget();
            }
        } catch (InterruptedException unused) {
            mf2.b(this.f3074b.a());
            if (!this.i) {
                sendEmptyMessage(2);
            }
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (!this.i) {
                obtainMessage(3, new kf2(e3)).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (!this.i) {
                obtainMessage(3, new kf2(e4)).sendToTarget();
            }
        } catch (Error e5) {
            Log.e("LoadTask", "Unexpected error loading stream", e5);
            if (!this.i) {
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        }
    }
}
