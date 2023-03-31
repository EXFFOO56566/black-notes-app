.class public final Lcom/google/android/material/datepicker/g;
.super Lcom/google/android/material/datepicker/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/datepicker/g$l;,
        Lcom/google/android/material/datepicker/g$k;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/material/datepicker/m<",
        "TS;>;"
    }
.end annotation


# static fields
.field static final j0:Ljava/lang/Object;

.field static final k0:Ljava/lang/Object;

.field static final l0:Ljava/lang/Object;

.field static final m0:Ljava/lang/Object;


# instance fields
.field private Z:I

.field private a0:Lcom/google/android/material/datepicker/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/datepicker/d<",
            "TS;>;"
        }
    .end annotation
.end field

.field private b0:Lcom/google/android/material/datepicker/a;

.field private c0:Lcom/google/android/material/datepicker/i;

.field private d0:Lcom/google/android/material/datepicker/g$k;

.field private e0:Lcom/google/android/material/datepicker/c;

.field private f0:Landroidx/recyclerview/widget/RecyclerView;

.field private g0:Landroidx/recyclerview/widget/RecyclerView;

.field private h0:Landroid/view/View;

.field private i0:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "MONTHS_VIEW_GROUP_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/g;->j0:Ljava/lang/Object;

    const-string v0, "NAVIGATION_PREV_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/g;->k0:Ljava/lang/Object;

    const-string v0, "NAVIGATION_NEXT_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/g;->l0:Ljava/lang/Object;

    const-string v0, "SELECTOR_TOGGLE_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/g;->m0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/datepicker/m;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/material/datepicker/g;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method static synthetic a(Lcom/google/android/material/datepicker/g;Lcom/google/android/material/datepicker/i;)Lcom/google/android/material/datepicker/i;
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/g;->c0:Lcom/google/android/material/datepicker/i;

    return-object p1
.end method

.method private a(Landroid/view/View;Lcom/google/android/material/datepicker/k;)V
    .locals 4

    sget v0, Lb/c/b/b/f;->month_navigation_fragment_toggle:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    sget-object v1, Lcom/google/android/material/datepicker/g;->m0:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    new-instance v1, Lcom/google/android/material/datepicker/g$f;

    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/g$f;-><init>(Lcom/google/android/material/datepicker/g;)V

    invoke-static {v0, v1}, La/g/l/u;->a(Landroid/view/View;La/g/l/a;)V

    sget v1, Lb/c/b/b/f;->month_navigation_previous:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    sget-object v2, Lcom/google/android/material/datepicker/g;->k0:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    sget v2, Lb/c/b/b/f;->month_navigation_next:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/button/MaterialButton;

    sget-object v3, Lcom/google/android/material/datepicker/g;->l0:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    sget v3, Lb/c/b/b/f;->mtrl_calendar_year_selector_frame:I

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/material/datepicker/g;->h0:Landroid/view/View;

    sget v3, Lb/c/b/b/f;->mtrl_calendar_day_selector_frame:I

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/datepicker/g;->i0:Landroid/view/View;

    sget-object p1, Lcom/google/android/material/datepicker/g$k;->b:Lcom/google/android/material/datepicker/g$k;

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/g;->a(Lcom/google/android/material/datepicker/g$k;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->c0:Lcom/google/android/material/datepicker/i;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/i;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Lcom/google/android/material/datepicker/g$g;

    invoke-direct {v3, p0, p2, v0}, Lcom/google/android/material/datepicker/g$g;-><init>(Lcom/google/android/material/datepicker/g;Lcom/google/android/material/datepicker/k;Lcom/google/android/material/button/MaterialButton;)V

    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$t;)V

    new-instance p1, Lcom/google/android/material/datepicker/g$h;

    invoke-direct {p1, p0}, Lcom/google/android/material/datepicker/g$h;-><init>(Lcom/google/android/material/datepicker/g;)V

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lcom/google/android/material/datepicker/g$i;

    invoke-direct {p1, p0, p2}, Lcom/google/android/material/datepicker/g$i;-><init>(Lcom/google/android/material/datepicker/g;Lcom/google/android/material/datepicker/k;)V

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lcom/google/android/material/datepicker/g$j;

    invoke-direct {p1, p0, p2}, Lcom/google/android/material/datepicker/g$j;-><init>(Lcom/google/android/material/datepicker/g;Lcom/google/android/material/datepicker/k;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static b(Landroid/content/Context;)I
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lb/c/b/b/d;->mtrl_calendar_day_height:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/google/android/material/datepicker/g;)Lcom/google/android/material/datepicker/a;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->b0:Lcom/google/android/material/datepicker/a;

    return-object p0
.end method

.method static synthetic c(Lcom/google/android/material/datepicker/g;)Lcom/google/android/material/datepicker/d;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->a0:Lcom/google/android/material/datepicker/d;

    return-object p0
.end method

.method static synthetic d(Lcom/google/android/material/datepicker/g;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->f0:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private d(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/google/android/material/datepicker/g$a;

    invoke-direct {v1, p0, p1}, Lcom/google/android/material/datepicker/g$a;-><init>(Lcom/google/android/material/datepicker/g;I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic e(Lcom/google/android/material/datepicker/g;)Lcom/google/android/material/datepicker/c;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->e0:Lcom/google/android/material/datepicker/c;

    return-object p0
.end method

.method static synthetic f(Lcom/google/android/material/datepicker/g;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->i0:Landroid/view/View;

    return-object p0
.end method

.method private p0()Landroidx/recyclerview/widget/RecyclerView$n;
    .locals 1

    new-instance v0, Lcom/google/android/material/datepicker/g$e;

    invoke-direct {v0, p0}, Lcom/google/android/material/datepicker/g$e;-><init>(Lcom/google/android/material/datepicker/g;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    new-instance p3, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lcom/google/android/material/datepicker/g;->Z:I

    invoke-direct {p3, v0, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    new-instance v0, Lcom/google/android/material/datepicker/c;

    invoke-direct {v0, p3}, Lcom/google/android/material/datepicker/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/datepicker/g;->e0:Lcom/google/android/material/datepicker/c;

    invoke-virtual {p1, p3}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->b0:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->g()Lcom/google/android/material/datepicker/i;

    move-result-object v0

    invoke-static {p3}, Lcom/google/android/material/datepicker/h;->b(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    sget v1, Lb/c/b/b/h;->mtrl_calendar_vertical:I

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    sget v1, Lb/c/b/b/h;->mtrl_calendar_horizontal:I

    const/4 v9, 0x0

    :goto_0
    invoke-virtual {p1, v1, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget p2, Lb/c/b/b/f;->mtrl_calendar_days_of_week:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/GridView;

    new-instance v1, Lcom/google/android/material/datepicker/g$b;

    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/g$b;-><init>(Lcom/google/android/material/datepicker/g;)V

    invoke-static {p2, v1}, La/g/l/u;->a(Landroid/view/View;La/g/l/a;)V

    new-instance v1, Lcom/google/android/material/datepicker/f;

    invoke-direct {v1}, Lcom/google/android/material/datepicker/f;-><init>()V

    invoke-virtual {p2, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget v0, v0, Lcom/google/android/material/datepicker/i;->f:I

    invoke-virtual {p2, v0}, Landroid/widget/GridView;->setNumColumns(I)V

    invoke-virtual {p2, v3}, Landroid/widget/GridView;->setEnabled(Z)V

    sget p2, Lb/c/b/b/f;->mtrl_calendar_months:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Lcom/google/android/material/datepicker/g$c;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;

    move-result-object v6

    const/4 v8, 0x0

    move-object v4, p2

    move-object v5, p0

    move v7, v9

    invoke-direct/range {v4 .. v9}, Lcom/google/android/material/datepicker/g$c;-><init>(Lcom/google/android/material/datepicker/g;Landroid/content/Context;IZI)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object p2, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v0, Lcom/google/android/material/datepicker/g;->j0:Ljava/lang/Object;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    new-instance p2, Lcom/google/android/material/datepicker/k;

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->a0:Lcom/google/android/material/datepicker/d;

    iget-object v1, p0, Lcom/google/android/material/datepicker/g;->b0:Lcom/google/android/material/datepicker/a;

    new-instance v4, Lcom/google/android/material/datepicker/g$d;

    invoke-direct {v4, p0}, Lcom/google/android/material/datepicker/g$d;-><init>(Lcom/google/android/material/datepicker/g;)V

    invoke-direct {p2, p3, v0, v1, v4}, Lcom/google/android/material/datepicker/k;-><init>(Landroid/content/Context;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/g$l;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    invoke-virtual {p3}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lb/c/b/b/g;->mtrl_calendar_year_selector_span:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    sget v1, Lb/c/b/b/f;->mtrl_calendar_year_selector_frame:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v1, p0, Lcom/google/android/material/datepicker/g;->f0:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/g;->f0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v4, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-direct {v4, p3, v0, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->f0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/google/android/material/datepicker/p;

    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/p;-><init>(Lcom/google/android/material/datepicker/g;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->f0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/google/android/material/datepicker/g;->p0()Landroidx/recyclerview/widget/RecyclerView$n;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$n;)V

    :cond_1
    sget v0, Lb/c/b/b/f;->month_navigation_fragment_toggle:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/datepicker/g;->a(Landroid/view/View;Lcom/google/android/material/datepicker/k;)V

    :cond_2
    invoke-static {p3}, Lcom/google/android/material/datepicker/h;->b(Landroid/content/Context;)Z

    move-result p3

    if-nez p3, :cond_3

    new-instance p3, Landroidx/recyclerview/widget/k;

    invoke-direct {p3}, Landroidx/recyclerview/widget/k;-><init>()V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/q;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_3
    iget-object p3, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->c0:Lcom/google/android/material/datepicker/i;

    invoke-virtual {p2, v0}, Lcom/google/android/material/datepicker/k;->a(Lcom/google/android/material/datepicker/i;)I

    move-result p2

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    return-object p1
.end method

.method a(Lcom/google/android/material/datepicker/g$k;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/material/datepicker/g;->d0:Lcom/google/android/material/datepicker/g$k;

    sget-object v0, Lcom/google/android/material/datepicker/g$k;->c:Lcom/google/android/material/datepicker/g$k;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->f0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->f0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/p;

    iget-object v3, p0, Lcom/google/android/material/datepicker/g;->c0:Lcom/google/android/material/datepicker/i;

    iget v3, v3, Lcom/google/android/material/datepicker/i;->e:I

    invoke-virtual {v0, v3}, Lcom/google/android/material/datepicker/p;->e(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->i(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->h0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->i0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/material/datepicker/g$k;->b:Lcom/google/android/material/datepicker/g$k;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->h0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->i0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->c0:Lcom/google/android/material/datepicker/i;

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/g;->a(Lcom/google/android/material/datepicker/i;)V

    :cond_1
    :goto_0
    return-void
.end method

.method a(Lcom/google/android/material/datepicker/i;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/k;

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/k;->a(Lcom/google/android/material/datepicker/i;)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/datepicker/g;->c0:Lcom/google/android/material/datepicker/i;

    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/k;->a(Lcom/google/android/material/datepicker/i;)I

    move-result v0

    sub-int v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    if-le v2, v5, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    iput-object p1, p0, Lcom/google/android/material/datepicker/g;->c0:Lcom/google/android/material/datepicker/i;

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v0, v1, -0x3

    goto :goto_2

    :cond_2
    if-eqz v2, :cond_3

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v0, v1, 0x3

    :goto_2
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_3
    invoke-direct {p0, v1}, Lcom/google/android/material/datepicker/g;->d(I)V

    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->c(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->k()Landroid/os/Bundle;

    move-result-object p1

    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/datepicker/g;->Z:I

    const-string v0, "GRID_SELECTOR_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/d;

    iput-object v0, p0, Lcom/google/android/material/datepicker/g;->a0:Lcom/google/android/material/datepicker/d;

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/a;

    iput-object v0, p0, Lcom/google/android/material/datepicker/g;->b0:Lcom/google/android/material/datepicker/a;

    const-string v0, "CURRENT_MONTH_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/datepicker/i;

    iput-object p1, p0, Lcom/google/android/material/datepicker/g;->c0:Lcom/google/android/material/datepicker/i;

    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->e(Landroid/os/Bundle;)V

    iget v0, p0, Lcom/google/android/material/datepicker/g;->Z:I

    const-string v1, "THEME_RES_ID_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->a0:Lcom/google/android/material/datepicker/d;

    const-string v1, "GRID_SELECTOR_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->b0:Lcom/google/android/material/datepicker/a;

    const-string v1, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->c0:Lcom/google/android/material/datepicker/i;

    const-string v1, "CURRENT_MONTH_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method j0()Lcom/google/android/material/datepicker/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->b0:Lcom/google/android/material/datepicker/a;

    return-object v0
.end method

.method k0()Lcom/google/android/material/datepicker/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->e0:Lcom/google/android/material/datepicker/c;

    return-object v0
.end method

.method l0()Lcom/google/android/material/datepicker/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->c0:Lcom/google/android/material/datepicker/i;

    return-object v0
.end method

.method public m0()Lcom/google/android/material/datepicker/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/material/datepicker/d<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->a0:Lcom/google/android/material/datepicker/d;

    return-object v0
.end method

.method n0()Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->g0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    return-object v0
.end method

.method o0()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->d0:Lcom/google/android/material/datepicker/g$k;

    sget-object v1, Lcom/google/android/material/datepicker/g$k;->c:Lcom/google/android/material/datepicker/g$k;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/google/android/material/datepicker/g$k;->b:Lcom/google/android/material/datepicker/g$k;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/google/android/material/datepicker/g;->a(Lcom/google/android/material/datepicker/g$k;)V

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/google/android/material/datepicker/g$k;->b:Lcom/google/android/material/datepicker/g$k;

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/google/android/material/datepicker/g$k;->c:Lcom/google/android/material/datepicker/g$k;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
