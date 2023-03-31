.class Landroidx/appcompat/app/k$a;
.super La/g/l/a0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/k;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/k$a;->a:Landroidx/appcompat/app/k;

    invoke-direct {p0}, La/g/l/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/app/k$a;->a:Landroidx/appcompat/app/k;

    iget-boolean v0, p1, Landroidx/appcompat/app/k;->s:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroidx/appcompat/app/k;->i:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Landroidx/appcompat/app/k$a;->a:Landroidx/appcompat/app/k;

    iget-object p1, p1, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/k$a;->a:Landroidx/appcompat/app/k;

    iget-object p1, p1, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/app/k$a;->a:Landroidx/appcompat/app/k;

    iget-object p1, p1, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Landroidx/appcompat/app/k$a;->a:Landroidx/appcompat/app/k;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/app/k;->x:La/a/n/h;

    invoke-virtual {p1}, Landroidx/appcompat/app/k;->m()V

    iget-object p1, p0, Landroidx/appcompat/app/k$a;->a:Landroidx/appcompat/app/k;

    iget-object p1, p1, Landroidx/appcompat/app/k;->e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1

    invoke-static {p1}, La/g/l/u;->H(Landroid/view/View;)V

    :cond_1
    return-void
.end method
