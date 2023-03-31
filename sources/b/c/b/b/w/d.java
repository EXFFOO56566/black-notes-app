package b.c.b.b.w;

import a.g.d.c.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import b.c.b.b.k;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final float f1289a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f1290b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1291c;
    public final int d;
    public final String e;
    public final ColorStateList f;
    public final float g;
    public final float h;
    public final float i;
    private final int j;
    private boolean k = false;
    private Typeface l;

    /* access modifiers changed from: package-private */
    public class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f1292a;

        a(f fVar) {
            this.f1292a = fVar;
        }

        @Override // a.g.d.c.f.a
        public void a(int i) {
            d.this.k = true;
            this.f1292a.a(i);
        }

        @Override // a.g.d.c.f.a
        public void a(Typeface typeface) {
            d dVar = d.this;
            dVar.l = Typeface.create(typeface, dVar.f1291c);
            d.this.k = true;
            this.f1292a.a(d.this.l, false);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextPaint f1294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f1295b;

        b(TextPaint textPaint, f fVar) {
            this.f1294a = textPaint;
            this.f1295b = fVar;
        }

        @Override // b.c.b.b.w.f
        public void a(int i) {
            this.f1295b.a(i);
        }

        @Override // b.c.b.b.w.f
        public void a(Typeface typeface, boolean z) {
            d.this.a(this.f1294a, typeface);
            this.f1295b.a(typeface, z);
        }
    }

    public d(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, k.TextAppearance);
        this.f1289a = obtainStyledAttributes.getDimension(k.TextAppearance_android_textSize, 0.0f);
        this.f1290b = c.a(context, obtainStyledAttributes, k.TextAppearance_android_textColor);
        c.a(context, obtainStyledAttributes, k.TextAppearance_android_textColorHint);
        c.a(context, obtainStyledAttributes, k.TextAppearance_android_textColorLink);
        this.f1291c = obtainStyledAttributes.getInt(k.TextAppearance_android_textStyle, 0);
        this.d = obtainStyledAttributes.getInt(k.TextAppearance_android_typeface, 1);
        int a2 = c.a(obtainStyledAttributes, k.TextAppearance_fontFamily, k.TextAppearance_android_fontFamily);
        this.j = obtainStyledAttributes.getResourceId(a2, 0);
        this.e = obtainStyledAttributes.getString(a2);
        obtainStyledAttributes.getBoolean(k.TextAppearance_textAllCaps, false);
        this.f = c.a(context, obtainStyledAttributes, k.TextAppearance_android_shadowColor);
        this.g = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDx, 0.0f);
        this.h = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDy, 0.0f);
        this.i = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void b() {
        String str;
        if (this.l == null && (str = this.e) != null) {
            this.l = Typeface.create(str, this.f1291c);
        }
        if (this.l == null) {
            int i2 = this.d;
            this.l = i2 != 1 ? i2 != 2 ? i2 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.l = Typeface.create(this.l, this.f1291c);
        }
    }

    public Typeface a() {
        b();
        return this.l;
    }

    public Typeface a(Context context) {
        if (this.k) {
            return this.l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = f.a(context, this.j);
                this.l = a2;
                if (a2 != null) {
                    this.l = Typeface.create(a2, this.f1291c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.e, e2);
            }
        }
        b();
        this.k = true;
        return this.l;
    }

    public void a(Context context, TextPaint textPaint, f fVar) {
        a(textPaint, a());
        a(context, new b(textPaint, fVar));
    }

    public void a(Context context, f fVar) {
        if (e.a()) {
            a(context);
        } else {
            b();
        }
        if (this.j == 0) {
            this.k = true;
        }
        if (this.k) {
            fVar.a(this.l, true);
            return;
        }
        try {
            f.a(context, this.j, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.k = true;
            fVar.a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.e, e2);
            this.k = true;
            fVar.a(-3);
        }
    }

    public void a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f1291c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1289a);
    }

    public void b(Context context, TextPaint textPaint, f fVar) {
        c(context, textPaint, fVar);
        ColorStateList colorStateList = this.f1290b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.i;
        float f3 = this.g;
        float f4 = this.h;
        ColorStateList colorStateList2 = this.f;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void c(Context context, TextPaint textPaint, f fVar) {
        if (e.a()) {
            a(textPaint, a(context));
        } else {
            a(context, textPaint, fVar);
        }
    }
}
