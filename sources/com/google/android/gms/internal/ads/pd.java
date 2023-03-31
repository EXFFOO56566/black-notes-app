package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final class pd implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4147b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4148c;
    private final /* synthetic */ md d;

    pd(md mdVar, String str, String str2) {
        this.d = mdVar;
        this.f4147b = str;
        this.f4148c = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.d.d.getSystemService("download");
        try {
            String str = this.f4147b;
            String str2 = this.f4148c;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            q.e();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.d.a("Could not store picture.");
        }
    }
}
