.class Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private u:Landroid/widget/ImageView;

.field private v:Landroid/widget/ImageView;

.field private w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field final synthetic y:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;Landroid/view/View;)V
    .locals 1

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->y:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const p1, 0x7f080198

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const p1, 0x7f08018a

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const p1, 0x7f0800e9

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->u:Landroid/widget/ImageView;

    const p1, 0x7f0800dc

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->v:Landroid/widget/ImageView;

    const p1, 0x7f08006e

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    new-instance p1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/a;

    invoke-direct {p1, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/a;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;I)V
    .locals 0

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->c(I)V

    return-void
.end method

.method private c(I)V
    .locals 4

    const-string v0, ""

    :try_start_0
    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->y:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    invoke-static {v1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/a/b/c/d;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->f()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->x:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->j()Z

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eqz v1, :cond_1

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->v:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    :cond_1
    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->v:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_2
    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->u:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    :cond_2
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->u:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_3
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->y:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->b(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->a(Lnotepad/note/notas/notes/notizen/ui/MyTextView;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_4
    return-void
.end method


# virtual methods
.method public synthetic a(Landroid/view/View;)V
    .locals 3

    :try_start_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->y:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/a/b/c/d;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$b;->y:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->c(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;)Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$a;

    move-result-object v0

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->g()I

    move-result v1

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/d;->j()Z

    move-result p1

    invoke-interface {v0, v1, v2, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$a;->a(ILjava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method a(Lnotepad/note/notas/notes/notizen/ui/MyTextView;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p1}, Landroidx/appcompat/widget/z;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    new-instance v3, Landroid/text/SpannableString;

    invoke-virtual {p1}, Landroidx/appcompat/widget/z;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    const-string v4, "#8030be91"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v2, v5, :cond_1

    const/4 v5, -0x1

    if-eq v1, v5, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v5, :cond_0

    goto :goto_1

    :cond_0
    new-instance v2, Landroid/text/style/BackgroundColorSpan;

    invoke-direct {v2, v4}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v1

    const/16 v6, 0x21

    invoke-interface {v3, v2, v1, v5, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {p1, v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    add-int/lit8 v2, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
