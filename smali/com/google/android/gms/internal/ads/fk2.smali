.class public final Lcom/google/android/gms/internal/ads/fk2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:[B

.field private b:I

.field private c:I

.field private final synthetic d:Lcom/google/android/gms/internal/ads/ak2;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/ak2;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fk2;->d:Lcom/google/android/gms/internal/ads/ak2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fk2;->a:[B

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ak2;[BLcom/google/android/gms/internal/ads/gk2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/fk2;-><init>(Lcom/google/android/gms/internal/ads/ak2;[B)V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/internal/ads/fk2;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/fk2;->b:I

    return-object p0
.end method

.method public final declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fk2;->d:Lcom/google/android/gms/internal/ads/ak2;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/ak2;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fk2;->d:Lcom/google/android/gms/internal/ads/ak2;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ak2;->a:Lcom/google/android/gms/internal/ads/l72;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fk2;->a:[B

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/l72;->a([B)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fk2;->d:Lcom/google/android/gms/internal/ads/ak2;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ak2;->a:Lcom/google/android/gms/internal/ads/l72;

    iget v1, p0, Lcom/google/android/gms/internal/ads/fk2;->b:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/l72;->h(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fk2;->d:Lcom/google/android/gms/internal/ads/ak2;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ak2;->a:Lcom/google/android/gms/internal/ads/l72;

    iget v1, p0, Lcom/google/android/gms/internal/ads/fk2;->c:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/l72;->k(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fk2;->d:Lcom/google/android/gms/internal/ads/ak2;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ak2;->a:Lcom/google/android/gms/internal/ads/l72;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/l72;->a([I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fk2;->d:Lcom/google/android/gms/internal/ads/ak2;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ak2;->a:Lcom/google/android/gms/internal/ads/l72;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/l72;->R1()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "Clearcut log failed"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public final b(I)Lcom/google/android/gms/internal/ads/fk2;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/fk2;->c:I

    return-object p0
.end method
