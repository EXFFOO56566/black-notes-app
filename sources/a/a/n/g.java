package a.a.n;

import a.g.l.h;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.w0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {
    static final Class<?>[] e;
    static final Class<?>[] f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f31a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f32b;

    /* renamed from: c  reason: collision with root package name */
    Context f33c;
    private Object d;

    /* access modifiers changed from: private */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f34c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f35a;

        /* renamed from: b  reason: collision with root package name */
        private Method f36b;

        public a(Object obj, String str) {
            this.f35a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f36b = cls.getMethod(str, f34c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f36b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f36b.invoke(this.f35a, menuItem)).booleanValue();
                }
                this.f36b.invoke(this.f35a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: private */
    public class b {
        a.g.l.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f37a;

        /* renamed from: b  reason: collision with root package name */
        private int f38b;

        /* renamed from: c  reason: collision with root package name */
        private int f39c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.f37a = menu;
            d();
        }

        private char a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f33c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void a(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!g.this.f33c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.a(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z3 = menuItem instanceof i;
            if (z3) {
                i iVar = (i) menuItem;
            }
            if (this.r >= 2) {
                if (z3) {
                    ((i) menuItem).c(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).a(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) a(str, g.e, g.this.f31a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            a.g.l.b bVar = this.A;
            if (bVar != null) {
                h.a(menuItem, bVar);
            }
            h.a(menuItem, this.B);
            h.b(menuItem, this.C);
            h.a(menuItem, this.n, this.o);
            h.b(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                h.a(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                h.a(menuItem, colorStateList);
            }
        }

        public void a() {
            this.h = true;
            a(this.f37a.add(this.f38b, this.i, this.j, this.k));
        }

        public void a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f33c.obtainStyledAttributes(attributeSet, a.a.j.MenuGroup);
            this.f38b = obtainStyledAttributes.getResourceId(a.a.j.MenuGroup_android_id, 0);
            this.f39c = obtainStyledAttributes.getInt(a.a.j.MenuGroup_android_menuCategory, 0);
            this.d = obtainStyledAttributes.getInt(a.a.j.MenuGroup_android_orderInCategory, 0);
            this.e = obtainStyledAttributes.getInt(a.a.j.MenuGroup_android_checkableBehavior, 0);
            this.f = obtainStyledAttributes.getBoolean(a.a.j.MenuGroup_android_visible, true);
            this.g = obtainStyledAttributes.getBoolean(a.a.j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public SubMenu b() {
            this.h = true;
            SubMenu addSubMenu = this.f37a.addSubMenu(this.f38b, this.i, this.j, this.k);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v63, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        public void b(AttributeSet attributeSet) {
            w0 a2 = w0.a(g.this.f33c, attributeSet, a.a.j.MenuItem);
            this.i = a2.g(a.a.j.MenuItem_android_id, 0);
            this.j = (a2.d(a.a.j.MenuItem_android_menuCategory, this.f39c) & -65536) | (a2.d(a.a.j.MenuItem_android_orderInCategory, this.d) & 65535);
            this.k = a2.e(a.a.j.MenuItem_android_title);
            this.l = a2.e(a.a.j.MenuItem_android_titleCondensed);
            this.m = a2.g(a.a.j.MenuItem_android_icon, 0);
            this.n = a(a2.d(a.a.j.MenuItem_android_alphabeticShortcut));
            this.o = a2.d(a.a.j.MenuItem_alphabeticModifiers, 4096);
            this.p = a(a2.d(a.a.j.MenuItem_android_numericShortcut));
            this.q = a2.d(a.a.j.MenuItem_numericModifiers, 4096);
            this.r = a2.g(a.a.j.MenuItem_android_checkable) ? a2.a(a.a.j.MenuItem_android_checkable, false) : this.e ? 1 : 0;
            this.s = a2.a(a.a.j.MenuItem_android_checked, false);
            this.t = a2.a(a.a.j.MenuItem_android_visible, this.f);
            this.u = a2.a(a.a.j.MenuItem_android_enabled, this.g);
            this.v = a2.d(a.a.j.MenuItem_showAsAction, -1);
            this.z = a2.d(a.a.j.MenuItem_android_onClick);
            this.w = a2.g(a.a.j.MenuItem_actionLayout, 0);
            this.x = a2.d(a.a.j.MenuItem_actionViewClass);
            String d2 = a2.d(a.a.j.MenuItem_actionProviderClass);
            this.y = d2;
            boolean z2 = d2 != null;
            if (z2 && this.w == 0 && this.x == null) {
                this.A = (a.g.l.b) a(this.y, g.f, g.this.f32b);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = a2.e(a.a.j.MenuItem_contentDescription);
            this.C = a2.e(a.a.j.MenuItem_tooltipText);
            if (a2.g(a.a.j.MenuItem_iconTintMode)) {
                this.E = e0.a(a2.d(a.a.j.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (a2.g(a.a.j.MenuItem_iconTint)) {
                this.D = a2.a(a.a.j.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            a2.a();
            this.h = false;
        }

        public boolean c() {
            return this.h;
        }

        public void d() {
            this.f38b = 0;
            this.f39c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f33c = context;
        Object[] objArr = {context};
        this.f31a = objArr;
        this.f32b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.d();
                        } else if (name2.equals("item")) {
                            if (!bVar.c()) {
                                a.g.l.b bVar2 = bVar.A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.a(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.b(attributeSet);
                    } else if (name3.equals("menu")) {
                        a(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object a() {
        if (this.d == null) {
            this.d = a(this.f33c);
        }
        return this.d;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof a.g.f.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f33c.getResources().getLayout(i);
            a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
