package androidx.appcompat.widget;

import a.a.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public class t extends RatingBar {

    /* renamed from: b  reason: collision with root package name */
    private final r f695b;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.ratingBarStyle);
    }

    public t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        r rVar = new r(this);
        this.f695b = rVar;
        rVar.a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a2 = this.f695b.a();
        if (a2 != null) {
            setMeasuredDimension(View.resolveSizeAndState(a2.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
