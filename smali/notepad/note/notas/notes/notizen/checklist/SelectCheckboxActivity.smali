.class public Lnotepad/note/notas/notes/notizen/checklist/SelectCheckboxActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Lnotepad/note/notas/notes/notizen/util/a;


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

    const v1, 0x7f01000e

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/SelectCheckboxActivity;->s:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0800f2

    if-ne v0, v1, :cond_1

    :goto_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/SelectCheckboxActivity;->o()V

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080065

    const/4 v2, -0x1

    const-string v3, "type"

    if-ne v0, v1, :cond_2

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "delete"

    :goto_1
    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080085

    if-ne p1, v0, :cond_3

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "unCheck"

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/SelectCheckboxActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0038

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    const-string p1, "#000000"

    invoke-static {p0, p1}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    new-instance p1, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {p1}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/SelectCheckboxActivity;->s:Lnotepad/note/notas/notes/notizen/util/a;

    return-void
.end method
