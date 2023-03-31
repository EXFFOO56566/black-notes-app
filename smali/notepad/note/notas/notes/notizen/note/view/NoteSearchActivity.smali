.class public Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Landroid/view/inputmethod/InputMethodManager;

.field private t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

.field private u:Lnotepad/note/notas/notes/notizen/util/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->q()V

    return-void
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->o()V

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

    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->s:Landroid/view/inputmethod/InputMethodManager;

    const v0, 0x7f0800af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->u:Lnotepad/note/notas/notes/notizen/util/a;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->s:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method private q()V
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "noteSearch"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v0, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->s:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->o()V

    return-void
.end method

.method private r()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;->setEventListener(Lnotepad/note/notas/notes/notizen/ui/MyEditTextView$a;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->u:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f08007c

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->q()V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0800f2

    if-ne p1, v0, :cond_2

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->o()V

    :cond_2
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0030

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->p()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->r()V

    return-void
.end method
