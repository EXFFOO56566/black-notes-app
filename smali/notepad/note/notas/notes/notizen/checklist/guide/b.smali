.class public Lnotepad/note/notas/notes/notizen/checklist/guide/b;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;",
        ">;",
        "Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;"
    }
.end annotation


# instance fields
.field private c:Landroid/content/Context;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lnotepad/note/notas/notes/notizen/checklist/guide/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->c:Landroid/content/Context;

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->e()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/checklist/guide/b;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/checklist/guide/b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->c:Landroid/content/Context;

    return-object p0
.end method

.method private e()V
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    new-instance v0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->c(Z)V

    const-string v2, "Touch : check / uncheck"

    invoke-virtual {v0, v2}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(Ljava/lang/String;)V

    const v2, 0x7f07007d

    invoke-virtual {v0, v2}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(I)V

    new-instance v2, Lnotepad/note/notas/notes/notizen/checklist/guide/a;

    invoke-direct {v2}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;-><init>()V

    invoke-virtual {v2, v1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->c(Z)V

    const-string v3, "Swipe : delete"

    invoke-virtual {v2, v3}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(Ljava/lang/String;)V

    const v3, 0x7f07007a

    invoke-virtual {v2, v3}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(I)V

    new-instance v3, Lnotepad/note/notas/notes/notizen/checklist/guide/a;

    invoke-direct {v3}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;-><init>()V

    invoke-virtual {v3, v1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->c(Z)V

    const-string v4, "Long touch and move : change"

    invoke-virtual {v3, v4}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(Ljava/lang/String;)V

    const v4, 0x7f07007c

    invoke-virtual {v3, v4}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(I)V

    new-instance v4, Lnotepad/note/notas/notes/notizen/checklist/guide/a;

    invoke-direct {v4}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;-><init>()V

    invoke-virtual {v4, v1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->c(Z)V

    invoke-virtual {v4, v1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->b(Z)V

    const-string v5, "Touch the end : edit"

    invoke-virtual {v4, v5}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(Ljava/lang/String;)V

    const v5, 0x7f07007b

    invoke-virtual {v4, v5}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(I)V

    new-instance v5, Lnotepad/note/notas/notes/notizen/checklist/guide/a;

    invoke-direct {v5}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;-><init>()V

    invoke-virtual {v5, v1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->c(Z)V

    const-string v6, "Let\'s practice."

    invoke-virtual {v5, v6}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(Ljava/lang/String;)V

    new-instance v6, Lnotepad/note/notas/notes/notizen/checklist/guide/a;

    invoke-direct {v6}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;-><init>()V

    invoke-virtual {v6, v1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->c(Z)V

    const-string v7, "Thanks for using my app \ud83d\ude42"

    invoke-virtual {v6, v7}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(Ljava/lang/String;)V

    iget-object v7, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    const/16 v0, 0xb

    if-ge v1, v0, :cond_0

    new-instance v0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d(I)V

    return-void
.end method

.method public a(Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;I)V
    .locals 0

    invoke-static {p1, p2}, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->a(Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;I)V

    return-void
.end method

.method public a(II)Z
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->d:Ljava/util/ArrayList;

    invoke-static {v0, p1, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->b(II)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic b(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0b0057

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;

    invoke-direct {p2, p0, p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;-><init>(Lnotepad/note/notas/notes/notizen/checklist/guide/b;Landroid/view/View;)V

    return-object p2
.end method

.method public bridge synthetic b(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    check-cast p1, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->a(Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;I)V

    return-void
.end method
