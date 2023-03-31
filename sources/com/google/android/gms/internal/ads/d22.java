package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class d22 extends a22<FieldDescriptorType, Object> {
    d22(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.a22
    public final void b() {
        if (!a()) {
            for (int i = 0; i < c(); i++) {
                Map.Entry a2 = a(i);
                if (((iz1) a2.getKey()).k()) {
                    a2.setValue(Collections.unmodifiableList((List) a2.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((iz1) entry.getKey()).k()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.b();
    }
}
