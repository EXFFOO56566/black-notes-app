package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public abstract class e {

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean a(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public e() {
        new AtomicReference();
    }

    public abstract b a();

    public abstract void a(g gVar);

    public abstract void b(g gVar);
}
