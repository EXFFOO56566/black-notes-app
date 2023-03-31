.class final Lb/c/b/a/h/u;
.super Lb/c/b/a/h/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Lb/c/b/a/h/f<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lb/c/b/a/h/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/c/b/a/h/s<",
            "TTResult;>;"
        }
    .end annotation
.end field

.field private c:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private volatile d:Z

.field private e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTResult;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private f:Ljava/lang/Exception;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb/c/b/a/h/f;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lb/c/b/a/h/u;->a:Ljava/lang/Object;

    new-instance v0, Lb/c/b/a/h/s;

    invoke-direct {v0}, Lb/c/b/a/h/s;-><init>()V

    iput-object v0, p0, Lb/c/b/a/h/u;->b:Lb/c/b/a/h/s;

    return-void
.end method

.method private final g()V
    .locals 2
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean v0, p0, Lb/c/b/a/h/u;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/r;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method private final h()V
    .locals 2
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean v0, p0, Lb/c/b/a/h/u;->c:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Task is already complete"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/r;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method private final i()V
    .locals 2
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean v0, p0, Lb/c/b/a/h/u;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task is already canceled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final j()V
    .locals 2

    iget-object v0, p0, Lb/c/b/a/h/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb/c/b/a/h/u;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lb/c/b/a/h/u;->b:Lb/c/b/a/h/s;

    invoke-virtual {v0, p0}, Lb/c/b/a/h/s;->a(Lb/c/b/a/h/f;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Lb/c/b/a/h/c;)Lb/c/b/a/h/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/c/b/a/h/c;",
            ")",
            "Lb/c/b/a/h/f<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lb/c/b/a/h/h;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lb/c/b/a/h/u;->a(Ljava/util/concurrent/Executor;Lb/c/b/a/h/c;)Lb/c/b/a/h/f;

    return-object p0
.end method

.method public final a(Ljava/util/concurrent/Executor;Lb/c/b/a/h/a;)Lb/c/b/a/h/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lb/c/b/a/h/a<",
            "TTResult;TTContinuationResult;>;)",
            "Lb/c/b/a/h/f<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lb/c/b/a/h/u;

    invoke-direct {v0}, Lb/c/b/a/h/u;-><init>()V

    iget-object v1, p0, Lb/c/b/a/h/u;->b:Lb/c/b/a/h/s;

    new-instance v2, Lb/c/b/a/h/j;

    invoke-direct {v2, p1, p2, v0}, Lb/c/b/a/h/j;-><init>(Ljava/util/concurrent/Executor;Lb/c/b/a/h/a;Lb/c/b/a/h/u;)V

    invoke-virtual {v1, v2}, Lb/c/b/a/h/s;->a(Lb/c/b/a/h/r;)V

    invoke-direct {p0}, Lb/c/b/a/h/u;->j()V

    return-object v0
.end method

.method public final a(Ljava/util/concurrent/Executor;Lb/c/b/a/h/b;)Lb/c/b/a/h/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lb/c/b/a/h/b;",
            ")",
            "Lb/c/b/a/h/f<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lb/c/b/a/h/u;->b:Lb/c/b/a/h/s;

    new-instance v1, Lb/c/b/a/h/l;

    invoke-direct {v1, p1, p2}, Lb/c/b/a/h/l;-><init>(Ljava/util/concurrent/Executor;Lb/c/b/a/h/b;)V

    invoke-virtual {v0, v1}, Lb/c/b/a/h/s;->a(Lb/c/b/a/h/r;)V

    invoke-direct {p0}, Lb/c/b/a/h/u;->j()V

    return-object p0
.end method

.method public final a(Ljava/util/concurrent/Executor;Lb/c/b/a/h/c;)Lb/c/b/a/h/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lb/c/b/a/h/c;",
            ")",
            "Lb/c/b/a/h/f<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lb/c/b/a/h/u;->b:Lb/c/b/a/h/s;

    new-instance v1, Lb/c/b/a/h/n;

    invoke-direct {v1, p1, p2}, Lb/c/b/a/h/n;-><init>(Ljava/util/concurrent/Executor;Lb/c/b/a/h/c;)V

    invoke-virtual {v0, v1}, Lb/c/b/a/h/s;->a(Lb/c/b/a/h/r;)V

    invoke-direct {p0}, Lb/c/b/a/h/u;->j()V

    return-object p0
.end method

.method public final a(Ljava/util/concurrent/Executor;Lb/c/b/a/h/d;)Lb/c/b/a/h/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lb/c/b/a/h/d<",
            "-TTResult;>;)",
            "Lb/c/b/a/h/f<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lb/c/b/a/h/u;->b:Lb/c/b/a/h/s;

    new-instance v1, Lb/c/b/a/h/p;

    invoke-direct {v1, p1, p2}, Lb/c/b/a/h/p;-><init>(Ljava/util/concurrent/Executor;Lb/c/b/a/h/d;)V

    invoke-virtual {v0, v1}, Lb/c/b/a/h/s;->a(Lb/c/b/a/h/r;)V

    invoke-direct {p0}, Lb/c/b/a/h/u;->j()V

    return-object p0
.end method

.method public final a()Ljava/lang/Exception;
    .locals 2

    iget-object v0, p0, Lb/c/b/a/h/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb/c/b/a/h/u;->f:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb/c/b/a/h/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lb/c/b/a/h/u;->h()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lb/c/b/a/h/u;->c:Z

    iput-object p1, p0, Lb/c/b/a/h/u;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lb/c/b/a/h/u;->b:Lb/c/b/a/h/s;

    invoke-virtual {p1, p0}, Lb/c/b/a/h/s;->a(Lb/c/b/a/h/f;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lb/c/b/a/h/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lb/c/b/a/h/u;->h()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lb/c/b/a/h/u;->c:Z

    iput-object p1, p0, Lb/c/b/a/h/u;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lb/c/b/a/h/u;->b:Lb/c/b/a/h/s;

    invoke-virtual {p1, p0}, Lb/c/b/a/h/s;->a(Lb/c/b/a/h/f;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    iget-object v0, p0, Lb/c/b/a/h/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lb/c/b/a/h/u;->g()V

    invoke-direct {p0}, Lb/c/b/a/h/u;->i()V

    iget-object v1, p0, Lb/c/b/a/h/u;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    iget-object v1, p0, Lb/c/b/a/h/u;->e:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Lb/c/b/a/h/e;

    iget-object v2, p0, Lb/c/b/a/h/u;->f:Ljava/lang/Exception;

    invoke-direct {v1, v2}, Lb/c/b/a/h/e;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final b(Ljava/lang/Exception;)Z
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb/c/b/a/h/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb/c/b/a/h/u;->c:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lb/c/b/a/h/u;->c:Z

    iput-object p1, p0, Lb/c/b/a/h/u;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lb/c/b/a/h/u;->b:Lb/c/b/a/h/s;

    invoke-virtual {p1, p0}, Lb/c/b/a/h/s;->a(Lb/c/b/a/h/f;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lb/c/b/a/h/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb/c/b/a/h/u;->c:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lb/c/b/a/h/u;->c:Z

    iput-object p1, p0, Lb/c/b/a/h/u;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lb/c/b/a/h/u;->b:Lb/c/b/a/h/s;

    invoke-virtual {p1, p0}, Lb/c/b/a/h/s;->a(Lb/c/b/a/h/f;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lb/c/b/a/h/u;->d:Z

    return v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lb/c/b/a/h/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb/c/b/a/h/u;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, Lb/c/b/a/h/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb/c/b/a/h/u;->c:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lb/c/b/a/h/u;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lb/c/b/a/h/u;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, Lb/c/b/a/h/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb/c/b/a/h/u;->c:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    monitor-exit v0

    return v1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lb/c/b/a/h/u;->c:Z

    iput-boolean v1, p0, Lb/c/b/a/h/u;->d:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lb/c/b/a/h/u;->b:Lb/c/b/a/h/s;

    invoke-virtual {v0, p0}, Lb/c/b/a/h/s;->a(Lb/c/b/a/h/f;)V

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
