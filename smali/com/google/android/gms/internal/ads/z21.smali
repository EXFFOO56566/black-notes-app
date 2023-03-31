.class public final Lcom/google/android/gms/internal/ads/z21;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/y61;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/y61<",
        "Lcom/google/android/gms/internal/ads/w21;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/z21;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/z21;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/lo1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/w21;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->e3:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ro;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/ads/y21;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/y21;-><init>(Lcom/google/android/gms/internal/ads/ro;)V

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/uk1;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const-string v2, "ArCoreApk is not ready."

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ro;->b(Ljava/lang/Object;)Z

    :goto_0
    const-wide/16 v1, 0xc8

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/z21;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/b31;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/b31;-><init>(Lcom/google/android/gms/internal/ads/z21;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/z21;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    const-class v1, Ljava/lang/Throwable;

    sget-object v2, Lcom/google/android/gms/internal/ads/a31;->a:Lcom/google/android/gms/internal/ads/ln1;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/z21;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0
.end method
