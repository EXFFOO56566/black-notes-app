package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.on2;
import com.google.android.gms.internal.ads.sn;

public final class q extends FrameLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final ImageButton f1430b;

    /* renamed from: c  reason: collision with root package name */
    private final y f1431c;

    public q(Context context, p pVar, y yVar) {
        super(context);
        this.f1431c = yVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f1430b = imageButton;
        imageButton.setImageResource(17301527);
        this.f1430b.setBackgroundColor(0);
        this.f1430b.setOnClickListener(this);
        ImageButton imageButton2 = this.f1430b;
        on2.a();
        int b2 = sn.b(context, pVar.f1427a);
        on2.a();
        int b3 = sn.b(context, 0);
        on2.a();
        int b4 = sn.b(context, pVar.f1428b);
        on2.a();
        imageButton2.setPadding(b2, b3, b4, sn.b(context, pVar.f1429c));
        this.f1430b.setContentDescription("Interstitial close button");
        ImageButton imageButton3 = this.f1430b;
        on2.a();
        int b5 = sn.b(context, pVar.d + pVar.f1427a + pVar.f1428b);
        on2.a();
        addView(imageButton3, new FrameLayout.LayoutParams(b5, sn.b(context, pVar.d + pVar.f1429c), 17));
    }

    public final void a(boolean z) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.f1430b;
            i = 8;
        } else {
            imageButton = this.f1430b;
            i = 0;
        }
        imageButton.setVisibility(i);
    }

    public final void onClick(View view) {
        y yVar = this.f1431c;
        if (yVar != null) {
            yVar.Q0();
        }
    }
}
