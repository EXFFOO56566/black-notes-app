package a.c.b;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.d;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f62a;

    /* renamed from: a.c.b.a$a  reason: collision with other inner class name */
    public static final class C0005a {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f63a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<Bundle> f64b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f65c;
        private ArrayList<Bundle> d;
        private boolean e;

        public C0005a() {
            this(null);
        }

        public C0005a(b bVar) {
            this.f63a = new Intent("android.intent.action.VIEW");
            this.f64b = null;
            this.f65c = null;
            this.d = null;
            this.e = true;
            if (bVar == null) {
                Bundle bundle = new Bundle();
                if (bVar == null) {
                    d.a(bundle, "android.support.customtabs.extra.SESSION", null);
                    this.f63a.putExtras(bundle);
                    return;
                }
                bVar.a();
                throw null;
            }
            bVar.b();
            throw null;
        }

        public a a() {
            ArrayList<Bundle> arrayList = this.f64b;
            if (arrayList != null) {
                this.f63a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.d;
            if (arrayList2 != null) {
                this.f63a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f63a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.e);
            return new a(this.f63a, this.f65c);
        }
    }

    a(Intent intent, Bundle bundle) {
        this.f62a = intent;
    }
}
