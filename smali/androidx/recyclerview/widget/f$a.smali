.class Landroidx/recyclerview/widget/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/recyclerview/widget/f;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/f$a;->b:Landroidx/recyclerview/widget/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/f$a;->b:Landroidx/recyclerview/widget/f;

    iget-object v1, v0, Landroidx/recyclerview/widget/f;->c:Landroidx/recyclerview/widget/RecyclerView$d0;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/f;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/f$a;->b:Landroidx/recyclerview/widget/f;

    iget-object v1, v0, Landroidx/recyclerview/widget/f;->c:Landroidx/recyclerview/widget/RecyclerView$d0;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/f;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/f$a;->b:Landroidx/recyclerview/widget/f;

    iget-object v1, v0, Landroidx/recyclerview/widget/f;->r:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/f;->s:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/recyclerview/widget/f$a;->b:Landroidx/recyclerview/widget/f;

    iget-object v0, v0, Landroidx/recyclerview/widget/f;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p0}, La/g/l/u;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
