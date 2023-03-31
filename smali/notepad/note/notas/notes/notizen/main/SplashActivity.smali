.class public Lnotepad/note/notas/notes/notizen/main/SplashActivity;
.super Landroidx/appcompat/app/c;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic o()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnotepad/note/notas/notes/notizen/main/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const/high16 v0, 0x10a0000

    const v1, 0x10a0001

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b003d

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    const-string p1, "#1C1C1C"

    invoke-static {p0, p1}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lnotepad/note/notas/notes/notizen/main/a;

    invoke-direct {v0, p0}, Lnotepad/note/notas/notes/notizen/main/a;-><init>(Lnotepad/note/notas/notes/notizen/main/SplashActivity;)V

    const-wide/16 v1, 0x15e

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected onPause()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/d;->onPause()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
