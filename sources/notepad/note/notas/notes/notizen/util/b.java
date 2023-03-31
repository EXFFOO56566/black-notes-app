package notepad.note.notas.notes.notizen.util;

public class b {
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002e A[SYNTHETIC, Splitter:B:22:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003a A[SYNTHETIC, Splitter:B:28:0x003a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0027 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0027 }
            int r3 = r1.available()     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            if (r3 <= 0) goto L_0x0011
            byte[] r0 = new byte[r3]     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            r1.read(r0)     // Catch:{ IOException -> 0x0020, all -> 0x001d }
        L_0x0011:
            r1.close()     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            r1.close()     // Catch:{ IOException -> 0x0018 }
            goto L_0x0037
        L_0x0018:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x0037
        L_0x001d:
            r3 = move-exception
            r0 = r1
            goto L_0x0038
        L_0x0020:
            r3 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x0029
        L_0x0025:
            r3 = move-exception
            goto L_0x0038
        L_0x0027:
            r3 = move-exception
            r1 = r0
        L_0x0029:
            r3.printStackTrace()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0036
            r0.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0036:
            r0 = r1
        L_0x0037:
            return r0
        L_0x0038:
            if (r0 == 0) goto L_0x0042
            r0.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0042:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: notepad.note.notas.notes.notizen.util.b.a(java.lang.String):byte[]");
    }
}
