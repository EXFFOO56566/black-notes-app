.class public Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Lc/a/a/a/a/b/b/a;

.field private t:Lnotepad/note/notas/notes/notizen/util/a;

.field private u:Lnotepad/note/notas/notes/notizen/category/selectCategory/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;)Lnotepad/note/notas/notes/notizen/util/a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/util/a;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->o()V

    return-void
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
    .locals 4

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;)V

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/util/a;

    new-instance v0, Lnotepad/note/notas/notes/notizen/category/selectCategory/b;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/category/selectCategory/b;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/selectCategory/b;

    new-instance v1, Lc/a/a/a/a/b/b/a;

    invoke-direct {v1, p0}, Lc/a/a/a/a/b/b/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lc/a/a/a/a/b/b/a;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/category/selectCategory/b;->a(Ljava/util/ArrayList;)V

    const v0, 0x7f080130

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/selectCategory/b;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    new-instance v0, Lc/a/a/a/a/b/b/a;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->s:Lc/a/a/a/a/b/b/a;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "main"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "#1C1C1C"

    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    const v1, 0x7f0800fb

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    const v0, 0x7f080053

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "#181818"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method private q()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/selectCategory/b;

    new-instance v1, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/category/selectCategory/b;->a(Lnotepad/note/notas/notes/notizen/category/selectCategory/b$a;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080053

    if-ne v0, v1, :cond_1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/category/AddCategoryActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    const p1, 0x7f01000d

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080060

    if-ne p1, v0, :cond_2

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->o()V

    :cond_2
    :goto_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/selectCategory/b;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->s:Lc/a/a/a/a/b/b/a;

    invoke-virtual {p2}, Lc/a/a/a/a/b/b/a;->a()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnotepad/note/notas/notes/notizen/category/selectCategory/b;->a(Ljava/util/ArrayList;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->u:Lnotepad/note/notas/notes/notizen/category/selectCategory/b;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0037

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->p()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->q()V

    return-void
.end method
