.class public Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;,
        Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;",
        ">;",
        "Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;"
    }
.end annotation


# instance fields
.field private c:Lc/a/a/a/a/b/b/c;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/b;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lc/a/a/a/a/b/c/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    new-instance v0, Lc/a/a/a/a/b/b/c;

    invoke-direct {v0, p1}, Lc/a/a/a/a/b/b/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->c:Lc/a/a/a/a/b/b/c;

    iput-object p2, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->d:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->d:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;)Lc/a/a/a/a/b/b/c;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->c:Lc/a/a/a/a/b/b/c;

    return-object p0
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;)Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->e:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public a(I)V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/b;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/b;->a()I

    move-result v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->c:Lc/a/a/a/a/b/b/c;

    invoke-virtual {v1, v0}, Lc/a/a/a/a/b/b/c;->a(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->e:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;

    invoke-interface {p1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;->a()V

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

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->d:Ljava/util/ArrayList;

    return-void
.end method

.method public a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->e:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;

    return-void
.end method

.method public a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;I)V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/a/a/a/a/b/c/b;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;)Lnotepad/note/notas/notes/notizen/ui/MyTextView;

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
    invoke-static {p1, p2}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;Z)V

    return-void
.end method

.method public a(II)Z
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/b;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/b;->a()I

    move-result v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/a/b/c/b;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/b;->a()I

    move-result v1

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->c:Lc/a/a/a/a/b/b/c;

    invoke-virtual {v2, v0, p2}, Lc/a/a/a/a/b/b/c;->a(II)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->c:Lc/a/a/a/a/b/b/c;

    invoke-virtual {v0, v1, p1}, Lc/a/a/a/a/b/b/c;->a(II)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->d:Ljava/util/ArrayList;

    invoke-static {v0, p1, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->b(II)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic b(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/ViewGroup;I)Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0b0058

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;

    invoke-direct {p2, p0, p1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;-><init>(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;Landroid/view/View;)V

    return-object p2
.end method

.method public bridge synthetic b(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    check-cast p1, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;

    invoke-virtual {p0, p1, p2}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;I)V

    return-void
.end method
