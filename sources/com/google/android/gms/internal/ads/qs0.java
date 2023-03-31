package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* access modifiers changed from: package-private */
public final class qs0 implements zn1<SQLiteDatabase> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zg1 f4384a;

    qs0(os0 os0, zg1 zg1) {
        this.f4384a = zg1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f4384a.a(sQLiteDatabase);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            co.b(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        co.b(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }
}
