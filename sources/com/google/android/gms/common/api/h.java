package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.r;

public final class h {

    private static final class a<R extends k> extends BasePendingResult<R> {
        private final R o;

        public a(f fVar, R r) {
            super(fVar);
            this.o = r;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public final R a(Status status) {
            return this.o;
        }
    }

    public static g<Status> a(Status status, f fVar) {
        r.a(status, "Result must not be null");
        o oVar = new o(fVar);
        oVar.a((k) status);
        return oVar;
    }

    public static <R extends k> g<R> a(R r, f fVar) {
        r.a(r, "Result must not be null");
        r.a(!r.a().i(), "Status code must not be SUCCESS");
        a aVar = new a(fVar, r);
        aVar.a(r);
        return aVar;
    }
}
