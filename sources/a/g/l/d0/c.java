package a.g.l.d0;

import a.g.l.d0.f;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class c {
    private static int d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f213a;

    /* renamed from: b  reason: collision with root package name */
    public int f214b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f215c = -1;

    public static class a {
        public static final a e = new a(16, null);
        public static final a f = new a(262144, null);
        public static final a g = new a(524288, null);
        public static final a h = new a(1048576, null);

        /* renamed from: a  reason: collision with root package name */
        final Object f216a;

        /* renamed from: b  reason: collision with root package name */
        private final int f217b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends f.a> f218c;
        protected final f d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(1, null);
            new a(2, null);
            new a(4, null);
            new a(8, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, f.b.class);
            new a(512, null, f.b.class);
            new a(1024, null, f.c.class);
            new a(2048, null, f.c.class);
            new a(4096, null);
            new a(8192, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, f.g.class);
            new a(2097152, null, f.h.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, f.e.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, f.C0020f.class);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, f.d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction, 16908357, null, null, null);
        }

        public a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        private a(int i, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i, charSequence, null, cls);
        }

        a(Object obj, int i, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f217b = i;
            this.d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f216a = obj;
            this.f218c = cls;
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f216a).getId();
            }
            return 0;
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.f217b, charSequence, fVar, this.f218c);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                a.g.l.d0.f r0 = r4.d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends a.g.l.d0.f$a> r2 = r4.f218c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                a.g.l.d0.f$a r1 = (a.g.l.d0.f.a) r1     // Catch:{ Exception -> 0x0020 }
                r1.a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends a.g.l.d0.f$a> r1 = r4.f218c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                a.g.l.d0.f r6 = r4.d
                boolean r5 = r6.a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a.g.l.d0.c.a.a(android.view.View, android.os.Bundle):boolean");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f219a;

        b(Object obj) {
            this.f219a = obj;
        }

        public static b a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b(null);
        }
    }

    /* renamed from: a.g.l.d0.c$c  reason: collision with other inner class name */
    public static class C0019c {

        /* renamed from: a  reason: collision with root package name */
        final Object f220a;

        C0019c(Object obj) {
            this.f220a = obj;
        }

        public static C0019c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C0019c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0019c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0019c(null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f213a = accessibilityNodeInfo;
    }

    private int a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    public static c a(c cVar) {
        return a(AccessibilityNodeInfo.obtain(cVar.f213a));
    }

    public static c a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private List<Integer> a(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f213a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f213a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private void a(int i, boolean z) {
        Bundle e = e();
        if (e != null) {
            int i2 = e.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            e.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private void a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private SparseArray<WeakReference<ClickableSpan>> b(View view) {
        SparseArray<WeakReference<ClickableSpan>> c2 = c(view);
        if (c2 != null) {
            return c2;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(a.g.b.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private static String b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> c(View view) {
        return (SparseArray) view.getTag(a.g.b.tag_accessibility_clickable_spans);
    }

    private boolean c(int i) {
        Bundle e = e();
        return e != null && (e.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public static c d(View view) {
        return a(AccessibilityNodeInfo.obtain(view));
    }

    private void e(View view) {
        SparseArray<WeakReference<ClickableSpan>> c2 = c(view);
        if (c2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < c2.size(); i++) {
                if (c2.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                c2.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public static ClickableSpan[] h(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private void v() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f213a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f213a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f213a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f213a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private boolean w() {
        return !a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static c x() {
        return a(AccessibilityNodeInfo.obtain());
    }

    public int a() {
        return this.f213a.getActions();
    }

    public void a(int i) {
        this.f213a.addAction(i);
    }

    public void a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f213a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f216a);
        }
    }

    public void a(Rect rect) {
        this.f213a.getBoundsInParent(rect);
    }

    public void a(View view) {
        this.f214b = -1;
        this.f213a.setParent(view);
    }

    public void a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f213a.addChild(view, i);
        }
    }

    public void a(CharSequence charSequence) {
        this.f213a.setClassName(charSequence);
    }

    public void a(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            v();
            e(view);
            ClickableSpan[] h = h(charSequence);
            if (h != null && h.length > 0) {
                e().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a.g.b.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> b2 = b(view);
                int i2 = 0;
                while (h != null && i2 < h.length) {
                    int a2 = a(h[i2], b2);
                    b2.put(a2, new WeakReference<>(h[i2]));
                    a(h[i2], (Spanned) charSequence, a2);
                    i2++;
                }
            }
        }
    }

    public void a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f213a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f219a);
        }
    }

    public void a(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f213a.setAccessibilityFocused(z);
        }
    }

    public boolean a(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f213a.performAction(i, bundle);
        }
        return false;
    }

    public int b() {
        return this.f213a.getChildCount();
    }

    public void b(Rect rect) {
        this.f213a.getBoundsInScreen(rect);
    }

    public void b(View view, int i) {
        this.f214b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f213a.setParent(view, i);
        }
    }

    public void b(CharSequence charSequence) {
        this.f213a.setContentDescription(charSequence);
    }

    public void b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f213a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0019c) obj).f220a);
        }
    }

    public void b(boolean z) {
        this.f213a.setCheckable(z);
    }

    public CharSequence c() {
        return this.f213a.getClassName();
    }

    public void c(Rect rect) {
        this.f213a.setBoundsInParent(rect);
    }

    public void c(View view, int i) {
        this.f215c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f213a.setSource(view, i);
        }
    }

    public void c(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f213a.setError(charSequence);
        }
    }

    public void c(boolean z) {
        this.f213a.setChecked(z);
    }

    public CharSequence d() {
        return this.f213a.getContentDescription();
    }

    public void d(Rect rect) {
        this.f213a.setBoundsInScreen(rect);
    }

    public void d(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f213a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f213a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void d(boolean z) {
        this.f213a.setClickable(z);
    }

    public Bundle e() {
        return Build.VERSION.SDK_INT >= 19 ? this.f213a.getExtras() : new Bundle();
    }

    public void e(CharSequence charSequence) {
        this.f213a.setPackageName(charSequence);
    }

    public void e(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f213a.setContentInvalid(z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f213a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f213a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f213a)) {
            return false;
        }
        return this.f215c == cVar.f215c && this.f214b == cVar.f214b;
    }

    public CharSequence f() {
        return this.f213a.getPackageName();
    }

    public void f(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f213a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f213a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void f(boolean z) {
        this.f213a.setEnabled(z);
    }

    public CharSequence g() {
        if (!w()) {
            return this.f213a.getText();
        }
        List<Integer> a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f213a.getText(), 0, this.f213a.getText().length()));
        for (int i = 0; i < a2.size(); i++) {
            spannableString.setSpan(new a(a5.get(i).intValue(), this, e().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a2.get(i).intValue(), a3.get(i).intValue(), a4.get(i).intValue());
        }
        return spannableString;
    }

    public void g(CharSequence charSequence) {
        this.f213a.setText(charSequence);
    }

    public void g(boolean z) {
        this.f213a.setFocusable(z);
    }

    public String h() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f213a.getViewIdResourceName();
        }
        return null;
    }

    public void h(boolean z) {
        this.f213a.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f213a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f213a.setHeading(z);
        } else {
            a(2, z);
        }
    }

    public boolean i() {
        return this.f213a.isCheckable();
    }

    public void j(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f213a.setScreenReaderFocusable(z);
        } else {
            a(1, z);
        }
    }

    public boolean j() {
        return this.f213a.isChecked();
    }

    public void k(boolean z) {
        this.f213a.setScrollable(z);
    }

    public boolean k() {
        return this.f213a.isClickable();
    }

    public void l(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f213a.setShowingHintText(z);
        } else {
            a(4, z);
        }
    }

    public boolean l() {
        return this.f213a.isEnabled();
    }

    public void m(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f213a.setVisibleToUser(z);
        }
    }

    public boolean m() {
        return this.f213a.isFocusable();
    }

    public boolean n() {
        return this.f213a.isFocused();
    }

    public boolean o() {
        return this.f213a.isLongClickable();
    }

    public boolean p() {
        return this.f213a.isPassword();
    }

    public boolean q() {
        return this.f213a.isScrollable();
    }

    public boolean r() {
        return this.f213a.isSelected();
    }

    public boolean s() {
        return Build.VERSION.SDK_INT >= 26 ? this.f213a.isShowingHintText() : c(4);
    }

    public void t() {
        this.f213a.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(f());
        sb.append("; className: ");
        sb.append(c());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; contentDescription: ");
        sb.append(d());
        sb.append("; viewId: ");
        sb.append(h());
        sb.append("; checkable: ");
        sb.append(i());
        sb.append("; checked: ");
        sb.append(j());
        sb.append("; focusable: ");
        sb.append(m());
        sb.append("; focused: ");
        sb.append(n());
        sb.append("; selected: ");
        sb.append(r());
        sb.append("; clickable: ");
        sb.append(k());
        sb.append("; longClickable: ");
        sb.append(o());
        sb.append("; enabled: ");
        sb.append(l());
        sb.append("; password: ");
        sb.append(p());
        sb.append("; scrollable: " + q());
        sb.append("; [");
        int a2 = a();
        while (a2 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a2);
            a2 &= ~numberOfTrailingZeros;
            sb.append(b(numberOfTrailingZeros));
            if (a2 != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public AccessibilityNodeInfo u() {
        return this.f213a;
    }
}
