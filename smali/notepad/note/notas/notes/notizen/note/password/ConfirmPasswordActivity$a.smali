.class Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/a/b/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$a;->a:Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$a;->a:Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->a(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)Lnotepad/note/notas/notes/notizen/util/a;

    move-result-object p1

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$a;->a:Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->b(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)V

    return-void
.end method

.method public a(Lb/b/a/b/a/a;ZLjava/lang/CharSequence;II)V
    .locals 0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity$a;->a:Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;->c(Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;)Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
