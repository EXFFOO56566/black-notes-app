.class final Lcom/google/android/gms/internal/ads/dy0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/h70;


# instance fields
.field private a:Z

.field private final synthetic b:Lcom/google/android/gms/internal/ads/ro;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/yx0;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dy0;->b:Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/dy0;->a:Z

    return-void
.end method

.method private final b(ILjava/lang/String;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->t2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dy0;->b:Lcom/google/android/gms/internal/ads/ro;

    new-instance v2, Lcom/google/android/gms/internal/ads/nt0;

    invoke-direct {v2, v0, p1, p2}, Lcom/google/android/gms/internal/ads/nt0;-><init>(IILjava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/dy0;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/dy0;->b(ILjava/lang/String;)V

    return-void
.end method

.method public final declared-synchronized a(ILjava/lang/String;)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/dy0;->a:Z

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/dy0;->b(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized s()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dy0;->b:Lcom/google/android/gms/internal/ads/ro;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ro;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
