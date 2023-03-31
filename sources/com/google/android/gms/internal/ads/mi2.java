package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class mi2 {
    private static long a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        return (i % 2 == 0 ? a((j * j) % 1073807359, i / 2) : j * (a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    private static String a(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            co.b("Unable to construct shingle");
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    private static void a(int i, long j, String str, int i2, PriorityQueue<li2> priorityQueue) {
        li2 li2 = new li2(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f3563c <= li2.f3563c && priorityQueue.peek().f3561a <= li2.f3561a)) && !priorityQueue.contains(li2)) {
            priorityQueue.add(li2);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void a(String[] strArr, int i, int i2, PriorityQueue<li2> priorityQueue) {
        if (strArr.length < i2) {
            a(i, b(strArr, 0, strArr.length), a(strArr, 0, strArr.length), strArr.length, priorityQueue);
            return;
        }
        long b2 = b(strArr, 0, i2);
        a(i, b2, a(strArr, 0, i2), i2, priorityQueue);
        long a2 = a(16785407, i2 - 1);
        for (int i3 = 1; i3 < (strArr.length - i2) + 1; i3++) {
            long j = b2 + 1073807359;
            b2 = (((((j - ((((((long) gi2.a(strArr[i3 - 1])) + 2147483647L) % 1073807359) * a2) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) gi2.a(strArr[(i3 + i2) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            a(i, b2, a(strArr, i3, i2), strArr.length, priorityQueue);
        }
    }

    private static long b(String[] strArr, int i, int i2) {
        long a2 = (((long) gi2.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a2 = (((a2 * 16785407) % 1073807359) + ((((long) gi2.a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a2;
    }
}
