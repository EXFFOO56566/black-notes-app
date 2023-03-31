.class final Lcom/google/android/gms/internal/ads/ep0;
.super Lcom/google/android/gms/internal/ads/j6;
.source ""


# instance fields
.field private final synthetic b:Ljava/lang/Object;

.field private final synthetic c:Ljava/lang/String;

.field private final synthetic d:J

.field private final synthetic e:Lcom/google/android/gms/internal/ads/ro;

.field private final synthetic f:Lcom/google/android/gms/internal/ads/uo0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/uo0;Ljava/lang/Object;Ljava/lang/String;JLcom/google/android/gms/internal/ads/ro;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ep0;->f:Lcom/google/android/gms/internal/ads/uo0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ep0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ep0;->c:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/ep0;->d:J

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/ep0;->e:Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/j6;-><init>()V

    return-void
.end method


# virtual methods
.method public final U()V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ep0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ep0;->f:Lcom/google/android/gms/internal/ads/uo0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ep0;->c:Ljava/lang/String;

    const-string v3, ""

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v4

    invoke-interface {v4}, Lcom/google/android/gms/common/util/d;->b()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/ep0;->d:J

    sub-long/2addr v4, v6

    long-to-int v5, v4

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3, v5}, Lcom/google/android/gms/internal/ads/uo0;->a(Lcom/google/android/gms/internal/ads/uo0;Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ep0;->f:Lcom/google/android/gms/internal/ads/uo0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/uo0;->d(Lcom/google/android/gms/internal/ads/uo0;)Lcom/google/android/gms/internal/ads/eo0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ep0;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/eo0;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ep0;->e:Lcom/google/android/gms/internal/ads/ro;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ro;->b(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final m(Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ep0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ep0;->f:Lcom/google/android/gms/internal/ads/uo0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ep0;->c:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/d;->b()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/ep0;->d:J

    sub-long/2addr v3, v5

    long-to-int v4, v3

    const/4 v3, 0x0

    invoke-static {v1, v2, v3, p1, v4}, Lcom/google/android/gms/internal/ads/uo0;->a(Lcom/google/android/gms/internal/ads/uo0;Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ep0;->f:Lcom/google/android/gms/internal/ads/uo0;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/uo0;->d(Lcom/google/android/gms/internal/ads/uo0;)Lcom/google/android/gms/internal/ads/eo0;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ep0;->c:Ljava/lang/String;

    const-string v2, "error"

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/eo0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ep0;->e:Lcom/google/android/gms/internal/ads/ro;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/ro;->b(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
