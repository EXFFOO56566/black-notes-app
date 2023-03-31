.class Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Z)V
    .locals 0

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;

    invoke-static {p2}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->d(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)Lnotepad/note/notas/notes/notizen/util/a;

    move-result-object p2

    invoke-virtual {p2}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    const-string p3, "noteId"

    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;

    const/4 p3, -0x1

    invoke-virtual {p1, p3, p2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$b;->a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->e(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)V

    return-void
.end method
