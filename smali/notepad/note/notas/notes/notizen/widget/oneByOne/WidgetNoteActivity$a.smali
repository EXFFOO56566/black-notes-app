.class Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$a;
.super Lcom/google/android/gms/ads/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$a;->a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;

    invoke-direct {p0}, Lcom/google/android/gms/ads/b;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity$a;->a:Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-super {p0}, Lcom/google/android/gms/ads/b;->d()V

    return-void
.end method
