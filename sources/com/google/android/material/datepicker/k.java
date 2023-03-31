package com.google.android.material.datepicker;

import a.g.l.u;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.b.b.f;
import b.c.b.b.h;
import com.google.android.material.datepicker.g;

/* access modifiers changed from: package-private */
public class k extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    private final a f5921c;
    private final d<?> d;
    private final g.l e;
    private final int f;

    /* access modifiers changed from: package-private */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f5922b;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f5922b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f5922b.getAdapter().e(i)) {
                k.this.e.a(this.f5922b.getAdapter().getItem(i).longValue());
            }
        }
    }

    public static class b extends RecyclerView.d0 {
        final TextView u;
        final MaterialCalendarGridView v;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(f.month_title);
            this.u = textView;
            u.a((View) textView, true);
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(f.month_grid);
            if (!z) {
                this.u.setVisibility(8);
            }
        }
    }

    k(Context context, d<?> dVar, a aVar, g.l lVar) {
        i g = aVar.g();
        i b2 = aVar.b();
        i e2 = aVar.e();
        if (g.compareTo(e2) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (e2.compareTo(b2) <= 0) {
            this.f = (j.f * g.b(context)) + (h.b(context) ? g.b(context) : 0);
            this.f5921c = aVar;
            this.d = dVar;
            this.e = lVar;
            a(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.f5921c.d();
    }

    /* access modifiers changed from: package-private */
    public int a(i iVar) {
        return this.f5921c.g().b(iVar);
    }

    /* renamed from: a */
    public void b(b bVar, int i) {
        i b2 = this.f5921c.g().b(i);
        bVar.u.setText(b2.e());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !b2.equals(materialCalendarGridView.getAdapter().f5919b)) {
            j jVar = new j(b2, this.d, this.f5921c);
            materialCalendarGridView.setNumColumns(b2.f);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long b(int i) {
        return this.f5921c.g().b(i).j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public b b(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!h.b(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f));
        return new b(linearLayout, true);
    }

    /* access modifiers changed from: package-private */
    public i e(int i) {
        return this.f5921c.g().b(i);
    }

    /* access modifiers changed from: package-private */
    public CharSequence f(int i) {
        return e(i).e();
    }
}
