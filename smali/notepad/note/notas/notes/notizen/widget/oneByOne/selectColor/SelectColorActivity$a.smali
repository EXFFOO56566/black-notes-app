.class Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity$a;->a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "color"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity$a;->a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;

    const/4 v1, -0x1

    invoke-virtual {p1, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity$a;->a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/SelectColorActivity;)V

    return-void
.end method
