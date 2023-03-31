.class final Lcom/google/android/gms/internal/ads/qc1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "Lcom/google/android/gms/internal/ads/ck0;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/f01;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/uc1;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/pc1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/pc1;Lcom/google/android/gms/internal/ads/f01;Lcom/google/android/gms/internal/ads/uc1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qc1;->c:Lcom/google/android/gms/internal/ads/pc1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/qc1;->a:Lcom/google/android/gms/internal/ads/f01;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/qc1;->b:Lcom/google/android/gms/internal/ads/uc1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/ck0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qc1;->c:Lcom/google/android/gms/internal/ads/pc1;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qc1;->a:Lcom/google/android/gms/internal/ads/f01;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/f01;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qc1;->c:Lcom/google/android/gms/internal/ads/pc1;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/pc1;->a(Lcom/google/android/gms/internal/ads/pc1;)Lcom/google/android/gms/internal/ads/rb1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/rb1;->a()V

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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qc1;->c:Lcom/google/android/gms/internal/ads/pc1;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qc1;->c:Lcom/google/android/gms/internal/ads/pc1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/pc1;->b(Lcom/google/android/gms/internal/ads/pc1;)Lcom/google/android/gms/internal/ads/mb1;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/mb1;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/fk0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/fk0;->d()Lcom/google/android/gms/internal/ads/y50;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/gp0;->a(Ljava/lang/Throwable;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/y50;->a(I)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qc1;->c:Lcom/google/android/gms/internal/ads/pc1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/pc1;->a(Lcom/google/android/gms/internal/ads/pc1;)Lcom/google/android/gms/internal/ads/rb1;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/gp0;->a(Ljava/lang/Throwable;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/rb1;->a(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qc1;->c:Lcom/google/android/gms/internal/ads/pc1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qc1;->b:Lcom/google/android/gms/internal/ads/uc1;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/pc1;->a(Lcom/google/android/gms/internal/ads/pc1;Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/ik0;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ik0;->b()Lcom/google/android/gms/internal/ads/fk0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/fk0;->a()Lcom/google/android/gms/internal/ads/l30;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/l30;->c()Lcom/google/android/gms/internal/ads/x80;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/x80;->C()V

    :goto_0
    const-string v1, "RewardedAdLoader.onFailure"

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/ie1;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qc1;->a:Lcom/google/android/gms/internal/ads/f01;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/f01;->a()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
