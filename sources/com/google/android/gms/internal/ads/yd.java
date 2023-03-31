package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import javax.annotation.concurrent.GuardedBy;

public final class yd {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f5577b = new Object();
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private static boolean f5578c = false;
    @GuardedBy("lock")
    private static boolean d = false;

    /* renamed from: a  reason: collision with root package name */
    private hi1 f5579a;

    private final void c(Context context) {
        synchronized (f5577b) {
            if (((Boolean) on2.e().a(zr2.m2)).booleanValue() && !d) {
                try {
                    d = true;
                    this.f5579a = (hi1) bo.a(context, "com.google.android.gms.ads.omid.DynamiteOmid", xd.f5411a);
                } catch (Cdo e) {
                    co.d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final a a(String str, WebView webView, String str2, String str3, String str4) {
        return a(str, webView, str2, str3, str4, "Google");
    }

    public final a a(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (f5577b) {
            try {
                if (((Boolean) on2.e().a(zr2.m2)).booleanValue()) {
                    if (f5578c) {
                        try {
                            return this.f5579a.a(str, b.a(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e) {
                            co.d("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final String a(Context context) {
        if (!((Boolean) on2.e().a(zr2.m2)).booleanValue()) {
            return null;
        }
        try {
            c(context);
            String valueOf = String.valueOf(this.f5579a.getVersion());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            co.d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void a(a aVar) {
        synchronized (f5577b) {
            if (((Boolean) on2.e().a(zr2.m2)).booleanValue()) {
                if (f5578c) {
                    try {
                        this.f5579a.P(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        co.d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void a(a aVar, View view) {
        synchronized (f5577b) {
            if (((Boolean) on2.e().a(zr2.m2)).booleanValue()) {
                if (f5578c) {
                    try {
                        this.f5579a.b(aVar, b.a(view));
                    } catch (RemoteException | NullPointerException e) {
                        co.d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void b(a aVar) {
        synchronized (f5577b) {
            if (((Boolean) on2.e().a(zr2.m2)).booleanValue()) {
                if (f5578c) {
                    try {
                        this.f5579a.m(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        co.d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void b(a aVar, View view) {
        synchronized (f5577b) {
            if (((Boolean) on2.e().a(zr2.m2)).booleanValue()) {
                if (f5578c) {
                    try {
                        this.f5579a.a(aVar, b.a(view));
                    } catch (RemoteException | NullPointerException e) {
                        co.d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final boolean b(Context context) {
        synchronized (f5577b) {
            if (!((Boolean) on2.e().a(zr2.m2)).booleanValue()) {
                return false;
            }
            if (f5578c) {
                return true;
            }
            try {
                c(context);
                boolean u = this.f5579a.u(b.a(context));
                f5578c = u;
                return u;
            } catch (RemoteException | NullPointerException e) {
                co.d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }
}
