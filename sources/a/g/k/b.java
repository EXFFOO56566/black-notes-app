package a.g.k;

import android.util.Log;
import java.io.Writer;

public class b extends Writer {

    /* renamed from: b  reason: collision with root package name */
    private final String f190b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuilder f191c = new StringBuilder(128);

    public b(String str) {
        this.f190b = str;
    }

    private void a() {
        if (this.f191c.length() > 0) {
            Log.d(this.f190b, this.f191c.toString());
            StringBuilder sb = this.f191c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                a();
            } else {
                this.f191c.append(c2);
            }
        }
    }
}
