.class final Lcom/google/android/gms/internal/ads/v4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/d5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/d5<",
        "Lcom/google/android/gms/internal/ads/ws;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->r()Lcom/google/android/gms/internal/ads/pi2;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->r()Lcom/google/android/gms/internal/ads/pi2;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/pi2;->v0()V

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->M()Lcom/google/android/gms/ads/internal/overlay/c;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/ads/internal/overlay/c;->b2()V

    return-void

    :cond_1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->q()Lcom/google/android/gms/ads/internal/overlay/c;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/overlay/c;->b2()V

    return-void

    :cond_2
    const-string p1, "A GMSG tried to close something that wasn\'t an overlay."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    return-void
.end method
