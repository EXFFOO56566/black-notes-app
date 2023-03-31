.class Landroidx/recyclerview/widget/f$c;
.super Landroidx/recyclerview/widget/f$h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/recyclerview/widget/f;->a(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:I

.field final synthetic o:Landroidx/recyclerview/widget/RecyclerView$d0;

.field final synthetic p:Landroidx/recyclerview/widget/f;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/f;Landroidx/recyclerview/widget/RecyclerView$d0;IIFFFFILandroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 9

    move-object v8, p0

    move-object v0, p1

    iput-object v0, v8, Landroidx/recyclerview/widget/f$c;->p:Landroidx/recyclerview/widget/f;

    move/from16 v0, p9

    iput v0, v8, Landroidx/recyclerview/widget/f$c;->n:I

    move-object/from16 v0, p10

    iput-object v0, v8, Landroidx/recyclerview/widget/f$c;->o:Landroidx/recyclerview/widget/RecyclerView$d0;

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Landroidx/recyclerview/widget/f$h;-><init>(Landroidx/recyclerview/widget/RecyclerView$d0;IIFFFF)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/f$h;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-boolean p1, p0, Landroidx/recyclerview/widget/f$h;->k:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget p1, p0, Landroidx/recyclerview/widget/f$c;->n:I

    if-gtz p1, :cond_1

    iget-object p1, p0, Landroidx/recyclerview/widget/f$c;->p:Landroidx/recyclerview/widget/f;

    iget-object v0, p1, Landroidx/recyclerview/widget/f;->m:Landroidx/recyclerview/widget/f$f;

    iget-object p1, p1, Landroidx/recyclerview/widget/f;->r:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Landroidx/recyclerview/widget/f$c;->o:Landroidx/recyclerview/widget/RecyclerView$d0;

    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/f$f;->a(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/f$c;->p:Landroidx/recyclerview/widget/f;

    iget-object p1, p1, Landroidx/recyclerview/widget/f;->a:Ljava/util/List;

    iget-object v0, p0, Landroidx/recyclerview/widget/f$c;->o:Landroidx/recyclerview/widget/RecyclerView$d0;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/f$h;->h:Z

    iget p1, p0, Landroidx/recyclerview/widget/f$c;->n:I

    if-lez p1, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/f$c;->p:Landroidx/recyclerview/widget/f;

    invoke-virtual {v0, p0, p1}, Landroidx/recyclerview/widget/f;->a(Landroidx/recyclerview/widget/f$h;I)V

    :cond_2
    :goto_0
    iget-object p1, p0, Landroidx/recyclerview/widget/f$c;->p:Landroidx/recyclerview/widget/f;

    iget-object v0, p1, Landroidx/recyclerview/widget/f;->x:Landroid/view/View;

    iget-object v1, p0, Landroidx/recyclerview/widget/f$c;->o:Landroidx/recyclerview/widget/RecyclerView$d0;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    if-ne v0, v1, :cond_3

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/f;->c(Landroid/view/View;)V

    :cond_3
    return-void
.end method
