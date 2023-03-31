package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;

class FragmentStateAdapter$5 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f1124a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f1125b;

    @Override // androidx.lifecycle.f
    public void a(h hVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            this.f1124a.removeCallbacks(this.f1125b);
            hVar.a().b(this);
        }
    }
}
