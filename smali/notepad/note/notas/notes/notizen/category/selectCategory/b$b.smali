.class Lnotepad/note/notas/notes/notizen/category/selectCategory/b$b;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnotepad/note/notas/notes/notizen/category/selectCategory/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field final synthetic v:Lnotepad/note/notas/notes/notizen/category/selectCategory/b;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/category/selectCategory/b;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/b$b;->v:Lnotepad/note/notas/notes/notizen/category/selectCategory/b;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const p1, 0x7f080088

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/b$b;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    new-instance p1, Lnotepad/note/notas/notes/notizen/category/selectCategory/a;

    invoke-direct {p1, p0}, Lnotepad/note/notas/notes/notizen/category/selectCategory/a;-><init>(Lnotepad/note/notas/notes/notizen/category/selectCategory/b$b;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/category/selectCategory/b$b;)Lnotepad/note/notas/notes/notizen/ui/MyTextView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/b$b;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    return-object p0
.end method


# virtual methods
.method public synthetic a(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/b$b;->v:Lnotepad/note/notas/notes/notizen/category/selectCategory/b;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/selectCategory/b;->a(Lnotepad/note/notas/notes/notizen/category/selectCategory/b;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/a/b/c/a;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/b$b;->v:Lnotepad/note/notas/notes/notizen/category/selectCategory/b;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/category/selectCategory/b;->b(Lnotepad/note/notas/notes/notizen/category/selectCategory/b;)Lnotepad/note/notas/notes/notizen/category/selectCategory/b$a;

    move-result-object v0

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/a;->a()I

    move-result v1

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lnotepad/note/notas/notes/notizen/category/selectCategory/b$a;->a(ILjava/lang/String;)V

    return-void
.end method
