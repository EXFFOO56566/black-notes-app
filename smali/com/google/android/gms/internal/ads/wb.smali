.class public final Lcom/google/android/gms/internal/ads/wb;
.super Lcom/google/android/gms/internal/ads/va;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<NETWORK_EXTRAS::",
        "Lcom/google/ads/mediation/f;",
        "SERVER_PARAMETERS:",
        "Lcom/google/ads/mediation/e;",
        ">",
        "Lcom/google/android/gms/internal/ads/va;"
    }
.end annotation


# instance fields
.field private final b:Lcom/google/ads/mediation/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/ads/mediation/b<",
            "TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/ads/mediation/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TNETWORK_EXTRAS;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/ads/mediation/b;Lcom/google/ads/mediation/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/ads/mediation/b<",
            "TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;TNETWORK_EXTRAS;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/va;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wb;->b:Lcom/google/ads/mediation/b;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wb;->c:Lcom/google/ads/mediation/f;

    return-void
.end method

.method private final A(Ljava/lang/String;)Lcom/google/ads/mediation/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TSERVER_PARAMETERS;"
        }
    .end annotation

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/HashMap;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/HashMap;-><init>(I)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wb;->b:Lcom/google/ads/mediation/b;

    invoke-interface {v0}, Lcom/google/ads/mediation/b;->getServerParametersType()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/ads/mediation/e;

    invoke-virtual {v1, p1}, Lcom/google/ads/mediation/e;->a(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    return-object v1

    :catchall_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1
.end method

.method private static c(Lcom/google/android/gms/internal/ads/rm2;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/rm2;->g:Z

    if-nez p0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    invoke-static {}, Lcom/google/android/gms/internal/ads/sn;->a()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final A1()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final F(Lb/c/b/a/d/a;)V
    .locals 0

    return-void
.end method

.method public final F1()Lb/c/b/a/d/a;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wb;->b:Lcom/google/ads/mediation/b;

    instance-of v1, v0, Lcom/google/ads/mediation/MediationBannerAdapter;

    if-nez v1, :cond_1

    const-string v1, "Not a MediationBannerAdapter: "

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_1
    :try_start_0
    check-cast v0, Lcom/google/ads/mediation/MediationBannerAdapter;

    invoke-interface {v0}, Lcom/google/ads/mediation/MediationBannerAdapter;->getBannerView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final J0()Lcom/google/android/gms/internal/ads/gb;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final P1()Lcom/google/android/gms/internal/ads/hb;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/g6;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/c/b/a/d/a;",
            "Lcom/google/android/gms/internal/ads/g6;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/o6;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/ph;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/c/b/a/d/a;",
            "Lcom/google/android/gms/internal/ads/ph;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ph;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 0

    return-void
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 6

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/wb;->b:Lcom/google/ads/mediation/b;

    instance-of v0, p4, Lcom/google/ads/mediation/MediationInterstitialAdapter;

    if-nez v0, :cond_1

    const-string p1, "Not a MediationInterstitialAdapter: "

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, p2

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1

    :cond_1
    const-string p4, "Requesting interstitial ad from adapter."

    invoke-static {p4}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/wb;->b:Lcom/google/ads/mediation/b;

    move-object v0, p4

    check-cast v0, Lcom/google/ads/mediation/MediationInterstitialAdapter;

    new-instance v1, Lcom/google/android/gms/internal/ads/vb;

    invoke-direct {v1, p5}, Lcom/google/android/gms/internal/ads/vb;-><init>(Lcom/google/android/gms/internal/ads/xa;)V

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroid/app/Activity;

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/wb;->A(Ljava/lang/String;)Lcom/google/ads/mediation/e;

    move-result-object v3

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/wb;->c(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result p1

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/ac;->a(Lcom/google/android/gms/internal/ads/rm2;Z)Lcom/google/ads/mediation/a;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/wb;->c:Lcom/google/ads/mediation/f;

    invoke-interface/range {v0 .. v5}, Lcom/google/ads/mediation/MediationInterstitialAdapter;->requestInterstitialAd(Lcom/google/ads/mediation/d;Landroid/app/Activity;Lcom/google/ads/mediation/e;Lcom/google/ads/mediation/a;Lcom/google/ads/mediation/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, ""

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;Lcom/google/android/gms/internal/ads/m1;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/c/b/a/d/a;",
            "Lcom/google/android/gms/internal/ads/rm2;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/xa;",
            "Lcom/google/android/gms/internal/ads/m1;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/um2;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/wb;->a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/um2;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V

    return-void
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/um2;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 7

    iget-object p5, p0, Lcom/google/android/gms/internal/ads/wb;->b:Lcom/google/ads/mediation/b;

    instance-of v0, p5, Lcom/google/ads/mediation/MediationBannerAdapter;

    if-nez v0, :cond_1

    const-string p1, "Not a MediationBannerAdapter: "

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, p2

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1

    :cond_1
    const-string p5, "Requesting banner ad from adapter."

    invoke-static {p5}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/wb;->b:Lcom/google/ads/mediation/b;

    move-object v0, p5

    check-cast v0, Lcom/google/ads/mediation/MediationBannerAdapter;

    new-instance v1, Lcom/google/android/gms/internal/ads/vb;

    invoke-direct {v1, p6}, Lcom/google/android/gms/internal/ads/vb;-><init>(Lcom/google/android/gms/internal/ads/xa;)V

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroid/app/Activity;

    invoke-direct {p0, p4}, Lcom/google/android/gms/internal/ads/wb;->A(Ljava/lang/String;)Lcom/google/ads/mediation/e;

    move-result-object v3

    const/4 p1, 0x6

    new-array p4, p1, [Lb/c/a/c;

    sget-object p5, Lb/c/a/c;->b:Lb/c/a/c;

    const/4 p6, 0x0

    aput-object p5, p4, p6

    sget-object p5, Lb/c/a/c;->c:Lb/c/a/c;

    const/4 v4, 0x1

    aput-object p5, p4, v4

    const/4 p5, 0x2

    sget-object v4, Lb/c/a/c;->d:Lb/c/a/c;

    aput-object v4, p4, p5

    const/4 p5, 0x3

    sget-object v4, Lb/c/a/c;->e:Lb/c/a/c;

    aput-object v4, p4, p5

    const/4 p5, 0x4

    sget-object v4, Lb/c/a/c;->f:Lb/c/a/c;

    aput-object v4, p4, p5

    const/4 p5, 0x5

    sget-object v4, Lb/c/a/c;->g:Lb/c/a/c;

    aput-object v4, p4, p5

    :goto_1
    if-ge p6, p1, :cond_3

    aget-object p5, p4, p6

    invoke-virtual {p5}, Lb/c/a/c;->b()I

    move-result p5

    iget v4, p2, Lcom/google/android/gms/internal/ads/um2;->f:I

    if-ne p5, v4, :cond_2

    aget-object p5, p4, p6

    invoke-virtual {p5}, Lb/c/a/c;->a()I

    move-result p5

    iget v4, p2, Lcom/google/android/gms/internal/ads/um2;->c:I

    if-ne p5, v4, :cond_2

    aget-object p1, p4, p6

    goto :goto_2

    :cond_2
    add-int/lit8 p6, p6, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Lb/c/a/c;

    iget p4, p2, Lcom/google/android/gms/internal/ads/um2;->f:I

    iget p5, p2, Lcom/google/android/gms/internal/ads/um2;->c:I

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/um2;->b:Ljava/lang/String;

    invoke-static {p4, p5, p2}, Lcom/google/android/gms/ads/a0;->a(IILjava/lang/String;)Lcom/google/android/gms/ads/e;

    move-result-object p2

    invoke-direct {p1, p2}, Lb/c/a/c;-><init>(Lcom/google/android/gms/ads/e;)V

    :goto_2
    move-object v4, p1

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/wb;->c(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result p1

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/ac;->a(Lcom/google/android/gms/internal/ads/rm2;Z)Lcom/google/ads/mediation/a;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/wb;->c:Lcom/google/ads/mediation/f;

    invoke-interface/range {v0 .. v6}, Lcom/google/ads/mediation/MediationBannerAdapter;->requestBannerAd(Lcom/google/ads/mediation/c;Landroid/app/Activity;Lcom/google/ads/mediation/e;Lb/c/a/c;Lcom/google/ads/mediation/a;Lcom/google/ads/mediation/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, ""

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final a(Z)V
    .locals 0

    return-void
.end method

.method public final a0()Lcom/google/android/gms/internal/ads/ed;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/wb;->a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V

    return-void
.end method

.method public final c(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 0

    return-void
.end method

.method public final destroy()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wb;->b:Lcom/google/ads/mediation/b;

    invoke-interface {v0}, Lcom/google/ads/mediation/b;->destroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final f1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getInterstitialAdapterInfo()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/ads/rp2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h(Lb/c/b/a/d/a;)V
    .locals 0

    return-void
.end method

.method public final h0()Lcom/google/android/gms/internal/ads/ed;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final n1()Lcom/google/android/gms/internal/ads/ab;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final p()V
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final showInterstitial()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wb;->b:Lcom/google/ads/mediation/b;

    instance-of v1, v0, Lcom/google/ads/mediation/MediationInterstitialAdapter;

    if-nez v1, :cond_1

    const-string v1, "Not a MediationInterstitialAdapter: "

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_1
    const-string v0, "Showing interstitial from adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wb;->b:Lcom/google/ads/mediation/b;

    check-cast v0, Lcom/google/ads/mediation/MediationInterstitialAdapter;

    invoke-interface {v0}, Lcom/google/ads/mediation/MediationInterstitialAdapter;->showInterstitial()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final showVideo()V
    .locals 0

    return-void
.end method

.method public final z()V
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final z0()Lcom/google/android/gms/internal/ads/s2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzti()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method
