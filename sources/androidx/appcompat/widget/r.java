package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.c;

/* access modifiers changed from: package-private */
public class r {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f687c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    private final ProgressBar f688a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f689b;

    r(ProgressBar progressBar) {
        this.f688a = progressBar;
    }

    private Drawable a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a2 = a(animationDrawable.getFrame(i), true);
            a2.setLevel(10000);
            animationDrawable2.addFrame(a2, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    private Drawable a(Drawable drawable, boolean z) {
        if (drawable instanceof c) {
            c cVar = (c) drawable;
            Drawable a2 = cVar.a();
            if (a2 != null) {
                cVar.a(a(a2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f689b == null) {
                this.f689b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    private Shape b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* access modifiers changed from: package-private */
    public Bitmap a() {
        return this.f689b;
    }

    /* access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        w0 a2 = w0.a(this.f688a.getContext(), attributeSet, f687c, i, 0);
        Drawable c2 = a2.c(0);
        if (c2 != null) {
            this.f688a.setIndeterminateDrawable(a(c2));
        }
        Drawable c3 = a2.c(1);
        if (c3 != null) {
            this.f688a.setProgressDrawable(a(c3, false));
        }
        a2.a();
    }
}
