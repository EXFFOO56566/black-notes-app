.class public final Lcom/google/android/gms/internal/ads/tq0;
.super Lcom/google/android/gms/internal/ads/qq0;
.source ""


# instance fields
.field private g:Ljava/lang/String;

.field private h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qq0;-><init>()V

    sget v0, Lcom/google/android/gms/internal/ads/zq0;->a:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/tq0;->h:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->q()Lcom/google/android/gms/internal/ads/dn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dn;->b()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/gf;

    invoke-direct {v1, p1, v0, p0, p0}, Lcom/google/android/gms/internal/ads/gf;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/c$a;Lcom/google/android/gms/common/internal/c$b;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/qq0;->f:Lcom/google/android/gms/internal/ads/gf;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zf;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qq0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/tq0;->h:I

    sget v2, Lcom/google/android/gms/internal/ads/zq0;->a:I

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    iget v1, p0, Lcom/google/android/gms/internal/ads/tq0;->h:I

    sget v2, Lcom/google/android/gms/internal/ads/zq0;->b:I

    if-eq v1, v2, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/ar0;

    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/ads/ar0;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/qq0;->c:Z

    if-eqz v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qq0;->a:Lcom/google/android/gms/internal/ads/ro;

    monitor-exit v0

    return-object p1

    :cond_1
    sget v1, Lcom/google/android/gms/internal/ads/zq0;->b:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/tq0;->h:I

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/qq0;->c:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qq0;->e:Lcom/google/android/gms/internal/ads/zf;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qq0;->f:Lcom/google/android/gms/internal/ads/gf;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/c;->m()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qq0;->a:Lcom/google/android/gms/internal/ads/ro;

    new-instance v1, Lcom/google/android/gms/internal/ads/wq0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/wq0;-><init>(Lcom/google/android/gms/internal/ads/tq0;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qq0;->a:Lcom/google/android/gms/internal/ads/ro;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qq0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/tq0;->h:I

    sget v2, Lcom/google/android/gms/internal/ads/zq0;->a:I

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    iget v1, p0, Lcom/google/android/gms/internal/ads/tq0;->h:I

    sget v2, Lcom/google/android/gms/internal/ads/zq0;->c:I

    if-eq v1, v2, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/ar0;

    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/ads/ar0;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/qq0;->c:Z

    if-eqz v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qq0;->a:Lcom/google/android/gms/internal/ads/ro;

    monitor-exit v0

    return-object p1

    :cond_1
    sget v1, Lcom/google/android/gms/internal/ads/zq0;->c:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/tq0;->h:I

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/qq0;->c:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tq0;->g:Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qq0;->f:Lcom/google/android/gms/internal/ads/gf;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/c;->m()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qq0;->a:Lcom/google/android/gms/internal/ads/ro;

    new-instance v1, Lcom/google/android/gms/internal/ads/vq0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/vq0;-><init>(Lcom/google/android/gms/internal/ads/tq0;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qq0;->a:Lcom/google/android/gms/internal/ads/ro;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Lb/c/b/a/c/b;)V
    .locals 2

    const-string p1, "Cannot connect to remote service, fallback to local instance."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qq0;->a:Lcom/google/android/gms/internal/ads/ro;

    new-instance v0, Lcom/google/android/gms/internal/ads/ar0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/ar0;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qq0;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qq0;->d:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/qq0;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v0, 0x0

    :try_start_1
    iget v1, p0, Lcom/google/android/gms/internal/ads/tq0;->h:I

    sget v2, Lcom/google/android/gms/internal/ads/zq0;->b:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qq0;->f:Lcom/google/android/gms/internal/ads/gf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gf;->A()Lcom/google/android/gms/internal/ads/qf;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qq0;->e:Lcom/google/android/gms/internal/ads/zf;

    new-instance v3, Lcom/google/android/gms/internal/ads/pq0;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ads/pq0;-><init>(Lcom/google/android/gms/internal/ads/qq0;)V

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/ads/qf;->b(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/tf;)V

    goto :goto_1

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/tq0;->h:I

    sget v2, Lcom/google/android/gms/internal/ads/zq0;->c:I

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qq0;->f:Lcom/google/android/gms/internal/ads/gf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gf;->A()Lcom/google/android/gms/internal/ads/qf;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tq0;->g:Ljava/lang/String;

    new-instance v3, Lcom/google/android/gms/internal/ads/pq0;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ads/pq0;-><init>(Lcom/google/android/gms/internal/ads/qq0;)V

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/ads/qf;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/tf;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qq0;->a:Lcom/google/android/gms/internal/ads/ro;

    new-instance v2, Lcom/google/android/gms/internal/ads/ar0;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/ar0;-><init>(I)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object v2

    const-string v3, "RemoteUrlAndCacheKeyClientTask.onConnected"

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/ads/ik;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qq0;->a:Lcom/google/android/gms/internal/ads/ro;

    new-instance v2, Lcom/google/android/gms/internal/ads/ar0;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/ar0;-><init>(I)V

    :goto_0
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    goto :goto_1

    :catch_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qq0;->a:Lcom/google/android/gms/internal/ads/ro;

    new-instance v2, Lcom/google/android/gms/internal/ads/ar0;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/ar0;-><init>(I)V

    goto :goto_0

    :cond_2
    :goto_1
    monitor-exit p1

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method
