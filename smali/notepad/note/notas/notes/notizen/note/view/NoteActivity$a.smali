.class Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$a;
.super Lcom/google/android/gms/ads/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$a;->a:Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;

    invoke-direct {p0}, Lcom/google/android/gms/ads/b;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity$a;->a:Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;->a(Lnotepad/note/notas/notes/notizen/note/view/NoteActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-super {p0}, Lcom/google/android/gms/ads/b;->d()V

    return-void
.end method
