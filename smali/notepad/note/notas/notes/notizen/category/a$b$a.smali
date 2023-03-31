.class Lnotepad/note/notas/notes/notizen/category/a$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/category/a$b;-><init>(Lnotepad/note/notas/notes/notizen/category/a;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lnotepad/note/notas/notes/notizen/category/a$b;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/category/a$b;Lnotepad/note/notas/notes/notizen/category/a;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b$a;->b:Lnotepad/note/notas/notes/notizen/category/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b$a;->b:Lnotepad/note/notas/notes/notizen/category/a$b;

    iget-object p1, p1, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/a;->a(Lnotepad/note/notas/notes/notizen/category/a;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b$a;->b:Lnotepad/note/notas/notes/notizen/category/a$b;

    iget-object p1, p1, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/a;->b(Lnotepad/note/notas/notes/notizen/category/a;)Lnotepad/note/notas/notes/notizen/category/a$a;

    move-result-object p1

    invoke-interface {p1}, Lnotepad/note/notas/notes/notizen/category/a$a;->a()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
