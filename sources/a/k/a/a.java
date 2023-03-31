package a.k.a;

import a.k.b.b;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {

    /* renamed from: a.k.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0026a<D> {
        b<D> a(int i, Bundle bundle);

        void a(b<D> bVar);

        void a(b<D> bVar, D d);
    }

    public static <T extends h & t> a a(T t) {
        return new b(t, t.e());
    }

    public abstract <D> b<D> a(int i, Bundle bundle, AbstractC0026a<D> aVar);

    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
