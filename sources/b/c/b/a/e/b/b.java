package b.c.b.a.e.b;

import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public final class b {
    @NonNullDecl
    public static <T> T a(@NonNullDecl T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }
}
