.class public final Lcom/google/android/gms/internal/ads/c60;
.super Lcom/google/android/gms/internal/ads/j90;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/z50;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/j90<",
        "Lcom/google/android/gms/internal/ads/z50;",
        ">;",
        "Lcom/google/android/gms/internal/ads/z50;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/g60;Ljava/util/Set;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/g60;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/internal/ads/ab0<",
            "Lcom/google/android/gms/internal/ads/z50;",
            ">;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/j90;-><init>(Ljava/util/Set;)V

    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/ads/j90;->a(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method public final O()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/d60;->a:Lcom/google/android/gms/internal/ads/l90;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/j90;->a(Lcom/google/android/gms/internal/ads/l90;)V

    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/b60;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/b60;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/j90;->a(Lcom/google/android/gms/internal/ads/l90;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/hd0;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/e60;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/e60;-><init>(Lcom/google/android/gms/internal/ads/hd0;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/j90;->a(Lcom/google/android/gms/internal/ads/l90;)V

    return-void
.end method
