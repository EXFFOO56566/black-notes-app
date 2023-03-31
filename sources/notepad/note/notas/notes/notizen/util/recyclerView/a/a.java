package notepad.note.notas.notes.notizen.util.recyclerView.a;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;

public class a extends f.AbstractC0052f {
    private final c d;

    public a(c cVar) {
        this.d = cVar;
    }

    @Override // androidx.recyclerview.widget.f.AbstractC0052f
    public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        if (i == 1) {
            d0Var.f966b.setAlpha(1.0f - (Math.abs(f) / ((float) d0Var.f966b.getWidth())));
            d0Var.f966b.setTranslationX(f);
            return;
        }
        super.a(canvas, recyclerView, d0Var, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.f.AbstractC0052f
    public void a(RecyclerView.d0 d0Var, int i) {
        if (i != 0 && (d0Var instanceof d)) {
            ((d) d0Var).b();
        }
        super.a(d0Var, i);
    }

    @Override // androidx.recyclerview.widget.f.AbstractC0052f
    public void a(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        super.a(recyclerView, d0Var);
        d0Var.f966b.setAlpha(1.0f);
        if (d0Var instanceof d) {
            ((d) d0Var).a();
        }
    }

    @Override // androidx.recyclerview.widget.f.AbstractC0052f
    public void b(RecyclerView.d0 d0Var, int i) {
        this.d.a(d0Var.h());
    }

    @Override // androidx.recyclerview.widget.f.AbstractC0052f
    public boolean b() {
        return false;
    }

    @Override // androidx.recyclerview.widget.f.AbstractC0052f
    public boolean b(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
        if (d0Var.j() != d0Var2.j()) {
            return false;
        }
        this.d.a(d0Var.h(), d0Var2.h());
        return true;
    }

    @Override // androidx.recyclerview.widget.f.AbstractC0052f
    public int c(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        int i;
        int i2;
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            i = 15;
            i2 = 0;
        } else {
            i = 3;
            i2 = 48;
        }
        return f.AbstractC0052f.d(i, i2);
    }

    @Override // androidx.recyclerview.widget.f.AbstractC0052f
    public boolean c() {
        return false;
    }
}
