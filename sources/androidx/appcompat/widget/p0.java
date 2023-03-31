package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.i0;

public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b  reason: collision with root package name */
    Runnable f674b;

    /* renamed from: c  reason: collision with root package name */
    private c f675c;
    i0 d;
    private Spinner e;
    private boolean f;
    int g;
    int h;
    private int i;
    private int j;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f676b;

        a(View view) {
            this.f676b = view;
        }

        public void run() {
            p0.this.smoothScrollTo(this.f676b.getLeft() - ((p0.this.getWidth() - this.f676b.getWidth()) / 2), 0);
            p0.this.f674b = null;
        }
    }

    /* access modifiers changed from: private */
    public class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return p0.this.d.getChildCount();
        }

        public Object getItem(int i) {
            return ((d) p0.this.d.getChildAt(i)).a();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.a((a.c) getItem(i), true);
            }
            ((d) view).a((a.c) getItem(i));
            return view;
        }
    }

    /* access modifiers changed from: private */
    public class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((d) view).a().e();
            int childCount = p0.this.d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = p0.this.d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* access modifiers changed from: private */
    public class d extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private final int[] f680b;

        /* renamed from: c  reason: collision with root package name */
        private a.c f681c;
        private TextView d;
        private ImageView e;
        private View f;

        public d(Context context, a.c cVar, boolean z) {
            super(context, null, a.a.a.actionBarTabStyle);
            int[] iArr = {16842964};
            this.f680b = iArr;
            this.f681c = cVar;
            w0 a2 = w0.a(context, null, iArr, a.a.a.actionBarTabStyle, 0);
            if (a2.g(0)) {
                setBackgroundDrawable(a2.b(0));
            }
            a2.a();
            if (z) {
                setGravity(8388627);
            }
            b();
        }

        public a.c a() {
            return this.f681c;
        }

        public void a(a.c cVar) {
            this.f681c = cVar;
            b();
        }

        public void b() {
            a.c cVar = this.f681c;
            View b2 = cVar.b();
            CharSequence charSequence = null;
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.f = b2;
                TextView textView = this.d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f;
            if (view != null) {
                removeView(view);
                this.f = null;
            }
            Drawable c2 = cVar.c();
            CharSequence d2 = cVar.d();
            if (c2 != null) {
                if (this.e == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.e = oVar;
                }
                this.e.setImageDrawable(c2);
                this.e.setVisibility(0);
            } else {
                ImageView imageView2 = this.e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.d == null) {
                    z zVar = new z(getContext(), null, a.a.a.actionBarTabTextStyle);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.d = zVar;
                }
                this.d.setText(d2);
                this.d.setVisibility(0);
            } else {
                TextView textView2 = this.d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z) {
                charSequence = cVar.a();
            }
            y0.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (p0.this.g > 0 && getMeasuredWidth() > (i3 = p0.this.g)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner a() {
        w wVar = new w(getContext(), null, a.a.a.actionDropDownStyle);
        wVar.setLayoutParams(new i0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean b() {
        Spinner spinner = this.e;
        return spinner != null && spinner.getParent() == this;
    }

    private void c() {
        if (!b()) {
            if (this.e == null) {
                this.e = a();
            }
            removeView(this.d);
            addView(this.e, new ViewGroup.LayoutParams(-2, -1));
            if (this.e.getAdapter() == null) {
                this.e.setAdapter((SpinnerAdapter) new b());
            }
            Runnable runnable = this.f674b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f674b = null;
            }
            this.e.setSelection(this.j);
        }
    }

    private boolean d() {
        if (!b()) {
            return false;
        }
        removeView(this.e);
        addView(this.d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.e.getSelectedItemPosition());
        return false;
    }

    /* access modifiers changed from: package-private */
    public d a(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.i));
        } else {
            dVar.setFocusable(true);
            if (this.f675c == null) {
                this.f675c = new c();
            }
            dVar.setOnClickListener(this.f675c);
        }
        return dVar;
    }

    public void a(int i2) {
        View childAt = this.d.getChildAt(i2);
        Runnable runnable = this.f674b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f674b = aVar;
        post(aVar);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f674b;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a.a.n.a a2 = a.a.n.a.a(getContext());
        setContentHeight(a2.e());
        this.h = a2.d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f674b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).a().e();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i4 = -1;
        } else {
            if (childCount > 2) {
                this.g = (int) (((float) View.MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.g = View.MeasureSpec.getSize(i2) / 2;
            }
            i4 = Math.min(this.g, this.h);
        }
        this.g = i4;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        if (z2 || !this.f) {
            z = false;
        }
        if (z) {
            this.d.measure(0, makeMeasureSpec);
            if (this.d.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                c();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i2, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.j);
                    return;
                }
            }
        }
        d();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f = z;
    }

    public void setContentHeight(int i2) {
        this.i = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.j = i2;
        int childCount = this.d.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.d.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.e;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }
}
