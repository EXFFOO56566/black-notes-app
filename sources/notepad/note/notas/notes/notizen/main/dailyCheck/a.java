package notepad.note.notas.notes.notizen.main.dailyCheck;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ajalt.reprint.module.spass.R;
import java.util.ArrayList;
import java.util.Collections;
import notepad.note.notas.notes.notizen.ui.MyTextView;
import notepad.note.notas.notes.notizen.util.recyclerView.a.c;
import notepad.note.notas.notes.notizen.util.recyclerView.a.d;

public class a extends RecyclerView.g<b> implements c {

    /* renamed from: c  reason: collision with root package name */
    private c.a.a.a.a.b.b.c f6121c;
    private ArrayList<c.a.a.a.a.b.c.b> d;
    private AbstractC0097a e;

    /* access modifiers changed from: package-private */
    /* renamed from: notepad.note.notas.notes.notizen.main.dailyCheck.a$a  reason: collision with other inner class name */
    public interface AbstractC0097a {
        void a();

        void a(int i);
    }

    /* access modifiers changed from: package-private */
    public class b extends RecyclerView.d0 implements d, View.OnClickListener {
        private ImageView u;
        private MyTextView v;

        public b(View view) {
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
            c.a.a.a.a.b.b.c cVar;
            int a2;
            if (view.getId() == R.id.layout) {
                try {
                    c.a.a.a.a.b.c.b bVar = (c.a.a.a.a.b.c.b) a.this.d.get(h());
                    if (bVar.c()) {
                        z = false;
                        ((c.a.a.a.a.b.c.b) a.this.d.get(h())).a(false);
                        cVar = a.this.f6121c;
                        a2 = bVar.a();
                    } else {
                        z = true;
                        ((c.a.a.a.a.b.c.b) a.this.d.get(h())).a(true);
                        cVar = a.this.f6121c;
                        a2 = bVar.a();
                    }
                    cVar.a(a2, z);
                    b(z);
                    a.this.e.a();
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            } else if (view.getId() == R.id.btnEditCheckbox) {
                try {
                    a.this.e.a(((c.a.a.a.a.b.c.b) a.this.d.get(h())).a());
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    a.this.d();
                }
            }
        }
    }

    a(Context context, ArrayList<c.a.a.a.a.b.c.b> arrayList) {
        this.f6121c = new c.a.a.a.a.b.b.c(context);
        this.d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.d.size();
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.c
    public void a(int i) {
        this.f6121c.a(this.d.get(i).a());
        this.d.remove(i);
        d(i);
        this.e.a();
    }

    public void a(ArrayList<c.a.a.a.a.b.c.b> arrayList) {
        this.d.clear();
        this.d = arrayList;
    }

    public void a(AbstractC0097a aVar) {
        this.e = aVar;
    }

    /* renamed from: a */
    public void b(b bVar, int i) {
        c.a.a.a.a.b.c.b bVar2 = this.d.get(i);
        bVar.v.setText(bVar2.b());
        bVar.b((b) (bVar2.c()));
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.c
    public boolean a(int i, int i2) {
        int a2 = this.d.get(i).a();
        int a3 = this.d.get(i2).a();
        this.f6121c.a(a2, i2);
        this.f6121c.a(a3, i);
        Collections.swap(this.d, i, i2);
        b(i, i2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public b b(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_daily_checkbox, viewGroup, false));
    }
}
