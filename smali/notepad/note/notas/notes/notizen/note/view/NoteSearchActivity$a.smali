.class Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    const/16 p1, 0x42

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity$a;->b:Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;->a(Lnotepad/note/notas/notes/notizen/note/view/NoteSearchActivity;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
