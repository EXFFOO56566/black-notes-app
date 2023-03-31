package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;

@TargetApi(16)
public final class fc2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f2572a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2573b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2574c;
    public final boolean d;
    private final String e;
    private final MediaCodecInfo.CodecCapabilities f;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        if ((com.google.android.gms.internal.ads.ag2.f1751a >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private fc2(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.mf2.a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f2572a = r2
            r1.e = r3
            r1.f = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L_0x0029
            if (r4 == 0) goto L_0x0029
            int r5 = com.google.android.gms.internal.ads.ag2.f1751a
            r0 = 19
            if (r5 < r0) goto L_0x0024
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0024
            r5 = 1
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r5 = 1
            goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            r1.f2573b = r5
            r5 = 21
            if (r4 == 0) goto L_0x0043
            int r0 = com.google.android.gms.internal.ads.ag2.f1751a
            if (r0 < r5) goto L_0x003e
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r1.f2574c = r0
            if (r6 != 0) goto L_0x005d
            if (r4 == 0) goto L_0x005c
            int r6 = com.google.android.gms.internal.ads.ag2.f1751a
            if (r6 < r5) goto L_0x0058
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L_0x0058
            r4 = 1
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r4 == 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            r1.d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fc2.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    public static fc2 a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new fc2(str, str2, codecCapabilities, z, z2);
    }

    @TargetApi(21)
    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        return (d2 == -1.0d || d2 <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d2);
    }

    public static fc2 b(String str) {
        return new fc2(str, null, null, false, false);
    }

    private final void c(String str) {
        String str2 = this.f2572a;
        String str3 = this.e;
        String str4 = ag2.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    @TargetApi(21)
    public final Point a(int i, int i2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            str = "align.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "align.vCaps";
            } else {
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                return new Point(ag2.a(i, widthAlignment) * widthAlignment, ag2.a(i2, heightAlignment) * heightAlignment);
            }
        }
        c(str);
        return null;
    }

    @TargetApi(21)
    public final boolean a(int i) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            sb = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                sb = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i)) {
                return true;
            } else {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("sampleRate.support, ");
                sb2.append(i);
                sb = sb2.toString();
            }
        }
        c(sb);
        return false;
    }

    @TargetApi(21)
    public final boolean a(int i, int i2, double d2) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            sb = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                sb = "sizeAndRate.vCaps";
            } else if (a(videoCapabilities, i, i2, d2)) {
                return true;
            } else {
                if (i >= i2 || !a(videoCapabilities, i2, i, d2)) {
                    StringBuilder sb2 = new StringBuilder(69);
                    sb2.append("sizeAndRate.support, ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    sb2.append("x");
                    sb2.append(d2);
                    sb = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder(69);
                    sb3.append("sizeAndRate.rotated, ");
                    sb3.append(i);
                    sb3.append("x");
                    sb3.append(i2);
                    sb3.append("x");
                    sb3.append(d2);
                    String sb4 = sb3.toString();
                    String str = this.f2572a;
                    String str2 = this.e;
                    String str3 = ag2.e;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(sb4).length() + 25 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
                    sb5.append("AssumedSupport [");
                    sb5.append(sb4);
                    sb5.append("] [");
                    sb5.append(str);
                    sb5.append(", ");
                    sb5.append(str2);
                    sb5.append("] [");
                    sb5.append(str3);
                    sb5.append("]");
                    Log.d("MediaCodecInfo", sb5.toString());
                    return true;
                }
            }
        }
        c(sb);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fc2.a(java.lang.String):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @TargetApi(21)
    public final boolean b(int i) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            sb = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                sb = "channelCount.aCaps";
            } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
                return true;
            } else {
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("channelCount.support, ");
                sb2.append(i);
                sb = sb2.toString();
            }
        }
        c(sb);
        return false;
    }
}
