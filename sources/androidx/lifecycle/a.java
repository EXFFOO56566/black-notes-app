package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class a {

    /* renamed from: c  reason: collision with root package name */
    static a f921c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class, C0046a> f922a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class, Boolean> f923b = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    public static class C0046a {

        /* renamed from: a  reason: collision with root package name */
        final Map<e.a, List<b>> f924a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, e.a> f925b;

        C0046a(Map<b, e.a> map) {
            this.f925b = map;
            for (Map.Entry<b, e.a> entry : map.entrySet()) {
                e.a value = entry.getValue();
                List<b> list = this.f924a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f924a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void a(List<b> list, h hVar, e.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(hVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, e.a aVar, Object obj) {
            a(this.f924a.get(aVar), hVar, aVar, obj);
            a(this.f924a.get(e.a.ON_ANY), hVar, aVar, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f926a;

        /* renamed from: b  reason: collision with root package name */
        final Method f927b;

        b(int i, Method method) {
            this.f926a = i;
            this.f927b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, e.a aVar, Object obj) {
            try {
                int i = this.f926a;
                if (i == 0) {
                    this.f927b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f927b.invoke(obj, hVar);
                } else if (i == 2) {
                    this.f927b.invoke(obj, hVar, aVar);
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f926a == bVar.f926a && this.f927b.getName().equals(bVar.f927b.getName());
        }

        public int hashCode() {
            return (this.f926a * 31) + this.f927b.getName().hashCode();
        }
    }

    a() {
    }

    private C0046a a(Class cls, Method[] methodArr) {
        int i;
        C0046a a2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a2 = a(superclass)) == null)) {
            hashMap.putAll(a2.f925b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, e.a> entry : a(cls2).f925b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            o oVar = (o) method.getAnnotation(o.class);
            if (oVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(h.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                e.a value = oVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(e.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == e.a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0046a aVar = new C0046a(hashMap);
        this.f922a.put(cls, aVar);
        this.f923b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private void a(Map<b, e.a> map, b bVar, e.a aVar, Class cls) {
        e.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f927b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    private Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    public C0046a a(Class cls) {
        C0046a aVar = this.f922a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    /* access modifiers changed from: package-private */
    public boolean b(Class cls) {
        Boolean bool = this.f923b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c2 = c(cls);
        for (Method method : c2) {
            if (((o) method.getAnnotation(o.class)) != null) {
                a(cls, c2);
                return true;
            }
        }
        this.f923b.put(cls, false);
        return false;
    }
}
