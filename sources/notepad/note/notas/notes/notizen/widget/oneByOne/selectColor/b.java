package notepad.note.notas.notes.notizen.widget.oneByOne.selectColor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.a.a.b.c.c;
import com.github.ajalt.reprint.module.spass.R;
import java.util.ArrayList;

public class b extends RecyclerView.g<C0099b> {

    /* renamed from: c  reason: collision with root package name */
    private a f6153c;
    private ArrayList<c> d = new ArrayList<>();

    /* access modifiers changed from: package-private */
    public interface a {
        void a(String str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.b$b  reason: collision with other inner class name */
    public class C0099b extends RecyclerView.d0 {
        private ImageView u;
        private ImageView v;

        /* renamed from: notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.b$b$a */
        class a implements View.OnClickListener {
            a(b bVar) {
            }

            public void onClick(View view) {
                try {
                    b.this.f6153c.a(((c) b.this.d.get(C0099b.this.h())).a());
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }

        public C0099b(View view) {
            super(view);
            this.u = (ImageView) view.findViewById(R.id.imgColor);
            this.v = (ImageView) view.findViewById(R.id.imgChecked);
            view.setOnClickListener(new a(b.this));
        }

        /* access modifiers changed from: private */
        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: public */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00cb  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00d1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void c(int r5) {
            /*
            // Method dump skipped, instructions count: 282
            */
            throw new UnsupportedOperationException("Method not decompiled: notepad.note.notas.notes.notizen.widget.oneByOne.selectColor.b.C0099b.c(int):void");
        }
    }

    public b() {
        String[] strArr = {"sky", "blue", "purpleLight", "green", "mint", "red", "pink", "orange", "yellow", "purple"};
        for (int i = 0; i < 10; i++) {
            String str = strArr[i];
            c cVar = new c();
            cVar.a(str);
            this.d.add(cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.d.size();
    }

    public void a(a aVar) {
        this.f6153c = aVar;
    }

    /* renamed from: a */
    public void b(C0099b bVar, int i) {
        bVar.c(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public C0099b b(ViewGroup viewGroup, int i) {
        return new C0099b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_widget_color, viewGroup, false));
    }
}
