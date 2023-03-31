.class public Lnotepad/note/notas/notes/notizen/checklist/guide/GuideActivity;
.super Landroidx/appcompat/app/c;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;


# instance fields
.field private s:Lnotepad/note/notas/notes/notizen/util/a;

.field private t:Landroidx/recyclerview/widget/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method private o()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010010

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/GuideActivity;->t:Landroidx/recyclerview/widget/f;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/f;->b(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    return-void
.end method

.method public btnClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/GuideActivity;->s:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080060

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/guide/GuideActivity;->o()V

    :cond_1
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/guide/GuideActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0023

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;)V

    new-instance p1, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {p1}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/GuideActivity;->s:Lnotepad/note/notas/notes/notizen/util/a;

    new-instance p1, Lnotepad/note/notas/notes/notizen/checklist/guide/b;

    invoke-direct {p1, p0}, Lnotepad/note/notas/notes/notizen/checklist/guide/b;-><init>(Landroid/content/Context;)V

    const v0, 0x7f080130

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    new-instance v1, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/b;

    invoke-direct {v1, p1}, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/b;-><init>(Lnotepad/note/notas/notes/notizen/util/recyclerView/a/c;)V

    new-instance p1, Landroidx/recyclerview/widget/f;

    invoke-direct {p1, v1}, Landroidx/recyclerview/widget/f;-><init>(Landroidx/recyclerview/widget/f$f;)V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/GuideActivity;->t:Landroidx/recyclerview/widget/f;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/f;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method
