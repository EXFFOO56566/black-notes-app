package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.l;

@TargetApi(11)
public final class os extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private final ws f4036a;

    public os(ws wsVar) {
        this.f4036a = wsVar;
    }

    private static Context a(WebView webView) {
        if (!(webView instanceof ws)) {
            return webView.getContext();
        }
        ws wsVar = (ws) webView;
        Activity a2 = wsVar.a();
        return a2 != null ? a2 : wsVar.getContext();
    }

    private final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        AlertDialog create;
        c b2;
        try {
            if (this.f4036a == null || this.f4036a.P() == null || this.f4036a.P().b() == null || (b2 = this.f4036a.P().b()) == null || b2.b()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    create = builder.setView(linearLayout).setPositiveButton(17039370, new us(jsPromptResult, editText)).setNegativeButton(17039360, new rs(jsPromptResult)).setOnCancelListener(new ss(jsPromptResult)).create();
                } else {
                    create = builder.setMessage(str3).setPositiveButton(17039370, new ps(jsResult)).setNegativeButton(17039360, new qs(jsResult)).setOnCancelListener(new ns(jsResult)).create();
                }
                create.show();
                return true;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            b2.a(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            co.c("Fail to display Dialog.", e);
        }
    }

    public final void onCloseWindow(WebView webView) {
        String str;
        if (!(webView instanceof ws)) {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        } else {
            com.google.android.gms.ads.internal.overlay.c M = ((ws) webView).M();
            if (M == null) {
                str = "Tried to close an AdWebView not associated with an overlay.";
            } else {
                M.b2();
                return;
            }
        }
        co.d(str);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = ts.f4849a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            co.b(sb2);
        } else if (i == 2) {
            co.d(sb2);
        } else if (i == 3 || i == 4 || i != 5) {
            co.c(sb2);
        } else {
            co.a(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f4036a.J() != null) {
            webView2.setWebViewClient(this.f4036a.J());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072L, j4), 1048576L);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            q.c();
            if (!gl.b(this.f4036a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                q.c();
                if (!gl.b(this.f4036a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.c M = this.f4036a.M();
        if (M == null) {
            co.d("Could not get ad overlay when hiding custom view.");
        } else {
            M.c2();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (!l.h() || c1.f2037a.a().booleanValue()) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        ws wsVar = this.f4036a;
        if (wsVar == null || wsVar.P() == null || this.f4036a.P().g() == null) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        String[] a2 = this.f4036a.P().g().a(permissionRequest.getResources());
        if (a2.length > 0) {
            permissionRequest.grant(a2);
        } else {
            permissionRequest.deny();
        }
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.c M = this.f4036a.M();
        if (M == null) {
            co.d("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        M.a(view, customViewCallback);
        M.b(i);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
