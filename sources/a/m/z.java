package a.m;

import a.g.l.u;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class z implements b0 {

    /* renamed from: a  reason: collision with root package name */
    protected a f372a;

    /* access modifiers changed from: package-private */
    public static class a extends ViewGroup {

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f373b;

        /* renamed from: c  reason: collision with root package name */
        View f374c;
        ArrayList<Drawable> d = null;
        z e;
        private boolean f;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, z zVar) {
            super(context);
            this.f373b = viewGroup;
            this.f374c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.e = zVar;
        }

        private void a() {
            if (this.f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f373b.getLocationOnScreen(iArr2);
            this.f374c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        private void b() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f = true;
                    this.f373b.removeView(this);
                }
            }
        }

        public void a(Drawable drawable) {
            a();
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            if (!this.d.contains(drawable)) {
                this.d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void a(View view) {
            a();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f373b || viewGroup.getParent() == null || !u.B(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f373b.getLocationOnScreen(iArr2);
                    u.d(view, iArr[0] - iArr2[0]);
                    u.e(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public void b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                b();
            }
        }

        public void b(View view) {
            super.removeView(view);
            b();
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f373b.getLocationOnScreen(iArr);
            this.f374c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f374c.getWidth(), this.f374c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.d.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f373b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f373b instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                a(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.d) != null && arrayList.contains(drawable));
        }
    }

    z(Context context, ViewGroup viewGroup, View view) {
        this.f372a = new a(context, viewGroup, view, this);
    }

    static z c(View view) {
        ViewGroup d = d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof a) {
                return ((a) childAt).e;
            }
        }
        return new u(d.getContext(), d, view);
    }

    static ViewGroup d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // a.m.b0
    public void a(Drawable drawable) {
        this.f372a.a(drawable);
    }

    @Override // a.m.b0
    public void b(Drawable drawable) {
        this.f372a.b(drawable);
    }
}
