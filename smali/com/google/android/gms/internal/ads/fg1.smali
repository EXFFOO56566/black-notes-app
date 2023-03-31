.class final Lcom/google/android/gms/internal/ads/fg1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "Lcom/google/android/gms/internal/ads/rf1<",
        "TAdT;>;>;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ag1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ag1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/rf1;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ag1;->a(Lcom/google/android/gms/internal/ads/ag1;)Lcom/google/android/gms/internal/ads/hg1;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/hg1;->a(Lcom/google/android/gms/internal/ads/rf1;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ag1;->b(Lcom/google/android/gms/internal/ads/ag1;)I

    move-result v1

    sget v2, Lcom/google/android/gms/internal/ads/pf1;->h:I

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ag1;->d(Lcom/google/android/gms/internal/ads/ag1;)Lcom/google/android/gms/internal/ads/kf1;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ag1;->c(Lcom/google/android/gms/internal/ads/ag1;)Lcom/google/android/gms/internal/ads/gg1;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/gg1;->a()Lcom/google/android/gms/internal/ads/uf1;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Lcom/google/android/gms/internal/ads/kf1;->a(Lcom/google/android/gms/internal/ads/uf1;Lcom/google/android/gms/internal/ads/rf1;)Z

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ag1;->b(Lcom/google/android/gms/internal/ads/ag1;)I

    move-result v1

    sget v2, Lcom/google/android/gms/internal/ads/pf1;->g:I

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ag1;->c(Lcom/google/android/gms/internal/ads/ag1;)Lcom/google/android/gms/internal/ads/gg1;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/ag1;->a(Lcom/google/android/gms/internal/ads/ag1;Lcom/google/android/gms/internal/ads/gg1;)V

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    sget v2, Lcom/google/android/gms/internal/ads/pf1;->g:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/ag1;->a(Lcom/google/android/gms/internal/ads/ag1;I)I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ag1;->e(Lcom/google/android/gms/internal/ads/ag1;)Lcom/google/android/gms/internal/ads/so1;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/so1;->a(Ljava/lang/Object;)Z

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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ag1;->a(Lcom/google/android/gms/internal/ads/ag1;)Lcom/google/android/gms/internal/ads/hg1;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/hg1;->a(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fg1;->a:Lcom/google/android/gms/internal/ads/ag1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ag1;->e(Lcom/google/android/gms/internal/ads/ag1;)Lcom/google/android/gms/internal/ads/so1;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/so1;->a(Ljava/lang/Throwable;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
