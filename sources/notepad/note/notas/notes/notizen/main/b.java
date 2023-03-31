package notepad.note.notas.notes.notizen.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.a.a.b.c.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import java.util.ArrayList;
import notepad.note.notas.notes.notizen.ui.MyTextView;

public class b extends RecyclerView.g<RecyclerView.d0> {

    /* renamed from: c  reason: collision with root package name */
    private int f6111c = 1;
    private c d;
    private ArrayList<d> e = new ArrayList<>();
    private c.a.a.a.a.b.b.d f;
    private notepad.note.notas.notes.notizen.util.a g;

    class a extends RecyclerView.d0 implements View.OnClickListener, View.OnLongClickListener {
        private MyTextView u;
        private MyTextView v;
        private ImageView w;
        private ImageView x;
        private ImageView y;

        a(View view) {
            super(view);
            this.u = (MyTextView) view.findViewById(R.id.txtTitle);
            this.v = (MyTextView) view.findViewById(R.id.txtCategory);
            this.w = (ImageView) view.findViewById(R.id.btnFavorites);
            this.x = (ImageView) view.findViewById(R.id.imgChecklist);
            this.y = (ImageView) view.findViewById(R.id.imgPassword);
            view.findViewById(R.id.btnFavorites).setOnClickListener(this);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void c(int i) {
            String str;
            MyTextView myTextView;
            int i2;
            ImageView imageView;
            d dVar = (d) b.this.e.get(i);
            if (!dVar.i().equals(BuildConfig.FLAVOR)) {
                myTextView = this.u;
                str = dVar.i();
            } else {
                myTextView = this.u;
                str = dVar.f();
            }
            myTextView.setText(str);
            this.v.setText(dVar.b());
            if (dVar.k()) {
                imageView = this.w;
                i2 = R.drawable.btn_favorites_green;
            } else {
                imageView = this.w;
                i2 = R.drawable.btn_favorites_gray;
            }
            imageView.setImageResource(i2);
            if (dVar.j()) {
                this.x.setVisibility(0);
            } else {
                this.x.setVisibility(8);
            }
            if (dVar.h().equals(BuildConfig.FLAVOR)) {
                this.y.setVisibility(8);
            } else {
                this.y.setVisibility(0);
            }
        }

        public void onClick(View view) {
            if (view.getId() == R.id.layout) {
                if (b.this.g.a()) {
                    try {
                        d dVar = (d) b.this.e.get(h());
                        b.this.d.a(dVar.g(), dVar.h(), dVar.j());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        e.printStackTrace();
                        b.this.d();
                    }
                }
            } else if (view.getId() == R.id.btnFavorites) {
                int g = ((d) b.this.e.get(h())).g();
                if (((d) b.this.e.get(h())).k()) {
                    ((d) b.this.e.get(h())).b(false);
                    b.this.f.a(g, false);
                    this.w.setImageResource(R.drawable.btn_favorites_gray);
                    return;
                }
                ((d) b.this.e.get(h())).b(true);
                b.this.f.a(g, true);
                this.w.setImageResource(R.drawable.btn_favorites_green);
            }
        }

        public boolean onLongClick(View view) {
            if (MainActivity.I) {
                return true;
            }
            b.this.d.a(((d) b.this.e.get(h())).g());
            return true;
        }
    }

    /* renamed from: notepad.note.notas.notes.notizen.main.b$b  reason: collision with other inner class name */
    class View$OnClickListenerC0096b extends RecyclerView.d0 implements View.OnClickListener, notepad.note.notas.notes.notizen.util.recyclerView.a.d {
        private MyTextView u;
        private MyTextView v;
        private ImageView w;
        private ImageView x;
        private ImageView y;

        View$OnClickListenerC0096b(View view) {
            super(view);
            this.u = (MyTextView) view.findViewById(R.id.txtTitle);
            this.v = (MyTextView) view.findViewById(R.id.txtCategory);
            this.w = (ImageView) view.findViewById(R.id.imgEditCheck);
            this.x = (ImageView) view.findViewById(R.id.imgChecklist);
            this.y = (ImageView) view.findViewById(R.id.imgPassword);
            view.setOnClickListener(this);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void c(int i) {
            int i2;
            ImageView imageView;
            String str;
            MyTextView myTextView;
            d dVar = (d) b.this.e.get(i);
            if (dVar.l().equals("true")) {
                imageView = this.w;
                i2 = R.drawable.ring_green;
            } else {
                imageView = this.w;
                i2 = R.drawable.ring;
            }
            imageView.setImageResource(i2);
            if (!dVar.i().equals(BuildConfig.FLAVOR)) {
                myTextView = this.u;
                str = dVar.i();
            } else {
                myTextView = this.u;
                str = dVar.f();
            }
            myTextView.setText(str);
            if (dVar.j()) {
                this.x.setVisibility(0);
            } else {
                this.x.setVisibility(8);
            }
            if (dVar.h().equals(BuildConfig.FLAVOR)) {
                this.y.setVisibility(8);
            } else {
                this.y.setVisibility(0);
            }
            this.v.setText(dVar.b());
        }

        @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.d
        public void a() {
            this.f966b.setBackgroundColor(0);
        }

        @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.d
        public void b() {
        }

        public void onClick(View view) {
            try {
                d dVar = (d) b.this.e.get(h());
                if (dVar.l().equals("true")) {
                    b.this.f.b(dVar.g(), false);
                    ((d) b.this.e.get(h())).g("false");
                    this.w.setImageResource(R.drawable.ring);
                    return;
                }
                b.this.f.b(dVar.g(), true);
                ((d) b.this.e.get(h())).g("true");
                this.w.setImageResource(R.drawable.ring_green);
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                b.this.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public interface c {
        void a(int i);

        void a(int i, String str, boolean z);
    }

    b(Context context) {
        this.f = new c.a.a.a.a.b.b.d(context);
        this.g = new notepad.note.notas.notes.notizen.util.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.e.size();
    }

    /* access modifiers changed from: package-private */
    public void a(ArrayList<d> arrayList) {
        this.e.clear();
        this.e = arrayList;
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        this.d = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.d0 b(ViewGroup viewGroup, int i) {
        return i != 1 ? i != 2 ? new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_main, viewGroup, false)) : new View$OnClickListenerC0096b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_edit_note, viewGroup, false)) : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_main, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void b(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof a) {
            ((a) d0Var).c(i);
        } else if (d0Var instanceof View$OnClickListenerC0096b) {
            ((View$OnClickListenerC0096b) d0Var).c(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c(int i) {
        return this.f6111c;
    }

    /* access modifiers changed from: package-private */
    public void e(int i) {
        this.f6111c = i;
    }
}
