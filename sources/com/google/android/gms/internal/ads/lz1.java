package com.google.android.gms.internal.ads;

public enum lz1 {
    DOUBLE(0, oz1.SCALAR, d02.DOUBLE),
    FLOAT(1, oz1.SCALAR, d02.FLOAT),
    INT64(2, oz1.SCALAR, d02.LONG),
    UINT64(3, oz1.SCALAR, d02.LONG),
    INT32(4, oz1.SCALAR, d02.INT),
    FIXED64(5, oz1.SCALAR, d02.LONG),
    FIXED32(6, oz1.SCALAR, d02.INT),
    BOOL(7, oz1.SCALAR, d02.BOOLEAN),
    STRING(8, oz1.SCALAR, d02.STRING),
    MESSAGE(9, oz1.SCALAR, d02.MESSAGE),
    BYTES(10, oz1.SCALAR, d02.BYTE_STRING),
    UINT32(11, oz1.SCALAR, d02.INT),
    ENUM(12, oz1.SCALAR, d02.ENUM),
    SFIXED32(13, oz1.SCALAR, d02.INT),
    SFIXED64(14, oz1.SCALAR, d02.LONG),
    SINT32(15, oz1.SCALAR, d02.INT),
    SINT64(16, oz1.SCALAR, d02.LONG),
    GROUP(17, oz1.SCALAR, d02.MESSAGE),
    DOUBLE_LIST(18, oz1.VECTOR, d02.DOUBLE),
    FLOAT_LIST(19, oz1.VECTOR, d02.FLOAT),
    INT64_LIST(20, oz1.VECTOR, d02.LONG),
    UINT64_LIST(21, oz1.VECTOR, d02.LONG),
    INT32_LIST(22, oz1.VECTOR, d02.INT),
    FIXED64_LIST(23, oz1.VECTOR, d02.LONG),
    FIXED32_LIST(24, oz1.VECTOR, d02.INT),
    BOOL_LIST(25, oz1.VECTOR, d02.BOOLEAN),
    STRING_LIST(26, oz1.VECTOR, d02.STRING),
    MESSAGE_LIST(27, oz1.VECTOR, d02.MESSAGE),
    BYTES_LIST(28, oz1.VECTOR, d02.BYTE_STRING),
    UINT32_LIST(29, oz1.VECTOR, d02.INT),
    ENUM_LIST(30, oz1.VECTOR, d02.ENUM),
    SFIXED32_LIST(31, oz1.VECTOR, d02.INT),
    SFIXED64_LIST(32, oz1.VECTOR, d02.LONG),
    SINT32_LIST(33, oz1.VECTOR, d02.INT),
    SINT64_LIST(34, oz1.VECTOR, d02.LONG),
    DOUBLE_LIST_PACKED(35, oz1.PACKED_VECTOR, d02.DOUBLE),
    FLOAT_LIST_PACKED(36, oz1.PACKED_VECTOR, d02.FLOAT),
    INT64_LIST_PACKED(37, oz1.PACKED_VECTOR, d02.LONG),
    UINT64_LIST_PACKED(38, oz1.PACKED_VECTOR, d02.LONG),
    INT32_LIST_PACKED(39, oz1.PACKED_VECTOR, d02.INT),
    FIXED64_LIST_PACKED(40, oz1.PACKED_VECTOR, d02.LONG),
    FIXED32_LIST_PACKED(41, oz1.PACKED_VECTOR, d02.INT),
    BOOL_LIST_PACKED(42, oz1.PACKED_VECTOR, d02.BOOLEAN),
    UINT32_LIST_PACKED(43, oz1.PACKED_VECTOR, d02.INT),
    ENUM_LIST_PACKED(44, oz1.PACKED_VECTOR, d02.ENUM),
    SFIXED32_LIST_PACKED(45, oz1.PACKED_VECTOR, d02.INT),
    SFIXED64_LIST_PACKED(46, oz1.PACKED_VECTOR, d02.LONG),
    SINT32_LIST_PACKED(47, oz1.PACKED_VECTOR, d02.INT),
    SINT64_LIST_PACKED(48, oz1.PACKED_VECTOR, d02.LONG),
    GROUP_LIST(49, oz1.VECTOR, d02.MESSAGE),
    MAP(50, oz1.MAP, d02.VOID);
    
    private static final lz1[] b0;

    /* renamed from: b  reason: collision with root package name */
    private final int f3631b;

    static {
        lz1[] values = values();
        b0 = new lz1[values.length];
        for (lz1 lz1 : values) {
            b0[lz1.f3631b] = lz1;
        }
    }

    private lz1(int i, oz1 oz1, d02 d02) {
        int i2;
        this.f3631b = i;
        int i3 = kz1.f3473a[oz1.ordinal()];
        if (i3 == 1 || i3 == 2) {
            d02.b();
        }
        if (oz1 == oz1.SCALAR && (i2 = kz1.f3474b[d02.ordinal()]) != 1 && i2 != 2) {
        }
    }

    public final int b() {
        return this.f3631b;
    }
}
