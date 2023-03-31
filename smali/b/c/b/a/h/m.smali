.class final Lb/c/b/a/h/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lb/c/b/a/h/l;


# direct methods
.method constructor <init>(Lb/c/b/a/h/l;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/a/h/m;->b:Lb/c/b/a/h/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb/c/b/a/h/m;->b:Lb/c/b/a/h/l;

    invoke-static {v0}, Lb/c/b/a/h/l;->a(Lb/c/b/a/h/l;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb/c/b/a/h/m;->b:Lb/c/b/a/h/l;

    invoke-static {v1}, Lb/c/b/a/h/l;->b(Lb/c/b/a/h/l;)Lb/c/b/a/h/b;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lb/c/b/a/h/m;->b:Lb/c/b/a/h/l;

    invoke-static {v1}, Lb/c/b/a/h/l;->b(Lb/c/b/a/h/l;)Lb/c/b/a/h/b;

    move-result-object v1

    invoke-interface {v1}, Lb/c/b/a/h/b;->a()V

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
