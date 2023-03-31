.class public Lnotepad/note/notas/notes/notizen/checklist/b;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnotepad/note/notas/notes/notizen/checklist/b$b;,
        Lnotepad/note/notas/notes/notizen/checklist/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Lnotepad/note/notas/notes/notizen/checklist/b$b;",
        ">;",
        "Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;"
    }
.end annotation


# instance fields
.field private c:Lnotepad/note/notas/notes/notizen/checklist/b$a;

.field private d:Lc/a/a/a/a/b/b/b;

.field private e:Lc/a/a/a/a/b/b/d;

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/b;",
            ">;"
        }
    .end annotation
.end field

.field private g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    new-instance v0, Lc/a/a/a/a/b/b/b;

    invoke-direct {v0, p1}, Lc/a/a/a/a/b/b/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->d:Lc/a/a/a/a/b/b/b;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p1}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->e:Lc/a/a/a/a/b/b/d;

    iput p2, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->g:I

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->d:Lc/a/a/a/a/b/b/b;

    invoke-virtual {p1, p2}, Lc/a/a/a/a/b/b/b;->f(I)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/checklist/b;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/checklist/b;)Lc/a/a/a/a/b/b/b;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->d:Lc/a/a/a/a/b/b/b;

    return-object p0
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/checklist/b;)I
    .locals 0

    iget p0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->g:I

    return p0
.end method

.method static synthetic d(Lnotepad/note/notas/notes/notizen/checklist/b;)Lc/a/a/a/a/b/b/d;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->e:Lc/a/a/a/a/b/b/d;

    return-object p0
.end method

.method static synthetic e(Lnotepad/note/notas/notes/notizen/checklist/b;)Lnotepad/note/notas/notes/notizen/checklist/b$a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->c:Lnotepad/note/notas/notes/notizen/checklist/b$a;

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public a(I)V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/b;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/b;->a()I

    move-result v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->d:Lc/a/a/a/a/b/b/b;

    invoke-virtual {v1, v0}, Lc/a/a/a/a/b/b/b;->c(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->e:Lc/a/a/a/a/b/b/d;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->g:I

    invoke-virtual {v0, v1}, Lc/a/a/a/a/b/b/d;->g(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d(I)V

    return-void
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    return-void
.end method

.method public a(Lnotepad/note/notas/notes/notizen/checklist/b$a;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->c:Lnotepad/note/notas/notes/notizen/checklist/b$a;

    return-void
.end method

.method public a(Lnotepad/note/notas/notes/notizen/checklist/b$b;I)V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/a/b/c/b;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/b$b;->a(Lnotepad/note/notas/notes/notizen/checklist/b$b;)Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    move-result-object v0

    invoke-virtual {p2}, Lc/a/a/a/a/b/c/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Lc/a/a/a/a/b/c/b;->c()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p1, p2}, Lnotepad/note/notas/notes/notizen/checklist/b$b;->a(Lnotepad/note/notas/notes/notizen/checklist/b$b;Z)V

    return-void
.end method

.method public a(II)Z
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/b;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/b;->a()I

    move-result v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/a/b/c/b;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/b;->a()I

    move-result v1

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->d:Lc/a/a/a/a/b/b/b;

    invoke-virtual {v2, v0, p2}, Lc/a/a/a/a/b/b/b;->a(II)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->d:Lc/a/a/a/a/b/b/b;

    invoke-virtual {v0, v1, p1}, Lc/a/a/a/a/b/b/b;->a(II)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->e:Lc/a/a/a/a/b/b/d;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->g:I

    invoke-virtual {v0, v1}, Lc/a/a/a/a/b/b/d;->g(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    invoke-static {v0, p1, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->b(II)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic b(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/checklist/b;->b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/checklist/b$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/checklist/b$b;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0b0056

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lnotepad/note/notas/notes/notizen/checklist/b$b;

    invoke-direct {p2, p0, p1}, Lnotepad/note/notas/notes/notizen/checklist/b$b;-><init>(Lnotepad/note/notas/notes/notizen/checklist/b;Landroid/view/View;)V

    return-object p2
.end method

.method public bridge synthetic b(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    check-cast p1, Lnotepad/note/notas/notes/notizen/checklist/b$b;

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/checklist/b;->a(Lnotepad/note/notas/notes/notizen/checklist/b$b;I)V

    return-void
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/b;->f:Ljava/util/ArrayList;

    return-object v0
.end method
