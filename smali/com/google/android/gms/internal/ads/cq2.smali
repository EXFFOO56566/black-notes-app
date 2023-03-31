.class public final Lcom/google/android/gms/internal/ads/cq2;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static e:Lcom/google/android/gms/internal/ads/cq2;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private static final f:Ljava/lang/Object;


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/vo2;

.field private b:Lcom/google/android/gms/ads/x/c;

.field private c:Lcom/google/android/gms/ads/n;

.field private d:Lcom/google/android/gms/ads/v/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/cq2;->f:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/n$a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/n$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/n$a;->a()Lcom/google/android/gms/ads/n;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/cq2;->c:Lcom/google/android/gms/ads/n;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/cq2;Ljava/util/List;)Lcom/google/android/gms/ads/v/b;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/cq2;->a(Ljava/util/List;)Lcom/google/android/gms/ads/v/b;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/util/List;)Lcom/google/android/gms/ads/v/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/e6;",
            ">;)",
            "Lcom/google/android/gms/ads/v/b;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/e6;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/e6;->b:Ljava/lang/String;

    new-instance v3, Lcom/google/android/gms/internal/ads/m6;

    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/e6;->c:Z

    if-eqz v4, :cond_0

    sget-object v4, Lcom/google/android/gms/ads/v/a;->c:Lcom/google/android/gms/ads/v/a;

    goto :goto_1

    :cond_0
    sget-object v4, Lcom/google/android/gms/ads/v/a;->b:Lcom/google/android/gms/ads/v/a;

    :goto_1
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/e6;->e:Ljava/lang/String;

    iget v1, v1, Lcom/google/android/gms/internal/ads/e6;->d:I

    invoke-direct {v3, v4, v5, v1}, Lcom/google/android/gms/internal/ads/m6;-><init>(Lcom/google/android/gms/ads/v/a;Ljava/lang/String;I)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p0, Lcom/google/android/gms/internal/ads/p6;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/p6;-><init>(Ljava/util/Map;)V

    return-object p0
.end method

.method private final a(Lcom/google/android/gms/ads/n;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cq2;->a:Lcom/google/android/gms/internal/ads/vo2;

    new-instance v1, Lcom/google/android/gms/internal/ads/yq2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/yq2;-><init>(Lcom/google/android/gms/ads/n;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/vo2;->a(Lcom/google/android/gms/internal/ads/yq2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Unable to set request configuration parcel."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static c()Lcom/google/android/gms/internal/ads/cq2;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/cq2;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/cq2;->e:Lcom/google/android/gms/internal/ads/cq2;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/cq2;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/cq2;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/ads/cq2;->e:Lcom/google/android/gms/internal/ads/cq2;

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/cq2;->e:Lcom/google/android/gms/internal/ads/cq2;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/ads/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cq2;->c:Lcom/google/android/gms/ads/n;

    return-object v0
.end method

.method public final a(Landroid/content/Context;)Lcom/google/android/gms/ads/x/c;
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/ads/cq2;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cq2;->b:Lcom/google/android/gms/ads/x/c;

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/cq2;->b:Lcom/google/android/gms/ads/x/c;

    monitor-exit v0

    return-object p1

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/oa;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/oa;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->b()Lcom/google/android/gms/internal/ads/cn2;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/mn2;

    invoke-direct {v3, v2, p1, v1}, Lcom/google/android/gms/internal/ads/mn2;-><init>(Lcom/google/android/gms/internal/ads/cn2;Landroid/content/Context;Lcom/google/android/gms/internal/ads/ra;)V

    const/4 v1, 0x0

    invoke-virtual {v3, p1, v1}, Lcom/google/android/gms/internal/ads/ln2;->a(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/bh;

    new-instance v2, Lcom/google/android/gms/internal/ads/mh;

    invoke-direct {v2, p1, v1}, Lcom/google/android/gms/internal/ads/mh;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/bh;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/cq2;->b:Lcom/google/android/gms/ads/x/c;

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/v/c;)V
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/ads/cq2;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cq2;->a:Lcom/google/android/gms/internal/ads/vo2;

    if-eqz v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_0
    if-eqz p1, :cond_5

    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/ja;->a()Lcom/google/android/gms/internal/ads/ja;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/ads/ja;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Thread;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->b()Lcom/google/android/gms/internal/ads/cn2;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/jn2;

    invoke-direct {v2, v1, p1}, Lcom/google/android/gms/internal/ads/jn2;-><init>(Lcom/google/android/gms/internal/ads/cn2;Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v2, p1, v1}, Lcom/google/android/gms/internal/ads/ln2;->a(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/vo2;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/cq2;->a:Lcom/google/android/gms/internal/ads/vo2;

    if-eqz p3, :cond_1

    new-instance v2, Lcom/google/android/gms/internal/ads/kq2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p3, v3}, Lcom/google/android/gms/internal/ads/kq2;-><init>(Lcom/google/android/gms/internal/ads/cq2;Lcom/google/android/gms/ads/v/c;Lcom/google/android/gms/internal/ads/hq2;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/vo2;->a(Lcom/google/android/gms/internal/ads/l6;)V

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cq2;->a:Lcom/google/android/gms/internal/ads/vo2;

    new-instance v2, Lcom/google/android/gms/internal/ads/oa;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/oa;-><init>()V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/vo2;->a(Lcom/google/android/gms/internal/ads/ra;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cq2;->a:Lcom/google/android/gms/internal/ads/vo2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/vo2;->L()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cq2;->a:Lcom/google/android/gms/internal/ads/vo2;

    new-instance v2, Lcom/google/android/gms/internal/ads/fq2;

    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/internal/ads/fq2;-><init>(Lcom/google/android/gms/internal/ads/cq2;Landroid/content/Context;)V

    invoke-static {v2}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v2

    invoke-interface {v1, p2, v2}, Lcom/google/android/gms/internal/ads/vo2;->b(Ljava/lang/String;Lb/c/b/a/d/a;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/cq2;->c:Lcom/google/android/gms/ads/n;

    invoke-virtual {p2}, Lcom/google/android/gms/ads/n;->b()I

    move-result p2

    const/4 v1, -0x1

    if-ne p2, v1, :cond_2

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/cq2;->c:Lcom/google/android/gms/ads/n;

    invoke-virtual {p2}, Lcom/google/android/gms/ads/n;->c()I

    move-result p2

    if-eq p2, v1, :cond_3

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/cq2;->c:Lcom/google/android/gms/ads/n;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/cq2;->a(Lcom/google/android/gms/ads/n;)V

    :cond_3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zr2;->a(Landroid/content/Context;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/zr2;->p2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/cq2;->b()Ljava/lang/String;

    move-result-object p1

    const-string p2, "0"

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/iq2;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/iq2;-><init>(Lcom/google/android/gms/internal/ads/cq2;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cq2;->d:Lcom/google/android/gms/ads/v/b;

    if-eqz p3, :cond_4

    sget-object p1, Lcom/google/android/gms/internal/ads/sn;->b:Landroid/os/Handler;

    new-instance p2, Lcom/google/android/gms/internal/ads/eq2;

    invoke-direct {p2, p0, p3}, Lcom/google/android/gms/internal/ads/eq2;-><init>(Lcom/google/android/gms/internal/ads/cq2;Lcom/google/android/gms/ads/v/c;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    const-string p2, "MobileAdsSettingManager initialization failed"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    monitor-exit v0

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Context cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method final synthetic a(Lcom/google/android/gms/ads/v/c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cq2;->d:Lcom/google/android/gms/ads/v/b;

    invoke-interface {p1, v0}, Lcom/google/android/gms/ads/v/c;->a(Lcom/google/android/gms/ads/v/b;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cq2;->a:Lcom/google/android/gms/internal/ads/vo2;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "MobileAds.initialize() must be called prior to getting version string."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/r;->b(ZLjava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cq2;->a:Lcom/google/android/gms/internal/ads/vo2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/vo2;->W1()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/kl1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Unable to get version string."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v0, ""

    return-object v0
.end method
