package androidx.appcompat.widget;

import a.g.l.t;
import a.g.l.u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.p;

public class w extends Spinner implements t {
    private static final int[] j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    private final e f704b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f705c;
    private h0 d;
    private SpinnerAdapter e;
    private final boolean f;
    private g g;
    int h;
    final Rect i;

    class a extends h0 {
        final /* synthetic */ e k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.k = eVar;
        }

        @Override // androidx.appcompat.widget.h0
        public p a() {
            return this.k;
        }

        @Override // androidx.appcompat.widget.h0
        @SuppressLint({"SyntheticAccessor"})
        public boolean b() {
            if (w.this.getInternalPopup().Q()) {
                return true;
            }
            w.this.a();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().Q()) {
                w.this.a();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.app.b f707b;

        /* renamed from: c  reason: collision with root package name */
        private ListAdapter f708c;
        private CharSequence d;

        c() {
        }

        @Override // androidx.appcompat.widget.w.g
        public boolean Q() {
            androidx.appcompat.app.b bVar = this.f707b;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.w.g
        public int a() {
            return 0;
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(int i, int i2) {
            if (this.f708c != null) {
                b.a aVar = new b.a(w.this.getPopupContext());
                CharSequence charSequence = this.d;
                if (charSequence != null) {
                    aVar.a(charSequence);
                }
                aVar.a(this.f708c, w.this.getSelectedItemPosition(), this);
                androidx.appcompat.app.b a2 = aVar.a();
                this.f707b = a2;
                ListView b2 = a2.b();
                if (Build.VERSION.SDK_INT >= 17) {
                    b2.setTextDirection(i);
                    b2.setTextAlignment(i2);
                }
                this.f707b.show();
            }
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(ListAdapter listAdapter) {
            this.f708c = listAdapter;
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(CharSequence charSequence) {
            this.d = charSequence;
        }

        @Override // androidx.appcompat.widget.w.g
        public Drawable b() {
            return null;
        }

        @Override // androidx.appcompat.widget.w.g
        public void b(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.w.g
        public void c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence d() {
            return this.d;
        }

        @Override // androidx.appcompat.widget.w.g
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f707b;
            if (bVar != null) {
                bVar.dismiss();
                this.f707b = null;
            }
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            w.this.setSelection(i);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick(null, i, this.f708c.getItemId(i));
            }
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        private SpinnerAdapter f709b;

        /* renamed from: c  reason: collision with root package name */
        private ListAdapter f710c;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f709b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f710c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof s0) {
                s0 s0Var = (s0) spinnerAdapter;
                if (s0Var.getDropDownViewTheme() == null) {
                    s0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f710c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f709b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f709b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f709b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f709b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f709b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f710c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f709b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f709b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class e extends j0 implements g {
        private CharSequence J;
        ListAdapter K;
        private final Rect L = new Rect();
        private int M;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ w f711b;

            a(w wVar) {
                this.f711b = wVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                w.this.setSelection(i);
                if (w.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    w.this.performItemClick(view, i, eVar.K.getItemId(i));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.b(w.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.j();
                e.super.P();
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f714b;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f714b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f714b);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            a(w.this);
            a(true);
            h(0);
            a(new a(w.this));
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean Q = Q();
            j();
            g(2);
            super.P();
            ListView R = R();
            R.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                R.setTextDirection(i);
                R.setTextAlignment(i2);
            }
            i(w.this.getSelectedItemPosition());
            if (!Q && (viewTreeObserver = w.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                a(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.w.g, androidx.appcompat.widget.j0
        public void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.K = listAdapter;
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(CharSequence charSequence) {
            this.J = charSequence;
        }

        @Override // androidx.appcompat.widget.w.g
        public void b(int i) {
            this.M = i;
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view) {
            return u.B(view) && view.getGlobalVisibleRect(this.L);
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence d() {
            return this.J;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void j() {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.e.j():void");
        }

        public int k() {
            return this.M;
        }
    }

    /* access modifiers changed from: package-private */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        boolean f716b;

        static class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f716b = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f716b ? (byte) 1 : 0);
        }
    }

    /* access modifiers changed from: package-private */
    public interface g {
        boolean Q();

        int a();

        void a(int i);

        void a(int i, int i2);

        void a(Drawable drawable);

        void a(ListAdapter listAdapter);

        void a(CharSequence charSequence);

        Drawable b();

        void b(int i);

        int c();

        void c(int i);

        CharSequence d();

        void dismiss();
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.spinnerStyle);
    }

    public w(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public w(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r11 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r11 != null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036 A[SYNTHETIC, Splitter:B:10:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.i);
        Rect rect = this.i;
        return i3 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.g.a(getTextDirection(), getTextAlignment());
        } else {
            this.g.a(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f704b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        g gVar = this.g;
        if (gVar != null) {
            return gVar.a();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        g gVar = this.g;
        if (gVar != null) {
            return gVar.c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.g != null) {
            return this.h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final g getInternalPopup() {
        return this.g;
    }

    public Drawable getPopupBackground() {
        g gVar = this.g;
        if (gVar != null) {
            return gVar.b();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f705c;
    }

    public CharSequence getPrompt() {
        g gVar = this.g;
        return gVar != null ? gVar.d() : super.getPrompt();
    }

    @Override // a.g.l.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f704b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.l.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f704b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.g;
        if (gVar != null && gVar.Q()) {
            this.g.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.g != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f716b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.g;
        fVar.f716b = gVar != null && gVar.Q();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.d;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        g gVar = this.g;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.Q()) {
            return true;
        }
        a();
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f) {
            this.e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g != null) {
            Context context = this.f705c;
            if (context == null) {
                context = getContext();
            }
            this.g.a(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f704b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f704b;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        g gVar = this.g;
        if (gVar != null) {
            gVar.b(i2);
            this.g.c(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public void setDropDownVerticalOffset(int i2) {
        g gVar = this.g;
        if (gVar != null) {
            gVar.a(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.g != null) {
            this.h = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.g;
        if (gVar != null) {
            gVar.a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(a.a.k.a.a.c(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        g gVar = this.g;
        if (gVar != null) {
            gVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f704b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f704b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }
}
