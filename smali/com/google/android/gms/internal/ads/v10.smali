.class public final Lcom/google/android/gms/internal/ads/v10;
.super Lcom/google/android/gms/internal/ads/n00;
.source ""


# instance fields
.field private final g:Lcom/google/android/gms/internal/ads/r3;

.field private final h:Ljava/lang/Runnable;

.field private final i:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/n20;Lcom/google/android/gms/internal/ads/r3;Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/n00;-><init>(Lcom/google/android/gms/internal/ads/n20;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/v10;->g:Lcom/google/android/gms/internal/ads/r3;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/v10;->h:Ljava/lang/Runnable;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/v10;->i:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ads/um2;)V
    .locals 0

    return-void
.end method

.method final synthetic a(Ljava/lang/Runnable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v10;->g:Lcom/google/android/gms/internal/ads/r3;

    invoke-static {p1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/r3;->A(Lb/c/b/a/d/a;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final b()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/v10;->h:Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/u10;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/u10;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v10;->i:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/x10;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/ads/x10;-><init>(Lcom/google/android/gms/internal/ads/v10;Ljava/lang/Runnable;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final f()Lcom/google/android/gms/internal/ads/rp2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/hd1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i()Lcom/google/android/gms/internal/ads/hd1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final k()V
    .locals 0

    return-void
.end method
