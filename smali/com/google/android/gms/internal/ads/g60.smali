.class public final Lcom/google/android/gms/internal/ads/g60;
.super Lcom/google/android/gms/internal/ads/j90;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/z50;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/j90<",
        "Lcom/google/android/gms/internal/ads/j60;",
        ">;",
        "Lcom/google/android/gms/internal/ads/z50;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/internal/ads/ab0<",
            "Lcom/google/android/gms/internal/ads/j60;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/j90;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final O()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/i60;->a:Lcom/google/android/gms/internal/ads/l90;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/j90;->a(Lcom/google/android/gms/internal/ads/l90;)V

    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 0

    new-instance p2, Lcom/google/android/gms/internal/ads/f60;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/f60;-><init>(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/j90;->a(Lcom/google/android/gms/internal/ads/l90;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/hd0;)V
    .locals 0

    return-void
.end method
