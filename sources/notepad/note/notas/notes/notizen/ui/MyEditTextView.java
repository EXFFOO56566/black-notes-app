package notepad.note.notas.notes.notizen.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.k;

public class MyEditTextView extends k {
    private boolean e;
    private a f;

    public interface a {
        void a();
    }

    public MyEditTextView(Context context) {
        this(context, null);
    }

    public MyEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        setIncludeFontPadding(false);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        AssetManager assets;
        String str;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.a.a.a.a.MyEditTextView);
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

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (!this.e || i != 4 || keyEvent.getAction() != 1) {
            return super.onKeyPreIme(i, keyEvent);
        }
        this.f.a();
        return false;
    }

    public void setEventListener(a aVar) {
        this.e = true;
        this.f = aVar;
    }
}
