package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class or2 extends kr2<Float> {
    or2(int i, String str, Float f) {
        super(1, str, f, null);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ Float a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(a(), ((Float) c()).floatValue()));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ Float a(Bundle bundle) {
        String valueOf = String.valueOf(a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Float) c();
        }
        String valueOf2 = String.valueOf(a());
        return Float.valueOf(bundle.getFloat(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ Float a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(a(), (double) ((Float) c()).floatValue()));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.kr2
    public final /* synthetic */ void a(SharedPreferences.Editor editor, Float f) {
        editor.putFloat(a(), f.floatValue());
    }
}
