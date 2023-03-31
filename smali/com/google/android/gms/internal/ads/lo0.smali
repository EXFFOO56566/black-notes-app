.class public final Lcom/google/android/gms/internal/ads/lo0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Ljava/util/Set<",
        "Lcom/google/android/gms/internal/ads/ab0<",
        "Lcom/google/android/gms/internal/ads/m80;",
        ">;>;>;"
    }
.end annotation


# direct methods
.method public static a(Lcom/google/android/gms/internal/ads/io0;Lcom/google/android/gms/internal/ads/so0;Ljava/util/concurrent/Executor;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/io0;",
            "Lcom/google/android/gms/internal/ads/so0;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/internal/ads/ab0<",
            "Lcom/google/android/gms/internal/ads/m80;",
            ">;>;"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/io0;->i(Lcom/google/android/gms/internal/ads/so0;Ljava/util/concurrent/Executor;)Ljava/util/Set;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method
