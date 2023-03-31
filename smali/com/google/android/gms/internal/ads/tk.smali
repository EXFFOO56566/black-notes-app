.class public final Lcom/google/android/gms/internal/ads/tk;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/xh2;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lcom/google/android/gms/internal/ads/yk;

.field private final c:Lcom/google/android/gms/internal/ads/rk;

.field private final d:Lcom/google/android/gms/internal/ads/pk;

.field private final e:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/google/android/gms/internal/ads/hk;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/google/android/gms/internal/ads/qk;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/yk;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/tk;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/tk;->e:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/tk;->f:Ljava/util/HashSet;

    new-instance v0, Lcom/google/android/gms/internal/ads/pk;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/pk;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/yk;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/tk;->d:Lcom/google/android/gms/internal/ads/pk;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/tk;->b:Lcom/google/android/gms/internal/ads/yk;

    new-instance p1, Lcom/google/android/gms/internal/ads/rk;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/rk;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tk;->c:Lcom/google/android/gms/internal/ads/rk;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ok;)Landroid/os/Bundle;
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tk;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tk;->e:Ljava/util/HashSet;

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tk;->e:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->clear()V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tk;->d:Lcom/google/android/gms/internal/ads/pk;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/tk;->c:Lcom/google/android/gms/internal/ads/rk;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/rk;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Lcom/google/android/gms/internal/ads/pk;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    const-string v2, "app"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tk;->f:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v2, "slots"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/hk;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/hk;->a()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v2, "ads"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/ok;->a(Ljava/util/HashSet;)V

    return-object v1

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/qk;

    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Lcom/google/android/gms/common/util/d;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/hk;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/hk;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tk;->c:Lcom/google/android/gms/internal/ads/rk;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rk;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, p0, v1, p2}, Lcom/google/android/gms/internal/ads/hk;-><init>(Lcom/google/android/gms/common/util/d;Lcom/google/android/gms/internal/ads/tk;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tk;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tk;->d:Lcom/google/android/gms/internal/ads/pk;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/pk;->a()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/hk;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tk;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tk;->e:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rm2;J)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tk;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tk;->d:Lcom/google/android/gms/internal/ads/pk;

    invoke-virtual {v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/pk;->a(Lcom/google/android/gms/internal/ads/rm2;J)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Ljava/util/HashSet;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Lcom/google/android/gms/internal/ads/hk;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tk;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tk;->e:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Z)V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/tk;->b:Lcom/google/android/gms/internal/ads/yk;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/yk;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    sget-object p1, Lcom/google/android/gms/internal/ads/zr2;->p0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/tk;->d:Lcom/google/android/gms/internal/ads/pk;

    const/4 v0, -0x1

    iput v0, p1, Lcom/google/android/gms/internal/ads/pk;->d:I

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/tk;->d:Lcom/google/android/gms/internal/ads/pk;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tk;->b:Lcom/google/android/gms/internal/ads/yk;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/yk;->a()I

    move-result v0

    iput v0, p1, Lcom/google/android/gms/internal/ads/pk;->d:I

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/tk;->b:Lcom/google/android/gms/internal/ads/yk;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/yk;->a(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/tk;->b:Lcom/google/android/gms/internal/ads/yk;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tk;->d:Lcom/google/android/gms/internal/ads/pk;

    iget v0, v0, Lcom/google/android/gms/internal/ads/pk;->d:I

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/yk;->b(I)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tk;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tk;->d:Lcom/google/android/gms/internal/ads/pk;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/pk;->b()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
