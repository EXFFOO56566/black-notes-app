package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class mr2 extends kr2<Integer> {
    mr2(int i, String str, Integer num) {
        super(1, str, num, null);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ Integer a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(a(), ((Integer) c()).intValue()));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ Integer a(Bundle bundle) {
        String valueOf = String.valueOf(a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Integer) c();
        }
        String valueOf2 = String.valueOf(a());
        return Integer.valueOf(bundle.getInt(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ Integer a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(a(), ((Integer) c()).intValue()));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ void a(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(a(), num.intValue());
    }
}
