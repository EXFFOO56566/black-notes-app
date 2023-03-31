.class Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager$a;
.super Landroidx/recyclerview/widget/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic q:Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager$a;->q:Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/j;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/graphics/PointF;
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager$a;->q:Lnotepad/note/notas/notes/notizen/util/recyclerView/SnappingLinearLayoutManager;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(I)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method protected j()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method
