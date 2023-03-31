.class public final Lcom/google/android/gms/internal/ads/ak2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field a:Lcom/google/android/gms/internal/ads/l72;

.field b:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zr2;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->g2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    const-string v0, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"

    sget-object v1, Lcom/google/android/gms/internal/ads/dk2;->a:Lcom/google/android/gms/internal/ads/eo;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/bo;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/eo;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/l72;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ak2;->a:Lcom/google/android/gms/internal/ads/l72;

    invoke-static {p1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ak2;->a:Lcom/google/android/gms/internal/ads/l72;

    invoke-static {p1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object p1

    const-string v1, "GMA_SDK"

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/l72;->b(Lb/c/b/a/d/a;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/ak2;->b:Z
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/do; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "Cannot dynamite load clearcut"

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zr2;->a(Landroid/content/Context;)V

    :try_start_0
    const-string p3, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"

    sget-object v0, Lcom/google/android/gms/internal/ads/ek2;->a:Lcom/google/android/gms/internal/ads/eo;

    invoke-static {p1, p3, v0}, Lcom/google/android/gms/internal/ads/bo;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/eo;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/ads/l72;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ak2;->a:Lcom/google/android/gms/internal/ads/l72;

    invoke-static {p1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/ak2;->a:Lcom/google/android/gms/internal/ads/l72;

    invoke-static {p1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p3, p1, p2, v0}, Lcom/google/android/gms/internal/ads/l72;->b(Lb/c/b/a/d/a;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/ak2;->b:Z
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/do; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "Cannot dynamite load clearcut"

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a([B)Lcom/google/android/gms/internal/ads/fk2;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/fk2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/internal/ads/fk2;-><init>(Lcom/google/android/gms/internal/ads/ak2;[BLcom/google/android/gms/internal/ads/gk2;)V

    return-object v0
.end method
