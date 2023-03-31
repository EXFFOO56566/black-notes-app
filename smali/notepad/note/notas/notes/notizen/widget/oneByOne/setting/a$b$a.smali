.class Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    :try_start_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    iget-object p1, p1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;->w:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->b(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;)Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$a;

    move-result-object p1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    iget-object v0, v0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;->w:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/a/a/b/c/c;

    invoke-virtual {v0}, Lc/a/a/a/a/b/c/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$a;->a(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    iget-object v1, v1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;->w:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;

    invoke-static {v1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    iget-object v1, v1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;->w:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;

    invoke-static {v1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/a/a/b/c/c;

    invoke-virtual {v1, p1}, Lc/a/a/a/a/b/c/c;->a(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    iget-object p1, p1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;->w:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/a/b/c/c;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lc/a/a/a/a/b/c/c;->a(Z)V

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b$a;->b:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;

    iget-object p1, p1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$b;->w:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
