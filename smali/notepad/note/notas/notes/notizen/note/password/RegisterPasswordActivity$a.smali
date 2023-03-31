.class Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$a;->b:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_2

    const/16 p1, 0x42

    if-ne p2, p1, :cond_2

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$a;->b:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->a(Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;)Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    move-result-object p1

    sget-object p2, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;->b:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$a;->b:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->b(Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$a;->b:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->a(Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;)Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    move-result-object p1

    sget-object p2, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;->c:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$c;

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity$a;->b:Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;->c(Lnotepad/note/notas/notes/notizen/note/password/RegisterPasswordActivity;)V

    :cond_1
    :goto_0
    return p3

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
