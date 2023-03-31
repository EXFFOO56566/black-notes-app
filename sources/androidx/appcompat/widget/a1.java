package androidx.appcompat.widget;

import a.a.d;
import a.a.f;
import a.a.g;
import a.a.i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.github.ajalt.reprint.module.spass.SpassReprintModule;

class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f601a;

    /* renamed from: b  reason: collision with root package name */
    private final View f602b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f603c;
    private final WindowManager.LayoutParams d = new WindowManager.LayoutParams();
    private final Rect e = new Rect();
    private final int[] f = new int[2];
    private final int[] g = new int[2];

    a1(Context context) {
        this.f601a = context;
        View inflate = LayoutInflater.from(context).inflate(g.abc_tooltip, (ViewGroup) null);
        this.f602b = inflate;
        this.f603c = (TextView) inflate.findViewById(f.message);
        this.d.setTitle(a1.class.getSimpleName());
        this.d.packageName = this.f601a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.d;
        layoutParams.type = SpassReprintModule.STATUS_HW_UNAVAILABLE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private static View a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    private void a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f601a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f601a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f601a.getResources().getDimensionPixelOffset(z ? d.tooltip_y_offset_touch : d.tooltip_y_offset_non_touch);
        View a2 = a(view);
        if (a2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a2.getWindowVisibleDisplayFrame(this.e);
        Rect rect = this.e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f601a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a2.getLocationOnScreen(this.g);
        view.getLocationOnScreen(this.f);
        int[] iArr = this.f;
        int i5 = iArr[0];
        int[] iArr2 = this.g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f602b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f602b.getMeasuredHeight();
        int[] iArr3 = this.f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (b()) {
            ((WindowManager) this.f601a.getSystemService("window")).removeView(this.f602b);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (b()) {
            a();
        }
        this.f603c.setText(charSequence);
        a(view, i, i2, z, this.d);
        ((WindowManager) this.f601a.getSystemService("window")).addView(this.f602b, this.d);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f602b.getParent() != null;
    }
}
