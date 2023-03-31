.class public Lnotepad/note/notas/notes/notizen/note/more/NoteInformationActivity;
.super Landroidx/appcompat/app/c;
.source ""


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

.method private p()V
    .locals 5

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    const-string v2, "#000000"

    invoke-static {p0, v2}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    new-instance v2, Lc/a/a/a/a/b/b/d;

    invoke-direct {v2, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Lc/a/a/a/a/b/b/d;->d(I)Lc/a/a/a/a/b/c/d;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_1
    const v1, 0x7f08018e

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v2, 0x7f080192

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v3, 0x7f080197

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0800f2

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/more/NoteInformationActivity;->o()V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/more/NoteInformationActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b002f

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/more/NoteInformationActivity;->p()V

    return-void
.end method
