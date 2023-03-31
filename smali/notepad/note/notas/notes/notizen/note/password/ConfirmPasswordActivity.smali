.class public Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Lc/a/a/a/a/b/c/d;

.field private t:Ljava/lang/String;

.field private u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

.field private v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private w:Lnotepad/note/notas/notes/notizen/util/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)Lnotepad/note/notas/notes/notizen/util/a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->w:Lnotepad/note/notas/notes/notizen/util/a;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->s()V

    return-void
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)Lnotepad/note/notas/notes/notizen/ui/MyTextView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    return-object p0
.end method

.method static synthetic d(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->p()V

    return-void
.end method

.method static synthetic e(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)Lc/a/a/a/a/b/c/d;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->s:Lc/a/a/a/a/b/c/d;

    return-object p0
.end method

.method static synthetic f(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    return-object p0
.end method

.method static synthetic g(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->o()V

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

.method private p()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->h()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->w:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->s()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0e0080

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void
.end method

.method private q()V
    .locals 3

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    new-instance v2, Lc/a/a/a/a/b/b/d;

    invoke-direct {v2, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Lc/a/a/a/a/b/b/d;->d(I)Lc/a/a/a/a/b/c/d;

    move-result-object v0

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->s:Lc/a/a/a/a/b/c/d;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "search"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->t:Ljava/lang/String;

    :cond_2
    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->w:Lnotepad/note/notas/notes/notizen/util/a;

    const v0, 0x7f080190

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v1, 0x7f0800f3

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    const v2, 0x7f0800ad

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v2, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const v2, 0x7f080191

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v2, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v2}, Landroid/widget/EditText;->requestFocus()Z

    invoke-static {p0}, Lb/b/a/b/a/c;->a(Landroid/content/Context;)V

    invoke-static {}, Lb/b/a/b/a/c;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {}, Lb/b/a/b/a/c;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "On"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$a;

    invoke-direct {v0, p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)V

    invoke-static {v0}, Lb/b/a/b/a/c;->a(Lb/b/a/b/a/b;)V

    goto :goto_1

    :cond_3
    const-string v1, "Off"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_4
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private r()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$c;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$c;-><init>(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$d;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$d;-><init>(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;->setEventListener(Lnotepad/note/notas/notes/notizen/ui/MyEditTextView$a;)V

    return-void
.end method

.method private s()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->s:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/d;->g()I

    move-result v1

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->t:Ljava/lang/String;

    const-string v2, "search"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080062

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->p()V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0032

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->q()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->r()V

    return-void
.end method
