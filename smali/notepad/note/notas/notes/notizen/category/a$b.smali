.class Lnotepad/note/notas/notes/notizen/category/a$b;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/d;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnotepad/note/notas/notes/notizen/category/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private u:Landroid/widget/RelativeLayout;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/LinearLayout;

.field private x:Landroid/widget/LinearLayout;

.field private y:Landroid/widget/LinearLayout;

.field final synthetic z:Lnotepad/note/notas/notes/notizen/category/a;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/category/a;Landroid/view/View;)V
    .locals 2

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const v0, 0x7f080088

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->v:Landroid/widget/TextView;

    const v0, 0x7f0800ac

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->w:Landroid/widget/LinearLayout;

    const v0, 0x7f0800f2

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->u:Landroid/widget/RelativeLayout;

    const v0, 0x7f080069

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->x:Landroid/widget/LinearLayout;

    const v0, 0x7f080065

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->y:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->u:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->u:Landroid/widget/RelativeLayout;

    new-instance v1, Lnotepad/note/notas/notes/notizen/category/a$b$a;

    invoke-direct {v1, p0, p1}, Lnotepad/note/notas/notes/notizen/category/a$b$a;-><init>(Lnotepad/note/notas/notes/notizen/category/a$b;Lnotepad/note/notas/notes/notizen/category/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f08006b

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    new-instance v0, Lnotepad/note/notas/notes/notizen/category/a$b$b;

    invoke-direct {v0, p0, p1}, Lnotepad/note/notas/notes/notizen/category/a$b$b;-><init>(Lnotepad/note/notas/notes/notizen/category/a$b;Lnotepad/note/notas/notes/notizen/category/a;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/category/a$b;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->v:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/category/a$b;)Landroid/widget/LinearLayout;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->w:Landroid/widget/LinearLayout;

    return-object p0
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
    .locals 3

    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0800f2

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/a;->a(Lnotepad/note/notas/notes/notizen/category/a;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/a;->d(Lnotepad/note/notas/notes/notizen/category/a;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/a/b/c/a;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/category/a;->b(Lnotepad/note/notas/notes/notizen/category/a;)Lnotepad/note/notas/notes/notizen/category/a$a;

    move-result-object v0

    const-string v1, "select"

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/a;->a()I

    move-result v2

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/a;->b()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-interface {v0, v1, v2, p1}, Lnotepad/note/notas/notes/notizen/category/a$a;->a(Ljava/lang/String;ILjava/lang/String;)V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080069

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/a;->d(Lnotepad/note/notas/notes/notizen/category/a;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/a/b/c/a;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/category/a;->b(Lnotepad/note/notas/notes/notizen/category/a;)Lnotepad/note/notas/notes/notizen/category/a$a;

    move-result-object v0

    const-string v1, "editName"

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/a;->a()I

    move-result v2

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/a;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080065

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/a;->e(Lnotepad/note/notas/notes/notizen/category/a;)Lc/a/a/a/a/b/b/d;

    move-result-object p1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/category/a;->d(Lnotepad/note/notas/notes/notizen/category/a;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/a;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/a;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lc/a/a/a/a/b/b/d;->a(I)I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Lnotepad/note/notas/notes/notizen/category/a;->a(I)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/a;->f(Lnotepad/note/notas/notes/notizen/category/a;)Landroid/content/Context;

    move-result-object p1

    const-string v0, "First delete all notes in this category."

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    :cond_3
    :goto_1
    return-void
.end method
