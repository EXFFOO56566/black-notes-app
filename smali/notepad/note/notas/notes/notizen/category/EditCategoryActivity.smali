.class public Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Landroid/view/inputmethod/InputMethodManager;

.field private t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

.field private u:Lc/a/a/a/a/b/b/a;

.field private v:Lnotepad/note/notas/notes/notizen/util/a;

.field private w:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->p()V

    return-void
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->o()V

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

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->s:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const-string v2, "\\s"

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->u:Lc/a/a/a/a/b/b/a;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->w:I

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v2}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc/a/a/a/a/b/b/a;->a(ILjava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    :cond_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->o()V

    return-void
.end method

.method private q()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "categoryId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->w:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    const-string v0, "#000000"

    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->s:Landroid/view/inputmethod/InputMethodManager;

    const v0, 0x7f0800af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v0, Lc/a/a/a/a/b/b/a;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->u:Lc/a/a/a/a/b/b/a;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->w:I

    invoke-virtual {v0, v1}, Lc/a/a/a/a/b/b/a;->b(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->s:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method private r()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;->setEventListener(Lnotepad/note/notas/notes/notizen/ui/MyEditTextView$a;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080067

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->p()V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0800f2

    if-ne p1, v0, :cond_2

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->o()V

    :cond_2
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0029

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->q()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;->r()V

    return-void
.end method
