package androidx.lifecycle;

import androidx.lifecycle.e;

/* access modifiers changed from: package-private */
public class FullLifecycleObserverAdapter implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f907a;

    /* renamed from: b  reason: collision with root package name */
    private final f f908b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f909a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.e$a[] r0 = androidx.lifecycle.e.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.FullLifecycleObserverAdapter.a.f909a = r0
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.f909a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.f909a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.f909a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.f909a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.f909a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.f909a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(b bVar, f fVar) {
        this.f907a = bVar;
        this.f908b = fVar;
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar, e.a aVar) {
        switch (a.f909a[aVar.ordinal()]) {
            case 1:
                this.f907a.c(hVar);
                break;
            case 2:
                this.f907a.e(hVar);
                break;
            case 3:
                this.f907a.a(hVar);
                break;
            case 4:
                this.f907a.d(hVar);
                break;
            case 5:
                this.f907a.f(hVar);
                break;
            case 6:
                this.f907a.b(hVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        f fVar = this.f908b;
        if (fVar != null) {
            fVar.a(hVar, aVar);
        }
    }
}
