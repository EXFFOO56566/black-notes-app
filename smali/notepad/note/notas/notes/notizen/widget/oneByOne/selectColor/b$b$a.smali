.class Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    :try_start_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;

    iget-object p1, p1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->w:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;->b(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;)Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$a;

    move-result-object p1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;

    iget-object v0, v0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->w:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/c;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
