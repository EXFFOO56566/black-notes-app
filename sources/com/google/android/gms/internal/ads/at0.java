package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.bl2;
import java.util.ArrayList;

final /* synthetic */ class at0 implements zg1 {

    /* renamed from: a  reason: collision with root package name */
    private final bt0 f1813a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1814b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f1815c;
    private final zk2 d;
    private final bl2.c e;

    at0(bt0 bt0, boolean z, ArrayList arrayList, zk2 zk2, bl2.c cVar) {
        this.f1813a = bt0;
        this.f1814b = z;
        this.f1815c = arrayList;
        this.d = zk2;
        this.e = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final Object a(Object obj) {
        bt0 bt0 = this.f1813a;
        boolean z = this.f1814b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte[] bArr = bt0.f2010b.a(z, this.f1815c, this.d, this.e);
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(q.j().a()));
        contentValues.put("serialized_proto_data", bArr);
        sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
        if (!z) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
        }
        return null;
    }
}
