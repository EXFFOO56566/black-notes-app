.class final Lcom/google/android/gms/internal/ads/xm1$i;
.super Lcom/google/android/gms/internal/ads/xm1$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/xm1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/xm1$b;-><init>(Lcom/google/android/gms/internal/ads/xm1$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/xm1$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/xm1$i;-><init>()V

    return-void
.end method


# virtual methods
.method final a(Lcom/google/android/gms/internal/ads/xm1$l;Lcom/google/android/gms/internal/ads/xm1$l;)V
    .locals 0

    iput-object p2, p1, Lcom/google/android/gms/internal/ads/xm1$l;->b:Lcom/google/android/gms/internal/ads/xm1$l;

    return-void
.end method

.method final a(Lcom/google/android/gms/internal/ads/xm1$l;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lcom/google/android/gms/internal/ads/xm1$l;->a:Ljava/lang/Thread;

    return-void
.end method

.method final a(Lcom/google/android/gms/internal/ads/xm1;Lcom/google/android/gms/internal/ads/xm1$e;Lcom/google/android/gms/internal/ads/xm1$e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/xm1<",
            "*>;",
            "Lcom/google/android/gms/internal/ads/xm1$e;",
            "Lcom/google/android/gms/internal/ads/xm1$e;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/xm1;->e(Lcom/google/android/gms/internal/ads/xm1;)Lcom/google/android/gms/internal/ads/xm1$e;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lcom/google/android/gms/internal/ads/xm1;->a(Lcom/google/android/gms/internal/ads/xm1;Lcom/google/android/gms/internal/ads/xm1$e;)Lcom/google/android/gms/internal/ads/xm1$e;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method final a(Lcom/google/android/gms/internal/ads/xm1;Lcom/google/android/gms/internal/ads/xm1$l;Lcom/google/android/gms/internal/ads/xm1$l;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/xm1<",
            "*>;",
            "Lcom/google/android/gms/internal/ads/xm1$l;",
            "Lcom/google/android/gms/internal/ads/xm1$l;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/xm1;->d(Lcom/google/android/gms/internal/ads/xm1;)Lcom/google/android/gms/internal/ads/xm1$l;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lcom/google/android/gms/internal/ads/xm1;->a(Lcom/google/android/gms/internal/ads/xm1;Lcom/google/android/gms/internal/ads/xm1$l;)Lcom/google/android/gms/internal/ads/xm1$l;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method final a(Lcom/google/android/gms/internal/ads/xm1;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/xm1<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/xm1;->b(Lcom/google/android/gms/internal/ads/xm1;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lcom/google/android/gms/internal/ads/xm1;->a(Lcom/google/android/gms/internal/ads/xm1;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
