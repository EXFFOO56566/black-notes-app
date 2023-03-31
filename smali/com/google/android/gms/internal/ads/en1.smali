.class final Lcom/google/android/gms/internal/ads/en1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/lo1;

.field private final synthetic c:I

.field private final synthetic d:Lcom/google/android/gms/internal/ads/fn1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/fn1;Lcom/google/android/gms/internal/ads/lo1;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/en1;->d:Lcom/google/android/gms/internal/ads/fn1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/en1;->b:Lcom/google/android/gms/internal/ads/lo1;

    iput p3, p0, Lcom/google/android/gms/internal/ads/en1;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/en1;->b:Lcom/google/android/gms/internal/ads/lo1;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/en1;->d:Lcom/google/android/gms/internal/ads/fn1;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/fn1;->a(Lcom/google/android/gms/internal/ads/fn1;Lcom/google/android/gms/internal/ads/tl1;)Lcom/google/android/gms/internal/ads/tl1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/en1;->d:Lcom/google/android/gms/internal/ads/fn1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/xm1;->cancel(Z)Z

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/en1;->d:Lcom/google/android/gms/internal/ads/fn1;

    iget v2, p0, Lcom/google/android/gms/internal/ads/en1;->c:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/en1;->b:Lcom/google/android/gms/internal/ads/lo1;

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/fn1;->a(Lcom/google/android/gms/internal/ads/fn1;ILjava/util/concurrent/Future;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/en1;->d:Lcom/google/android/gms/internal/ads/fn1;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/fn1;->b(Lcom/google/android/gms/internal/ads/fn1;Lcom/google/android/gms/internal/ads/tl1;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/en1;->d:Lcom/google/android/gms/internal/ads/fn1;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/fn1;->b(Lcom/google/android/gms/internal/ads/fn1;Lcom/google/android/gms/internal/ads/tl1;)V

    throw v1
.end method
