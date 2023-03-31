.class public Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private A:Z

.field private s:Lc/a/a/a/a/b/b/d;

.field private t:I

.field private u:Lc/a/a/a/a/b/c/d;

.field private v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

.field private w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

.field private x:Lnotepad/note/notas/notes/notizen/util/a;

.field private y:I

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->A:Z

    return-void
.end method

.method private o()V
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v2}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->p()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnotepad/note/notas/notes/notizen/note/edit/DialogChangedNoteActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    const v0, 0x7f01000d

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    :goto_1
    return-void
.end method

.method private p()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->A:Z

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    iget v1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->y:I

    if-nez v1, :cond_0

    const v1, 0x7f010010

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    :goto_0
    return-void
.end method

.method private q()V
    .locals 4

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_0
    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v2}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v2}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->s:Lc/a/a/a/a/b/b/d;

    iget v3, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->t:I

    invoke-virtual {v2, v0, v1, v3}, Lc/a/a/a/a/b/b/d;->a(Ljava/lang/String;Ljava/lang/String;I)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    :cond_2
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->p()V

    return-void
.end method

.method private r()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "noteId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->t:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_0
    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->x:Lnotepad/note/notas/notes/notizen/util/a;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->s:Lc/a/a/a/a/b/b/d;

    iget v2, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->t:I

    invoke-virtual {v0, v2}, Lc/a/a/a/a/b/b/d;->d(I)Lc/a/a/a/a/b/c/d;

    move-result-object v0

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u:Lc/a/a/a/a/b/c/d;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_1
    const v0, 0x7f0800b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const v0, 0x7f0800ab

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const v0, 0x7f0800dd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->z:Landroid/widget/ImageView;

    return-void
.end method

.method private s()V
    .locals 3

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->t()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u()V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "selectedPosition"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->y:I

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroid/widget/EditText;->length()I

    move-result v1

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->y:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    iget v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->y:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->z:Landroid/widget/ImageView;

    const v1, 0x7f070074

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-void
.end method

.method private t()V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "SETTING"

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "NOTE_TEXT_COLOR"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const-string v1, "#E6E6E6"

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const-string v1, "#BFBFBF"

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const-string v1, "#899298"

    :goto_0
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextColor(I)V

    :goto_1
    return-void
.end method

.method private u()V
    .locals 3

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/d;->a(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/high16 v2, 0x42280000    # 42.0f

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/high16 v2, 0x42040000    # 33.0f

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/high16 v2, 0x41e00000    # 28.0f

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/high16 v2, 0x41c00000    # 24.0f

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/high16 v2, 0x41a00000    # 20.0f

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/high16 v2, 0x41880000    # 17.0f

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/widget/EditText;->setTextSize(IF)V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->x:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080067

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->q()V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080060

    if-ne v0, v1, :cond_2

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->o()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f08007a

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {p1}, Landroid/widget/EditText;->getSelectionStart()I

    move-result p1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v1}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v0

    if-gt p1, v0, :cond_3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {p1}, Landroid/widget/EditText;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    const-string p1, "type"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "save"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->q()V

    goto :goto_0

    :cond_0
    const-string p2, "close"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->p()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b002c

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->r()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->s()V

    return-void
.end method

.method protected onStop()V
    .locals 4

    invoke-super {p0}, Landroidx/appcompat/app/c;->onStop()V

    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->A:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->v:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->w:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_0
    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v2}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->u:Lc/a/a/a/a/b/c/d;

    invoke-virtual {v2}, Lc/a/a/a/a/b/c/d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->s:Lc/a/a/a/a/b/b/d;

    iget v3, p0, Lnotepad/note/notas/notes/notizen/note/edit/EditNoteActivity;->t:I

    invoke-virtual {v2, v0, v1, v3}, Lc/a/a/a/a/b/b/d;->a(Ljava/lang/String;Ljava/lang/String;I)V

    :cond_2
    return-void
.end method
