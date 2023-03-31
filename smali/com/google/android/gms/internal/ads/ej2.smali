.class final Lcom/google/android/gms/internal/ads/ej2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/internal/c$b;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/zi2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zi2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ej2;->a:Lcom/google/android/gms/internal/ads/zi2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb/c/b/a/c/b;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ej2;->a:Lcom/google/android/gms/internal/ads/zi2;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zi2;->c(Lcom/google/android/gms/internal/ads/zi2;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ej2;->a:Lcom/google/android/gms/internal/ads/zi2;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zi2;->a(Lcom/google/android/gms/internal/ads/zi2;Lcom/google/android/gms/internal/ads/nj2;)Lcom/google/android/gms/internal/ads/nj2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ej2;->a:Lcom/google/android/gms/internal/ads/zi2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zi2;->d(Lcom/google/android/gms/internal/ads/zi2;)Lcom/google/android/gms/internal/ads/jj2;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ej2;->a:Lcom/google/android/gms/internal/ads/zi2;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zi2;->a(Lcom/google/android/gms/internal/ads/zi2;Lcom/google/android/gms/internal/ads/jj2;)Lcom/google/android/gms/internal/ads/jj2;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ej2;->a:Lcom/google/android/gms/internal/ads/zi2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zi2;->c(Lcom/google/android/gms/internal/ads/zi2;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
