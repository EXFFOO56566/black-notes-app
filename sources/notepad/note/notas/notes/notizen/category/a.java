package notepad.note.notas.notes.notizen.category;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.a.a.b.b.d;
import com.github.ajalt.reprint.module.spass.R;
import java.util.ArrayList;
import java.util.Collections;
import notepad.note.notas.notes.notizen.util.recyclerView.a.c;
import notepad.note.notas.notes.notizen.util.recyclerView.a.e;

public class a extends RecyclerView.g<b> implements c {

    /* renamed from: c  reason: collision with root package name */
    private c.a.a.a.a.b.b.a f6080c;
    private d d;
    private e e;
    private AbstractC0091a f;
    private ArrayList<c.a.a.a.a.b.c.a> g;
    private boolean h = false;
    private Context i;
    private boolean j = false;

    /* access modifiers changed from: package-private */
    /* renamed from: notepad.note.notas.notes.notizen.category.a$a  reason: collision with other inner class name */
    public interface AbstractC0091a {
        void a();

        void a(String str, int i, String str2);
    }

    /* access modifiers changed from: package-private */
    public class b extends RecyclerView.d0 implements notepad.note.notas.notes.notizen.util.recyclerView.a.d, View.OnClickListener {
        private RelativeLayout u;
        private TextView v;
        private LinearLayout w;
        private LinearLayout x;
        private LinearLayout y;

        /* renamed from: notepad.note.notas.notes.notizen.category.a$b$a  reason: collision with other inner class name */
        class View$OnLongClickListenerC0092a implements View.OnLongClickListener {
            View$OnLongClickListenerC0092a(a aVar) {
            }

            public boolean onLongClick(View view) {
                if (a.this.h) {
                    return true;
                }
                a.this.f.a();
                return true;
            }
        }

        /* renamed from: notepad.note.notas.notes.notizen.category.a$b$b  reason: collision with other inner class name */
        class View$OnTouchListenerC0093b implements View.OnTouchListener {
            View$OnTouchListenerC0093b(a aVar) {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                a.this.e.a(b.this);
                return false;
            }
        }

        b(View view) {
            super(view);
            this.v = (TextView) view.findViewById(R.id.categoryName);
            this.w = (LinearLayout) view.findViewById(R.id.editLayout);
            this.u = (RelativeLayout) view.findViewById(R.id.layout);
            this.x = (LinearLayout) view.findViewById(R.id.btnEditCategoryName);
            this.y = (LinearLayout) view.findViewById(R.id.btnDelete);
            this.u.setOnClickListener(this);
            this.x.setOnClickListener(this);
            this.y.setOnClickListener(this);
            this.u.setOnLongClickListener(new View$OnLongClickListenerC0092a(a.this));
            view.findViewById(R.id.btnEditRank).setOnTouchListener(new View$OnTouchListenerC0093b(a.this));
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
            AbstractC0091a aVar;
            String str;
            int a2;
            String b2;
            try {
                if (view.getId() == R.id.layout) {
                    if (!a.this.h) {
                        c.a.a.a.a.b.c.a aVar2 = (c.a.a.a.a.b.c.a) a.this.g.get(h());
                        aVar = a.this.f;
                        str = "select";
                        a2 = aVar2.a();
                        b2 = aVar2.b();
                    } else {
                        return;
                    }
                } else if (view.getId() == R.id.btnEditCategoryName) {
                    c.a.a.a.a.b.c.a aVar3 = (c.a.a.a.a.b.c.a) a.this.g.get(h());
                    aVar = a.this.f;
                    str = "editName";
                    a2 = aVar3.a();
                    b2 = aVar3.b();
                } else if (view.getId() != R.id.btnDelete) {
                    return;
                } else {
                    if (a.this.d.a(((c.a.a.a.a.b.c.a) a.this.g.get(h())).a()) == 0) {
                        a.this.a(h());
                        return;
                    } else {
                        Toast.makeText(a.this.i, "First delete all notes in this category.", 1).show();
                        return;
                    }
                }
                aVar.a(str, a2, b2);
            } catch (Exception e) {
                e.printStackTrace();
                a.this.d();
            }
        }
    }

    a(Context context, e eVar) {
        this.e = eVar;
        this.i = context;
        this.g = new ArrayList<>();
        this.f6080c = new c.a.a.a.a.b.b.a(context);
        this.d = new d(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.g.size();
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.c
    public void a(int i2) {
        this.j = true;
        this.f6080c.a(this.g.get(i2).a());
        this.g.remove(i2);
        d(i2);
    }

    /* access modifiers changed from: package-private */
    public void a(ArrayList<c.a.a.a.a.b.c.a> arrayList) {
        this.g.clear();
        this.g = arrayList;
    }

    /* access modifiers changed from: package-private */
    public void a(AbstractC0091a aVar) {
        this.f = aVar;
    }

    /* renamed from: a */
    public void b(b bVar, int i2) {
        bVar.v.setText(this.g.get(i2).b());
        bVar.w.setVisibility(this.h ? 0 : 8);
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.c
    public boolean a(int i2, int i3) {
        int a2 = this.g.get(i2).a();
        int a3 = this.g.get(i3).a();
        this.f6080c.a(a2, i3);
        this.f6080c.a(a3, i2);
        Collections.swap(this.g, i2, i3);
        b(i2, i3);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public b b(ViewGroup viewGroup, int i2) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_category, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        this.h = z;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.h;
    }
}
