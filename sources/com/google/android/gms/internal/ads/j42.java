package com.google.android.gms.internal.ads;

public abstract class j42 {
    public static j42 a(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new g42(cls.getSimpleName()) : new i42(cls.getSimpleName());
    }

    public abstract void a(String str);
}
