package com.google.android.material.snackbar;

import a.g.l.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.c.b.b.f;
import b.c.b.b.k;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private TextView f5979b;

    /* renamed from: c  reason: collision with root package name */
    private Button f5980c;
    private int d;
    private int e;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.SnackbarLayout);
        this.d = obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_android_maxWidth, -1);
        this.e = obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    private static void a(View view, int i, int i2) {
        if (u.E(view)) {
            u.a(view, u.t(view), i, u.s(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f5979b.getPaddingTop() == i2 && this.f5979b.getPaddingBottom() == i3) {
            return z;
        }
        a(this.f5979b, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f5980c;
    }

    public TextView getMessageView() {
        return this.f5979b;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5979b = (TextView) findViewById(f.snackbar_text);
        this.f5980c = (Button) findViewById(f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (a(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (a(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
