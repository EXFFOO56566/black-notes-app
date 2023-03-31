.class Lnotepad/note/notas/notes/notizen/category/a$b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


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

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b$b;->b:Lnotepad/note/notas/notes/notizen/category/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/category/a$b$b;->b:Lnotepad/note/notas/notes/notizen/category/a$b;

    iget-object p1, p1, Lnotepad/note/notas/notes/notizen/category/a$b;->z:Lnotepad/note/notas/notes/notizen/category/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/category/a;->c(Lnotepad/note/notas/notes/notizen/category/a;)Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;

    move-result-object p1

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/category/a$b$b;->b:Lnotepad/note/notas/notes/notizen/category/a$b;

    invoke-interface {p1, p2}, Lnotepad/note/notas/notes/notizen/util/recyclerView/a/e;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
