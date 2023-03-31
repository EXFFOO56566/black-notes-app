package androidx.fragment.app;

import androidx.lifecycle.e;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<a> f873a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    int f874b;

    /* renamed from: c  reason: collision with root package name */
    int f875c;
    int d;
    int e;
    int f;
    int g;
    boolean h;
    String i;
    int j;
    CharSequence k;
    int l;
    CharSequence m;
    ArrayList<String> n;
    ArrayList<String> o;
    boolean p = false;
    ArrayList<Runnable> q;

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f876a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f877b;

        /* renamed from: c  reason: collision with root package name */
        int f878c;
        int d;
        int e;
        int f;
        e.b g;
        e.b h;

        a() {
        }

        a(int i, Fragment fragment) {
            this.f876a = i;
            this.f877b = fragment;
            e.b bVar = e.b.RESUMED;
            this.g = bVar;
            this.h = bVar;
        }
    }

    public abstract int a();

    public n a(Fragment fragment) {
        a(new a(3, fragment));
        return this;
    }

    public n a(Fragment fragment, String str) {
        a(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.y;
            if (str2 == null || str.equals(str2)) {
                fragment.y = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.y + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.w;
                if (i4 == 0 || i4 == i2) {
                    fragment.w = i2;
                    fragment.x = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.w + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        a(new a(i3, fragment));
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f873a.add(aVar);
        aVar.f878c = this.f874b;
        aVar.d = this.f875c;
        aVar.e = this.d;
        aVar.f = this.e;
    }

    public abstract int b();
}
