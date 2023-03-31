.class final Lcom/google/android/gms/internal/ads/ky0;
.super Lcom/google/android/gms/internal/ads/r00;
.source ""


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/fy0;Landroid/view/View;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/l20;Lcom/google/android/gms/internal/ads/hd1;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1, p4, p5}, Lcom/google/android/gms/internal/ads/r00;-><init>(Landroid/view/View;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/l20;Lcom/google/android/gms/internal/ads/hd1;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Lcom/google/android/gms/internal/ads/g70;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/internal/ads/ab0<",
            "Lcom/google/android/gms/internal/ads/l70;",
            ">;>;)",
            "Lcom/google/android/gms/internal/ads/g70;"
        }
    .end annotation

    new-instance p1, Lcom/google/android/gms/internal/ads/g70;

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/g70;-><init>(Ljava/util/Set;)V

    return-object p1
.end method
