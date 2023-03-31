.class public final Lcom/google/android/gms/internal/ads/p91;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/d01;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/d01<",
        "Lcom/google/android/gms/internal/ads/h00;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lcom/google/android/gms/internal/ads/kv;

.field private final d:Lcom/google/android/gms/internal/ads/ea1;

.field private final e:Lcom/google/android/gms/internal/ads/mb1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/mb1<",
            "Lcom/google/android/gms/internal/ads/b00;",
            "Lcom/google/android/gms/internal/ads/h00;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Landroid/view/ViewGroup;

.field private final g:Lcom/google/android/gms/internal/ads/be1;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private h:Lcom/google/android/gms/internal/ads/lo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/h00;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/kv;Lcom/google/android/gms/internal/ads/mb1;Lcom/google/android/gms/internal/ads/ea1;Lcom/google/android/gms/internal/ads/be1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/internal/ads/kv;",
            "Lcom/google/android/gms/internal/ads/mb1<",
            "Lcom/google/android/gms/internal/ads/b00;",
            "Lcom/google/android/gms/internal/ads/h00;",
            ">;",
            "Lcom/google/android/gms/internal/ads/ea1;",
            "Lcom/google/android/gms/internal/ads/be1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/p91;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/p91;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/p91;->c:Lcom/google/android/gms/internal/ads/kv;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/p91;->e:Lcom/google/android/gms/internal/ads/mb1;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/p91;->d:Lcom/google/android/gms/internal/ads/ea1;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/p91;->g:Lcom/google/android/gms/internal/ads/be1;

    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/p91;->f:Landroid/view/ViewGroup;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/p91;Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/a00;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/p91;->b(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/a00;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/p91;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/p91;->h:Lcom/google/android/gms/internal/ads/lo1;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/p91;)Lcom/google/android/gms/internal/ads/mb1;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/p91;->e:Lcom/google/android/gms/internal/ads/mb1;

    return-object p0
.end method

.method private final declared-synchronized b(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/a00;
    .locals 4

    monitor-enter p0

    :try_start_0
    check-cast p1, Lcom/google/android/gms/internal/ads/u91;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p91;->d:Lcom/google/android/gms/internal/ads/ea1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ea1;->a(Lcom/google/android/gms/internal/ads/ea1;)Lcom/google/android/gms/internal/ads/ea1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/k90$a;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/k90$a;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/p91;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/k90$a;->a(Lcom/google/android/gms/internal/ads/a60;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/k90$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/p91;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/k90$a;->a(Lcom/google/android/gms/internal/ads/q70;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/k90$a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/k90$a;->a(Lcom/google/android/gms/internal/ads/jb1;)Lcom/google/android/gms/internal/ads/k90$a;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p91;->c:Lcom/google/android/gms/internal/ads/kv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kv;->i()Lcom/google/android/gms/internal/ads/a00;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/i00;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/p91;->f:Landroid/view/ViewGroup;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/i00;-><init>(Landroid/view/ViewGroup;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/a00;->b(Lcom/google/android/gms/internal/ads/i00;)Lcom/google/android/gms/internal/ads/a00;

    new-instance v2, Lcom/google/android/gms/internal/ads/g50$a;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/g50$a;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/p91;->a:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/g50$a;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/g50$a;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/u91;->a:Lcom/google/android/gms/internal/ads/zd1;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/g50$a;->a(Lcom/google/android/gms/internal/ads/zd1;)Lcom/google/android/gms/internal/ads/g50$a;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/g50$a;->a()Lcom/google/android/gms/internal/ads/g50;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/a00;->e(Lcom/google/android/gms/internal/ads/g50;)Lcom/google/android/gms/internal/ads/a00;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/k90$a;->a()Lcom/google/android/gms/internal/ads/k90;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/a00;->d(Lcom/google/android/gms/internal/ads/k90;)Lcom/google/android/gms/internal/ads/a00;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/p91;)Lcom/google/android/gms/internal/ads/ea1;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/p91;->d:Lcom/google/android/gms/internal/ads/ea1;

    return-object p0
.end method


# virtual methods
.method final synthetic a(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/a00;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/p91;->b(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/a00;

    move-result-object p1

    return-object p1
.end method

.method final synthetic a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p91;->d:Lcom/google/android/gms/internal/ads/ea1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ea1;->a(I)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/bn2;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p91;->g:Lcom/google/android/gms/internal/ads/be1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/be1;->a(Lcom/google/android/gms/internal/ads/bn2;)Lcom/google/android/gms/internal/ads/be1;

    return-void
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/c01;Lcom/google/android/gms/internal/ads/f01;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/rm2;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/c01;",
            "Lcom/google/android/gms/internal/ads/f01<",
            "-",
            "Lcom/google/android/gms/internal/ads/h00;",
            ">;)Z"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string p3, "loadAd must be called on the main UI thread."

    invoke-static {p3}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    const/4 p3, 0x0

    if-nez p2, :cond_0

    const-string p1, "Ad unit ID should not be null for app open ad."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/p91;->b:Ljava/util/concurrent/Executor;

    new-instance p2, Lcom/google/android/gms/internal/ads/t91;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/t91;-><init>(Lcom/google/android/gms/internal/ads/p91;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p3

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p91;->h:Lcom/google/android/gms/internal/ads/lo1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    return p3

    :cond_1
    :try_start_2
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/p91;->a:Landroid/content/Context;

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/rm2;->g:Z

    invoke-static {p3, v0}, Lcom/google/android/gms/internal/ads/ie1;->a(Landroid/content/Context;Z)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/p91;->g:Lcom/google/android/gms/internal/ads/be1;

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/be1;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/be1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/um2;->i()Lcom/google/android/gms/internal/ads/um2;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/be1;->a(Lcom/google/android/gms/internal/ads/um2;)Lcom/google/android/gms/internal/ads/be1;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/be1;->a(Lcom/google/android/gms/internal/ads/rm2;)Lcom/google/android/gms/internal/ads/be1;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/be1;->d()Lcom/google/android/gms/internal/ads/zd1;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/u91;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/u91;-><init>(Lcom/google/android/gms/internal/ads/v91;)V

    iput-object p1, p2, Lcom/google/android/gms/internal/ads/u91;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/p91;->e:Lcom/google/android/gms/internal/ads/mb1;

    new-instance p3, Lcom/google/android/gms/internal/ads/nb1;

    invoke-direct {p3, p2}, Lcom/google/android/gms/internal/ads/nb1;-><init>(Lcom/google/android/gms/internal/ads/lb1;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/s91;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/s91;-><init>(Lcom/google/android/gms/internal/ads/p91;)V

    invoke-interface {p1, p3, v0}, Lcom/google/android/gms/internal/ads/mb1;->a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/p91;->h:Lcom/google/android/gms/internal/ads/lo1;

    new-instance p3, Lcom/google/android/gms/internal/ads/v91;

    invoke-direct {p3, p0, p4, p2}, Lcom/google/android/gms/internal/ads/v91;-><init>(Lcom/google/android/gms/internal/ads/p91;Lcom/google/android/gms/internal/ads/f01;Lcom/google/android/gms/internal/ads/u91;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/p91;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p3, p2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 p1, 0x1

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p91;->h:Lcom/google/android/gms/internal/ads/lo1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
