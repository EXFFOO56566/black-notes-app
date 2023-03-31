package notepad.note.notas.notes.notizen.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.z;
import c.a.a.a.a.a;

public class MyTextView extends z {
    public MyTextView(Context context) {
        this(context, null);
    }

    public MyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setIncludeFontPadding(false);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        AssetManager assets;
        String str;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.MyTextView);
        String string = obtainStyledAttributes.getString(0);
        if (context.getAssets() != null) {
            if (string == null) {
                assets = context.getAssets();
                str = "NotoSans-Regular.ttf";
            } else if (string.equals("bold")) {
                assets = context.getAssets();
                str = "NotoSans-Bold.ttf";
            } else {
                if (string.equals("medium")) {
                    assets = context.getAssets();
                    str = "NotoSans-Medium.ttf";
                }
                obtainStyledAttributes.recycle();
            }
            setTypeface(Typeface.createFromAsset(assets, str));
            obtainStyledAttributes.recycle();
        }
    }
}
