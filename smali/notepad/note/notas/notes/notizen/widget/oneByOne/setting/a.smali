.class public Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;,
        Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;",
        ">;"
    }
.end annotation


# instance fields
.field private c:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$a;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 11

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->d:Ljava/util/ArrayList;

    const-string v1, "sky"

    const-string v2, "blue"

    const-string v3, "purpleLight"

    const-string v4, "green"

    const-string v5, "mint"

    const-string v6, "red"

    const-string v7, "pink"

    const-string v8, "orange"

    const-string v9, "yellow"

    const-string v10, "purple"

    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0xa

    if-ge v1, v2, :cond_0

    aget-object v2, v0, v1

    new-instance v3, Lc/a/a/a/a/b/c/c;

    invoke-direct {v3}, Lc/a/a/a/a/b/c/c;-><init>()V

    invoke-virtual {v3, v2}, Lc/a/a/a/a/b/c/c;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->d:Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/a/a/a/a/b/c/c;->a(Z)V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->d:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;)Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->c:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$a;

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$a;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->c:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$a;

    return-void
.end method

.method public a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;I)V
    .locals 0

    invoke-static {p1, p2}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;I)V

    return-void
.end method

.method public bridge synthetic b(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0b005b

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    invoke-direct {p2, p0, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;Landroid/view/View;)V

    return-object p2
.end method

.method public bridge synthetic b(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    check-cast p1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;I)V

    return-void
.end method
