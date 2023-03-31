.class public Lnotepad/note/notas/notes/notizen/setting/OpenSourceLicenseActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Lnotepad/note/notas/notes/notizen/util/a;


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

    const v1, 0x7f010010

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private p()V
    .locals 2

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/setting/OpenSourceLicenseActivity;->s:Lnotepad/note/notas/notes/notizen/util/a;

    const v0, 0x7f080188

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "Copyright 2015-2017 AJ Alt\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n    http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License."

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080060

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/setting/OpenSourceLicenseActivity;->s:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {p1}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/setting/OpenSourceLicenseActivity;->o()V

    :cond_1
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/setting/OpenSourceLicenseActivity;->o()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0031

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/setting/OpenSourceLicenseActivity;->p()V

    return-void
.end method
