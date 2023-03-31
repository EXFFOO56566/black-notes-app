package notepad.note.notas.notes.notizen.widget.oneByOne.setting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.a.a.b.c.c;
import com.github.ajalt.reprint.module.spass.R;
import java.util.ArrayList;

public class a extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    private AbstractC0100a f6156c;
    private ArrayList<c> d = new ArrayList<>();

    /* access modifiers changed from: package-private */
    /* renamed from: notepad.note.notas.notes.notizen.widget.oneByOne.setting.a$a  reason: collision with other inner class name */
    public interface AbstractC0100a {
        void a(String str);
    }

    /* access modifiers changed from: package-private */
    public class b extends RecyclerView.d0 {
        private ImageView u;
        private ImageView v;

        /* renamed from: notepad.note.notas.notes.notizen.widget.oneByOne.setting.a$b$a  reason: collision with other inner class name */
        class View$OnClickListenerC0101a implements View.OnClickListener {
            View$OnClickListenerC0101a(a aVar) {
            }

            public void onClick(View view) {
                try {
                    a.this.f6156c.a(((c) a.this.d.get(b.this.h())).a());
                    for (int i = 0; i < a.this.d.size(); i++) {
                        ((c) a.this.d.get(i)).a(false);
                    }
                    ((c) a.this.d.get(b.this.h())).a(true);
                    a.this.d();
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }

        public b(View view) {
            super(view);
            this.u = (ImageView) view.findViewById(R.id.imgColor);
            this.v = (ImageView) view.findViewById(R.id.imgChecked);
            view.setOnClickListener(new View$OnClickListenerC0101a(a.this));
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
            throw new UnsupportedOperationException("Method not decompiled: notepad.note.notas.notes.notizen.widget.oneByOne.setting.a.b.c(int):void");
        }
    }

    public a() {
        String[] strArr = {"sky", "blue", "purpleLight", "green", "mint", "red", "pink", "orange", "yellow", "purple"};
        for (int i = 0; i < 10; i++) {
            String str = strArr[i];
            c cVar = new c();
            cVar.a(str);
            this.d.add(cVar);
        }
        this.d.get(2).a(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.d.size();
    }

    public void a(AbstractC0100a aVar) {
        this.f6156c = aVar;
    }

    /* renamed from: a */
    public void b(b bVar, int i) {
        bVar.c(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public b b(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_widget_color, viewGroup, false));
    }
}
