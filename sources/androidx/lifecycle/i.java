package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class i extends e {

    /* renamed from: a  reason: collision with root package name */
    private a.b.a.b.a<g, b> f930a = new a.b.a.b.a<>();

    /* renamed from: b  reason: collision with root package name */
    private e.b f931b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<h> f932c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<e.b> g = new ArrayList<>();

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f933a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f934b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
            // Method dump skipped, instructions count: 142
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.i.a.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        e.b f935a;

        /* renamed from: b  reason: collision with root package name */
        f f936b;

        b(g gVar, e.b bVar) {
            this.f936b = k.a(gVar);
            this.f935a = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, e.a aVar) {
            e.b b2 = i.b(aVar);
            this.f935a = i.a(this.f935a, b2);
            this.f936b.a(hVar, aVar);
            this.f935a = b2;
        }
    }

    public i(h hVar) {
        this.f932c = new WeakReference<>(hVar);
        this.f931b = e.b.INITIALIZED;
    }

    static e.b a(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void a(h hVar) {
        Iterator<Map.Entry<g, b>> a2 = this.f930a.a();
        while (a2.hasNext() && !this.f) {
            Map.Entry<g, b> next = a2.next();
            b value = next.getValue();
            while (value.f935a.compareTo((Enum) this.f931b) > 0 && !this.f && this.f930a.contains(next.getKey())) {
                e.a c2 = c(value.f935a);
                e(b(c2));
                value.a(hVar, c2);
                c();
            }
        }
    }

    static e.b b(e.a aVar) {
        switch (a.f933a[aVar.ordinal()]) {
            case 1:
            case 2:
                return e.b.CREATED;
            case 3:
            case 4:
                return e.b.STARTED;
            case 5:
                return e.b.RESUMED;
            case 6:
                return e.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: a.b.a.b.a<androidx.lifecycle.g, androidx.lifecycle.i$b> */
    /* JADX WARN: Multi-variable type inference failed */
    private void b(h hVar) {
        a.b.a.b.b<K, V>.d d2 = this.f930a.d();
        while (d2.hasNext() && !this.f) {
            Map.Entry entry = (Map.Entry) d2.next();
            b bVar = (b) entry.getValue();
            while (bVar.f935a.compareTo((Enum) this.f931b) < 0 && !this.f && this.f930a.contains(entry.getKey())) {
                e(bVar.f935a);
                bVar.a(hVar, f(bVar.f935a));
                c();
            }
        }
    }

    private boolean b() {
        if (this.f930a.size() == 0) {
            return true;
        }
        e.b bVar = this.f930a.b().getValue().f935a;
        e.b bVar2 = this.f930a.e().getValue().f935a;
        return bVar == bVar2 && this.f931b == bVar2;
    }

    private static e.a c(e.b bVar) {
        int i = a.f934b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return e.a.ON_DESTROY;
        } else {
            if (i == 3) {
                return e.a.ON_STOP;
            }
            if (i == 4) {
                return e.a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    private e.b c(g gVar) {
        Map.Entry<g, b> b2 = this.f930a.b(gVar);
        e.b bVar = null;
        e.b bVar2 = b2 != null ? b2.getValue().f935a : null;
        if (!this.g.isEmpty()) {
            ArrayList<e.b> arrayList = this.g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.f931b, bVar2), bVar);
    }

    private void c() {
        ArrayList<e.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void d() {
        h hVar = this.f932c.get();
        if (hVar != null) {
            while (true) {
                boolean b2 = b();
                this.f = false;
                if (!b2) {
                    if (this.f931b.compareTo((Enum) this.f930a.b().getValue().f935a) < 0) {
                        a(hVar);
                    }
                    Map.Entry<g, b> e2 = this.f930a.e();
                    if (!this.f && e2 != null && this.f931b.compareTo((Enum) e2.getValue().f935a) > 0) {
                        b(hVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    private void d(e.b bVar) {
        if (this.f931b != bVar) {
            this.f931b = bVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            d();
            this.e = false;
        }
    }

    private void e(e.b bVar) {
        this.g.add(bVar);
    }

    private static e.a f(e.b bVar) {
        int i = a.f934b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return e.a.ON_START;
            }
            if (i == 3) {
                return e.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return e.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.e
    public e.b a() {
        return this.f931b;
    }

    public void a(e.a aVar) {
        d(b(aVar));
    }

    @Deprecated
    public void a(e.b bVar) {
        b(bVar);
    }

    @Override // androidx.lifecycle.e
    public void a(g gVar) {
        h hVar;
        e.b bVar = this.f931b;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        b bVar3 = new b(gVar, bVar2);
        if (this.f930a.b(gVar, bVar3) == null && (hVar = this.f932c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            e.b c2 = c(gVar);
            this.d++;
            while (bVar3.f935a.compareTo((Enum) c2) < 0 && this.f930a.contains(gVar)) {
                e(bVar3.f935a);
                bVar3.a(hVar, f(bVar3.f935a));
                c();
                c2 = c(gVar);
            }
            if (!z) {
                d();
            }
            this.d--;
        }
    }

    public void b(e.b bVar) {
        d(bVar);
    }

    @Override // androidx.lifecycle.e
    public void b(g gVar) {
        this.f930a.remove(gVar);
    }
}
