.class final synthetic Lcom/google/android/gms/internal/ads/sj2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/ro;

.field private final c:Ljava/util/concurrent/Future;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ro;Ljava/util/concurrent/Future;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sj2;->b:Lcom/google/android/gms/internal/ads/ro;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sj2;->c:Ljava/util/concurrent/Future;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sj2;->b:Lcom/google/android/gms/internal/ads/ro;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sj2;->c:Ljava/util/concurrent/Future;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ro;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    return-void
.end method
