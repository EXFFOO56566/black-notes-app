package a.d.a;

import android.content.res.ColorStateList;

class c implements f {
    c() {
    }

    private g j(e eVar) {
        return (g) eVar.d();
    }

    @Override // a.d.a.f
    public float a(e eVar) {
        return j(eVar).b();
    }

    @Override // a.d.a.f
    public void a() {
    }

    @Override // a.d.a.f
    public void a(e eVar, float f) {
        j(eVar).a(f);
    }

    @Override // a.d.a.f
    public void a(e eVar, ColorStateList colorStateList) {
        j(eVar).a(colorStateList);
    }

    @Override // a.d.a.f
    public ColorStateList b(e eVar) {
        return j(eVar).a();
    }

    @Override // a.d.a.f
    public void b(e eVar, float f) {
        eVar.a().setElevation(f);
    }

    @Override // a.d.a.f
    public float c(e eVar) {
        return eVar.a().getElevation();
    }

    @Override // a.d.a.f
    public void c(e eVar, float f) {
        j(eVar).a(f, eVar.c(), eVar.b());
        i(eVar);
    }

    @Override // a.d.a.f
    public float d(e eVar) {
        return j(eVar).c();
    }

    @Override // a.d.a.f
    public float e(e eVar) {
        return d(eVar) * 2.0f;
    }

    @Override // a.d.a.f
    public float f(e eVar) {
        return d(eVar) * 2.0f;
    }

    @Override // a.d.a.f
    public void g(e eVar) {
        c(eVar, a(eVar));
    }

    @Override // a.d.a.f
    public void h(e eVar) {
        c(eVar, a(eVar));
    }

    public void i(e eVar) {
        if (!eVar.c()) {
            eVar.a(0, 0, 0, 0);
            return;
        }
        float a2 = a(eVar);
        float d = d(eVar);
        int ceil = (int) Math.ceil((double) h.a(a2, d, eVar.b()));
        int ceil2 = (int) Math.ceil((double) h.b(a2, d, eVar.b()));
        eVar.a(ceil, ceil2, ceil, ceil2);
    }
}
