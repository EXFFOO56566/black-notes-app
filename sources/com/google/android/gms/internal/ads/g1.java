package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class g1 extends RelativeLayout {

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f2685c = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b  reason: collision with root package name */
    private AnimationDrawable f2686b;

    public g1(Context context, h1 h1Var, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        r.a(h1Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f2685c, null, null));
        shapeDrawable.getPaint().setColor(h1Var.b2());
        setLayoutParams(layoutParams);
        q.e();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(h1Var.D0())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(h1Var.D0());
            textView.setTextColor(h1Var.c2());
            textView.setTextSize((float) h1Var.d2());
            on2.a();
            int b2 = sn.b(context, 4);
            on2.a();
            textView.setPadding(b2, 0, sn.b(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<i1> e2 = h1Var.e2();
        if (e2 != null && e2.size() > 1) {
            this.f2686b = new AnimationDrawable();
            for (i1 i1Var : e2) {
                try {
                    this.f2686b.addFrame((Drawable) b.Q(i1Var.l1()), h1Var.f2());
                } catch (Exception e) {
                    co.b("Error while getting drawable.", e);
                }
            }
            q.e();
            imageView.setBackground(this.f2686b);
        } else if (e2.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) b.Q(e2.get(0).l1()));
            } catch (Exception e3) {
                co.b("Error while getting drawable.", e3);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f2686b;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
