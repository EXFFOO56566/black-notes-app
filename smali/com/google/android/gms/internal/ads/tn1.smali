.class public Lcom/google/android/gms/internal/ads/tn1;
.super Lcom/google/android/gms/internal/ads/do1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/ads/do1<",
        "TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/do1;-><init>()V

    return-void
.end method

.method public static b(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/tn1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TV;>;)",
            "Lcom/google/android/gms/internal/ads/tn1<",
            "TV;>;"
        }
    .end annotation

    instance-of v0, p0, Lcom/google/android/gms/internal/ads/tn1;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/ads/tn1;

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/vn1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/vn1;-><init>(Lcom/google/android/gms/internal/ads/lo1;)V

    return-object v0
.end method


# virtual methods
.method public final a(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/tn1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ")",
            "Lcom/google/android/gms/internal/ads/tn1<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/tn1;

    return-object p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ln1<",
            "-TV;TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/internal/ads/tn1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/jl1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/dn1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/dn1;-><init>(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;)V

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/no1;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/xm1;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/google/android/gms/internal/ads/lo1;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/xk1<",
            "-TV;TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/internal/ads/tn1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/jl1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/cn1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/cn1;-><init>(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/xk1;)V

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/no1;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/xm1;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/google/android/gms/internal/ads/lo1;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public final a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lcom/google/android/gms/internal/ads/xk1<",
            "-TX;+TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/internal/ads/tn1<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/ym1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/ym1;-><init>(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/xk1;)V

    invoke-static {p3, v0}, Lcom/google/android/gms/internal/ads/no1;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/xm1;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/google/android/gms/internal/ads/lo1;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
