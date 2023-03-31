package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

/* access modifiers changed from: package-private */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f634a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f635b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f636c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    i(CompoundButton compoundButton) {
        this.f634a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public int a(int i) {
        Drawable a2;
        return (Build.VERSION.SDK_INT >= 17 || (a2 = c.a(this.f634a)) == null) ? i : i + a2.getIntrinsicWidth();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a2 = c.a(this.f634a);
        if (a2 == null) {
            return;
        }
        if (this.d || this.e) {
            Drawable mutate = a.i(a2).mutate();
            if (this.d) {
                a.a(mutate, this.f635b);
            }
            if (this.e) {
                a.a(mutate, this.f636c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f634a.getDrawableState());
            }
            this.f634a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        this.f635b = colorStateList;
        this.d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        this.f636c = mode;
        this.e = true;
        a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.util.AttributeSet r4, int r5) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f635b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f636c;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        a();
    }
}
