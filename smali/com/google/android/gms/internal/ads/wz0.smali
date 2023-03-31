.class final Lcom/google/android/gms/internal/ads/wz0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "Lcom/google/android/gms/internal/ads/ac0;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ad0;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/xz0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/xz0;Lcom/google/android/gms/internal/ads/ad0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wz0;->b:Lcom/google/android/gms/internal/ads/xz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wz0;->a:Lcom/google/android/gms/internal/ads/ad0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/ac0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wz0;->b:Lcom/google/android/gms/internal/ads/xz0;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wz0;->b:Lcom/google/android/gms/internal/ads/xz0;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/xz0;->a(Lcom/google/android/gms/internal/ads/xz0;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/lo1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wz0;->b:Lcom/google/android/gms/internal/ads/xz0;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/xz0;->a(Lcom/google/android/gms/internal/ads/xz0;Lcom/google/android/gms/internal/ads/ac0;)Lcom/google/android/gms/internal/ads/ac0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/k20;->b()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wz0;->b:Lcom/google/android/gms/internal/ads/xz0;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wz0;->b:Lcom/google/android/gms/internal/ads/xz0;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/xz0;->a(Lcom/google/android/gms/internal/ads/xz0;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/lo1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wz0;->a:Lcom/google/android/gms/internal/ads/ad0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ad0;->b()Lcom/google/android/gms/internal/ads/y50;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/gp0;->a(Ljava/lang/Throwable;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/y50;->a(I)V

    const-string v1, "InterstitialAdManagerShim.onFailure"

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/ie1;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
