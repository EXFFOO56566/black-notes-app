package b.c.b.a.c;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;

public class c extends DialogFragment {

    /* renamed from: b  reason: collision with root package name */
    private Dialog f1156b = null;

    /* renamed from: c  reason: collision with root package name */
    private DialogInterface.OnCancelListener f1157c = null;

    public static c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        r.a(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f1156b = dialog2;
        if (onCancelListener != null) {
            cVar.f1157c = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f1157c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f1156b == null) {
            setShowsDialog(false);
        }
        return this.f1156b;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
