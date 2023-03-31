.class public Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Lc/a/a/a/a/b/b/d;

.field private t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

.field private u:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->o()V

    return-void
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->p()V

    return-void
.end method

.method private o()V
    .locals 7

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v0, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->s:Lc/a/a/a/a/b/b/d;

    const/4 v4, 0x0

    iget v5, p0, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->u:I

    const/4 v6, 0x1

    const-string v3, ""

    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/a/b/b/d;->a(Ljava/lang/String;Ljava/lang/String;IIZ)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    :cond_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->p()V

    return-void
.end method

.method private p()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f01000e

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private q()V
    .locals 3

    const-string v0, "#000000"

    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    const v0, 0x7f0800af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->s:Lc/a/a/a/a/b/b/d;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "categoryId"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->u:I

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method private r()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;->setEventListener(Lnotepad/note/notas/notes/notizen/ui/MyEditTextView$a;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080052

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->o()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0800f2

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->p()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->p()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b001e

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->q()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddChecklistActivity;->r()V

    return-void
.end method
