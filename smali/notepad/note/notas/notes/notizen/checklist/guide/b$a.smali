.class Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/d;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnotepad/note/notas/notes/notizen/checklist/guide/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private u:Landroid/widget/ImageView;

.field private v:Landroid/widget/ImageView;

.field private w:Landroid/widget/ImageView;

.field private x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field final synthetic y:Lnotepad/note/notas/notes/notizen/checklist/guide/b;


# direct methods
.method public constructor <init>(Lnotepad/note/notas/notes/notizen/checklist/guide/b;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->y:Lnotepad/note/notas/notes/notizen/checklist/guide/b;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const p1, 0x7f0800d7

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->u:Landroid/widget/ImageView;

    const p1, 0x7f0800e6

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->v:Landroid/widget/ImageView;

    const p1, 0x7f080134

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->w:Landroid/widget/ImageView;

    const p1, 0x7f080198

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

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

.method static synthetic a(Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;I)V
    .locals 0

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->c(I)V

    return-void
.end method

.method private c(I)V
    .locals 4

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->y:Lnotepad/note/notas/notes/notizen/checklist/guide/b;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->a(Lnotepad/note/notas/notes/notizen/checklist/guide/b;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnotepad/note/notas/notes/notizen/checklist/guide/a;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->e()Z

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->v:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->v:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->b()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->v:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->b()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->v:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_1
    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_2
    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->u:Landroid/widget/ImageView;

    const v0, 0x7f07006b

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->u:Landroid/widget/ImageView;

    const v0, 0x7f0700ea

    :goto_3
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
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x1

    const v2, 0x7f0800f2

    if-ne v0, v2, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->y:Lnotepad/note/notas/notes/notizen/checklist/guide/b;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->a(Lnotepad/note/notas/notes/notizen/checklist/guide/b;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnotepad/note/notas/notes/notizen/checklist/guide/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->u:Landroid/widget/ImageView;

    const v0, 0x7f0700ea

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->y:Lnotepad/note/notas/notes/notizen/checklist/guide/b;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->a(Lnotepad/note/notas/notes/notizen/checklist/guide/b;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnotepad/note/notas/notes/notizen/checklist/guide/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->u:Landroid/widget/ImageView;

    const v0, 0x7f07006b

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->y:Lnotepad/note/notas/notes/notizen/checklist/guide/b;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->a(Lnotepad/note/notas/notes/notizen/checklist/guide/b;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnotepad/note/notas/notes/notizen/checklist/guide/a;

    invoke-virtual {p1, v1}, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f08006a

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/b$a;->y:Lnotepad/note/notas/notes/notizen/checklist/guide/b;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/guide/b;->b(Lnotepad/note/notas/notes/notizen/checklist/guide/b;)Landroid/content/Context;

    move-result-object p1

    const-string v0, "Good \ud83d\ude42 You can edit the checkbox in the your checklist \ud83d\ude42"

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_2
    :goto_0
    return-void
.end method
