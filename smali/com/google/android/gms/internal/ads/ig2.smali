.class public final Lcom/google/android/gms/internal/ads/ig2;
.super Landroid/view/Surface;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x11
.end annotation


# static fields
.field private static d:Z

.field private static e:Z


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/kg2;

.field private c:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/kg2;Landroid/graphics/SurfaceTexture;Z)V
    .locals 0

    invoke-direct {p0, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ig2;->b:Lcom/google/android/gms/internal/ads/kg2;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/kg2;Landroid/graphics/SurfaceTexture;ZLcom/google/android/gms/internal/ads/hg2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/ig2;-><init>(Lcom/google/android/gms/internal/ads/kg2;Landroid/graphics/SurfaceTexture;Z)V

    return-void
.end method

.method public static a(Landroid/content/Context;Z)Lcom/google/android/gms/internal/ads/ig2;
    .locals 2

    sget v0, Lcom/google/android/gms/internal/ads/ag2;->a:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_2

    if-eqz p1, :cond_1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ig2;->a(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/mf2;->b(Z)V

    new-instance p0, Lcom/google/android/gms/internal/ads/kg2;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/kg2;-><init>()V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/kg2;->a(Z)Lcom/google/android/gms/internal/ads/ig2;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Unsupported prior to API level 17"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Z
    .locals 5

    const-class v0, Lcom/google/android/gms/internal/ads/ig2;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/google/android/gms/internal/ads/ig2;->e:Z

    if-nez v1, :cond_4

    sget v1, Lcom/google/android/gms/internal/ads/ag2;->a:I

    const/16 v2, 0x11

    const/4 v3, 0x1

    if-lt v1, v2, :cond_3

    const/4 v1, 0x0

    invoke-static {v1}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v2

    const/16 v4, 0x3055

    invoke-static {v2, v4}, Landroid/opengl/EGL14;->eglQueryString(Landroid/opengl/EGLDisplay;I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v4, "EGL_EXT_protected_content"

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget v2, Lcom/google/android/gms/internal/ads/ag2;->a:I

    const/16 v4, 0x18

    if-ne v2, v4, :cond_1

    sget-object v2, Lcom/google/android/gms/internal/ads/ag2;->d:Ljava/lang/String;

    const-string v4, "SM-G950"

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lcom/google/android/gms/internal/ads/ag2;->d:Ljava/lang/String;

    const-string v4, "SM-G955"

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v2, "android.hardware.vr.high_performance"

    invoke-virtual {p0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_2

    const/4 v1, 0x1

    :cond_2
    sput-boolean v1, Lcom/google/android/gms/internal/ads/ig2;->d:Z

    :cond_3
    sput-boolean v3, Lcom/google/android/gms/internal/ads/ig2;->e:Z

    :cond_4
    sget-boolean p0, Lcom/google/android/gms/internal/ads/ig2;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final release()V
    .locals 2

    invoke-super {p0}, Landroid/view/Surface;->release()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ig2;->b:Lcom/google/android/gms/internal/ads/kg2;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/ig2;->c:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ig2;->b:Lcom/google/android/gms/internal/ads/kg2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/kg2;->a()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/ig2;->c:Z

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
