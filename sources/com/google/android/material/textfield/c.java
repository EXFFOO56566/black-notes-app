package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import b.c.b.b.z.g;
import b.c.b.b.z.k;

class c extends g {
    private final Paint x;
    private final RectF y;
    private int z;

    c() {
        this(null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(k kVar) {
        super(kVar == null ? new k() : kVar);
        this.x = new Paint(1);
        u();
        this.y = new RectF();
    }

    private void a(Canvas canvas) {
        if (!a(getCallback())) {
            canvas.restoreToCount(this.z);
        }
    }

    private boolean a(Drawable.Callback callback) {
        return callback instanceof View;
    }

    private void b(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (a(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        c(canvas);
    }

    private void c(Canvas canvas) {
        this.z = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
    }

    private void u() {
        this.x.setStyle(Paint.Style.FILL_AND_STROKE);
        this.x.setColor(-1);
        this.x.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* access modifiers changed from: package-private */
    public void a(float f, float f2, float f3, float f4) {
        RectF rectF = this.y;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            this.y.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(RectF rectF) {
        a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // b.c.b.b.z.g
    public void draw(Canvas canvas) {
        b(canvas);
        super.draw(canvas);
        canvas.drawRect(this.y, this.x);
        a(canvas);
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        return !this.y.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void t() {
        a(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
