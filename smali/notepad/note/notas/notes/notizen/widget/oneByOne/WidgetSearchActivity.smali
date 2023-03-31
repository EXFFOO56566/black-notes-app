.class public Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

.field private t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

.field private u:Lc/a/a/a/a/b/b/d;

.field private v:Lnotepad/note/notas/notes/notizen/util/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    return-object p0
.end method

.method static synthetic b(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)Lc/a/a/a/a/b/b/d;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->u:Lc/a/a/a/a/b/b/d;

    return-object p0
.end method

.method static synthetic c(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->s:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    return-object p0
.end method

.method static synthetic d(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)Lnotepad/note/notas/notes/notizen/util/a;
    .locals 0

    iget-object p0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    return-object p0
.end method

.method static synthetic e(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->p()V

    return-void
.end method

.method private o()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)V

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

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->v:Lnotepad/note/notas/notes/notizen/util/a;

    const v0, 0x7f0800ae

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    new-instance v0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->s:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->u:Lc/a/a/a/a/b/b/d;

    const v0, 0x7f080130

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->s:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->s:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->u:Lc/a/a/a/a/b/b/d;

    const-string v2, ""

    invoke-virtual {v1, v2}, Lc/a/a/a/a/b/b/d;->b(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->a(Ljava/util/ArrayList;Ljava/lang/String;)V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->s:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->d()V

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->t:Lnotepad/note/notas/notes/notizen/ui/MyEditTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method private r()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->o()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->s()V

    return-void
.end method

.method private s()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->s:Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;

    new-instance v1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$b;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity$b;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/d;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/d$a;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080060

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->p()V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->p()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0036

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->q()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;->r()V

    return-void
.end method
