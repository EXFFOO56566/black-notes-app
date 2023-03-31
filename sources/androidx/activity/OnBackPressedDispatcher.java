package androidx.activity;

import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f412a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<b> f413b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements f, a {

        /* renamed from: a  reason: collision with root package name */
        private final e f414a;

        /* renamed from: b  reason: collision with root package name */
        private final b f415b;

        /* renamed from: c  reason: collision with root package name */
        private a f416c;

        LifecycleOnBackPressedCancellable(e eVar, b bVar) {
            this.f414a = eVar;
            this.f415b = bVar;
            eVar.a(this);
        }

        @Override // androidx.lifecycle.f
        public void a(h hVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                this.f416c = OnBackPressedDispatcher.this.a(this.f415b);
            } else if (aVar == e.a.ON_STOP) {
                a aVar2 = this.f416c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == e.a.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f414a.b(this);
            this.f415b.b(this);
            a aVar = this.f416c;
            if (aVar != null) {
                aVar.cancel();
                this.f416c = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public class a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final b f417a;

        a(b bVar) {
            this.f417a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f413b.remove(this.f417a);
            this.f417a.b(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f412a = runnable;
    }

    /* access modifiers changed from: package-private */
    public a a(b bVar) {
        this.f413b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void a() {
        Iterator<b> descendingIterator = this.f413b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.b()) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f412a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(h hVar, b bVar) {
        e a2 = hVar.a();
        if (a2.a() != e.b.DESTROYED) {
            bVar.a(new LifecycleOnBackPressedCancellable(a2, bVar));
        }
    }
}
