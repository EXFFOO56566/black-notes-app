.class public final Lcom/google/android/gms/internal/ads/rt;
.super Lcom/google/android/gms/internal/ads/qp2;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/gq;

.field private final c:Ljava/lang/Object;

.field private final d:Z

.field private final e:Z

.field private f:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private g:Lcom/google/android/gms/internal/ads/sp2;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private h:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private i:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private j:F
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private k:F
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private l:F
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private m:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private n:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private o:Lcom/google/android/gms/internal/ads/j3;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/gq;FZZ)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qp2;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/rt;->i:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rt;->b:Lcom/google/android/gms/internal/ads/gq;

    iput p2, p0, Lcom/google/android/gms/internal/ads/rt;->j:F

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/rt;->d:Z

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/rt;->e:Z

    return-void
.end method

.method private final a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    move-object p2, v0

    :goto_0
    const-string v0, "action"

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lcom/google/android/gms/internal/ads/jo;->e:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v0, Lcom/google/android/gms/internal/ads/qt;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/qt;-><init>(Lcom/google/android/gms/internal/ads/rt;Ljava/util/Map;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final b(IIZZ)V
    .locals 8

    sget-object v0, Lcom/google/android/gms/internal/ads/jo;->e:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v7, Lcom/google/android/gms/internal/ads/tt;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/tt;-><init>(Lcom/google/android/gms/internal/ads/rt;IIZZ)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final B0()Lcom/google/android/gms/internal/ads/sp2;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final H()F
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/rt;->j:F

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final N()F
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/rt;->k:F

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final Q()F
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/rt;->l:F

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final T()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/rt;->f:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final V0()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/rt;->i:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final a(FFIZF)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/rt;->j:F

    cmpl-float v1, p2, v1

    if-nez v1, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/ads/rt;->l:F

    cmpl-float v1, p5, v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iput p2, p0, Lcom/google/android/gms/internal/ads/rt;->j:F

    iput p1, p0, Lcom/google/android/gms/internal/ads/rt;->k:F

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/rt;->i:Z

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/rt;->i:Z

    iget p2, p0, Lcom/google/android/gms/internal/ads/rt;->f:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/rt;->f:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/rt;->l:F

    iput p5, p0, Lcom/google/android/gms/internal/ads/rt;->l:F

    sub-float/2addr p5, v2

    invoke-static {p5}, Ljava/lang/Math;->abs(F)F

    move-result p5

    const v2, 0x38d1b717    # 1.0E-4f

    cmpl-float p5, p5, v2

    if-lez p5, :cond_2

    iget-object p5, p0, Lcom/google/android/gms/internal/ads/rt;->b:Lcom/google/android/gms/internal/ads/gq;

    invoke-interface {p5}, Lcom/google/android/gms/internal/ads/gu;->getView()Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->invalidate()V

    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    :try_start_1
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/rt;->o:Lcom/google/android/gms/internal/ads/j3;

    if-eqz p5, :cond_3

    iget-object p5, p0, Lcom/google/android/gms/internal/ads/rt;->o:Lcom/google/android/gms/internal/ads/j3;

    invoke-interface {p5}, Lcom/google/android/gms/internal/ads/j3;->Q1()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p5

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p5}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    invoke-direct {p0, p2, p3, p1, p4}, Lcom/google/android/gms/internal/ads/rt;->b(IIZZ)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method final synthetic a(IIZZ)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    :try_start_0
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/rt;->h:Z

    if-nez v3, :cond_1

    if-ne p2, v2, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz p1, :cond_2

    if-ne p2, v2, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    if-eqz p1, :cond_3

    const/4 v5, 0x2

    if-ne p2, v5, :cond_3

    const/4 v5, 0x1

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    if-eqz p1, :cond_4

    const/4 p1, 0x3

    if-ne p2, p1, :cond_4

    const/4 p1, 0x1

    goto :goto_4

    :cond_4
    const/4 p1, 0x0

    :goto_4
    if-eq p3, p4, :cond_5

    const/4 p2, 0x1

    goto :goto_5

    :cond_5
    const/4 p2, 0x0

    :goto_5
    iget-boolean p3, p0, Lcom/google/android/gms/internal/ads/rt;->h:Z

    if-nez p3, :cond_6

    if-eqz v3, :cond_7

    :cond_6
    const/4 v1, 0x1

    :cond_7
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/rt;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_8

    :try_start_1
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    if-eqz p3, :cond_8

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/sp2;->O0()V

    goto :goto_6

    :catch_0
    move-exception p1

    goto :goto_7

    :cond_8
    :goto_6
    if-eqz v4, :cond_9

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    if-eqz p3, :cond_9

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/sp2;->Z()V

    :cond_9
    if-eqz v5, :cond_a

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    if-eqz p3, :cond_a

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/sp2;->W()V

    :cond_a
    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/sp2;->o0()V

    :cond_b
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rt;->b:Lcom/google/android/gms/internal/ads/gq;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/gq;->I()V

    :cond_c
    if-eqz p2, :cond_d

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    invoke-interface {p1, p4}, Lcom/google/android/gms/internal/ads/sp2;->b(Z)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_8

    :goto_7
    :try_start_2
    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    :goto_8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/j3;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rt;->o:Lcom/google/android/gms/internal/ads/j3;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/sp2;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rt;->g:Lcom/google/android/gms/internal/ads/sp2;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method final synthetic a(Ljava/util/Map;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->b:Lcom/google/android/gms/internal/ads/gq;

    const-string v1, "pubVideoCmd"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/e7;->a(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final b(F)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/rt;->k:F

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/er2;)V
    .locals 8

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/er2;->b:Z

    iget-boolean v1, p1, Lcom/google/android/gms/internal/ads/er2;->c:Z

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/er2;->d:Z

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/rt;->m:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/rt;->n:Z

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const-string v0, "1"

    goto :goto_0

    :cond_0
    const-string v0, "0"

    :goto_0
    move-object v3, v0

    if-eqz v1, :cond_1

    const-string v0, "1"

    goto :goto_1

    :cond_1
    const-string v0, "0"

    :goto_1
    move-object v5, v0

    if-eqz p1, :cond_2

    const-string p1, "1"

    goto :goto_2

    :cond_2
    const-string p1, "0"

    :goto_2
    move-object v7, p1

    const-string v2, "muteStart"

    const-string v4, "customControlsRequested"

    const-string v6, "clickToExpandRequested"

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/common/util/e;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "initialState"

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ads/rt;->a(Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b2()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/rt;->i:Z

    iget v2, p0, Lcom/google/android/gms/internal/ads/rt;->f:I

    const/4 v3, 0x3

    iput v3, p0, Lcom/google/android/gms/internal/ads/rt;->f:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0, v2, v3, v1, v1}, Lcom/google/android/gms/internal/ads/rt;->b(IIZZ)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final e(Z)V
    .locals 1

    if-eqz p1, :cond_0

    const-string p1, "mute"

    goto :goto_0

    :cond_0
    const-string p1, "unmute"

    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/rt;->a(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final i1()V
    .locals 2

    const-string v0, "play"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/rt;->a(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final j1()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/rt;->d:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/rt;->m:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final p()V
    .locals 2

    const-string v0, "pause"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/rt;->a(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final stop()V
    .locals 2

    const-string v0, "stop"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/rt;->a(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final w0()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rt;->j1()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rt;->c:Ljava/lang/Object;

    monitor-enter v1

    if-nez v0, :cond_0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/rt;->n:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/rt;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v1

    return v0

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
