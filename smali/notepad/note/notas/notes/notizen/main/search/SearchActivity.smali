.class public Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Lnotepad/note/notas/notes/notizen/main/search/b;

.field private t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

.field private u:Lc/a/a/a/a/b/b/d;

.field private v:Lnotepad/note/notas/notes/notizen/util/a;

.field private w:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lnotepad/note/notas/notes/notizen/main/search/b;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->s:Lnotepad/note/notas/notes/notizen/main/search/b;

    return-object p0
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Landroid/widget/LinearLayout;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->w:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic d(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lc/a/a/a/a/b/b/d;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->u:Lc/a/a/a/a/b/b/d;

    return-object p0
.end method

.method static synthetic e(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)Lnotepad/note/notas/notes/notizen/util/a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    return-object p0
.end method

.method private o()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private p()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010010

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private q()V
    .locals 3

    const-string v0, "#181818"

    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    const v0, 0x7f0800ae

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const v0, 0x7f080079

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->w:Landroid/widget/LinearLayout;

    new-instance v0, Lnotepad/note/notas/notes/notizen/main/search/b;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/main/search/b;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->s:Lnotepad/note/notas/notes/notizen/main/search/b;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->u:Lc/a/a/a/a/b/b/d;

    const v0, 0x7f080130

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->s:Lnotepad/note/notas/notes/notizen/main/search/b;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method private r()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->o()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->s()V

    return-void
.end method

.method private s()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->s:Lnotepad/note/notas/notes/notizen/main/search/b;

    new-instance v1, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/main/search/b;->a(Lnotepad/note/notas/notes/notizen/main/search/b$a;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080060

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->p()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080079

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->p()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0036

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->q()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/main/search/SearchActivity;->r()V

    return-void
.end method
