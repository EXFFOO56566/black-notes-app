package b.c.b.a.h;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f1223a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final Executor f1224b = new t();

    private static final class a implements Executor {

        /* renamed from: b  reason: collision with root package name */
        private final Handler f1225b = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f1225b.post(runnable);
        }
    }
}
