package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import b.c.b.a.d.b;
import com.google.android.gms.internal.ads.be;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.on2;

public final class AdActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    private be f1376b;

    private final void a() {
        be beVar = this.f1376b;
        if (beVar != null) {
            try {
                beVar.K1();
            } catch (RemoteException e) {
                co.d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f1376b.a(i, i2, intent);
        } catch (Exception e) {
            co.d("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        boolean z = true;
        try {
            if (this.f1376b != null) {
                z = this.f1376b.Y1();
            }
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f1376b.v(b.a(configuration));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        be a2 = on2.b().a(this);
        this.f1376b = a2;
        if (a2 == null) {
            e = null;
        } else {
            try {
                a2.k(bundle);
                return;
            } catch (RemoteException e) {
                e = e;
            }
        }
        co.d("#007 Could not call remote method.", e);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            if (this.f1376b != null) {
                this.f1376b.onDestroy();
            }
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            if (this.f1376b != null) {
                this.f1376b.onPause();
            }
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            if (this.f1376b != null) {
                this.f1376b.k1();
            }
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            if (this.f1376b != null) {
                this.f1376b.onResume();
            }
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f1376b != null) {
                this.f1376b.j(bundle);
            }
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            if (this.f1376b != null) {
                this.f1376b.m0();
            }
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            if (this.f1376b != null) {
                this.f1376b.R0();
            }
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
