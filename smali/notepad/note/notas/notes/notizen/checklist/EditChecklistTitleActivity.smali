.class public Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:I

.field private t:Lc/a/a/a/a/b/b/d;

.field private u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->p()V

    return-void
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->o()V

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

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->t:Lc/a/a/a/a/b/b/d;

    iget v2, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->s:I

    invoke-virtual {v1, v0, v2}, Lc/a/a/a/a/b/b/d;->a(Ljava/lang/String;I)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    :cond_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->o()V

    return-void
.end method

.method private q()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->s:I

    if-nez v0, :cond_0

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    const-string v0, "#000000"

    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->t:Lc/a/a/a/a/b/b/d;

    const v0, 0x7f0800af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->t:Lc/a/a/a/a/b/b/d;

    iget v2, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->s:I

    invoke-virtual {v0, v2}, Lc/a/a/a/a/b/b/d;->d(I)Lc/a/a/a/a/b/c/d;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroid/widget/EditText;->requestFocus()Z

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    :cond_2
    return-void
.end method

.method private r()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;->setEventListener(Lnotepad/note/notas/notes/notizen/ui/MyEditTextView$a;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080067

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->p()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0800f2

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->o()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b002b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->q()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/EditChecklistTitleActivity;->r()V

    return-void
.end method
