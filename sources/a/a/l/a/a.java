package a.a.l.a;

import a.a.l.a.b;
import a.a.l.a.d;
import a.e.h;
import a.n.a.a.i;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.m0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
public class a extends d implements androidx.core.graphics.drawable.b {
    private c p;
    private g q;
    private int r;
    private int s;
    private boolean t;

    /* access modifiers changed from: private */
    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f5a;

        b(Animatable animatable) {
            super();
            this.f5a = animatable;
        }

        @Override // a.a.l.a.a.g
        public void c() {
            this.f5a.start();
        }

        @Override // a.a.l.a.a.g
        public void d() {
            this.f5a.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends d.a {
        a.e.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            h<Integer> hVar;
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new a.e.d<>();
                hVar = new h<>();
            }
            this.L = hVar;
        }

        private static long f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        public int a(int i, int i2, Drawable drawable, boolean z) {
            int a2 = super.a(drawable);
            long f = f(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a2;
            this.K.a(f, Long.valueOf(j2 | j));
            if (z) {
                this.K.a(f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a2;
        }

        /* access modifiers changed from: package-private */
        public int a(int[] iArr, Drawable drawable, int i) {
            int a2 = super.a(iArr, drawable);
            this.L.c(a2, Integer.valueOf(i));
            return a2;
        }

        /* access modifiers changed from: package-private */
        public int b(int[] iArr) {
            int a2 = super.a(iArr);
            return a2 >= 0 ? a2 : super.a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int c(int i, int i2) {
            return (int) this.K.b(f(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public int d(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.b(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i, int i2) {
            return (this.K.b(f(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean e(int i, int i2) {
            return (this.K.b(f(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        /* access modifiers changed from: package-private */
        @Override // a.a.l.a.d.a, a.a.l.a.b.c
        public void m() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // a.a.l.a.d.a
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // a.a.l.a.d.a
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* access modifiers changed from: private */
    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final a.n.a.a.c f6a;

        d(a.n.a.a.c cVar) {
            super();
            this.f6a = cVar;
        }

        @Override // a.a.l.a.a.g
        public void c() {
            this.f6a.start();
        }

        @Override // a.a.l.a.a.g
        public void d() {
            this.f6a.stop();
        }
    }

    /* access modifiers changed from: private */
    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f7a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f8b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.f8b = z2;
            this.f7a = ofInt;
        }

        @Override // a.a.l.a.a.g
        public boolean a() {
            return this.f8b;
        }

        @Override // a.a.l.a.a.g
        public void b() {
            this.f7a.reverse();
        }

        @Override // a.a.l.a.a.g
        public void c() {
            this.f7a.start();
        }

        @Override // a.a.l.a.a.g
        public void d() {
            this.f7a.cancel();
        }
    }

    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f9a;

        /* renamed from: b  reason: collision with root package name */
        private int f10b;

        /* renamed from: c  reason: collision with root package name */
        private int f11c;

        f(AnimationDrawable animationDrawable, boolean z) {
            a(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f11c;
        }

        /* access modifiers changed from: package-private */
        public int a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f10b = numberOfFrames;
            int[] iArr = this.f9a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f9a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f9a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f11c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f11c)) + 0.5f);
            int i2 = this.f10b;
            int[] iArr = this.f9a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f11c) : 0.0f);
        }
    }

    /* access modifiers changed from: private */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.r = -1;
        this.s = -1;
        a(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    private void a(TypedArray typedArray) {
        c cVar = this.p;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.d |= typedArray.getChangingConfigurations();
        }
        cVar.b(typedArray.getBoolean(a.a.m.b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.i));
        cVar.a(typedArray.getBoolean(a.a.m.b.AnimatedStateListDrawableCompat_android_constantSize, cVar.l));
        cVar.b(typedArray.getInt(a.a.m.b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.c(typedArray.getInt(a.a.m.b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(a.a.m.b.AnimatedStateListDrawableCompat_android_dither, cVar.x));
    }

    public static a b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.a(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private boolean b(int i) {
        int i2;
        int c2;
        g gVar;
        g gVar2 = this.q;
        if (gVar2 == null) {
            i2 = b();
        } else if (i == this.r) {
            return true;
        } else {
            if (i != this.s || !gVar2.a()) {
                i2 = this.r;
                gVar2.d();
            } else {
                gVar2.b();
                this.r = this.s;
                this.s = i;
                return true;
            }
        }
        this.q = null;
        this.s = -1;
        this.r = -1;
        c cVar = this.p;
        int d2 = cVar.d(i2);
        int d3 = cVar.d(i);
        if (d3 == 0 || d2 == 0 || (c2 = cVar.c(d2, d3)) < 0) {
            return false;
        }
        boolean e2 = cVar.e(d2, d3);
        a(c2);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.d(d2, d3), e2);
        } else if (current instanceof a.n.a.a.c) {
            gVar = new d((a.n.a.a.c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.q = gVar;
        this.s = i2;
        this.r = i;
        return true;
    }

    private void c() {
        onStateChange(getState());
    }

    private void c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private int d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a2 = a.g.d.c.g.a(resources, theme, attributeSet, a.a.m.b.AnimatedStateListDrawableItem);
        int resourceId = a2.getResourceId(a.a.m.b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a2.getResourceId(a.a.m.b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable a3 = resourceId2 > 0 ? m0.a().a(context, resourceId2) : null;
        a2.recycle();
        int[] a4 = a(attributeSet);
        if (a3 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                a3 = xmlPullParser.getName().equals("vector") ? i.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (a3 != null) {
            return this.p.a(a4, a3, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a2 = a.g.d.c.g.a(resources, theme, attributeSet, a.a.m.b.AnimatedStateListDrawableTransition);
        int resourceId = a2.getResourceId(a.a.m.b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a2.getResourceId(a.a.m.b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a2.getResourceId(a.a.m.b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable a3 = resourceId3 > 0 ? m0.a().a(context, resourceId3) : null;
        boolean z = a2.getBoolean(a.a.m.b.AnimatedStateListDrawableTransition_android_reversible, false);
        a2.recycle();
        if (a3 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                a3 = xmlPullParser.getName().equals("animated-vector") ? a.n.a.a.c.a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (a3 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.p.a(resourceId, resourceId2, a3, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* access modifiers changed from: package-private */
    @Override // a.a.l.a.d, a.a.l.a.d, a.a.l.a.b
    public c a() {
        return new c(this.p, this, null);
    }

    /* access modifiers changed from: package-private */
    @Override // a.a.l.a.d, a.a.l.a.b
    public void a(b.c cVar) {
        super.a(cVar);
        if (cVar instanceof c) {
            this.p = (c) cVar;
        }
    }

    public void a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray a2 = a.g.d.c.g.a(resources, theme, attributeSet, a.a.m.b.AnimatedStateListDrawableCompat);
        setVisible(a2.getBoolean(a.a.m.b.AnimatedStateListDrawableCompat_android_visible, true), true);
        a(a2);
        a(resources);
        a2.recycle();
        c(context, resources, xmlPullParser, attributeSet, theme);
        c();
    }

    @Override // a.a.l.a.d
    public boolean isStateful() {
        return true;
    }

    @Override // a.a.l.a.b
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.q;
        if (gVar != null) {
            gVar.d();
            this.q = null;
            a(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override // a.a.l.a.d, a.a.l.a.b
    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.m();
                this.t = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // a.a.l.a.d, a.a.l.a.b
    public boolean onStateChange(int[] iArr) {
        int b2 = this.p.b(iArr);
        boolean z = b2 != b() && (b(b2) || a(b2));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // a.a.l.a.b
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.q != null && (visible || z2)) {
            if (z) {
                this.q.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
