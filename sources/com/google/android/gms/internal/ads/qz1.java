package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.dz1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public abstract class qz1<T extends dz1> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4419a = Logger.getLogger(xy1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static String f4420b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    qz1() {
    }

    static <T extends dz1> T a(Class<T> cls) {
        String str;
        ClassLoader classLoader = qz1.class.getClassLoader();
        if (cls.equals(dz1.class)) {
            str = f4420b;
        } else if (cls.getPackage().equals(qz1.class.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                return cls.cast(((qz1) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException(e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException(e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(qz1.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((qz1) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = f4419a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) ((dz1) arrayList.get(0));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) ((dz1) cls.getMethod("combine", Collection.class).invoke(null, arrayList));
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a();
}
