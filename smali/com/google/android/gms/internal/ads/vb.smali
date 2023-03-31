.class public final Lcom/google/android/gms/internal/ads/vb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/ads/mediation/c;
.implements Lcom/google/ads/mediation/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<NETWORK_EXTRAS::",
        "Lcom/google/ads/mediation/f;",
        "SERVER_PARAMETERS:",
        "Lcom/google/ads/mediation/e;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/ads/mediation/c;",
        "Lcom/google/ads/mediation/d;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/xa;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/xa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vb;->a:Lcom/google/android/gms/internal/ads/xa;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/vb;)Lcom/google/android/gms/internal/ads/xa;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/vb;->a:Lcom/google/android/gms/internal/ads/xa;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/ads/mediation/MediationBannerAdapter;Lb/c/a/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/ads/mediation/MediationBannerAdapter<",
            "**>;",
            "Lb/c/a/a;",
            ")V"
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x2f

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Adapter called onFailedToReceiveAd with error. "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    invoke-static {}, Lcom/google/android/gms/internal/ads/sn;->b()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/sn;->b:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/ads/xb;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/xb;-><init>(Lcom/google/android/gms/internal/ads/vb;Lb/c/a/a;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vb;->a:Lcom/google/android/gms/internal/ads/xa;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/ac;->a(Lb/c/a/a;)I

    move-result p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/xa;->a(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/google/ads/mediation/MediationInterstitialAdapter;Lb/c/a/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/ads/mediation/MediationInterstitialAdapter<",
            "**>;",
            "Lb/c/a/a;",
            ")V"
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x2f

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Adapter called onFailedToReceiveAd with error "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    invoke-static {}, Lcom/google/android/gms/internal/ads/sn;->b()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/sn;->b:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/ads/zb;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/zb;-><init>(Lcom/google/android/gms/internal/ads/vb;Lb/c/a/a;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vb;->a:Lcom/google/android/gms/internal/ads/xa;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/ac;->a(Lb/c/a/a;)I

    move-result p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/xa;->a(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
