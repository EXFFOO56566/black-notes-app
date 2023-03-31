.class Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$c;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$c;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$c;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->b(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;)Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    move-result p1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$c;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;

    invoke-static {v0, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;I)V

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
