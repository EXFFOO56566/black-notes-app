package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
public final class dp extends rp implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> r = new HashMap();
    private final kq d;
    private final boolean e;
    private int f = 0;
    private int g = 0;
    private MediaPlayer h;
    private Uri i;
    private int j;
    private int k;
    private int l;
    private int m;
    private eq n;
    private boolean o;
    private int p;
    private op q;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            r.put(-1004, "MEDIA_ERROR_IO");
            r.put(-1007, "MEDIA_ERROR_MALFORMED");
            r.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            r.put(-110, "MEDIA_ERROR_TIMED_OUT");
            r.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        r.put(100, "MEDIA_ERROR_SERVER_DIED");
        r.put(1, "MEDIA_ERROR_UNKNOWN");
        r.put(1, "MEDIA_INFO_UNKNOWN");
        r.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        r.put(701, "MEDIA_INFO_BUFFERING_START");
        r.put(702, "MEDIA_INFO_BUFFERING_END");
        r.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        r.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        r.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            r.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            r.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public dp(Context context, boolean z, boolean z2, hq hqVar, kq kqVar) {
        super(context);
        setSurfaceTextureListener(this);
        this.d = kqVar;
        this.o = z;
        this.e = z2;
        kqVar.a(this);
    }

    private final void a(float f2) {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        } else {
            co.d("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void a(boolean z) {
        wk.e("AdMediaPlayerView release");
        eq eqVar = this.n;
        if (eqVar != null) {
            eqVar.b();
            this.n = null;
        }
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.h.release();
            this.h = null;
            i(0);
            if (z) {
                this.g = 0;
                this.g = 0;
            }
        }
    }

    private final void f() {
        wk.e("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.i != null && surfaceTexture != null) {
            a(false);
            try {
                q.s();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.h = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.h.setOnCompletionListener(this);
                this.h.setOnErrorListener(this);
                this.h.setOnInfoListener(this);
                this.h.setOnPreparedListener(this);
                this.h.setOnVideoSizeChangedListener(this);
                if (this.o) {
                    eq eqVar = new eq(getContext());
                    this.n = eqVar;
                    eqVar.a(surfaceTexture, getWidth(), getHeight());
                    this.n.start();
                    SurfaceTexture c2 = this.n.c();
                    if (c2 != null) {
                        surfaceTexture = c2;
                    } else {
                        this.n.b();
                        this.n = null;
                    }
                }
                this.h.setDataSource(getContext(), this.i);
                q.t();
                this.h.setSurface(new Surface(surfaceTexture));
                this.h.setAudioStreamType(3);
                this.h.setScreenOnWhilePlaying(true);
                this.h.prepareAsync();
                i(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
                String valueOf = String.valueOf(this.i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                co.c(sb.toString(), e2);
                onError(this.h, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g() {
        /*
            r8 = this;
            boolean r0 = r8.e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.h()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r8.h
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r8.g
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.internal.ads.wk.e(r0)
            r0 = 0
            r8.a(r0)
            android.media.MediaPlayer r0 = r8.h
            r0.start()
            android.media.MediaPlayer r0 = r8.h
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.d r1 = com.google.android.gms.ads.internal.q.j()
            long r1 = r1.a()
        L_0x0034:
            boolean r3 = r8.h()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r8.h
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            com.google.android.gms.common.util.d r3 = com.google.android.gms.ads.internal.q.j()
            long r3 = r3.a()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.h
            r0.pause()
            r8.a()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dp.g():void");
    }

    private final boolean h() {
        int i2;
        return (this.h == null || (i2 = this.f) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    private final void i(int i2) {
        if (i2 == 3) {
            this.d.c();
            this.f4530c.b();
        } else if (this.f == 3) {
            this.d.d();
            this.f4530c.c();
        }
        this.f = i2;
    }

    @Override // com.google.android.gms.internal.ads.lq, com.google.android.gms.internal.ads.rp
    public final void a() {
        a(this.f4530c.a());
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void a(float f2, float f3) {
        eq eqVar = this.n;
        if (eqVar != null) {
            eqVar.a(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void a(op opVar) {
        this.q = opVar;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void b() {
        wk.e("AdMediaPlayerView pause");
        if (h() && this.h.isPlaying()) {
            this.h.pause();
            i(4);
            gl.h.post(new pp(this));
        }
        this.g = 4;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void b(int i2) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        wk.e(sb.toString());
        if (h()) {
            this.h.seekTo(i2);
            this.p = 0;
            return;
        }
        this.p = i2;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void c() {
        wk.e("AdMediaPlayerView play");
        if (h()) {
            this.h.start();
            i(3);
            this.f4529b.a();
            gl.h.post(new mp(this));
        }
        this.g = 3;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void d() {
        wk.e("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.h.release();
            this.h = null;
            i(0);
            this.g = 0;
        }
        this.d.a();
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final String e() {
        String str = this.o ? " spherical" : BuildConfig.FLAVOR;
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final int getCurrentPosition() {
        if (h()) {
            return this.h.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final int getDuration() {
        if (h()) {
            return this.h.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(int i2) {
        op opVar = this.q;
        if (opVar != null) {
            opVar.onWindowVisibilityChanged(i2);
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        wk.e("AdMediaPlayerView completion");
        i(5);
        this.g = 5;
        gl.h.post(new jp(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = r.get(Integer.valueOf(i2));
        String str2 = r.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        co.d(sb.toString());
        i(-1);
        this.g = -1;
        gl.h.post(new hp(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = r.get(Integer.valueOf(i2));
        String str2 = r.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        wk.e(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int defaultSize = TextureView.getDefaultSize(this.j, i2);
        int defaultSize2 = TextureView.getDefaultSize(this.k, i3);
        if (this.j > 0 && this.k > 0 && this.n == null) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i5 = this.j;
                int i6 = i5 * size2;
                int i7 = this.k;
                if (i6 < size * i7) {
                    defaultSize = (i5 * size2) / i7;
                    defaultSize2 = size2;
                } else {
                    if (i5 * size2 > size * i7) {
                        defaultSize2 = (i7 * size) / i5;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i8 = (this.k * size) / this.j;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    defaultSize2 = i8;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else if (mode2 == 1073741824) {
                int i9 = (this.j * size2) / this.k;
                if (mode != Integer.MIN_VALUE || i9 <= size) {
                    defaultSize = i9;
                    defaultSize2 = size2;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                int i10 = this.j;
                int i11 = this.k;
                if (mode2 != Integer.MIN_VALUE || i11 <= size2) {
                    defaultSize2 = i11;
                } else {
                    i10 = (i10 * size2) / i11;
                    defaultSize2 = size2;
                }
                if (mode != Integer.MIN_VALUE || i10 <= size) {
                    defaultSize = i10;
                } else {
                    defaultSize2 = (this.k * size) / this.j;
                }
            }
            defaultSize = size;
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        eq eqVar = this.n;
        if (eqVar != null) {
            eqVar.a(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i12 = this.l;
            if ((i12 > 0 && i12 != defaultSize) || ((i4 = this.m) > 0 && i4 != defaultSize2)) {
                g();
            }
            this.l = defaultSize;
            this.m = defaultSize2;
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        wk.e("AdMediaPlayerView prepared");
        i(2);
        this.d.b();
        gl.h.post(new fp(this));
        this.j = mediaPlayer.getVideoWidth();
        this.k = mediaPlayer.getVideoHeight();
        int i2 = this.p;
        if (i2 != 0) {
            b(i2);
        }
        g();
        int i3 = this.j;
        int i4 = this.k;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        co.c(sb.toString());
        if (this.g == 3) {
            c();
        }
        a();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        wk.e("AdMediaPlayerView surface created");
        f();
        gl.h.post(new lp(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        wk.e("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null && this.p == 0) {
            this.p = mediaPlayer.getCurrentPosition();
        }
        eq eqVar = this.n;
        if (eqVar != null) {
            eqVar.b();
        }
        gl.h.post(new np(this));
        a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        wk.e("AdMediaPlayerView surface changed");
        boolean z = true;
        boolean z2 = this.g == 3;
        if (!(this.j == i2 && this.k == i3)) {
            z = false;
        }
        if (this.h != null && z2 && z) {
            int i4 = this.p;
            if (i4 != 0) {
                b(i4);
            }
            c();
        }
        eq eqVar = this.n;
        if (eqVar != null) {
            eqVar.a(i2, i3);
        }
        gl.h.post(new kp(this, i2, i3));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.d.b(this);
        this.f4529b.a(surfaceTexture, this.q);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        wk.e(sb.toString());
        this.j = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.k = videoHeight;
        if (this.j != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        wk.e(sb.toString());
        gl.h.post(new gp(this, i2));
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        ij2 a2 = ij2.a(parse);
        if (a2 == null || a2.f3098b != null) {
            if (a2 != null) {
                parse = Uri.parse(a2.f3098b);
            }
            this.i = parse;
            this.p = 0;
            f();
            requestLayout();
            invalidate();
        }
    }

    public final String toString() {
        String name = dp.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }
}
