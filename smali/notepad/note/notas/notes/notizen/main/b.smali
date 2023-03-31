.class public Lnotepad/note/notas/notes/notizen/main/b;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnotepad/note/notas/notes/notizen/main/b$b;,
        Lnotepad/note/notas/notes/notizen/main/b$a;,
        Lnotepad/note/notas/notes/notizen/main/b$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Landroidx/recyclerview/widget/RecyclerView$d0;",
        ">;"
    }
.end annotation


# instance fields
.field private c:I

.field private d:Lnotepad/note/notas/notes/notizen/main/b$c;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/d;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lc/a/a/a/a/b/b/d;

.field private g:Lnotepad/note/notas/notes/notizen/util/a;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lnotepad/note/notas/notes/notizen/main/b;->c:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b;->e:Ljava/util/ArrayList;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p1}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b;->f:Lc/a/a/a/a/b/b/d;

    new-instance p1, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {p1}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b;->g:Lnotepad/note/notas/notes/notizen/util/a;

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/main/b;)Lnotepad/note/notas/notes/notizen/util/a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/b;->g:Lnotepad/note/notas/notes/notizen/util/a;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/main/b;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/b;->e:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/main/b;)Lnotepad/note/notas/notes/notizen/main/b$c;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/b;->d:Lnotepad/note/notas/notes/notizen/main/b$c;

    return-object p0
.end method

.method static synthetic d(Lnotepad/note/notas/notes/notizen/main/b;)Lc/a/a/a/a/b/b/d;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/b;->f:Lc/a/a/a/a/b/b/d;

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method a(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/d;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b;->e:Ljava/util/ArrayList;

    return-void
.end method

.method a(Lnotepad/note/notas/notes/notizen/main/b$c;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b;->d:Lnotepad/note/notas/notes/notizen/main/b$c;

    return-void
.end method

.method public b(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 3

    const/4 v0, 0x1

    const v1, 0x7f0b005a

    const/4 v2, 0x0

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-virtual {p2, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lnotepad/note/notas/notes/notizen/main/b$a;

    invoke-direct {p2, p0, p1}, Lnotepad/note/notas/notes/notizen/main/b$a;-><init>(Lnotepad/note/notas/notes/notizen/main/b;Landroid/view/View;)V

    return-object p2

    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0b0059

    invoke-virtual {p2, v0, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lnotepad/note/notas/notes/notizen/main/b$b;

    invoke-direct {p2, p0, p1}, Lnotepad/note/notas/notes/notizen/main/b$b;-><init>(Lnotepad/note/notas/notes/notizen/main/b;Landroid/view/View;)V

    return-object p2

    :cond_1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-virtual {p2, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lnotepad/note/notas/notes/notizen/main/b$a;

    invoke-direct {p2, p0, p1}, Lnotepad/note/notas/notes/notizen/main/b$a;-><init>(Lnotepad/note/notas/notes/notizen/main/b;Landroid/view/View;)V

    return-object p2
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 1

    instance-of v0, p1, Lnotepad/note/notas/notes/notizen/main/b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lnotepad/note/notas/notes/notizen/main/b$a;

    invoke-static {p1, p2}, Lnotepad/note/notas/notes/notizen/main/b$a;->a(Lnotepad/note/notas/notes/notizen/main/b$a;I)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lnotepad/note/notas/notes/notizen/main/b$b;

    if-eqz v0, :cond_1

    check-cast p1, Lnotepad/note/notas/notes/notizen/main/b$b;

    invoke-static {p1, p2}, Lnotepad/note/notas/notes/notizen/main/b$b;->a(Lnotepad/note/notas/notes/notizen/main/b$b;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public c(I)I
    .locals 0

    iget p1, p0, Lnotepad/note/notas/notes/notizen/main/b;->c:I

    return p1
.end method

.method e(I)V
    .locals 0

    iput p1, p0, Lnotepad/note/notas/notes/notizen/main/b;->c:I

    return-void
.end method
