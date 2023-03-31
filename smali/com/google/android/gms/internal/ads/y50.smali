.class public final Lcom/google/android/gms/internal/ads/y50;
.super Lcom/google/android/gms/internal/ads/j90;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/a60;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/j90<",
        "Lcom/google/android/gms/internal/ads/a60;",
        ">;",
        "Lcom/google/android/gms/internal/ads/a60;"
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
            "Lcom/google/android/gms/internal/ads/a60;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/j90;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/w50;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/w50;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/j90;->a(Lcom/google/android/gms/internal/ads/l90;)V

    return-void
.end method
