package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import b.c.b.b.w.d;
import java.lang.ref.WeakReference;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f5971a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final b.c.b.b.w.f f5972b = new a();

    /* renamed from: c  reason: collision with root package name */
    private float f5973c;
    private boolean d = true;
    private WeakReference<b> e = new WeakReference<>(null);
    private d f;

    class a extends b.c.b.b.w.f {
        a() {
        }

        @Override // b.c.b.b.w.f
        public void a(int i) {
            f.this.d = true;
            b bVar = (b) f.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // b.c.b.b.w.f
        public void a(Typeface typeface, boolean z) {
            if (!z) {
                f.this.d = true;
                b bVar = (b) f.this.e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public f(b bVar) {
        a(bVar);
    }

    private float a(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f5971a.measureText(charSequence, 0, charSequence.length());
    }

    public float a(String str) {
        if (!this.d) {
            return this.f5973c;
        }
        float a2 = a((CharSequence) str);
        this.f5973c = a2;
        this.d = false;
        return a2;
    }

    public d a() {
        return this.f;
    }

    public void a(Context context) {
        this.f.b(context, this.f5971a, this.f5972b);
    }

    public void a(d dVar, Context context) {
        if (this.f != dVar) {
            this.f = dVar;
            if (dVar != null) {
                dVar.c(context, this.f5971a, this.f5972b);
                b bVar = this.e.get();
                if (bVar != null) {
                    this.f5971a.drawableState = bVar.getState();
                }
                dVar.b(context, this.f5971a, this.f5972b);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void a(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void a(boolean z) {
        this.d = z;
    }

    public TextPaint b() {
        return this.f5971a;
    }
}
