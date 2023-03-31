.class public Landroidx/appcompat/app/k;
.super Landroidx/appcompat/app/a;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/ActionBarOverlayLayout$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/k$d;
    }
.end annotation


# static fields
.field private static final D:Landroid/view/animation/Interpolator;

.field private static final E:Landroid/view/animation/Interpolator;


# instance fields
.field final A:La/g/l/z;

.field final B:La/g/l/z;

.field final C:La/g/l/b0;

.field a:Landroid/content/Context;

.field private b:Landroid/content/Context;

.field private c:Landroid/app/Activity;

.field private d:Landroid/app/Dialog;

.field e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field f:Landroidx/appcompat/widget/ActionBarContainer;

.field g:Landroidx/appcompat/widget/d0;

.field h:Landroidx/appcompat/widget/ActionBarContextView;

.field i:Landroid/view/View;

.field j:Landroidx/appcompat/widget/p0;

.field private k:Z

.field l:Landroidx/appcompat/app/k$d;

.field m:La/a/n/b;

.field n:La/a/n/b$a;

.field private o:Z

.field private p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/appcompat/app/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private q:Z

.field private r:I

.field s:Z

.field t:Z

.field u:Z

.field private v:Z

.field private w:Z

.field x:La/a/n/h;

.field private y:Z

.field z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/appcompat/app/k;->D:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/appcompat/app/k;->E:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/k;->p:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/app/k;->r:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->s:Z

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->w:Z

    new-instance v0, Landroidx/appcompat/app/k$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/k$a;-><init>(Landroidx/appcompat/app/k;)V

    iput-object v0, p0, Landroidx/appcompat/app/k;->A:La/g/l/z;

    new-instance v0, Landroidx/appcompat/app/k$b;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/k$b;-><init>(Landroidx/appcompat/app/k;)V

    iput-object v0, p0, Landroidx/appcompat/app/k;->B:La/g/l/z;

    new-instance v0, Landroidx/appcompat/app/k$c;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/k$c;-><init>(Landroidx/appcompat/app/k;)V

    iput-object v0, p0, Landroidx/appcompat/app/k;->C:La/g/l/b0;

    iput-object p1, p0, Landroidx/appcompat/app/k;->c:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/appcompat/app/k;->b(Landroid/view/View;)V

    if-nez p2, :cond_0

    const p2, 0x1020002

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/app/k;->i:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/k;->p:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/app/k;->r:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->s:Z

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->w:Z

    new-instance v0, Landroidx/appcompat/app/k$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/k$a;-><init>(Landroidx/appcompat/app/k;)V

    iput-object v0, p0, Landroidx/appcompat/app/k;->A:La/g/l/z;

    new-instance v0, Landroidx/appcompat/app/k$b;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/k$b;-><init>(Landroidx/appcompat/app/k;)V

    iput-object v0, p0, Landroidx/appcompat/app/k;->B:La/g/l/z;

    new-instance v0, Landroidx/appcompat/app/k$c;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/k$c;-><init>(Landroidx/appcompat/app/k;)V

    iput-object v0, p0, Landroidx/appcompat/app/k;->C:La/g/l/b0;

    iput-object p1, p0, Landroidx/appcompat/app/k;->d:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/appcompat/app/k;->b(Landroid/view/View;)V

    return-void
.end method

.method private a(Landroid/view/View;)Landroidx/appcompat/widget/d0;
    .locals 3

    instance-of v0, p1, Landroidx/appcompat/widget/d0;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/appcompat/widget/d0;

    return-object p1

    :cond_0
    instance-of v0, p1, Landroidx/appcompat/widget/Toolbar;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Landroidx/appcompat/widget/d0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t make a decor toolbar out of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    const-string p1, "null"

    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static a(ZZZ)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    if-nez p0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private b(Landroid/view/View;)V
    .locals 5

    sget v0, La/a/f;->decor_content_parent:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iput-object v0, p0, Landroidx/appcompat/app/k;->e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Landroidx/appcompat/widget/ActionBarOverlayLayout$d;)V

    :cond_0
    sget v0, La/a/f;->action_bar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/appcompat/app/k;->a(Landroid/view/View;)Landroidx/appcompat/widget/d0;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    sget v0, La/a/f;->action_context_bar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v0, p0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    sget v0, La/a/f;->action_bar_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActionBarContainer;

    iput-object p1, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    iget-object v0, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    if-eqz v0, :cond_7

    iget-object v1, p0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v1, :cond_7

    if-eqz p1, :cond_7

    invoke-interface {v0}, Landroidx/appcompat/widget/d0;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/app/k;->a:Landroid/content/Context;

    iget-object p1, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {p1}, Landroidx/appcompat/widget/d0;->j()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->k:Z

    :cond_2
    iget-object v2, p0, Landroidx/appcompat/app/k;->a:Landroid/content/Context;

    invoke-static {v2}, La/a/n/a;->a(Landroid/content/Context;)La/a/n/a;

    move-result-object v2

    invoke-virtual {v2}, La/a/n/a;->a()Z

    move-result v3

    if-nez v3, :cond_4

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p1, 0x1

    :goto_2
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/k;->j(Z)V

    invoke-virtual {v2}, La/a/n/a;->f()Z

    move-result p1

    invoke-direct {p0, p1}, Landroidx/appcompat/app/k;->k(Z)V

    iget-object p1, p0, Landroidx/appcompat/app/k;->a:Landroid/content/Context;

    const/4 v2, 0x0

    sget-object v3, La/a/j;->ActionBar:[I

    sget v4, La/a/a;->actionBarStyle:I

    invoke-virtual {p1, v2, v3, v4, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v2, La/a/j;->ActionBar_hideOnContentScroll:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/k;->i(Z)V

    :cond_5
    sget v0, La/a/j;->ActionBar_elevation:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    if-eqz v0, :cond_6

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/k;->a(F)V

    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Landroidx/appcompat/app/k;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " can only be used with a compatible window decor layout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private k(Z)V
    .locals 4

    iput-boolean p1, p0, Landroidx/appcompat/app/k;->q:Z

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {p1, v0}, Landroidx/appcompat/widget/d0;->a(Landroidx/appcompat/widget/p0;)V

    iget-object p1, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    iget-object v0, p0, Landroidx/appcompat/app/k;->j:Landroidx/appcompat/widget/p0;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Landroidx/appcompat/widget/p0;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Landroidx/appcompat/widget/p0;)V

    iget-object p1, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    iget-object v0, p0, Landroidx/appcompat/app/k;->j:Landroidx/appcompat/widget/p0;

    invoke-interface {p1, v0}, Landroidx/appcompat/widget/d0;->a(Landroidx/appcompat/widget/p0;)V

    :goto_0
    invoke-virtual {p0}, Landroidx/appcompat/app/k;->n()I

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iget-object v0, p0, Landroidx/appcompat/app/k;->j:Landroidx/appcompat/widget/p0;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {v0, v2}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    iget-object v0, p0, Landroidx/appcompat/app/k;->e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_3

    invoke-static {v0}, La/g/l/u;->H(Landroid/view/View;)V

    goto :goto_2

    :cond_2
    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    :cond_3
    :goto_2
    iget-object v0, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    iget-boolean v3, p0, Landroidx/appcompat/app/k;->q:Z

    if-nez v3, :cond_4

    if-eqz p1, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    invoke-interface {v0, v3}, Landroidx/appcompat/widget/d0;->b(Z)V

    iget-object v0, p0, Landroidx/appcompat/app/k;->e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v3, p0, Landroidx/appcompat/app/k;->q:Z

    if-nez v3, :cond_5

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    return-void
.end method

.method private l(Z)V
    .locals 3

    iget-boolean v0, p0, Landroidx/appcompat/app/k;->t:Z

    iget-boolean v1, p0, Landroidx/appcompat/app/k;->u:Z

    iget-boolean v2, p0, Landroidx/appcompat/app/k;->v:Z

    invoke-static {v0, v1, v2}, Landroidx/appcompat/app/k;->a(ZZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/appcompat/app/k;->w:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->w:Z

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/k;->g(Z)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Landroidx/appcompat/app/k;->w:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->w:Z

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/k;->f(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method private o()V
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/app/k;->v:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->v:Z

    iget-object v1, p0, Landroidx/appcompat/app/k;->e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_0
    invoke-direct {p0, v0}, Landroidx/appcompat/app/k;->l(Z)V

    :cond_1
    return-void
.end method

.method private p()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v0}, La/g/l/u;->C(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method private q()V
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/app/k;->v:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->v:Z

    iget-object v1, p0, Landroidx/appcompat/app/k;->e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/appcompat/app/k;->l(Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a(La/a/n/b$a;)La/a/n/b;
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/k;->l:Landroidx/appcompat/app/k$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/app/k$d;->a()V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/k;->e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v0, p0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->c()V

    new-instance v0, Landroidx/appcompat/app/k$d;

    iget-object v1, p0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Landroidx/appcompat/app/k$d;-><init>(Landroidx/appcompat/app/k;Landroid/content/Context;La/a/n/b$a;)V

    invoke-virtual {v0}, Landroidx/appcompat/app/k$d;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object v0, p0, Landroidx/appcompat/app/k;->l:Landroidx/appcompat/app/k$d;

    invoke-virtual {v0}, Landroidx/appcompat/app/k$d;->i()V

    iget-object p1, p0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->a(La/a/n/b;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/k;->e(Z)V

    iget-object p1, p0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v1, 0x20

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public a()V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/k;->u:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->u:Z

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/appcompat/app/k;->l(Z)V

    :cond_0
    return-void
.end method

.method public a(F)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v0, p1}, La/g/l/u;->a(Landroid/view/View;F)V

    return-void
.end method

.method public a(II)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {v0}, Landroidx/appcompat/widget/d0;->j()I

    move-result v0

    and-int/lit8 v1, p2, 0x4

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/appcompat/app/k;->k:Z

    :cond_0
    iget-object v1, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    and-int/2addr p1, p2

    not-int p2, p2

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    invoke-interface {v1, p1}, Landroidx/appcompat/widget/d0;->b(I)V

    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p1, p0, Landroidx/appcompat/app/k;->a:Landroid/content/Context;

    invoke-static {p1}, La/a/n/a;->a(Landroid/content/Context;)La/a/n/a;

    move-result-object p1

    invoke-virtual {p1}, La/a/n/a;->f()Z

    move-result p1

    invoke-direct {p0, p1}, Landroidx/appcompat/app/k;->k(Z)V

    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/d0;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/app/k;->s:Z

    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)Z
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/app/k;->l:Landroidx/appcompat/app/k$d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/app/k$d;->c()Landroid/view/Menu;

    move-result-object v0

    if-eqz v0, :cond_3

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_0
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k;->x:La/a/n/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La/a/n/h;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/app/k;->x:La/a/n/h;

    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 3

    iget-boolean v0, p0, Landroidx/appcompat/app/k;->o:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/appcompat/app/k;->o:Z

    iget-object v0, p0, Landroidx/appcompat/app/k;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Landroidx/appcompat/app/k;->p:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/a$b;

    invoke-interface {v2, p1}, Landroidx/appcompat/app/a$b;->a(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public c(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/k;->k:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/k;->h(Z)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/k;->u:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->u:Z

    invoke-direct {p0, v0}, Landroidx/appcompat/app/k;->l(Z)V

    :cond_0
    return-void
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/app/k;->y:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/app/k;->x:La/a/n/h;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La/a/n/h;->a()V

    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 8

    if-eqz p1, :cond_0

    invoke-direct {p0}, Landroidx/appcompat/app/k;->q()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Landroidx/appcompat/app/k;->o()V

    :goto_0
    invoke-direct {p0}, Landroidx/appcompat/app/k;->p()Z

    move-result v0

    const/4 v1, 0x4

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    const-wide/16 v4, 0x64

    const-wide/16 v6, 0xc8

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {p1, v1, v4, v5}, Landroidx/appcompat/widget/d0;->a(IJ)La/g/l/y;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3, v6, v7}, Landroidx/appcompat/widget/ActionBarContextView;->a(IJ)La/g/l/y;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget-object p1, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {p1, v3, v6, v7}, Landroidx/appcompat/widget/d0;->a(IJ)La/g/l/y;

    move-result-object v0

    iget-object p1, p0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2, v4, v5}, Landroidx/appcompat/widget/ActionBarContextView;->a(IJ)La/g/l/y;

    move-result-object p1

    :goto_1
    new-instance v1, La/a/n/h;

    invoke-direct {v1}, La/a/n/h;-><init>()V

    invoke-virtual {v1, p1, v0}, La/a/n/h;->a(La/g/l/y;La/g/l/y;)La/a/n/h;

    invoke-virtual {v1}, La/a/n/h;->c()V

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {p1, v1}, Landroidx/appcompat/widget/d0;->a(I)V

    iget-object p1, p0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    goto :goto_2

    :cond_3
    iget-object p1, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {p1, v3}, Landroidx/appcompat/widget/d0;->a(I)V

    iget-object p1, p0, Landroidx/appcompat/app/k;->h:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method public f(Z)V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/app/k;->x:La/a/n/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La/a/n/h;->a()V

    :cond_0
    iget v0, p0, Landroidx/appcompat/app/k;->r:I

    if-nez v0, :cond_4

    iget-boolean v0, p0, Landroidx/appcompat/app/k;->y:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_4

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setAlpha(F)V

    iget-object v0, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    new-instance v0, La/a/n/h;

    invoke-direct {v0}, La/a/n/h;-><init>()V

    iget-object v2, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    new-array p1, p1, [I

    fill-array-data p1, :array_0

    iget-object v3, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v3, p1}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V

    aget p1, p1, v1

    int-to-float p1, p1

    sub-float/2addr v2, p1

    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {p1}, La/g/l/u;->a(Landroid/view/View;)La/g/l/y;

    move-result-object p1

    invoke-virtual {p1, v2}, La/g/l/y;->b(F)La/g/l/y;

    iget-object v1, p0, Landroidx/appcompat/app/k;->C:La/g/l/b0;

    invoke-virtual {p1, v1}, La/g/l/y;->a(La/g/l/b0;)La/g/l/y;

    invoke-virtual {v0, p1}, La/a/n/h;->a(La/g/l/y;)La/a/n/h;

    iget-boolean p1, p0, Landroidx/appcompat/app/k;->s:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/appcompat/app/k;->i:Landroid/view/View;

    if-eqz p1, :cond_3

    invoke-static {p1}, La/g/l/u;->a(Landroid/view/View;)La/g/l/y;

    move-result-object p1

    invoke-virtual {p1, v2}, La/g/l/y;->b(F)La/g/l/y;

    invoke-virtual {v0, p1}, La/a/n/h;->a(La/g/l/y;)La/a/n/h;

    :cond_3
    sget-object p1, Landroidx/appcompat/app/k;->D:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, p1}, La/a/n/h;->a(Landroid/view/animation/Interpolator;)La/a/n/h;

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, La/a/n/h;->a(J)La/a/n/h;

    iget-object p1, p0, Landroidx/appcompat/app/k;->A:La/g/l/z;

    invoke-virtual {v0, p1}, La/a/n/h;->a(La/g/l/z;)La/a/n/h;

    iput-object v0, p0, Landroidx/appcompat/app/k;->x:La/a/n/h;

    invoke-virtual {v0}, La/a/n/h;->c()V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Landroidx/appcompat/app/k;->A:La/g/l/z;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, La/g/l/z;->b(Landroid/view/View;)V

    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/appcompat/widget/d0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {v0}, Landroidx/appcompat/widget/d0;->collapseActionView()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {v0}, Landroidx/appcompat/widget/d0;->j()I

    move-result v0

    return v0
.end method

.method public g(Z)V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/app/k;->x:La/a/n/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La/a/n/h;->a()V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget v0, p0, Landroidx/appcompat/app/k;->r:I

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Landroidx/appcompat/app/k;->y:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_4

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    iget-object v0, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    new-array p1, p1, [I

    fill-array-data p1, :array_0

    iget-object v2, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v2, p1}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V

    const/4 v2, 0x1

    aget p1, p1, v2

    int-to-float p1, p1

    sub-float/2addr v0, p1

    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    new-instance p1, La/a/n/h;

    invoke-direct {p1}, La/a/n/h;-><init>()V

    iget-object v2, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v2}, La/g/l/u;->a(Landroid/view/View;)La/g/l/y;

    move-result-object v2

    invoke-virtual {v2, v1}, La/g/l/y;->b(F)La/g/l/y;

    iget-object v3, p0, Landroidx/appcompat/app/k;->C:La/g/l/b0;

    invoke-virtual {v2, v3}, La/g/l/y;->a(La/g/l/b0;)La/g/l/y;

    invoke-virtual {p1, v2}, La/a/n/h;->a(La/g/l/y;)La/a/n/h;

    iget-boolean v2, p0, Landroidx/appcompat/app/k;->s:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroidx/appcompat/app/k;->i:Landroid/view/View;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, Landroidx/appcompat/app/k;->i:Landroid/view/View;

    invoke-static {v0}, La/g/l/u;->a(Landroid/view/View;)La/g/l/y;

    move-result-object v0

    invoke-virtual {v0, v1}, La/g/l/y;->b(F)La/g/l/y;

    invoke-virtual {p1, v0}, La/a/n/h;->a(La/g/l/y;)La/a/n/h;

    :cond_3
    sget-object v0, Landroidx/appcompat/app/k;->E:Landroid/view/animation/Interpolator;

    invoke-virtual {p1, v0}, La/a/n/h;->a(Landroid/view/animation/Interpolator;)La/a/n/h;

    const-wide/16 v0, 0xfa

    invoke-virtual {p1, v0, v1}, La/a/n/h;->a(J)La/a/n/h;

    iget-object v0, p0, Landroidx/appcompat/app/k;->B:La/g/l/z;

    invoke-virtual {p1, v0}, La/a/n/h;->a(La/g/l/z;)La/a/n/h;

    iput-object p1, p0, Landroidx/appcompat/app/k;->x:La/a/n/h;

    invoke-virtual {p1}, La/a/n/h;->c()V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setAlpha(F)V

    iget-object p1, p0, Landroidx/appcompat/app/k;->f:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    iget-boolean p1, p0, Landroidx/appcompat/app/k;->s:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Landroidx/appcompat/app/k;->i:Landroid/view/View;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    :cond_5
    iget-object p1, p0, Landroidx/appcompat/app/k;->B:La/g/l/z;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, La/g/l/z;->b(Landroid/view/View;)V

    :goto_0
    iget-object p1, p0, Landroidx/appcompat/app/k;->e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_6

    invoke-static {p1}, La/g/l/u;->H(Landroid/view/View;)V

    :cond_6
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public h()Landroid/content/Context;
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/app/k;->b:Landroid/content/Context;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Landroidx/appcompat/app/k;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, La/a/a;->actionBarWidgetTheme:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget-object v2, p0, Landroidx/appcompat/app/k;->a:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Landroidx/appcompat/app/k;->b:Landroid/content/Context;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/k;->a:Landroid/content/Context;

    iput-object v0, p0, Landroidx/appcompat/app/k;->b:Landroid/content/Context;

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/app/k;->b:Landroid/content/Context;

    return-object v0
.end method

.method public h(Z)V
    .locals 1

    const/4 v0, 0x4

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/k;->a(II)V

    return-void
.end method

.method public i()V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/k;->t:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/k;->t:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/appcompat/app/k;->l(Z)V

    :cond_0
    return-void
.end method

.method public i(Z)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/appcompat/app/k;->e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-boolean p1, p0, Landroidx/appcompat/app/k;->z:Z

    iget-object v0, p0, Landroidx/appcompat/app/k;->e:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    return-void
.end method

.method public j(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/d0;->a(Z)V

    return-void
.end method

.method m()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/k;->n:La/a/n/b$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/appcompat/app/k;->m:La/a/n/b;

    invoke-interface {v0, v1}, La/a/n/b$a;->a(La/a/n/b;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/app/k;->m:La/a/n/b;

    iput-object v0, p0, Landroidx/appcompat/app/k;->n:La/a/n/b$a;

    :cond_0
    return-void
.end method

.method public n()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/k;->g:Landroidx/appcompat/widget/d0;

    invoke-interface {v0}, Landroidx/appcompat/widget/d0;->k()I

    move-result v0

    return v0
.end method

.method public onWindowVisibilityChanged(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/app/k;->r:I

    return-void
.end method
