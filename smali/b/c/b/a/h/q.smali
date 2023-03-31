.class final Lb/c/b/a/h/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lb/c/b/a/h/f;

.field private final synthetic c:Lb/c/b/a/h/p;


# direct methods
.method constructor <init>(Lb/c/b/a/h/p;Lb/c/b/a/h/f;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/a/h/q;->c:Lb/c/b/a/h/p;

    iput-object p2, p0, Lb/c/b/a/h/q;->b:Lb/c/b/a/h/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lb/c/b/a/h/q;->c:Lb/c/b/a/h/p;

    invoke-static {v0}, Lb/c/b/a/h/p;->a(Lb/c/b/a/h/p;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb/c/b/a/h/q;->c:Lb/c/b/a/h/p;

    invoke-static {v1}, Lb/c/b/a/h/p;->b(Lb/c/b/a/h/p;)Lb/c/b/a/h/d;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lb/c/b/a/h/q;->c:Lb/c/b/a/h/p;

    invoke-static {v1}, Lb/c/b/a/h/p;->b(Lb/c/b/a/h/p;)Lb/c/b/a/h/d;

    move-result-object v1

    iget-object v2, p0, Lb/c/b/a/h/q;->b:Lb/c/b/a/h/f;

    invoke-virtual {v2}, Lb/c/b/a/h/f;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lb/c/b/a/h/d;->a(Ljava/lang/Object;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
