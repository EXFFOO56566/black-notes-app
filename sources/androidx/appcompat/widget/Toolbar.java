package androidx.appcompat.widget;

import a.a.j;
import a.g.l.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private ColorStateList B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    f H;
    private final ActionMenuView.e I;
    private x0 J;
    private c K;
    private d L;
    private m.a M;
    private g.a N;
    private boolean O;
    private final Runnable P;

    /* renamed from: b  reason: collision with root package name */
    private ActionMenuView f583b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f584c;
    private TextView d;
    private ImageButton e;
    private ImageView f;
    private Drawable g;
    private CharSequence h;
    ImageButton i;
    View j;
    private Context k;
    private int l;
    private int m;
    private int n;
    int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private o0 u;
    private int v;
    private int w;
    private int x;
    private CharSequence y;
    private CharSequence z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.k();
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            Toolbar.this.c();
        }
    }

    /* access modifiers changed from: private */
    public class d implements m {

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.view.menu.g f588b;

        /* renamed from: c  reason: collision with root package name */
        i f589c;

        d() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void a(Context context, androidx.appcompat.view.menu.g gVar) {
            i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f588b;
            if (!(gVar2 == null || (iVar = this.f589c) == null)) {
                gVar2.a(iVar);
            }
            this.f588b = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void a(m.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void a(boolean z) {
            if (this.f589c != null) {
                androidx.appcompat.view.menu.g gVar = this.f588b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f588b.getItem(i) == this.f589c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    a(this.f588b, this.f589c);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean a(androidx.appcompat.view.menu.g gVar, i iVar) {
            View view = Toolbar.this.j;
            if (view instanceof a.a.n.c) {
                ((a.a.n.c) view).c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            toolbar3.a();
            this.f589c = null;
            Toolbar.this.requestLayout();
            iVar.a(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean a(r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean b(androidx.appcompat.view.menu.g gVar, i iVar) {
            Toolbar.this.e();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = iVar.getActionView();
            this.f589c = iVar;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f449a = 8388611 | (toolbar4.o & 112);
                generateDefaultLayoutParams.f590b = 2;
                toolbar4.j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar.this.j();
            Toolbar.this.requestLayout();
            iVar.a(true);
            View view = Toolbar.this.j;
            if (view instanceof a.a.n.c) {
                ((a.a.n.c) view).a();
            }
            return true;
        }
    }

    public static class e extends a.C0036a {

        /* renamed from: b  reason: collision with root package name */
        int f590b = 0;

        public e(int i, int i2) {
            super(i, i2);
            this.f449a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            a(marginLayoutParams);
        }

        public e(a.C0036a aVar) {
            super(aVar);
        }

        public e(e eVar) {
            super((a.C0036a) eVar);
            this.f590b = eVar.f590b;
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends a.i.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        int d;
        boolean e;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        w0 a2 = w0.a(getContext(), attributeSet, j.Toolbar, i2, 0);
        this.m = a2.g(j.Toolbar_titleTextAppearance, 0);
        this.n = a2.g(j.Toolbar_subtitleTextAppearance, 0);
        this.x = a2.e(j.Toolbar_android_gravity, this.x);
        this.o = a2.e(j.Toolbar_buttonGravity, 48);
        int b2 = a2.b(j.Toolbar_titleMargin, 0);
        b2 = a2.g(j.Toolbar_titleMargins) ? a2.b(j.Toolbar_titleMargins, b2) : b2;
        this.t = b2;
        this.s = b2;
        this.r = b2;
        this.q = b2;
        int b3 = a2.b(j.Toolbar_titleMarginStart, -1);
        if (b3 >= 0) {
            this.q = b3;
        }
        int b4 = a2.b(j.Toolbar_titleMarginEnd, -1);
        if (b4 >= 0) {
            this.r = b4;
        }
        int b5 = a2.b(j.Toolbar_titleMarginTop, -1);
        if (b5 >= 0) {
            this.s = b5;
        }
        int b6 = a2.b(j.Toolbar_titleMarginBottom, -1);
        if (b6 >= 0) {
            this.t = b6;
        }
        this.p = a2.c(j.Toolbar_maxButtonHeight, -1);
        int b7 = a2.b(j.Toolbar_contentInsetStart, RecyclerView.UNDEFINED_DURATION);
        int b8 = a2.b(j.Toolbar_contentInsetEnd, RecyclerView.UNDEFINED_DURATION);
        int c2 = a2.c(j.Toolbar_contentInsetLeft, 0);
        int c3 = a2.c(j.Toolbar_contentInsetRight, 0);
        l();
        this.u.a(c2, c3);
        if (!(b7 == Integer.MIN_VALUE && b8 == Integer.MIN_VALUE)) {
            this.u.b(b7, b8);
        }
        this.v = a2.b(j.Toolbar_contentInsetStartWithNavigation, RecyclerView.UNDEFINED_DURATION);
        this.w = a2.b(j.Toolbar_contentInsetEndWithActions, RecyclerView.UNDEFINED_DURATION);
        this.g = a2.b(j.Toolbar_collapseIcon);
        this.h = a2.e(j.Toolbar_collapseContentDescription);
        CharSequence e2 = a2.e(j.Toolbar_title);
        if (!TextUtils.isEmpty(e2)) {
            setTitle(e2);
        }
        CharSequence e3 = a2.e(j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e3)) {
            setSubtitle(e3);
        }
        this.k = getContext();
        setPopupTheme(a2.g(j.Toolbar_popupTheme, 0));
        Drawable b9 = a2.b(j.Toolbar_navigationIcon);
        if (b9 != null) {
            setNavigationIcon(b9);
        }
        CharSequence e4 = a2.e(j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e4)) {
            setNavigationContentDescription(e4);
        }
        Drawable b10 = a2.b(j.Toolbar_logo);
        if (b10 != null) {
            setLogo(b10);
        }
        CharSequence e5 = a2.e(j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e5)) {
            setLogoDescription(e5);
        }
        if (a2.g(j.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.a(j.Toolbar_titleTextColor));
        }
        if (a2.g(j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.a(j.Toolbar_subtitleTextColor));
        }
        if (a2.g(j.Toolbar_menu)) {
            a(a2.g(j.Toolbar_menu, 0));
        }
        a2.a();
    }

    private int a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return a.g.l.g.b(marginLayoutParams) + a.g.l.g.a(marginLayoutParams);
    }

    private int a(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int c2 = c(eVar.f449a);
        if (c2 == 48) {
            return getPaddingTop() - i3;
        }
        if (c2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    private int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private int a(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int a(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i2;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    private void a(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void a(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f590b = 1;
        if (!z2 || this.j == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.F.add(view);
    }

    private void a(List<View> list, int i2) {
        boolean z2 = u.o(this) == 1;
        int childCount = getChildCount();
        int a2 = a.g.l.d.a(i2, u.o(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f590b == 0 && d(childAt) && b(eVar.f449a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f590b == 0 && d(childAt2) && b(eVar2.f449a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private int b(int i2) {
        int o2 = u.o(this);
        int a2 = a.g.l.d.a(i2, o2) & 7;
        return (a2 == 1 || a2 == 3 || a2 == 5) ? a2 : o2 == 1 ? 5 : 3;
    }

    private int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int b(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int c(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.x & 112;
    }

    private boolean c(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    private boolean d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private MenuInflater getMenuInflater() {
        return new a.a.n.g(getContext());
    }

    private void l() {
        if (this.u == null) {
            this.u = new o0();
        }
    }

    private void m() {
        if (this.f == null) {
            this.f = new o(getContext());
        }
    }

    private void n() {
        o();
        if (this.f583b.j() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f583b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f583b.setExpandedActionViewsExclusive(true);
            gVar.a(this.L, this.k);
        }
    }

    private void o() {
        if (this.f583b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f583b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.f583b.setOnMenuItemClickListener(this.I);
            this.f583b.a(this.M, this.N);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f449a = 8388613 | (this.o & 112);
            this.f583b.setLayoutParams(generateDefaultLayoutParams);
            a((View) this.f583b, false);
        }
    }

    private void p() {
        if (this.e == null) {
            this.e = new m(getContext(), null, a.a.a.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f449a = 8388611 | (this.o & 112);
            this.e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private void q() {
        removeCallbacks(this.P);
        post(this.P);
    }

    private boolean r() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    public void a(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public void a(int i2, int i3) {
        l();
        this.u.b(i2, i3);
    }

    public void a(Context context, int i2) {
        this.n = i2;
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void a(androidx.appcompat.view.menu.g gVar, c cVar) {
        if (gVar != null || this.f583b != null) {
            o();
            androidx.appcompat.view.menu.g j2 = this.f583b.j();
            if (j2 != gVar) {
                if (j2 != null) {
                    j2.b(this.K);
                    j2.b(this.L);
                }
                if (this.L == null) {
                    this.L = new d();
                }
                cVar.b(true);
                if (gVar != null) {
                    gVar.a(cVar, this.k);
                    gVar.a(this.L, this.k);
                } else {
                    cVar.a(this.k, (androidx.appcompat.view.menu.g) null);
                    this.L.a(this.k, (androidx.appcompat.view.menu.g) null);
                    cVar.a(true);
                    this.L.a(true);
                }
                this.f583b.setPopupTheme(this.l);
                this.f583b.setPresenter(cVar);
                this.K = cVar;
            }
        }
    }

    public void b(Context context, int i2) {
        this.m = i2;
        TextView textView = this.f584c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean b() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f583b) != null && actionMenuView.i();
    }

    public void c() {
        d dVar = this.L;
        i iVar = dVar == null ? null : dVar.f589c;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public void d() {
        ActionMenuView actionMenuView = this.f583b;
        if (actionMenuView != null) {
            actionMenuView.d();
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.i == null) {
            m mVar = new m(getContext(), null, a.a.a.toolbarNavigationButtonStyle);
            this.i = mVar;
            mVar.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f449a = 8388611 | (this.o & 112);
            generateDefaultLayoutParams.f590b = 2;
            this.i.setLayoutParams(generateDefaultLayoutParams);
            this.i.setOnClickListener(new c());
        }
    }

    public boolean f() {
        d dVar = this.L;
        return (dVar == null || dVar.f589c == null) ? false : true;
    }

    public boolean g() {
        ActionMenuView actionMenuView = this.f583b;
        return actionMenuView != null && actionMenuView.f();
    }

    /* access modifiers changed from: protected */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0036a ? new e((a.C0036a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g j2;
        ActionMenuView actionMenuView = this.f583b;
        return actionMenuView != null && (j2 = actionMenuView.j()) != null && j2.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return u.o(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return u.o(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        n();
        return this.f583b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        n();
        return this.f583b.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f584c;
    }

    public d0 getWrapper() {
        if (this.J == null) {
            this.J = new x0(this, true);
        }
        return this.J;
    }

    public boolean h() {
        ActionMenuView actionMenuView = this.f583b;
        return actionMenuView != null && actionMenuView.g();
    }

    public boolean i() {
        ActionMenuView actionMenuView = this.f583b;
        return actionMenuView != null && actionMenuView.h();
    }

    /* access modifiers changed from: package-private */
    public void j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).f590b == 2 || childAt == this.f583b)) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public boolean k() {
        ActionMenuView actionMenuView = this.f583b;
        return actionMenuView != null && actionMenuView.k();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0299 A[LOOP:0: B:106:0x0297->B:107:0x0299, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02bb A[LOOP:1: B:109:0x02b9->B:110:0x02bb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f4 A[LOOP:2: B:117:0x02f2->B:118:0x02f4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 777
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.G;
        int i11 = 0;
        if (c1.a(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (d(this.e)) {
            a(this.e, i2, 0, i3, 0, this.p);
            i6 = this.e.getMeasuredWidth() + a(this.e);
            i5 = Math.max(0, this.e.getMeasuredHeight() + b(this.e));
            i4 = View.combineMeasuredStates(0, this.e.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (d(this.i)) {
            a(this.i, i2, 0, i3, 0, this.p);
            i6 = this.i.getMeasuredWidth() + a(this.i);
            i5 = Math.max(i5, this.i.getMeasuredHeight() + b(this.i));
            i4 = View.combineMeasuredStates(i4, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i6);
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (d(this.f583b)) {
            a(this.f583b, i2, max, i3, 0, this.p);
            i7 = this.f583b.getMeasuredWidth() + a(this.f583b);
            i5 = Math.max(i5, this.f583b.getMeasuredHeight() + b(this.f583b));
            i4 = View.combineMeasuredStates(i4, this.f583b.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (d(this.j)) {
            max2 += a(this.j, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.j.getMeasuredHeight() + b(this.j));
            i4 = View.combineMeasuredStates(i4, this.j.getMeasuredState());
        }
        if (d(this.f)) {
            max2 += a(this.f, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f.getMeasuredHeight() + b(this.f));
            i4 = View.combineMeasuredStates(i4, this.f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).f590b == 0 && d(childAt)) {
                max2 += a(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + b(childAt));
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i13 = this.s + this.t;
        int i14 = this.q + this.r;
        if (d(this.f584c)) {
            a(this.f584c, i2, max2 + i14, i3, i13, iArr);
            int measuredWidth = this.f584c.getMeasuredWidth() + a(this.f584c);
            i8 = this.f584c.getMeasuredHeight() + b(this.f584c);
            i10 = View.combineMeasuredStates(i4, this.f584c.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (d(this.d)) {
            i9 = Math.max(i9, a(this.d, i2, max2 + i14, i3, i8 + i13, iArr));
            i8 += this.d.getMeasuredHeight() + b(this.d);
            i10 = View.combineMeasuredStates(i10, this.d.getMeasuredState());
        }
        int max3 = Math.max(i5, i8);
        int paddingLeft = max2 + i9 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (!r()) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f583b;
        androidx.appcompat.view.menu.g j2 = actionMenuView != null ? actionMenuView.j() : null;
        int i2 = gVar.d;
        if (!(i2 == 0 || this.L == null || j2 == null || (findItem = j2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.e) {
            q();
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        l();
        o0 o0Var = this.u;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        o0Var.a(z2);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (!(dVar == null || (iVar = dVar.f589c) == null)) {
            gVar.d = iVar.getItemId();
        }
        gVar.e = i();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            e();
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(a.a.k.a.a.c(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            e();
            this.i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.g);
        }
    }

    public void setCollapsible(boolean z2) {
        this.O = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i2 != this.w) {
            this.w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(a.a.k.a.a.c(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!c(this.f)) {
                a((View) this.f, true);
            }
        } else {
            ImageView imageView = this.f;
            if (imageView != null && c(imageView)) {
                removeView(this.f);
                this.F.remove(this.f);
            }
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            p();
        }
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(a.a.k.a.a.c(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            p();
            if (!c(this.e)) {
                a((View) this.e, true);
            }
        } else {
            ImageButton imageButton = this.e;
            if (imageButton != null && c(imageButton)) {
                removeView(this.e);
                this.F.remove(this.e);
            }
        }
        ImageButton imageButton2 = this.e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        p();
        this.e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        n();
        this.f583b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.l != i2) {
            this.l = i2;
            if (i2 == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.d == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.d = zVar;
                zVar.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.n;
                if (i2 != 0) {
                    this.d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.d.setTextColor(colorStateList);
                }
            }
            if (!c(this.d)) {
                a((View) this.d, true);
            }
        } else {
            TextView textView = this.d;
            if (textView != null && c(textView)) {
                removeView(this.d);
                this.F.remove(this.d);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f584c == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f584c = zVar;
                zVar.setSingleLine();
                this.f584c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.m;
                if (i2 != 0) {
                    this.f584c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f584c.setTextColor(colorStateList);
                }
            }
            if (!c(this.f584c)) {
                a((View) this.f584c, true);
            }
        } else {
            TextView textView = this.f584c;
            if (textView != null && c(textView)) {
                removeView(this.f584c);
                this.F.remove(this.f584c);
            }
        }
        TextView textView2 = this.f584c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f584c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
