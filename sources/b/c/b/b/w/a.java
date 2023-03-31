package b.c.b.b.w;

import android.graphics.Typeface;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f1286a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0065a f1287b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1288c;

    /* renamed from: b.c.b.b.w.a$a  reason: collision with other inner class name */
    public interface AbstractC0065a {
        void a(Typeface typeface);
    }

    public a(AbstractC0065a aVar, Typeface typeface) {
        this.f1286a = typeface;
        this.f1287b = aVar;
    }

    private void a(Typeface typeface) {
        if (!this.f1288c) {
            this.f1287b.a(typeface);
        }
    }

    public void a() {
        this.f1288c = true;
    }

    @Override // b.c.b.b.w.f
    public void a(int i) {
        a(this.f1286a);
    }

    @Override // b.c.b.b.w.f
    public void a(Typeface typeface, boolean z) {
        a(typeface);
    }
}
