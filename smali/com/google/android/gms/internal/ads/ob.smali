.class public final Lcom/google/android/gms/internal/ads/ob;
.super Lcom/google/android/gms/internal/ads/va;
.source ""


# instance fields
.field private final b:Ljava/lang/Object;

.field private c:Lcom/google/android/gms/internal/ads/pb;

.field private d:Lcom/google/android/gms/internal/ads/ph;

.field private e:Lb/c/b/a/d/a;

.field private f:Lcom/google/android/gms/ads/mediation/o;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/mediation/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/va;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/mediation/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/va;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    return-void
.end method

.method private final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 4

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "Server parameters: "

    if-eqz v1, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    if-eqz p1, :cond_2

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v0, p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of p1, p1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    if-eqz p1, :cond_3

    const-string p1, "adJson"

    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_3

    const-string p1, "tagForChildDirectedTreatment"

    iget p2, p2, Lcom/google/android/gms/internal/ads/rm2;->h:I

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_3
    const-string p1, "max_ad_content_rating"

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception p1

    const-string p2, ""

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1
.end method

.method private final a(Lcom/google/android/gms/internal/ads/xa;)Lcom/google/android/gms/ads/mediation/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/xa;",
            ")",
            "Lcom/google/android/gms/ads/mediation/d<",
            "Lcom/google/android/gms/ads/mediation/o;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/qb;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/qb;-><init>(Lcom/google/android/gms/internal/ads/ob;Lcom/google/android/gms/internal/ads/xa;)V

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ob;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    return-object p0
.end method

.method private static a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;)Ljava/lang/String;
    .locals 1

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/rm2;->v:Ljava/lang/String;

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "max_ad_content_rating"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p1
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

.method private final d(Lcom/google/android/gms/internal/ads/rm2;)Landroid/os/Bundle;
    .locals 1

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    return-object p1
.end method


# virtual methods
.method public final A1()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final F(Lb/c/b/a/d/a;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v0, v0, Lcom/google/android/gms/ads/mediation/a;

    if-eqz v0, :cond_1

    const-string v0, "Show rewarded ad from adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->f:Lcom/google/android/gms/ads/mediation/o;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/mediation/o;->a(Landroid/content/Context;)V

    return-void

    :cond_0
    const-string p1, "Can not show null mediation rewarded ad."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1

    :cond_1
    const-class p1, Lcom/google/android/gms/ads/mediation/a;

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x16

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " #009 Class mismatch: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1
.end method

.method public final F1()Lb/c/b/a/d/a;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    if-eqz v1, :cond_0

    :try_start_0
    check-cast v0, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;->getBannerView()Landroid/view/View;

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

    :cond_0
    const-class v0, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x16

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final J0()Lcom/google/android/gms/internal/ads/gb;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->c:Lcom/google/android/gms/internal/ads/pb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pb;->a()Lcom/google/android/gms/ads/mediation/q;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/s;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/ub;

    check-cast v0, Lcom/google/android/gms/ads/mediation/s;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/ub;-><init>(Lcom/google/android/gms/ads/mediation/s;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final P1()Lcom/google/android/gms/internal/ads/hb;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->c:Lcom/google/android/gms/internal/ads/pb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pb;->b()Lcom/google/android/gms/ads/mediation/w;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/bc;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/bc;-><init>(Lcom/google/android/gms/ads/mediation/w;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/g6;Ljava/util/List;)V
    .locals 9
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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v0, v0, Lcom/google/android/gms/ads/mediation/a;

    if-eqz v0, :cond_6

    new-instance v0, Lcom/google/android/gms/internal/ads/nb;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/nb;-><init>(Lcom/google/android/gms/internal/ads/ob;Lcom/google/android/gms/internal/ads/g6;)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/o6;

    new-instance v2, Lcom/google/android/gms/ads/mediation/i;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/o6;->b:Ljava/lang/String;

    const/4 v4, -0x1

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v5

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v5, "interstitial"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :sswitch_1
    const-string v5, "rewarded"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v4, 0x2

    goto :goto_1

    :sswitch_2
    const-string v5, "native"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v4, 0x3

    goto :goto_1

    :sswitch_3
    const-string v5, "banner"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v4, 0x0

    :cond_0
    :goto_1
    if-eqz v4, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    sget-object v3, Lcom/google/android/gms/ads/a;->e:Lcom/google/android/gms/ads/a;

    goto :goto_2

    :cond_1
    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1

    :cond_2
    sget-object v3, Lcom/google/android/gms/ads/a;->d:Lcom/google/android/gms/ads/a;

    goto :goto_2

    :cond_3
    sget-object v3, Lcom/google/android/gms/ads/a;->c:Lcom/google/android/gms/ads/a;

    goto :goto_2

    :cond_4
    sget-object v3, Lcom/google/android/gms/ads/a;->b:Lcom/google/android/gms/ads/a;

    :goto_2
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/o6;->c:Landroid/os/Bundle;

    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/ads/mediation/i;-><init>(Lcom/google/android/gms/ads/a;Landroid/os/Bundle;)V

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    check-cast p3, Lcom/google/android/gms/ads/mediation/a;

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p3, p1, v0, p2}, Lcom/google/android/gms/ads/mediation/a;->initialize(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/b;Ljava/util/List;)V

    return-void

    :cond_6
    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x533a80d4 -> :sswitch_3
        -0x3ebdafe9 -> :sswitch_2
        -0xe47b3f2 -> :sswitch_1
        0x240b672c -> :sswitch_0
    .end sparse-switch
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/ph;Ljava/util/List;)V
    .locals 4
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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v0, v0, Lcom/google/android/gms/ads/reward/mediation/InitializableMediationRewardedVideoAdAdapter;

    if-eqz v0, :cond_1

    const-string v0, "Initialize rewarded video adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/ads/reward/mediation/InitializableMediationRewardedVideoAdAdapter;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v3}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    new-instance p3, Lcom/google/android/gms/internal/ads/qh;

    invoke-direct {p3, p2}, Lcom/google/android/gms/internal/ads/qh;-><init>(Lcom/google/android/gms/internal/ads/ph;)V

    invoke-interface {v0, p1, p3, v1}, Lcom/google/android/gms/ads/reward/mediation/InitializableMediationRewardedVideoAdAdapter;->initialize(Landroid/content/Context;Lcom/google/android/gms/ads/reward/mediation/a;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "Could not initialize rewarded video adapter."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1

    :cond_1
    const-class p1, Lcom/google/android/gms/ads/reward/mediation/InitializableMediationRewardedVideoAdAdapter;

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    add-int/lit8 p3, p3, 0x16

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p3, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " #009 Class mismatch: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ph;Ljava/lang/String;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v5, v4, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    if-eqz v5, :cond_4

    const-string v4, "Initialize rewarded video adapter."

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v0, v4}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v10

    if-eqz v0, :cond_3

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    if-eqz v6, :cond_0

    new-instance v6, Ljava/util/HashSet;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    invoke-direct {v6, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    move-object v14, v6

    goto :goto_0

    :cond_0
    move-object v14, v4

    :goto_0
    new-instance v6, Lcom/google/android/gms/internal/ads/lb;

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/rm2;->c:J

    const-wide/16 v11, -0x1

    cmp-long v9, v7, v11

    if-nez v9, :cond_1

    move-object v12, v4

    goto :goto_1

    :cond_1
    new-instance v7, Ljava/util/Date;

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/rm2;->c:J

    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    move-object v12, v7

    :goto_1
    iget v13, v0, Lcom/google/android/gms/internal/ads/rm2;->e:I

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/rm2;->l:Landroid/location/Location;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/ob;->c(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result v16

    iget v7, v0, Lcom/google/android/gms/internal/ads/rm2;->h:I

    iget-boolean v8, v0, Lcom/google/android/gms/internal/ads/rm2;->s:Z

    iget v9, v0, Lcom/google/android/gms/internal/ads/rm2;->u:I

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;)Ljava/lang/String;

    move-result-object v20

    move-object v11, v6

    move/from16 v17, v7

    move/from16 v18, v8

    move/from16 v19, v9

    invoke-direct/range {v11 .. v20}, Lcom/google/android/gms/internal/ads/lb;-><init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZIZILjava/lang/String;)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    if-eqz v3, :cond_2

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    move-object v11, v0

    goto :goto_2

    :cond_2
    move-object v11, v4

    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_3
    move-object v7, v4

    move-object v11, v7

    :goto_3
    invoke-static/range {p1 .. p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/content/Context;

    new-instance v9, Lcom/google/android/gms/internal/ads/qh;

    invoke-direct {v9, v2}, Lcom/google/android/gms/internal/ads/qh;-><init>(Lcom/google/android/gms/internal/ads/ph;)V

    move-object/from16 v8, p3

    invoke-interface/range {v5 .. v11}, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;->initialize(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/e;Ljava/lang/String;Lcom/google/android/gms/ads/reward/mediation/a;Landroid/os/Bundle;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v2, ""

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_4
    instance-of v0, v4, Lcom/google/android/gms/ads/mediation/a;

    if-eqz v0, :cond_5

    move-object/from16 v0, p1

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/ob;->e:Lb/c/b/a/d/a;

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/ob;->d:Lcom/google/android/gms/internal/ads/ph;

    invoke-static {v4}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/ph;->N(Lb/c/b/a/d/a;)V

    return-void

    :cond_5
    const-class v0, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-class v2, Lcom/google/android/gms/ads/mediation/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1a

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " or "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v3, v3, Lcom/google/android/gms/ads/mediation/a;

    if-eqz v3, :cond_0

    const-string v3, "Requesting rewarded ad from adapter."

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/ads/mediation/a;

    move-object/from16 v4, p4

    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/ads/ob;->a(Lcom/google/android/gms/internal/ads/xa;)Lcom/google/android/gms/ads/mediation/d;

    move-result-object v4

    new-instance v15, Lcom/google/android/gms/ads/mediation/p;

    invoke-static/range {p1 .. p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroid/content/Context;

    const-string v7, ""

    const/4 v5, 0x0

    invoke-direct {v1, v2, v0, v5}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v8

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/ob;->d(Lcom/google/android/gms/internal/ads/rm2;)Landroid/os/Bundle;

    move-result-object v9

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/ob;->c(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result v10

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/rm2;->l:Landroid/location/Location;

    iget v12, v0, Lcom/google/android/gms/internal/ads/rm2;->h:I

    iget v13, v0, Lcom/google/android/gms/internal/ads/rm2;->u:I

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;)Ljava/lang/String;

    move-result-object v14

    const-string v0, ""

    move-object v5, v15

    move-object v2, v15

    move-object v15, v0

    invoke-direct/range {v5 .. v15}, Lcom/google/android/gms/ads/mediation/p;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v2, v4}, Lcom/google/android/gms/ads/mediation/a;->loadRewardedAd(Lcom/google/android/gms/ads/mediation/p;Lcom/google/android/gms/ads/mediation/d;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v2, ""

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_0
    const-class v0, Lcom/google/android/gms/ads/mediation/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v3, v3, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    if-eqz v3, :cond_3

    const-string v3, "Requesting interstitial ad from adapter."

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    new-instance v3, Ljava/util/HashSet;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    invoke-direct {v3, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    move-object v10, v3

    goto :goto_0

    :cond_0
    move-object v10, v5

    :goto_0
    new-instance v3, Lcom/google/android/gms/internal/ads/lb;

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/rm2;->c:J

    const-wide/16 v8, -0x1

    cmp-long v11, v6, v8

    if-nez v11, :cond_1

    move-object v8, v5

    goto :goto_1

    :cond_1
    new-instance v6, Ljava/util/Date;

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/rm2;->c:J

    invoke-direct {v6, v7, v8}, Ljava/util/Date;-><init>(J)V

    move-object v8, v6

    :goto_1
    iget v9, v0, Lcom/google/android/gms/internal/ads/rm2;->e:I

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/rm2;->l:Landroid/location/Location;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/ob;->c(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result v12

    iget v13, v0, Lcom/google/android/gms/internal/ads/rm2;->h:I

    iget-boolean v14, v0, Lcom/google/android/gms/internal/ads/rm2;->s:Z

    iget v15, v0, Lcom/google/android/gms/internal/ads/rm2;->u:I

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;)Ljava/lang/String;

    move-result-object v16

    move-object v7, v3

    invoke-direct/range {v7 .. v16}, Lcom/google/android/gms/internal/ads/lb;-><init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZIZILjava/lang/String;)V

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    if-eqz v6, :cond_2

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    :cond_2
    move-object v9, v5

    invoke-static/range {p1 .. p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    new-instance v6, Lcom/google/android/gms/internal/ads/pb;

    move-object/from16 v7, p5

    invoke-direct {v6, v7}, Lcom/google/android/gms/internal/ads/pb;-><init>(Lcom/google/android/gms/internal/ads/xa;)V

    move-object/from16 v7, p4

    invoke-direct {v1, v2, v0, v7}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    move-object v8, v3

    invoke-interface/range {v4 .. v9}, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;->requestInterstitialAd(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/l;Landroid/os/Bundle;Lcom/google/android/gms/ads/mediation/e;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v2, ""

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_3
    const-class v0, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;Lcom/google/android/gms/internal/ads/m1;Ljava/util/List;)V
    .locals 19
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

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v4, v3, Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;

    if-eqz v4, :cond_3

    :try_start_0
    check-cast v3, Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    new-instance v4, Ljava/util/HashSet;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    invoke-direct {v4, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    move-object v10, v4

    goto :goto_0

    :cond_0
    move-object v10, v5

    :goto_0
    new-instance v4, Lcom/google/android/gms/internal/ads/tb;

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/rm2;->c:J

    const-wide/16 v8, -0x1

    cmp-long v11, v6, v8

    if-nez v11, :cond_1

    move-object v8, v5

    goto :goto_1

    :cond_1
    new-instance v6, Ljava/util/Date;

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/rm2;->c:J

    invoke-direct {v6, v7, v8}, Ljava/util/Date;-><init>(J)V

    move-object v8, v6

    :goto_1
    iget v9, v0, Lcom/google/android/gms/internal/ads/rm2;->e:I

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/rm2;->l:Landroid/location/Location;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/ob;->c(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result v12

    iget v13, v0, Lcom/google/android/gms/internal/ads/rm2;->h:I

    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/rm2;->s:Z

    iget v15, v0, Lcom/google/android/gms/internal/ads/rm2;->u:I

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;)Ljava/lang/String;

    move-result-object v18

    move-object v7, v4

    move-object/from16 v14, p6

    move/from16 v17, v15

    move-object/from16 v15, p7

    move/from16 v16, v6

    invoke-direct/range {v7 .. v18}, Lcom/google/android/gms/internal/ads/tb;-><init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZILcom/google/android/gms/internal/ads/m1;Ljava/util/List;ZILjava/lang/String;)V

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    if-eqz v6, :cond_2

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    :cond_2
    new-instance v6, Lcom/google/android/gms/internal/ads/pb;

    move-object/from16 v7, p5

    invoke-direct {v6, v7}, Lcom/google/android/gms/internal/ads/pb;-><init>(Lcom/google/android/gms/internal/ads/xa;)V

    iput-object v6, v1, Lcom/google/android/gms/internal/ads/ob;->c:Lcom/google/android/gms/internal/ads/pb;

    invoke-static/range {p1 .. p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/ob;->c:Lcom/google/android/gms/internal/ads/pb;

    move-object/from16 v8, p4

    invoke-direct {v1, v2, v0, v8}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    move-object/from16 p1, v3

    move-object/from16 p2, v6

    move-object/from16 p3, v7

    move-object/from16 p4, v0

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    invoke-interface/range {p1 .. p6}, Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;->requestNativeAd(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/n;Landroid/os/Bundle;Lcom/google/android/gms/ads/mediation/t;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v2, ""

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_3
    const-class v0, Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
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

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/ob;->a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/um2;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V

    return-void
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/um2;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v4, v4, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    if-eqz v4, :cond_4

    const-string v4, "Requesting banner ad from adapter."

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    new-instance v4, Ljava/util/HashSet;

    iget-object v7, v2, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    invoke-direct {v4, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    move-object v11, v4

    goto :goto_0

    :cond_0
    move-object v11, v6

    :goto_0
    new-instance v4, Lcom/google/android/gms/internal/ads/lb;

    iget-wide v7, v2, Lcom/google/android/gms/internal/ads/rm2;->c:J

    const-wide/16 v9, -0x1

    cmp-long v12, v7, v9

    if-nez v12, :cond_1

    move-object v9, v6

    goto :goto_1

    :cond_1
    new-instance v7, Ljava/util/Date;

    iget-wide v8, v2, Lcom/google/android/gms/internal/ads/rm2;->c:J

    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    move-object v9, v7

    :goto_1
    iget v10, v2, Lcom/google/android/gms/internal/ads/rm2;->e:I

    iget-object v12, v2, Lcom/google/android/gms/internal/ads/rm2;->l:Landroid/location/Location;

    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/ob;->c(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result v13

    iget v14, v2, Lcom/google/android/gms/internal/ads/rm2;->h:I

    iget-boolean v15, v2, Lcom/google/android/gms/internal/ads/rm2;->s:Z

    iget v7, v2, Lcom/google/android/gms/internal/ads/rm2;->u:I

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;)Ljava/lang/String;

    move-result-object v17

    move-object v8, v4

    move/from16 v16, v7

    invoke-direct/range {v8 .. v17}, Lcom/google/android/gms/internal/ads/lb;-><init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZIZILjava/lang/String;)V

    iget-object v7, v2, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    if-eqz v7, :cond_2

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    :cond_2
    move-object v11, v6

    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/um2;->o:Z

    if-eqz v6, :cond_3

    iget v6, v0, Lcom/google/android/gms/internal/ads/um2;->f:I

    iget v0, v0, Lcom/google/android/gms/internal/ads/um2;->c:I

    invoke-static {v6, v0}, Lcom/google/android/gms/ads/a0;->a(II)Lcom/google/android/gms/ads/e;

    move-result-object v0

    :goto_2
    move-object v9, v0

    goto :goto_3

    :cond_3
    iget v6, v0, Lcom/google/android/gms/internal/ads/um2;->f:I

    iget v7, v0, Lcom/google/android/gms/internal/ads/um2;->c:I

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/um2;->b:Ljava/lang/String;

    invoke-static {v6, v7, v0}, Lcom/google/android/gms/ads/a0;->a(IILjava/lang/String;)Lcom/google/android/gms/ads/e;

    move-result-object v0

    goto :goto_2

    :goto_3
    invoke-static/range {p1 .. p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/content/Context;

    new-instance v7, Lcom/google/android/gms/internal/ads/pb;

    move-object/from16 v0, p6

    invoke-direct {v7, v0}, Lcom/google/android/gms/internal/ads/pb;-><init>(Lcom/google/android/gms/internal/ads/xa;)V

    move-object/from16 v0, p5

    invoke-direct {v1, v3, v2, v0}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v8

    move-object v10, v4

    invoke-interface/range {v5 .. v11}, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;->requestBannerAd(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/h;Landroid/os/Bundle;Lcom/google/android/gms/ads/e;Lcom/google/android/gms/ads/mediation/e;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v2, ""

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_4
    const-class v0, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/ob;->a(Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v4, v3, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    if-eqz v4, :cond_3

    const-string v3, "Requesting rewarded video ad from adapter."

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    new-instance v4, Ljava/util/HashSet;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    invoke-direct {v4, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    move-object v10, v4

    goto :goto_0

    :cond_0
    move-object v10, v5

    :goto_0
    new-instance v4, Lcom/google/android/gms/internal/ads/lb;

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/rm2;->c:J

    const-wide/16 v8, -0x1

    cmp-long v11, v6, v8

    if-nez v11, :cond_1

    move-object v8, v5

    goto :goto_1

    :cond_1
    new-instance v6, Ljava/util/Date;

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/rm2;->c:J

    invoke-direct {v6, v7, v8}, Ljava/util/Date;-><init>(J)V

    move-object v8, v6

    :goto_1
    iget v9, v0, Lcom/google/android/gms/internal/ads/rm2;->e:I

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/rm2;->l:Landroid/location/Location;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/ob;->c(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result v12

    iget v13, v0, Lcom/google/android/gms/internal/ads/rm2;->h:I

    iget-boolean v14, v0, Lcom/google/android/gms/internal/ads/rm2;->s:Z

    iget v15, v0, Lcom/google/android/gms/internal/ads/rm2;->u:I

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;)Ljava/lang/String;

    move-result-object v16

    move-object v7, v4

    invoke-direct/range {v7 .. v16}, Lcom/google/android/gms/internal/ads/lb;-><init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZIZILjava/lang/String;)V

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    if-eqz v6, :cond_2

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/rm2;->n:Landroid/os/Bundle;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    :cond_2
    move-object/from16 v6, p3

    invoke-direct {v1, v2, v0, v6}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {v3, v4, v0, v5}, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;->loadAd(Lcom/google/android/gms/ads/mediation/e;Landroid/os/Bundle;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v2, ""

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_3
    instance-of v4, v3, Lcom/google/android/gms/ads/mediation/a;

    if-eqz v4, :cond_4

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/ob;->e:Lb/c/b/a/d/a;

    new-instance v5, Lcom/google/android/gms/internal/ads/sb;

    check-cast v3, Lcom/google/android/gms/ads/mediation/a;

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/ob;->d:Lcom/google/android/gms/internal/ads/ph;

    invoke-direct {v5, v3, v6}, Lcom/google/android/gms/internal/ads/sb;-><init>(Lcom/google/android/gms/ads/mediation/a;Lcom/google/android/gms/internal/ads/ph;)V

    invoke-virtual {v1, v4, v0, v2, v5}, Lcom/google/android/gms/internal/ads/ob;->a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V

    return-void

    :cond_4
    const-class v0, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-class v2, Lcom/google/android/gms/ads/mediation/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1a

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " or "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final a(Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/v;

    if-nez v1, :cond_0

    const-class p1, Lcom/google/android/gms/ads/mediation/v;

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x16

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " #009 Class mismatch: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    check-cast v0, Lcom/google/android/gms/ads/mediation/v;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/mediation/v;->onImmersiveModeUpdated(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a0()Lcom/google/android/gms/internal/ads/ed;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/a;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    check-cast v0, Lcom/google/android/gms/ads/mediation/a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/a;->getSDKVersionInfo()Lcom/google/android/gms/ads/mediation/x;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ed;->a(Lcom/google/android/gms/ads/mediation/x;)Lcom/google/android/gms/internal/ads/ed;

    throw v2
.end method

.method public final b(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/ob;->a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V

    return-void
.end method

.method public final c(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v3, v3, Lcom/google/android/gms/ads/mediation/a;

    if-eqz v3, :cond_0

    const-string v3, "Requesting rewarded interstitial ad from adapter."

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/ads/mediation/a;

    move-object/from16 v4, p4

    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/ads/ob;->a(Lcom/google/android/gms/internal/ads/xa;)Lcom/google/android/gms/ads/mediation/d;

    move-result-object v4

    new-instance v15, Lcom/google/android/gms/ads/mediation/p;

    invoke-static/range {p1 .. p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroid/content/Context;

    const-string v7, ""

    const/4 v5, 0x0

    invoke-direct {v1, v2, v0, v5}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v8

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/ob;->d(Lcom/google/android/gms/internal/ads/rm2;)Landroid/os/Bundle;

    move-result-object v9

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/ob;->c(Lcom/google/android/gms/internal/ads/rm2;)Z

    move-result v10

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/rm2;->l:Landroid/location/Location;

    iget v12, v0, Lcom/google/android/gms/internal/ads/rm2;->h:I

    iget v13, v0, Lcom/google/android/gms/internal/ads/rm2;->u:I

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/ob;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;)Ljava/lang/String;

    move-result-object v14

    const-string v0, ""

    move-object v5, v15

    move-object v2, v15

    move-object v15, v0

    invoke-direct/range {v5 .. v15}, Lcom/google/android/gms/ads/mediation/p;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v2, v4}, Lcom/google/android/gms/ads/mediation/a;->zza(Lcom/google/android/gms/ads/mediation/p;Lcom/google/android/gms/ads/mediation/d;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v2, ""

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_0
    const-class v0, Lcom/google/android/gms/ads/mediation/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final destroy()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/f;

    if-nez v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    check-cast v0, Lcom/google/android/gms/ads/mediation/f;

    invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/f;->onDestroy()V
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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v0, v0, Lcom/google/android/gms/ads/reward/mediation/InitializableMediationRewardedVideoAdAdapter;

    return v0
.end method

.method public final getInterstitialAdapterInfo()Landroid/os/Bundle;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzbgz;

    if-nez v1, :cond_0

    const-class v0, Lcom/google/android/gms/internal/ads/zzbgz;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x16

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0

    :cond_0
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbgz;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbgz;->getInterstitialAdapterInfo()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/ads/rp2;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/y;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    check-cast v0, Lcom/google/android/gms/ads/mediation/y;

    invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/y;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2
.end method

.method public final h(Lb/c/b/a/d/a;)V
    .locals 2

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/u;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/ads/mediation/u;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/mediation/u;->a(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public final h0()Lcom/google/android/gms/internal/ads/ed;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/a;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    check-cast v0, Lcom/google/android/gms/ads/mediation/a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/a;->getVersionInfo()Lcom/google/android/gms/ads/mediation/x;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ed;->a(Lcom/google/android/gms/ads/mediation/x;)Lcom/google/android/gms/internal/ads/ed;

    throw v2
.end method

.method public final isInitialized()Z
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    if-eqz v1, :cond_0

    const-string v0, "Check if adapter is initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    invoke-interface {v0}, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;->isInitialized()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_0
    instance-of v0, v0, Lcom/google/android/gms/ads/mediation/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->d:Lcom/google/android/gms/internal/ads/ph;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    const-class v0, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/ads/mediation/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1a

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " or "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final n1()Lcom/google/android/gms/internal/ads/ab;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->c:Lcom/google/android/gms/internal/ads/pb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pb;->a()Lcom/google/android/gms/ads/mediation/q;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/r;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/rb;

    check-cast v0, Lcom/google/android/gms/ads/mediation/r;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/rb;-><init>(Lcom/google/android/gms/ads/mediation/r;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/f;

    if-nez v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    check-cast v0, Lcom/google/android/gms/ads/mediation/f;

    invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/f;->onPause()V
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

.method public final showInterstitial()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v0, v0, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    if-eqz v0, :cond_0

    const-string v0, "Showing interstitial from adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;->showInterstitial()V
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

    :cond_0
    const-class v0, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x16

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final showVideo()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    if-eqz v1, :cond_0

    const-string v0, "Show rewarded video ad from adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    invoke-interface {v0}, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;->showVideo()V
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

    :cond_0
    instance-of v0, v0, Lcom/google/android/gms/ads/mediation/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->f:Lcom/google/android/gms/ads/mediation/o;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ob;->e:Lb/c/b/a/d/a;

    invoke-static {v1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/o;->a(Landroid/content/Context;)V

    return-void

    :cond_1
    const-string v0, "Can not show null mediated rewarded ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_2
    const-class v0, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/ads/mediation/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1a

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " or "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final z()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/f;

    if-nez v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    check-cast v0, Lcom/google/android/gms/ads/mediation/f;

    invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/f;->onResume()V
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

.method public final z0()Lcom/google/android/gms/internal/ads/s2;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->c:Lcom/google/android/gms/internal/ads/pb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pb;->c()Lcom/google/android/gms/ads/s/i;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/x2;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/ads/x2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/x2;->a()Lcom/google/android/gms/internal/ads/s2;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzti()Landroid/os/Bundle;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzbgx;

    if-nez v1, :cond_0

    const-class v0, Lcom/google/android/gms/internal/ads/zzbgx;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ob;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x16

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " #009 Class mismatch: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0

    :cond_0
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbgx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbgx;->zzti()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
