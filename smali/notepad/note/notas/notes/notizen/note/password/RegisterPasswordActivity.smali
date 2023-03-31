.class public Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;
.super Landroidx/appcompat/app/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;
    }
.end annotation


# instance fields
.field private s:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

.field private t:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private u:Ljava/lang/String;

.field private v:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

.field private w:Lc/a/a/a/a/b/b/d;

.field private x:I

.field private y:Lnotepad/note/notas/notes/notizen/util/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    sget-object v0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;->b:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->v:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;)Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->v:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->r()V

    return-void
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->p()V

    return-void
.end method

.method static synthetic d(Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->o()V

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
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->u:Ljava/lang/String;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->s:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->y:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->w:Lc/a/a/a/a/b/b/d;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->x:I

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->s:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v2}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/a/b/b/d;->a(ILjava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->s:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "password"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->o()V

    goto :goto_0

    :cond_1
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

    iput v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->x:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->w:Lc/a/a/a/a/b/b/d;

    const v0, 0x7f080189

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v0, 0x7f0800ad

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->s:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->y:Lnotepad/note/notas/notes/notizen/util/a;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->s:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method private r()V
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->s:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->u:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;->c:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->v:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    const v2, 0x7f0e0041

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->s:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private s()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->s:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->s:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;->setEventListener(Lnotepad/note/notas/notes/notizen/ui/MyEditTextView$a;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080051

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->v:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    sget-object v0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;->b:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->r()V

    goto :goto_0

    :cond_0
    sget-object v0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;->c:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->p()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0033

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->q()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->s()V

    return-void
.end method
