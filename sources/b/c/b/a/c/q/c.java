package b.c.b.a.c.q;

import android.content.Context;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f1178b = new c();

    /* renamed from: a  reason: collision with root package name */
    private b f1179a = null;

    public static b a(Context context) {
        return f1178b.b(context);
    }

    private final synchronized b b(Context context) {
        if (this.f1179a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f1179a = new b(context);
        }
        return this.f1179a;
    }
}
