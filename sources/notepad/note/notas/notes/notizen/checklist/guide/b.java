package notepad.note.notas.notes.notizen.checklist.guide;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import java.util.ArrayList;
import java.util.Collections;
import notepad.note.notas.notes.notizen.ui.MyTextView;
import notepad.note.notas.notes.notizen.util.recyclerView.a.c;
import notepad.note.notas.notes.notizen.util.recyclerView.a.d;

public class b extends RecyclerView.g<a> implements c {

    /* renamed from: c  reason: collision with root package name */
    private Context f6105c;
    private ArrayList<a> d;

    /* access modifiers changed from: package-private */
    public class a extends RecyclerView.d0 implements d, View.OnClickListener {
        private ImageView u;
        private ImageView v;
        private ImageView w;
        private MyTextView x;

        public a(View view) {
            super(view);
            this.u = (ImageView) view.findViewById(R.id.imgCheckbox);
            this.v = (ImageView) view.findViewById(R.id.imgGuide);
            this.w = (ImageView) view.findViewById(R.id.ringGreen);
            this.x = (MyTextView) view.findViewById(R.id.txtTitle);
            view.findViewById(R.id.layout).setOnClickListener(this);
            view.findViewById(R.id.btnEditCheckbox).setOnClickListener(this);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void c(int i) {
            ImageView imageView;
            int i2;
            a aVar = (a) b.this.d.get(i);
            this.x.setText(aVar.a());
            if (aVar.e()) {
                this.v.setVisibility(0);
            } else {
                this.v.setVisibility(8);
            }
            if (aVar.b() != 0) {
                this.v.setImageResource(aVar.b());
            } else {
                this.v.setImageResource(0);
            }
            if (aVar.d()) {
                this.w.setVisibility(0);
            } else {
                this.w.setVisibility(8);
            }
            if (aVar.c()) {
                imageView = this.u;
                i2 = R.drawable.btn_checked_box;
            } else {
                imageView = this.u;
                i2 = R.drawable.ring;
            }
            imageView.setImageResource(i2);
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
            if (view.getId() == R.id.layout) {
                if (((a) b.this.d.get(h())).c()) {
                    this.u.setImageResource(R.drawable.ring);
                    ((a) b.this.d.get(h())).a(false);
                    return;
                }
                this.u.setImageResource(R.drawable.btn_checked_box);
                ((a) b.this.d.get(h())).a(true);
            } else if (view.getId() == R.id.btnEditCheckbox) {
                Toast.makeText(b.this.f6105c, "Good 🙂 You can edit the checkbox in the your checklist 🙂", 1).show();
            }
        }
    }

    b(Context context) {
        this.f6105c = context;
        e();
    }

    private void e() {
        this.d = new ArrayList<>();
        a aVar = new a();
        aVar.c(true);
        aVar.a("Touch : check / uncheck");
        aVar.a(R.drawable.btn_guide_touch_item);
        a aVar2 = new a();
        aVar2.c(true);
        aVar2.a("Swipe : delete");
        aVar2.a(R.drawable.btn_guide_delete_item);
        a aVar3 = new a();
        aVar3.c(true);
        aVar3.a("Long touch and move : change");
        aVar3.a(R.drawable.btn_guide_move_item);
        a aVar4 = new a();
        aVar4.c(true);
        aVar4.b(true);
        aVar4.a("Touch the end : edit");
        aVar4.a(R.drawable.btn_guide_edit_item);
        a aVar5 = new a();
        aVar5.c(true);
        aVar5.a("Let's practice.");
        a aVar6 = new a();
        aVar6.c(true);
        aVar6.a("Thanks for using my app 🙂");
        this.d.add(aVar);
        this.d.add(aVar2);
        this.d.add(aVar3);
        this.d.add(aVar4);
        this.d.add(aVar5);
        this.d.add(aVar6);
        for (int i = 1; i < 11; i++) {
            a aVar7 = new a();
            aVar7.a(BuildConfig.FLAVOR + i);
            this.d.add(aVar7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.d.size();
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.c
    public void a(int i) {
        this.d.remove(i);
        d(i);
    }

    /* renamed from: a */
    public void b(a aVar, int i) {
        aVar.c(i);
    }

    @Override // notepad.note.notas.notes.notizen.util.recyclerView.a.c
    public boolean a(int i, int i2) {
        Collections.swap(this.d, i, i2);
        b(i, i2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public a b(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_checkbox_guide, viewGroup, false));
    }
}
