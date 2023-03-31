package androidx.appcompat.widget;

import a.a.j;
import a.g.l.u;
import a.g.l.y;
import a.g.l.z;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
public abstract class a extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    protected final C0039a f593b;

    /* renamed from: c  reason: collision with root package name */
    protected final Context f594c;
    protected ActionMenuView d;
    protected c e;
    protected int f;
    protected y g;
    private boolean h;
    private boolean i;

    /* access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    public class C0039a implements z {

        /* renamed from: a  reason: collision with root package name */
        private boolean f595a = false;

        /* renamed from: b  reason: collision with root package name */
        int f596b;

        protected C0039a() {
        }

        public C0039a a(y yVar, int i) {
            a.this.g = yVar;
            this.f596b = i;
            return this;
        }

        @Override // a.g.l.z
        public void a(View view) {
            this.f595a = true;
        }

        @Override // a.g.l.z
        public void b(View view) {
            if (!this.f595a) {
                a aVar = a.this;
                aVar.g = null;
                a.super.setVisibility(this.f596b);
            }
        }

        @Override // a.g.l.z
        public void c(View view) {
            a.super.setVisibility(0);
            this.f595a = false;
        }
    }

    a(Context context) {
        this(context, null);
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f593b = new C0039a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.a.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f594c = context;
        } else {
            this.f594c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int a(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    /* access modifiers changed from: protected */
    public int a(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, RecyclerView.UNDEFINED_DURATION), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* access modifiers changed from: protected */
    public int a(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public y a(int i2, long j) {
        y yVar = this.g;
        if (yVar != null) {
            yVar.a();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            y a2 = u.a(this);
            a2.a(1.0f);
            a2.a(j);
            C0039a aVar = this.f593b;
            aVar.a(a2, i2);
            a2.a(aVar);
            return a2;
        }
        y a3 = u.a(this);
        a3.a(0.0f);
        a3.a(j);
        C0039a aVar2 = this.f593b;
        aVar2.a(a3, i2);
        a3.a(aVar2);
        return a3;
    }

    public int getAnimatedVisibility() {
        return this.g != null ? this.f593b.f596b : getVisibility();
    }

    public int getContentHeight() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, j.ActionBar, a.a.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.e;
        if (cVar != null) {
            cVar.a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            y yVar = this.g;
            if (yVar != null) {
                yVar.a();
            }
            super.setVisibility(i2);
        }
    }
}
