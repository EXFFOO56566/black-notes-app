.class public final Lcom/google/android/gms/internal/ads/jj0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/oj0;

.field private final b:Lcom/google/android/gms/ads/internal/a;

.field private final c:Landroid/content/Context;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Lcom/google/android/gms/internal/ads/eq1;

.field private final f:Lcom/google/android/gms/internal/ads/fo;

.field private final g:Lcom/google/android/gms/internal/ads/j5;

.field private h:Lcom/google/android/gms/internal/ads/lo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/ws;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/uj0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/uj0;->a(Lcom/google/android/gms/internal/ads/uj0;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/uj0;->b(Lcom/google/android/gms/internal/ads/uj0;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->d:Ljava/util/concurrent/Executor;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/uj0;->c(Lcom/google/android/gms/internal/ads/uj0;)Lcom/google/android/gms/internal/ads/eq1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->e:Lcom/google/android/gms/internal/ads/eq1;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/uj0;->d(Lcom/google/android/gms/internal/ads/uj0;)Lcom/google/android/gms/internal/ads/fo;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->f:Lcom/google/android/gms/internal/ads/fo;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/uj0;->e(Lcom/google/android/gms/internal/ads/uj0;)Lcom/google/android/gms/ads/internal/a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->b:Lcom/google/android/gms/ads/internal/a;

    new-instance v0, Lcom/google/android/gms/internal/ads/oj0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/oj0;-><init>(Lcom/google/android/gms/internal/ads/kj0;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->a:Lcom/google/android/gms/internal/ads/oj0;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/uj0;->f(Lcom/google/android/gms/internal/ads/uj0;)Lcom/google/android/gms/internal/ads/et;

    new-instance p1, Lcom/google/android/gms/internal/ads/j5;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/j5;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jj0;->g:Lcom/google/android/gms/internal/ads/j5;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/jj0;)Lcom/google/android/gms/internal/ads/oj0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/jj0;->a:Lcom/google/android/gms/internal/ads/oj0;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;

    new-instance v1, Lcom/google/android/gms/internal/ads/lj0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/lj0;-><init>(Lcom/google/android/gms/internal/ads/jj0;Ljava/lang/String;Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jj0;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final synthetic a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/ws;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->g:Lcom/google/android/gms/internal/ads/j5;

    invoke-virtual {v0, p3, p1, p2}, Lcom/google/android/gms/internal/ads/j5;->a(Lcom/google/android/gms/internal/ads/c8;Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/ws;)Lcom/google/android/gms/internal/ads/ws;
    .locals 13

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->g:Lcom/google/android/gms/internal/ads/j5;

    const-string v1, "/result"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v2

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/jj0;->a:Lcom/google/android/gms/internal/ads/oj0;

    new-instance v10, Lcom/google/android/gms/ads/internal/c;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->c:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {v10, v0, v1, v1}, Lcom/google/android/gms/ads/internal/c;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/vi;Lcom/google/android/gms/internal/ads/nf;)V

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v4, v7

    move-object v5, v7

    move-object v6, v7

    invoke-interface/range {v2 .. v12}, Lcom/google/android/gms/internal/ads/ju;->a(Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/internal/ads/l4;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/internal/ads/n4;Lcom/google/android/gms/ads/internal/overlay/t;ZLcom/google/android/gms/internal/ads/g5;Lcom/google/android/gms/ads/internal/c;Lcom/google/android/gms/internal/ads/vd;Lcom/google/android/gms/internal/ads/vi;)V

    return-object p1
.end method

.method public final declared-synchronized a()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;

    new-instance v1, Lcom/google/android/gms/internal/ads/kj0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/kj0;-><init>(Lcom/google/android/gms/internal/ads/jj0;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/jj0;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/d5<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;

    new-instance v1, Lcom/google/android/gms/internal/ads/nj0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/nj0;-><init>(Lcom/google/android/gms/internal/ads/jj0;Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jj0;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;

    new-instance v1, Lcom/google/android/gms/internal/ads/pj0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/pj0;-><init>(Lcom/google/android/gms/internal/ads/jj0;Ljava/lang/String;Ljava/util/Map;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jj0;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/ref/WeakReference<",
            "TT;>;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/d5<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v6, Lcom/google/android/gms/internal/ads/tj0;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/tj0;-><init>(Lcom/google/android/gms/internal/ads/jj0;Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;Lcom/google/android/gms/internal/ads/kj0;)V

    invoke-virtual {p0, p2, v6}, Lcom/google/android/gms/internal/ads/jj0;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    return-void
.end method

.method public final declared-synchronized b()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/jj0;->f:Lcom/google/android/gms/internal/ads/fo;

    sget-object v2, Lcom/google/android/gms/internal/ads/zr2;->s1:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/jj0;->e:Lcom/google/android/gms/internal/ads/eq1;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/jj0;->b:Lcom/google/android/gms/ads/internal/a;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/et;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Ljava/lang/String;Lcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/ads/internal/a;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/ij0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/ij0;-><init>(Lcom/google/android/gms/internal/ads/jj0;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/jj0;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/xk1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;

    const-string v1, "NativeJavascriptExecutor.initializeEngine"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/no;->a(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/d5<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jj0;->h:Lcom/google/android/gms/internal/ads/lo1;

    new-instance v1, Lcom/google/android/gms/internal/ads/mj0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/mj0;-><init>(Lcom/google/android/gms/internal/ads/jj0;Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jj0;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
