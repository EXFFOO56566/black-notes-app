.class Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/main/dailyCheck/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->b(Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;)V

    return-void
.end method

.method public a(I)V
    .locals 3

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;->c(Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;)Lnotepad/note/notas/notes/notizen/util/a;

    move-result-object v0

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;

    const-class v2, Lnotepad/note/notas/notes/notizen/main/dailyCheck/EditDailyCheckboxActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "checkboxId"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity$b;->a:Lnotepad/note/notas/notes/notizen/main/dailyCheck/DailyCheckActivity;

    const v0, 0x7f01000d

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method
