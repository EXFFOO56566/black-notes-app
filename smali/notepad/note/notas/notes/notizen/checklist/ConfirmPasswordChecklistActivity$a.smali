.class Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/a/b/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$a;->a:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$a;->a:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;->a(Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;)Lnotepad/note/notas/notes/notizen/util/a;

    move-result-object p1

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$a;->a:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;->b(Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;)V

    return-void
.end method

.method public a(Lb/b/a/b/a/a;ZLjava/lang/CharSequence;II)V
    .locals 0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity$a;->a:Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;->c(Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;)Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
