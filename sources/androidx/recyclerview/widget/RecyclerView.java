package androidx.recyclerview.widget;

import a.g.l.d0.c;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements a.g.l.j, a.g.l.k {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = (Build.VERSION.SDK_INT >= 23);
    static final boolean ALLOW_THREAD_GAP_WORK = (Build.VERSION.SDK_INT >= 21);
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = (Build.VERSION.SDK_INT <= 15);
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = (Build.VERSION.SDK_INT <= 15);
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = (Build.VERSION.SDK_INT >= 16);
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new c();
    n mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    g mAdapter;
    a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    e mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    l mItemAnimator;
    private l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final x mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    final List<d0> mPendingAccessibilityImportanceChange;
    private y mPendingSavedState;
    boolean mPostedAnimatorRunner;
    e.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final v mRecycler;
    w mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private a.g.l.m mScrollingChildHelper;
    final a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final c0 mViewFlinger;
    private final s.b mViewInfoProcessCallback;
    final s mViewInfoStore;

    class a implements Runnable {
        a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    public static class a0 {

        /* renamed from: a  reason: collision with root package name */
        int f959a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f960b;

        /* renamed from: c  reason: collision with root package name */
        int f961c = 0;
        int d = 0;
        int e = 1;
        int f = 0;
        boolean g = false;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;
        int m;
        long n;
        int o;
        int p;
        int q;

        public int a() {
            return this.h ? this.f961c - this.d : this.f;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            if ((this.e & i2) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.e));
            }
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar) {
            this.e = 1;
            this.f = gVar.a();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public int b() {
            return this.f959a;
        }

        public boolean c() {
            return this.f959a != -1;
        }

        public boolean d() {
            return this.h;
        }

        public boolean e() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f959a + ", mData=" + this.f960b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.f961c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.i();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    public static abstract class b0 {
        public abstract View a(v vVar, int i, int i2);
    }

    static class c implements Interpolator {
        c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public class c0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f963b;

        /* renamed from: c  reason: collision with root package name */
        private int f964c;
        OverScroller d;
        Interpolator e = RecyclerView.sQuinticInterpolator;
        private boolean f = false;
        private boolean g = false;

        c0() {
            this.d = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        private float a(float f2) {
            return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
        }

        private int a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f2 = (float) width;
            float f3 = (float) i6;
            float a2 = f3 + (a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2)) * f3);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a2 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i5, (int) RecyclerView.MAX_SCROLL_DURATION);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            a.g.l.u.a(RecyclerView.this, this);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (this.f) {
                this.g = true;
            } else {
                c();
            }
        }

        public void a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f964c = 0;
            this.f963b = 0;
            Interpolator interpolator = this.e;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.e = interpolator2;
                this.d = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
            }
            this.d.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
            a();
        }

        public void a(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2, 0, 0);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.e != interpolator) {
                this.e = interpolator;
                this.d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f964c = 0;
            this.f963b = 0;
            RecyclerView.this.setScrollState(2);
            this.d.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.d.computeScrollOffset();
            }
            a();
        }

        public void b() {
            RecyclerView.this.removeCallbacks(this);
            this.d.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                b();
                return;
            }
            this.g = false;
            this.f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f963b;
                int i4 = currY - this.f964c;
                this.f963b = currX;
                this.f964c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    z zVar = recyclerView4.mLayout.g;
                    if (zVar != null && !zVar.d() && zVar.e()) {
                        int a2 = RecyclerView.this.mState.a();
                        if (a2 == 0) {
                            zVar.h();
                        } else {
                            if (zVar.c() >= a2) {
                                zVar.c(a2 - 1);
                            }
                            zVar.a(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i3, i4, null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    RecyclerView.this.dispatchOnScrolled(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                z zVar2 = RecyclerView.this.mLayout.g;
                if ((zVar2 != null && zVar2.d()) || !z) {
                    a();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    e eVar = recyclerView6.mGapWorker;
                    if (eVar != null) {
                        eVar.a(recyclerView6, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.a();
                    }
                }
            }
            z zVar3 = RecyclerView.this.mLayout.g;
            if (zVar3 != null && zVar3.d()) {
                zVar3.a(0, 0);
            }
            this.f = false;
            if (this.g) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    class d implements s.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.s.b
        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.a(d0Var.f966b, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.s.b
        public void a(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.animateAppearance(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.s.b
        public void b(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.mRecycler.c(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.s.b
        public void c(d0 d0Var, l.c cVar, l.c cVar2) {
            d0Var.a(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.mDataSetHasChangedAfterLayout;
            l lVar = recyclerView.mItemAnimator;
            if (z) {
                if (!lVar.a(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.c(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.postAnimationRunner();
        }
    }

    public static abstract class d0 {
        private static final List<Object> t = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public final View f966b;

        /* renamed from: c  reason: collision with root package name */
        WeakReference<RecyclerView> f967c;
        int d = -1;
        int e = -1;
        long f = -1;
        int g = -1;
        int h = -1;
        d0 i = null;
        d0 j = null;
        int k;
        List<Object> l = null;
        List<Object> m = null;
        private int n = 0;
        v o = null;
        boolean p = false;
        private int q = 0;
        int r = -1;
        RecyclerView s;

        public d0(View view) {
            if (view != null) {
                this.f966b = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void D() {
            if (this.l == null) {
                ArrayList arrayList = new ArrayList();
                this.l = arrayList;
                this.m = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean A() {
            return (this.k & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void B() {
            this.o.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean C() {
            return (this.k & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            this.k = i2 | this.k;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3) {
            this.k = (i2 & i3) | (this.k & (~i3));
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3, boolean z) {
            a(8);
            a(i3, z);
            this.d = i2;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, boolean z) {
            if (this.e == -1) {
                this.e = this.d;
            }
            if (this.h == -1) {
                this.h = this.d;
            }
            if (z) {
                this.h += i2;
            }
            this.d += i2;
            if (this.f966b.getLayoutParams() != null) {
                ((p) this.f966b.getLayoutParams()).f988c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, boolean z) {
            this.o = vVar;
            this.p = z;
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView) {
            int i2 = this.r;
            if (i2 == -1) {
                i2 = a.g.l.u.m(this.f966b);
            }
            this.q = i2;
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            if (obj == null) {
                a(1024);
            } else if ((1024 & this.k) == 0) {
                D();
                this.l.add(obj);
            }
        }

        public final void a(boolean z) {
            int i2;
            int i3 = this.n;
            int i4 = z ? i3 - 1 : i3 + 1;
            this.n = i4;
            if (i4 < 0) {
                this.n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i4 == 1) {
                i2 = this.k | 16;
            } else if (z && this.n == 0) {
                i2 = this.k & -17;
            } else {
                return;
            }
            this.k = i2;
        }

        /* access modifiers changed from: package-private */
        public void b(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.q);
            this.q = 0;
        }

        /* access modifiers changed from: package-private */
        public boolean b(int i2) {
            return (i2 & this.k) != 0;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.e = -1;
            this.h = -1;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            List<Object> list = this.l;
            if (list != null) {
                list.clear();
            }
            this.k &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.k &= -33;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.k &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return (this.k & 16) == 0 && a.g.l.u.z(this.f966b);
        }

        public final int h() {
            RecyclerView recyclerView = this.s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long i() {
            return this.f;
        }

        public final int j() {
            return this.g;
        }

        public final int k() {
            int i2 = this.h;
            return i2 == -1 ? this.d : i2;
        }

        public final int l() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public List<Object> m() {
            if ((this.k & 1024) != 0) {
                return t;
            }
            List<Object> list = this.l;
            return (list == null || list.size() == 0) ? t : this.m;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return (this.k & 512) != 0 || q();
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return (this.f966b.getParent() == null || this.f966b.getParent() == this.s) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return (this.k & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean q() {
            return (this.k & 4) != 0;
        }

        public final boolean r() {
            return (this.k & 16) == 0 && !a.g.l.u.z(this.f966b);
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            return (this.k & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            return this.o != null;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.d + " id=" + this.f + ", oldPos=" + this.e + ", pLpos:" + this.h);
            if (t()) {
                sb.append(" scrap ");
                sb.append(this.p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (q()) {
                sb.append(" invalid");
            }
            if (!p()) {
                sb.append(" unbound");
            }
            if (w()) {
                sb.append(" update");
            }
            if (s()) {
                sb.append(" removed");
            }
            if (A()) {
                sb.append(" ignored");
            }
            if (u()) {
                sb.append(" tmpDetached");
            }
            if (!r()) {
                sb.append(" not recyclable(" + this.n + ")");
            }
            if (n()) {
                sb.append(" undefined adapter position");
            }
            if (this.f966b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public boolean u() {
            return (this.k & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean v() {
            return (this.k & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean w() {
            return (this.k & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void x() {
            this.k = 0;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.h = -1;
            this.n = 0;
            this.i = null;
            this.j = null;
            d();
            this.q = 0;
            this.r = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: package-private */
        public void y() {
            if (this.e == -1) {
                this.e = this.d;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean z() {
            return (this.k & 16) != 0;
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements b.AbstractC0049b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0049b
        public int a() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0049b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0049b
        public void a(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.a(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0049b
        public void a(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0049b
        public void a(View view, int i, ViewGroup.LayoutParams layoutParams) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.u() || childViewHolderInt.A()) {
                    childViewHolderInt.f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0049b
        public d0 b(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0049b
        public void b() {
            int a2 = a();
            for (int i = 0; i < a2; i++) {
                View a3 = a(i);
                RecyclerView.this.dispatchChildDetached(a3);
                a3.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0049b
        public void b(int i) {
            d0 childViewHolderInt;
            View a2 = a(i);
            if (!(a2 == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(a2)) == null)) {
                if (!childViewHolderInt.u() || childViewHolderInt.A()) {
                    childViewHolderInt.a(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.detachViewFromParent((RecyclerView) i);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0049b
        public void c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0049b
        public void c(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.b(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0049b
        public int d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements a.AbstractC0048a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0048a
        public d0 a(int i) {
            d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.c(findViewHolderForPosition.f966b)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0048a
        public void a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0048a
        public void a(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0048a
        public void a(a.b bVar) {
            c(bVar);
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0048a
        public void b(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0048a
        public void b(a.b bVar) {
            c(bVar);
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0048a
        public void c(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* access modifiers changed from: package-private */
        public void c(a.b bVar) {
            int i = bVar.f1020a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.a(recyclerView, bVar.f1021b, bVar.d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.b(recyclerView2, bVar.f1021b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.a(recyclerView3, bVar.f1021b, bVar.d, bVar.f1022c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.a(recyclerView4, bVar.f1021b, bVar.d, 1);
            }
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0048a
        public void d(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.d += i2;
        }
    }

    public static abstract class g<VH extends d0> {

        /* renamed from: a  reason: collision with root package name */
        private final h f970a = new h();

        /* renamed from: b  reason: collision with root package name */
        private boolean f971b = false;

        public abstract int a();

        public final VH a(ViewGroup viewGroup, int i) {
            try {
                a.g.h.c.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH b2 = b(viewGroup, i);
                if (b2.f966b.getParent() == null) {
                    b2.g = i;
                    return b2;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                a.g.h.c.a();
            }
        }

        public final void a(VH vh, int i) {
            vh.d = i;
            if (c()) {
                vh.f = b(i);
            }
            vh.a(1, 519);
            a.g.h.c.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            a(vh, i, vh.m());
            vh.d();
            ViewGroup.LayoutParams layoutParams = vh.f966b.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f988c = true;
            }
            a.g.h.c.a();
        }

        public void a(VH vh, int i, List<Object> list) {
            b(vh, i);
        }

        public void a(i iVar) {
            this.f970a.registerObserver(iVar);
        }

        public void a(RecyclerView recyclerView) {
        }

        public void a(boolean z) {
            if (!b()) {
                this.f971b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public boolean a(VH vh) {
            return false;
        }

        public long b(int i) {
            return -1;
        }

        public abstract VH b(ViewGroup viewGroup, int i);

        public final void b(int i, int i2) {
            this.f970a.a(i, i2);
        }

        public void b(VH vh) {
        }

        public abstract void b(VH vh, int i);

        public void b(i iVar) {
            this.f970a.unregisterObserver(iVar);
        }

        public void b(RecyclerView recyclerView) {
        }

        public final boolean b() {
            return this.f970a.a();
        }

        public int c(int i) {
            return 0;
        }

        public void c(VH vh) {
        }

        public final boolean c() {
            return this.f971b;
        }

        public final void d() {
            this.f970a.b();
        }

        public final void d(int i) {
            this.f970a.b(i, 1);
        }

        public void d(VH vh) {
        }
    }

    /* access modifiers changed from: package-private */
    public static class h extends Observable<i> {
        h() {
        }

        public void a(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a(i, i2, 1);
            }
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void b(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a(i, i2);
            }
        }
    }

    public static abstract class i {
        public void a() {
        }

        public void a(int i, int i2) {
        }

        public void a(int i, int i2, int i3) {
        }
    }

    public interface j {
        int a(int i, int i2);
    }

    public static class k {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        private b f972a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<a> f973b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private long f974c = 120;
        private long d = 120;
        private long e = 250;
        private long f = 250;

        public interface a {
            void a();
        }

        /* access modifiers changed from: package-private */
        public interface b {
            void a(d0 d0Var);
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f975a;

            /* renamed from: b  reason: collision with root package name */
            public int f976b;

            public c a(d0 d0Var) {
                a(d0Var, 0);
                return this;
            }

            public c a(d0 d0Var, int i) {
                View view = d0Var.f966b;
                this.f975a = view.getLeft();
                this.f976b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i = d0Var.k & 14;
            if (d0Var.q()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int l = d0Var.l();
            int h = d0Var.h();
            return (l == -1 || h == -1 || l == h) ? i : i | 2048;
        }

        public c a(a0 a0Var, d0 d0Var) {
            c h = h();
            h.a(d0Var);
            return h;
        }

        public c a(a0 a0Var, d0 d0Var, int i, List<Object> list) {
            c h = h();
            h.a(d0Var);
            return h;
        }

        public final void a() {
            int size = this.f973b.size();
            for (int i = 0; i < size; i++) {
                this.f973b.get(i).a();
            }
            this.f973b.clear();
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f972a = bVar;
        }

        public abstract boolean a(d0 d0Var);

        public abstract boolean a(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public boolean a(d0 d0Var, List<Object> list) {
            return a(d0Var);
        }

        public final boolean a(a aVar) {
            boolean g = g();
            if (aVar != null) {
                if (!g) {
                    aVar.a();
                } else {
                    this.f973b.add(aVar);
                }
            }
            return g;
        }

        public abstract void b();

        public final void b(d0 d0Var) {
            d(d0Var);
            b bVar = this.f972a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public abstract boolean b(d0 d0Var, c cVar, c cVar2);

        public long c() {
            return this.f974c;
        }

        public abstract void c(d0 d0Var);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public long d() {
            return this.f;
        }

        public void d(d0 d0Var) {
        }

        public long e() {
            return this.e;
        }

        public long f() {
            return this.d;
        }

        public abstract boolean g();

        public c h() {
            return new c();
        }

        public abstract void i();
    }

    private class m implements l.b {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.b
        public void a(d0 d0Var) {
            d0Var.a(true);
            if (d0Var.i != null && d0Var.j == null) {
                d0Var.i = null;
            }
            d0Var.j = null;
            if (!d0Var.z() && !RecyclerView.this.removeAnimatingView(d0Var.f966b) && d0Var.u()) {
                RecyclerView.this.removeDetachedView(d0Var.f966b, false);
            }
        }
    }

    public static abstract class n {
        @Deprecated
        public void a(Canvas canvas, RecyclerView recyclerView) {
        }

        public void a(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            a(canvas, recyclerView);
        }

        @Deprecated
        public void a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            a(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void b(Canvas canvas, RecyclerView recyclerView) {
        }

        public void b(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            b(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: a  reason: collision with root package name */
        b f978a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f979b;

        /* renamed from: c  reason: collision with root package name */
        private final r.b f980c = new a();
        private final r.b d = new b();
        r e = new r(this.f980c);
        r f = new r(this.d);
        z g;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        private boolean k = true;
        private boolean l = true;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        class a implements r.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.r.b
            public int a() {
                return o.this.r() - o.this.p();
            }

            @Override // androidx.recyclerview.widget.r.b
            public int a(View view) {
                return o.this.f(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.r.b
            public View a(int i) {
                return o.this.d(i);
            }

            @Override // androidx.recyclerview.widget.r.b
            public int b() {
                return o.this.o();
            }

            @Override // androidx.recyclerview.widget.r.b
            public int b(View view) {
                return o.this.i(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements r.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.r.b
            public int a() {
                return o.this.h() - o.this.n();
            }

            @Override // androidx.recyclerview.widget.r.b
            public int a(View view) {
                return o.this.j(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.r.b
            public View a(int i) {
                return o.this.d(i);
            }

            @Override // androidx.recyclerview.widget.r.b
            public int b() {
                return o.this.q();
            }

            @Override // androidx.recyclerview.widget.r.b
            public int b(View view) {
                return o.this.e(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i, int i2);
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f983a;

            /* renamed from: b  reason: collision with root package name */
            public int f984b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f985c;
            public boolean d;
        }

        public static int a(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int a(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.a(int, int, int, int, boolean):int");
        }

        public static d a(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.l.d.RecyclerView, i2, i3);
            dVar.f983a = obtainStyledAttributes.getInt(a.l.d.RecyclerView_android_orientation, 1);
            dVar.f984b = obtainStyledAttributes.getInt(a.l.d.RecyclerView_spanCount, 1);
            dVar.f985c = obtainStyledAttributes.getBoolean(a.l.d.RecyclerView_reverseLayout, false);
            dVar.d = obtainStyledAttributes.getBoolean(a.l.d.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private void a(int i2, View view) {
            this.f978a.a(i2);
        }

        private void a(View view, int i2, boolean z) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.s()) {
                this.f979b.mViewInfoStore.a(childViewHolderInt);
            } else {
                this.f979b.mViewInfoStore.g(childViewHolderInt);
            }
            p pVar = (p) view.getLayoutParams();
            if (childViewHolderInt.C() || childViewHolderInt.t()) {
                if (childViewHolderInt.t()) {
                    childViewHolderInt.B();
                } else {
                    childViewHolderInt.e();
                }
                this.f978a.a(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f979b) {
                int b2 = this.f978a.b(view);
                if (i2 == -1) {
                    i2 = this.f978a.a();
                }
                if (b2 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f979b.indexOfChild(view) + this.f979b.exceptionLabel());
                } else if (b2 != i2) {
                    this.f979b.mLayout.a(b2, i2);
                }
            } else {
                this.f978a.a(view, i2, false);
                pVar.f988c = true;
                z zVar = this.g;
                if (zVar != null && zVar.e()) {
                    this.g.b(view);
                }
            }
            if (pVar.d) {
                childViewHolderInt.f966b.invalidate();
                pVar.d = false;
            }
        }

        private void a(v vVar, int i2, View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.A()) {
                if (!childViewHolderInt.q() || childViewHolderInt.s() || this.f979b.mAdapter.c()) {
                    b(i2);
                    vVar.c(view);
                    this.f979b.mViewInfoStore.d(childViewHolderInt);
                    return;
                }
                h(i2);
                vVar.b(childViewHolderInt);
            }
        }

        private static boolean b(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private int[] c(View view, Rect rect) {
            int[] iArr = new int[2];
            int o2 = o();
            int q2 = q();
            int r2 = r() - p();
            int h2 = h() - n();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - o2;
            int min = Math.min(0, i2);
            int i3 = top - q2;
            int min2 = Math.min(0, i3);
            int i4 = width - r2;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - h2);
            if (k() != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private boolean d(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int o2 = o();
            int q2 = q();
            int r2 = r() - p();
            int h2 = h() - n();
            Rect rect = this.f979b.mTempRect;
            b(focusedChild, rect);
            return rect.left - i2 < r2 && rect.right - i2 > o2 && rect.top - i3 < h2 && rect.bottom - i3 > q2;
        }

        public void A() {
            this.h = true;
        }

        /* access modifiers changed from: package-private */
        public boolean B() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void C() {
            z zVar = this.g;
            if (zVar != null) {
                zVar.h();
            }
        }

        public boolean D() {
            return false;
        }

        public int a(int i2, v vVar, a0 a0Var) {
            return 0;
        }

        public int a(a0 a0Var) {
            return 0;
        }

        public int a(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView == null || recyclerView.mAdapter == null || !a()) {
                return 1;
            }
            return this.f979b.mAdapter.a();
        }

        public View a(View view, int i2, v vVar, a0 a0Var) {
            return null;
        }

        public p a(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public p a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public void a(int i2, int i3) {
            View d2 = d(i2);
            if (d2 != null) {
                b(i2);
                c(d2, i3);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.f979b.toString());
        }

        public void a(int i2, int i3, a0 a0Var, c cVar) {
        }

        public void a(int i2, c cVar) {
        }

        public void a(int i2, v vVar) {
            View d2 = d(i2);
            h(i2);
            vVar.b(d2);
        }

        /* access modifiers changed from: package-private */
        public void a(a.g.l.d0.c cVar) {
            RecyclerView recyclerView = this.f979b;
            a(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        public void a(Rect rect, int i2, int i3) {
            c(a(i2, rect.width() + o() + p(), m()), a(i3, rect.height() + q() + n(), l()));
        }

        public void a(Parcelable parcelable) {
        }

        public void a(View view) {
            a(view, -1);
        }

        public void a(View view, int i2) {
            a(view, i2, true);
        }

        public void a(View view, int i2, int i3) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f979b.getItemDecorInsetsForChild(view);
            int i4 = i2 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i5 = i3 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int a2 = a(r(), s(), o() + p() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).width, a());
            int a3 = a(h(), i(), q() + n() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) pVar).height, b());
            if (a(view, a2, a3, pVar)) {
                view.measure(a2, a3);
            }
        }

        public void a(View view, int i2, int i3, int i4, int i5) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f987b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void a(View view, int i2, p pVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.s()) {
                this.f979b.mViewInfoStore.a(childViewHolderInt);
            } else {
                this.f979b.mViewInfoStore.g(childViewHolderInt);
            }
            this.f978a.a(view, i2, pVar, childViewHolderInt.s());
        }

        /* access modifiers changed from: package-private */
        public void a(View view, a.g.l.d0.c cVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.s() && !this.f978a.c(childViewHolderInt.f966b)) {
                RecyclerView recyclerView = this.f979b;
                a(recyclerView.mRecycler, recyclerView.mState, view, cVar);
            }
        }

        public void a(View view, Rect rect) {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public void a(View view, v vVar) {
            o(view);
            vVar.b(view);
        }

        public void a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).f987b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f979b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f979b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f979b;
            a(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void a(g gVar, g gVar2) {
        }

        public void a(v vVar) {
            for (int e2 = e() - 1; e2 >= 0; e2--) {
                a(vVar, e2, d(e2));
            }
        }

        public void a(v vVar, a0 a0Var, int i2, int i3) {
            this.f979b.defaultOnMeasure(i2, i3);
        }

        public void a(v vVar, a0 a0Var, a.g.l.d0.c cVar) {
            if (this.f979b.canScrollVertically(-1) || this.f979b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.k(true);
            }
            if (this.f979b.canScrollVertically(1) || this.f979b.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.k(true);
            }
            cVar.a(c.b.a(b(vVar, a0Var), a(vVar, a0Var), d(vVar, a0Var), c(vVar, a0Var)));
        }

        public void a(v vVar, a0 a0Var, View view, a.g.l.d0.c cVar) {
            cVar.b(c.C0019c.a(b() ? l(view) : 0, 1, a() ? l(view) : 0, 1, false, false));
        }

        public void a(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f979b.canScrollVertically(-1) && !this.f979b.canScrollHorizontally(-1) && !this.f979b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                g gVar = this.f979b.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.a());
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(z zVar) {
            if (this.g == zVar) {
                this.g = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView) {
            this.i = true;
            b(recyclerView);
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
            c(recyclerView, i2, i3);
        }

        public void a(RecyclerView recyclerView, a0 a0Var, int i2) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView, v vVar) {
            this.i = false;
            b(recyclerView, vVar);
        }

        public void a(String str) {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public boolean a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f979b;
            return a(recyclerView.mRecycler, recyclerView.mState, i2, bundle);
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, int i2, int i3, p pVar) {
            return view.isLayoutRequested() || !this.k || !b(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) pVar).width) || !b(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f979b;
            return a(recyclerView.mRecycler, recyclerView.mState, view, i2, bundle);
        }

        public boolean a(View view, boolean z, boolean z2) {
            boolean z3 = this.e.a(view, 24579) && this.f.a(view, 24579);
            return z ? z3 : !z3;
        }

        public boolean a(p pVar) {
            return pVar != null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(androidx.recyclerview.widget.RecyclerView.v r8, androidx.recyclerview.widget.RecyclerView.a0 r9, int r10, android.os.Bundle r11) {
            /*
            // Method dump skipped, instructions count: 130
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        public boolean a(v vVar, a0 a0Var, View view, int i2, Bundle bundle) {
            return false;
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return a(recyclerView, view, rect, z, false);
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] c2 = c(view, rect);
            int i2 = c2[0];
            int i3 = c2[1];
            if ((z2 && !d(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.smoothScrollBy(i2, i3);
            }
            return true;
        }

        @Deprecated
        public boolean a(RecyclerView recyclerView, View view, View view2) {
            return x() || recyclerView.isComputingLayout();
        }

        public boolean a(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return a(recyclerView, view, view2);
        }

        public boolean a(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        public boolean a(Runnable runnable) {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int b(int i2, v vVar, a0 a0Var) {
            return 0;
        }

        public int b(a0 a0Var) {
            return 0;
        }

        public int b(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView == null || recyclerView.mAdapter == null || !b()) {
                return 1;
            }
            return this.f979b.mAdapter.a();
        }

        public void b(int i2) {
            a(i2, d(i2));
        }

        /* access modifiers changed from: package-private */
        public void b(int i2, int i3) {
            this.q = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.p = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.r = 0;
            }
        }

        public void b(View view) {
            b(view, -1);
        }

        public void b(View view, int i2) {
            a(view, i2, false);
        }

        public void b(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public void b(v vVar) {
            for (int e2 = e() - 1; e2 >= 0; e2--) {
                if (!RecyclerView.getChildViewHolderInt(d(e2)).A()) {
                    a(e2, vVar);
                }
            }
        }

        public void b(z zVar) {
            z zVar2 = this.g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.e())) {
                this.g.h();
            }
            this.g = zVar;
            zVar.a(this.f979b, this);
        }

        public void b(RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }

        public void b(RecyclerView recyclerView, v vVar) {
            c(recyclerView);
        }

        public boolean b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, int i2, int i3, p pVar) {
            return !this.k || !b(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) pVar).width) || !b(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        public int c(a0 a0Var) {
            return 0;
        }

        public int c(v vVar, a0 a0Var) {
            return 0;
        }

        public View c(int i2) {
            int e2 = e();
            for (int i3 = 0; i3 < e2; i3++) {
                View d2 = d(i3);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(d2);
                if (childViewHolderInt != null && childViewHolderInt.k() == i2 && !childViewHolderInt.A() && (this.f979b.mState.d() || !childViewHolderInt.s())) {
                    return d2;
                }
            }
            return null;
        }

        public View c(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f979b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f978a.c(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public abstract p c();

        public void c(int i2, int i3) {
            this.f979b.setMeasuredDimension(i2, i3);
        }

        public void c(View view, int i2) {
            a(view, i2, (p) view.getLayoutParams());
        }

        /* access modifiers changed from: package-private */
        public void c(v vVar) {
            int e2 = vVar.e();
            for (int i2 = e2 - 1; i2 >= 0; i2--) {
                View c2 = vVar.c(i2);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(c2);
                if (!childViewHolderInt.A()) {
                    childViewHolderInt.a(false);
                    if (childViewHolderInt.u()) {
                        this.f979b.removeDetachedView(c2, false);
                    }
                    l lVar = this.f979b.mItemAnimator;
                    if (lVar != null) {
                        lVar.c(childViewHolderInt);
                    }
                    childViewHolderInt.a(true);
                    vVar.a(c2);
                }
            }
            vVar.c();
            if (e2 > 0) {
                this.f979b.invalidate();
            }
        }

        @Deprecated
        public void c(RecyclerView recyclerView) {
        }

        public void c(RecyclerView recyclerView, int i2, int i3) {
        }

        public int d() {
            return -1;
        }

        public int d(View view) {
            return ((p) view.getLayoutParams()).f987b.bottom;
        }

        public int d(a0 a0Var) {
            return 0;
        }

        public View d(int i2) {
            b bVar = this.f978a;
            if (bVar != null) {
                return bVar.c(i2);
            }
            return null;
        }

        public View d(View view, int i2) {
            return null;
        }

        /* access modifiers changed from: package-private */
        public void d(int i2, int i3) {
            int e2 = e();
            if (e2 == 0) {
                this.f979b.defaultOnMeasure(i2, i3);
                return;
            }
            int i4 = RecyclerView.UNDEFINED_DURATION;
            int i5 = RecyclerView.UNDEFINED_DURATION;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < e2; i8++) {
                View d2 = d(i8);
                Rect rect = this.f979b.mTempRect;
                b(d2, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.f979b.mTempRect.set(i6, i7, i4, i5);
            a(this.f979b.mTempRect, i2, i3);
        }

        public void d(RecyclerView recyclerView) {
        }

        public boolean d(v vVar, a0 a0Var) {
            return false;
        }

        public int e() {
            b bVar = this.f978a;
            if (bVar != null) {
                return bVar.a();
            }
            return 0;
        }

        public int e(View view) {
            return view.getBottom() + d(view);
        }

        public int e(a0 a0Var) {
            return 0;
        }

        public void e(int i2) {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i2);
            }
        }

        public void e(v vVar, a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* access modifiers changed from: package-private */
        public void e(RecyclerView recyclerView) {
            b(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int f(View view) {
            return view.getLeft() - k(view);
        }

        public int f(a0 a0Var) {
            return 0;
        }

        public void f(int i2) {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void f(RecyclerView recyclerView) {
            int i2;
            if (recyclerView == null) {
                this.f979b = null;
                this.f978a = null;
                i2 = 0;
                this.q = 0;
            } else {
                this.f979b = recyclerView;
                this.f978a = recyclerView.mChildHelper;
                this.q = recyclerView.getWidth();
                i2 = recyclerView.getHeight();
            }
            this.r = i2;
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public boolean f() {
            RecyclerView recyclerView = this.f979b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int g(View view) {
            Rect rect = ((p) view.getLayoutParams()).f987b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public View g() {
            View focusedChild;
            RecyclerView recyclerView = this.f979b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f978a.c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void g(int i2) {
        }

        public void g(a0 a0Var) {
        }

        public int h() {
            return this.r;
        }

        public int h(View view) {
            Rect rect = ((p) view.getLayoutParams()).f987b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void h(int i2) {
            if (d(i2) != null) {
                this.f978a.e(i2);
            }
        }

        public int i() {
            return this.p;
        }

        public int i(View view) {
            return view.getRight() + m(view);
        }

        public void i(int i2) {
        }

        public int j() {
            RecyclerView recyclerView = this.f979b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.a();
            }
            return 0;
        }

        public int j(View view) {
            return view.getTop() - n(view);
        }

        public int k() {
            return a.g.l.u.o(this.f979b);
        }

        public int k(View view) {
            return ((p) view.getLayoutParams()).f987b.left;
        }

        public int l() {
            return a.g.l.u.p(this.f979b);
        }

        public int l(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public int m() {
            return a.g.l.u.q(this.f979b);
        }

        public int m(View view) {
            return ((p) view.getLayoutParams()).f987b.right;
        }

        public int n() {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int n(View view) {
            return ((p) view.getLayoutParams()).f987b.top;
        }

        public int o() {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void o(View view) {
            this.f978a.d(view);
        }

        public int p() {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int q() {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int r() {
            return this.q;
        }

        public int s() {
            return this.o;
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            int e2 = e();
            for (int i2 = 0; i2 < e2; i2++) {
                ViewGroup.LayoutParams layoutParams = d(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean u() {
            return this.i;
        }

        public boolean v() {
            return this.j;
        }

        public final boolean w() {
            return this.l;
        }

        public boolean x() {
            z zVar = this.g;
            return zVar != null && zVar.e();
        }

        public Parcelable y() {
            return null;
        }

        public void z() {
            RecyclerView recyclerView = this.f979b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        d0 f986a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f987b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f988c = true;
        boolean d = false;

        public p(int i, int i2) {
            super(i, i2);
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
        }

        public int a() {
            return this.f986a.k();
        }

        public boolean b() {
            return this.f986a.v();
        }

        public boolean c() {
            return this.f986a.s();
        }

        public boolean d() {
            return this.f986a.q();
        }
    }

    public interface q {
        void a(View view);

        void b(View view);
    }

    public static abstract class r {
        public abstract boolean a(int i, int i2);
    }

    public interface s {
        void a(boolean z);

        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class u {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f989a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private int f990b = 0;

        /* access modifiers changed from: package-private */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<d0> f991a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f992b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f993c = 0;
            long d = 0;

            a() {
            }
        }

        private a b(int i) {
            a aVar = this.f989a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f989a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public long a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public d0 a(int i) {
            a aVar = this.f989a.get(i);
            if (aVar == null || aVar.f991a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.f991a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).o()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f990b++;
        }

        /* access modifiers changed from: package-private */
        public void a(int i, long j) {
            a b2 = b(i);
            b2.d = a(b2.d, j);
        }

        public void a(d0 d0Var) {
            int j = d0Var.j();
            ArrayList<d0> arrayList = b(j).f991a;
            if (this.f989a.get(j).f992b > arrayList.size()) {
                d0Var.x();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.f990b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i, long j, long j2) {
            long j3 = b(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        public void b() {
            for (int i = 0; i < this.f989a.size(); i++) {
                this.f989a.valueAt(i).f991a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i, long j) {
            a b2 = b(i);
            b2.f993c = a(b2.f993c, j);
        }

        /* access modifiers changed from: package-private */
        public boolean b(int i, long j, long j2) {
            long j3 = b(i).f993c;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f990b--;
        }
    }

    public final class v {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<d0> f994a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        ArrayList<d0> f995b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<d0> f996c = new ArrayList<>();
        private final List<d0> d = Collections.unmodifiableList(this.f994a);
        private int e = 2;
        int f = 2;
        u g;
        private b0 h;

        public v() {
        }

        private void a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private boolean a(d0 d0Var, int i2, int i3, long j) {
            d0Var.s = RecyclerView.this;
            int j2 = d0Var.j();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != RecyclerView.FOREVER_NS && !this.g.a(j2, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.a(d0Var, i2);
            this.g.a(d0Var.j(), RecyclerView.this.getNanoTime() - nanoTime);
            e(d0Var);
            if (!RecyclerView.this.mState.d()) {
                return true;
            }
            d0Var.h = i3;
            return true;
        }

        private void e(d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.f966b;
                if (a.g.l.u.m(view) == 0) {
                    a.g.l.u.h(view, 1);
                }
                n nVar = RecyclerView.this.mAccessibilityDelegate;
                if (nVar != null) {
                    a.g.l.a b2 = nVar.b();
                    if (b2 instanceof n.a) {
                        ((n.a) b2).d(view);
                    }
                    a.g.l.u.a(view, b2);
                }
            }
        }

        private void f(d0 d0Var) {
            View view = d0Var.f966b;
            if (view instanceof ViewGroup) {
                a((ViewGroup) view, false);
            }
        }

        public int a(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.mState.a()) {
                return !RecyclerView.this.mState.d() ? i2 : RecyclerView.this.mAdapterHelper.b(i2);
            }
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.mState.a() + RecyclerView.this.exceptionLabel());
        }

        /* access modifiers changed from: package-private */
        public d0 a(int i2, boolean z) {
            View b2;
            int size = this.f994a.size();
            for (int i3 = 0; i3 < size; i3++) {
                d0 d0Var = this.f994a.get(i3);
                if (!d0Var.C() && d0Var.k() == i2 && !d0Var.q() && (RecyclerView.this.mState.h || !d0Var.s())) {
                    d0Var.a(32);
                    return d0Var;
                }
            }
            if (z || (b2 = RecyclerView.this.mChildHelper.b(i2)) == null) {
                int size2 = this.f996c.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    d0 d0Var2 = this.f996c.get(i4);
                    if (!d0Var2.q() && d0Var2.k() == i2 && !d0Var2.o()) {
                        if (!z) {
                            this.f996c.remove(i4);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(b2);
            RecyclerView.this.mChildHelper.f(b2);
            int b3 = RecyclerView.this.mChildHelper.b(b2);
            if (b3 != -1) {
                RecyclerView.this.mChildHelper.a(b3);
                c(b2);
                childViewHolderInt.a(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01c5  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x020c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.d0 a(int r17, boolean r18, long r19) {
            /*
            // Method dump skipped, instructions count: 608
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: package-private */
        public d0 a(long j, int i2, boolean z) {
            for (int size = this.f994a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f994a.get(size);
                if (d0Var.i() == j && !d0Var.C()) {
                    if (i2 == d0Var.j()) {
                        d0Var.a(32);
                        if (d0Var.s() && !RecyclerView.this.mState.d()) {
                            d0Var.a(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f994a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f966b, false);
                        a(d0Var.f966b);
                    }
                }
            }
            int size2 = this.f996c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = this.f996c.get(size2);
                if (d0Var2.i() == j && !d0Var2.o()) {
                    if (i2 == d0Var2.j()) {
                        if (!z) {
                            this.f996c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        e(size2);
                        return null;
                    }
                }
            }
        }

        public void a() {
            this.f994a.clear();
            i();
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3) {
            int size = this.f996c.size();
            for (int i4 = 0; i4 < size; i4++) {
                d0 d0Var = this.f996c.get(i4);
                if (d0Var != null && d0Var.d >= i2) {
                    d0Var.a(i3, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.f996c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f996c.get(size);
                if (d0Var != null) {
                    int i5 = d0Var.d;
                    if (i5 >= i4) {
                        d0Var.a(-i3, z);
                    } else if (i5 >= i2) {
                        d0Var.a(8);
                        e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.o = null;
            childViewHolderInt.p = false;
            childViewHolderInt.e();
            b(childViewHolderInt);
        }

        /* access modifiers changed from: package-private */
        public void a(b0 b0Var) {
            this.h = b0Var;
        }

        /* access modifiers changed from: package-private */
        public void a(d0 d0Var) {
            w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.d(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.h(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.f966b;
            n nVar = RecyclerView.this.mAccessibilityDelegate;
            if (nVar != null) {
                a.g.l.a b2 = nVar.b();
                a.g.l.u.a(view, b2 instanceof n.a ? ((n.a) b2).c(view) : null);
            }
            if (z) {
                a(d0Var);
            }
            d0Var.s = null;
            d().a(d0Var);
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar, g gVar2, boolean z) {
            a();
            d().a(gVar, gVar2, z);
        }

        /* access modifiers changed from: package-private */
        public void a(u uVar) {
            u uVar2 = this.g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.g.a();
            }
        }

        /* access modifiers changed from: package-private */
        public View b(int i2, boolean z) {
            return a(i2, z, RecyclerView.FOREVER_NS).f966b;
        }

        /* access modifiers changed from: package-private */
        public d0 b(int i2) {
            int size;
            int b2;
            ArrayList<d0> arrayList = this.f995b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                for (int i3 = 0; i3 < size; i3++) {
                    d0 d0Var = this.f995b.get(i3);
                    if (!d0Var.C() && d0Var.k() == i2) {
                        d0Var.a(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.c() && (b2 = RecyclerView.this.mAdapterHelper.b(i2)) > 0 && b2 < RecyclerView.this.mAdapter.a()) {
                    long b3 = RecyclerView.this.mAdapter.b(b2);
                    for (int i4 = 0; i4 < size; i4++) {
                        d0 d0Var2 = this.f995b.get(i4);
                        if (!d0Var2.C() && d0Var2.i() == b3) {
                            d0Var2.a(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int size = this.f996c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f996c.get(i2).c();
            }
            int size2 = this.f994a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f994a.get(i3).c();
            }
            ArrayList<d0> arrayList = this.f995b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f995b.get(i4).c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i6 = -1;
                i5 = i2;
                i4 = i3;
            } else {
                i6 = 1;
                i4 = i2;
                i5 = i3;
            }
            int size = this.f996c.size();
            for (int i8 = 0; i8 < size; i8++) {
                d0 d0Var = this.f996c.get(i8);
                if (d0Var != null && (i7 = d0Var.d) >= i5 && i7 <= i4) {
                    if (i7 == i2) {
                        d0Var.a(i3 - i2, false);
                    } else {
                        d0Var.a(i6, false);
                    }
                }
            }
        }

        public void b(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.u()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.t()) {
                childViewHolderInt.B();
            } else if (childViewHolderInt.C()) {
                childViewHolderInt.e();
            }
            b(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.r()) {
                RecyclerView.this.mItemAnimator.c(childViewHolderInt);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(d0 d0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.t() || d0Var.f966b.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.t());
                sb.append(" isAttached:");
                if (d0Var.f966b.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.u()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.exceptionLabel());
            } else if (!d0Var.A()) {
                boolean g2 = d0Var.g();
                g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && g2 && gVar.a(d0Var)) || d0Var.r()) {
                    if (this.f <= 0 || d0Var.b(526)) {
                        z = false;
                    } else {
                        int size = this.f996c.size();
                        if (size >= this.f && size > 0) {
                            e(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.a(d0Var.d)) {
                            int i2 = size - 1;
                            while (i2 >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.a(this.f996c.get(i2).d)) {
                                    break;
                                }
                                i2--;
                            }
                            size = i2 + 1;
                        }
                        this.f996c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        a(d0Var, true);
                        z2 = z;
                        RecyclerView.this.mViewInfoStore.h(d0Var);
                        if (!z2 && !z3 && g2) {
                            d0Var.s = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.mViewInfoStore.h(d0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
        }

        /* access modifiers changed from: package-private */
        public View c(int i2) {
            return this.f994a.get(i2).f966b;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f994a.clear();
            ArrayList<d0> arrayList = this.f995b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.f996c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f996c.get(size);
                if (d0Var != null && (i4 = d0Var.d) >= i2 && i4 < i5) {
                    d0Var.a(2);
                    e(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(View view) {
            ArrayList<d0> arrayList;
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.b(12) && childViewHolderInt.v() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f995b == null) {
                    this.f995b = new ArrayList<>();
                }
                childViewHolderInt.a(this, true);
                arrayList = this.f995b;
            } else if (!childViewHolderInt.q() || childViewHolderInt.s() || RecyclerView.this.mAdapter.c()) {
                childViewHolderInt.a(this, false);
                arrayList = this.f994a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
            arrayList.add(childViewHolderInt);
        }

        /* access modifiers changed from: package-private */
        public void c(d0 d0Var) {
            (d0Var.p ? this.f995b : this.f994a).remove(d0Var);
            d0Var.o = null;
            d0Var.p = false;
            d0Var.e();
        }

        public View d(int i2) {
            return b(i2, false);
        }

        /* access modifiers changed from: package-private */
        public u d() {
            if (this.g == null) {
                this.g = new u();
            }
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public boolean d(d0 d0Var) {
            if (d0Var.s()) {
                return RecyclerView.this.mState.d();
            }
            int i2 = d0Var.d;
            if (i2 < 0 || i2 >= RecyclerView.this.mAdapter.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.exceptionLabel());
            } else if (RecyclerView.this.mState.d() || RecyclerView.this.mAdapter.c(d0Var.d) == d0Var.j()) {
                return !RecyclerView.this.mAdapter.c() || d0Var.i() == RecyclerView.this.mAdapter.b(d0Var.d);
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f994a.size();
        }

        /* access modifiers changed from: package-private */
        public void e(int i2) {
            a(this.f996c.get(i2), true);
            this.f996c.remove(i2);
        }

        public List<d0> f() {
            return this.d;
        }

        public void f(int i2) {
            this.e = i2;
            j();
        }

        /* access modifiers changed from: package-private */
        public void g() {
            int size = this.f996c.size();
            for (int i2 = 0; i2 < size; i2++) {
                p pVar = (p) this.f996c.get(i2).f966b.getLayoutParams();
                if (pVar != null) {
                    pVar.f988c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            int size = this.f996c.size();
            for (int i2 = 0; i2 < size; i2++) {
                d0 d0Var = this.f996c.get(i2);
                if (d0Var != null) {
                    d0Var.a(6);
                    d0Var.a((Object) null);
                }
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.c()) {
                i();
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            for (int size = this.f996c.size() - 1; size >= 0; size--) {
                e(size);
            }
            this.f996c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void j() {
            o oVar = RecyclerView.this.mLayout;
            this.f = this.e + (oVar != null ? oVar.m : 0);
            for (int size = this.f996c.size() - 1; size >= 0 && this.f996c.size() > this.f; size--) {
                e(size);
            }
        }
    }

    public interface w {
        void a(d0 d0Var);
    }

    /* access modifiers changed from: private */
    public class x extends i {
        x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.c()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.b(i, i2)) {
                b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.a(i, i2, i3)) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    a.g.l.u.a(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    public static class y extends a.i.a.a {
        public static final Parcelable.Creator<y> CREATOR = new a();
        Parcelable d;

        static class a implements Parcelable.ClassLoaderCreator<y> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public y[] newArray(int i) {
                return new y[i];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        public void a(y yVar) {
            this.d = yVar.d;
        }

        @Override // a.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.d, 0);
        }
    }

    public static abstract class z {

        /* renamed from: a  reason: collision with root package name */
        private int f998a = -1;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f999b;

        /* renamed from: c  reason: collision with root package name */
        private o f1000c;
        private boolean d;
        private boolean e;
        private View f;
        private final a g = new a(0, 0);
        private boolean h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f1001a;

            /* renamed from: b  reason: collision with root package name */
            private int f1002b;

            /* renamed from: c  reason: collision with root package name */
            private int f1003c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;

            public a(int i, int i2) {
                this(i, i2, RecyclerView.UNDEFINED_DURATION, null);
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.f1001a = i;
                this.f1002b = i2;
                this.f1003c = i3;
                this.e = interpolator;
            }

            private void b() {
                if (this.e != null && this.f1003c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f1003c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public void a(int i) {
                this.d = i;
            }

            public void a(int i, int i2, int i3, Interpolator interpolator) {
                this.f1001a = i;
                this.f1002b = i2;
                this.f1003c = i3;
                this.e = interpolator;
                this.f = true;
            }

            /* access modifiers changed from: package-private */
            public void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f = false;
                } else if (this.f) {
                    b();
                    recyclerView.mViewFlinger.a(this.f1001a, this.f1002b, this.f1003c, this.e);
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                } else {
                    this.g = 0;
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a() {
                return this.d >= 0;
            }
        }

        public interface b {
            PointF a(int i);
        }

        public int a() {
            return this.f999b.mLayout.e();
        }

        public int a(View view) {
            return this.f999b.getChildLayoutPosition(view);
        }

        public PointF a(int i) {
            o b2 = b();
            if (b2 instanceof b) {
                return ((b) b2).a(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* access modifiers changed from: package-private */
        public void a(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.f999b;
            if (this.f998a == -1 || recyclerView == null) {
                h();
            }
            if (!(!this.d || this.f != null || this.f1000c == null || (a2 = a(this.f998a)) == null || (a2.x == 0.0f && a2.y == 0.0f))) {
                recyclerView.scrollStep((int) Math.signum(a2.x), (int) Math.signum(a2.y), null);
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (a(view) == this.f998a) {
                    a(this.f, recyclerView.mState, this.g);
                    this.g.a(recyclerView);
                    h();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                a(i, i2, recyclerView.mState, this.g);
                boolean a3 = this.g.a();
                this.g.a(recyclerView);
                if (a3 && this.e) {
                    this.d = true;
                    recyclerView.mViewFlinger.a();
                }
            }
        }

        /* access modifiers changed from: protected */
        public abstract void a(int i, int i2, a0 a0Var, a aVar);

        /* access modifiers changed from: protected */
        public void a(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: protected */
        public abstract void a(View view, a0 a0Var, a aVar);

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView, o oVar) {
            recyclerView.mViewFlinger.b();
            if (this.h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f999b = recyclerView;
            this.f1000c = oVar;
            int i = this.f998a;
            if (i != -1) {
                recyclerView.mState.f959a = i;
                this.e = true;
                this.d = true;
                this.f = b(c());
                f();
                this.f999b.mViewFlinger.a();
                this.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public View b(int i) {
            return this.f999b.mLayout.c(i);
        }

        public o b() {
            return this.f1000c;
        }

        /* access modifiers changed from: protected */
        public void b(View view) {
            if (a(view) == c()) {
                this.f = view;
            }
        }

        public int c() {
            return this.f998a;
        }

        public void c(int i) {
            this.f998a = i;
        }

        public boolean d() {
            return this.d;
        }

        public boolean e() {
            return this.e;
        }

        /* access modifiers changed from: protected */
        public abstract void f();

        /* access modifiers changed from: protected */
        public abstract void g();

        /* access modifiers changed from: protected */
        public final void h() {
            if (this.e) {
                this.e = false;
                g();
                this.f999b.mState.f959a = -1;
                this.f = null;
                this.f998a = -1;
                this.d = false;
                this.f1000c.a(this);
                this.f1000c = null;
                this.f999b = null;
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i2 == 18 || i2 == 19 || i2 == 20;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.l.a.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new s();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z2 = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new e.b() : null;
        this.mState = new a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = a.g.l.v.b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = a.g.l.v.c(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.a(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (a.g.l.u.m(this) == 0) {
            a.g.l.u.h(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new n(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.l.d.RecyclerView, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, a.l.d.RecyclerView, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(a.l.d.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(a.l.d.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(a.l.d.RecyclerView_android_clipToPadding, true);
        boolean z3 = obtainStyledAttributes.getBoolean(a.l.d.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z3;
        if (z3) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(a.l.d.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(a.l.d.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(a.l.d.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(a.l.d.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i2, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i2, 0);
            }
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    private void addAnimatingView(d0 d0Var) {
        View view = d0Var.f966b;
        boolean z2 = view.getParent() == this;
        this.mRecycler.c(getChildViewHolder(view));
        if (d0Var.u()) {
            this.mChildHelper.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        b bVar = this.mChildHelper;
        if (!z2) {
            bVar.a(view, true);
        } else {
            bVar.a(view);
        }
    }

    private void animateChange(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        d0Var.a(false);
        if (z2) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z3) {
                addAnimatingView(d0Var2);
            }
            d0Var.i = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.c(d0Var);
            d0Var2.a(false);
            d0Var2.j = d0Var;
        }
        if (this.mItemAnimator.a(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f967c;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                View view = (View) viewParent;
                while (true) {
                    if (view == null) {
                        d0Var.f967c = null;
                        return;
                    } else if (view != d0Var.f966b) {
                        viewParent = view.getParent();
                        if (!(viewParent instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e8);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            a.g.l.d0.b.a(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z2 = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        a0 a0Var = this.mState;
        if (!a0Var.k || !this.mItemsChanged) {
            z2 = false;
        }
        a0Var.i = z2;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0 a0Var2 = this.mState;
        a0Var2.h = a0Var2.l;
        a0Var2.f = this.mAdapter.a();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.k) {
            int a2 = this.mChildHelper.a();
            for (int i2 = 0; i2 < a2; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
                if (!childViewHolderInt.A() && (!childViewHolderInt.q() || this.mAdapter.c())) {
                    this.mViewInfoStore.c(childViewHolderInt, this.mItemAnimator.a(this.mState, childViewHolderInt, l.e(childViewHolderInt), childViewHolderInt.m()));
                    if (this.mState.i && childViewHolderInt.v() && !childViewHolderInt.s() && !childViewHolderInt.A() && !childViewHolderInt.q()) {
                        this.mViewInfoStore.a(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.l) {
            saveOldPositions();
            a0 a0Var3 = this.mState;
            boolean z3 = a0Var3.g;
            a0Var3.g = false;
            this.mLayout.e(this.mRecycler, a0Var3);
            this.mState.g = z3;
            for (int i3 = 0; i3 < this.mChildHelper.a(); i3++) {
                d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.c(i3));
                if (!childViewHolderInt2.A() && !this.mViewInfoStore.c(childViewHolderInt2)) {
                    int e2 = l.e(childViewHolderInt2);
                    boolean b2 = childViewHolderInt2.b(8192);
                    if (!b2) {
                        e2 |= 4096;
                    }
                    l.c a3 = this.mItemAnimator.a(this.mState, childViewHolderInt2, e2, childViewHolderInt2.m());
                    if (b2) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, a3);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, a3);
                    }
                }
            }
        }
        clearOldPositions();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.b();
        this.mState.f = this.mAdapter.a();
        a0 a0Var = this.mState;
        a0Var.d = 0;
        a0Var.h = false;
        this.mLayout.e(this.mRecycler, a0Var);
        a0 a0Var2 = this.mState;
        a0Var2.g = false;
        this.mPendingSavedState = null;
        a0Var2.k = a0Var2.k && this.mItemAnimator != null;
        this.mState.e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a0 a0Var = this.mState;
        a0Var.e = 1;
        if (a0Var.k) {
            for (int a2 = this.mChildHelper.a() - 1; a2 >= 0; a2--) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(a2));
                if (!childViewHolderInt.A()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    l.c a3 = this.mItemAnimator.a(this.mState, childViewHolderInt);
                    d0 a4 = this.mViewInfoStore.a(changedHolderKey);
                    if (a4 != null && !a4.A()) {
                        boolean b2 = this.mViewInfoStore.b(a4);
                        boolean b3 = this.mViewInfoStore.b(childViewHolderInt);
                        if (!b2 || a4 != childViewHolderInt) {
                            l.c f2 = this.mViewInfoStore.f(a4);
                            this.mViewInfoStore.b(childViewHolderInt, a3);
                            l.c e2 = this.mViewInfoStore.e(childViewHolderInt);
                            if (f2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, a4);
                            } else {
                                animateChange(a4, childViewHolderInt, f2, e2, b2, b3);
                            }
                        }
                    }
                    this.mViewInfoStore.b(childViewHolderInt, a3);
                }
            }
            this.mViewInfoStore.a(this.mViewInfoProcessCallback);
        }
        this.mLayout.c(this.mRecycler);
        a0 a0Var2 = this.mState;
        a0Var2.f961c = a0Var2.f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.k = false;
        a0Var2.l = false;
        this.mLayout.h = false;
        ArrayList<d0> arrayList = this.mRecycler.f995b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.mLayout;
        if (oVar.n) {
            oVar.m = 0;
            oVar.n = false;
            this.mRecycler.j();
        }
        this.mLayout.g(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.mOnItemTouchListeners.get(i2);
            if (sVar.a(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int a2 = this.mChildHelper.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = UNDEFINED_DURATION;
        for (int i4 = 0; i4 < a2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i4));
            if (!childViewHolderInt.A()) {
                int k2 = childViewHolderInt.k();
                if (k2 < i2) {
                    i2 = k2;
                }
                if (k2 > i3) {
                    i3 = k2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        d0 findViewHolderForAdapterPosition;
        int i2 = this.mState.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int a2 = this.mState.a();
        for (int i3 = i2; i3 < a2; i3++) {
            d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.f966b.hasFocusable()) {
                return findViewHolderForAdapterPosition2.f966b;
            }
        }
        int min = Math.min(a2, i2);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.f966b.hasFocusable()) {
                return findViewHolderForAdapterPosition.f966b;
            }
        }
    }

    static d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f986a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f987b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private a.g.l.m getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new a.g.l.m(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, d0 d0Var, d0 d0Var2) {
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                g gVar = this.mAdapter;
                if (gVar == null || !gVar.c()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
            if (!(childViewHolderInt == null || childViewHolderInt.A() || !childViewHolderInt.v())) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (a.g.l.u.n(this) == 0) {
            a.g.l.u.i(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new b(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i4 = this.mLayout.k() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        int i6 = this.mTempRect2.left;
        if ((i5 < i6 || rect.right <= i6) && this.mTempRect.right < this.mTempRect2.right) {
            i3 = 1;
        } else {
            Rect rect2 = this.mTempRect;
            int i7 = rect2.right;
            int i8 = this.mTempRect2.right;
            i3 = ((i7 > i8 || rect2.left >= i8) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        Rect rect3 = this.mTempRect;
        int i9 = rect3.top;
        int i10 = this.mTempRect2.top;
        if ((i9 < i10 || rect3.bottom <= i10) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c2 = 1;
        } else {
            Rect rect4 = this.mTempRect;
            int i11 = rect4.bottom;
            int i12 = this.mTempRect2.bottom;
            if ((i11 <= i12 && rect4.top < i12) || this.mTempRect.top <= this.mTempRect2.top) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        }
        if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + exceptionLabel());
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.D();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.f();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.d(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.e();
        } else {
            this.mAdapterHelper.b();
        }
        boolean z2 = false;
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.k = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z3 || this.mLayout.h) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.c());
        a0 a0Var = this.mState;
        if (a0Var.k && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        a0Var.l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.c(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.a() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                d0 findViewHolderForItemId = (this.mState.n == -1 || !this.mAdapter.c()) ? null : findViewHolderForItemId(this.mState.n);
                if (findViewHolderForItemId != null && !this.mChildHelper.c(findViewHolderForItemId.f966b) && findViewHolderForItemId.f966b.hasFocusable()) {
                    view = findViewHolderForItemId.f966b;
                } else if (this.mChildHelper.a() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i2 = this.mState.o;
                    if (!(((long) i2) == -1 || (findViewById = view.findViewById(i2)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            a.g.l.u.G(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f988c) {
                Rect rect = pVar.f987b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.a(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        a0 a0Var = this.mState;
        a0Var.n = -1;
        a0Var.m = -1;
        a0Var.o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.n = this.mAdapter.c() ? d0Var.i() : -1;
        this.mState.m = this.mDataSetHasChangedAfterLayout ? -1 : d0Var.s() ? d0Var.e : d0Var.h();
        this.mState.o = getDeepestFocusedViewWithId(d0Var.f966b);
    }

    private void setAdapterInternal(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.b(this.mObserver);
            this.mAdapter.b(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.f();
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.a(this.mObserver);
            gVar.a(this);
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a(gVar3, this.mAdapter);
        }
        this.mRecycler.a(gVar3, this.mAdapter, z2);
        this.mState.g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.b();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.C();
        }
    }

    /* access modifiers changed from: package-private */
    public void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            a.g.l.u.G(this);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.a(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addItemDecoration(n nVar) {
        addItemDecoration(nVar, -1);
    }

    public void addItemDecoration(n nVar, int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i2, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    /* access modifiers changed from: package-private */
    public void animateAppearance(d0 d0Var, l.c cVar, l.c cVar2) {
        d0Var.a(false);
        if (this.mItemAnimator.a(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void animateDisappearance(d0 d0Var, l.c cVar, l.c cVar2) {
        addAnimatingView(d0Var);
        d0Var.a(false);
        if (this.mItemAnimator.b(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    /* access modifiers changed from: package-private */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + exceptionLabel()));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean canReuseUpdatedViewHolder(d0 d0Var) {
        l lVar = this.mItemAnimator;
        return lVar == null || lVar.a(d0Var, d0Var.m());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.a((p) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void clearOldPositions() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (!childViewHolderInt.A()) {
                childViewHolderInt.c();
            }
        }
        this.mRecycler.b();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.a()) {
            return this.mLayout.a(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.a()) {
            return this.mLayout.b(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.a()) {
            return this.mLayout.c(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.b()) {
            return this.mLayout.d(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.b()) {
            return this.mLayout.e(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.b()) {
            return this.mLayout.f(this.mState);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            a.g.l.u.G(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            a.g.h.c.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            a.g.h.c.a();
        } else if (this.mAdapterHelper.c()) {
            if (this.mAdapterHelper.c(4) && !this.mAdapterHelper.c(11)) {
                a.g.h.c.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.e();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.a();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
            } else if (this.mAdapterHelper.c()) {
                a.g.h.c.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
            } else {
                return;
            }
            a.g.h.c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void defaultOnMeasure(int i2, int i3) {
        setMeasuredDimension(o.a(i2, getPaddingLeft() + getPaddingRight(), a.g.l.u.q(this)), o.a(i3, getPaddingTop() + getPaddingBottom(), a.g.l.u.p(this)));
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildAttached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.b(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildDetached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.c(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchLayout() {
        String str;
        if (this.mAdapter == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.mLayout == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            a0 a0Var = this.mState;
            a0Var.j = false;
            if (a0Var.e == 1) {
                dispatchLayoutStep1();
            } else if (!this.mAdapterHelper.d() && this.mLayout.r() == getWidth() && this.mLayout.h() == getHeight()) {
                this.mLayout.e(this);
                dispatchLayoutStep3();
                return;
            }
            this.mLayout.e(this);
            dispatchLayoutStep2();
            dispatchLayoutStep3();
            return;
        }
        Log.e(TAG, str);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2, i4);
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().a(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr, i6);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrollStateChanged(int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.g(i2);
        }
        onScrollStateChanged(i2);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.a(this, i2, i3);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: package-private */
    public void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.f966b.getParent() == this && !d0Var.A() && (i2 = d0Var.r) != -1) {
                a.g.l.u.h(d0Var.f966b, i2);
                d0Var.r = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        int i2;
        float f2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.mItemDecorations.get(i3).b(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                f2 = (float) ((-getWidth()) + getPaddingRight());
                i2 = (-getHeight()) + getPaddingBottom();
            } else {
                f2 = (float) (-getWidth());
                i2 = -getHeight();
            }
            canvas.translate(f2, (float) i2);
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.g()) {
            z4 = z2;
        }
        if (z4) {
            a.g.l.u.G(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: package-private */
    public void ensureBottomGlow() {
        int i2;
        int i3;
        if (this.mBottomGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 3);
            this.mBottomGlow = a2;
            if (this.mClipToPadding) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureLeftGlow() {
        int i2;
        int i3;
        if (this.mLeftGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 0);
            this.mLeftGlow = a2;
            if (this.mClipToPadding) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureRightGlow() {
        int i2;
        int i3;
        if (this.mRightGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 2);
            this.mRightGlow = a2;
            if (this.mClipToPadding) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureTopGlow() {
        int i2;
        int i3;
        if (this.mTopGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 1);
            this.mTopGlow = a2;
            if (this.mClipToPadding) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void fillRemainingScrollValues(a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.d;
            a0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.p = 0;
        a0Var.q = 0;
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int a2 = this.mChildHelper.a() - 1; a2 >= 0; a2--) {
            View c2 = this.mChildHelper.c(a2);
            float translationX = c2.getTranslationX();
            float translationY = c2.getTranslationY();
            if (f2 >= ((float) c2.getLeft()) + translationX && f2 <= ((float) c2.getRight()) + translationX && f3 >= ((float) c2.getTop()) + translationY && f3 <= ((float) c2.getBottom()) + translationY) {
                return c2;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public d0 findViewHolderForAdapterPosition(int i2) {
        d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int b2 = this.mChildHelper.b();
        for (int i3 = 0; i3 < b2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.s() && getAdapterPositionFor(childViewHolderInt) == i2) {
                if (!this.mChildHelper.c(childViewHolderInt.f966b)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForItemId(long j2) {
        g gVar = this.mAdapter;
        d0 d0Var = null;
        if (gVar != null && gVar.c()) {
            int b2 = this.mChildHelper.b();
            for (int i2 = 0; i2 < b2; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
                if (childViewHolderInt != null && !childViewHolderInt.s() && childViewHolderInt.i() == j2) {
                    if (!this.mChildHelper.c(childViewHolderInt.f966b)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    public d0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    /* access modifiers changed from: package-private */
    public d0 findViewHolderForPosition(int i2, boolean z2) {
        int b2 = this.mChildHelper.b();
        d0 d0Var = null;
        for (int i3 = 0; i3 < b2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.s()) {
                if (z2) {
                    if (childViewHolderInt.d != i2) {
                        continue;
                    }
                } else if (childViewHolderInt.k() != i2) {
                    continue;
                }
                if (!this.mChildHelper.c(childViewHolderInt.f966b)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public boolean fling(int i2, int i3) {
        o oVar = this.mLayout;
        int i4 = 0;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean a2 = oVar.a();
            boolean b2 = this.mLayout.b();
            if (!a2 || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (!b2 || Math.abs(i3) < this.mMinFlingVelocity) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            float f2 = (float) i2;
            float f3 = (float) i3;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z2 = a2 || b2;
                dispatchNestedFling(f2, f3, z2);
                r rVar = this.mOnFlingListener;
                if (rVar != null && rVar.a(i2, i3)) {
                    return true;
                }
                if (z2) {
                    if (a2) {
                        i4 = 1;
                    }
                    if (b2) {
                        i4 |= 2;
                    }
                    startNestedScroll(i4, 1);
                    int i5 = this.mMaxFlingVelocity;
                    int max = Math.max(-i5, Math.min(i2, i5));
                    int i6 = this.mMaxFlingVelocity;
                    this.mViewFlinger.a(max, Math.max(-i6, Math.min(i3, i6)));
                    return true;
                }
            }
            return false;
        }
    }

    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View d2 = this.mLayout.d(view, i2);
        if (d2 != null) {
            return d2;
        }
        boolean z3 = true;
        boolean z4 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z4 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z4) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.a(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.b()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = instance.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.a()) {
                int i4 = (this.mLayout.k() == 1) ^ (i2 == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i4) != null) {
                    z3 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
                z2 = z3;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.a(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        requestChildOnScreen(view2, null);
        return view;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.c();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    /* access modifiers changed from: package-private */
    public int getAdapterPositionFor(d0 d0Var) {
        if (d0Var.b(524) || !d0Var.p()) {
            return -1;
        }
        return this.mAdapterHelper.a(d0Var.d);
    }

    public int getBaseline() {
        o oVar = this.mLayout;
        return oVar != null ? oVar.d() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public long getChangedHolderKey(d0 d0Var) {
        return this.mAdapter.c() ? d0Var.i() : (long) d0Var.d;
    }

    public int getChildAdapterPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.h();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.mChildDrawingOrderCallback;
        return jVar == null ? super.getChildDrawingOrder(i2, i3) : jVar.a(i2, i3);
    }

    public long getChildItemId(View view) {
        d0 childViewHolderInt;
        g gVar = this.mAdapter;
        if (gVar == null || !gVar.c() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.i();
    }

    public int getChildLayoutPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.k();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public n getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: package-private */
    public Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f988c) {
            return pVar.f987b;
        }
        if (this.mState.d() && (pVar.b() || pVar.d())) {
            return pVar.f987b;
        }
        Rect rect = pVar.f987b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).a(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f988c = false;
        return rect;
    }

    public n getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public u getRecycledViewPool() {
        return this.mRecycler.d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().a();
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().a(i2);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.c();
    }

    /* access modifiers changed from: package-private */
    public void initAdapterManager() {
        this.mAdapterHelper = new a(new f());
    }

    /* access modifiers changed from: package-private */
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(a.l.b.fastscroll_default_thickness), resources.getDimensionPixelSize(a.l.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(a.l.b.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            o oVar = this.mLayout;
            if (oVar != null) {
                oVar.a("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.g();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // a.g.l.l
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().b();
    }

    /* access modifiers changed from: package-private */
    public void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.i(i2);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void markItemDecorInsetsDirty() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((p) this.mChildHelper.d(i2).getLayoutParams()).f988c = true;
        }
        this.mRecycler.g();
    }

    /* access modifiers changed from: package-private */
    public void markKnownViewsInvalid() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.A()) {
                childViewHolderInt.a(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.h();
    }

    public void offsetChildrenHorizontal(int i2) {
        int a2 = this.mChildHelper.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.mChildHelper.c(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int a2 = this.mChildHelper.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.mChildHelper.c(i3).offsetTopAndBottom(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForInsert(int i2, int i3) {
        int b2 = this.mChildHelper.b();
        for (int i4 = 0; i4 < b2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i4));
            if (childViewHolderInt != null && !childViewHolderInt.A() && childViewHolderInt.d >= i2) {
                childViewHolderInt.a(i3, false);
                this.mState.g = true;
            }
        }
        this.mRecycler.a(i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int b2 = this.mChildHelper.b();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < b2; i8++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i8));
            if (childViewHolderInt != null && (i7 = childViewHolderInt.d) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    childViewHolderInt.a(i3 - i2, false);
                } else {
                    childViewHolderInt.a(i6, false);
                }
                this.mState.g = true;
            }
        }
        this.mRecycler.b(i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.mChildHelper.b();
        for (int i5 = 0; i5 < b2; i5++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i5));
            if (childViewHolderInt != null && !childViewHolderInt.A()) {
                int i6 = childViewHolderInt.d;
                if (i6 >= i4) {
                    childViewHolderInt.a(-i3, z2);
                } else if (i6 >= i2) {
                    childViewHolderInt.a(i2 - 1, -i3, z2);
                }
                this.mState.g = true;
            }
        }
        this.mRecycler.a(i2, i3, z2);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z2 = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z2 = false;
        }
        this.mFirstLayoutComplete = z2;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            e eVar = e.f.get();
            this.mGapWorker = eVar;
            if (eVar == null) {
                this.mGapWorker = new e();
                Display j2 = a.g.l.u.j(this);
                float f2 = 60.0f;
                if (!isInEditMode() && j2 != null) {
                    float refreshRate = j2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                e eVar2 = this.mGapWorker;
                eVar2.d = (long) (1.0E9f / f2);
                e.f.set(eVar2);
            }
            this.mGapWorker.a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.b();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.b();
        if (ALLOW_THREAD_GAP_WORK && (eVar = this.mGapWorker) != null) {
            eVar.b(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).a(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.mLayout.b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.a()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.b()) {
                        f3 = -axisValue;
                    } else if (this.mLayout.a()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean a2 = oVar.a();
        boolean b2 = this.mLayout.b();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = a2 ? 1 : 0;
            if (b2) {
                i2 |= 2;
            }
            startNestedScroll(i2, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i3 = x3 - this.mInitialTouchX;
                int i4 = y3 - this.mInitialTouchY;
                if (!a2 || Math.abs(i3) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    this.mLastTouchX = x3;
                    z2 = true;
                }
                if (b2 && Math.abs(i4) > this.mTouchSlop) {
                    this.mLastTouchY = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        a.g.h.c.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        a.g.h.c.a();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.v()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.a(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.mAdapter != null) {
                if (this.mState.e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.b(i2, i3);
                this.mState.j = true;
                dispatchLayoutStep2();
                this.mLayout.d(i2, i3);
                if (this.mLayout.B()) {
                    this.mLayout.b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.j = true;
                    dispatchLayoutStep2();
                    this.mLayout.d(i2, i3);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.a(this.mRecycler, this.mState, i2, i3);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                a0 a0Var = this.mState;
                if (a0Var.l) {
                    a0Var.h = true;
                } else {
                    this.mAdapterHelper.b();
                    this.mState.h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f = gVar.a();
            } else {
                this.mState.f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.a(this.mRecycler, this.mState, i2, i3);
            stopInterceptRequestLayout(false);
            this.mState.h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.mPendingSavedState = yVar;
        super.onRestoreInstanceState(yVar.a());
        o oVar = this.mLayout;
        if (oVar != null && (parcelable2 = this.mPendingSavedState.d) != null) {
            oVar.a(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.a(yVar2);
        } else {
            o oVar = this.mLayout;
            yVar.d = oVar != null ? oVar.y() : null;
        }
        return yVar;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 485
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            a.g.l.u.a(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* access modifiers changed from: package-private */
    public void recordAnimationInfoIfBouncedHiddenView(d0 d0Var, l.c cVar) {
        d0Var.a(0, 8192);
        if (this.mState.i && d0Var.v() && !d0Var.s() && !d0Var.A()) {
            this.mViewInfoStore.a(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.c(d0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.b();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.b(this.mRecycler);
            this.mLayout.c(this.mRecycler);
        }
        this.mRecycler.a();
    }

    /* access modifiers changed from: package-private */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean e2 = this.mChildHelper.e(view);
        if (e2) {
            d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.c(childViewHolderInt);
            this.mRecycler.b(childViewHolderInt);
        }
        stopInterceptRequestLayout(!e2);
        return e2;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z2) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.u()) {
                childViewHolderInt.f();
            } else if (!childViewHolderInt.A()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 < 0 || i2 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i2));
    }

    public void removeOnChildAttachStateChangeListener(q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void repositionShadowingViews() {
        d0 d0Var;
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            View c2 = this.mChildHelper.c(i2);
            d0 childViewHolder = getChildViewHolder(c2);
            if (!(childViewHolder == null || (d0Var = childViewHolder.j) == null)) {
                View view = d0Var.f966b;
                int left = c2.getLeft();
                int top = c2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.a(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.a(this, view, rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void saveOldPositions() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (!childViewHolderInt.A()) {
                childViewHolderInt.y();
            }
        }
    }

    public void scrollBy(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean a2 = oVar.a();
            boolean b2 = this.mLayout.b();
            if (a2 || b2) {
                if (!a2) {
                    i2 = 0;
                }
                if (!b2) {
                    i3 = 0;
                }
                scrollByInternal(i2, i3, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i7 = i9;
            i6 = i8;
            i5 = i2 - i8;
            i4 = i3 - i9;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i6, i7, i5, i4, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = i5 - iArr4[0];
        int i11 = i4 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i12 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !a.g.l.i.a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), (float) i10, motionEvent.getY(), (float) i11);
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (!(i6 == 0 && i7 == 0)) {
            dispatchOnScrolled(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i6 == 0 && i7 == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void scrollStep(int i2, int i3, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a.g.h.c.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int a2 = i2 != 0 ? this.mLayout.a(i2, this.mRecycler, this.mState) : 0;
        int b2 = i3 != 0 ? this.mLayout.b(i3, this.mRecycler, this.mState) : 0;
        a.g.h.c.a();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = b2;
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i2) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.i(i2);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(n nVar) {
        this.mAccessibilityDelegate = nVar;
        a.g.l.u.a(this, nVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean setChildImportantForAccessibilityInternal(d0 d0Var, int i2) {
        if (isComputingLayout()) {
            d0Var.r = i2;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        a.g.l.u.h(d0Var.f966b, i2);
        return true;
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        a.g.k.h.a(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.b();
            this.mItemAnimator.a((l.b) null);
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.a(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.mRecycler.f(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.b();
                }
                this.mLayout.b(this.mRecycler);
                this.mLayout.c(this.mRecycler);
                this.mRecycler.a();
                if (this.mIsAttached) {
                    this.mLayout.a(this, this.mRecycler);
                }
                this.mLayout.f((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.a();
            }
            this.mChildHelper.c();
            this.mLayout = oVar;
            if (oVar != null) {
                if (oVar.f979b == null) {
                    oVar.f(this);
                    if (this.mIsAttached) {
                        this.mLayout.a(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f979b.exceptionLabel());
                }
            }
            this.mRecycler.j();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().a(z2);
    }

    public void setOnFlingListener(r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(u uVar) {
        this.mRecycler.a(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.mRecyclerListener = wVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (i2 != this.mScrollState) {
            this.mScrollState = i2;
            if (i2 != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int i3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                i3 = viewConfiguration.getScaledPagingTouchSlop();
                this.mTouchSlop = i3;
            }
        }
        i3 = viewConfiguration.getScaledTouchSlop();
        this.mTouchSlop = i3;
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.mRecycler.a(b0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int a2 = accessibilityEvent != null ? a.g.l.d0.b.a(accessibilityEvent) : 0;
        if (a2 != 0) {
            i2 = a2;
        }
        this.mEatenAccessibilityChangeFlags |= i2;
        return true;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i5 = 0;
            if (!oVar.a()) {
                i2 = 0;
            }
            if (!this.mLayout.b()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i4 == Integer.MIN_VALUE || i4 > 0) {
                    if (z2) {
                        if (i2 != 0) {
                            i5 = 1;
                        }
                        if (i3 != 0) {
                            i5 |= 2;
                        }
                        startNestedScroll(i5, 1);
                    }
                    this.mViewFlinger.a(i2, i3, i4, interpolator);
                    return;
                }
                scrollBy(i2, i3);
            }
        }
    }

    public void smoothScrollToPosition(int i2) {
        if (!this.mLayoutSuppressed) {
            o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.a(this, this.mState, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().b(i2);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().a(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // a.g.l.l
    public void stopNestedScroll() {
        getScrollingChildHelper().c();
    }

    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().c(i2);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(g gVar, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int b2 = this.mChildHelper.b();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < b2; i6++) {
            View d2 = this.mChildHelper.d(i6);
            d0 childViewHolderInt = getChildViewHolderInt(d2);
            if (childViewHolderInt != null && !childViewHolderInt.A() && (i4 = childViewHolderInt.d) >= i2 && i4 < i5) {
                childViewHolderInt.a(2);
                childViewHolderInt.a(obj);
                ((p) d2.getLayoutParams()).f988c = true;
            }
        }
        this.mRecycler.c(i2, i3);
    }
}
