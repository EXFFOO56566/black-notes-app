.class public final Lcom/google/android/gms/internal/ads/wq2;
.super Lcom/google/android/gms/internal/ads/ah;
.source ""


# instance fields
.field private b:Lcom/google/android/gms/internal/ads/eh;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ah;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/wq2;)Lcom/google/android/gms/internal/ads/eh;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/wq2;->b:Lcom/google/android/gms/internal/ads/eh;

    return-object p0
.end method


# virtual methods
.method public final M(Lb/c/b/a/d/a;)V
    .locals 0

    return-void
.end method

.method public final M()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final P()V
    .locals 0

    return-void
.end method

.method public final S1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/eh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wq2;->b:Lcom/google/android/gms/internal/ads/eh;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/io2;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/kh;)V
    .locals 1

    const-string p1, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/sn;->b:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/ads/xq2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/xq2;-><init>(Lcom/google/android/gms/internal/ads/wq2;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zg;)V
    .locals 0

    return-void
.end method

.method public final a(Z)V
    .locals 0

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final destroy()V
    .locals 0

    return-void
.end method

.method public final j()Lcom/google/android/gms/internal/ads/mp2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final l(Lb/c/b/a/d/a;)V
    .locals 0

    return-void
.end method

.method public final p()V
    .locals 0

    return-void
.end method

.method public final p(Lb/c/b/a/d/a;)V
    .locals 0

    return-void
.end method

.method public final r(Lb/c/b/a/d/a;)V
    .locals 0

    return-void
.end method

.method public final v()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final v(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final z()V
    .locals 0

    return-void
.end method
