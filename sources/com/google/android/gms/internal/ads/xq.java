package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

final class xq implements ye2 {
    private static final Pattern q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> r = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    private SSLSocketFactory f5478a = new ar(this);

    /* renamed from: b  reason: collision with root package name */
    private final int f5479b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5480c;
    private final String d;
    private final hf2 e;
    private final nf2<? super xq> f;
    private ze2 g;
    private HttpURLConnection h;
    private InputStream i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;
    private int o;
    private Set<Socket> p = new HashSet();

    xq(String str, nf2<? super xq> nf2, int i2, int i3, int i4) {
        mf2.a(str);
        this.d = str;
        this.f = nf2;
        this.e = new hf2();
        this.f5479b = i2;
        this.f5480c = i3;
        this.o = i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(java.net.HttpURLConnection r9) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq.a(java.net.HttpURLConnection):long");
    }

    private final void a() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                co.b("Unexpected error while disconnecting", e2);
            }
            this.h = null;
        }
    }

    /* access modifiers changed from: private */
    public final void a(Socket socket) {
        this.p.add(socket);
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final int a(byte[] bArr, int i2, int i3) {
        try {
            if (this.m != this.k) {
                byte[] andSet = r.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.m != this.k) {
                    int read = this.i.read(andSet, 0, (int) Math.min(this.k - this.m, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.m += (long) read;
                        if (this.f != null) {
                            this.f.a(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                r.set(andSet);
            }
            if (i3 == 0) {
                return 0;
            }
            if (this.l != -1) {
                long j2 = this.l - this.n;
                if (j2 == 0) {
                    return -1;
                }
                i3 = (int) Math.min((long) i3, j2);
            }
            int read2 = this.i.read(bArr, i2, i3);
            if (read2 != -1) {
                this.n += (long) read2;
                if (this.f != null) {
                    this.f.a(this, read2);
                }
                return read2;
            } else if (this.l == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            throw new ff2(e2, this.g, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x012b A[EDGE_INSN: B:118:0x012b->B:50:0x012b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d9 A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e6 A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e8 A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ee A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0121 A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017f  */
    @Override // com.google.android.gms.internal.ads.ye2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.internal.ads.ze2 r24) {
        /*
        // Method dump skipped, instructions count: 612
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq.a(com.google.android.gms.internal.ads.ze2):long");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.o = i2;
        for (Socket socket : this.p) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.o);
                } catch (SocketException e2) {
                    co.c("Failed to update receive buffer size.", e2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r3 > 2048) goto L_0x003a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    @Override // com.google.android.gms.internal.ads.ye2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq.close():void");
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final Uri l0() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
