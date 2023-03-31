.class final Lcom/google/android/gms/internal/ads/p00;
.super Lcom/google/android/gms/internal/ads/n00;
.source ""


# instance fields
.field private final g:Landroid/content/Context;

.field private final h:Landroid/view/View;

.field private final i:Lcom/google/android/gms/internal/ads/ws;

.field private final j:Lcom/google/android/gms/internal/ads/hd1;

.field private final k:Lcom/google/android/gms/internal/ads/l20;

.field private final l:Lcom/google/android/gms/internal/ads/rf0;

.field private final m:Lcom/google/android/gms/internal/ads/eb0;

.field private final n:Lcom/google/android/gms/internal/ads/l42;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l42<",
            "Lcom/google/android/gms/internal/ads/kz0;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/concurrent/Executor;

.field private p:Lcom/google/android/gms/internal/ads/um2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/n20;Landroid/content/Context;Lcom/google/android/gms/internal/ads/hd1;Landroid/view/View;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/l20;Lcom/google/android/gms/internal/ads/rf0;Lcom/google/android/gms/internal/ads/eb0;Lcom/google/android/gms/internal/ads/l42;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/n20;",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/internal/ads/hd1;",
            "Landroid/view/View;",
            "Lcom/google/android/gms/internal/ads/ws;",
            "Lcom/google/android/gms/internal/ads/l20;",
            "Lcom/google/android/gms/internal/ads/rf0;",
            "Lcom/google/android/gms/internal/ads/eb0;",
            "Lcom/google/android/gms/internal/ads/l42<",
            "Lcom/google/android/gms/internal/ads/kz0;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/n00;-><init>(Lcom/google/android/gms/internal/ads/n20;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/p00;->g:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/p00;->h:Landroid/view/View;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/p00;->i:Lcom/google/android/gms/internal/ads/ws;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/p00;->j:Lcom/google/android/gms/internal/ads/hd1;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/p00;->k:Lcom/google/android/gms/internal/ads/l20;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/p00;->l:Lcom/google/android/gms/internal/ads/rf0;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/p00;->m:Lcom/google/android/gms/internal/ads/eb0;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/p00;->n:Lcom/google/android/gms/internal/ads/l42;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/p00;->o:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ads/um2;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p00;->i:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/lu;->a(Lcom/google/android/gms/internal/ads/um2;)Lcom/google/android/gms/internal/ads/lu;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/lu;)V

    iget v0, p2, Lcom/google/android/gms/internal/ads/um2;->d:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setMinimumHeight(I)V

    iget v0, p2, Lcom/google/android/gms/internal/ads/um2;->g:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setMinimumWidth(I)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/p00;->p:Lcom/google/android/gms/internal/ads/um2;

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p00;->o:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/o00;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/o00;-><init>(Lcom/google/android/gms/internal/ads/p00;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/k20;->b()V

    return-void
.end method

.method public final f()Lcom/google/android/gms/internal/ads/rp2;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p00;->k:Lcom/google/android/gms/internal/ads/l20;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/l20;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/fe1; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/hd1;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p00;->p:Lcom/google/android/gms/internal/ads/um2;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ce1;->a(Lcom/google/android/gms/internal/ads/um2;)Lcom/google/android/gms/internal/ads/hd1;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->b:Lcom/google/android/gms/internal/ads/id1;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/id1;->T:Z

    if-eqz v1, :cond_3

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/id1;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v3, "FirstParty"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/ads/hd1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/p00;->h:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/p00;->h:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {v0, v1, v3, v2}, Lcom/google/android/gms/internal/ads/hd1;-><init>(IIZ)V

    return-object v0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->b:Lcom/google/android/gms/internal/ads/id1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/id1;->o:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/p00;->j:Lcom/google/android/gms/internal/ads/hd1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/ce1;->a(Ljava/util/List;Lcom/google/android/gms/internal/ads/hd1;)Lcom/google/android/gms/internal/ads/hd1;

    move-result-object v0

    return-object v0
.end method

.method public final h()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p00;->h:Landroid/view/View;

    return-object v0
.end method

.method public final i()Lcom/google/android/gms/internal/ads/hd1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p00;->j:Lcom/google/android/gms/internal/ads/hd1;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->a:Lcom/google/android/gms/internal/ads/vd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/vd1;->b:Lcom/google/android/gms/internal/ads/sd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sd1;->b:Lcom/google/android/gms/internal/ads/kd1;

    iget v0, v0, Lcom/google/android/gms/internal/ads/kd1;->c:I

    return v0
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p00;->m:Lcom/google/android/gms/internal/ads/eb0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eb0;->R()V

    return-void
.end method

.method final synthetic l()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p00;->l:Lcom/google/android/gms/internal/ads/rf0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rf0;->d()Lcom/google/android/gms/internal/ads/l3;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p00;->l:Lcom/google/android/gms/internal/ads/rf0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rf0;->d()Lcom/google/android/gms/internal/ads/l3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/p00;->n:Lcom/google/android/gms/internal/ads/l42;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/l42;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/eo2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/p00;->g:Landroid/content/Context;

    invoke-static {v2}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/l3;->a(Lcom/google/android/gms/internal/ads/eo2;Lb/c/b/a/d/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "RemoteException when notifyAdLoad is called"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
