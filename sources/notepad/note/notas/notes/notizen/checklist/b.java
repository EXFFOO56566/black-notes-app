package notepad.note.notas.notes.notizen.checklist;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.R;
import java.util.ArrayList;
import java.util.Collections;
import notepad.note.notas.notes.notizen.ui.MyTextView;
import notepad.note.notas.notes.notizen.util.recyclerView.a.c;

public class b extends RecyclerView.g<View$OnClickListenerC0095b> implements c {

    /* renamed from: c  reason: collision with root package name */
    private a f6101c;
    private c.a.a.a.a.b.b.b d;
    private d e;
    private ArrayList<c.a.a.a.a.b.c.b> f;
    private int g;

    public interface a {
        void a(int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: notepad.note.notas.notes.notizen.checklist.b$b  reason: collision with other inner class name */
    public class View$OnClickListenerC0095b extends RecyclerView.d0 implements notepad.note.notas.notes.notizen.util.recyclerView.a.d, View.OnClickListener {
        private ImageView u;
        private MyTextView v;

        public View$OnClickListenerC0095b(View view) {
            super(view);
            this.u = (ImageView) view.findViewById(R.id.imgCheckbox);
            this.v = (MyTextView) view.findViewById(R.id.txtContent);
            view.findViewById(R.id.layout).setOnClickListener(this);
            view.findViewById(R.id.btnEditCheckbox).setOnClickListener(this);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void b(boolean z) {
            ImageView imageView;
            int i;
            if (z) {
                this.v.setTextColor(Color.parseColor("#BCBCBC"));
                MyTextView myTextView = this.v;
                myTextView.setPaintFlags(myTextView.getPaintFlags() | 16);
                imageView = this.u;
                i = R.drawable.btn_checked_box;
            } else {
                this.v.setTextColor(Color.parseColor("#FFFFFF"));
                MyTextView myTextView2 = this.v;
                myTextView2.setPaintFlags(myTextView2.getPaintFlags() & -17);
                imageView = this.u;
                i = R.drawable.ring;
            }
            imageView.setImageResource(i);
        }

        @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.d
        public void a() {
            this.f966b.setBackgroundColor(0);
        }

        @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.d
        public void b() {
            this.f966b.setBackgroundColor(Color.parseColor("#BF232323"));
        }

        public void onClick(View view) {
            boolean z;
            c.a.a.a.a.b.b.b bVar;
            int a2;
            if (view.getId() == R.id.layout) {
                try {
                    c.a.a.a.a.b.c.b bVar2 = (c.a.a.a.a.b.c.b) b.this.f.get(h());
                    if (bVar2.c()) {
                        z = false;
                        ((c.a.a.a.a.b.c.b) b.this.f.get(h())).a(false);
                        bVar = b.this.d;
                        a2 = bVar2.a();
                    } else {
                        z = true;
                        ((c.a.a.a.a.b.c.b) b.this.f.get(h())).a(true);
                        bVar = b.this.d;
                        a2 = bVar2.a();
                    }
                    bVar.a(a2, z);
                    b(z);
                    b.this.e.g(b.this.g);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            } else if (view.getId() == R.id.btnEditCheckbox) {
                try {
                    b.this.f6101c.a(((c.a.a.a.a.b.c.b) b.this.f.get(h())).a());
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    b.this.d();
                }
            }
        }
    }

    public b(Context context, int i) {
        this.d = new c.a.a.a.a.b.b.b(context);
        this.e = new d(context);
        this.g = i;
        this.f = this.d.f(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.f.size();
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.c
    public void a(int i) {
        this.d.c(this.f.get(i).a());
        this.e.g(this.g);
        this.f.remove(i);
        d(i);
    }

    public void a(ArrayList<c.a.a.a.a.b.c.b> arrayList) {
        this.f.clear();
        this.f = arrayList;
    }

    public void a(a aVar) {
        this.f6101c = aVar;
    }

    /* renamed from: a */
    public void b(View$OnClickListenerC0095b bVar, int i) {
        c.a.a.a.a.b.c.b bVar2 = this.f.get(i);
        bVar.v.setText(bVar2.b());
        bVar.b((View$OnClickListenerC0095b) (bVar2.c()));
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.c
    public boolean a(int i, int i2) {
        int a2 = this.f.get(i).a();
        int a3 = this.f.get(i2).a();
        this.d.a(a2, i2);
        this.d.a(a3, i);
        this.e.g(this.g);
        Collections.swap(this.f, i, i2);
        b(i, i2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public View$OnClickListenerC0095b b(ViewGroup viewGroup, int i) {
        return new View$OnClickListenerC0095b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_checkbox, viewGroup, false));
    }

    public ArrayList<c.a.a.a.a.b.c.b> e() {
        return this.f;
    }
}
