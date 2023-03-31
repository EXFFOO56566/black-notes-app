package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.internal.ads.jq2;

public class MobileAdsInitProvider extends ContentProvider {

    /* renamed from: b  reason: collision with root package name */
    private final jq2 f1377b = new jq2();

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f1377b.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f1377b.delete(uri, str, strArr);
    }

    public String getType(Uri uri) {
        return this.f1377b.getType(uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return this.f1377b.insert(uri, contentValues);
    }

    public boolean onCreate() {
        return this.f1377b.onCreate();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f1377b.query(uri, strArr, str, strArr2, str2);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f1377b.update(uri, contentValues, str, strArr);
    }
}
