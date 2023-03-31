package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class nr2 extends kr2<Boolean> {
    nr2(int i, String str, Boolean bool) {
        super(1, str, bool, null);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ Boolean a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(a(), ((Boolean) c()).booleanValue()));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ Boolean a(Bundle bundle) {
        String valueOf = String.valueOf(a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Boolean) c();
        }
        String valueOf2 = String.valueOf(a());
        return Boolean.valueOf(bundle.getBoolean(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ Boolean a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(a(), ((Boolean) c()).booleanValue()));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ void a(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(a(), bool.booleanValue());
    }
}
