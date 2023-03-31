.class public Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;->o()V

    return-void
.end method

.method private o()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f01000e

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private p()V
    .locals 3

    const-string v0, "#000000"

    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    new-instance v0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;->s:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;

    const v0, 0x7f080130

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;->s:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    return-void
.end method

.method private q()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;->s:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;

    new-instance v1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$a;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0800f2

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;->o()V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0041

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;->p()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;->q()V

    return-void
.end method
