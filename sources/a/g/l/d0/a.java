package a.g.l.d0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: b  reason: collision with root package name */
    private final int f211b;

    /* renamed from: c  reason: collision with root package name */
    private final c f212c;
    private final int d;

    public a(int i, c cVar, int i2) {
        this.f211b = i;
        this.f212c = cVar;
        this.d = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f211b);
        this.f212c.a(this.d, bundle);
    }
}
