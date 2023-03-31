.class Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/d;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private u:Landroid/widget/ImageView;

.field private v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field final synthetic w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;


# direct methods
.method public constructor <init>(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const p1, 0x7f0800d7

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->u:Landroid/widget/ImageView;

    const p1, 0x7f08018d

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const p1, 0x7f0800f2

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f08006a

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;)Lnotepad/note/notas/notes/notizen/ui/MyTextView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    return-object p0
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->b(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string v0, "#BCBCBC"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v0

    or-int/lit8 v0, v0, 0x10

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setPaintFlags(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->u:Landroid/widget/ImageView;

    const v0, 0x7f07006b

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const-string v0, "#FFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v0

    and-int/lit8 v0, v0, -0x11

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setPaintFlags(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->u:Landroid/widget/ImageView;

    const v0, 0x7f0700ea

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    const-string v1, "#BF232323"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0800f2

    if-ne v0, v1, :cond_1

    :try_start_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/a/b/c/b;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc/a/a/a/a/b/c/b;->a(Z)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->b(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;)Lc/a/a/a/a/b/b/c;

    move-result-object v0

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/b;->a()I

    move-result p1

    :goto_0
    invoke-virtual {v0, p1, v1}, Lc/a/a/a/a/b/b/c;->a(IZ)V

    invoke-direct {p0, v1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->b(Z)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/a/a/a/a/b/c/b;->a(Z)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->b(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;)Lc/a/a/a/a/b/b/c;

    move-result-object v0

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/b;->a()I

    move-result p1

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->c(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;)Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;

    move-result-object p1

    invoke-interface {p1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;->a()V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f08006a

    if-ne p1, v0, :cond_2

    :try_start_1
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->a(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/a/b/c/b;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;->c(Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;)Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;

    move-result-object v0

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/b;->a()I

    move-result p1

    invoke-interface {v0, p1}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;->a(I)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$b;->w:Lnotepad/note/notas/notes/notizen/main/dailyCheck/a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    :catch_1
    :cond_2
    :goto_2
    return-void
.end method
