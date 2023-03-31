.class public final Lcom/google/android/gms/internal/ads/no1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/util/concurrent/ExecutorService;)Lcom/google/android/gms/internal/ads/ko1;
    .locals 1

    instance-of v0, p0, Lcom/google/android/gms/internal/ads/ko1;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/ads/ko1;

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/ro1;

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/ro1;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/oo1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/oo1;-><init>(Ljava/util/concurrent/ExecutorService;)V

    return-object v0
.end method

.method public static a()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/rn1;->b:Lcom/google/android/gms/internal/ads/rn1;

    return-object v0
.end method

.method static a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/xm1;)Ljava/util/concurrent/Executor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/internal/ads/xm1<",
            "*>;)",
            "Ljava/util/concurrent/Executor;"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/jl1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/jl1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ads/rn1;->b:Lcom/google/android/gms/internal/ads/rn1;

    if-ne p0, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/mo1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/mo1;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/xm1;)V

    return-object v0
.end method
