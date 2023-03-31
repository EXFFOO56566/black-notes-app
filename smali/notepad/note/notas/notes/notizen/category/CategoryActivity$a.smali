.class Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/category/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/category/CategoryActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/category/CategoryActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/CategoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/CategoryActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->c(Lnotepad/note/notas/notes/notizen/category/CategoryActivity;)Lnotepad/note/notas/notes/notizen/category/a;

    move-result-object v0

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/category/a;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/CategoryActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->a(Lnotepad/note/notas/notes/notizen/category/CategoryActivity;Z)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    const-string p3, "select"

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const-string v0, "categoryId"

    const/4 v1, 0x0

    if-eqz p3, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/CategoryActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->a(Lnotepad/note/notas/notes/notizen/category/CategoryActivity;)Lnotepad/note/notas/notes/notizen/util/a;

    move-result-object p1

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string p3, "isAllNotes"

    invoke-virtual {p1, p3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/CategoryActivity;

    const/4 p3, -0x1

    invoke-virtual {p2, p3, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/CategoryActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->b(Lnotepad/note/notas/notes/notizen/category/CategoryActivity;)V

    goto :goto_0

    :cond_1
    const-string p3, "editName"

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/CategoryActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/CategoryActivity;->a(Lnotepad/note/notas/notes/notizen/category/CategoryActivity;)Lnotepad/note/notas/notes/notizen/util/a;

    move-result-object p1

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Landroid/content/Intent;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/CategoryActivity;

    const-class v2, Lnotepad/note/notas/notes/notizen/category/EditCategoryActivity;

    invoke-direct {p1, p3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/CategoryActivity;

    const/4 p3, 0x1

    invoke-virtual {p2, p1, p3}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/CategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/CategoryActivity;

    const p2, 0x7f01000d

    invoke-virtual {p1, p2, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_3
    :goto_0
    return-void
.end method
