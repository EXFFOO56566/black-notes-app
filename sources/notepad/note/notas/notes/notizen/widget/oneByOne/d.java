package notepad.note.notas.notes.notizen.widget.oneByOne;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.R;
import java.util.ArrayList;
import notepad.note.notas.notes.notizen.ui.MyTextView;

public class d extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    private a f6151c;
    private ArrayList<c.a.a.a.a.b.c.d> d = new ArrayList<>();
    private String e;

    public interface a {
        void a(int i, String str, boolean z);
    }

    /* access modifiers changed from: package-private */
    public class b extends RecyclerView.d0 {
        private ImageView u;
        private ImageView v;
        private MyTextView w;
        private MyTextView x;

        b(View view) {
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
                c.a.a.a.a.b.c.d dVar = (c.a.a.a.a.b.c.d) d.this.d.get(i);
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
                a(this.w, d.this.e);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public /* synthetic */ void a(View view) {
            try {
                c.a.a.a.a.b.c.d dVar = (c.a.a.a.a.b.c.d) d.this.d.get(h());
                d.this.f6151c.a(dVar.g(), dVar.h(), dVar.j());
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

    public void a(ArrayList<c.a.a.a.a.b.c.d> arrayList, String str) {
        this.d.clear();
        this.d = arrayList;
        this.e = str;
    }

    public void a(a aVar) {
        this.f6151c = aVar;
    }

    /* renamed from: a */
    public void b(b bVar, int i) {
        bVar.c(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public b b(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_main, viewGroup, false));
    }
}
