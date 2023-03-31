package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class hs extends wr {
    private static final Set<String> g = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat h = new DecimalFormat("#,###");
    private File e;
    private boolean f;

    public hs(gq gqVar) {
        super(gqVar);
        File cacheDir = this.f5309b.getCacheDir();
        if (cacheDir == null) {
            co.d("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.e = file;
        if (!file.isDirectory() && !this.e.mkdirs()) {
            String valueOf = String.valueOf(this.e.getAbsolutePath());
            co.d(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.e = null;
        } else if (!this.e.setReadable(true, false) || !this.e.setExecutable(true, false)) {
            String valueOf2 = String.valueOf(this.e.getAbsolutePath());
            co.d(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.e = null;
        }
    }

    private final File a(File file) {
        return new File(this.e, String.valueOf(file.getName()).concat(".done"));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:276:0x03fc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:200:0x04d3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:163:0x03bb */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [int] */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ec, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ee, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f4, code lost:
        if (r1 < 400) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f6, code lost:
        r15 = "badUrl";
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0206, code lost:
        if (r2.length() == 0) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0208, code lost:
        r2 = "HTTP request failed. Code: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020e, code lost:
        r2 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r4.append("HTTP status code ");
        r4.append(r1);
        r4.append(" at ");
        r4.append(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023b, code lost:
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x023c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0240, code lost:
        r7 = r5.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0244, code lost:
        if (r7 >= 0) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0246, code lost:
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0250, code lost:
        if (r1.length() == 0) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0252, code lost:
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0257, code lost:
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x025d, code lost:
        com.google.android.gms.internal.ads.co.d(r0);
        a(r31, r12.getAbsolutePath(), "contentLengthMissing", null);
        com.google.android.gms.internal.ads.hs.g.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x026e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x026f, code lost:
        r1 = com.google.android.gms.internal.ads.hs.h.format((long) r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.on2.e().a(com.google.android.gms.internal.ads.zr2.m)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0286, code lost:
        if (r7 <= r3) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0288, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r31);
        com.google.android.gms.internal.ads.co.d(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c1, code lost:
        if (r1.length() == 0) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c3, code lost:
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02c8, code lost:
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ce, code lost:
        a(r31, r12.getAbsolutePath(), "sizeExceeded", r0);
        com.google.android.gms.internal.ads.hs.g.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02dc, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02dd, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r31);
        com.google.android.gms.internal.ads.co.a(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.q.j();
        r17 = r16.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0336, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r6 = new com.google.android.gms.internal.ads.in(((java.lang.Long) com.google.android.gms.internal.ads.on2.e().a(com.google.android.gms.internal.ads.zr2.p)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.on2.e().a(com.google.android.gms.internal.ads.zr2.o)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0350, code lost:
        r20 = r5.read(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0354, code lost:
        if (r20 < 0) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0356, code lost:
        r11 = r11 + r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0358, code lost:
        if (r11 <= r3) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x035a, code lost:
        r15 = "sizeExceeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x036a, code lost:
        if (r1.length() == 0) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x036c, code lost:
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0372, code lost:
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x037e, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x037f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0382, code lost:
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0385, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0388, code lost:
        r1 = r10;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x038a, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r1.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0394, code lost:
        if (r2.write(r1) > 0) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0396, code lost:
        r1.clear();
        r24 = ((r16.a() - r17) > (1000 * r13) ? 1 : ((r16.a() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a5, code lost:
        if (r24 > 0) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ab, code lost:
        if (r30.f != false) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b1, code lost:
        if (r6.a() == false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03b9, code lost:
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03bd, code lost:
        r24 = r10;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        com.google.android.gms.internal.ads.sn.f4682b.post(new com.google.android.gms.internal.ads.zr(r30, r31, r12.getAbsolutePath(), r11, r7, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03e4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03e5, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ea, code lost:
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03fc, code lost:
        r6 = r19;
        r1 = r1;
        r5 = r21;
        r15 = r22;
        r10 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0410, code lost:
        r27 = r4;
        r24 = r10;
        r15 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x041f, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0420, code lost:
        r15 = "downloadTimeout";
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0453, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0454, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0457, code lost:
        r2 = r2.toString();
        r1 = r10;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x045e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0466, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0469, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0470, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x047f, code lost:
        if (com.google.android.gms.internal.ads.co.a(3) == false) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0481, code lost:
        r1 = com.google.android.gms.internal.ads.hs.h.format((long) r11);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r31);
        com.google.android.gms.internal.ads.co.a(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04b8, code lost:
        r0 = e;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04ba, code lost:
        r0 = e;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04bb, code lost:
        r15 = r22;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04bd, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04c0, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04c9, code lost:
        if (r0.isFile() == false) goto L_0x04d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04cb, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r0.createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04ed, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04f2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04f5, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04f9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04fc, code lost:
        r27 = r4;
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0505, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x050f, code lost:
        throw new java.io.IOException("Invalid protocol.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x051a, code lost:
        throw new java.io.IOException("Too many redirects (20)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x051b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x051e, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0521, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0524, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0527, code lost:
        r2 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x052d, code lost:
        com.google.android.gms.ads.internal.q.g().a(r0, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x053f, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 26);
        r3.append("Preload aborted for URL \"");
        r3.append(r31);
        r3.append("\"");
        com.google.android.gms.internal.ads.co.c(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0563, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 25);
        r4.append("Preload failed for URL \"");
        r4.append(r31);
        r4.append("\"");
        com.google.android.gms.internal.ads.co.c(r4.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05a2, code lost:
        r0 = "Could not delete partial cache file at ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05a7, code lost:
        r0 = new java.lang.String("Could not delete partial cache file at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012c, code lost:
        r15 = "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.google.android.gms.ads.internal.q.o();
        r1 = ((java.lang.Integer) com.google.android.gms.internal.ads.on2.e().a(com.google.android.gms.internal.ads.zr2.q)).intValue();
        r2 = new java.net.URL(r31);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0147, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014a, code lost:
        if (r3 > 20) goto L_0x0510;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014c, code lost:
        r5 = r2.openConnection();
        r5.setConnectTimeout(r1);
        r5.setReadTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0158, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015a, code lost:
        r5 = (java.net.HttpURLConnection) r5;
        r6 = new com.google.android.gms.internal.ads.wn();
        r6.a(r5, (byte[]) null);
        r5.setInstanceFollowRedirects(false);
        r7 = r5.getResponseCode();
        r6.a(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0171, code lost:
        if ((r7 / 100) != 3) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4 = r5.getHeaderField("Location");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0179, code lost:
        if (r4 == null) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017b, code lost:
        r6 = new java.net.URL(r2, r4);
        r2 = r6.getProtocol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0184, code lost:
        if (r2 == null) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018c, code lost:
        if (r2.equals("http") != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0194, code lost:
        if (r2.equals("https") != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0196, code lost:
        r2 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        if (r2.length() == 0) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a4, code lost:
        r1 = "Unsupported scheme: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a9, code lost:
        r1 = new java.lang.String("Unsupported scheme: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b2, code lost:
        throw new java.io.IOException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b3, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bd, code lost:
        if (r4.length() == 0) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01bf, code lost:
        r2 = "Redirecting to ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c4, code lost:
        r2 = new java.lang.String("Redirecting to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ca, code lost:
        com.google.android.gms.internal.ads.co.a(r2);
        r5.disconnect();
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01da, code lost:
        throw new java.io.IOException("Protocol is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e2, code lost:
        throw new java.io.IOException("Missing Location header in redirect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e6, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e7, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04b8 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r22 r24 r27 
      PHI: (r22v7 java.lang.String) = (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v15 java.lang.String), (r22v15 java.lang.String) binds: [B:200:0x04d3, B:201:?, B:163:0x03bb, B:166:0x03db] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v3 ??) = (r24v0 ??), (r24v0 ??), (r24v4 ??), (r24v10 ??) binds: [B:200:0x04d3, B:201:?, B:163:0x03bb, B:166:0x03db] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v9 java.io.FileOutputStream) = (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v13 java.io.FileOutputStream), (r27v17 java.io.FileOutputStream) binds: [B:200:0x04d3, B:201:?, B:163:0x03bb, B:166:0x03db] A[DONT_GENERATE, DONT_INLINE], Splitter:B:166:0x03db] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x05a7  */
    @Override // com.google.android.gms.internal.ads.wr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r31) {
        /*
        // Method dump skipped, instructions count: 1473
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hs.a(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.wr
    public final void b() {
        this.f = true;
    }
}
