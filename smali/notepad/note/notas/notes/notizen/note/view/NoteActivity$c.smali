.class Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$c;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$c;->b:Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$c;->b:Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->c(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    move-result p1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$c;->b:Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;

    invoke-static {v0, p1}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->a(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;I)V

    const/4 p1, 0x1

    return p1
.end method

.method public onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
