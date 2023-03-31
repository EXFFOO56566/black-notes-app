package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler Y;
    private Runnable Z = new a();
    int a0 = 0;
    int b0 = 0;
    boolean c0 = true;
    boolean d0 = true;
    int e0 = -1;
    Dialog f0;
    boolean g0;
    boolean h0;
    boolean i0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            c cVar = c.this;
            Dialog dialog = cVar.f0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void O() {
        super.O();
        Dialog dialog = this.f0;
        if (dialog != null) {
            this.g0 = true;
            dialog.setOnDismissListener(null);
            this.f0.dismiss();
            if (!this.h0) {
                onDismiss(this.f0);
            }
            this.f0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P() {
        super.P();
        if (!this.i0 && !this.h0) {
            this.h0 = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void S() {
        super.S();
        Dialog dialog = this.f0;
        if (dialog != null) {
            this.g0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void T() {
        super.T();
        Dialog dialog = this.f0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void a(Context context) {
        super.a(context);
        if (!this.i0) {
            this.h0 = false;
        }
    }

    public void a(i iVar, String str) {
        this.h0 = false;
        this.i0 = true;
        n a2 = iVar.a();
        a2.a(this, str);
        a2.a();
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, boolean z2) {
        if (!this.h0) {
            this.h0 = true;
            this.i0 = false;
            Dialog dialog = this.f0;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.f0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.Y.getLooper()) {
                        onDismiss(this.f0);
                    } else {
                        this.Y.post(this.Z);
                    }
                }
            }
            this.g0 = true;
            if (this.e0 >= 0) {
                g0().a(this.e0, 1);
                this.e0 = -1;
                return;
            }
            n a2 = g0().a();
            a2.a(this);
            if (z) {
                a2.b();
            } else {
                a2.a();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void b(Bundle bundle) {
        Bundle bundle2;
        super.b(bundle);
        if (this.d0) {
            View F = F();
            if (F != null) {
                if (F.getParent() == null) {
                    this.f0.setContentView(F);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            d f = f();
            if (f != null) {
                this.f0.setOwnerActivity(f);
            }
            this.f0.setCancelable(this.c0);
            this.f0.setOnCancelListener(this);
            this.f0.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.f0.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        super.c(bundle);
        this.Y = new Handler();
        this.d0 = this.x == 0;
        if (bundle != null) {
            this.a0 = bundle.getInt("android:style", 0);
            this.b0 = bundle.getInt("android:theme", 0);
            this.c0 = bundle.getBoolean("android:cancelable", true);
            this.d0 = bundle.getBoolean("android:showsDialog", this.d0);
            this.e0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater d(Bundle bundle) {
        Context g;
        if (!this.d0) {
            return super.d(bundle);
        }
        Dialog n = n(bundle);
        this.f0 = n;
        if (n != null) {
            a(n, this.a0);
            g = this.f0.getContext();
        } else {
            g = this.t.g();
        }
        return (LayoutInflater) g.getSystemService("layout_inflater");
    }

    @Override // androidx.fragment.app.Fragment
    public void e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.e(bundle);
        Dialog dialog = this.f0;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.a0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.c0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.d0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.e0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void h(boolean z) {
        this.d0 = z;
    }

    public Dialog n(Bundle bundle) {
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.g0) {
            a(true, true);
        }
    }
}
