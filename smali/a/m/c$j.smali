.class La/m/c$j;
.super La/m/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/m/c;->a(Landroid/view/ViewGroup;La/m/s;La/m/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(La/m/c;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p2, p0, La/m/c$j;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, La/m/n;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, La/m/c$j;->a:Z

    return-void
.end method


# virtual methods
.method public b(La/m/m;)V
    .locals 1

    iget-object p1, p0, La/m/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, La/m/x;->b(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, La/m/c$j;->a:Z

    return-void
.end method

.method public c(La/m/m;)V
    .locals 1

    iget-object p1, p0, La/m/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, La/m/x;->b(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public d(La/m/m;)V
    .locals 1

    iget-object p1, p0, La/m/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p1, v0}, La/m/x;->b(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public e(La/m/m;)V
    .locals 2

    iget-boolean v0, p0, La/m/c$j;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, La/m/c$j;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/m/x;->b(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, La/m/m;->b(La/m/m$f;)La/m/m;

    return-void
.end method
