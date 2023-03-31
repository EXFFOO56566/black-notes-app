package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.bl2;
import com.google.android.gms.internal.ads.hl2;
import java.util.ArrayList;

public final class ft0 {

    /* renamed from: a  reason: collision with root package name */
    private wj2 f2655a;

    /* renamed from: b  reason: collision with root package name */
    private Context f2656b;

    /* renamed from: c  reason: collision with root package name */
    private os0 f2657c;
    private fo d;

    public ft0(Context context, fo foVar, wj2 wj2, os0 os0) {
        this.f2656b = context;
        this.d = foVar;
        this.f2655a = wj2;
        this.f2657c = os0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(SQLiteDatabase sQLiteDatabase) {
        ArrayList<bl2.a> a2 = ct0.a(sQLiteDatabase);
        bl2.b p = bl2.p();
        p.a(this.f2656b.getPackageName());
        p.b(Build.MODEL);
        int i = 0;
        p.a(ct0.a(sQLiteDatabase, 0));
        p.a(a2);
        p.b(ct0.a(sQLiteDatabase, 1));
        p.a(q.j().a());
        p.b(ct0.b(sQLiteDatabase, 2));
        bl2 bl2 = (bl2) ((rz1) p.e());
        int size = a2.size();
        long j = 0;
        int i2 = 0;
        while (i2 < size) {
            bl2.a aVar = a2.get(i2);
            i2++;
            bl2.a aVar2 = aVar;
            if (aVar2.q() == wl2.ENUM_TRUE && aVar2.p() > j) {
                j = aVar2.p();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        this.f2655a.a(new ht0(bl2));
        hl2.a p2 = hl2.p();
        p2.a(this.d.f2634c);
        p2.b(this.d.d);
        if (!this.d.e) {
            i = 2;
        }
        p2.c(i);
        this.f2655a.a(new gt0((hl2) ((rz1) p2.e())));
        this.f2655a.a(yj2.OFFLINE_UPLOAD);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues3, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }

    public final void a() {
        try {
            this.f2657c.a(new et0(this));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            co.b(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }
}
