.class final Lb/c/b/a/e/f/i0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/c/b/a/e/f/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Lb/c/b/a/e/f/i0;


# direct methods
.method constructor <init>(Lb/c/b/a/e/f/i0;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/a/e/f/i0$b;->b:Lb/c/b/a/e/f/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lb/c/b/a/e/f/i0$b;->b:Lb/c/b/a/e/f/i0;

    new-instance v1, Lb/c/b/a/e/f/t;

    invoke-direct {v1, p0, p1, p2}, Lb/c/b/a/e/f/t;-><init>(Lb/c/b/a/e/f/i0$b;Landroid/app/Activity;Landroid/os/Bundle;)V

    invoke-static {v0, v1}, Lb/c/b/a/e/f/i0;->a(Lb/c/b/a/e/f/i0;Lb/c/b/a/e/f/i0$a;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lb/c/b/a/e/f/i0$b;->b:Lb/c/b/a/e/f/i0;

    new-instance v1, Lb/c/b/a/e/f/y;

    invoke-direct {v1, p0, p1}, Lb/c/b/a/e/f/y;-><init>(Lb/c/b/a/e/f/i0$b;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lb/c/b/a/e/f/i0;->a(Lb/c/b/a/e/f/i0;Lb/c/b/a/e/f/i0$a;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lb/c/b/a/e/f/i0$b;->b:Lb/c/b/a/e/f/i0;

    new-instance v1, Lb/c/b/a/e/f/x;

    invoke-direct {v1, p0, p1}, Lb/c/b/a/e/f/x;-><init>(Lb/c/b/a/e/f/i0$b;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lb/c/b/a/e/f/i0;->a(Lb/c/b/a/e/f/i0;Lb/c/b/a/e/f/i0$a;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lb/c/b/a/e/f/i0$b;->b:Lb/c/b/a/e/f/i0;

    new-instance v1, Lb/c/b/a/e/f/u;

    invoke-direct {v1, p0, p1}, Lb/c/b/a/e/f/u;-><init>(Lb/c/b/a/e/f/i0$b;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lb/c/b/a/e/f/i0;->a(Lb/c/b/a/e/f/i0;Lb/c/b/a/e/f/i0$a;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    new-instance v0, Lb/c/b/a/e/f/b0;

    invoke-direct {v0}, Lb/c/b/a/e/f/b0;-><init>()V

    iget-object v1, p0, Lb/c/b/a/e/f/i0$b;->b:Lb/c/b/a/e/f/i0;

    new-instance v2, Lb/c/b/a/e/f/z;

    invoke-direct {v2, p0, p1, v0}, Lb/c/b/a/e/f/z;-><init>(Lb/c/b/a/e/f/i0$b;Landroid/app/Activity;Lb/c/b/a/e/f/b0;)V

    invoke-static {v1, v2}, Lb/c/b/a/e/f/i0;->a(Lb/c/b/a/e/f/i0;Lb/c/b/a/e/f/i0$a;)V

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Lb/c/b/a/e/f/b0;->b(J)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lb/c/b/a/e/f/i0$b;->b:Lb/c/b/a/e/f/i0;

    new-instance v1, Lb/c/b/a/e/f/v;

    invoke-direct {v1, p0, p1}, Lb/c/b/a/e/f/v;-><init>(Lb/c/b/a/e/f/i0$b;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lb/c/b/a/e/f/i0;->a(Lb/c/b/a/e/f/i0;Lb/c/b/a/e/f/i0$a;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lb/c/b/a/e/f/i0$b;->b:Lb/c/b/a/e/f/i0;

    new-instance v1, Lb/c/b/a/e/f/w;

    invoke-direct {v1, p0, p1}, Lb/c/b/a/e/f/w;-><init>(Lb/c/b/a/e/f/i0$b;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lb/c/b/a/e/f/i0;->a(Lb/c/b/a/e/f/i0;Lb/c/b/a/e/f/i0$a;)V

    return-void
.end method
