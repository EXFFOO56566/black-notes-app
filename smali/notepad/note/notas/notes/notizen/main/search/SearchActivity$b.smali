.class Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/main/search/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Z)V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->e(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lnotepad/note/notas/notes/notizen/util/a;

    move-result-object v0

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "noteId"

    const-string v1, ""

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p3, :cond_2

    if-eqz p2, :cond_1

    new-instance p2, Landroid/content/Intent;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    const-class v1, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;

    invoke-direct {p2, p3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    new-instance p2, Landroid/content/Intent;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    const-class v1, Lnotepad/note/notas/notes/notizen/note/password/ConfirmPasswordActivity;

    invoke-direct {p2, p3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_0
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->a(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "search"

    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_2

    :cond_2
    if-eqz p2, :cond_3

    new-instance p2, Landroid/content/Intent;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    const-class v1, Lnotepad/note/notas/notes/notizen/checklist/ChecklistActivity;

    invoke-direct {p2, p3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :cond_3
    new-instance p2, Landroid/content/Intent;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    const-class v1, Lnotepad/note/notas/notes/notizen/checklist/ConfirmPasswordChecklistActivity;

    invoke-direct {p2, p3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_1
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :goto_2
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    const p2, 0x7f010011

    const p3, 0x7f01000f

    invoke-virtual {p1, p2, p3}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method
