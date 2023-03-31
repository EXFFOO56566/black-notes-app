package a.n.a.a;

import a.g.d.c.g;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class c extends h implements b {

    /* renamed from: c  reason: collision with root package name */
    private b f378c;
    private Context d;
    private ArgbEvaluator e;
    final Drawable.Callback f;

    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* access modifiers changed from: private */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f380a;

        /* renamed from: b  reason: collision with root package name */
        i f381b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f382c;
        ArrayList<Animator> d;
        a.e.a<Animator, String> e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f380a = bVar.f380a;
                i iVar = bVar.f381b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f381b = (i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    i iVar2 = this.f381b;
                    iVar2.mutate();
                    i iVar3 = iVar2;
                    this.f381b = iVar3;
                    iVar3.setCallback(callback);
                    this.f381b.setBounds(bVar.f381b.getBounds());
                    this.f381b.a(false);
                }
                ArrayList<Animator> arrayList = bVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new a.e.a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.e.get(animator);
                        clone.setTarget(this.f381b.a(str));
                        this.d.add(clone);
                        this.e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f382c == null) {
                this.f382c = new AnimatorSet();
            }
            this.f382c.playTogether(this.d);
        }

        public int getChangingConfigurations() {
            return this.f380a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: a.n.a.a.c$c  reason: collision with other inner class name */
    private static class C0034c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f383a;

        public C0034c(Drawable.ConstantState constantState) {
            this.f383a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f383a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f383a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f383a.newDrawable();
            cVar.f388b = newDrawable;
            newDrawable.setCallback(cVar.f);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f383a.newDrawable(resources);
            cVar.f388b = newDrawable;
            newDrawable.setCallback(cVar.f);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f383a.newDrawable(resources, theme);
            cVar.f388b = newDrawable;
            newDrawable.setCallback(cVar.f);
            return cVar;
        }
    }

    c() {
        this(null, null, null);
    }

    private c(Context context) {
        this(context, null, null);
    }

    private c(Context context, b bVar, Resources resources) {
        this.e = null;
        this.f = new a();
        this.d = context;
        if (bVar != null) {
            this.f378c = bVar;
        } else {
            this.f378c = new b(context, bVar, this.f, resources);
        }
    }

    public static c a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    private void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.e == null) {
                    this.e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.e);
            }
        }
    }

    private void a(String str, Animator animator) {
        animator.setTarget(this.f378c.f381b.a(str));
        if (Build.VERSION.SDK_INT < 21) {
            a(animator);
        }
        b bVar = this.f378c;
        if (bVar.d == null) {
            bVar.d = new ArrayList<>();
            this.f378c.e = new a.e.a<>();
        }
        this.f378c.d.add(animator);
        this.f378c.e.put(animator, str);
    }

    @Override // a.n.a.a.h
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.a(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f378c.f381b.draw(canvas);
        if (this.f378c.f382c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f388b;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f378c.f381b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f378c.f380a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f388b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f378c.f381b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f388b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0034c(this.f388b.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f378c.f381b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f378c.f381b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.getOpacity() : this.f378c.f381b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f388b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = g.a(resources, theme, attributeSet, a.e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i a2 = i.a(resources, resourceId, theme);
                        a2.a(false);
                        a2.setCallback(this.f);
                        i iVar = this.f378c.f381b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f378c.f381b = a2;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, a.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.d;
                        if (context != null) {
                            a(string, e.a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f378c.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f388b;
        return drawable != null ? androidx.core.graphics.drawable.a.f(drawable) : this.f378c.f381b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f388b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f378c.f382c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.isStateful() : this.f378c.f381b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f378c.f381b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    @Override // a.n.a.a.h
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.setLevel(i) : this.f378c.f381b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.setState(iArr) : this.f378c.f381b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f378c.f381b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, z);
        } else {
            this.f378c.f381b.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f378c.f381b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable, i);
        } else {
            this.f378c.f381b.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
        } else {
            this.f378c.f381b.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
        } else {
            this.f378c.f381b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f378c.f381b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f378c.f382c.isStarted()) {
            this.f378c.f382c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f378c.f382c.end();
        }
    }
}
