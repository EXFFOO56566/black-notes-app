package b.c.b.a.g;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;

final class c extends a.AbstractC0069a<b.c.b.a.g.b.a, a> {
    c() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.d, java.lang.Object, com.google.android.gms.common.api.f$a, com.google.android.gms.common.api.f$b] */
    @Override // com.google.android.gms.common.api.a.AbstractC0069a
    public final /* synthetic */ b.c.b.a.g.b.a a(Context context, Looper looper, d dVar, a aVar, f.a aVar2, f.b bVar) {
        a aVar3 = aVar;
        if (aVar3 == null) {
            aVar3 = a.k;
        }
        return new b.c.b.a.g.b.a(context, looper, true, dVar, aVar3, aVar2, bVar);
    }
}
