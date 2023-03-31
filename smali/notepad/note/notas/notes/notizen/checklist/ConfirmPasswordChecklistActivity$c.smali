.class Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$c;->b:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/4 p3, 0x4

    if-eq p2, p3, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$c;->b:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;->f(Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;)Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$c;->b:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-static {p2}, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;->e(Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;)Lc/a/a/a/a/b/c/d;

    move-result-object p2

    invoke-virtual {p2}, Lc/a/a/a/a/b/c/d;->h()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$c;->b:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;->a(Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;)Lnotepad/note/notas/notes/notizen/util/a;

    move-result-object p1

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$c;->b:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;->b(Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;)V

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ne p1, p3, :cond_2

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$c;->b:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;->d(Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;)V

    :cond_2
    :goto_0
    return-void
.end method
