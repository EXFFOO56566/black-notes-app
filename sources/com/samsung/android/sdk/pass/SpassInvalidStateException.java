package com.samsung.android.sdk.pass;

public class SpassInvalidStateException extends IllegalStateException {
    public static final int STATUS_OPERATION_DENIED = 1;

    /* renamed from: a  reason: collision with root package name */
    private int f6058a = 0;

    public SpassInvalidStateException(String str, int i) {
        super(str);
        this.f6058a = i;
    }

    public int getType() {
        return this.f6058a;
    }
}
