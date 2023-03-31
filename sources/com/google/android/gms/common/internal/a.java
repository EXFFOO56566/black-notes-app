package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.l;

public class a extends l.a {
    public static Account a(l lVar) {
        if (lVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return lVar.R();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
