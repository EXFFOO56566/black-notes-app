.class final Lcom/google/android/gms/internal/ads/wi1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/internal/c$a;
.implements Lcom/google/android/gms/common/internal/c$b;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rj1;

.field private final b:Lcom/google/android/gms/internal/ads/mj1;

.field private final c:Ljava/lang/Object;

.field private d:Z

.field private e:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/internal/ads/mj1;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wi1;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/wi1;->d:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/wi1;->e:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/wi1;->b:Lcom/google/android/gms/internal/ads/mj1;

    new-instance p3, Lcom/google/android/gms/internal/ads/rj1;

    const v6, 0xc35000

    move-object v1, p3

    move-object v2, p1

    move-object v3, p2

    move-object v4, p0

    move-object v5, p0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/rj1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/c$a;Lcom/google/android/gms/common/internal/c$b;I)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/wi1;->a:Lcom/google/android/gms/internal/ads/rj1;

    return-void
.end method

.method private final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wi1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wi1;->a:Lcom/google/android/gms/internal/ads/rj1;

    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/c;->a()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wi1;->a:Lcom/google/android/gms/internal/ads/rj1;

    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/c;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wi1;->a:Lcom/google/android/gms/internal/ads/rj1;

    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/c;->i()V

    :cond_1
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


# virtual methods
.method final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wi1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/wi1;->d:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/wi1;->d:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wi1;->a:Lcom/google/android/gms/internal/ads/rj1;

    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/c;->m()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final a(Lb/c/b/a/c/b;)V
    .locals 0

    return-void
.end method

.method public final b(I)V
    .locals 0

    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wi1;->c:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/wi1;->e:Z

    if-eqz v0, :cond_0

    monitor-exit p1

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/wi1;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wi1;->a:Lcom/google/android/gms/internal/ads/rj1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rj1;->A()Lcom/google/android/gms/internal/ads/yj1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/pj1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/wi1;->b:Lcom/google/android/gms/internal/ads/mj1;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/tx1;->f()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/pj1;-><init>([B)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/yj1;->a(Lcom/google/android/gms/internal/ads/pj1;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :try_start_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/wi1;->b()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/wi1;->b()V

    throw v0

    :goto_0
    monitor-exit p1

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method
