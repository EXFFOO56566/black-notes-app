package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

public final class u12 {

    /* renamed from: a */
    private final ArrayDeque<dy1> f4891a;

    private u12() {
        this.f4891a = new ArrayDeque<>();
    }

    /* synthetic */ u12(v12 v12) {
        this();
    }

    private static int a(int i) {
        int binarySearch = Arrays.binarySearch(s12.j, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* access modifiers changed from: public */
    private final dy1 a(dy1 dy1, dy1 dy12) {
        a(dy1);
        a(dy12);
        dy1 pop = this.f4891a.pop();
        while (!this.f4891a.isEmpty()) {
            pop = new s12(this.f4891a.pop(), pop, null);
        }
        return pop;
    }

    private final void a(dy1 dy1) {
        while (!dy1.k()) {
            if (dy1 instanceof s12) {
                s12 s12 = (s12) dy1;
                a(s12.f);
                dy1 = s12.g;
            } else {
                String valueOf = String.valueOf(dy1.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int a2 = a(dy1.size());
        int i = s12.i(a2 + 1);
        if (this.f4891a.isEmpty() || this.f4891a.peek().size() >= i) {
            this.f4891a.push(dy1);
            return;
        }
        int i2 = s12.i(a2);
        dy1 pop = this.f4891a.pop();
        while (!this.f4891a.isEmpty() && this.f4891a.peek().size() < i2) {
            pop = new s12(this.f4891a.pop(), pop, null);
        }
        s12 s122 = new s12(pop, dy1, null);
        while (!this.f4891a.isEmpty() && this.f4891a.peek().size() < s12.i(a(s122.size()) + 1)) {
            s122 = new s12(this.f4891a.pop(), s122, null);
        }
        this.f4891a.push(s122);
    }
}
