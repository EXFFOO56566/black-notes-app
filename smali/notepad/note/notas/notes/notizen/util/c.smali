.class public Lnotepad/note/notas/notes/notizen/util/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroidx/appcompat/app/c;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->l()Landroidx/appcompat/app/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->l()Landroidx/appcompat/app/a;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/appcompat/app/a;->i()V

    :cond_0
    return-void
.end method

.method public static a(Landroidx/appcompat/app/c;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/high16 v0, -0x80000000

    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    return-void
.end method
