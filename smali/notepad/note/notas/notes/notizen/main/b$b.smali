.class Lnotepad/note/notas/notes/notizen/main/b$b;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnotepad/note/notas/notes/notizen/main/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private w:Landroid/widget/ImageView;

.field private x:Landroid/widget/ImageView;

.field private y:Landroid/widget/ImageView;

.field final synthetic z:Lnotepad/note/notas/notes/notizen/main/b;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/main/b;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->z:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const p1, 0x7f080198

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const p1, 0x7f08018a

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const p1, 0x7f0800e2

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->w:Landroid/widget/ImageView;

    const p1, 0x7f0800dc

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->x:Landroid/widget/ImageView;

    const p1, 0x7f0800e9

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->y:Landroid/widget/ImageView;

    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/main/b$b;I)V
    .locals 0

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/main/b$b;->c(I)V

    return-void
.end method

.method private c(I)V
    .locals 4

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->z:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/b;->b(Lnotepad/note/notas/notes/notizen/main/b;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->w:Landroid/widget/ImageView;

    const v1, 0x7f0700eb

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->w:Landroid/widget/ImageView;

    const v1, 0x7f0700ea

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->u:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->f()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->j()Z

    move-result v0

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->x:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->x:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_2
    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->y:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    :cond_3
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->y:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_3
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

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
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    const-string p1, "true"

    :try_start_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->z:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/b;->b(Lnotepad/note/notas/notes/notizen/main/b;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->z:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/b;->d(Lnotepad/note/notas/notes/notizen/main/b;)Lc/a/a/a/a/b/b/d;

    move-result-object p1

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->g()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lc/a/a/a/a/b/b/d;->b(IZ)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->z:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/b;->b(Lnotepad/note/notas/notes/notizen/main/b;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/a/b/c/d;

    const-string v0, "false"

    invoke-virtual {p1, v0}, Lc/a/a/a/a/b/c/d;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->w:Landroid/widget/ImageView;

    const v0, 0x7f0700ea

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->z:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-static {v1}, Lnotepad/note/notas/notes/notizen/main/b;->d(Lnotepad/note/notas/notes/notizen/main/b;)Lc/a/a/a/a/b/b/d;

    move-result-object v1

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->g()I

    move-result v0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lc/a/a/a/a/b/b/d;->b(IZ)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->z:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/b;->b(Lnotepad/note/notas/notes/notizen/main/b;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0, p1}, Lc/a/a/a/a/b/c/d;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->w:Landroid/widget/ImageView;

    const v0, 0x7f0700eb

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;->printStackTrace()V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/b$b;->z:Lnotepad/note/notas/notes/notizen/main/b;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    :goto_0
    return-void
.end method
