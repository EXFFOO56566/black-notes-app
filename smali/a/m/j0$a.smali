.class La/m/j0$a;
.super La/m/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/m/j0;->b(Landroid/view/ViewGroup;La/m/s;ILa/m/s;I)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/view/View;

.field final synthetic d:La/m/j0;


# direct methods
.method constructor <init>(La/m/j0;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, La/m/j0$a;->d:La/m/j0;

    iput-object p2, p0, La/m/j0$a;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, La/m/j0$a;->b:Landroid/view/View;

    iput-object p4, p0, La/m/j0$a;->c:Landroid/view/View;

    invoke-direct {p0}, La/m/n;-><init>()V

    return-void
.end method


# virtual methods
.method public c(La/m/m;)V
    .locals 1

    iget-object p1, p0, La/m/j0$a;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, La/m/x;->a(Landroid/view/ViewGroup;)La/m/w;

    move-result-object p1

    iget-object v0, p0, La/m/j0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, La/m/w;->b(Landroid/view/View;)V

    return-void
.end method

.method public d(La/m/m;)V
    .locals 1

    iget-object p1, p0, La/m/j0$a;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, La/m/j0$a;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, La/m/x;->a(Landroid/view/ViewGroup;)La/m/w;

    move-result-object p1

    iget-object v0, p0, La/m/j0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, La/m/w;->a(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, La/m/j0$a;->d:La/m/j0;

    invoke-virtual {p1}, La/m/m;->a()V

    :goto_0
    return-void
.end method

.method public e(La/m/m;)V
    .locals 3

    iget-object v0, p0, La/m/j0$a;->c:Landroid/view/View;

    sget v1, La/m/j;->save_overlay_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, La/m/j0$a;->a:Landroid/view/ViewGroup;

    invoke-static {v0}, La/m/x;->a(Landroid/view/ViewGroup;)La/m/w;

    move-result-object v0

    iget-object v1, p0, La/m/j0$a;->b:Landroid/view/View;

    invoke-interface {v0, v1}, La/m/w;->b(Landroid/view/View;)V

    invoke-virtual {p1, p0}, La/m/m;->b(La/m/m$f;)La/m/m;

    return-void
.end method
