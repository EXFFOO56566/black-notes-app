.class public final Lcom/google/android/gms/internal/ads/zz0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/d01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/d01<",
            "Lcom/google/android/gms/internal/ads/k20;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;

.field private c:Lcom/google/android/gms/internal/ads/mp2;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private d:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/d01;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/d01<",
            "Lcom/google/android/gms/internal/ads/k20;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zz0;->a:Lcom/google/android/gms/internal/ads/d01;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zz0;->b:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/zz0;Lcom/google/android/gms/internal/ads/mp2;)Lcom/google/android/gms/internal/ads/mp2;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zz0;->c:Lcom/google/android/gms/internal/ads/mp2;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/zz0;Z)Z
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zz0;->d:Z

    return p1
.end method


# virtual methods
.method public final declared-synchronized a()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zz0;->c:Lcom/google/android/gms/internal/ads/mp2;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zz0;->c:Lcom/google/android/gms/internal/ads/mp2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/mp2;->a()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "#007 Could not call remote method."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/rm2;I)V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zz0;->c:Lcom/google/android/gms/internal/ads/mp2;

    new-instance v0, Lcom/google/android/gms/internal/ads/e01;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/e01;-><init>(I)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zz0;->a:Lcom/google/android/gms/internal/ads/d01;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zz0;->b:Ljava/lang/String;

    new-instance v2, Lcom/google/android/gms/internal/ads/yz0;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/yz0;-><init>(Lcom/google/android/gms/internal/ads/zz0;)V

    invoke-interface {p2, p1, v1, v0, v2}, Lcom/google/android/gms/internal/ads/d01;->a(Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/c01;Lcom/google/android/gms/internal/ads/f01;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zz0;->a:Lcom/google/android/gms/internal/ads/d01;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/d01;->u()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zz0;->c:Lcom/google/android/gms/internal/ads/mp2;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zz0;->c:Lcom/google/android/gms/internal/ads/mp2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/mp2;->a()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "#007 Could not call remote method."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_0
    monitor-exit p0

    throw v0
.end method
