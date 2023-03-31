package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.b.b.h;
import b.c.b.b.i;
import com.google.android.material.datepicker.g;
import java.util.Calendar;
import java.util.Locale;

/* access modifiers changed from: package-private */
public class p extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    private final g<?> f5924c;

    /* access modifiers changed from: package-private */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5925b;

        a(int i) {
            this.f5925b = i;
        }

        public void onClick(View view) {
            p.this.f5924c.a(i.a(this.f5925b, p.this.f5924c.l0().d));
            p.this.f5924c.a(g.k.DAY);
        }
    }

    public static class b extends RecyclerView.d0 {
        final TextView u;

        b(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    p(g<?> gVar) {
        this.f5924c = gVar;
    }

    private View.OnClickListener g(int i) {
        return new a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.f5924c.j0().i();
    }

    /* renamed from: a */
    public void b(b bVar, int i) {
        int f = f(i);
        String string = bVar.u.getContext().getString(i.mtrl_picker_navigate_to_year_description);
        bVar.u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(f)));
        bVar.u.setContentDescription(String.format(string, Integer.valueOf(f)));
        c k0 = this.f5924c.k0();
        Calendar b2 = o.b();
        b bVar2 = b2.get(1) == f ? k0.f : k0.d;
        for (Long l : this.f5924c.m0().f()) {
            b2.setTimeInMillis(l.longValue());
            if (b2.get(1) == f) {
                bVar2 = k0.e;
            }
        }
        bVar2.a(bVar.u);
        bVar.u.setOnClickListener(g(f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public b b(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(h.mtrl_calendar_year, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    public int e(int i) {
        return i - this.f5924c.j0().g().e;
    }

    /* access modifiers changed from: package-private */
    public int f(int i) {
        return this.f5924c.j0().g().e + i;
    }
}
