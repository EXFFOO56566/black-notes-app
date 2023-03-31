.class public final Lcom/google/android/gms/internal/ads/w30;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/ab0<",
        "Lcom/google/android/gms/internal/ads/m80;",
        ">;>;"
    }
.end annotation


# direct methods
.method public static a(Lcom/google/android/gms/internal/ads/s30;Lcom/google/android/gms/internal/ads/y30;)Lcom/google/android/gms/internal/ads/ab0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/s30;",
            "Lcom/google/android/gms/internal/ads/y30;",
            ")",
            "Lcom/google/android/gms/internal/ads/ab0<",
            "Lcom/google/android/gms/internal/ads/m80;",
            ">;"
        }
    .end annotation

    new-instance p0, Lcom/google/android/gms/internal/ads/ab0;

    sget-object v0, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/ab0;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Lcom/google/android/gms/internal/ads/ab0;

    return-object p0
.end method
