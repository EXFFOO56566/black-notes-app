.class public Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;,
        Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;",
        ">;"
    }
.end annotation


# instance fields
.field private c:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$a;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/d;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->d:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->d:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->e:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;)Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->c:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$a;

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public a(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/d;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->d:Ljava/util/ArrayList;

    iput-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->e:Ljava/lang/String;

    return-void
.end method

.method public a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$a;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->c:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$a;

    return-void
.end method

.method public a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;I)V
    .locals 0

    invoke-static {p1, p2}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;I)V

    return-void
.end method

.method public bridge synthetic b(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0b005a

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;

    invoke-direct {p2, p0, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;Landroid/view/View;)V

    return-object p2
.end method

.method public bridge synthetic b(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    check-cast p1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;I)V

    return-void
.end method
