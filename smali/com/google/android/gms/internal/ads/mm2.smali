.class public final Lcom/google/android/gms/internal/ads/mm2;
.super Lb/c/b/a/d/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/c/b/a/d/c<",
        "Lcom/google/android/gms/internal/ads/co2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.AdLoaderBuilderCreatorImpl"

    invoke-direct {p0, v0}, Lb/c/b/a/d/c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;)Lcom/google/android/gms/internal/ads/xn2;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-virtual {p0, p1}, Lb/c/b/a/d/c;->a(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/co2;

    const v2, 0xbfb13e0

    invoke-interface {p1, v1, p2, p3, v2}, Lcom/google/android/gms/internal/ads/co2;->a(Lb/c/b/a/d/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;I)Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string p2, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p3, p2, Lcom/google/android/gms/internal/ads/xn2;

    if-eqz p3, :cond_1

    check-cast p2, Lcom/google/android/gms/internal/ads/xn2;

    return-object p2

    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/ads/zn2;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zn2;-><init>(Landroid/os/IBinder;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lb/c/b/a/d/c$a; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    const-string p2, "Could not create remote builder for AdLoader."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method protected final synthetic a(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/co2;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/ads/co2;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/bo2;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/bo2;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
