.class final Lcom/google/android/gms/internal/ads/su0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "Lcom/google/android/gms/internal/ads/n00;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/nu0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/nu0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/su0;->a:Lcom/google/android/gms/internal/ads/nu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/k20;->b()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/su0;->a:Lcom/google/android/gms/internal/ads/nu0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/nu0;->a(Lcom/google/android/gms/internal/ads/nu0;)Lcom/google/android/gms/internal/ads/y50;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/gp0;->a(Ljava/lang/Throwable;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/y50;->a(I)V

    const-string v0, "DelayedBannerAd.onFailure"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ie1;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
