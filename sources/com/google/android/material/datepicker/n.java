package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;

/* access modifiers changed from: package-private */
public class n extends LinearLayoutManager {

    class a extends j {
        a(n nVar, Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.j
        public float a(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    n(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.c(i);
        b(aVar);
    }
}
