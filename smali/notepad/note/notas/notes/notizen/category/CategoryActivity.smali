.class public Lnotepad/note/notas/notes/notizen/category/CategoryActivity;
.super Landroidx/appcompat/app/c;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;


# instance fields
.field private A:Lnotepad/note/notas/notes/notizen/util/a;

.field private s:Landroidx/recyclerview/widget/f;

.field private t:Lc/a/a/a/a/b/b/a;

.field private u:Lnotepad/note/notas/notes/notizen/category/a;

.field private v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private x:Landroid/widget/ImageView;

.field private y:Landroid/widget/RelativeLayout;

.field private z:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/category/CategoryActivity;)Lnotepad/note/notas/notes/notizen/util/a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    return-object p0
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/category/CategoryActivity;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 3

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Lnotepad/note/notas/notes/notizen/category/a;->b(Z)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v2, 0x7f0e0046

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->x:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {p1, v1}, Lnotepad/note/notas/notes/notizen/category/a;->b(Z)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v2, 0x7f0e0027

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->x:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/category/CategoryActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->o()V

    return-void
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/category/CategoryActivity;)Lnotepad/note/notas/notes/notizen/category/a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    return-object p0
.end method

.method private o()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010012

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private p()V
    .locals 6

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;)V

    const-string v0, "#1C1C1C"

    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    new-instance v0, Lc/a/a/a/a/b/b/a;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->t:Lc/a/a/a/a/b/b/a;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    new-instance v1, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v1}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    const v1, 0x7f08019a

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v2, 0x7f080130

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setFocusable(Z)V

    new-instance v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    new-instance v4, Lnotepad/note/notas/notes/notizen/category/a;

    invoke-direct {v4, p0, p0}, Lnotepad/note/notas/notes/notizen/category/a;-><init>(Landroid/content/Context;Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;)V

    iput-object v4, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    iget-object v5, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->t:Lc/a/a/a/a/b/b/a;

    invoke-virtual {v5}, Lc/a/a/a/a/b/b/a;->a()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v4, v5}, Lnotepad/note/notas/notes/notizen/category/a;->a(Ljava/util/ArrayList;)V

    iget-object v4, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    const v4, 0x7f08018a

    invoke-virtual {p0, v4}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v4, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v4, 0x7f08018c

    invoke-virtual {p0, v4}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v4, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v4, 0x7f0800e1

    invoke-virtual {p0, v4}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->x:Landroid/widget/ImageView;

    const v4, 0x7f080053

    invoke-virtual {p0, v4}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RelativeLayout;

    iput-object v4, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->y:Landroid/widget/RelativeLayout;

    const v4, 0x7f080060

    invoke-virtual {p0, v4}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    iput-object v4, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->z:Landroid/widget/LinearLayout;

    new-instance v4, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/a;

    iget-object v5, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-direct {v4, v5}, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/a;-><init>(Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;)V

    new-instance v5, Landroidx/recyclerview/widget/f;

    invoke-direct {v5, v4}, Landroidx/recyclerview/widget/f;-><init>(Landroidx/recyclerview/widget/f$f;)V

    iput-object v5, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->s:Landroidx/recyclerview/widget/f;

    invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/f;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {v0, v3}, Lc/a/a/a/a/b/b/d;->a(I)I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x7f0e0094

    invoke-virtual {p0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private q()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    new-instance v1, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/category/CategoryActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/category/a;->a(Lnotepad/note/notas/notes/notizen/category/a$a;)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->s:Landroidx/recyclerview/widget/f;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/f;->b(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    return-void
.end method

.method public btnClick(Landroid/view/View;)V
    .locals 7

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const v3, 0x7f080053

    if-ne v0, v3, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/category/AddCategoryActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    const p1, 0x7f01000d

    invoke-virtual {p0, p1, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f080056

    const/4 v4, -0x1

    const-string v5, "categoryId"

    const-string v6, "isAllNotes"

    if-ne v0, v3, :cond_5

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/category/a;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1, v6, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :goto_0
    invoke-virtual {p1, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :goto_1
    invoke-virtual {p0, v4, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    :cond_3
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->o()V

    goto :goto_4

    :cond_4
    :goto_2
    return-void

    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f080084

    if-ne v0, v3, :cond_8

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/category/a;->f()Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_3

    :cond_6
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1, v6, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_0

    :cond_7
    :goto_3
    return-void

    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v3, 0x7f080060

    if-ne v0, v3, :cond_a

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->A:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_9

    return-void

    :cond_9
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/category/a;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p1, v6, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_1

    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080067

    if-ne p1, v0, :cond_c

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/category/a;->f()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-direct {p0, v2}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->a(Z)V

    goto :goto_4

    :cond_b
    invoke-direct {p0, v1}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->a(Z)V

    :cond_c
    :goto_4
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->t:Lc/a/a/a/a/b/b/a;

    invoke-virtual {p2}, Lc/a/a/a/a/b/b/a;->a()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnotepad/note/notas/notes/notizen/category/a;->a(Ljava/util/ArrayList;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/category/a;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0, v1}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->a(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/category/a;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v2, "categoryId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v1, 0x1

    const-string v2, "isAllNotes"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    :cond_1
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->o()V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0021

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->p()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->q()V

    return-void
.end method
