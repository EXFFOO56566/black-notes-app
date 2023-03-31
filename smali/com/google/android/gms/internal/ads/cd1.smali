.class public final Lcom/google/android/gms/internal/ads/cd1;
.super Lcom/google/android/gms/internal/ads/ah;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/pc1;

.field private final c:Lcom/google/android/gms/internal/ads/rb1;

.field private final d:Lcom/google/android/gms/internal/ads/td1;

.field private e:Lcom/google/android/gms/internal/ads/ck0;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private f:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/pc1;Lcom/google/android/gms/internal/ads/rb1;Lcom/google/android/gms/internal/ads/td1;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ah;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/cd1;->f:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cd1;->b:Lcom/google/android/gms/internal/ads/pc1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cd1;->c:Lcom/google/android/gms/internal/ads/rb1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/cd1;->d:Lcom/google/android/gms/internal/ads/td1;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/cd1;)Lcom/google/android/gms/internal/ads/ck0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    return-object p0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/cd1;Lcom/google/android/gms/internal/ads/ck0;)Lcom/google/android/gms/internal/ads/ck0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    return-object p1
.end method

.method private final declared-synchronized b2()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ck0;->g()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized M(Lb/c/b/a/d/a;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->c:Lcom/google/android/gms/internal/ads/rb1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/ads/x/a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/k20;->c()Lcom/google/android/gms/internal/ads/p60;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/p60;->d(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final M()Z
    .locals 1

    const-string v0, "isLoaded must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/cd1;->b2()Z

    move-result v0

    return v0
.end method

.method public final declared-synchronized P()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/cd1;->p(Lb/c/b/a/d/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final S1()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ck0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final declared-synchronized a()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->d()Lcom/google/android/gms/internal/ads/p50;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->d()Lcom/google/android/gms/internal/ads/p50;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p50;->a()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/eh;)V
    .locals 1

    const-string v0, "setRewardedVideoAdListener can only be called from the UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->c:Lcom/google/android/gms/internal/ads/rb1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/internal/ads/eh;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/io2;)V
    .locals 2

    const-string v0, "setAdMetadataListener can only be called from the UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/cd1;->c:Lcom/google/android/gms/internal/ads/rb1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/ads/x/a;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->c:Lcom/google/android/gms/internal/ads/rb1;

    new-instance v1, Lcom/google/android/gms/internal/ads/ed1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/ed1;-><init>(Lcom/google/android/gms/internal/ads/cd1;Lcom/google/android/gms/internal/ads/io2;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/ads/x/a;)V

    return-void
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/kh;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/kh;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/d;->a(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/cd1;->b2()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->s2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    new-instance v0, Lcom/google/android/gms/internal/ads/mc1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/mc1;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cd1;->b:Lcom/google/android/gms/internal/ads/pc1;

    sget v2, Lcom/google/android/gms/internal/ads/qd1;->a:I

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pc1;->a(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cd1;->b:Lcom/google/android/gms/internal/ads/pc1;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/kh;->b:Lcom/google/android/gms/internal/ads/rm2;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/kh;->c:Ljava/lang/String;

    new-instance v3, Lcom/google/android/gms/internal/ads/bd1;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ads/bd1;-><init>(Lcom/google/android/gms/internal/ads/cd1;)V

    invoke-virtual {v1, v2, p1, v0, v3}, Lcom/google/android/gms/internal/ads/pc1;->a(Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/c01;Lcom/google/android/gms/internal/ads/f01;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zg;)V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread.: setRewardedAdSkuListener"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->c:Lcom/google/android/gms/internal/ads/rb1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/internal/ads/zg;)V

    return-void
.end method

.method public final declared-synchronized a(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "setImmersiveMode must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/cd1;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized c(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "setUserId must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->d:Lcom/google/android/gms/internal/ads/td1;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/td1;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final destroy()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/cd1;->M(Lb/c/b/a/d/a;)V

    return-void
.end method

.method public final declared-synchronized j()Lcom/google/android/gms/internal/ads/mp2;
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->A3:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    monitor-exit p0

    return-object v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->d()Lcom/google/android/gms/internal/ads/p50;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_1
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final k(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized l(Lb/c/b/a/d/a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->c()Lcom/google/android/gms/internal/ads/p60;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/p60;->b(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final p()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/cd1;->r(Lb/c/b/a/d/a;)V

    return-void
.end method

.method public final declared-synchronized p(Lb/c/b/a/d/a;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "showAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    :try_start_1
    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/app/Activity;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/cd1;->f:Z

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/ck0;->a(ZLandroid/app/Activity;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized r(Lb/c/b/a/d/a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->c()Lcom/google/android/gms/internal/ads/p60;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/p60;->a(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final v()Landroid/os/Bundle;
    .locals 1

    const-string v0, "getAdMetadata can only be called from the UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->e:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ck0;->f()Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final declared-synchronized v(Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->n0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "#008 Must be called on the main UI thread.: setCustomData"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cd1;->d:Lcom/google/android/gms/internal/ads/td1;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/td1;->b:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final z()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/cd1;->l(Lb/c/b/a/d/a;)V

    return-void
.end method
