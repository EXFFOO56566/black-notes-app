.class public final Lcom/google/android/gms/internal/ads/aj1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/ji1;

.field private final c:Lcom/google/android/gms/internal/ads/ni1;

.field private final d:Lb/c/b/a/h/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/c/b/a/h/f<",
            "Lcom/google/android/gms/internal/ads/ba0;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lb/c/b/a/h/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/c/b/a/h/f<",
            "Lcom/google/android/gms/internal/ads/ba0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/ji1;Lcom/google/android/gms/internal/ads/ni1;)V
    .locals 7

    new-instance v5, Lcom/google/android/gms/internal/ads/gj1;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/gj1;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/dj1;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/dj1;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/aj1;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/ji1;Lcom/google/android/gms/internal/ads/ni1;Lcom/google/android/gms/internal/ads/gj1;Lcom/google/android/gms/internal/ads/dj1;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/ji1;Lcom/google/android/gms/internal/ads/ni1;Lcom/google/android/gms/internal/ads/gj1;Lcom/google/android/gms/internal/ads/dj1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aj1;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/aj1;->b:Lcom/google/android/gms/internal/ads/ji1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/aj1;->c:Lcom/google/android/gms/internal/ads/ni1;

    new-instance p1, Lcom/google/android/gms/internal/ads/yi1;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/yi1;-><init>(Lcom/google/android/gms/internal/ads/aj1;)V

    invoke-static {p2, p1}, Lb/c/b/a/h/i;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lb/c/b/a/h/f;

    move-result-object p1

    new-instance p3, Lcom/google/android/gms/internal/ads/cj1;

    invoke-direct {p3, p0}, Lcom/google/android/gms/internal/ads/cj1;-><init>(Lcom/google/android/gms/internal/ads/aj1;)V

    invoke-virtual {p1, p3}, Lb/c/b/a/h/f;->a(Lb/c/b/a/h/c;)Lb/c/b/a/h/f;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aj1;->d:Lb/c/b/a/h/f;

    new-instance p1, Lcom/google/android/gms/internal/ads/bj1;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/bj1;-><init>(Lcom/google/android/gms/internal/ads/aj1;)V

    invoke-static {p2, p1}, Lb/c/b/a/h/i;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lb/c/b/a/h/f;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/ej1;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/ej1;-><init>(Lcom/google/android/gms/internal/ads/aj1;)V

    invoke-virtual {p1, p2}, Lb/c/b/a/h/f;->a(Lb/c/b/a/h/c;)Lb/c/b/a/h/f;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aj1;->e:Lb/c/b/a/h/f;

    return-void
.end method

.method private final declared-synchronized a(Lb/c/b/a/h/f;)Lcom/google/android/gms/internal/ads/ba0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/c/b/a/h/f<",
            "Lcom/google/android/gms/internal/ads/ba0;",
            ">;)",
            "Lcom/google/android/gms/internal/ads/ba0;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lb/c/b/a/h/f;->d()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const-wide/16 v0, 0xc8

    :try_start_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v0, v1, v2}, Lb/c/b/a/h/i;->a(Lb/c/b/a/h/f;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    :try_start_2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aj1;->c(Ljava/lang/Exception;)V

    :cond_0
    :goto_1
    invoke-virtual {p1}, Lb/c/b/a/h/f;->e()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ba0;->x()Lcom/google/android/gms/internal/ads/ba0$a;

    move-result-object p1

    const-string v0, "E"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/ba0$a;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ba0$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/ba0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_1
    :try_start_3
    invoke-virtual {p1}, Lb/c/b/a/h/f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/ba0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final c(Ljava/lang/Exception;)V
    .locals 4

    instance-of v0, p1, Ljava/lang/InterruptedException;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aj1;->b:Lcom/google/android/gms/internal/ads/ji1;

    const/16 v1, 0x7e9

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/ji1;->a(IJLjava/lang/Exception;)Lb/c/b/a/h/f;

    return-void
.end method

.method private final declared-synchronized g()Lcom/google/android/gms/internal/ads/ba0;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aj1;->d:Lb/c/b/a/h/f;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aj1;->a(Lb/c/b/a/h/f;)Lcom/google/android/gms/internal/ads/ba0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final declared-synchronized h()Lcom/google/android/gms/internal/ads/ba0;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aj1;->e:Lb/c/b/a/h/f;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aj1;->a(Lb/c/b/a/h/f;)Lcom/google/android/gms/internal/ads/ba0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/aj1;->h()Lcom/google/android/gms/internal/ads/ba0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ba0;->p()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final synthetic a(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/aj1;->c(Ljava/lang/Exception;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/aj1;->g()Lcom/google/android/gms/internal/ads/ba0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ba0;->r()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final synthetic b(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/aj1;->c(Ljava/lang/Exception;)V

    return-void
.end method

.method public final c()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/aj1;->g()Lcom/google/android/gms/internal/ads/ba0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ba0;->t()Z

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/aj1;->g()Lcom/google/android/gms/internal/ads/ba0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ba0;->s()Lcom/google/android/gms/internal/ads/ba0$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ba0$c;->a()I

    move-result v0

    return v0
.end method

.method final synthetic e()Lcom/google/android/gms/internal/ads/ba0;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aj1;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aj1;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aj1;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/ti1;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ba0;

    move-result-object v0

    return-object v0
.end method

.method final synthetic f()Lcom/google/android/gms/internal/ads/ba0;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aj1;->c:Lcom/google/android/gms/internal/ads/ni1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ni1;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aj1;->a:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ba0;->x()Lcom/google/android/gms/internal/ads/ba0$a;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/ads/t/a;

    invoke-direct {v2, v0}, Lcom/google/android/gms/ads/t/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lcom/google/android/gms/ads/t/a;->c()V

    invoke-virtual {v2}, Lcom/google/android/gms/ads/t/a;->b()Lcom/google/android/gms/ads/t/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/t/a$a;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"

    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    const/16 v3, 0x10

    new-array v3, v3, [B

    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v2}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    const/16 v2, 0xb

    invoke-static {v3, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ba0$a;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ba0$a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/t/a$a;->b()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/ba0$a;->a(Z)Lcom/google/android/gms/internal/ads/ba0$a;

    sget-object v0, Lcom/google/android/gms/internal/ads/ba0$c;->h:Lcom/google/android/gms/internal/ads/ba0$c;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/ba0$a;->a(Lcom/google/android/gms/internal/ads/ba0$c;)Lcom/google/android/gms/internal/ads/ba0$a;

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/ba0;

    return-object v0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/ba0;->y()Lcom/google/android/gms/internal/ads/ba0;

    move-result-object v0

    return-object v0
.end method
