.class final Lcom/google/android/gms/internal/ads/r8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/to;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/w8;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/f8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/r8;->b:Lcom/google/android/gms/internal/ads/f8;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/r8;->a:Lcom/google/android/gms/internal/ads/w8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/r8;->b:Lcom/google/android/gms/internal/ads/f8;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/f8;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/r8;->b:Lcom/google/android/gms/internal/ads/f8;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/f8;I)I

    const-string v1, "Failed loading new engine. Marking new engine destroyable."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/r8;->a:Lcom/google/android/gms/internal/ads/w8;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/w8;->e()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
