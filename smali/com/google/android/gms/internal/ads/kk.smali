.class final Lcom/google/android/gms/internal/ads/kk;
.super Lcom/google/android/gms/internal/ads/sk;
.source ""


# instance fields
.field private final synthetic c:Lcom/google/android/gms/internal/ads/ik;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ik;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kk;->c:Lcom/google/android/gms/internal/ads/ik;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sk;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/f;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kk;->c:Lcom/google/android/gms/internal/ads/ik;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ik;->a(Lcom/google/android/gms/internal/ads/ik;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kk;->c:Lcom/google/android/gms/internal/ads/ik;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ik;->b(Lcom/google/android/gms/internal/ads/ik;)Lcom/google/android/gms/internal/ads/fo;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/f;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kk;->c:Lcom/google/android/gms/internal/ads/ik;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ik;->c(Lcom/google/android/gms/internal/ads/ik;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->l()Lcom/google/android/gms/internal/ads/g;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kk;->c:Lcom/google/android/gms/internal/ads/ik;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ik;->d(Lcom/google/android/gms/internal/ads/ik;)Lcom/google/android/gms/internal/ads/e;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/g;->a(Lcom/google/android/gms/internal/ads/e;Lcom/google/android/gms/internal/ads/f;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    const-string v2, "Cannot config CSI reporter."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
