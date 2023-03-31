package b.c.b.a.e.b;

import android.util.Base64;
import java.util.Random;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Random f1190a = new Random();

    public static String a() {
        byte[] bArr = new byte[16];
        f1190a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
