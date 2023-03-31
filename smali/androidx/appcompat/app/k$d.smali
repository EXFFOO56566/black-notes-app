.class public Landroidx/appcompat/app/k$d;
.super La/a/n/b;
.source ""

# interfaces
.implements Landroidx/appcompat/view/menu/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field private final d:Landroid/content/Context;

.field private final e:Landroidx/appcompat/view/menu/g;

.field private f:La/a/n/b$a;

.field private g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic h:Landroidx/appcompat/app/k;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/k;Landroid/content/Context;La/a/n/b$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    invoke-direct {p0}, La/a/n/b;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/app/k$d;->d:Landroid/content/Context;

    iput-object p3, p0, Landroidx/appcompat/app/k$d;->f:La/a/n/b$a;

    new-instance p1, Landroidx/appcompat/view/menu/g;

    invoke-direct {p1, p2}, Landroidx/appcompat/view/menu/g;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/appcompat/view/menu/g;->c(I)Landroidx/appcompat/view/menu/g;

    iput-object p1, p0, Landroidx/appcompat/app/k$d;->e:Landroidx/appcompat/view/menu/g;

    invoke-virtual {p1, p0}, Landroidx/appcompat/view/menu/g;->a(Landroidx/appcompat/view/menu/g$a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v1, v0, Landroidx/appcompat/app/k;->l:Landroidx/appcompat/app/k$d;

    if-eq v1, p0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Landroidx/appcompat/app/k;->t:Z

    iget-boolean v0, v0, Landroidx/appcompat/app/k;->u:Z

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroidx/appcompat/app/k;->a(ZZZ)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iput-object p0, v0, Landroidx/appcompat/app/k;->m:La/a/n/b;

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->f:La/a/n/b$a;

    iput-object v1, v0, Landroidx/appcompat/app/k;->n:La/a/n/b$a;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/k$d;->f:La/a/n/b$a;

    invoke-interface {v0, p0}, La/a/n/b$a;->a(La/a/n/b;)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/app/k$d;->f:La/a/n/b$a;

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/k;->e(Z)V

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v1, v1, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->a()V

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v1, v1, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {v1}, Landroidx/appcompat/widget/d0;->h()Landroid/view/ViewGroup;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v2, v1, Landroidx/appcompat/app/k;->e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v1, v1, Landroidx/appcompat/app/k;->z:Z

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iput-object v0, v1, Landroidx/appcompat/app/k;->l:Landroidx/appcompat/app/k$d;

    return-void
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v0, v0, Landroidx/appcompat/app/k;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/k$d;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v0, v0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/appcompat/app/k$d;->g:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public a(Landroidx/appcompat/view/menu/g;)V
    .locals 0

    iget-object p1, p0, Landroidx/appcompat/app/k$d;->f:La/a/n/b$a;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/k$d;->i()V

    iget-object p1, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object p1, p1, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->d()Z

    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v0, v0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    invoke-super {p0, p1}, La/a/n/b;->a(Z)V

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v0, v0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method

.method public a(Landroidx/appcompat/view/menu/g;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Landroidx/appcompat/app/k$d;->f:La/a/n/b$a;

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2}, La/a/n/b$a;->a(La/a/n/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->g:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v0, v0, Landroidx/appcompat/app/k;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/k$d;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public b(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v0, v0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public c()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->e:Landroidx/appcompat/view/menu/g;

    return-object v0
.end method

.method public d()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, La/a/n/g;

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, La/a/n/g;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v0, v0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v0, v0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v0, v0, Landroidx/appcompat/app/k;->l:Landroidx/appcompat/app/k$d;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/k$d;->e:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/g;->s()V

    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/app/k$d;->f:La/a/n/b$a;

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->e:Landroidx/appcompat/view/menu/g;

    invoke-interface {v0, p0, v1}, La/a/n/b$a;->a(La/a/n/b;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->e:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/g;->r()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->e:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/g;->r()V

    throw v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->h:Landroidx/appcompat/app/k;

    iget-object v0, v0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->b()Z

    move-result v0

    return v0
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/k$d;->e:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/g;->s()V

    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/app/k$d;->f:La/a/n/b$a;

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->e:Landroidx/appcompat/view/menu/g;

    invoke-interface {v0, p0, v1}, La/a/n/b$a;->b(La/a/n/b;Landroid/view/Menu;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->e:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/g;->r()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/appcompat/app/k$d;->e:Landroidx/appcompat/view/menu/g;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/g;->r()V

    throw v0
.end method
