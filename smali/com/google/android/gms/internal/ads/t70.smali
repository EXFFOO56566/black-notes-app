.class public final Lcom/google/android/gms/internal/ads/t70;
.super Lcom/google/android/gms/internal/ads/j90;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/j90<",
        "Lcom/google/android/gms/ads/internal/overlay/o;",
        ">;",
        "Lcom/google/android/gms/ads/internal/overlay/o;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/internal/ads/ab0<",
            "Lcom/google/android/gms/ads/internal/overlay/o;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/j90;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized I()V
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/s70;->a:Lcom/google/android/gms/internal/ads/l90;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/j90;->a(Lcom/google/android/gms/internal/ads/l90;)V
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
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/v70;->a:Lcom/google/android/gms/internal/ads/l90;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/j90;->a(Lcom/google/android/gms/internal/ads/l90;)V
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
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/u70;->a:Lcom/google/android/gms/internal/ads/l90;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/j90;->a(Lcom/google/android/gms/internal/ads/l90;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized p()V
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/x70;->a:Lcom/google/android/gms/internal/ads/l90;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/j90;->a(Lcom/google/android/gms/internal/ads/l90;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
