package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.w.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends com.google.android.gms.common.internal.w.a implements a.d.e, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new g();
    public static final Scope l = new Scope("profile");
    public static final Scope m = new Scope("openid");
    public static final Scope n = new Scope("https://www.googleapis.com/auth/games_lite");
    public static final Scope o = new Scope("https://www.googleapis.com/auth/games");
    public static final GoogleSignInOptions p;
    private static Comparator<Scope> q = new f();

    /* renamed from: b  reason: collision with root package name */
    private final int f1495b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<Scope> f1496c;
    private Account d;
    private boolean e;
    private final boolean f;
    private final boolean g;
    private String h;
    private String i;
    private ArrayList<com.google.android.gms.auth.api.signin.internal.a> j;
    private String k;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Set<Scope> f1497a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private boolean f1498b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1499c;
        private boolean d;
        private String e;
        private Account f;
        private String g;
        private Map<Integer, com.google.android.gms.auth.api.signin.internal.a> h = new HashMap();
        private String i;

        public a() {
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            r.a(googleSignInOptions);
            this.f1497a = new HashSet(googleSignInOptions.f1496c);
            this.f1498b = googleSignInOptions.f;
            this.f1499c = googleSignInOptions.g;
            this.d = googleSignInOptions.e;
            this.e = googleSignInOptions.h;
            this.f = googleSignInOptions.d;
            this.g = googleSignInOptions.i;
            this.h = GoogleSignInOptions.a(googleSignInOptions.j);
            this.i = googleSignInOptions.k;
        }

        public final a a(Scope scope, Scope... scopeArr) {
            this.f1497a.add(scope);
            this.f1497a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public final a a(String str) {
            this.i = str;
            return this;
        }

        public final GoogleSignInOptions a() {
            if (this.f1497a.contains(GoogleSignInOptions.o) && this.f1497a.contains(GoogleSignInOptions.n)) {
                this.f1497a.remove(GoogleSignInOptions.n);
            }
            if (this.d && (this.f == null || !this.f1497a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f1497a), this.f, this.d, this.f1498b, this.f1499c, this.e, this.g, this.h, this.i, null);
        }

        public final a b() {
            this.f1497a.add(GoogleSignInOptions.m);
            return this;
        }

        public final a c() {
            this.f1497a.add(GoogleSignInOptions.l);
            return this;
        }
    }

    static {
        new Scope("email");
        a aVar = new a();
        aVar.b();
        aVar.c();
        p = aVar.a();
        a aVar2 = new a();
        aVar2.a(n, new Scope[0]);
        aVar2.a();
    }

    GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<com.google.android.gms.auth.api.signin.internal.a> arrayList2, String str3) {
        this(i2, arrayList, account, z, z2, z3, str, str2, a(arrayList2), str3);
    }

    private GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, com.google.android.gms.auth.api.signin.internal.a> map, String str3) {
        this.f1495b = i2;
        this.f1496c = arrayList;
        this.d = account;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str;
        this.i = str2;
        this.j = new ArrayList<>(map.values());
        this.k = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, f fVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    public static GoogleSignInOptions a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap(), (String) null);
    }

    /* access modifiers changed from: private */
    public static Map<Integer, com.google.android.gms.auth.api.signin.internal.a> a(List<com.google.android.gms.auth.api.signin.internal.a> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (com.google.android.gms.auth.api.signin.internal.a aVar : list) {
            hashMap.put(Integer.valueOf(aVar.d()), aVar);
        }
        return hashMap;
    }

    private final JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f1496c, q);
            ArrayList<Scope> arrayList = this.f1496c;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Scope scope = arrayList.get(i2);
                i2++;
                jSONArray.put(scope.d());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.d != null) {
                jSONObject.put("accountName", this.d.name);
            }
            jSONObject.put("idTokenRequested", this.e);
            jSONObject.put("forceCodeForRefreshToken", this.g);
            jSONObject.put("serverAuthRequested", this.f);
            if (!TextUtils.isEmpty(this.h)) {
                jSONObject.put("serverClientId", this.h);
            }
            if (!TextUtils.isEmpty(this.i)) {
                jSONObject.put("hostedDomain", this.i);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Account R() {
        return this.d;
    }

    public ArrayList<com.google.android.gms.auth.api.signin.internal.a> d() {
        return this.j;
    }

    public String e() {
        return this.k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.d.equals(r4.R()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.h.equals(r4.i()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public ArrayList<Scope> g() {
        return new ArrayList<>(this.f1496c);
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f1496c;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Scope scope = arrayList2.get(i2);
            i2++;
            arrayList.add(scope.d());
        }
        Collections.sort(arrayList);
        b bVar = new b();
        bVar.a(arrayList);
        bVar.a(this.d);
        bVar.a(this.h);
        bVar.a(this.g);
        bVar.a(this.e);
        bVar.a(this.f);
        bVar.a(this.k);
        return bVar.a();
    }

    public String i() {
        return this.h;
    }

    public boolean j() {
        return this.g;
    }

    public boolean k() {
        return this.e;
    }

    public boolean l() {
        return this.f;
    }

    public final String m() {
        return n().toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1495b);
        c.c(parcel, 2, g(), false);
        c.a(parcel, 3, (Parcelable) R(), i2, false);
        c.a(parcel, 4, k());
        c.a(parcel, 5, l());
        c.a(parcel, 6, j());
        c.a(parcel, 7, i(), false);
        c.a(parcel, 8, this.i, false);
        c.c(parcel, 9, d(), false);
        c.a(parcel, 10, e(), false);
        c.a(parcel, a2);
    }
}
