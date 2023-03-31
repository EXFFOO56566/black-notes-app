.class public final Lcom/google/android/gms/internal/ads/dr0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ko1;

.field private final b:Lcom/google/android/gms/internal/ads/tq0;

.field private final c:Lcom/google/android/gms/internal/ads/l42;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l42<",
            "Lcom/google/android/gms/internal/ads/mr0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ko1;Lcom/google/android/gms/internal/ads/tq0;Lcom/google/android/gms/internal/ads/l42;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/ko1;",
            "Lcom/google/android/gms/internal/ads/tq0;",
            "Lcom/google/android/gms/internal/ads/l42<",
            "Lcom/google/android/gms/internal/ads/mr0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dr0;->a:Lcom/google/android/gms/internal/ads/ko1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dr0;->b:Lcom/google/android/gms/internal/ads/tq0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/dr0;->c:Lcom/google/android/gms/internal/ads/l42;

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/kr0;Lcom/google/android/gms/internal/ads/kr0;Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RetT:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/zf;",
            "Lcom/google/android/gms/internal/ads/kr0<",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/google/android/gms/internal/ads/kr0<",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/google/android/gms/internal/ads/ln1<",
            "Ljava/io/InputStream;",
            "TRetT;>;)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TRetT;>;"
        }
    .end annotation

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zf;->e:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gl;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p2, Lcom/google/android/gms/internal/ads/ar0;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/ar0;-><init>(I)V

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/kr0;->a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p2

    const-class v0, Ljava/util/concurrent/ExecutionException;

    sget-object v1, Lcom/google/android/gms/internal/ads/cr0;->a:Lcom/google/android/gms/internal/ads/ln1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dr0;->a:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p2, v0, v1, v2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/tn1;->b(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dr0;->a:Lcom/google/android/gms/internal/ads/ko1;

    invoke-virtual {p2, p4, v0}, Lcom/google/android/gms/internal/ads/tn1;->a(Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/tn1;

    move-result-object p2

    const-class v0, Lcom/google/android/gms/internal/ads/ar0;

    new-instance v1, Lcom/google/android/gms/internal/ads/fr0;

    invoke-direct {v1, p0, p3, p1, p4}, Lcom/google/android/gms/internal/ads/fr0;-><init>(Lcom/google/android/gms/internal/ads/dr0;Lcom/google/android/gms/internal/ads/kr0;Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/ln1;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dr0;->a:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p2, v0, v1, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/tn1;

    return-object p1
.end method


# virtual methods
.method final synthetic a(Lcom/google/android/gms/internal/ads/kr0;Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/ln1;Lcom/google/android/gms/internal/ads/ar0;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 0

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/kr0;->a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/dr0;->a:Lcom/google/android/gms/internal/ads/ko1;

    invoke-static {p1, p3, p2}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zf;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/zf;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/er0;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/er0;-><init>(Lcom/google/android/gms/internal/ads/zf;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dr0;->b:Lcom/google/android/gms/internal/ads/tq0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/hr0;->a(Lcom/google/android/gms/internal/ads/tq0;)Lcom/google/android/gms/internal/ads/kr0;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/gr0;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/gr0;-><init>(Lcom/google/android/gms/internal/ads/dr0;)V

    invoke-direct {p0, p1, v1, v2, v0}, Lcom/google/android/gms/internal/ads/dr0;->a(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/kr0;Lcom/google/android/gms/internal/ads/kr0;Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zf;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zf;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/q52;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/nr0;

    const/4 v0, 0x1

    const-string v1, "Pool key missing from removeUrl call."

    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/ads/nr0;-><init>(Ljava/lang/String;I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/jr0;->a:Lcom/google/android/gms/internal/ads/ln1;

    new-instance v1, Lcom/google/android/gms/internal/ads/ir0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/ir0;-><init>(Lcom/google/android/gms/internal/ads/dr0;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/lr0;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/lr0;-><init>(Lcom/google/android/gms/internal/ads/dr0;)V

    invoke-direct {p0, p1, v1, v2, v0}, Lcom/google/android/gms/internal/ads/dr0;->a(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/kr0;Lcom/google/android/gms/internal/ads/kr0;Lcom/google/android/gms/internal/ads/ln1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dr0;->c:Lcom/google/android/gms/internal/ads/l42;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/l42;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/mr0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zf;->l:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mr0;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic d(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dr0;->b:Lcom/google/android/gms/internal/ads/tq0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zf;->l:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/tq0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method final synthetic e(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dr0;->c:Lcom/google/android/gms/internal/ads/l42;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/l42;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/mr0;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/mr0;->b(Lcom/google/android/gms/internal/ads/zf;I)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
