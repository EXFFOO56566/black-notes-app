package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f940a = new HashMap();

    private static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Map<String, Object> map = this.f940a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f940a.values()) {
                    a(obj);
                }
            }
        }
        b();
    }

    /* access modifiers changed from: protected */
    public void b() {
    }
}
