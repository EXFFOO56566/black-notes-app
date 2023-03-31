package notepad.note.notas.notes.notizen.main.search;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.a.a.b.c.d;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import java.util.ArrayList;
import notepad.note.notas.notes.notizen.ui.MyTextView;

public class b extends RecyclerView.g<C0098b> {

    /* renamed from: c  reason: collision with root package name */
    private a f6125c;
    private ArrayList<d> d = new ArrayList<>();
    private String e;

    public interface a {
        void a(int i, String str, boolean z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: notepad.note.notas.notes.notizen.main.search.b$b  reason: collision with other inner class name */
    public class C0098b extends RecyclerView.d0 {
        private ImageView u;
        private ImageView v;
        private MyTextView w;
        private MyTextView x;

        C0098b(View view) {
            super(view);
            this.w = (MyTextView) view.findViewById(R.id.txtTitle);
            this.x = (MyTextView) view.findViewById(R.id.txtCategory);
            this.u = (ImageView) view.findViewById(R.id.imgPassword);
            this.v = (ImageView) view.findViewById(R.id.imgChecklist);
            view.findViewById(R.id.btnFavorites).setVisibility(4);
            view.setOnClickListener(new a(this));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void c(int i) {
            MyTextView myTextView;
            String f;
            try {
                d dVar = (d) b.this.d.get(i);
                if (!dVar.i().equals(BuildConfig.FLAVOR)) {
                    myTextView = this.w;
                    f = dVar.i();
                } else {
                    myTextView = this.w;
                    f = dVar.f();
                }
                myTextView.setText(f);
                this.x.setText(dVar.b());
                if (dVar.j()) {
                    this.v.setVisibility(0);
                } else {
                    this.v.setVisibility(8);
                }
                if (dVar.h().equals(BuildConfig.FLAVOR)) {
                    this.u.setVisibility(8);
                } else {
                    this.u.setVisibility(0);
                }
                a(this.w, b.this.e);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public /* synthetic */ void a(View view) {
            try {
                d dVar = (d) b.this.d.get(h());
                b.this.f6125c.a(dVar.g(), dVar.h(), dVar.j());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(MyTextView myTextView, String str) {
            String lowerCase = myTextView.getText().toString().toLowerCase();
            int i = 0;
            int indexOf = lowerCase.indexOf(str.toLowerCase(), 0);
            SpannableString spannableString = new SpannableString(myTextView.getText());
            int parseColor = Color.parseColor("#8030be91");
            while (i < lowerCase.length() && indexOf != -1 && (indexOf = lowerCase.indexOf(str.toLowerCase(), i)) != -1) {
                spannableString.setSpan(new BackgroundColorSpan(parseColor), indexOf, str.length() + indexOf, 33);
                myTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
                i = indexOf + 1;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.d.size();
    }

    public void a(ArrayList<d> arrayList, String str) {
        this.d.clear();
        this.d = arrayList;
        this.e = str;
    }

    public void a(a aVar) {
        this.f6125c = aVar;
    }

    /* renamed from: a */
    public void b(C0098b bVar, int i) {
        bVar.c(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public C0098b b(ViewGroup viewGroup, int i) {
        return new C0098b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_main, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.d.clear();
    }
}
