package b.c.b.a.c;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.i;
import com.google.android.gms.common.internal.r;

public class m extends c {
    private Dialog j0 = null;
    private DialogInterface.OnCancelListener k0 = null;

    public static m a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        r.a(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        mVar.j0 = dialog2;
        if (onCancelListener != null) {
            mVar.k0 = onCancelListener;
        }
        return mVar;
    }

    @Override // androidx.fragment.app.c
    public void a(i iVar, String str) {
        super.a(iVar, str);
    }

    @Override // androidx.fragment.app.c
    public Dialog n(Bundle bundle) {
        if (this.j0 == null) {
            h(false);
        }
        return this.j0;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.k0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
