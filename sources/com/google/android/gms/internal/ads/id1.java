package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class id1 {
    public final JSONObject A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final int H;
    public final int I;
    public final boolean J;
    public final String K;
    public final JSONObject L;
    public final boolean M;
    public final boolean N;
    public final int O;
    public final boolean P;
    public final String Q;
    public final int R;
    public final String S;
    public final boolean T;
    public final ge U;
    public final boolean V;
    public final wm2 W;
    public final String X;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f3066a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3067b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f3068c;
    public final List<String> d;
    public final int e;
    public final List<String> f;
    public final List<String> g;
    public final List<String> h;
    public final List<String> i;
    public final String j;
    public final String k;
    public final uh l;
    public final List<String> m;
    public final List<String> n;
    public final List<hd1> o;
    public final md1 p;
    public final List<String> q;
    public final List<hd1> r;
    public final JSONObject s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final ui x;
    public final String y;
    public final JSONObject z;

    id1(JsonReader jsonReader) {
        JSONObject jSONObject;
        char c2;
        List<hd1> list;
        List<String> emptyList = Collections.emptyList();
        List<String> emptyList2 = Collections.emptyList();
        List<String> emptyList3 = Collections.emptyList();
        List<String> emptyList4 = Collections.emptyList();
        List<String> emptyList5 = Collections.emptyList();
        Collections.emptyList();
        List<String> emptyList6 = Collections.emptyList();
        List<String> emptyList7 = Collections.emptyList();
        List<String> emptyList8 = Collections.emptyList();
        List<String> emptyList9 = Collections.emptyList();
        List<hd1> emptyList10 = Collections.emptyList();
        List<String> emptyList11 = Collections.emptyList();
        List<hd1> emptyList12 = Collections.emptyList();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        jsonReader.beginObject();
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        JSONObject jSONObject6 = jSONObject3;
        JSONObject jSONObject7 = jSONObject4;
        JSONObject jSONObject8 = jSONObject5;
        uh uhVar = null;
        md1 md1 = null;
        ui uiVar = null;
        ge geVar = null;
        wm2 wm2 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i4 = -1;
        int i5 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i6 = 0;
        boolean z11 = false;
        int i7 = -1;
        boolean z12 = false;
        boolean z13 = true;
        List<hd1> list2 = emptyList12;
        JSONObject jSONObject9 = jSONObject2;
        List<hd1> list3 = emptyList10;
        List<String> list4 = emptyList11;
        List<String> list5 = emptyList8;
        List<String> list6 = emptyList9;
        List<String> list7 = emptyList6;
        List<String> list8 = emptyList7;
        List<String> list9 = emptyList4;
        List<String> list10 = emptyList5;
        List<String> list11 = emptyList2;
        List<String> list12 = emptyList3;
        List<String> list13 = emptyList;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str12 = nextName == null ? BuildConfig.FLAVOR : nextName;
            switch (str12.hashCode()) {
                case -1980587809:
                    jSONObject = jSONObject9;
                    if (str12.equals("debug_signals")) {
                        c2 = 26;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1965512151:
                    jSONObject = jSONObject9;
                    if (str12.equals("omid_settings")) {
                        c2 = '&';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1812055556:
                    jSONObject = jSONObject9;
                    if (str12.equals("play_prewarm_options")) {
                        c2 = '/';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1620470467:
                    jSONObject = jSONObject9;
                    if (str12.equals("backend_query_id")) {
                        c2 = '-';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1440104884:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_custom_close_blocked")) {
                        c2 = ' ';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1439500848:
                    jSONObject = jSONObject9;
                    if (str12.equals("orientation")) {
                        c2 = '\"';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1428969291:
                    jSONObject = jSONObject9;
                    if (str12.equals("enable_omid")) {
                        c2 = '$';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1403779768:
                    jSONObject = jSONObject9;
                    if (str12.equals("showable_impression_type")) {
                        c2 = ')';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1360811658:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad_sizes")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1306015996:
                    jSONObject = jSONObject9;
                    if (str12.equals("adapters")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1289032093:
                    jSONObject = jSONObject9;
                    if (str12.equals("extras")) {
                        c2 = 27;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1240082064:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad_event_value")) {
                        c2 = '1';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1234181075:
                    jSONObject = jSONObject9;
                    if (str12.equals("allow_pub_rendered_attribution")) {
                        c2 = 28;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1181000426:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_augmented_reality_ad")) {
                        c2 = '*';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1152230954:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad_type")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1146534047:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_scroll_aware")) {
                        c2 = '(';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1115838944:
                    jSONObject = jSONObject9;
                    if (str12.equals("fill_urls")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1081936678:
                    jSONObject = jSONObject9;
                    if (str12.equals("allocation_id")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1078050970:
                    jSONObject = jSONObject9;
                    if (str12.equals("video_complete_urls")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1051269058:
                    jSONObject = jSONObject9;
                    if (str12.equals("active_view")) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -982608540:
                    jSONObject = jSONObject9;
                    if (str12.equals("valid_from_timestamp")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -776859333:
                    jSONObject = jSONObject9;
                    if (str12.equals("click_urls")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -544216775:
                    jSONObject = jSONObject9;
                    if (str12.equals("safe_browsing")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -437057161:
                    jSONObject = jSONObject9;
                    if (str12.equals("imp_urls")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -404326515:
                    jSONObject = jSONObject9;
                    if (str12.equals("render_timeout_ms")) {
                        c2 = '#';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -397704715:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad_close_time_ms")) {
                        c2 = '+';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -369773488:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_close_button_enabled")) {
                        c2 = '0';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -213424028:
                    jSONObject = jSONObject9;
                    if (str12.equals("watermark")) {
                        c2 = ',';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -29338502:
                    jSONObject = jSONObject9;
                    if (str12.equals("allow_custom_click_gesture")) {
                        c2 = 30;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3107:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    jSONObject = jSONObject9;
                    if (str12.equals("id")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3076010:
                    jSONObject = jSONObject9;
                    if (str12.equals("data")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 63195984:
                    jSONObject = jSONObject9;
                    if (str12.equals("render_test_label")) {
                        c2 = 31;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 107433883:
                    jSONObject = jSONObject9;
                    if (str12.equals("qdata")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 230323073:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad_load_urls")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 418392395:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_closable_area_disabled")) {
                        c2 = '!';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 597473788:
                    jSONObject = jSONObject9;
                    if (str12.equals("debug_dialog_string")) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 673261304:
                    jSONObject = jSONObject9;
                    if (str12.equals("reward_granted_urls")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 754887508:
                    jSONObject = jSONObject9;
                    if (str12.equals("container_sizes")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 791122864:
                    jSONObject = jSONObject9;
                    if (str12.equals("impression_type")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1010584092:
                    jSONObject = jSONObject9;
                    if (str12.equals("transaction_id")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1100650276:
                    jSONObject = jSONObject9;
                    if (str12.equals("rewards")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1321720943:
                    jSONObject = jSONObject9;
                    if (str12.equals("allow_pub_owned_ad_view")) {
                        c2 = 29;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1637553475:
                    jSONObject = jSONObject9;
                    if (str12.equals("bid_response")) {
                        c2 = '%';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1638957285:
                    jSONObject = jSONObject9;
                    if (str12.equals("video_start_urls")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1688341040:
                    jSONObject = jSONObject9;
                    if (str12.equals("video_reward_urls")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1799285870:
                    jSONObject = jSONObject9;
                    if (str12.equals("use_third_party_container_height")) {
                        c2 = '.';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1839650832:
                    jSONObject = jSONObject9;
                    if (str12.equals("renderers")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1875425491:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_analytics_logging_enabled")) {
                        c2 = '\'';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2068142375:
                    jSONObject = jSONObject9;
                    if (str12.equals("rule_line_external_id")) {
                        c2 = '2';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2072888499:
                    jSONObject = jSONObject9;
                    if (str12.equals("manual_tracking_urls")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    jSONObject = jSONObject9;
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    list = list2;
                    list13 = an.a(jsonReader);
                    list2 = list;
                    break;
                case 1:
                    list = list2;
                    String nextString = jsonReader.nextString();
                    i2 = "banner".equals(nextString) ? 1 : "interstitial".equals(nextString) ? 2 : "native_express".equals(nextString) ? 3 : "native".equals(nextString) ? 4 : "rewarded".equals(nextString) ? 5 : 0;
                    list2 = list;
                    break;
                case 2:
                    list = list2;
                    list11 = an.a(jsonReader);
                    list2 = list;
                    break;
                case 3:
                    list = list2;
                    list12 = an.a(jsonReader);
                    list2 = list;
                    break;
                case 4:
                    list = list2;
                    list9 = an.a(jsonReader);
                    list2 = list;
                    break;
                case 5:
                    list = list2;
                    int nextInt = jsonReader.nextInt();
                    i3 = (nextInt == 0 || nextInt == 1) ? nextInt : 0;
                    list2 = list;
                    break;
                case 6:
                    list = list2;
                    list10 = an.a(jsonReader);
                    list2 = list;
                    break;
                case 7:
                    list = list2;
                    an.a(jsonReader);
                    list2 = list;
                    break;
                case '\b':
                    list = list2;
                    list7 = an.a(jsonReader);
                    list2 = list;
                    break;
                case '\t':
                    list = list2;
                    list8 = an.a(jsonReader);
                    list2 = list;
                    break;
                case '\n':
                    list = list2;
                    str = jsonReader.nextString();
                    list2 = list;
                    break;
                case 11:
                    list = list2;
                    str2 = jsonReader.nextString();
                    list2 = list;
                    break;
                case '\f':
                    list = list2;
                    uhVar = uh.a(an.d(jsonReader));
                    list2 = list;
                    break;
                case '\r':
                    list = list2;
                    list5 = an.a(jsonReader);
                    list2 = list;
                    break;
                case 14:
                    list = list2;
                    list6 = an.a(jsonReader);
                    list2 = list;
                    break;
                case 15:
                    list = list2;
                    list3 = hd1.a(jsonReader);
                    list2 = list;
                    break;
                case 16:
                    list = list2;
                    md1 = new md1(jsonReader);
                    list2 = list;
                    break;
                case 17:
                    list2 = hd1.a(jsonReader);
                    break;
                case 18:
                    list4 = an.a(jsonReader);
                    break;
                case 19:
                    str3 = jsonReader.nextString();
                    break;
                case 20:
                    jSONObject9 = an.c(jsonReader);
                    continue;
                case 21:
                    str4 = jsonReader.nextString();
                    break;
                case 22:
                    str5 = jsonReader.nextString();
                    break;
                case 23:
                    str6 = an.c(jsonReader).toString();
                    break;
                case 24:
                    uiVar = ui.a(an.c(jsonReader));
                    break;
                case 25:
                    str7 = jsonReader.nextString();
                    break;
                case 26:
                    jSONObject6 = an.c(jsonReader);
                    break;
                case 27:
                    jSONObject7 = an.c(jsonReader);
                    break;
                case 28:
                    z2 = jsonReader.nextBoolean();
                    break;
                case 29:
                    z3 = jsonReader.nextBoolean();
                    break;
                case 30:
                    z4 = jsonReader.nextBoolean();
                    break;
                case 31:
                    z5 = jsonReader.nextBoolean();
                    break;
                case ' ':
                    z6 = jsonReader.nextBoolean();
                    break;
                case '!':
                    z7 = jsonReader.nextBoolean();
                    break;
                case '\"':
                    list = list2;
                    String nextString2 = jsonReader.nextString();
                    if ("landscape".equalsIgnoreCase(nextString2)) {
                        q.e();
                        i4 = 6;
                    } else if ("portrait".equalsIgnoreCase(nextString2)) {
                        q.e();
                        i4 = 7;
                    } else {
                        i4 = -1;
                    }
                    list2 = list;
                    break;
                case '#':
                    i5 = jsonReader.nextInt();
                    break;
                case '$':
                    z8 = jsonReader.nextBoolean();
                    break;
                case '%':
                    str8 = jsonReader.nextString();
                    break;
                case '&':
                    jSONObject8 = an.c(jsonReader);
                    break;
                case '\'':
                    z9 = jsonReader.nextBoolean();
                    break;
                case '(':
                    z10 = jsonReader.nextBoolean();
                    break;
                case ')':
                    i6 = jsonReader.nextInt();
                    break;
                case '*':
                    z11 = jsonReader.nextBoolean();
                    break;
                case '+':
                    i7 = jsonReader.nextInt();
                    break;
                case ',':
                    str9 = jsonReader.nextString();
                    break;
                case '-':
                    str10 = jsonReader.nextString();
                    break;
                case '.':
                    z12 = jsonReader.nextBoolean();
                    break;
                case '/':
                    JSONObject c3 = an.c(jsonReader);
                    if (c3 == null) {
                        list = list2;
                        geVar = null;
                    } else {
                        list = list2;
                        geVar = new ge(c3.optBoolean("enable_prewarming", false), c3.optString("prefetch_url", BuildConfig.FLAVOR));
                    }
                    list2 = list;
                    break;
                case '0':
                    z13 = jsonReader.nextBoolean();
                    break;
                case '1':
                    wm2 = wm2.a(an.c(jsonReader));
                    break;
                case '2':
                    str11 = jsonReader.nextString();
                    break;
                default:
                    list = list2;
                    jsonReader.skipValue();
                    list2 = list;
                    break;
            }
            jSONObject9 = jSONObject;
        }
        jsonReader.endObject();
        this.f3066a = list13;
        this.f3067b = i2;
        this.f3068c = list11;
        this.d = list12;
        this.f = list9;
        this.e = i3;
        this.g = list10;
        this.h = list7;
        this.i = list8;
        this.j = str;
        this.k = str2;
        this.l = uhVar;
        this.m = list5;
        this.n = list6;
        this.o = list3;
        this.p = md1;
        this.q = list4;
        this.r = list2;
        this.t = str3;
        this.s = jSONObject9;
        this.u = str4;
        this.v = str5;
        this.w = str6;
        this.x = uiVar;
        this.y = str7;
        this.z = jSONObject6;
        this.A = jSONObject7;
        this.B = z2;
        this.C = z3;
        this.D = z4;
        this.E = z5;
        this.F = z6;
        this.G = z7;
        this.H = i4;
        this.I = i5;
        this.J = z8;
        this.K = str8;
        this.L = jSONObject8;
        this.M = z9;
        this.N = z10;
        this.O = i6;
        this.P = z11;
        this.Q = str9;
        this.R = i7;
        this.S = str10;
        this.T = z12;
        this.U = geVar;
        this.V = z13;
        this.W = wm2;
        this.X = str11;
    }
}
