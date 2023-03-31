.class public final Lcom/google/android/gms/internal/ads/pa1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/mb1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/internal/ads/e50<",
        "TAdT;>;AdT:",
        "Lcom/google/android/gms/internal/ads/k20;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/mb1<",
        "TR;TAdT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/mb1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/mb1<",
            "TR;TAdT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ads/mb1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/mb1<",
            "TR;",
            "Lcom/google/android/gms/internal/ads/za1<",
            "TAdT;>;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/ads/ag1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ag1<",
            "TAdT;>;"
        }
    .end annotation
.end field

.field private d:Lcom/google/android/gms/internal/ads/e50;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/mb1;Lcom/google/android/gms/internal/ads/mb1;Lcom/google/android/gms/internal/ads/ag1;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/mb1<",
            "TR;TAdT;>;",
            "Lcom/google/android/gms/internal/ads/mb1<",
            "TR;",
            "Lcom/google/android/gms/internal/ads/za1<",
            "TAdT;>;>;",
            "Lcom/google/android/gms/internal/ads/ag1<",
            "TAdT;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pa1;->a:Lcom/google/android/gms/internal/ads/mb1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pa1;->b:Lcom/google/android/gms/internal/ads/mb1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/pa1;->c:Lcom/google/android/gms/internal/ads/ag1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/pa1;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/rf1;Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/rf1<",
            "TAdT;>;",
            "Lcom/google/android/gms/internal/ads/nb1;",
            "Lcom/google/android/gms/internal/ads/ob1<",
            "TR;>;)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TAdT;>;"
        }
    .end annotation

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/nb1;->b:Lcom/google/android/gms/internal/ads/lb1;

    invoke-interface {p3, v0}, Lcom/google/android/gms/internal/ads/ob1;->a(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/d50;

    move-result-object p3

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/rf1;->c:Lcom/google/android/gms/internal/ads/k20;

    if-eqz v0, :cond_0

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/d50;->f()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/e50;

    iget-object p3, p1, Lcom/google/android/gms/internal/ads/rf1;->c:Lcom/google/android/gms/internal/ads/k20;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/k20;->e()Lcom/google/android/gms/internal/ads/jb1;

    move-result-object p3

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/e50;->c()Lcom/google/android/gms/internal/ads/jb1;

    move-result-object p2

    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/jb1;->a(Lcom/google/android/gms/internal/ads/jb1;)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/rf1;->c:Lcom/google/android/gms/internal/ads/k20;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/rf1;->b:Lcom/google/android/gms/internal/ads/vd1;

    invoke-interface {p3, p1}, Lcom/google/android/gms/internal/ads/d50;->a(Lcom/google/android/gms/internal/ads/vd1;)Lcom/google/android/gms/internal/ads/d50;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/pa1;->a:Lcom/google/android/gms/internal/ads/mb1;

    new-instance v0, Lcom/google/android/gms/internal/ads/sa1;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ads/sa1;-><init>(Lcom/google/android/gms/internal/ads/d50;)V

    invoke-interface {p1, p2, v0}, Lcom/google/android/gms/internal/ads/mb1;->a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/pa1;->a:Lcom/google/android/gms/internal/ads/mb1;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/mb1;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/e50;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pa1;->d:Lcom/google/android/gms/internal/ads/e50;

    return-object p1
.end method

.method private final declared-synchronized b()Lcom/google/android/gms/internal/ads/e50;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pa1;->d:Lcom/google/android/gms/internal/ads/e50;
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
.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/nb1;",
            "Lcom/google/android/gms/internal/ads/ob1<",
            "TR;>;)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TAdT;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/nb1;->b:Lcom/google/android/gms/internal/ads/lb1;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/ob1;->a(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/d50;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/d50;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/e50;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e50;->b()Lcom/google/android/gms/internal/ads/zd1;

    move-result-object v0

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zd1;->f:Ljava/lang/String;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zd1;->j:Lcom/google/android/gms/internal/ads/bn2;

    new-instance v0, Lcom/google/android/gms/internal/ads/ta1;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/pa1;->e:Ljava/util/concurrent/Executor;

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p2

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/ta1;-><init>(Lcom/google/android/gms/internal/ads/ob1;Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/bn2;Lcom/google/android/gms/internal/ads/uf1;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pa1;->b:Lcom/google/android/gms/internal/ads/mb1;

    invoke-interface {v1, p1, p2}, Lcom/google/android/gms/internal/ads/mb1;->a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/tn1;->b(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/oa1;

    invoke-direct {v2, p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/oa1;-><init>(Lcom/google/android/gms/internal/ads/pa1;Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ta1;Lcom/google/android/gms/internal/ads/ob1;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/pa1;->e:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ads/tn1;->a(Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ta1;Lcom/google/android/gms/internal/ads/ob1;Lcom/google/android/gms/internal/ads/za1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 9

    if-eqz p4, :cond_2

    iget-object v7, p4, Lcom/google/android/gms/internal/ads/za1;->a:Lcom/google/android/gms/internal/ads/uf1;

    new-instance v8, Lcom/google/android/gms/internal/ads/ta1;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/ta1;->a:Lcom/google/android/gms/internal/ads/ob1;

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/ta1;->b:Lcom/google/android/gms/internal/ads/nb1;

    iget-object v3, p2, Lcom/google/android/gms/internal/ads/ta1;->c:Lcom/google/android/gms/internal/ads/rm2;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/ta1;->d:Ljava/lang/String;

    iget-object v5, p2, Lcom/google/android/gms/internal/ads/ta1;->e:Ljava/util/concurrent/Executor;

    iget-object v6, p2, Lcom/google/android/gms/internal/ads/ta1;->f:Lcom/google/android/gms/internal/ads/bn2;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/ta1;-><init>(Lcom/google/android/gms/internal/ads/ob1;Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/bn2;Lcom/google/android/gms/internal/ads/uf1;)V

    iget-object p2, p4, Lcom/google/android/gms/internal/ads/za1;->c:Lcom/google/android/gms/internal/ads/rf1;

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pa1;->d:Lcom/google/android/gms/internal/ads/e50;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/pa1;->c:Lcom/google/android/gms/internal/ads/ag1;

    invoke-virtual {p2, v8}, Lcom/google/android/gms/internal/ads/ag1;->a(Lcom/google/android/gms/internal/ads/gg1;)V

    iget-object p2, p4, Lcom/google/android/gms/internal/ads/za1;->c:Lcom/google/android/gms/internal/ads/rf1;

    invoke-direct {p0, p2, p1, p3}, Lcom/google/android/gms/internal/ads/pa1;->a(Lcom/google/android/gms/internal/ads/rf1;Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/pa1;->c:Lcom/google/android/gms/internal/ads/ag1;

    invoke-virtual {p2, v8}, Lcom/google/android/gms/internal/ads/ag1;->b(Lcom/google/android/gms/internal/ads/gg1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/nb1;->b:Lcom/google/android/gms/internal/ads/lb1;

    invoke-interface {p3, p1}, Lcom/google/android/gms/internal/ads/ob1;->a(Lcom/google/android/gms/internal/ads/lb1;)Lcom/google/android/gms/internal/ads/d50;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/d50;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/e50;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pa1;->d:Lcom/google/android/gms/internal/ads/e50;

    new-instance p1, Lcom/google/android/gms/internal/ads/qa1;

    invoke-direct {p1, p0, p3}, Lcom/google/android/gms/internal/ads/qa1;-><init>(Lcom/google/android/gms/internal/ads/pa1;Lcom/google/android/gms/internal/ads/ob1;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/pa1;->e:Ljava/util/concurrent/Executor;

    invoke-static {p2, p1, p3}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/pa1;->c:Lcom/google/android/gms/internal/ads/ag1;

    invoke-virtual {p2, v8}, Lcom/google/android/gms/internal/ads/ag1;->a(Lcom/google/android/gms/internal/ads/gg1;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/nb1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/nb1;->b:Lcom/google/android/gms/internal/ads/lb1;

    iget-object p4, p4, Lcom/google/android/gms/internal/ads/za1;->b:Lcom/google/android/gms/internal/ads/zf;

    invoke-direct {p2, p1, p4}, Lcom/google/android/gms/internal/ads/nb1;-><init>(Lcom/google/android/gms/internal/ads/lb1;Lcom/google/android/gms/internal/ads/zf;)V

    move-object p1, p2

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/pa1;->a:Lcom/google/android/gms/internal/ads/mb1;

    invoke-interface {p2, p1, p3}, Lcom/google/android/gms/internal/ads/mb1;->a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/pa1;->a:Lcom/google/android/gms/internal/ads/mb1;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/mb1;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/e50;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pa1;->d:Lcom/google/android/gms/internal/ads/e50;

    return-object p1
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/ob1;Lcom/google/android/gms/internal/ads/eg1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 4

    if-eqz p2, :cond_0

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/eg1;->a:Lcom/google/android/gms/internal/ads/rf1;

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/eg1;->b:Lcom/google/android/gms/internal/ads/gg1;

    if-eqz v0, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/ads/ta1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ok2;->p()Lcom/google/android/gms/internal/ads/ok2$c;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ok2$a;->p()Lcom/google/android/gms/internal/ads/ok2$a$a;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/ok2$b;->d:Lcom/google/android/gms/internal/ads/ok2$b;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/ok2$a$a;->a(Lcom/google/android/gms/internal/ads/ok2$b;)Lcom/google/android/gms/internal/ads/ok2$a$a;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ok2$d;->p()Lcom/google/android/gms/internal/ads/ok2$d$a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/ok2$a$a;->a(Lcom/google/android/gms/internal/ads/ok2$d$a;)Lcom/google/android/gms/internal/ads/ok2$a$a;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ok2$c;->a(Lcom/google/android/gms/internal/ads/ok2$a$a;)Lcom/google/android/gms/internal/ads/ok2$c;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast v1, Lcom/google/android/gms/internal/ads/ok2;

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/eg1;->a:Lcom/google/android/gms/internal/ads/rf1;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/rf1;->a:Lcom/google/android/gms/internal/ads/l30;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/l30;->c()Lcom/google/android/gms/internal/ads/x80;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/x80;->b(Lcom/google/android/gms/internal/ads/ok2;)V

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/eg1;->a:Lcom/google/android/gms/internal/ads/rf1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ta1;->b:Lcom/google/android/gms/internal/ads/nb1;

    invoke-direct {p0, p2, v0, p1}, Lcom/google/android/gms/internal/ads/pa1;->a(Lcom/google/android/gms/internal/ads/rf1;Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/nr0;

    const-string p2, "Empty prefetch"

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/nr0;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pa1;->b()Lcom/google/android/gms/internal/ads/e50;

    move-result-object v0

    return-object v0
.end method
