package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.bl2;
import java.util.ArrayList;

public final class ct0 {
    public static int a(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor c2 = c(sQLiteDatabase, i);
        if (c2.getCount() > 0) {
            c2.moveToNext();
            i2 = 0 + c2.getInt(c2.getColumnIndexOrThrow("value"));
        }
        c2.close();
        return i2;
    }

    public static ArrayList<bl2.a> a(SQLiteDatabase sQLiteDatabase) {
        ArrayList<bl2.a> arrayList = new ArrayList<>();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(bl2.a.a(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (b02 e) {
                co.b("Unable to deserialize proto from offline signals database:");
                co.b(e.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    public static long b(SQLiteDatabase sQLiteDatabase, int i) {
        Cursor c2 = c(sQLiteDatabase, 2);
        long j = 0;
        if (c2.getCount() > 0) {
            c2.moveToNext();
            j = 0 + c2.getLong(c2.getColumnIndexOrThrow("value"));
        }
        c2.close();
        return j;
    }

    private static Cursor c(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i == 2) {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }
}
