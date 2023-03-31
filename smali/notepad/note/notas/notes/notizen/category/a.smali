.class public Lnotepad/note/notas/notes/notizen/category/a;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnotepad/note/notas/notes/notizen/category/a$b;,
        Lnotepad/note/notas/notes/notizen/category/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Lnotepad/note/notas/notes/notizen/category/a$b;",
        ">;",
        "Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;"
    }
.end annotation


# instance fields
.field private c:Lc/a/a/a/a/b/b/a;

.field private d:Lc/a/a/a/a/b/b/d;

.field private e:Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;

.field private f:Lnotepad/note/notas/notes/notizen/category/a$a;

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/a;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z

.field private i:Landroid/content/Context;

.field private j:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;)V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->h:Z

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->j:Z

    iput-object p2, p0, Lnotepad/note/notas/notes/notizen/category/a;->e:Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a;->i:Landroid/content/Context;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lnotepad/note/notas/notes/notizen/category/a;->g:Ljava/util/ArrayList;

    new-instance p2, Lc/a/a/a/a/b/b/a;

    invoke-direct {p2, p1}, Lc/a/a/a/a/b/b/a;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lnotepad/note/notas/notes/notizen/category/a;->c:Lc/a/a/a/a/b/b/a;

    new-instance p2, Lc/a/a/a/a/b/b/d;

    invoke-direct {p2, p1}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lnotepad/note/notas/notes/notizen/category/a;->d:Lc/a/a/a/a/b/b/d;

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/category/a;)Z
    .locals 0

    iget-boolean p0, p0, Lnotepad/note/notas/notes/notizen/category/a;->h:Z

    return p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/category/a;)Lnotepad/note/notas/notes/notizen/category/a$a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/category/a;->f:Lnotepad/note/notas/notes/notizen/category/a$a;

    return-object p0
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/category/a;)Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/category/a;->e:Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;

    return-object p0
.end method

.method static synthetic d(Lnotepad/note/notas/notes/notizen/category/a;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/category/a;->g:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic e(Lnotepad/note/notas/notes/notizen/category/a;)Lc/a/a/a/a/b/b/d;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/category/a;->d:Lc/a/a/a/a/b/b/d;

    return-object p0
.end method

.method static synthetic f(Lnotepad/note/notas/notes/notizen/category/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/category/a;->i:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public a(I)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->j:Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/a;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/a;->a()I

    move-result v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/category/a;->c:Lc/a/a/a/a/b/b/a;

    invoke-virtual {v1, v0}, Lc/a/a/a/a/b/b/a;->a(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d(I)V

    return-void
.end method

.method a(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a;->g:Ljava/util/ArrayList;

    return-void
.end method

.method a(Lnotepad/note/notas/notes/notizen/category/a$a;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a;->f:Lnotepad/note/notas/notes/notizen/category/a$a;

    return-void
.end method

.method public a(Lnotepad/note/notas/notes/notizen/category/a$b;I)V
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/a/b/c/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/a$b;->a(Lnotepad/note/notas/notes/notizen/category/a$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lc/a/a/a/a/b/c/a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-boolean p2, p0, Lnotepad/note/notas/notes/notizen/category/a;->h:Z

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/a$b;->b(Lnotepad/note/notas/notes/notizen/category/a$b;)Landroid/widget/LinearLayout;

    move-result-object p1

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/16 p2, 0x8

    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public a(II)Z
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/a;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/a;->a()I

    move-result v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/category/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/a/b/c/a;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/a;->a()I

    move-result v1

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/category/a;->c:Lc/a/a/a/a/b/b/a;

    invoke-virtual {v2, v0, p2}, Lc/a/a/a/a/b/b/a;->a(II)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->c:Lc/a/a/a/a/b/b/a;

    invoke-virtual {v0, v1, p1}, Lc/a/a/a/a/b/b/a;->a(II)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->g:Ljava/util/ArrayList;

    invoke-static {v0, p1, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->b(II)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic b(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/category/a;->b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/category/a$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/category/a$b;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0b0055

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lnotepad/note/notas/notes/notizen/category/a$b;

    invoke-direct {p2, p0, p1}, Lnotepad/note/notas/notes/notizen/category/a$b;-><init>(Lnotepad/note/notas/notes/notizen/category/a;Landroid/view/View;)V

    return-object p2
.end method

.method public bridge synthetic b(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    check-cast p1, Lnotepad/note/notas/notes/notizen/category/a$b;

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/category/a;->a(Lnotepad/note/notas/notes/notizen/category/a$b;I)V

    return-void
.end method

.method b(Z)V
    .locals 0

    iput-boolean p1, p0, Lnotepad/note/notas/notes/notizen/category/a;->h:Z

    return-void
.end method

.method e()Z
    .locals 1

    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->j:Z

    return v0
.end method

.method f()Z
    .locals 1

    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/category/a;->h:Z

    return v0
.end method
