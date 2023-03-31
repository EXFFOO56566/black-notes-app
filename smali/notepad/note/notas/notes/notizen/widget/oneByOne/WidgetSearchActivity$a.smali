.class Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->c(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;

    invoke-static {v1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->b(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)Lc/a/a/a/a/b/b/d;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc/a/a/a/a/b/b/d;->b(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->a(Ljava/util/ArrayList;Ljava/lang/String;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->c(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

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
