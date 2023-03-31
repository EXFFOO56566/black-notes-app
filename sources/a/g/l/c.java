package a.g.l;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f204a;

    interface a {
        boolean a(MotionEvent motionEvent);
    }

    static class b implements a {
        private static final int v = ViewConfiguration.getLongPressTimeout();
        private static final int w = ViewConfiguration.getTapTimeout();
        private static final int x = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a  reason: collision with root package name */
        private int f205a;

        /* renamed from: b  reason: collision with root package name */
        private int f206b;

        /* renamed from: c  reason: collision with root package name */
        private int f207c;
        private int d;
        private final Handler e;
        final GestureDetector.OnGestureListener f;
        GestureDetector.OnDoubleTapListener g;
        boolean h;
        boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        MotionEvent m;
        private MotionEvent n;
        private boolean o;
        private float p;
        private float q;
        private float r;
        private float s;
        private boolean t;
        private VelocityTracker u;

        private class a extends Handler {
            a() {
            }

            a(Handler handler) {
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    b bVar = b.this;
                    bVar.f.onShowPress(bVar.m);
                } else if (i == 2) {
                    b.this.a();
                } else if (i == 3) {
                    b bVar2 = b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.m);
                    } else {
                        bVar2.i = true;
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }
        }

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.e = new a(handler);
            } else {
                this.e = new a();
            }
            this.f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                a((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            a(context);
        }

        private void a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f != null) {
                this.t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f207c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f205a = scaledTouchSlop * scaledTouchSlop;
                this.f206b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        private boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) x)) {
                return false;
            }
            int x2 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x2 * x2) + (y * y) < this.f206b;
        }

        private void b() {
            this.e.removeMessages(1);
            this.e.removeMessages(2);
            this.e.removeMessages(3);
            this.u.recycle();
            this.u = null;
            this.o = false;
            this.h = false;
            this.k = false;
            this.l = false;
            this.i = false;
            if (this.j) {
                this.j = false;
            }
        }

        private void c() {
            this.e.removeMessages(1);
            this.e.removeMessages(2);
            this.e.removeMessages(3);
            this.o = false;
            this.k = false;
            this.l = false;
            this.i = false;
            if (this.j) {
                this.j = false;
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.e.removeMessages(3);
            this.i = false;
            this.j = true;
            this.f.onLongPress(this.m);
        }

        public void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.g = onDoubleTapListener;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
        @Override // a.g.l.c.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.view.MotionEvent r13) {
            /*
            // Method dump skipped, instructions count: 591
            */
            throw new UnsupportedOperationException("Method not decompiled: a.g.l.c.b.a(android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: a.g.l.c$c  reason: collision with other inner class name */
    static class C0018c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final GestureDetector f209a;

        C0018c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f209a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // a.g.l.c.a
        public boolean a(MotionEvent motionEvent) {
            return this.f209a.onTouchEvent(motionEvent);
        }
    }

    public c(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f204a = Build.VERSION.SDK_INT > 17 ? new C0018c(context, onGestureListener, handler) : new b(context, onGestureListener, handler);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f204a.a(motionEvent);
    }
}
