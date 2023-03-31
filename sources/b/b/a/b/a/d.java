package b.b.a.b.a;

import android.content.Context;
import android.os.Build;
import b.b.a.b.a.c;
import com.github.ajalt.reprint.module.marshmallow.MarshmallowReprintModule;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public enum d {
    INSTANCE;
    
    public static final c.a f = new a();

    /* renamed from: b  reason: collision with root package name */
    private AtomicReference<a.g.h.a> f1130b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private e f1131c;
    private Context d;

    static class a implements c.a {
        a() {
        }

        @Override // b.b.a.b.a.c.a
        public void a(String str) {
        }

        @Override // b.b.a.b.a.c.a
        public void a(Throwable th, String str) {
        }
    }

    private d() {
    }

    private String a(int i) {
        Context context = this.d;
        if (context == null) {
            return null;
        }
        return context.getString(i);
    }

    private void b(Context context, c.a aVar) {
        try {
            a((e) Class.forName("com.github.ajalt.reprint.module.spass.SpassReprintModule").getConstructor(Context.class, c.a.class).newInstance(context, aVar));
        } catch (Exception unused) {
        }
    }

    public void a(Context context, c.a aVar) {
        this.d = context.getApplicationContext();
        if (this.f1131c == null && Build.VERSION.SDK_INT >= 17) {
            if (aVar == null) {
                aVar = f;
            }
            if (Build.VERSION.SDK_INT < 23) {
                b(context, aVar);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                MarshmallowReprintModule marshmallowReprintModule = new MarshmallowReprintModule(context, aVar);
                if (Build.VERSION.SDK_INT != 23 || marshmallowReprintModule.isHardwarePresent()) {
                    a(marshmallowReprintModule);
                } else {
                    b(context, aVar);
                }
            }
        }
    }

    public void a(b bVar, c.b bVar2) {
        e eVar = this.f1131c;
        if (eVar == null || !eVar.isHardwarePresent()) {
            bVar.a(a.NO_HARDWARE, true, a(b.b.a.a.a.fingerprint_error_hw_not_available), 0, 0);
        } else if (!this.f1131c.hasFingerprintRegistered()) {
            bVar.a(a.NO_FINGERPRINTS_REGISTERED, true, a(b.b.a.a.a.fingerprint_not_recognized), 0, 0);
        } else {
            this.f1130b.set(new a.g.h.a());
            this.f1131c.authenticate(this.f1130b.get(), bVar, bVar2);
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if ((this.f1131c == null || eVar.tag() != this.f1131c.tag()) && eVar.isHardwarePresent()) {
            this.f1131c = eVar;
        }
    }

    public boolean b() {
        e eVar = this.f1131c;
        return eVar != null && eVar.hasFingerprintRegistered();
    }

    public boolean c() {
        e eVar = this.f1131c;
        return eVar != null && eVar.isHardwarePresent();
    }
}
