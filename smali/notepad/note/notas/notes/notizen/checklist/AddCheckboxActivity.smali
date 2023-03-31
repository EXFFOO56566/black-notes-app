.class public Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Lnotepad/note/notas/notes/notizen/util/a;

.field private t:Lc/a/a/a/a/b/b/b;

.field private u:I

.field private v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;)Lnotepad/note/notas/notes/notizen/util/a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->s:Lnotepad/note/notas/notes/notizen/util/a;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->o()V

    return-void
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->p()V

    return-void
.end method

.method private o()V
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->t:Lc/a/a/a/a/b/b/b;

    iget v2, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->u:I

    invoke-virtual {v1, v2, v0}, Lc/a/a/a/a/b/b/b;->a(ILjava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    :cond_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->p()V

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

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iget v1, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->u:I

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->u:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    const-string v0, "#000000"

    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    new-instance v0, Lc/a/a/a/a/b/b/b;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->t:Lc/a/a/a/a/b/b/b;

    const v0, 0x7f0800af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->s:Lnotepad/note/notas/notes/notizen/util/a;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method private r()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;->setEventListener(Lnotepad/note/notas/notes/notizen/ui/MyEditTextView$a;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->s:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080052

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->o()V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0800f2

    if-ne p1, v0, :cond_2

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->p()V

    :cond_2
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->p()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b001d

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->q()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/checklist/AddCheckboxActivity;->r()V

    return-void
.end method
