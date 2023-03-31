.class public final Lcom/google/android/gms/internal/ads/ik;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lcom/google/android/gms/internal/ads/bl;

.field private final c:Lcom/google/android/gms/internal/ads/tk;

.field private d:Z

.field private e:Landroid/content/Context;

.field private f:Lcom/google/android/gms/internal/ads/fo;

.field private g:Lcom/google/android/gms/internal/ads/e;

.field private h:Ljava/lang/Boolean;

.field private final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final j:Lcom/google/android/gms/internal/ads/nk;

.field private final k:Ljava/lang/Object;

.field private l:Lcom/google/android/gms/internal/ads/lo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->a:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/bl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bl;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/bl;

    new-instance v0, Lcom/google/android/gms/internal/ads/tk;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->f()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/bl;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/tk;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/yk;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->c:Lcom/google/android/gms/internal/ads/tk;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ik;->d:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->g:Lcom/google/android/gms/internal/ads/e;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->h:Ljava/lang/Boolean;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ik;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Lcom/google/android/gms/internal/ads/nk;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/nk;-><init>(Lcom/google/android/gms/internal/ads/kk;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->j:Lcom/google/android/gms/internal/ads/nk;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->k:Ljava/lang/Object;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ik;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ik;->e:Landroid/content/Context;

    return-object p0
.end method

.method private static a(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-static {p0}, Lb/c/b/a/c/q/c;->a(Landroid/content/Context;)Lb/c/b/a/c/q/b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/16 v2, 0x1000

    invoke-virtual {v1, p0, v2}, Lb/c/b/a/c/q/b;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    array-length v3, v2

    if-ge v1, v3, :cond_2

    iget-object v3, p0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    aget v3, v3, v1

    and-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_1

    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    :cond_2
    :goto_1
    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/ik;)Lcom/google/android/gms/internal/ads/fo;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ik;->f:Lcom/google/android/gms/internal/ads/fo;

    return-object p0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/ik;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ik;->a:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ads/ik;)Lcom/google/android/gms/internal/ads/e;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ik;->g:Lcom/google/android/gms/internal/ads/e;

    return-object p0
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->e:Landroid/content/Context;

    return-object v0
.end method

.method public final a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)V
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/ik;->d:Z

    if-nez v1, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->e:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ik;->f:Lcom/google/android/gms/internal/ads/fo;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->f()Lcom/google/android/gms/internal/ads/sh2;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ik;->c:Lcom/google/android/gms/internal/ads/tk;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/sh2;->a(Lcom/google/android/gms/internal/ads/xh2;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/bl;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ik;->e:Landroid/content/Context;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3}, Lcom/google/android/gms/internal/ads/bl;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ik;->f:Lcom/google/android/gms/internal/ads/fo;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/bf;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)Lcom/google/android/gms/internal/ads/ff;

    new-instance v1, Lcom/google/android/gms/internal/ads/ch2;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/ik;->f:Lcom/google/android/gms/internal/ads/fo;

    invoke-direct {v1, v2, v5}, Lcom/google/android/gms/internal/ads/ch2;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->l()Lcom/google/android/gms/internal/ads/g;

    sget-object v1, Lcom/google/android/gms/internal/ads/j0;->c:Lcom/google/android/gms/internal/ads/b0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/b0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "CsiReporterFactory: CSI is not enabled. No CSI reporter created."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/google/android/gms/internal/ads/e;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/e;-><init>()V

    :goto_0
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/ik;->g:Lcom/google/android/gms/internal/ads/e;

    if-eqz v4, :cond_1

    new-instance v1, Lcom/google/android/gms/internal/ads/kk;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/kk;-><init>(Lcom/google/android/gms/internal/ads/ik;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sk;->b()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v1

    const-string v2, "AppState.registerCsiReporter"

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/no;->a(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/String;)V

    :cond_1
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/ik;->d:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ik;->j()Lcom/google/android/gms/internal/ads/lo1;

    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v0

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ik;->h:Ljava/lang/Boolean;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->f:Lcom/google/android/gms/internal/ads/fo;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/bf;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)Lcom/google/android/gms/internal/ads/ff;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ff;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public final b()Landroid/content/res/Resources;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->f:Lcom/google/android/gms/internal/ads/fo;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/fo;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/bo;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/do; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    const-string v2, "Cannot load resource from dynamite apk or local jar"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->f:Lcom/google/android/gms/internal/ads/fo;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/bf;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)Lcom/google/android/gms/internal/ads/ff;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/w0;->g:Lcom/google/android/gms/internal/ads/b0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/b0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->floatValue()F

    move-result v1

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/ff;->a(Ljava/lang/Throwable;Ljava/lang/String;F)V

    return-void
.end method

.method public final c()Lcom/google/android/gms/internal/ads/e;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->g:Lcom/google/android/gms/internal/ads/e;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->h:Ljava/lang/Boolean;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->j:Lcom/google/android/gms/internal/ads/nk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nk;->a()V

    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-void
.end method

.method public final h()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final i()Lcom/google/android/gms/internal/ads/yk;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->b:Lcom/google/android/gms/internal/ads/bl;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/util/l;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->e:Landroid/content/Context;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->b1:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->l:Lcom/google/android/gms/internal/ads/lo1;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->l:Lcom/google/android/gms/internal/ads/lo1;

    monitor-exit v0

    return-object v1

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/ads/jo;->a:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v2, Lcom/google/android/gms/internal/ads/lk;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/lk;-><init>(Lcom/google/android/gms/internal/ads/ik;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/ko1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ik;->l:Lcom/google/android/gms/internal/ads/lo1;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lcom/google/android/gms/internal/ads/tk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->c:Lcom/google/android/gms/internal/ads/tk;

    return-object v0
.end method

.method final synthetic l()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ik;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vg;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ik;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
