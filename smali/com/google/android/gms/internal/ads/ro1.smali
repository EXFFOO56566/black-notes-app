.class final Lcom/google/android/gms/internal/ads/ro1;
.super Lcom/google/android/gms/internal/ads/oo1;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ko1;
.implements Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field private final c:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/oo1;-><init>(Ljava/util/concurrent/ExecutorService;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/jl1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ro1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method


# virtual methods
.method public final synthetic schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zo1;->a(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zo1;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ro1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/internal/ads/qo1;

    invoke-direct {p3, p1, p2}, Lcom/google/android/gms/internal/ads/qo1;-><init>(Lcom/google/android/gms/internal/ads/lo1;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p3
.end method

.method public final synthetic schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zo1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zo1;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ro1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/internal/ads/qo1;

    invoke-direct {p3, p1, p2}, Lcom/google/android/gms/internal/ads/qo1;-><init>(Lcom/google/android/gms/internal/ads/lo1;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p3
.end method

.method public final synthetic scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    new-instance v7, Lcom/google/android/gms/internal/ads/to1;

    invoke-direct {v7, p1}, Lcom/google/android/gms/internal/ads/to1;-><init>(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ro1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v1, v7

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/qo1;

    invoke-direct {p2, v7, p1}, Lcom/google/android/gms/internal/ads/qo1;-><init>(Lcom/google/android/gms/internal/ads/lo1;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p2
.end method

.method public final synthetic scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    new-instance v7, Lcom/google/android/gms/internal/ads/to1;

    invoke-direct {v7, p1}, Lcom/google/android/gms/internal/ads/to1;-><init>(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ro1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v1, v7

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/qo1;

    invoke-direct {p2, v7, p1}, Lcom/google/android/gms/internal/ads/qo1;-><init>(Lcom/google/android/gms/internal/ads/lo1;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p2
.end method
