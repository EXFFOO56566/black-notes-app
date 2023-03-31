.class public final Lcom/google/android/gms/internal/ads/wc1;
.super Lcom/google/android/gms/internal/ads/ai;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/pc1;

.field private final c:Lcom/google/android/gms/internal/ads/rb1;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/google/android/gms/internal/ads/td1;

.field private final f:Landroid/content/Context;

.field private g:Lcom/google/android/gms/internal/ads/ck0;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/pc1;Landroid/content/Context;Lcom/google/android/gms/internal/ads/rb1;Lcom/google/android/gms/internal/ads/td1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ai;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wc1;->d:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wc1;->b:Lcom/google/android/gms/internal/ads/pc1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/wc1;->c:Lcom/google/android/gms/internal/ads/rb1;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/wc1;->e:Lcom/google/android/gms/internal/ads/td1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/wc1;->f:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/wc1;)Lcom/google/android/gms/internal/ads/ck0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;

    return-object p0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/wc1;Lcom/google/android/gms/internal/ads/ck0;)Lcom/google/android/gms/internal/ads/ck0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;

    return-object p1
.end method

.method private final declared-synchronized a(Lcom/google/android/gms/internal/ads/rm2;Lcom/google/android/gms/internal/ads/di;I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->c:Lcom/google/android/gms/internal/ads/rb1;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/internal/ads/di;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wc1;->f:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/gl;->p(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/rm2;->t:Lcom/google/android/gms/internal/ads/lm2;

    if-nez p2, :cond_0

    const-string p1, "Failed to load the ad because app ID is missing."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wc1;->c:Lcom/google/android/gms/internal/ads/rb1;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/rb1;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    new-instance p2, Lcom/google/android/gms/internal/ads/mc1;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/mc1;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->b:Lcom/google/android/gms/internal/ads/pc1;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/pc1;->a(I)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/wc1;->b:Lcom/google/android/gms/internal/ads/pc1;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->d:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/ads/yc1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/yc1;-><init>(Lcom/google/android/gms/internal/ads/wc1;)V

    invoke-virtual {p3, p1, v0, p2, v1}, Lcom/google/android/gms/internal/ads/pc1;->a(Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/c01;Lcom/google/android/gms/internal/ads/f01;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final I0()Lcom/google/android/gms/internal/ads/wh;
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ck0;->i()Lcom/google/android/gms/internal/ads/wh;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final M()Z
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ck0;->h()Z

    move-result v0

    if-nez v0, :cond_0

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->d()Lcom/google/android/gms/internal/ads/p50;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;

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

.method public final declared-synchronized a(Lb/c/b/a/d/a;Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;

    if-nez v0, :cond_0

    const-string p1, "Rewarded can not be shown before loaded"

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wc1;->c:Lcom/google/android/gms/internal/ads/rb1;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/rb1;->d(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;

    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/ck0;->a(ZLandroid/app/Activity;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/bi;)V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->c:Lcom/google/android/gms/internal/ads/rb1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/internal/ads/bi;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/gi;)V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->c:Lcom/google/android/gms/internal/ads/rb1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/internal/ads/gi;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/gp2;)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wc1;->c:Lcom/google/android/gms/internal/ads/rb1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/ads/x/a;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->c:Lcom/google/android/gms/internal/ads/rb1;

    new-instance v1, Lcom/google/android/gms/internal/ads/vc1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/vc1;-><init>(Lcom/google/android/gms/internal/ads/wc1;Lcom/google/android/gms/internal/ads/gp2;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/ads/x/a;)V

    return-void
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/ji;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->e:Lcom/google/android/gms/internal/ads/td1;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/ji;->b:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/td1;->a:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->n0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/ji;->c:Ljava/lang/String;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/td1;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/lp2;)V
    .locals 1

    const-string v0, "setOnPaidEventListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->c:Lcom/google/android/gms/internal/ads/rb1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/rb1;->a(Lcom/google/android/gms/internal/ads/lp2;)V

    return-void
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/rm2;Lcom/google/android/gms/internal/ads/di;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    sget v0, Lcom/google/android/gms/internal/ads/qd1;->b:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/wc1;->a(Lcom/google/android/gms/internal/ads/rm2;Lcom/google/android/gms/internal/ads/di;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b(Lcom/google/android/gms/internal/ads/rm2;Lcom/google/android/gms/internal/ads/di;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    sget v0, Lcom/google/android/gms/internal/ads/qd1;->c:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/wc1;->a(Lcom/google/android/gms/internal/ads/rm2;Lcom/google/android/gms/internal/ads/di;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final j()Lcom/google/android/gms/internal/ads/mp2;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->A3:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->d()Lcom/google/android/gms/internal/ads/p50;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public final v()Landroid/os/Bundle;
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wc1;->g:Lcom/google/android/gms/internal/ads/ck0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ck0;->f()Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final declared-synchronized x(Lb/c/b/a/d/a;)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/wc1;->a(Lb/c/b/a/d/a;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
