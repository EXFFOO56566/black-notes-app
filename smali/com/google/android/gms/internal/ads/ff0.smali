.class public final Lcom/google/android/gms/internal/ads/ff0;
.super Lcom/google/android/gms/internal/ads/qp2;
.source ""


# instance fields
.field private final b:Ljava/lang/Object;

.field private c:Lcom/google/android/gms/internal/ads/rp2;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/internal/ads/hb;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rp2;Lcom/google/android/gms/internal/ads/hb;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/internal/ads/rp2;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/internal/ads/hb;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qp2;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ff0;->b:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ff0;->c:Lcom/google/android/gms/internal/ads/rp2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ff0;->d:Lcom/google/android/gms/internal/ads/hb;

    return-void
.end method


# virtual methods
.method public final B0()Lcom/google/android/gms/internal/ads/sp2;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ff0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ff0;->c:Lcom/google/android/gms/internal/ads/rp2;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ff0;->c:Lcom/google/android/gms/internal/ads/rp2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rp2;->B0()Lcom/google/android/gms/internal/ads/sp2;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :cond_0
    const/4 v1, 0x0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final H()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ff0;->d:Lcom/google/android/gms/internal/ads/hb;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/hb;->r1()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final N()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ff0;->d:Lcom/google/android/gms/internal/ads/hb;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/hb;->g1()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Q()F
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final T()I
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final V0()Z
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/sp2;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ff0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ff0;->c:Lcom/google/android/gms/internal/ads/rp2;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ff0;->c:Lcom/google/android/gms/internal/ads/rp2;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/rp2;->a(Lcom/google/android/gms/internal/ads/sp2;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final e(Z)V
    .locals 0

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1
.end method

.method public final i1()V
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final j1()Z
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final p()V
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final stop()V
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final w0()Z
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method
