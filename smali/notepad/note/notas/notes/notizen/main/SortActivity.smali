.class public Lnotepad/note/notas/notes/notizen/main/SortActivity;
.super Landroidx/appcompat/app/c;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method private o()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f01000e

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private p()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "sort"

    const-string v2, "createdTime"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/SortActivity;->o()V

    return-void
.end method

.method private q()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "sort"

    const-string v2, "editedTime"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/SortActivity;->o()V

    return-void
.end method

.method private r()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "sort"

    const-string v2, "title"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/SortActivity;->o()V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/SortActivity;->o()V

    goto :goto_0

    :sswitch_1
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/SortActivity;->r()V

    goto :goto_0

    :sswitch_2
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/SortActivity;->q()V

    goto :goto_0

    :sswitch_3
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/SortActivity;->p()V

    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f080063 -> :sswitch_3
        0x7f08006c -> :sswitch_2
        0x7f080082 -> :sswitch_1
        0x7f0800f2 -> :sswitch_0
    .end sparse-switch
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/SortActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b003c

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    const-string p1, "#000000"

    invoke-static {p0, p1}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    const/4 p1, 0x0

    const-string v0, "SETTING"

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "EDITED_TIME"

    const-string v2, "sort"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, 0x34775e4

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v2, v3, :cond_2

    const v3, 0x4c22a38

    if-eq v2, v3, :cond_1

    const v3, 0x1e062123

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const-string v1, "TITLE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const-string v1, "CREATED_TIME"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x2

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_6

    if-eq v0, v5, :cond_5

    if-eq v0, v4, :cond_4

    goto :goto_3

    :cond_4
    const v0, 0x7f0800d9

    goto :goto_2

    :cond_5
    const v0, 0x7f0800da

    goto :goto_2

    :cond_6
    const v0, 0x7f0800db

    :goto_2
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    return-void
.end method
