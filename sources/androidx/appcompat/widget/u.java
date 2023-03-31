package androidx.appcompat.widget;

import a.a.a;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class u extends SeekBar {

    /* renamed from: b  reason: collision with root package name */
    private final v f699b;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.seekBarStyle);
    }

    public u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        v vVar = new v(this);
        this.f699b = vVar;
        vVar.a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f699b.b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f699b.c();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f699b.a(canvas);
    }
}
