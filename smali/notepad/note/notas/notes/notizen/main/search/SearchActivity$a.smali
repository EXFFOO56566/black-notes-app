.class Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->a(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->b(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lnotepad/note/notas/notes/notizen/main/search/b;

    move-result-object p1

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/main/search/b;->e()V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->b(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lnotepad/note/notas/notes/notizen/main/search/b;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->c(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Landroid/widget/LinearLayout;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->c(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->b(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lnotepad/note/notas/notes/notizen/main/search/b;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-static {v1}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->d(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lc/a/a/a/a/b/b/d;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc/a/a/a/a/b/b/d;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lnotepad/note/notas/notes/notizen/main/search/b;->a(Ljava/util/ArrayList;Ljava/lang/String;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->b(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lnotepad/note/notas/notes/notizen/main/search/b;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
