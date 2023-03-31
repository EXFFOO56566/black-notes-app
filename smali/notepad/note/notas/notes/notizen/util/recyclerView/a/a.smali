.class public Lnotepad/note/notas/notes/notizen/util/recyclerView/a/a;
.super Landroidx/recyclerview/widget/f$f;
.source ""


# instance fields
.field private final d:Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;


# direct methods
.method public constructor <init>(Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;)V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/f$f;-><init>()V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/a;->d:Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;FFIZ)V
    .locals 1

    const/4 v0, 0x1

    if-ne p6, v0, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget-object p5, p3, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    invoke-virtual {p5}, Landroid/view/View;->getWidth()I

    move-result p5

    int-to-float p5, p5

    div-float/2addr p2, p5

    sub-float/2addr p1, p2

    iget-object p2, p3, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p3, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    invoke-virtual {p1, p4}, Landroid/view/View;->setTranslationX(F)V

    goto :goto_0

    :cond_0
    invoke-super/range {p0 .. p7}, Landroidx/recyclerview/widget/f$f;->a(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;FFIZ)V

    :goto_0
    return-void
.end method

.method public a(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 1

    if-eqz p2, :cond_0

    instance-of v0, p1, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/d;

    invoke-interface {v0}, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/d;->b()V

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/f$f;->a(Landroidx/recyclerview/widget/RecyclerView$d0;I)V

    return-void
.end method

.method public a(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/f$f;->a(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)V

    iget-object p1, p2, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    instance-of p1, p2, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/d;

    if-eqz p1, :cond_0

    check-cast p2, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/d;

    invoke-interface {p2}, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/d;->a()V

    :cond_0
    return-void
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/a;->d:Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result p1

    invoke-interface {p2, p1}, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;->a(I)V

    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)Z
    .locals 1

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I

    move-result p1

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I

    move-result v0

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/a;->d:Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result p2

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result p3

    invoke-interface {p1, p2, p3}, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;->a(II)Z

    const/4 p1, 0x1

    return p1
.end method

.method public c(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)I
    .locals 0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p1

    instance-of p1, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz p1, :cond_0

    const/16 p1, 0xf

    const/4 p2, 0x0

    :goto_0
    invoke-static {p1, p2}, Landroidx/recyclerview/widget/f$f;->d(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x3

    const/16 p2, 0x30

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
