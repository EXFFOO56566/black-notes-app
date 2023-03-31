package notepad.note.notas.notes.notizen.category.selectCategory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ajalt.reprint.module.spass.R;
import java.util.ArrayList;
import notepad.note.notas.notes.notizen.ui.MyTextView;

public class b extends RecyclerView.g<C0094b> {

    /* renamed from: c  reason: collision with root package name */
    private a f6085c;
    private ArrayList<c.a.a.a.a.b.c.a> d = new ArrayList<>();

    /* access modifiers changed from: package-private */
    public interface a {
        void a(int i, String str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: notepad.note.notas.notes.notizen.category.selectCategory.b$b  reason: collision with other inner class name */
    public class C0094b extends RecyclerView.d0 {
        private MyTextView u;

        C0094b(View view) {
            super(view);
            this.u = (MyTextView) view.findViewById(R.id.categoryName);
            view.setOnClickListener(new a(this));
        }

        public /* synthetic */ void a(View view) {
            c.a.a.a.a.b.c.a aVar = (c.a.a.a.a.b.c.a) b.this.d.get(h());
            b.this.f6085c.a(aVar.a(), aVar.b());
        }
    }

    b() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.d.size();
    }

    /* access modifiers changed from: package-private */
    public void a(ArrayList<c.a.a.a.a.b.c.a> arrayList) {
        this.d.clear();
        this.d = arrayList;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f6085c = aVar;
    }

    /* renamed from: a */
    public void b(C0094b bVar, int i) {
        bVar.u.setText(this.d.get(i).b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public C0094b b(ViewGroup viewGroup, int i) {
        return new C0094b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_category, viewGroup, false));
    }
}
