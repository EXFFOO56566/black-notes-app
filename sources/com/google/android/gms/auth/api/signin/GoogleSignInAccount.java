package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new e();
    private static d o = g.d();

    /* renamed from: b  reason: collision with root package name */
    private final int f1493b;

    /* renamed from: c  reason: collision with root package name */
    private String f1494c;
    private String d;
    private String e;
    private String f;
    private Uri g;
    private String h;
    private long i;
    private String j;
    private List<Scope> k;
    private String l;
    private String m;
    private Set<Scope> n = new HashSet();

    GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f1493b = i2;
        this.f1494c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = uri;
        this.h = str5;
        this.i = j2;
        this.j = str6;
        this.k = list;
        this.l = str7;
        this.m = str8;
    }

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount a2 = a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a2.h = jSONObject.optString("serverAuthCode", null);
        return a2;
    }

    private static GoogleSignInAccount a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set<Scope> set) {
        long longValue = (l2 == null ? Long.valueOf(o.a() / 1000) : l2).longValue();
        r.b(str7);
        r.a(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
    }

    private final JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (j() != null) {
                jSONObject.put("id", j());
            }
            if (k() != null) {
                jSONObject.put("tokenId", k());
            }
            if (e() != null) {
                jSONObject.put("email", e());
            }
            if (d() != null) {
                jSONObject.put("displayName", d());
            }
            if (i() != null) {
                jSONObject.put("givenName", i());
            }
            if (g() != null) {
                jSONObject.put("familyName", g());
            }
            if (l() != null) {
                jSONObject.put("photoUrl", l().toString());
            }
            if (n() != null) {
                jSONObject.put("serverAuthCode", n());
            }
            jSONObject.put("expirationTime", this.i);
            jSONObject.put("obfuscatedIdentifier", this.j);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.k.toArray(new Scope[this.k.size()]);
            Arrays.sort(scopeArr, d.f1507b);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.d());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Account R() {
        if (this.e == null) {
            return null;
        }
        return new Account(this.e, "com.google");
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.j.equals(this.j) && googleSignInAccount.m().equals(m());
    }

    public String g() {
        return this.m;
    }

    public int hashCode() {
        return ((this.j.hashCode() + 527) * 31) + m().hashCode();
    }

    public String i() {
        return this.l;
    }

    public String j() {
        return this.f1494c;
    }

    public String k() {
        return this.d;
    }

    public Uri l() {
        return this.g;
    }

    public Set<Scope> m() {
        HashSet hashSet = new HashSet(this.k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    public String n() {
        return this.h;
    }

    public final String o() {
        return this.j;
    }

    public final String p() {
        JSONObject q = q();
        q.remove("serverAuthCode");
        return q.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1493b);
        c.a(parcel, 2, j(), false);
        c.a(parcel, 3, k(), false);
        c.a(parcel, 4, e(), false);
        c.a(parcel, 5, d(), false);
        c.a(parcel, 6, (Parcelable) l(), i2, false);
        c.a(parcel, 7, n(), false);
        c.a(parcel, 8, this.i);
        c.a(parcel, 9, this.j, false);
        c.c(parcel, 10, this.k, false);
        c.a(parcel, 11, i(), false);
        c.a(parcel, 12, g(), false);
        c.a(parcel, a2);
    }
}
