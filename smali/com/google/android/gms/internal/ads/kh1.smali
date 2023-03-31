.class public final Lcom/google/android/gms/internal/ads/kh1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/ads/lo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/lo1<",
            "*>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/android/gms/internal/ads/lo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TO;>;"
        }
    .end annotation
.end field

.field final synthetic f:Lcom/google/android/gms/internal/ads/eh1;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/eh1;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/ads/lo1;Ljava/util/List;Lcom/google/android/gms/internal/ads/lo1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "*>;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "*>;>;",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TO;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/kh1;->a:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/kh1;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/kh1;->c:Lcom/google/android/gms/internal/ads/lo1;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/kh1;->d:Ljava/util/List;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/kh1;->e:Lcom/google/android/gms/internal/ads/lo1;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/eh1;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/ads/lo1;Ljava/util/List;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/dh1;)V
    .locals 7

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/kh1;-><init>(Lcom/google/android/gms/internal/ads/eh1;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/ads/lo1;Ljava/util/List;Lcom/google/android/gms/internal/ads/lo1;)V

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/kh1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O2:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ln1<",
            "TO;TO2;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/internal/ads/kh1<",
            "TO2;>;"
        }
    .end annotation

    new-instance v7, Lcom/google/android/gms/internal/ads/kh1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kh1;->a:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/kh1;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/kh1;->c:Lcom/google/android/gms/internal/ads/lo1;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/kh1;->d:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kh1;->e:Lcom/google/android/gms/internal/ads/lo1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/kh1;-><init>(Lcom/google/android/gms/internal/ads/eh1;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/ads/lo1;Ljava/util/List;Lcom/google/android/gms/internal/ads/lo1;)V

    return-object v7
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/bh1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/bh1<",
            "TE;TO;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/bh1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kh1;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kh1;->b:Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/eh1;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/kh1;->e:Lcom/google/android/gms/internal/ads/lo1;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/bh1;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/ads/lo1;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/eh1;->c(Lcom/google/android/gms/internal/ads/eh1;)Lcom/google/android/gms/internal/ads/qh1;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/qh1;->a(Lcom/google/android/gms/internal/ads/bh1;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kh1;->c:Lcom/google/android/gms/internal/ads/lo1;

    new-instance v2, Lcom/google/android/gms/internal/ads/oh1;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/oh1;-><init>(Lcom/google/android/gms/internal/ads/kh1;Lcom/google/android/gms/internal/ads/bh1;)V

    sget-object v3, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/ads/lo1;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/nh1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/nh1;-><init>(Lcom/google/android/gms/internal/ads/kh1;Lcom/google/android/gms/internal/ads/bh1;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/zn1;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public final a(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/internal/ads/kh1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lcom/google/android/gms/internal/ads/kh1<",
            "TO;>;"
        }
    .end annotation

    new-instance v7, Lcom/google/android/gms/internal/ads/kh1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kh1;->a:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/kh1;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/kh1;->c:Lcom/google/android/gms/internal/ads/lo1;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/kh1;->d:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kh1;->e:Lcom/google/android/gms/internal/ads/lo1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/eh1;->b(Lcom/google/android/gms/internal/ads/eh1;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    invoke-static {v0, p1, p2, p3, v6}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/kh1;-><init>(Lcom/google/android/gms/internal/ads/eh1;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/ads/lo1;Ljava/util/List;Lcom/google/android/gms/internal/ads/lo1;)V

    return-object v7
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/kh1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O2:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ln1<",
            "TO;TO2;>;)",
            "Lcom/google/android/gms/internal/ads/kh1<",
            "TO2;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/eh1;->a(Lcom/google/android/gms/internal/ads/eh1;)Lcom/google/android/gms/internal/ads/ko1;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/kh1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O2:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TO2;>;)",
            "Lcom/google/android/gms/internal/ads/kh1<",
            "TO2;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/mh1;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/mh1;-><init>(Lcom/google/android/gms/internal/ads/lo1;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/jo;->f:Lcom/google/android/gms/internal/ads/ko1;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zg1;)Lcom/google/android/gms/internal/ads/kh1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O2:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/zg1<",
            "TO;TO2;>;)",
            "Lcom/google/android/gms/internal/ads/kh1<",
            "TO2;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/jh1;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/jh1;-><init>(Lcom/google/android/gms/internal/ads/zg1;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/kh1;->a(Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/kh1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/ln1<",
            "TT;TO;>;)",
            "Lcom/google/android/gms/internal/ads/kh1<",
            "TO;>;"
        }
    .end annotation

    new-instance v7, Lcom/google/android/gms/internal/ads/kh1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kh1;->a:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/kh1;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/kh1;->c:Lcom/google/android/gms/internal/ads/lo1;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/kh1;->d:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kh1;->e:Lcom/google/android/gms/internal/ads/lo1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/eh1;->a(Lcom/google/android/gms/internal/ads/eh1;)Lcom/google/android/gms/internal/ads/ko1;

    move-result-object v6

    invoke-static {v0, p1, p2, v6}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/kh1;-><init>(Lcom/google/android/gms/internal/ads/eh1;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/ads/lo1;Ljava/util/List;Lcom/google/android/gms/internal/ads/lo1;)V

    return-object v7
.end method

.method public final a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zg1;)Lcom/google/android/gms/internal/ads/kh1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/zg1<",
            "TT;TO;>;)",
            "Lcom/google/android/gms/internal/ads/kh1<",
            "TO;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/lh1;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/lh1;-><init>(Lcom/google/android/gms/internal/ads/zg1;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/kh1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/kh1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lcom/google/android/gms/internal/ads/kh1<",
            "TO;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/kh1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/ads/kh1<",
            "TO;>;"
        }
    .end annotation

    new-instance v7, Lcom/google/android/gms/internal/ads/kh1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kh1;->a:Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/kh1;->c:Lcom/google/android/gms/internal/ads/lo1;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/kh1;->d:Ljava/util/List;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/kh1;->e:Lcom/google/android/gms/internal/ads/lo1;

    move-object v0, v7

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/kh1;-><init>(Lcom/google/android/gms/internal/ads/eh1;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/ads/lo1;Ljava/util/List;Lcom/google/android/gms/internal/ads/lo1;)V

    return-object v7
.end method
