.class public final Lcom/google/android/gms/internal/ads/zi2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/lang/Runnable;

.field private final b:Ljava/lang/Object;

.field private c:Lcom/google/android/gms/internal/ads/jj2;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private d:Landroid/content/Context;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private e:Lcom/google/android/gms/internal/ads/nj2;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/dj2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/dj2;-><init>(Lcom/google/android/gms/internal/ads/zi2;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zi2;->a:Ljava/lang/Runnable;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zi2;->b:Ljava/lang/Object;

    return-void
.end method

.method private final declared-synchronized a(Lcom/google/android/gms/common/internal/c$a;Lcom/google/android/gms/common/internal/c$b;)Lcom/google/android/gms/internal/ads/jj2;
    .locals 3

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/jj2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->d:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->q()Lcom/google/android/gms/internal/ads/dn;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/dn;->b()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/google/android/gms/internal/ads/jj2;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/c$a;Lcom/google/android/gms/common/internal/c$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/zi2;Lcom/google/android/gms/internal/ads/jj2;)Lcom/google/android/gms/internal/ads/jj2;
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zi2;->c:Lcom/google/android/gms/internal/ads/jj2;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/zi2;Lcom/google/android/gms/internal/ads/nj2;)Lcom/google/android/gms/internal/ads/nj2;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zi2;->e:Lcom/google/android/gms/internal/ads/nj2;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/zi2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zi2;->c()V

    return-void
.end method

.method private final b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zi2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->d:Landroid/content/Context;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->c:Lcom/google/android/gms/internal/ads/jj2;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/fj2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/fj2;-><init>(Lcom/google/android/gms/internal/ads/zi2;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/ej2;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/ej2;-><init>(Lcom/google/android/gms/internal/ads/zi2;)V

    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/ads/zi2;->a(Lcom/google/android/gms/common/internal/c$a;Lcom/google/android/gms/common/internal/c$b;)Lcom/google/android/gms/internal/ads/jj2;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->c:Lcom/google/android/gms/internal/ads/jj2;

    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/c;->m()V

    monitor-exit v0

    return-void

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/zi2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zi2;->b()V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/zi2;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zi2;->b:Ljava/lang/Object;

    return-object p0
.end method

.method private final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zi2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->c:Lcom/google/android/gms/internal/ads/jj2;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->c:Lcom/google/android/gms/internal/ads/jj2;

    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/c;->a()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->c:Lcom/google/android/gms/internal/ads/jj2;

    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/c;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->c:Lcom/google/android/gms/internal/ads/jj2;

    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/c;->i()V

    :cond_2
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->c:Lcom/google/android/gms/internal/ads/jj2;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->e:Lcom/google/android/gms/internal/ads/nj2;

    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ads/zi2;)Lcom/google/android/gms/internal/ads/jj2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zi2;->c:Lcom/google/android/gms/internal/ads/jj2;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/ij2;)Lcom/google/android/gms/internal/ads/hj2;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zi2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->e:Lcom/google/android/gms/internal/ads/nj2;

    if-nez v1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/hj2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/hj2;-><init>()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->e:Lcom/google/android/gms/internal/ads/nj2;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/nj2;->a(Lcom/google/android/gms/internal/ads/ij2;)Lcom/google/android/gms/internal/ads/hj2;

    move-result-object p1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "Unable to call into cache service."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/hj2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/hj2;-><init>()V

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final a()V
    .locals 5

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->K1:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zi2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zi2;->b()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    sget-object v1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zi2;->a:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    sget-object v1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zi2;->a:Ljava/lang/Runnable;

    sget-object v3, Lcom/google/android/gms/internal/ads/zr2;->L1:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    return-void
.end method

.method public final a(Landroid/content/Context;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zi2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zi2;->d:Landroid/content/Context;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zi2;->d:Landroid/content/Context;

    sget-object p1, Lcom/google/android/gms/internal/ads/zr2;->J1:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zi2;->b()V

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/ads/zr2;->I1:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lcom/google/android/gms/internal/ads/bj2;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/bj2;-><init>(Lcom/google/android/gms/internal/ads/zi2;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->f()Lcom/google/android/gms/internal/ads/sh2;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/sh2;->a(Lcom/google/android/gms/internal/ads/xh2;)V

    :cond_3
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
