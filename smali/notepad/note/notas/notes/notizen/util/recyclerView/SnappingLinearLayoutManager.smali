.class public Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager$a;
    }
.end annotation


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;I)V
    .locals 0

    new-instance p2, Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager$a;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager$a;-><init>(Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager;Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView$z;->c(I)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroidx/recyclerview/widget/RecyclerView$z;)V

    return-void
.end method
