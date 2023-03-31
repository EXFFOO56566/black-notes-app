package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public final class bf2 implements ye2 {
    private static final Pattern o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> p = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1940a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1941b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1942c;
    private final String d;
    private final hf2 e = new hf2();
    private final nf2<? super bf2> f;
    private ze2 g;
    private HttpURLConnection h;
    private InputStream i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;

    public bf2(String str, zf2<String> zf2, nf2<? super bf2> nf2, int i2, int i3, boolean z, hf2 hf2) {
        mf2.a(str);
        this.d = str;
        this.f = nf2;
        this.f1941b = i2;
        this.f1942c = i3;
        this.f1940a = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(java.net.HttpURLConnection r10) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bf2.a(java.net.HttpURLConnection):long");
    }

    private final HttpURLConnection a(URL url, byte[] bArr, long j2, long j3, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f1941b);
        httpURLConnection.setReadTimeout(this.f1942c);
        for (Map.Entry<String, String> entry : this.e.a().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        if (!(j2 == 0 && j3 == -1)) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            String sb2 = sb.toString();
            if (j3 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append((j2 + j3) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final void b() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.h = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final int a(byte[] bArr, int i2, int i3) {
        try {
            if (this.m != this.k) {
                byte[] andSet = p.getAndSet(null);
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
                p.set(andSet);
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

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c9  */
    @Override // com.google.android.gms.internal.ads.ye2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.internal.ads.ze2 r25) {
        /*
        // Method dump skipped, instructions count: 429
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bf2.a(com.google.android.gms.internal.ads.ze2):long");
    }

    public final Map<String, List<String>> a() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
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
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bf2.close():void");
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
