package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import b.c.b.a.c.q.c;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.u.a;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.j;
import com.google.android.gms.common.util.l;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class gl {
    public static final sk1 h = new zk(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    private AtomicReference<Pattern> f2776a = new AtomicReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    private AtomicReference<Pattern> f2777b = new AtomicReference<>(null);

    /* renamed from: c  reason: collision with root package name */
    private boolean f2778c = true;
    private final Object d = new Object();
    @GuardedBy("userAgentLock")
    private String e;
    private boolean f = false;
    private boolean g = false;

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'A';
        if (c2 < 'A' || c2 > 'F') {
            c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                throw new IllegalArgumentException("Invalid Hex.");
            }
        }
        return (c2 - c3) + 10;
    }

    public static Bitmap a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static WebResourceResponse a(HttpURLConnection httpURLConnection) {
        q.c();
        String contentType = httpURLConnection.getContentType();
        boolean isEmpty = TextUtils.isEmpty(contentType);
        String str = BuildConfig.FLAVOR;
        String trim = isEmpty ? str : contentType.split(";")[0].trim();
        q.c();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || entry.getValue().size() <= 0)) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return q.e().a(trim, str, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static PopupWindow a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    private static String a() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static String a(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    private final JSONArray a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            a(jSONArray, it.next());
        }
        return jSONArray;
    }

    public static void a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    public static void a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            b(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            co.a(sb.toString());
        } catch (ActivityNotFoundException e2) {
            co.b("No browser is found.", e2);
        }
    }

    public static void a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            new en(context, str, (String) obj).b();
        }
    }

    public static void a(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = w0.f5187b.a().booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                f.a(context, th);
            }
        }
    }

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            jo.f3256a.execute(runnable);
        }
    }

    private final void a(JSONArray jSONArray, Object obj) {
        Object a2;
        if (obj instanceof Bundle) {
            a2 = a((Bundle) obj);
        } else if (obj instanceof Map) {
            a2 = a((Map) obj);
        } else if (obj instanceof Collection) {
            a2 = a((Collection) obj);
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj2 : (Object[]) obj) {
                a(jSONArray2, obj2);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            jSONArray.put(obj);
            return;
        }
        jSONArray.put(a2);
    }

    private final void a(JSONObject jSONObject, String str, Object obj) {
        Collection<?> asList;
        Object a2;
        if (obj instanceof Bundle) {
            a2 = a((Bundle) obj);
        } else if (obj instanceof Map) {
            a2 = a((Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                jSONObject.put(str, obj);
                return;
            }
            a2 = a(asList);
        }
        jSONObject.put(str, a2);
    }

    private static boolean a(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static Bitmap b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap d2 = d(view);
        return d2 == null ? c(view) : d2;
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    private static String b(Bundle bundle) {
        if (bundle == null) {
            return BuildConfig.FLAVOR;
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? BuildConfig.FLAVOR : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : BuildConfig.FLAVOR;
    }

    public static Map<String, String> b(Uri uri) {
        if (!m0.f3636b.a().booleanValue()) {
            if (uri == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            q.e();
            for (String str : uri.getQueryParameterNames()) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
            return hashMap;
        } else if (uri == null) {
            return null;
        } else {
            HashMap hashMap2 = new HashMap(20);
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                return hashMap2;
            }
            int length = encodedQuery.length();
            StringBuilder sb = new StringBuilder(100);
            StringBuilder sb2 = new StringBuilder(length);
            StringBuilder sb3 = sb;
            int i = 0;
            while (i < length) {
                char charAt = encodedQuery.charAt(i);
                if (charAt == '%') {
                    byte[] bArr = new byte[((length - i) / 3)];
                    int i2 = 0;
                    while (i < length - 2 && charAt == '%') {
                        try {
                            bArr[i2] = (byte) ((a(encodedQuery.charAt(i + 1)) << 4) + a(encodedQuery.charAt(i + 2)));
                            i2++;
                        } catch (IllegalArgumentException unused) {
                        }
                        i += 3;
                        if (i < length) {
                            charAt = encodedQuery.charAt(i);
                        }
                    }
                    try {
                        sb3.append(new String(bArr, 0, i2, "UTF-8"));
                    } catch (UnsupportedEncodingException unused2) {
                    }
                    if (charAt != '%') {
                    }
                } else if (charAt != '&') {
                    if (charAt == '+') {
                        charAt = ' ';
                    } else if (charAt == '=' && sb3 != sb2) {
                        sb3 = sb2;
                    }
                    sb3.append(charAt);
                } else {
                    if (sb.length() > 0 && sb3 != sb) {
                        hashMap2.put(sb.toString(), sb2.toString());
                        sb.setLength(0);
                        sb2.setLength(0);
                    }
                    sb3 = sb;
                }
                i++;
            }
            if (sb.length() > 0 && sb3 != sb) {
                hashMap2.put(sb.toString(), sb2.toString());
            }
            return hashMap2;
        }
    }

    @TargetApi(18)
    public static void b(Context context, Intent intent) {
        if (intent != null && l.e()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static void b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e2) {
            co.b("Error writing to file in internal storage.", e2);
        }
    }

    public static boolean b(Context context, String str) {
        Context a2 = vg.a(context);
        return c.a(a2).a(str, a2.getPackageName()) == 0;
    }

    public static int c(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            co.d(sb.toString());
            return 0;
        }
    }

    private static Bitmap c(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            co.d("Width or height of view is zero");
            return null;
        } catch (RuntimeException e2) {
            co.b("Fail to capture the webview", e2);
            return null;
        }
    }

    public static WebResourceResponse c(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", q.c().a(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = new tm(context).a(str2, hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e2) {
            co.c("Could not fetch MRAID JS.", e2);
            return null;
        }
    }

    public static String c() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    protected static String c(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return a();
        }
    }

    public static String c(Context context, String str) {
        try {
            return new String(j.a((InputStream) context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            co.a("Error reading from internal storage.");
            return BuildConfig.FLAVOR;
        }
    }

    public static int[] c(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? d() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static AlertDialog.Builder d(Context context) {
        return new AlertDialog.Builder(context);
    }

    private static Bitmap d(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e2) {
            co.b("Fail to capture the web view", e2);
        }
        return bitmap;
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    private static int[] d() {
        return new int[]{0, 0};
    }

    public static gr2 e(Context context) {
        return new gr2(context);
    }

    public static String e() {
        Resources b2 = q.g().b();
        return b2 != null ? b2.getString(a.s7) : "Test Ad";
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gl.e(android.view.View):boolean");
    }

    public static boolean e(String str) {
        if (!wn.a()) {
            return false;
        }
        if (!((Boolean) on2.e().a(zr2.i2)).booleanValue()) {
            return false;
        }
        String str2 = (String) on2.e().a(zr2.k2);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) on2.e().a(zr2.j2);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static int f(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    @SuppressLint({"NewApi"})
    public static String f(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || runningTaskInfo.topActivity == null)) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (Process.myPid() == runningAppProcessInfo.pid) {
                            if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            return !(powerManager == null ? false : powerManager.isScreenOn());
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int h(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    private static KeyguardManager i(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @TargetApi(16)
    public static boolean j(Context context) {
        KeyguardManager i;
        return context != null && l.c() && (i = i(context)) != null && i.isKeyguardLocked();
    }

    public static boolean k(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            co.b("Error loading class.", th);
            q.g().a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static String l(Context context) {
        return !((Boolean) on2.e().a(zr2.S2)).booleanValue() ? BuildConfig.FLAVOR : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", BuildConfig.FLAVOR);
    }

    public static Bundle m(Context context) {
        if (!((Boolean) on2.e().a(zr2.T2)).booleanValue()) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Bundle bundle = new Bundle();
        if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
            bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
        }
        String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (defaultSharedPreferences.contains(str)) {
                bundle.putString(str, defaultSharedPreferences.getString(str, null));
            }
        }
        return bundle;
    }

    public static boolean n(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            return (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
        }
    }

    public static String o(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return b(q(context));
    }

    public static boolean p(Context context) {
        Bundle q = q(context);
        return TextUtils.isEmpty(b(q)) && !TextUtils.isEmpty(q.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    private static Bundle q(Context context) {
        try {
            return c.a(context).a(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            wk.e("Error getting metadata", e2);
            return null;
        }
    }

    public final lo1<Map<String, String>> a(Uri uri) {
        return yn1.a(yn1.a((Object) null), new el(this, uri), jo.f3256a);
    }

    public final String a(Context context, String str) {
        synchronized (this.d) {
            if (this.e != null) {
                return this.e;
            } else if (str == null) {
                return a();
            } else {
                try {
                    this.e = q.e().a(context);
                } catch (Exception unused) {
                }
                if (TextUtils.isEmpty(this.e)) {
                    on2.a();
                    if (!sn.b()) {
                        this.e = null;
                        h.post(new hl(this, context));
                        while (this.e == null) {
                            try {
                                this.d.wait();
                            } catch (InterruptedException unused2) {
                                String a2 = a();
                                this.e = a2;
                                String valueOf = String.valueOf(a2);
                                co.d(valueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(valueOf) : new String("Interrupted, use default user agent: "));
                            }
                        }
                    } else {
                        this.e = c(context);
                    }
                }
                String valueOf2 = String.valueOf(this.e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(str).length());
                sb.append(valueOf2);
                sb.append(" (Mobile; ");
                sb.append(str);
                this.e = sb.toString();
                try {
                    if (c.a(context).a()) {
                        this.e = String.valueOf(this.e).concat(";aia");
                    }
                } catch (Exception e2) {
                    q.g().a(e2, "AdUtil.getUserAgent");
                }
                String concat = String.valueOf(this.e).concat(")");
                this.e = concat;
                return concat;
            }
        }
    }

    public final JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject a(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return a(bundle);
            } catch (JSONException e2) {
                co.b("Error converting Bundle to JSON", e2);
            }
        }
        return null;
    }

    public final JSONObject a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final void a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(a(context, str));
    }

    public final void a(Context context, String str, String str2, Bundle bundle, boolean z) {
        q.c();
        bundle.putString("device", c());
        bundle.putString("eids", TextUtils.join(",", zr2.a()));
        on2.a();
        sn.a(context, str, str2, bundle, true, new kl(this, context, str));
    }

    public final void a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", a(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final boolean a(Context context) {
        if (this.f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new ml(this, null), intentFilter);
        this.f = true;
        return true;
    }

    public final boolean a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, i(context));
    }

    public final boolean a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (!q.c().f2778c) {
            if ((keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) && !e(view)) {
                z = false;
                if (view.getVisibility() == 0 && view.isShown()) {
                    if ((powerManager != null || powerManager.isScreenOn()) && z) {
                        if (((Boolean) on2.e().a(zr2.B0)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        z = true;
        if (((Boolean) on2.e().a(zr2.B0)).booleanValue()) {
        }
        return true;
    }

    public final boolean a(String str) {
        return a(str, this.f2776a, (String) on2.e().a(zr2.R));
    }

    public final int[] a(Activity activity) {
        int[] c2 = c(activity);
        return new int[]{on2.a().a(activity, c2[0]), on2.a().a(activity, c2[1])};
    }

    public final boolean b(Context context) {
        if (this.g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new jl(this, null), intentFilter);
        this.g = true;
        return true;
    }

    public final boolean b(String str) {
        return a(str, this.f2777b, (String) on2.e().a(zr2.S));
    }

    public final int[] b(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] d2 = (window == null || (findViewById = window.findViewById(16908290)) == null) ? d() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{on2.a().a(activity, d2[0]), on2.a().a(activity, d2[1])};
    }
}
