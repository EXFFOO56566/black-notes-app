.class Lnotepad/note/notas/notes/notizen/main/MainActivity$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/main/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/main/MainActivity;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/main/MainActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/main/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->b(Lnotepad/note/notas/notes/notizen/main/MainActivity;)Lc/a/a/a/a/b/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lc/a/a/a/a/b/b/d;->e()V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->b(Lnotepad/note/notas/notes/notizen/main/MainActivity;)Lc/a/a/a/a/b/b/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/a/a/a/a/b/b/d;->h(I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->a(Lnotepad/note/notas/notes/notizen/main/MainActivity;Z)V

    return-void
.end method

.method public a(ILjava/lang/String;Z)V
    .locals 2

    const-string v0, "noteId"

    const-string v1, ""

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p3, :cond_1

    if-eqz p2, :cond_0

    new-instance p2, Landroid/content/Intent;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    const-class v1, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;

    invoke-direct {p2, p3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    new-instance p2, Landroid/content/Intent;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    const-class v1, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;

    invoke-direct {p2, p3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    new-instance p2, Landroid/content/Intent;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    const-class v1, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;

    invoke-direct {p2, p3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :cond_2
    new-instance p2, Landroid/content/Intent;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    const-class v1, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-direct {p2, p3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_0
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    const p2, 0x7f010011

    const p3, 0x7f01000f

    invoke-virtual {p1, p2, p3}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method
