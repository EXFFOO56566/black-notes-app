package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.vk2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

public final class wj2 {

    /* renamed from: a  reason: collision with root package name */
    private final ak2 f5286a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final vk2.a f5287b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5288c;

    private wj2() {
        this.f5287b = vk2.t();
        this.f5288c = false;
        this.f5286a = new ak2();
    }

    public wj2(ak2 ak2) {
        this.f5287b = vk2.t();
        this.f5286a = ak2;
        this.f5288c = ((Boolean) on2.e().a(zr2.g2)).booleanValue();
    }

    public static wj2 a() {
        return new wj2();
    }

    private static List<Long> b() {
        List<String> b2 = zr2.b();
        ArrayList arrayList = new ArrayList();
        for (String str : b2) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    wk.e("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    private final synchronized void b(yj2 yj2) {
        vk2.a aVar = this.f5287b;
        aVar.p();
        aVar.a(b());
        fk2 a2 = this.f5286a.a(((vk2) ((rz1) this.f5287b.e())).f());
        a2.b(yj2.a());
        a2.a();
        String valueOf = String.valueOf(Integer.toString(yj2.a(), 10));
        wk.e(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void c(yj2 yj2) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(d(yj2).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        wk.e("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    wk.e("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        wk.e("Could not close Clearcut output stream.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                        wk.e("Could not close Clearcut output stream.");
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused5) {
                wk.e("Could not find file for Clearcut");
            }
        }
    }

    private final synchronized String d(yj2 yj2) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f5287b.m(), Long.valueOf(q.j().b()), Integer.valueOf(yj2.a()), Base64.encodeToString(((vk2) ((rz1) this.f5287b.e())).f(), 3));
    }

    public final synchronized void a(yj2 yj2) {
        if (this.f5288c) {
            if (((Boolean) on2.e().a(zr2.h2)).booleanValue()) {
                c(yj2);
            } else {
                b(yj2);
            }
        }
    }

    public final synchronized void a(zj2 zj2) {
        if (this.f5288c) {
            try {
                zj2.a(this.f5287b);
            } catch (NullPointerException e) {
                q.g().a(e, "AdMobClearcutLogger.modify");
            }
        }
    }
}
