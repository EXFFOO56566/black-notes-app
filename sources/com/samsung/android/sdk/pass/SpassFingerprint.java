package com.samsung.android.sdk.pass;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.util.SparseArray;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.fingerprint.FingerprintIdentifyDialog;
import com.samsung.android.fingerprint.FingerprintManager;
import com.samsung.android.fingerprint.IFingerprintClient;
import com.samsung.android.sdk.pass.support.IFingerprintManagerProxy;
import com.samsung.android.sdk.pass.support.SdkSupporter;
import com.samsung.android.sdk.pass.support.v1.FingerprintManagerProxyFactory;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;

public class SpassFingerprint {
    public static final String ACTION_FINGERPRINT_ADDED = "com.samsung.android.intent.action.FINGERPRINT_ADDED";
    public static final String ACTION_FINGERPRINT_REMOVED = "com.samsung.android.intent.action.FINGERPRINT_REMOVED";
    public static final String ACTION_FINGERPRINT_RESET = "com.samsung.android.intent.action.FINGERPRINT_RESET";
    public static final int STATUS_AUTHENTIFICATION_FAILED = 16;
    public static final int STATUS_AUTHENTIFICATION_PASSWORD_SUCCESS = 100;
    public static final int STATUS_AUTHENTIFICATION_SUCCESS = 0;
    public static final int STATUS_BUTTON_PRESSED = 9;
    public static final int STATUS_OPERATION_DENIED = 51;
    public static final int STATUS_QUALITY_FAILED = 12;
    public static final int STATUS_SENSOR_FAILED = 7;
    public static final int STATUS_TIMEOUT_FAILED = 4;
    public static final int STATUS_USER_CANCELLED = 8;
    public static final int STATUS_USER_CANCELLED_BY_TOUCH_OUTSIDE = 13;
    public static final String TAG = "SpassFingerprintSDK";
    private static int n = 0;
    private static boolean o = false;
    private static boolean p = false;
    private static boolean q = false;
    private static boolean r = false;

    /* renamed from: a  reason: collision with root package name */
    private IFingerprintManagerProxy f6048a;

    /* renamed from: b  reason: collision with root package name */
    private Context f6049b;

    /* renamed from: c  reason: collision with root package name */
    private int f6050c = -1;
    private String d = null;
    private ArrayList e = null;
    private String f = null;
    private int g = -1;
    private String h = null;
    private int i = -1;
    private boolean j = false;
    private String k = null;
    private String l = null;
    private boolean m = false;
    private Dialog s = null;
    private b t = null;
    private b u = null;
    private IBinder v = null;
    private Handler w;

    public interface IdentifyListener {
        void onCompleted();

        void onFinished(int i);

        void onReady();

        void onStarted();
    }

    public interface RegisterListener {
        void onFinished();
    }

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private Bundle f6051a;

        public a() {
            Bundle bundle = new Bundle();
            this.f6051a = bundle;
            bundle.putString("sdk_version", "Pass-v1.2.6");
        }

        public final Bundle a() {
            return this.f6051a;
        }

        public final a a(int[] iArr) {
            if (iArr.length > 0) {
                this.f6051a.putIntArray("request_template_index_list", iArr);
            }
            return this;
        }
    }

    /* access modifiers changed from: private */
    public class b extends IFingerprintClient.Stub {

        /* renamed from: a  reason: collision with root package name */
        private IdentifyListener f6052a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6053b;

        private b(IdentifyListener identifyListener) {
            this.f6053b = SpassFingerprint.o ? 16 : 13;
            this.f6052a = identifyListener;
        }

        /* synthetic */ b(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, byte b2) {
            this(identifyListener);
        }

        public final IdentifyListener a() {
            return this.f6052a;
        }

        public final void a(IdentifyListener identifyListener) {
            this.f6052a = identifyListener;
        }

        public final void onFingerprintEvent(FingerprintEvent fingerprintEvent) {
            String str;
            if (fingerprintEvent == null) {
                str = "onFingerprintEvent: null event will be ignored!";
            } else {
                try {
                    Log.d(SpassFingerprint.TAG, "evt : " + fingerprintEvent.eventId + ", " + fingerprintEvent.eventResult + ", " + fingerprintEvent.eventStatus);
                    IdentifyListener identifyListener = this.f6052a;
                    if (fingerprintEvent.eventId == this.f6053b) {
                        Log.d(SpassFingerprint.TAG, "onFingerprintEvent : completed = " + this.f6053b);
                        SpassFingerprint.this.t = null;
                        SpassFingerprint.this.f();
                    }
                    if (identifyListener == null) {
                        return;
                    }
                    if (SpassFingerprint.this.w != null) {
                        SpassFingerprint.this.w.post(new e(this, fingerprintEvent, identifyListener));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    str = "onFingerprintEvent: Error : " + e;
                }
            }
            Log.w(SpassFingerprint.TAG, str);
        }
    }

    /* access modifiers changed from: private */
    public class c implements FingerprintIdentifyDialog.FingerprintListener {

        /* renamed from: a  reason: collision with root package name */
        private IdentifyListener f6055a;

        /* renamed from: b  reason: collision with root package name */
        private FingerprintEvent f6056b;

        private c(IdentifyListener identifyListener) {
            this.f6055a = identifyListener;
        }

        /* synthetic */ c(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, byte b2) {
            this(identifyListener);
        }

        public final void a() {
            FingerprintEvent fingerprintEvent = this.f6056b;
            IdentifyListener identifyListener = this.f6055a;
            if (fingerprintEvent != null && identifyListener != null && SpassFingerprint.this.w != null) {
                SpassFingerprint.this.w.post(new g(this, fingerprintEvent, identifyListener));
                this.f6055a = null;
                this.f6056b = null;
            }
        }

        public final void onEvent(FingerprintEvent fingerprintEvent) {
            try {
                if (fingerprintEvent.eventId == 13 || SpassFingerprint.this.w == null) {
                    this.f6056b = fingerprintEvent;
                } else {
                    SpassFingerprint.this.w.post(new f(this, fingerprintEvent));
                }
            } catch (Exception e) {
                Log.w(SpassFingerprint.TAG, "onFingerprintEvent: Error : " + e);
            }
        }
    }

    public SpassFingerprint(Context context) {
        if (context != null) {
            this.f6049b = context;
            if (!p) {
                q = context.getPackageManager().hasSystemFeature("com.sec.feature.fingerprint_manager_service");
                r = g();
                p = true;
            }
            if (q) {
                this.f6048a = FingerprintManagerProxyFactory.create(this.f6049b);
                this.w = new Handler(context.getMainLooper());
                if (this.f6048a != null) {
                    try {
                        if (this.f6048a.getSensorType() == FingerprintManager.class.getField("SENSOR_TYPE_TOUCH").getInt(null)) {
                            o = true;
                        }
                    } catch (Exception e2) {
                        Log.i(TAG, "SpassFingerprint : " + e2.toString());
                    }
                    n = this.f6048a.getVersion();
                }
            }
            Log.i(TAG, "SpassFingerprint : 1.2.6, " + n + ", " + o);
            return;
        }
        throw new IllegalArgumentException("context is null.");
    }

    static void a(Context context, String str) {
        if (!g()) {
            return;
        }
        if (context.checkCallingOrSelfPermission("com.samsung.android.providers.context.permission.WRITE_USE_APP_FEATURE_SURVEY") != 0) {
            Log.d(TAG, "insertLog :  No permission");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", SpassFingerprint.class.getPackage().getName());
        contentValues.put("feature", String.valueOf(context.getPackageName()) + "#12");
        if (str != null) {
            contentValues.put("extra", str);
        }
        Intent intent = new Intent();
        intent.setAction("com.samsung.android.providers.context.log.action.USE_APP_FEATURE_SURVEY");
        intent.putExtra("data", contentValues);
        intent.setPackage("com.samsung.android.providers.context");
        context.sendBroadcast(intent);
        Log.i(TAG, "insertLog : " + contentValues.toString());
    }

    static /* synthetic */ void a(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, FingerprintEvent fingerprintEvent, int i2) {
        spassFingerprint.d = BuildConfig.FLAVOR;
        if (fingerprintEvent == null) {
            spassFingerprint.f6050c = 0;
        } else {
            spassFingerprint.f6050c = fingerprintEvent.getFingerIndex();
            if (fingerprintEvent.eventStatus == 12 || fingerprintEvent.eventStatus == 11) {
                spassFingerprint.d = fingerprintEvent.getImageQualityFeedback();
            }
            int i3 = fingerprintEvent.eventStatus;
            i2 = 9;
            if (i3 == 0) {
                i2 = 0;
            } else if (i3 == 4) {
                i2 = 4;
            } else if (i3 == 51) {
                i2 = 51;
            } else if (i3 != 100) {
                if (i3 != 7) {
                    if (i3 != 8) {
                        if (i3 != 9) {
                            switch (i3) {
                                case 11:
                                    i2 = 16;
                                    break;
                                case 12:
                                    i2 = 12;
                                    break;
                                case 13:
                                    i2 = 13;
                                    break;
                            }
                        }
                    } else {
                        i2 = 8;
                    }
                }
                i2 = 7;
            } else {
                i2 = 100;
            }
        }
        identifyListener.onFinished(i2);
        spassFingerprint.f6050c = -1;
        spassFingerprint.d = null;
        if (!spassFingerprint.m) {
            spassFingerprint.m = true;
            a(spassFingerprint.f6049b, "IdentifyListener.onFinished");
        }
    }

    static boolean a() {
        return n >= 16843008;
    }

    private boolean a(String str) {
        String packageName = this.f6049b.getPackageName();
        try {
            Resources resourcesForApplication = this.f6049b.getPackageManager().getResourcesForApplication(packageName);
            if (resourcesForApplication == null) {
                return false;
            }
            try {
                int identifier = resourcesForApplication.getIdentifier(str, "drawable", packageName);
                if (identifier != 0) {
                    if (identifier != -1) {
                        return BitmapFactory.decodeResource(resourcesForApplication, identifier) != null;
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private synchronized void e() {
        if (!q) {
            throw new UnsupportedOperationException("Fingerprint Service is not supported in the platform.");
        } else if (this.f6048a == null) {
            Log.i(TAG, "ensureServiceSupported : proxy is null, retry to create proxy");
            IFingerprintManagerProxy create = FingerprintManagerProxyFactory.create(this.f6049b);
            this.f6048a = create;
            if (create == null) {
                throw new UnsupportedOperationException("Fingerprint Service is not running on the device.");
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f() {
        this.f6048a.unregisterClient(this.v);
        this.v = null;
        b bVar = this.u;
        if (bVar != null) {
            bVar.a((IdentifyListener) null);
        }
    }

    private static boolean g() {
        if (p) {
            return r;
        }
        boolean z = false;
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.FloatingFeature");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            z = ((Boolean) cls.getMethod("getEnableStatus", String.class).invoke(invoke, "SEC_FLOATING_FEATURE_CONTEXTSERVICE_ENABLE_SURVEY_MODE")).booleanValue();
        } catch (Exception e2) {
            Log.d(TAG, "Survey Mode : " + e2.toString());
            try {
                Class<?> cls2 = Class.forName("com.samsung.android.feature.SemFloatingFeature");
                Object invoke2 = cls2.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                z = ((Boolean) cls2.getMethod("getBoolean", String.class).invoke(invoke2, "SEC_FLOATING_FEATURE_CONTEXTSERVICE_ENABLE_SURVEY_MODE")).booleanValue();
            } catch (Exception e3) {
                Log.d(TAG, "Survey Mode : " + e3.toString());
            }
        }
        Log.i(TAG, "Survey Mode : " + z);
        return z;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        e();
        try {
            Class.forName(SdkSupporter.CLASSNAME_FINGERPRINT_MANAGER).getMethod("isSupportFingerprintIds", new Class[0]);
            return this.f6048a.isSupportFingerprintIds();
        } catch (Exception e2) {
            Log.w(TAG, e2);
            return a();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        e();
        try {
            Class.forName(SdkSupporter.CLASSNAME_FINGERPRINT_MANAGER).getMethod("isSupportBackupPassword", new Class[0]);
            return this.f6048a.isSupportBackupPassword();
        } catch (Exception e2) {
            Log.w(TAG, e2);
            return true;
        }
    }

    public void cancelIdentify() {
        Handler handler;
        e();
        if (this.v == null && this.t == null && this.s == null) {
            throw new IllegalStateException("No Identify request.");
        }
        IdentifyListener identifyListener = null;
        if (this.v != null) {
            b bVar = this.u;
            if (bVar != null) {
                identifyListener = bVar.a();
            }
            f();
            if (identifyListener != null && (handler = this.w) != null) {
                handler.postDelayed(new a(this, identifyListener), 100);
            }
        } else if (this.t != null || this.s != null) {
            this.f6048a.notifyAppActivityState(4, null);
            this.t = null;
            this.s = null;
        }
    }

    public void changeStandbyString(String str) {
        e();
        if (c()) {
            throw new IllegalStateException("setStandbyString is not supported.");
        } else if (str == null) {
            throw new IllegalArgumentException("the standby text passed is null.");
        } else if (str.length() <= 100) {
            this.l = str;
        } else {
            throw new IllegalArgumentException("the standby text passed is longer than 100 characters.");
        }
    }

    public String getGuideForPoorQuality() {
        e();
        String str = this.d;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("FingerprintGuide is Invalid. This API must be called inside IdentifyListener.onFinished() with STATUS_QUALITY_FAILED only.");
    }

    public int getIdentifiedFingerprintIndex() {
        e();
        int i2 = this.f6050c;
        if (i2 != -1) {
            return i2;
        }
        throw new IllegalStateException("FingerprintIndex is Invalid. This API must be called inside IdentifyListener.onFinished() only.");
    }

    public SparseArray getRegisteredFingerprintName() {
        e();
        SparseArray sparseArray = new SparseArray();
        int enrolledFingers = this.f6048a.getEnrolledFingers();
        if (enrolledFingers <= 0) {
            return null;
        }
        for (int i2 = 1; i2 <= 10; i2++) {
            if (((1 << i2) & enrolledFingers) != 0) {
                sparseArray.put(i2, this.f6048a.getIndexName(i2));
            }
        }
        return sparseArray;
    }

    public SparseArray getRegisteredFingerprintUniqueID() {
        e();
        if (b()) {
            SparseArray sparseArray = new SparseArray();
            int enrolledFingers = this.f6048a.getEnrolledFingers();
            if (enrolledFingers <= 0) {
                return null;
            }
            for (int i2 = 1; i2 <= 10; i2++) {
                if (((1 << i2) & enrolledFingers) != 0) {
                    sparseArray.put(i2, this.f6048a.getFingerprintId(i2));
                }
            }
            return sparseArray;
        }
        throw new IllegalStateException("getRegisteredFingerprintUniqueID is not supported.");
    }

    public boolean hasRegisteredFinger() {
        e();
        return this.f6048a.getEnrolledFingers() != 0;
    }

    public void registerFinger(Context context, RegisterListener registerListener) {
        e();
        if (context == null) {
            throw new IllegalArgumentException("activityContext passed is null.");
        } else if (registerListener != null) {
            if (this.f6048a.isEnrolling()) {
                this.f6048a.notifyEnrollEnd();
            }
            try {
                context.getPackageManager();
                try {
                    this.f6048a.startEnrollActivity(context, new d(registerListener), toString());
                } catch (UndeclaredThrowableException unused) {
                    throw new IllegalArgumentException("activityContext is invalid");
                }
            } catch (NullPointerException unused2) {
                throw new IllegalArgumentException("activityContext is invalid");
            }
        } else {
            throw new IllegalArgumentException("listener passed is null.");
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        e();
        if (a()) {
            this.j = z;
            return;
        }
        throw new IllegalStateException("setCanceledOnTouchOutside is not supported.");
    }

    public void setDialogBgTransparency(int i2) {
        e();
        if (!a()) {
            throw new IllegalStateException("setDialogBGTransparency is not supported.");
        } else if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("the transparency passed is not valid.");
        } else {
            this.i = i2;
        }
    }

    public void setDialogButton(String str) {
        e();
        if (c()) {
            throw new IllegalStateException("setDialogButton is not supported.");
        } else if (str == null) {
            throw new IllegalArgumentException("the buttonText passed is null.");
        } else if (str.length() <= 32) {
            this.k = str;
        } else {
            throw new IllegalArgumentException("the title text passed is longer than 32 characters.");
        }
    }

    public void setDialogIcon(String str) {
        e();
        if (!a()) {
            throw new IllegalStateException("setDialogIcon is not supported.");
        } else if (str == null) {
            throw new IllegalArgumentException("the iconName passed is null.");
        } else if (a(str)) {
            this.h = str;
        } else {
            throw new IllegalArgumentException("the iconName passed is not valid.");
        }
    }

    public void setDialogTitle(String str, int i2) {
        e();
        if (!a()) {
            throw new IllegalStateException("setDialogTitle is not supported.");
        } else if (str == null) {
            throw new IllegalArgumentException("the titletext passed is null.");
        } else if (str.length() > 256) {
            throw new IllegalArgumentException("the title text passed is longer than 256 characters.");
        } else if ((i2 >>> 24) == 0) {
            this.f = str;
            this.g = i2 - 16777216;
        } else {
            throw new IllegalArgumentException("alpha value is not supported in the titleColor.");
        }
    }

    public void setIntendedFingerprintIndex(ArrayList arrayList) {
        e();
        if (arrayList == null) {
            Log.w(TAG, "requestedIndex is null. Identify is carried out for all indexes.");
        } else if (a()) {
            this.e = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.e.add((Integer) arrayList.get(i2));
            }
        } else {
            throw new IllegalStateException("setIntendedFingerprintIndex is not supported.");
        }
    }

    public void startIdentify(IdentifyListener identifyListener) {
        a aVar = new a();
        ArrayList arrayList = this.e;
        if (arrayList != null && arrayList.size() > 0) {
            int[] iArr = new int[this.e.size()];
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                iArr[i2] = ((Integer) this.e.get(i2)).intValue();
            }
            this.e = null;
            aVar.a(iArr);
        }
        e();
        if (this.f6048a.getEnrolledFingers() == 0) {
            throw new IllegalStateException("Identify operation is failed.");
        } else if (this.v != null) {
            throw new IllegalStateException("Identify request is denied because a previous request is still in progress.");
        } else if (identifyListener != null) {
            if (this.u == null) {
                this.u = new b(this, identifyListener, (byte) 0);
            }
            Bundle a2 = aVar.a();
            a2.putString("appName", this.f6049b.getPackageName());
            IBinder registerClient = this.f6048a.registerClient(this.u, a2);
            this.v = registerClient;
            if (registerClient == null) {
                IBinder registerClient2 = this.f6048a.registerClient(this.u, a2);
                this.v = registerClient2;
                if (registerClient2 == null) {
                    Handler handler = this.w;
                    if (handler != null) {
                        handler.post(new b(this, identifyListener));
                        return;
                    }
                    throw new IllegalStateException("failed because registerClient returned null.");
                }
            }
            int identify = this.f6048a.identify(this.v, null);
            if (identify != 0) {
                f();
                Log.i(TAG, "startIdentify : failed, " + identify);
                if (identify == -2) {
                    throw new IllegalStateException("Identify request is denied because a previous request is still in progress.");
                } else if (identify == 51) {
                    throw new SpassInvalidStateException("Identify request is denied because 5 identify attempts are failed.", 1);
                } else {
                    throw new IllegalStateException("Identify operation is failed.");
                }
            } else {
                this.u.a(identifyListener);
            }
        } else {
            throw new IllegalArgumentException("listener passed is null.");
        }
    }

    public void startIdentifyWithDialog(Context context, IdentifyListener identifyListener, boolean z) {
        int[] iArr;
        e();
        if (context == null) {
            throw new IllegalArgumentException("activityContext passed is null.");
        } else if (identifyListener != null) {
            try {
                context.getPackageManager();
                if (!(context instanceof Activity)) {
                    Log.w(TAG, "startIdentifyWithDialog : No Actvity Context");
                }
                if (a()) {
                    ArrayList arrayList = this.e;
                    if (arrayList == null || arrayList.size() <= 0) {
                        iArr = null;
                    } else {
                        iArr = new int[this.e.size()];
                        for (int i2 = 0; i2 < this.e.size(); i2++) {
                            iArr[i2] = ((Integer) this.e.get(i2)).intValue();
                        }
                    }
                    this.t = new b(this, identifyListener, (byte) 0);
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("password", z);
                        bundle.putString("packageName", context.getPackageName());
                        bundle.putString("sdk_version", "Pass-v1.2.6");
                        bundle.putBoolean("demandExtraEvent", true);
                        if (iArr != null) {
                            bundle.putIntArray("request_template_index_list", iArr);
                        }
                        if (this.f != null) {
                            bundle.putString("titletext", this.f);
                        }
                        if (this.g != -1) {
                            bundle.putInt("titlecolor", this.g);
                        }
                        if (this.h != null) {
                            bundle.putString("iconname", this.h);
                        }
                        if (this.i != -1) {
                            bundle.putInt("transparency", this.i);
                        }
                        if (this.j) {
                            bundle.putBoolean("touchoutside", this.j);
                        }
                        if (this.k != null) {
                            bundle.putString("button_name", this.k);
                        }
                        if (this.l != null) {
                            bundle.putString("standby_string", this.l);
                        }
                        if (this.f6048a.identifyWithDialog(context, this.t, bundle) != 0) {
                            throw new IllegalStateException("Identify operation is failed.");
                        }
                    } finally {
                        this.e = null;
                        this.f = null;
                        this.g = -1;
                        this.i = -1;
                        this.h = null;
                        this.j = false;
                        this.l = null;
                        this.k = null;
                    }
                } else {
                    FingerprintIdentifyDialog.FingerprintListener cVar = new c(this, identifyListener, (byte) 0);
                    Dialog showIdentifyDialog = this.f6048a.showIdentifyDialog(context, cVar, null, z);
                    this.s = showIdentifyDialog;
                    if (showIdentifyDialog != null) {
                        showIdentifyDialog.setOnDismissListener(new c(cVar));
                        this.s.show();
                        return;
                    }
                    throw new IllegalStateException("Identify operation is failed.");
                }
            } catch (NullPointerException unused) {
                throw new IllegalArgumentException("activityContext is invalid");
            }
        } else {
            throw new IllegalArgumentException("listener passed is null.");
        }
    }
}
