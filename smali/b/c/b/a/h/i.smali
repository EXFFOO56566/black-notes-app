.class public final Lb/c/b/a/h/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/c/b/a/h/i$a;,
        Lb/c/b/a/h/i$b;
    }
.end annotation


# direct methods
.method public static a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lb/c/b/a/h/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TTResult;>;)",
            "Lb/c/b/a/h/f<",
            "TTResult;>;"
        }
    .end annotation

    const-string v0, "Executor must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Callback must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lb/c/b/a/h/u;

    invoke-direct {v0}, Lb/c/b/a/h/u;-><init>()V

    new-instance v1, Lb/c/b/a/h/v;

    invoke-direct {v1, v0, p1}, Lb/c/b/a/h/v;-><init>(Lb/c/b/a/h/u;Ljava/util/concurrent/Callable;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method private static a(Lb/c/b/a/h/f;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lb/c/b/a/h/f<",
            "TTResult;>;)TTResult;"
        }
    .end annotation

    invoke-virtual {p0}, Lb/c/b/a/h/f;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb/c/b/a/h/f;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lb/c/b/a/h/f;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task is already canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Lb/c/b/a/h/f;->a()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static a(Lb/c/b/a/h/f;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lb/c/b/a/h/f<",
            "TTResult;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TTResult;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/internal/r;->a()V

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "TimeUnit must not be null"

    invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lb/c/b/a/h/f;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lb/c/b/a/h/i;->a(Lb/c/b/a/h/f;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lb/c/b/a/h/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb/c/b/a/h/i$a;-><init>(Lb/c/b/a/h/v;)V

    invoke-static {p0, v0}, Lb/c/b/a/h/i;->a(Lb/c/b/a/h/f;Lb/c/b/a/h/i$b;)V

    invoke-virtual {v0, p1, p2, p3}, Lb/c/b/a/h/i$a;->a(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lb/c/b/a/h/i;->a(Lb/c/b/a/h/f;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    const-string p1, "Timed out waiting for Task"

    invoke-direct {p0, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static a(Lb/c/b/a/h/f;Lb/c/b/a/h/i$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/c/b/a/h/f<",
            "*>;",
            "Lb/c/b/a/h/i$b;",
            ")V"
        }
    .end annotation

    sget-object v0, Lb/c/b/a/h/h;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lb/c/b/a/h/f;->a(Ljava/util/concurrent/Executor;Lb/c/b/a/h/d;)Lb/c/b/a/h/f;

    sget-object v0, Lb/c/b/a/h/h;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lb/c/b/a/h/f;->a(Ljava/util/concurrent/Executor;Lb/c/b/a/h/c;)Lb/c/b/a/h/f;

    sget-object v0, Lb/c/b/a/h/h;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lb/c/b/a/h/f;->a(Ljava/util/concurrent/Executor;Lb/c/b/a/h/b;)Lb/c/b/a/h/f;

    return-void
.end method
