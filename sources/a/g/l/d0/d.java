package a.g.l.d0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f221a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final d f222a;

        a(d dVar) {
            this.f222a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            c a2 = this.f222a.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.u();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<c> a2 = this.f222a.a(str, i);
            if (a2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(a2.get(i2).u());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f222a.a(i, i2, bundle);
        }
    }

    static class b extends a {
        b(d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            c b2 = this.f222a.b(i);
            if (b2 == null) {
                return null;
            }
            return b2.u();
        }
    }

    public d() {
        int i = Build.VERSION.SDK_INT;
        this.f221a = i >= 19 ? new b(this) : i >= 16 ? new a(this) : null;
    }

    public d(Object obj) {
        this.f221a = obj;
    }

    public c a(int i) {
        return null;
    }

    public Object a() {
        return this.f221a;
    }

    public List<c> a(String str, int i) {
        return null;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public c b(int i) {
        return null;
    }
}
