package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class ba implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, yb> f1899a;

    /* renamed from: b  reason: collision with root package name */
    private long f1900b;

    /* renamed from: c  reason: collision with root package name */
    private final ud f1901c;
    private final int d;

    public ba(ud udVar) {
        this(udVar, 5242880);
    }

    private ba(ud udVar, int i) {
        this.f1899a = new LinkedHashMap(16, 0.75f, true);
        this.f1900b = 0;
        this.f1901c = udVar;
        this.d = 5242880;
    }

    public ba(File file, int i) {
        this.f1899a = new LinkedHashMap(16, 0.75f, true);
        this.f1900b = 0;
        this.f1901c = new vc(this, file);
        this.d = 20971520;
    }

    private static int a(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static InputStream a(File file) {
        return new FileInputStream(file);
    }

    static String a(ve veVar) {
        return new String(a(veVar, c(veVar)), "UTF-8");
    }

    static void a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final void a(String str, yb ybVar) {
        if (!this.f1899a.containsKey(str)) {
            this.f1900b += ybVar.f5567a;
        } else {
            this.f1900b += ybVar.f5567a - this.f1899a.get(str).f5567a;
        }
        this.f1899a.put(str, ybVar);
    }

    private static byte[] a(ve veVar, long j) {
        long a2 = veVar.a();
        if (j >= 0 && j <= a2) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(veVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a2);
        throw new IOException(sb.toString());
    }

    static int b(InputStream inputStream) {
        return (a(inputStream) << 24) | a(inputStream) | 0 | (a(inputStream) << 8) | (a(inputStream) << 16);
    }

    static List<bb2> b(ve veVar) {
        int b2 = b((InputStream) veVar);
        if (b2 >= 0) {
            List<bb2> emptyList = b2 == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < b2; i++) {
                emptyList.add(new bb2(a(veVar).intern(), a(veVar).intern()));
            }
            return emptyList;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("readHeaderList size=");
        sb.append(b2);
        throw new IOException(sb.toString());
    }

    private final synchronized void b(String str) {
        boolean delete = e(str).delete();
        c(str);
        if (!delete) {
            c5.a("Could not delete cache entry for key=%s, filename=%s", str, d(str));
        }
    }

    static long c(InputStream inputStream) {
        return (((long) a(inputStream)) & 255) | 0 | ((((long) a(inputStream)) & 255) << 8) | ((((long) a(inputStream)) & 255) << 16) | ((((long) a(inputStream)) & 255) << 24) | ((((long) a(inputStream)) & 255) << 32) | ((((long) a(inputStream)) & 255) << 40) | ((((long) a(inputStream)) & 255) << 48) | ((255 & ((long) a(inputStream))) << 56);
    }

    private final void c(String str) {
        yb remove = this.f1899a.remove(str);
        if (remove != null) {
            this.f1900b -= remove.f5567a;
        }
    }

    private static String d(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File e(String str) {
        return new File(this.f1901c.a(), d(str));
    }

    @Override // com.google.android.gms.internal.ads.a
    public final synchronized void L() {
        File a2 = this.f1901c.a();
        if (!a2.exists()) {
            if (!a2.mkdirs()) {
                c5.b("Unable to create cache dir %s", a2.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = a2.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    long length = file.length();
                    ve veVar = new ve(new BufferedInputStream(a(file)), length);
                    try {
                        yb a3 = yb.a(veVar);
                        a3.f5567a = length;
                        a(a3.f5568b, a3);
                    } finally {
                        veVar.close();
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a
    public final synchronized m61 a(String str) {
        yb ybVar = this.f1899a.get(str);
        if (ybVar == null) {
            return null;
        }
        File e = e(str);
        try {
            ve veVar = new ve(new BufferedInputStream(a(e)), e.length());
            try {
                yb a2 = yb.a(veVar);
                if (!TextUtils.equals(str, a2.f5568b)) {
                    c5.a("%s: key=%s, found=%s", e.getAbsolutePath(), str, a2.f5568b);
                    c(str);
                    return null;
                }
                byte[] a3 = a(veVar, veVar.a());
                m61 m61 = new m61();
                m61.f3669a = a3;
                m61.f3670b = ybVar.f5569c;
                m61.f3671c = ybVar.d;
                m61.d = ybVar.e;
                m61.e = ybVar.f;
                m61.f = ybVar.g;
                List<bb2> list = ybVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (bb2 bb2 : list) {
                    treeMap.put(bb2.a(), bb2.b());
                }
                m61.g = treeMap;
                m61.h = Collections.unmodifiableList(ybVar.h);
                veVar.close();
                return m61;
            } finally {
                veVar.close();
            }
        } catch (IOException e2) {
            c5.a("%s: %s", e.getAbsolutePath(), e2.toString());
            b(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.a
    public final synchronized void a(String str, m61 m61) {
        long j;
        if (this.f1900b + ((long) m61.f3669a.length) > ((long) this.d)) {
            if (((float) m61.f3669a.length) > ((float) this.d) * 0.9f) {
                return;
            }
        }
        File e = e(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
            yb ybVar = new yb(str, m61);
            if (ybVar.a(bufferedOutputStream)) {
                bufferedOutputStream.write(m61.f3669a);
                bufferedOutputStream.close();
                ybVar.f5567a = e.length();
                a(str, ybVar);
                if (this.f1900b >= ((long) this.d)) {
                    if (c5.f2060b) {
                        c5.c("Pruning old cache entries.", new Object[0]);
                    }
                    long j2 = this.f1900b;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator<Map.Entry<String, yb>> it = this.f1899a.entrySet().iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            j = j2;
                            break;
                        }
                        yb value = it.next().getValue();
                        if (e(value.f5568b).delete()) {
                            j = j2;
                            this.f1900b -= value.f5567a;
                        } else {
                            j = j2;
                            c5.a("Could not delete cache entry for key=%s, filename=%s", value.f5568b, d(value.f5568b));
                        }
                        it.remove();
                        i++;
                        if (((float) this.f1900b) < ((float) this.d) * 0.9f) {
                            break;
                        }
                        j2 = j;
                    }
                    if (c5.f2060b) {
                        c5.c("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f1900b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    }
                }
                return;
            }
            bufferedOutputStream.close();
            c5.a("Failed to write header for %s", e.getAbsolutePath());
            throw new IOException();
        } catch (IOException unused) {
            if (!e.delete()) {
                c5.a("Could not clean up file %s", e.getAbsolutePath());
            }
        }
    }
}
