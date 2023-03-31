.class public final Lcom/google/android/gms/internal/ads/sb1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/wf1;


# static fields
.field private static l:Lcom/google/android/gms/internal/ads/sb1;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/dk1;

.field private final d:Lcom/google/android/gms/internal/ads/kk1;

.field private final e:Lcom/google/android/gms/internal/ads/g52;

.field private final f:Lcom/google/android/gms/internal/ads/ji1;

.field private final g:Ljava/util/concurrent/Executor;

.field private final h:Lcom/google/android/gms/internal/ads/a72;

.field private volatile i:J

.field private final j:Ljava/lang/Object;

.field private volatile k:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ji1;Lcom/google/android/gms/internal/ads/dk1;Lcom/google/android/gms/internal/ads/kk1;Lcom/google/android/gms/internal/ads/g52;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/a72;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/sb1;->i:J

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sb1;->j:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sb1;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/sb1;->c:Lcom/google/android/gms/internal/ads/dk1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/sb1;->d:Lcom/google/android/gms/internal/ads/kk1;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/sb1;->e:Lcom/google/android/gms/internal/ads/g52;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/sb1;->g:Ljava/util/concurrent/Executor;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/sb1;->h:Lcom/google/android/gms/internal/ads/a72;

    return-void
.end method

.method static a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ji1;Lcom/google/android/gms/internal/ads/ni1;)Lcom/google/android/gms/internal/ads/sb1;
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/sb1;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ji1;Lcom/google/android/gms/internal/ads/ni1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/sb1;

    move-result-object p0

    return-object p0
.end method

.method private static a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ji1;Lcom/google/android/gms/internal/ads/ni1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/sb1;
    .locals 11

    new-instance v0, Lcom/google/android/gms/internal/ads/aj1;

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/google/android/gms/internal/ads/aj1;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/ji1;Lcom/google/android/gms/internal/ads/ni1;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/j52;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/j52;-><init>(Landroid/content/Context;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/s52;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/ads/s52;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/j52;)V

    new-instance v8, Lcom/google/android/gms/internal/ads/g52;

    invoke-direct {v8, p2, v0, v2, v1}, Lcom/google/android/gms/internal/ads/g52;-><init>(Lcom/google/android/gms/internal/ads/ni1;Lcom/google/android/gms/internal/ads/aj1;Lcom/google/android/gms/internal/ads/s52;Lcom/google/android/gms/internal/ads/j52;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/qj1;

    invoke-direct {p2, p0, p1}, Lcom/google/android/gms/internal/ads/qj1;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ji1;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/qj1;->a()Lcom/google/android/gms/internal/ads/a72;

    move-result-object v10

    new-instance p2, Lcom/google/android/gms/internal/ads/sb1;

    new-instance v6, Lcom/google/android/gms/internal/ads/dk1;

    invoke-direct {v6, p0, v10}, Lcom/google/android/gms/internal/ads/dk1;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/a72;)V

    new-instance v7, Lcom/google/android/gms/internal/ads/kk1;

    invoke-direct {v7, p0, v8, p1}, Lcom/google/android/gms/internal/ads/kk1;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/nk1;Lcom/google/android/gms/internal/ads/ji1;)V

    move-object v3, p2

    move-object v4, p0

    move-object v5, p1

    move-object v9, p3

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/internal/ads/sb1;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ji1;Lcom/google/android/gms/internal/ads/dk1;Lcom/google/android/gms/internal/ads/kk1;Lcom/google/android/gms/internal/ads/g52;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/a72;)V

    return-object p2
.end method

.method public static declared-synchronized a(Ljava/lang/String;Landroid/content/Context;Z)Lcom/google/android/gms/internal/ads/sb1;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/ads/sb1;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/sb1;->l:Lcom/google/android/gms/internal/ads/sb1;

    if-nez v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/ni1;->d()Lcom/google/android/gms/internal/ads/mi1;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/mi1;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/mi1;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/mi1;->a(Z)Lcom/google/android/gms/internal/ads/mi1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/mi1;->a()Lcom/google/android/gms/internal/ads/ni1;

    move-result-object p0

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/ji1;->a(Landroid/content/Context;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ji1;

    move-result-object v1

    invoke-static {p1, v1, p0, p2}, Lcom/google/android/gms/internal/ads/sb1;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ji1;Lcom/google/android/gms/internal/ads/ni1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/sb1;

    move-result-object p0

    sput-object p0, Lcom/google/android/gms/internal/ads/sb1;->l:Lcom/google/android/gms/internal/ads/sb1;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sb1;->a()V

    sget-object p0, Lcom/google/android/gms/internal/ads/sb1;->l:Lcom/google/android/gms/internal/ads/sb1;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sb1;->d()V

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/sb1;->l:Lcom/google/android/gms/internal/ads/sb1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/sb1;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/sb1;->j:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/sb1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/sb1;->k:Z

    return p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/sb1;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/sb1;->k:Z

    return p0
.end method

.method private final c()V
    .locals 12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sb1;->c:Lcom/google/android/gms/internal/ads/dk1;

    sget v3, Lcom/google/android/gms/internal/ads/ik1;->a:I

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/dk1;->a(I)Lcom/google/android/gms/internal/ads/zj1;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zj1;->b()Lcom/google/android/gms/internal/ads/g72;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zj1;->b()Lcom/google/android/gms/internal/ads/g72;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/g72;->q()Ljava/lang/String;

    move-result-object v2

    move-object v9, v2

    move-object v8, v4

    goto :goto_0

    :cond_0
    move-object v8, v3

    move-object v9, v8

    :goto_0
    :try_start_0
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/sb1;->b:Landroid/content/Context;

    const/4 v6, 0x1

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/sb1;->h:Lcom/google/android/gms/internal/ads/a72;

    const-string v10, "1"

    iget-object v11, p0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    invoke-static/range {v5 .. v11}, Lcom/google/android/gms/internal/ads/vi1;->a(Landroid/content/Context;ILcom/google/android/gms/internal/ads/a72;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ji1;)Lcom/google/android/gms/internal/ads/hk1;

    move-result-object v2

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/hk1;->c:[B

    if-eqz v4, :cond_9

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/hk1;->c:[B

    array-length v4, v4

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/hk1;->c:[B

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/dy1;->a([B)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->b()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/c72;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/c72;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_6

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/g72;->q()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/c72;->r()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/dy1;->a()[B

    move-result-object v4

    array-length v4, v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/sb1;->c:Lcom/google/android/gms/internal/ads/dk1;

    sget v7, Lcom/google/android/gms/internal/ads/ik1;->a:I

    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/ads/dk1;->a(I)Lcom/google/android/gms/internal/ads/zj1;

    move-result-object v4

    if-nez v4, :cond_4

    :cond_3
    :goto_1
    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zj1;->b()Lcom/google/android/gms/internal/ads/g72;

    move-result-object v4

    if-nez v4, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/g72;->q()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/g72;->q()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_1

    :cond_6
    :goto_2
    if-nez v5, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    const/16 v3, 0x1392

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/ji1;->a(IJ)Lb/c/b/a/h/f;

    return-void

    :cond_7
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/sb1;->c:Lcom/google/android/gms/internal/ads/dk1;

    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/ads/dk1;->a(Lcom/google/android/gms/internal/ads/c72;Lcom/google/android/gms/internal/ads/jk1;)Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    const/16 v3, 0xfa9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/ji1;->a(IJ)Lb/c/b/a/h/f;

    return-void

    :cond_8
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sb1;->d:Lcom/google/android/gms/internal/ads/kk1;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sb1;->c:Lcom/google/android/gms/internal/ads/dk1;

    sget v4, Lcom/google/android/gms/internal/ads/ik1;->a:I

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/dk1;->a(I)Lcom/google/android/gms/internal/ads/zj1;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/kk1;->a(Lcom/google/android/gms/internal/ads/zj1;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/sb1;->i:J

    return-void

    :cond_9
    :goto_3
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    const/16 v3, 0x1391

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/ji1;->a(IJ)Lb/c/b/a/h/f;
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/b02; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    const/16 v4, 0xfa2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v0

    invoke-virtual {v3, v4, v5, v6, v2}, Lcom/google/android/gms/internal/ads/ji1;->a(IJLjava/lang/Exception;)Lb/c/b/a/h/f;

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/sb1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sb1;->c()V

    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ads/sb1;)Lcom/google/android/gms/internal/ads/ji1;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    return-object p0
.end method

.method private final d()V
    .locals 6

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sb1;->k:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sb1;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/sb1;->k:Z

    if-nez v1, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/sb1;->i:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0xe10

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sb1;->d:Lcom/google/android/gms/internal/ads/kk1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/kk1;->b()Lcom/google/android/gms/internal/ads/zj1;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zj1;->a(J)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sb1;->b()V

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_3
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 10

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sb1;->d()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sb1;->d:Lcom/google/android/gms/internal/ads/kk1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kk1;->a()Lcom/google/android/gms/internal/ads/pi1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-interface {v0, p1, v3}, Lcom/google/android/gms/internal/ads/pi1;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    const/16 v5, 0x1389

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v1

    const/4 v9, 0x0

    move-object v8, p1

    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/ji1;->a(IJLjava/lang/String;Ljava/util/Map;)Lb/c/b/a/h/f;

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public final a(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 10

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sb1;->d()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sb1;->d:Lcom/google/android/gms/internal/ads/kk1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kk1;->a()Lcom/google/android/gms/internal/ads/pi1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-interface {v0, p1, v3, p2, p3}, Lcom/google/android/gms/internal/ads/pi1;->a(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    const/16 v5, 0x138a

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    sub-long v6, p2, v1

    const/4 v9, 0x0

    move-object v8, p1

    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/ji1;->a(IJLjava/lang/String;Ljava/util/Map;)Lb/c/b/a/h/f;

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/sb1;->a(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/sb1;->d()V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/sb1;->d:Lcom/google/android/gms/internal/ads/kk1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/kk1;->a()Lcom/google/android/gms/internal/ads/pi1;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const/4 v4, 0x0

    move-object/from16 v3, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/pi1;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    const/16 v11, 0x1388

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v12, v2, v8

    const/4 v15, 0x0

    move-object v14, v1

    invoke-virtual/range {v10 .. v15}, Lcom/google/android/gms/internal/ads/ji1;->a(IJLjava/lang/String;Ljava/util/Map;)Lb/c/b/a/h/f;

    return-object v1

    :cond_0
    const-string v1, ""

    return-object v1
.end method

.method final declared-synchronized a()V
    .locals 6

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sb1;->c:Lcom/google/android/gms/internal/ads/dk1;

    sget v3, Lcom/google/android/gms/internal/ads/ik1;->a:I

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/dk1;->a(I)Lcom/google/android/gms/internal/ads/zj1;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zj1;->a()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sb1;->d:Lcom/google/android/gms/internal/ads/kk1;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/kk1;->a(Lcom/google/android/gms/internal/ads/zj1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    const/16 v3, 0xfad

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/ji1;->a(IJ)Lb/c/b/a/h/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(III)V
    .locals 0

    return-void
.end method

.method public final a(Landroid/view/MotionEvent;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sb1;->d:Lcom/google/android/gms/internal/ads/kk1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kk1;->a()Lcom/google/android/gms/internal/ads/pi1;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/pi1;->a(Ljava/lang/String;Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/lk1; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sb1;->f:Lcom/google/android/gms/internal/ads/ji1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lk1;->a()I

    move-result v1

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/ji1;->a(IJLjava/lang/Exception;)Lb/c/b/a/h/f;

    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sb1;->e:Lcom/google/android/gms/internal/ads/g52;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/g52;->a(Landroid/view/View;)V

    return-void
.end method

.method final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sb1;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/ve1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/ve1;-><init>(Lcom/google/android/gms/internal/ads/sb1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
