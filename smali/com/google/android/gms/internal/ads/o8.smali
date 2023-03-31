.class final Lcom/google/android/gms/internal/ads/o8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/vo;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/vo<",
        "Lcom/google/android/gms/internal/ads/r7;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/w8;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/f8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/o8;->b:Lcom/google/android/gms/internal/ads/f8;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/o8;->a:Lcom/google/android/gms/internal/ads/w8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/r7;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/o8;->b:Lcom/google/android/gms/internal/ads/f8;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/f8;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/o8;->b:Lcom/google/android/gms/internal/ads/f8;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/f8;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/o8;->b:Lcom/google/android/gms/internal/ads/f8;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/f8;->b(Lcom/google/android/gms/internal/ads/f8;)Lcom/google/android/gms/internal/ads/w8;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/o8;->a:Lcom/google/android/gms/internal/ads/w8;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/o8;->b:Lcom/google/android/gms/internal/ads/f8;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/f8;->b(Lcom/google/android/gms/internal/ads/f8;)Lcom/google/android/gms/internal/ads/w8;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const-string v0, "New JS engine is loaded, marking previous one as destroyable."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/o8;->b:Lcom/google/android/gms/internal/ads/f8;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/f8;->b(Lcom/google/android/gms/internal/ads/f8;)Lcom/google/android/gms/internal/ads/w8;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/w8;->e()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/o8;->b:Lcom/google/android/gms/internal/ads/f8;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/o8;->a:Lcom/google/android/gms/internal/ads/w8;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;)Lcom/google/android/gms/internal/ads/w8;

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
