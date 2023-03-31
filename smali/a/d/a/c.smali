.class La/d/a/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/d/a/f;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private j(La/d/a/e;)La/d/a/g;
    .locals 0

    invoke-interface {p1}, La/d/a/e;->d()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, La/d/a/g;

    return-object p1
.end method


# virtual methods
.method public a(La/d/a/e;)F
    .locals 0

    invoke-direct {p0, p1}, La/d/a/c;->j(La/d/a/e;)La/d/a/g;

    move-result-object p1

    invoke-virtual {p1}, La/d/a/g;->b()F

    move-result p1

    return p1
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method public a(La/d/a/e;F)V
    .locals 0

    invoke-direct {p0, p1}, La/d/a/c;->j(La/d/a/e;)La/d/a/g;

    move-result-object p1

    invoke-virtual {p1, p2}, La/d/a/g;->a(F)V

    return-void
.end method

.method public a(La/d/a/e;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-direct {p0, p1}, La/d/a/c;->j(La/d/a/e;)La/d/a/g;

    move-result-object p1

    invoke-virtual {p1, p2}, La/d/a/g;->a(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public b(La/d/a/e;)Landroid/content/res/ColorStateList;
    .locals 0

    invoke-direct {p0, p1}, La/d/a/c;->j(La/d/a/e;)La/d/a/g;

    move-result-object p1

    invoke-virtual {p1}, La/d/a/g;->a()Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public b(La/d/a/e;F)V
    .locals 0

    invoke-interface {p1}, La/d/a/e;->a()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public c(La/d/a/e;)F
    .locals 0

    invoke-interface {p1}, La/d/a/e;->a()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    move-result p1

    return p1
.end method

.method public c(La/d/a/e;F)V
    .locals 3

    invoke-direct {p0, p1}, La/d/a/c;->j(La/d/a/e;)La/d/a/g;

    move-result-object v0

    invoke-interface {p1}, La/d/a/e;->c()Z

    move-result v1

    invoke-interface {p1}, La/d/a/e;->b()Z

    move-result v2

    invoke-virtual {v0, p2, v1, v2}, La/d/a/g;->a(FZZ)V

    invoke-virtual {p0, p1}, La/d/a/c;->i(La/d/a/e;)V

    return-void
.end method

.method public d(La/d/a/e;)F
    .locals 0

    invoke-direct {p0, p1}, La/d/a/c;->j(La/d/a/e;)La/d/a/g;

    move-result-object p1

    invoke-virtual {p1}, La/d/a/g;->c()F

    move-result p1

    return p1
.end method

.method public e(La/d/a/e;)F
    .locals 1

    invoke-virtual {p0, p1}, La/d/a/c;->d(La/d/a/e;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p1, p1, v0

    return p1
.end method

.method public f(La/d/a/e;)F
    .locals 1

    invoke-virtual {p0, p1}, La/d/a/c;->d(La/d/a/e;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p1, p1, v0

    return p1
.end method

.method public g(La/d/a/e;)V
    .locals 1

    invoke-virtual {p0, p1}, La/d/a/c;->a(La/d/a/e;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, La/d/a/c;->c(La/d/a/e;F)V

    return-void
.end method

.method public h(La/d/a/e;)V
    .locals 1

    invoke-virtual {p0, p1}, La/d/a/c;->a(La/d/a/e;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, La/d/a/c;->c(La/d/a/e;F)V

    return-void
.end method

.method public i(La/d/a/e;)V
    .locals 4

    invoke-interface {p1}, La/d/a/e;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0, v0, v0, v0}, La/d/a/e;->a(IIII)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, La/d/a/c;->a(La/d/a/e;)F

    move-result v0

    invoke-virtual {p0, p1}, La/d/a/c;->d(La/d/a/e;)F

    move-result v1

    invoke-interface {p1}, La/d/a/e;->b()Z

    move-result v2

    invoke-static {v0, v1, v2}, La/d/a/h;->a(FFZ)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-interface {p1}, La/d/a/e;->b()Z

    move-result v3

    invoke-static {v0, v1, v3}, La/d/a/h;->b(FFZ)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-interface {p1, v2, v0, v2, v0}, La/d/a/e;->a(IIII)V

    return-void
.end method
