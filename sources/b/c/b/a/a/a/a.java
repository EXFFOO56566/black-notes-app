package b.c.b.a.a.a;

import android.os.Bundle;
import b.c.b.a.e.b.f;
import b.c.b.a.e.b.g;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.j;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a.g<g> f1141a = new a.g<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a.g<j> f1142b = new a.g<>();

    /* renamed from: c  reason: collision with root package name */
    private static final a.AbstractC0069a<g, C0056a> f1143c = new f();
    private static final a.AbstractC0069a<j, GoogleSignInOptions> d = new g();
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> e = new com.google.android.gms.common.api.a<>("Auth.GOOGLE_SIGN_IN_API", d, f1142b);

    @Deprecated
    /* renamed from: b.c.b.a.a.a.a$a  reason: collision with other inner class name */
    public static class C0056a implements a.d.e {
        public static final C0056a e = new C0057a().a();

        /* renamed from: b  reason: collision with root package name */
        private final String f1144b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f1145c;
        private final String d;

        @Deprecated
        /* renamed from: b.c.b.a.a.a.a$a$a  reason: collision with other inner class name */
        public static class C0057a {

            /* renamed from: a  reason: collision with root package name */
            protected String f1146a;

            /* renamed from: b  reason: collision with root package name */
            protected Boolean f1147b = false;

            /* renamed from: c  reason: collision with root package name */
            protected String f1148c;

            public C0057a() {
            }

            public C0057a(C0056a aVar) {
                this.f1146a = aVar.f1144b;
                this.f1147b = Boolean.valueOf(aVar.f1145c);
                this.f1148c = aVar.d;
            }

            public C0057a a(String str) {
                this.f1148c = str;
                return this;
            }

            public C0056a a() {
                return new C0056a(this);
            }
        }

        public C0056a(C0057a aVar) {
            this.f1144b = aVar.f1146a;
            this.f1145c = aVar.f1147b.booleanValue();
            this.d = aVar.f1148c;
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.f1144b);
            bundle.putBoolean("force_save_dialog", this.f1145c);
            bundle.putString("log_session_id", this.d);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0056a)) {
                return false;
            }
            C0056a aVar = (C0056a) obj;
            return p.a(this.f1144b, aVar.f1144b) && this.f1145c == aVar.f1145c && p.a(this.d, aVar.d);
        }

        public int hashCode() {
            return p.a(this.f1144b, Boolean.valueOf(this.f1145c), this.d);
        }
    }

    static {
        com.google.android.gms.common.api.a<c> aVar = b.f1151c;
        new com.google.android.gms.common.api.a("Auth.CREDENTIALS_API", f1143c, f1141a);
        b.c.b.a.a.a.d.a aVar2 = b.d;
        new f();
        new com.google.android.gms.auth.api.signin.internal.g();
    }
}
