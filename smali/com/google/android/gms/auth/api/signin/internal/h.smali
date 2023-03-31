.class public final Lcom/google/android/gms/auth/api/signin/internal/h;
.super La/k/b/a;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/internal/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/k/b/a<",
        "Ljava/lang/Void;",
        ">;",
        "Lcom/google/android/gms/common/api/internal/m;"
    }
.end annotation


# instance fields
.field private o:Ljava/util/concurrent/Semaphore;

.field private p:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/f;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, La/k/b/a;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/internal/h;->o:Ljava/util/concurrent/Semaphore;

    iput-object p2, p0, Lcom/google/android/gms/auth/api/signin/internal/h;->p:Ljava/util/Set;

    return-void
.end method

.method private final v()Ljava/lang/Void;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/h;->p:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/h;->o:Ljava/util/concurrent/Semaphore;

    const-wide/16 v3, 0x5

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v3, v4, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(IJLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "GACSignInLoader"

    const-string v3, "Unexpected InterruptedException"

    invoke-static {v1, v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_0
    return-object v2

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/f;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/f;->a(Lcom/google/android/gms/common/api/internal/m;)Z

    throw v2
.end method


# virtual methods
.method protected final l()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/h;->o:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->drainPermits()I

    invoke-virtual {p0}, La/k/b/b;->e()V

    return-void
.end method

.method public final synthetic t()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/internal/h;->v()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
