.class Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/category/selectCategory/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->a(Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;)Lnotepad/note/notas/notes/notizen/util/a;

    move-result-object v0

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "categoryId"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "categoryName"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;

    const/4 p2, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity$a;->a:Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;->b(Lnotepad/note/notas/notes/notizen/category/selectCategory/SelectCategoryActivity;)V

    return-void
.end method
