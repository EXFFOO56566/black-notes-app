package a.g.l;

import a.g.b;
import a.g.l.d0.c;
import a.g.l.d0.d;
import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f199c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f200a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f201b;

    /* access modifiers changed from: package-private */
    /* renamed from: a.g.l.a$a  reason: collision with other inner class name */
    public static final class C0016a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final a f202a;

        C0016a(a aVar) {
            this.f202a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f202a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            d a2 = this.f202a.a(view);
            if (a2 != null) {
                return (AccessibilityNodeProvider) a2.a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f202a.b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            c a2 = c.a(accessibilityNodeInfo);
            a2.j(u.F(view));
            a2.i(u.A(view));
            a2.f(u.e(view));
            this.f202a.a(view, a2);
            a2.a(accessibilityNodeInfo.getText(), view);
            List<c.a> b2 = a.b(view);
            for (int i = 0; i < b2.size(); i++) {
                a2.a(b2.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f202a.c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f202a.a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f202a.a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f202a.a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f202a.d(view, accessibilityEvent);
        }
    }

    public a() {
        this(f199c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f200a = accessibilityDelegate;
        this.f201b = new C0016a(this);
    }

    private boolean a(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(b.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!a(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    private boolean a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] h = c.h(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (h != null && i < h.length) {
                if (clickableSpan.equals(h[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    static List<c.a> b(View view) {
        List<c.a> list = (List) view.getTag(b.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public d a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f200a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new d(accessibilityNodeProvider);
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate a() {
        return this.f201b;
    }

    public void a(View view, int i) {
        this.f200a.sendAccessibilityEvent(view, i);
    }

    public void a(View view, c cVar) {
        this.f200a.onInitializeAccessibilityNodeInfo(view, cVar.u());
    }

    public boolean a(View view, int i, Bundle bundle) {
        List<c.a> b2 = b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b2.size()) {
                break;
            }
            c.a aVar = b2.get(i2);
            if (aVar.a() == i) {
                z = aVar.a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f200a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != b.accessibility_action_clickable_span) ? z : a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f200a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f200a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f200a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f200a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.f200a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
