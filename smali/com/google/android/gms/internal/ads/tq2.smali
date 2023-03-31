.class public final Lcom/google/android/gms/internal/ads/tq2;
.super Lcom/google/android/gms/internal/ads/uo2;
.source ""


# instance fields
.field private b:Lcom/google/android/gms/internal/ads/l6;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uo2;-><init>()V

    return-void
.end method


# virtual methods
.method public final L()V
    .locals 2

    const-string v0, "The initialization is not processed because MobileAdsSettingsManager is not created successfully."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/sn;->b:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/ads/vq2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/vq2;-><init>(Lcom/google/android/gms/internal/ads/tq2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final N0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final V1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/e6;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final W1()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final a(F)V
    .locals 0

    return-void
.end method

.method public final a(Lb/c/b/a/d/a;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/l6;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tq2;->b:Lcom/google/android/gms/internal/ads/l6;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ra;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/yq2;)V
    .locals 0

    return-void
.end method

.method public final b(Ljava/lang/String;Lb/c/b/a/d/a;)V
    .locals 0

    return-void
.end method

.method final synthetic b2()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tq2;->b:Lcom/google/android/gms/internal/ads/l6;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/l6;->a(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not notify onComplete event."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final d(Z)V
    .locals 0

    return-void
.end method

.method public final h(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final o1()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method
