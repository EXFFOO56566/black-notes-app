package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

public interface l {
    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}
