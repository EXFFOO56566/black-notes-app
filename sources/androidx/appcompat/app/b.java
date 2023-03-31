package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

public class b extends g implements DialogInterface {
    final AlertController d = new AlertController(getContext(), this, getWindow());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f450a;

        /* renamed from: b  reason: collision with root package name */
        private final int f451b;

        public a(Context context) {
            this(context, b.a(context, 0));
        }

        public a(Context context, int i) {
            this.f450a = new AlertController.f(new ContextThemeWrapper(context, b.a(context, i)));
            this.f451b = i;
        }

        public a a(DialogInterface.OnKeyListener onKeyListener) {
            this.f450a.u = onKeyListener;
            return this;
        }

        public a a(Drawable drawable) {
            this.f450a.d = drawable;
            return this;
        }

        public a a(View view) {
            this.f450a.g = view;
            return this;
        }

        public a a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f450a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f450a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a a(CharSequence charSequence) {
            this.f450a.f = charSequence;
            return this;
        }

        public b a() {
            b bVar = new b(this.f450a.f435a, this.f451b);
            this.f450a.a(bVar.d);
            bVar.setCancelable(this.f450a.r);
            if (this.f450a.r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f450a.s);
            bVar.setOnDismissListener(this.f450a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f450a.u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f450a.f435a;
        }
    }

    protected b(Context context, int i) {
        super(context, a(context, i));
    }

    static int a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.a.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView b() {
        return this.d.a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.d.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.d.b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Dialog, androidx.appcompat.app.g
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.d.b(charSequence);
    }
}
