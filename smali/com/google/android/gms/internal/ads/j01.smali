.class final Lcom/google/android/gms/internal/ads/j01;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "Lcom/google/android/gms/internal/ads/k20;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/f01;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/zd0;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/i01;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/i01;Lcom/google/android/gms/internal/ads/f01;Lcom/google/android/gms/internal/ads/zd0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j01;->c:Lcom/google/android/gms/internal/ads/i01;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/j01;->a:Lcom/google/android/gms/internal/ads/f01;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/j01;->b:Lcom/google/android/gms/internal/ads/zd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/k20;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j01;->c:Lcom/google/android/gms/internal/ads/i01;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/j01;->a:Lcom/google/android/gms/internal/ads/f01;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/f01;->a(Ljava/lang/Object;)V

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
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j01;->b:Lcom/google/android/gms/internal/ads/zd0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zd0;->b()Lcom/google/android/gms/internal/ads/y50;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/gp0;->a(Ljava/lang/Throwable;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/y50;->a(I)V

    const-string v0, "NativeAdLoader.onFailure"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ie1;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/j01;->a:Lcom/google/android/gms/internal/ads/f01;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/f01;->a()V

    return-void
.end method
