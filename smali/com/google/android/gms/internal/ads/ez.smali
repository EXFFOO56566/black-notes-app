.class public final Lcom/google/android/gms/internal/ads/ez;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/o;
.implements Lcom/google/android/gms/internal/ads/n60;
.implements Lcom/google/android/gms/internal/ads/q60;
.implements Lcom/google/android/gms/internal/ads/fh2;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/vy;

.field private final c:Lcom/google/android/gms/internal/ads/cz;

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/internal/ads/ws;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/android/gms/internal/ads/da;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/da<",
            "Lorg/json/JSONObject;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/concurrent/Executor;

.field private final g:Lcom/google/android/gms/common/util/d;

.field private final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final i:Lcom/google/android/gms/internal/ads/gz;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private j:Z

.field private k:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/v9;Lcom/google/android/gms/internal/ads/cz;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/vy;Lcom/google/android/gms/common/util/d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->d:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lcom/google/android/gms/internal/ads/gz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/gz;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->i:Lcom/google/android/gms/internal/ads/gz;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/ez;->j:Z

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->k:Ljava/lang/ref/WeakReference;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/ez;->b:Lcom/google/android/gms/internal/ads/vy;

    sget-object p4, Lcom/google/android/gms/internal/ads/l9;->b:Lcom/google/android/gms/internal/ads/m9;

    const-string v0, "google.afma.activeView.handleUpdate"

    invoke-virtual {p1, v0, p4, p4}, Lcom/google/android/gms/internal/ads/v9;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/j9;Lcom/google/android/gms/internal/ads/k9;)Lcom/google/android/gms/internal/ads/da;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ez;->e:Lcom/google/android/gms/internal/ads/da;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ez;->c:Lcom/google/android/gms/internal/ads/cz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ez;->f:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/ez;->g:Lcom/google/android/gms/common/util/d;

    return-void
.end method

.method private final s()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/ws;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ez;->b:Lcom/google/android/gms/internal/ads/vy;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/vy;->b(Lcom/google/android/gms/internal/ads/ws;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->b:Lcom/google/android/gms/internal/ads/vy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/vy;->a()V

    return-void
.end method


# virtual methods
.method public final I()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized K()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->b:Lcom/google/android/gms/internal/ads/vy;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/vy;->a(Lcom/google/android/gms/internal/ads/ez;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ez;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ez;->i:Lcom/google/android/gms/internal/ads/gz;

    const-string v0, "u"

    iput-object v0, p1, Lcom/google/android/gms/internal/ads/gz;->d:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ez;->j()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ez;->s()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/ez;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/hh2;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->i:Lcom/google/android/gms/internal/ads/gz;

    iget-boolean v1, p1, Lcom/google/android/gms/internal/ads/hh2;->j:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/gz;->a:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->i:Lcom/google/android/gms/internal/ads/gz;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/gz;->e:Lcom/google/android/gms/internal/ads/hh2;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ez;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/ws;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->b:Lcom/google/android/gms/internal/ads/vy;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/vy;->a(Lcom/google/android/gms/internal/ads/ws;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->k:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final declared-synchronized b(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ez;->i:Lcom/google/android/gms/internal/ads/gz;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/google/android/gms/internal/ads/gz;->b:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ez;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized d(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ez;->i:Lcom/google/android/gms/internal/ads/gz;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/google/android/gms/internal/ads/gz;->b:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ez;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized j()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ez;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ez;->j:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->i:Lcom/google/android/gms/internal/ads/gz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ez;->g:Lcom/google/android/gms/common/util/d;

    invoke-interface {v1}, Lcom/google/android/gms/common/util/d;->b()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/gz;->c:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->c:Lcom/google/android/gms/internal/ads/cz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ez;->i:Lcom/google/android/gms/internal/ads/gz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/cz;->a(Lcom/google/android/gms/internal/ads/gz;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ez;->d:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/ws;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ez;->f:Ljava/util/concurrent/Executor;

    new-instance v4, Lcom/google/android/gms/internal/ads/dz;

    invoke-direct {v4, v2, v0}, Lcom/google/android/gms/internal/ads/dz;-><init>(Lcom/google/android/gms/internal/ads/ws;Lorg/json/JSONObject;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ez;->e:Lcom/google/android/gms/internal/ads/da;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/da;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    const-string v1, "ActiveViewListener.callActiveViewJs"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/no;->b(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_3
    const-string v1, "Failed to call ActiveViewJS"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized l()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ez;->s()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ez;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized onPause()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->i:Lcom/google/android/gms/internal/ads/gz;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/gz;->b:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ez;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized onResume()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ez;->i:Lcom/google/android/gms/internal/ads/gz;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/gz;->b:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ez;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final p()V
    .locals 0

    return-void
.end method
