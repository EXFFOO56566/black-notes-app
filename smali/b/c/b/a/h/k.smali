.class final Lb/c/b/a/h/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lb/c/b/a/h/f;

.field private final synthetic c:Lb/c/b/a/h/j;


# direct methods
.method constructor <init>(Lb/c/b/a/h/j;Lb/c/b/a/h/f;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/a/h/k;->c:Lb/c/b/a/h/j;

    iput-object p2, p0, Lb/c/b/a/h/k;->b:Lb/c/b/a/h/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb/c/b/a/h/k;->b:Lb/c/b/a/h/f;

    invoke-virtual {v0}, Lb/c/b/a/h/f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb/c/b/a/h/k;->c:Lb/c/b/a/h/j;

    invoke-static {v0}, Lb/c/b/a/h/j;->a(Lb/c/b/a/h/j;)Lb/c/b/a/h/u;

    move-result-object v0

    invoke-virtual {v0}, Lb/c/b/a/h/u;->f()Z

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lb/c/b/a/h/k;->c:Lb/c/b/a/h/j;

    invoke-static {v0}, Lb/c/b/a/h/j;->b(Lb/c/b/a/h/j;)Lb/c/b/a/h/a;

    move-result-object v0

    iget-object v1, p0, Lb/c/b/a/h/k;->b:Lb/c/b/a/h/f;

    invoke-interface {v0, v1}, Lb/c/b/a/h/a;->a(Lb/c/b/a/h/f;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lb/c/b/a/h/e; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lb/c/b/a/h/k;->c:Lb/c/b/a/h/j;

    invoke-static {v1}, Lb/c/b/a/h/j;->a(Lb/c/b/a/h/j;)Lb/c/b/a/h/u;

    move-result-object v1

    invoke-virtual {v1, v0}, Lb/c/b/a/h/u;->a(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lb/c/b/a/h/k;->c:Lb/c/b/a/h/j;

    invoke-static {v1}, Lb/c/b/a/h/j;->a(Lb/c/b/a/h/j;)Lb/c/b/a/h/u;

    move-result-object v1

    invoke-virtual {v1, v0}, Lb/c/b/a/h/u;->a(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lb/c/b/a/h/k;->c:Lb/c/b/a/h/j;

    invoke-static {v1}, Lb/c/b/a/h/j;->a(Lb/c/b/a/h/j;)Lb/c/b/a/h/u;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lb/c/b/a/h/u;->a(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Lb/c/b/a/h/k;->c:Lb/c/b/a/h/j;

    invoke-static {v1}, Lb/c/b/a/h/j;->a(Lb/c/b/a/h/j;)Lb/c/b/a/h/u;

    move-result-object v1

    invoke-virtual {v1, v0}, Lb/c/b/a/h/u;->a(Ljava/lang/Exception;)V

    return-void
.end method
