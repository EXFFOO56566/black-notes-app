package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

public final class fi2 {

    /* renamed from: a  reason: collision with root package name */
    private final int f2599a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2600b;

    /* renamed from: c  reason: collision with root package name */
    private final ci2 f2601c = new ki2();

    public fi2(int i) {
        this.f2600b = i;
        this.f2599a = 6;
    }

    private final String a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return BuildConfig.FLAVOR;
        }
        ii2 ii2 = new ii2();
        PriorityQueue priorityQueue = new PriorityQueue(this.f2600b, new ei2(this));
        for (String str2 : split) {
            String[] a2 = gi2.a(str2, false);
            if (a2.length != 0) {
                mi2.a(a2, this.f2600b, this.f2599a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ii2.a(this.f2601c.a(((li2) it.next()).f3562b));
            } catch (IOException e) {
                co.b("Error while writing hash to byteStream", e);
            }
        }
        return ii2.toString();
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return a(sb.toString());
    }
}
