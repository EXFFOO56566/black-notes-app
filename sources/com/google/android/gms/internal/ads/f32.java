package com.google.android.gms.internal.ads;

public enum f32 {
    DOUBLE(m32.DOUBLE, 1),
    FLOAT(m32.FLOAT, 5),
    INT64(m32.LONG, 0),
    UINT64(m32.LONG, 0),
    INT32(m32.INT, 0),
    FIXED64(m32.LONG, 1),
    FIXED32(m32.INT, 5),
    BOOL(m32.BOOLEAN, 0),
    STRING(m32.STRING, 2) {
    },
    GROUP(m32.MESSAGE, 3) {
    },
    MESSAGE(m32.MESSAGE, 2) {
    },
    BYTES(m32.BYTE_STRING, 2) {
    },
    UINT32(m32.INT, 0),
    ENUM(m32.ENUM, 0),
    SFIXED32(m32.INT, 5),
    SFIXED64(m32.LONG, 1),
    SINT32(m32.INT, 0),
    SINT64(m32.LONG, 0);
    

    /* renamed from: b  reason: collision with root package name */
    private final m32 f2527b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2528c;

    private f32(m32 m32, int i) {
        this.f2527b = m32;
        this.f2528c = i;
    }

    /* synthetic */ f32(m32 m32, int i, g32 g32) {
        this(m32, i);
    }

    public final m32 b() {
        return this.f2527b;
    }

    public final int c() {
        return this.f2528c;
    }
}
