.class public final synthetic Lnotepad/note/notas/notes/notizen/note/view/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private final synthetic b:Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;


# direct methods
.method public synthetic constructor <init>(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/a;->b:Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/a;->b:Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;

    invoke-virtual {v0, p1, p2}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->a(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
