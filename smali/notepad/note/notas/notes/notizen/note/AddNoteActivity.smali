.class public Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:I

.field private t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

.field private u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

.field private v:Lc/a/a/a/a/b/b/d;

.field private w:Lnotepad/note/notas/notes/notizen/util/a;

.field private x:Z

.field private y:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->x:Z

    iput v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->y:I

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 3

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->w:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "categoryId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->s:I

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->v:Lc/a/a/a/a/b/b/d;

    const v0, 0x7f0800b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const v0, 0x7f0800ab

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    if-eqz p1, :cond_0

    const-string v0, "noteId"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->y:I

    const-string v0, "isCreatedNote"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->x:Z

    :cond_0
    const-string p1, "SETTING"

    invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "NOTE_TEXT_COLOR"

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->c(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->v()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->t()V

    return-void
.end method

.method private c(I)V
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const-string v0, "#E6E6E6"

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const-string v0, "#BFBFBF"

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const-string v0, "#899298"

    :goto_0
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setTextColor(I)V

    :goto_1
    return-void
.end method

.method private o()V
    .locals 7

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v0, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->x:Z

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->v:Lc/a/a/a/a/b/b/d;

    const/4 v4, 0x0

    iget v5, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->s:I

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lc/a/a/a/a/b/b/d;->a(Ljava/lang/String;Ljava/lang/String;IIZ)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->v:Lc/a/a/a/a/b/b/d;

    invoke-virtual {v0}, Lc/a/a/a/a/b/b/d;->c()I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->y:I

    return-void
.end method

.method private p()V
    .locals 5

    const/4 v0, 0x0

    const-string v1, "SETTING"

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "NOTE_TEXT_COLOR"

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v4, 0x2

    if-ge v1, v4, :cond_0

    add-int/lit8 v0, v1, 0x1

    :cond_0
    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-direct {p0, v0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->c(I)V

    return-void
.end method

.method private q()V
    .locals 1

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/d;->a(Landroid/content/Context;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x6

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x5

    goto :goto_0

    :pswitch_3
    const/4 v0, 0x4

    goto :goto_0

    :pswitch_4
    const/4 v0, 0x3

    goto :goto_0

    :pswitch_5
    const/4 v0, 0x2

    :goto_0
    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/d;->a(Landroid/content/Context;I)V

    :goto_1
    return-void

    nop

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

.method private r()V
    .locals 3

    iget v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->y:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->v:Lc/a/a/a/a/b/b/d;

    iget v1, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->y:I

    invoke-virtual {v0, v1}, Lc/a/a/a/a/b/b/d;->b(I)V

    :cond_0
    return-void
.end method

.method private s()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010010

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private t()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.action.SEND"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "text/plain"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "android.intent.extra.SUBJECT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method private u()V
    .locals 1

    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->x:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->w()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->o()V

    :goto_0
    return-void
.end method

.method private v()V
    .locals 3

    invoke-static {p0}, Lnotepad/note/notas/notes/notizen/util/d;->a(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/high16 v2, 0x42280000    # 42.0f

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/high16 v2, 0x42040000    # 33.0f

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/high16 v2, 0x41e00000    # 28.0f

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/high16 v2, 0x41c00000    # 24.0f

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const/high16 v2, 0x41a00000    # 20.0f

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

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

.method private w()V
    .locals 4

    iget v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->y:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->v:Lc/a/a/a/a/b/b/d;

    iget v3, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->y:I

    invoke-virtual {v2, v0, v1, v3}, Lc/a/a/a/a/b/b/d;->a(Ljava/lang/String;Ljava/lang/String;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080052

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080060

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f08005e

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->q()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->v()V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f08005d

    if-ne p1, v0, :cond_4

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->p()V

    goto :goto_1

    :cond_2
    :goto_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->w:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_3

    return-void

    :cond_3
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->r()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->s()V

    :cond_4
    :goto_1
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->r()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->s()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0b001f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->y:I

    const-string v1, "noteId"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->x:Z

    const-string v1, "isCreatedNote"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method protected onStop()V
    .locals 0

    invoke-super {p0}, Landroidx/appcompat/app/c;->onStop()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/note/AddNoteActivity;->u()V

    return-void
.end method
