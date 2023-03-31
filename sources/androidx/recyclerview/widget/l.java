package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* access modifiers changed from: package-private */
public class l {

    /* renamed from: a  reason: collision with root package name */
    final a f1092a;

    /* access modifiers changed from: package-private */
    public interface a {
        a.b a(int i, int i2, int i3, Object obj);

        void a(a.b bVar);
    }

    l(a aVar) {
        this.f1092a = aVar;
    }

    private void a(List<a.b> list, int i, int i2) {
        a.b bVar = list.get(i);
        a.b bVar2 = list.get(i2);
        int i3 = bVar2.f1020a;
        if (i3 == 1) {
            c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            a(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            b(list, i, bVar, i2, bVar2);
        }
    }

    private int b(List<a.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f1020a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int i, a.b bVar, int i2, a.b bVar2) {
        int i3 = bVar.d < bVar2.f1021b ? -1 : 0;
        if (bVar.f1021b < bVar2.f1021b) {
            i3++;
        }
        int i4 = bVar2.f1021b;
        int i5 = bVar.f1021b;
        if (i4 <= i5) {
            bVar.f1021b = i5 + bVar2.d;
        }
        int i6 = bVar2.f1021b;
        int i7 = bVar.d;
        if (i6 <= i7) {
            bVar.d = i7 + bVar2.d;
        }
        bVar2.f1021b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: package-private */
    public void a(List<a.b> list) {
        while (true) {
            int b2 = b(list);
            if (b2 != -1) {
                a(list, b2, b2 + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
        if (r0 > r14.f1021b) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c8, code lost:
        if (r0 >= r14.f1021b) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.List<androidx.recyclerview.widget.a.b> r10, int r11, androidx.recyclerview.widget.a.b r12, int r13, androidx.recyclerview.widget.a.b r14) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.a(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.util.List<androidx.recyclerview.widget.a.b> r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.d
            int r1 = r13.f1021b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f1021b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.d = r5
            androidx.recyclerview.widget.l$a r0 = r8.f1092a
            int r1 = r11.f1021b
            java.lang.Object r5 = r13.f1022c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f1021b
            int r5 = r13.f1021b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f1021b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.l$a r3 = r8.f1092a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f1022c
            androidx.recyclerview.widget.a$b r3 = r3.a(r2, r1, r5, r4)
            int r1 = r13.d
            int r1 = r1 - r5
            r13.d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.l$a r11 = r8.f1092a
            r11.a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.b(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
