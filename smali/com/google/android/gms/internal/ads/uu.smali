.class final Lcom/google/android/gms/internal/ads/uu;
.super Lcom/google/android/gms/internal/ads/av;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/webkit/DownloadListener;
.implements Lcom/google/android/gms/internal/ads/m7;
.implements Lcom/google/android/gms/internal/ads/ws;


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private A:Lcom/google/android/gms/internal/ads/k1;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private B:Lcom/google/android/gms/internal/ads/j1;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private C:Lcom/google/android/gms/internal/ads/pi2;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private D:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private E:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private F:Lcom/google/android/gms/internal/ads/m;

.field private G:Lcom/google/android/gms/internal/ads/m;

.field private H:Lcom/google/android/gms/internal/ads/m;

.field private I:Lcom/google/android/gms/internal/ads/p;

.field private J:Lcom/google/android/gms/ads/internal/overlay/c;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private K:Lcom/google/android/gms/internal/ads/pn;

.field private final L:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lb/c/b/a/d/a;",
            ">;"
        }
    .end annotation
.end field

.field private M:I

.field private N:I

.field private O:I

.field private P:I

.field private Q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/wr;",
            ">;"
        }
    .end annotation
.end field

.field private final R:Landroid/view/WindowManager;

.field private final e:Lcom/google/android/gms/internal/ads/nu;

.field private final f:Lcom/google/android/gms/internal/ads/pu;

.field private final g:Lcom/google/android/gms/internal/ads/eq1;

.field private final h:Lcom/google/android/gms/internal/ads/fo;

.field private final i:Lcom/google/android/gms/ads/internal/i;

.field private final j:Lcom/google/android/gms/ads/internal/a;

.field private final k:Landroid/util/DisplayMetrics;

.field private final l:Lcom/google/android/gms/internal/ads/wj2;

.field private final m:Lcom/google/android/gms/internal/ads/yi2;

.field private final n:Z

.field private o:Lcom/google/android/gms/ads/internal/overlay/c;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private p:Lcom/google/android/gms/internal/ads/lu;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private q:Ljava/lang/String;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private r:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private s:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private t:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private u:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private v:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private w:Ljava/lang/String;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private x:Lcom/google/android/gms/internal/ads/rt;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private y:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private z:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/ads/nu;Lcom/google/android/gms/internal/ads/pu;Lcom/google/android/gms/internal/ads/lu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/ads/internal/i;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/yi2;Z)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/av;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/yu;)V

    const/4 p6, 0x1

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ads/uu;->v:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->w:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->L:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/uu;->M:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/uu;->N:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/uu;->O:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/uu;->P:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->e:Lcom/google/android/gms/internal/ads/nu;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/uu;->q:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/uu;->s:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/uu;->u:I

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/uu;->g:Lcom/google/android/gms/internal/ads/eq1;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/uu;->h:Lcom/google/android/gms/internal/ads/fo;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/uu;->i:Lcom/google/android/gms/ads/internal/i;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/uu;->j:Lcom/google/android/gms/ads/internal/a;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "window"

    invoke-virtual {p2, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->R:Landroid/view/WindowManager;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->R:Landroid/view/WindowManager;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/view/WindowManager;)Landroid/util/DisplayMetrics;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/uu;->l:Lcom/google/android/gms/internal/ads/wj2;

    iput-object p13, p0, Lcom/google/android/gms/internal/ads/uu;->m:Lcom/google/android/gms/internal/ads/yi2;

    iput-boolean p14, p0, Lcom/google/android/gms/internal/ads/uu;->n:Z

    new-instance p2, Lcom/google/android/gms/internal/ads/pn;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/uu;->e:Lcom/google/android/gms/internal/ads/nu;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/nu;->b()Landroid/app/Activity;

    move-result-object p3

    const/4 p4, 0x0

    invoke-direct {p2, p3, p0, p0, p4}, Lcom/google/android/gms/internal/ads/pn;-><init>(Landroid/app/Activity;Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->K:Lcom/google/android/gms/internal/ads/pn;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object p2

    iget-object p3, p8, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p5

    invoke-virtual {p2, p1, p3, p5}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/content/Context;Ljava/lang/String;Landroid/webkit/WebSettings;)V

    invoke-virtual {p0, p0}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->T()V

    invoke-static {}, Lcom/google/android/gms/common/util/l;->d()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/st;->a(Lcom/google/android/gms/internal/ads/ws;)Lcom/google/android/gms/internal/ads/st;

    move-result-object p2

    const-string p3, "googleAdsJsInterface"

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/ads/av;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->X()V

    new-instance p2, Lcom/google/android/gms/internal/ads/p;

    new-instance p3, Lcom/google/android/gms/internal/ads/o;

    iget-object p5, p0, Lcom/google/android/gms/internal/ads/uu;->q:Ljava/lang/String;

    const-string p7, "make_wv"

    invoke-direct {p3, p6, p7, p5}, Lcom/google/android/gms/internal/ads/o;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/p;-><init>(Lcom/google/android/gms/internal/ads/o;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/p;->a()Lcom/google/android/gms/internal/ads/o;

    move-result-object p2

    invoke-virtual {p2, p9}, Lcom/google/android/gms/internal/ads/o;->a(Lcom/google/android/gms/internal/ads/o;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/p;->a()Lcom/google/android/gms/internal/ads/o;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/j;->a(Lcom/google/android/gms/internal/ads/o;)Lcom/google/android/gms/internal/ads/m;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->G:Lcom/google/android/gms/internal/ads/m;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    const-string p5, "native:view_create"

    invoke-virtual {p3, p5, p2}, Lcom/google/android/gms/internal/ads/p;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/m;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/uu;->H:Lcom/google/android/gms/internal/ads/m;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/uu;->F:Lcom/google/android/gms/internal/ads/m;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/ll;->b(Landroid/content/Context;)V

    return-void
.end method

.method private final R()Z
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pu;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pu;->j()Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/util/DisplayMetrics;I)I

    move-result v4

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/util/DisplayMetrics;I)I

    move-result v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->e:Lcom/google/android/gms/internal/ads/nu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nu;->b()Landroid/app/Activity;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gl;->c(Landroid/app/Activity;)[I

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    aget v6, v0, v1

    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/util/DisplayMetrics;I)I

    move-result v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    aget v0, v0, v2

    invoke-static {v6, v0}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/util/DisplayMetrics;I)I

    move-result v0

    move v7, v0

    move v6, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v6, v4

    move v7, v5

    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/uu;->N:I

    if-ne v0, v4, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/uu;->M:I

    if-ne v0, v5, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/uu;->O:I

    if-ne v0, v6, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/uu;->P:I

    if-ne v0, v7, :cond_3

    return v1

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/uu;->N:I

    if-ne v0, v4, :cond_4

    iget v0, p0, Lcom/google/android/gms/internal/ads/uu;->M:I

    if-eq v0, v5, :cond_5

    :cond_4
    const/4 v1, 0x1

    :cond_5
    iput v4, p0, Lcom/google/android/gms/internal/ads/uu;->N:I

    iput v5, p0, Lcom/google/android/gms/internal/ads/uu;->M:I

    iput v6, p0, Lcom/google/android/gms/internal/ads/uu;->O:I

    iput v7, p0, Lcom/google/android/gms/internal/ads/uu;->P:I

    new-instance v3, Lcom/google/android/gms/internal/ads/wd;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ads/wd;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v8, v0, Landroid/util/DisplayMetrics;->density:F

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->R:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v9

    invoke-virtual/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/wd;->a(IIIIFI)V

    return v1
.end method

.method private final S()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p;->a()Lcom/google/android/gms/internal/ads/o;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uu;->G:Lcom/google/android/gms/internal/ads/m;

    const-string v2, "aeh2"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/j;->a(Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/internal/ads/m;[Ljava/lang/String;)Z

    return-void
.end method

.method private final declared-synchronized T()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->s:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_1

    const-string v0, "Disabling hardware acceleration on an AdView."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->U()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    const-string v0, "Enabling hardware acceleration on an AdView."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->V()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :goto_0
    :try_start_2
    const-string v0, "Enabling hardware acceleration on an overlay."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->V()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final declared-synchronized U()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->t:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/uu;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final declared-synchronized V()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->t:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/uu;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final declared-synchronized W()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->Q:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->Q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/wr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/wr;->a()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->Q:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final X()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p;->a()Lcom/google/android/gms/internal/ads/o;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ik;->c()Lcom/google/android/gms/internal/ads/e;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ik;->c()Lcom/google/android/gms/internal/ads/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/e;->a(Lcom/google/android/gms/internal/ads/o;)Z

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/uu;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/uu;->E:I

    return p0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/uu;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/uu;->E:I

    return p1
.end method

.method static final synthetic a(ZILcom/google/android/gms/internal/ads/vk2$a;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/nk2;->q()Lcom/google/android/gms/internal/ads/nk2$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nk2$a;->m()Z

    move-result v1

    if-eq v1, p0, :cond_0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/nk2$a;->a(Z)Lcom/google/android/gms/internal/ads/nk2$a;

    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/nk2$a;->a(I)Lcom/google/android/gms/internal/ads/nk2$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p0, Lcom/google/android/gms/internal/ads/nk2;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/vk2$a;->a(Lcom/google/android/gms/internal/ads/nk2;)Lcom/google/android/gms/internal/ads/vk2$a;

    return-void
.end method

.method private final h(Z)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p1, :cond_0

    const-string p1, "1"

    goto :goto_0

    :cond_0
    const-string p1, "0"

    :goto_0
    const-string v1, "isVisible"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "onAdVisibilityChanged"

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final A()Lb/c/b/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->L:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/c/b/a/d/a;

    return-object v0
.end method

.method public final declared-synchronized B()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/uu;->D:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final C()Lcom/google/android/gms/internal/ads/m;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->G:Lcom/google/android/gms/internal/ads/m;

    return-object v0
.end method

.method public final D()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->e:Lcom/google/android/gms/internal/ads/nu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nu;->a()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final E()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    return-void
.end method

.method public final F()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->F:Lcom/google/android/gms/internal/ads/m;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p;->a()Lcom/google/android/gms/internal/ads/o;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uu;->G:Lcom/google/android/gms/internal/ads/m;

    const-string v2, "aes2"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/j;->a(Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/internal/ads/m;[Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p;->a()Lcom/google/android/gms/internal/ads/o;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->a(Lcom/google/android/gms/internal/ads/o;)Lcom/google/android/gms/internal/ads/m;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->F:Lcom/google/android/gms/internal/ads/m;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    const-string v2, "native:view_show"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/p;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/m;)V

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uu;->h:Lcom/google/android/gms/internal/ads/fo;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    const-string v2, "version"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onshow"

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final declared-synchronized G()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->q:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final H()Lcom/google/android/gms/internal/ads/yi2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->m:Lcom/google/android/gms/internal/ads/yi2;

    return-object v0
.end method

.method public final declared-synchronized I()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->B:Lcom/google/android/gms/internal/ads/j1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->B:Lcom/google/android/gms/internal/ads/j1;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/j1;->E0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final J()Landroid/webkit/WebViewClient;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    return-object v0
.end method

.method public final declared-synchronized K()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->i:Lcom/google/android/gms/ads/internal/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->i:Lcom/google/android/gms/ads/internal/i;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/i;->K()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final L()Z
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->e3:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->m:Lcom/google/android/gms/internal/ads/yi2;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->n:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final declared-synchronized M()Lcom/google/android/gms/ads/internal/overlay/c;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final N()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->K:Lcom/google/android/gms/internal/ads/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pn;->c()V

    return-void
.end method

.method public final synthetic P()Lcom/google/android/gms/internal/ads/ju;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    return-object v0
.end method

.method public final Q()V
    .locals 1

    const-string v0, "Cannot add text view to inner AdWebView"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    return-void
.end method

.method public final a()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->e:Lcom/google/android/gms/internal/ads/nu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nu;->b()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/uu;->L()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "AR ad is not enabled or the ad from the server is not an AR ad."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    const-string v0, "Initializing ArWebView object."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->m:Lcom/google/android/gms/internal/ads/yi2;

    invoke-interface {v0, p2, p0}, Lcom/google/android/gms/internal/ads/yi2;->a(Landroid/app/Activity;Landroid/webkit/WebView;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->m:Lcom/google/android/gms/internal/ads/yi2;

    invoke-interface {p2, p3, p4}, Lcom/google/android/gms/internal/ads/yi2;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->m:Lcom/google/android/gms/internal/ads/yi2;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/yi2;->getView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_2
    const-string p1, "The FrameLayout object cannot be null."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lb/c/b/a/d/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->L:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/ads/internal/overlay/c;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->J:Lcom/google/android/gms/ads/internal/overlay/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Lcom/google/android/gms/ads/internal/overlay/d;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/pu;->a(Lcom/google/android/gms/ads/internal/overlay/d;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/hh2;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/hh2;->j:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->y:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/hh2;->j:Z

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/uu;->h(Z)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/j1;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->B:Lcom/google/android/gms/internal/ads/j1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/k1;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->A:Lcom/google/android/gms/internal/ads/k1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/lu;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    invoke-virtual {p0}, Landroid/webkit/WebView;->requestLayout()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/pi2;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->C:Lcom/google/android/gms/internal/ads/pi2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/rt;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->x:Lcom/google/android/gms/internal/ads/rt;

    if-eqz v0, :cond_0

    const-string p1, "Attempt to create multiple AdWebViewVideoControllers."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->x:Lcom/google/android/gms/internal/ads/rt;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/av;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/av;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string p1, "The webview is destroyed. Ignoring action."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/common/util/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/common/util/m<",
            "Lcom/google/android/gms/internal/ads/d5<",
            "-",
            "Lcom/google/android/gms/internal/ads/ws;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/common/util/m;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/d5<",
            "-",
            "Lcom/google/android/gms/internal/ads/ws;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/pu;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    :cond_0
    return-void
.end method

.method public final declared-synchronized a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/wr;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->Q:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->Q:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->Q:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/ads/cu;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/cu;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "text/html"

    const-string v7, "UTF-8"

    move-object v3, p0

    move-object v4, p1

    move-object v8, p3

    invoke-super/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/av;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/l7;->b(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/pu;->c(Z)V

    return-void
.end method

.method public final a(ZI)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/pu;->a(ZI)V

    return-void
.end method

.method public final a(ZILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/pu;->a(ZILjava/lang/String;)V

    return-void
.end method

.method public final a(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/pu;->a(ZILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(ZJ)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    if-eqz p1, :cond_0

    const-string p1, "1"

    goto :goto_0

    :cond_0
    const-string p1, "0"

    :goto_0
    const-string v1, "success"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    const-string p2, "duration"

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "onCacheAccessComplete"

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final b()Lcom/google/android/gms/internal/ads/fo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->h:Lcom/google/android/gms/internal/ads/fo;

    return-object v0
.end method

.method public final b(I)V
    .locals 3

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p;->a()Lcom/google/android/gms/internal/ads/o;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uu;->G:Lcom/google/android/gms/internal/ads/m;

    const-string v2, "aebb2"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/j;->a(Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/internal/ads/m;[Ljava/lang/String;)Z

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->S()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p;->a()Lcom/google/android/gms/internal/ads/o;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p;->a()Lcom/google/android/gms/internal/ads/o;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "close_type"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/ads/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "closetype"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->h:Lcom/google/android/gms/internal/ads/fo;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    const-string v1, "version"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "onhide"

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final declared-synchronized b(Lcom/google/android/gms/ads/internal/overlay/c;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/d5<",
            "-",
            "Lcom/google/android/gms/internal/ads/ws;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final declared-synchronized b(Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/pu;->f()Z

    move-result v1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/ads/internal/overlay/c;->a(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/uu;->r:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b(ZI)Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/av;->destroy()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->l:Lcom/google/android/gms/internal/ads/wj2;

    new-instance v1, Lcom/google/android/gms/internal/ads/xu;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/ads/xu;-><init>(ZI)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/wj2;->a(Lcom/google/android/gms/internal/ads/zj2;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->l:Lcom/google/android/gms/internal/ads/wj2;

    sget-object p2, Lcom/google/android/gms/internal/ads/yj2;->V:Lcom/google/android/gms/internal/ads/yj2;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/wj2;->a(Lcom/google/android/gms/internal/ads/yj2;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final c()Lcom/google/android/gms/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->j:Lcom/google/android/gms/ads/internal/a;

    return-object v0
.end method

.method public final c(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->e:Lcom/google/android/gms/internal/ads/nu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/nu;->setBaseContext(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->K:Lcom/google/android/gms/internal/ads/pn;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->e:Lcom/google/android/gms/internal/ads/nu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nu;->b()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/pn;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public final declared-synchronized c(Z)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/uu;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final d()Lcom/google/android/gms/internal/ads/eq1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->g:Lcom/google/android/gms/internal/ads/eq1;

    return-object v0
.end method

.method public final declared-synchronized d(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/wr;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->Q:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->Q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/wr;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected final declared-synchronized d(Z)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->X()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->K:Lcom/google/android/gms/internal/ads/pn;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/pn;->d()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/overlay/c;->b2()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/overlay/c;->onDestroy()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->L:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/pu;->i()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->y()Lcom/google/android/gms/internal/ads/xr;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/xr;->a(Lcom/google/android/gms/internal/ads/gq;)Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->W()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized e(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/uu;->D:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/ads/uu;->D:I

    if-gtz v0, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/overlay/c;->h2()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized f()Lcom/google/android/gms/internal/ads/lu;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final f(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/pu;->d(Z)V

    return-void
.end method

.method public final g()Lcom/google/android/gms/internal/ads/p;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    return-object v0
.end method

.method public final declared-synchronized g(Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->s:Z

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/uu;->s:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->T()V

    if-eqz v0, :cond_3

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->G:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lu;->b()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/wd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/wd;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    if-eqz p1, :cond_2

    const-string p1, "expanded"

    goto :goto_1

    :cond_2
    const-string p1, "default"

    :goto_1
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/wd;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized getRequestId()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->w:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public final getWebView()Landroid/webkit/WebView;
    .locals 0

    return-object p0
.end method

.method public final declared-synchronized h()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized i()Lcom/google/android/gms/internal/ads/rt;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->x:Lcom/google/android/gms/internal/ads/rt;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final j()I
    .locals 1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getMeasuredWidth()I

    move-result v0

    return v0
.end method

.method public final declared-synchronized k()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final l()Lcom/google/android/gms/internal/ads/zp;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final m()V
    .locals 0

    return-void
.end method

.method public final n()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->H:Lcom/google/android/gms/internal/ads/m;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p;->a()Lcom/google/android/gms/internal/ads/o;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->a(Lcom/google/android/gms/internal/ads/o;)Lcom/google/android/gms/internal/ads/m;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->H:Lcom/google/android/gms/internal/ads/m;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uu;->I:Lcom/google/android/gms/internal/ads/p;

    const-string v2, "native:view_load"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/p;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/m;)V

    :cond_0
    return-void
.end method

.method public final o()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->S()V

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uu;->h:Lcom/google/android/gms/internal/ads/fo;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    const-string v2, "version"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onhide"

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method protected final declared-synchronized onAttachedToWindow()V
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-super {p0}, Landroid/webkit/WebView;->onAttachedToWindow()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/av;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->K:Lcom/google/android/gms/internal/ads/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pn;->a()V

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->y:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/pu;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->z:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pu;->l()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pu;->m()Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/uu;->z:Z

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->R()Z

    const/4 v0, 0x1

    :cond_2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/uu;->h(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected final onDetachedFromWindow()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/av;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->K:Lcom/google/android/gms/internal/ads/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pn;->b()V

    :cond_0
    invoke-super {p0}, Landroid/webkit/WebView;->onDetachedFromWindow()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pu;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pu;->l()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pu;->m()Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/uu;->z:Z

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/uu;->h(Z)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    :try_start_0
    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.intent.action.VIEW"

    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p3

    invoke-virtual {p2, p3, p4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p2}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, 0x33

    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    add-int/2addr p2, p3

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "Couldn\'t find an Activity to view url/mimetype: "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " / "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected final onDraw(Landroid/graphics/Canvas;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/webkit/WebView;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/av;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    const/16 v1, 0xa

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_4

    const/4 v2, -0x1

    const/4 v3, 0x0

    cmpl-float v4, v0, v3

    if-lez v4, :cond_0

    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->canScrollVertically(I)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_0
    const/4 v4, 0x1

    cmpg-float v0, v0, v3

    if-gez v0, :cond_1

    invoke-virtual {p0, v4}, Landroid/webkit/WebView;->canScrollVertically(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    cmpl-float v0, v1, v3

    if-lez v0, :cond_2

    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    cmpg-float v0, v1, v3

    if-gez v0, :cond_4

    invoke-virtual {p0, v4}, Landroid/webkit/WebView;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final onGlobalLayout()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/uu;->R()Z

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/uu;->M()Lcom/google/android/gms/ads/internal/overlay/c;

    move-result-object v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/overlay/c;->f2()V

    :cond_0
    return-void
.end method

.method protected final declared-synchronized onMeasure(II)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/av;->e()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1, v1}, Landroid/webkit/WebView;->setMeasuredDimension(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/webkit/WebView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_19

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->s:Z

    if-nez v0, :cond_19

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lu;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_9

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lu;->d()Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->z1:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/uu;->i()Lcom/google/android/gms/internal/ads/rt;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->Q()F

    move-result v0

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    cmpl-float v1, v0, v1

    if-nez v1, :cond_5

    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :try_start_4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    int-to-float v1, p2

    mul-float v1, v1, v0

    float-to-int v1, v1

    int-to-float v2, p1

    div-float/2addr v2, v0

    float-to-int v2, v2

    if-nez p2, :cond_6

    if-eqz v2, :cond_6

    int-to-float p2, v2

    mul-float p2, p2, v0

    float-to-int v1, p2

    move p2, v2

    goto :goto_1

    :cond_6
    if-nez p1, :cond_7

    if-eqz v1, :cond_7

    int-to-float p1, v1

    div-float/2addr p1, v0

    float-to-int v2, p1

    move p1, v1

    :cond_7
    :goto_1
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/webkit/WebView;->setMeasuredDimension(II)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :cond_8
    :try_start_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lu;->a()Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->B1:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-static {}, Lcom/google/android/gms/common/util/l;->d()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_3

    :cond_9
    const-string v0, "/contentHeight"

    new-instance v1, Lcom/google/android/gms/internal/ads/wu;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/wu;-><init>(Lcom/google/android/gms/internal/ads/uu;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/uu;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    const-string v0, "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = \'gmsg://mobileads.google.com/contentHeight?\';  url += \'height=\' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById(\'afma-notify-fluid\');    if (!frame) {      frame = document.createElement(\'IFRAME\');      frame.id = \'afma-notify-fluid\';      frame.style.display = \'none\';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/uu;->a(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iget v0, p0, Lcom/google/android/gms/internal/ads/uu;->E:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_a

    iget p2, p0, Lcom/google/android/gms/internal/ads/uu;->E:I

    int-to-float p2, p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float p2, p2, v0

    float-to-int p2, p2

    goto :goto_2

    :cond_a
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    :goto_2
    invoke-virtual {p0, p1, p2}, Landroid/webkit/WebView;->setMeasuredDimension(II)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-void

    :cond_b
    :goto_3
    :try_start_6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p0

    return-void

    :cond_c
    :try_start_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lu;->b()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget p2, p2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {p0, p1, p2}, Landroid/webkit/WebView;->setMeasuredDimension(II)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    monitor-exit p0

    return-void

    :cond_d
    :try_start_8
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v4, -0x80000000

    const v5, 0x7fffffff

    if-eq v0, v4, :cond_f

    if-ne v0, v3, :cond_e

    goto :goto_4

    :cond_e
    const v0, 0x7fffffff

    goto :goto_5

    :cond_f
    :goto_4
    move v0, p1

    :goto_5
    if-eq v2, v4, :cond_10

    if-ne v2, v3, :cond_11

    :cond_10
    move v5, p2

    :cond_11
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    iget v2, v2, Lcom/google/android/gms/internal/ads/lu;->c:I

    const/4 v3, 0x1

    if-gt v2, v0, :cond_13

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    iget v2, v2, Lcom/google/android/gms/internal/ads/lu;->b:I

    if-le v2, v5, :cond_12

    goto :goto_6

    :cond_12
    const/4 v2, 0x0

    goto :goto_7

    :cond_13
    :goto_6
    const/4 v2, 0x1

    :goto_7
    sget-object v4, Lcom/google/android/gms/internal/ads/zr2;->r2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_15

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    iget v4, v4, Lcom/google/android/gms/internal/ads/lu;->c:I

    int-to-float v4, v4

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v4, v6

    int-to-float v0, v0

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v6

    cmpl-float v0, v4, v0

    if-gtz v0, :cond_14

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    iget v0, v0, Lcom/google/android/gms/internal/ads/lu;->b:I

    int-to-float v0, v0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v4

    int-to-float v4, v5

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v4, v5

    cmpl-float v0, v0, v4

    if-gtz v0, :cond_14

    goto :goto_8

    :cond_14
    const/4 v3, 0x0

    :goto_8
    if-eqz v2, :cond_15

    move v2, v3

    :cond_15
    const/16 v0, 0x8

    if-eqz v2, :cond_17

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    iget v2, v2, Lcom/google/android/gms/internal/ads/lu;->c:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v2, v3

    float-to-int v2, v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    iget v3, v3, Lcom/google/android/gms/internal/ads/lu;->b:I

    int-to-float v3, v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v3, v4

    float-to-int v3, v3

    int-to-float p1, p1

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p1, v4

    float-to-int p1, p1

    int-to-float p2, p2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/uu;->k:Landroid/util/DisplayMetrics;

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p2, v4

    float-to-int p2, p2

    const/16 v4, 0x67

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Not enough space to show ad. Needs "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "x"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " dp, but only has "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "x"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " dp."

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/webkit/WebView;->getVisibility()I

    move-result p1

    if-eq p1, v0, :cond_16

    const/4 p1, 0x4

    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->setVisibility(I)V

    :cond_16
    invoke-virtual {p0, v1, v1}, Landroid/webkit/WebView;->setMeasuredDimension(II)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    monitor-exit p0

    return-void

    :cond_17
    :try_start_9
    invoke-virtual {p0}, Landroid/webkit/WebView;->getVisibility()I

    move-result p1

    if-eq p1, v0, :cond_18

    invoke-virtual {p0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    :cond_18
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    iget p1, p1, Lcom/google/android/gms/internal/ads/lu;->c:I

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/uu;->p:Lcom/google/android/gms/internal/ads/lu;

    iget p2, p2, Lcom/google/android/gms/internal/ads/lu;->b:I

    invoke-virtual {p0, p1, p2}, Landroid/webkit/WebView;->setMeasuredDimension(II)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    monitor-exit p0

    return-void

    :cond_19
    :goto_9
    :try_start_a
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final onPause()V
    .locals 2

    :try_start_0
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/av;->onPause()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not pause webview."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onResume()V
    .locals 2

    :try_start_0
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/av;->onResume()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not resume webview."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pu;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->f:Lcom/google/android/gms/internal/ads/pu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pu;->k()Z

    move-result v0

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->A:Lcom/google/android/gms/internal/ads/k1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->A:Lcom/google/android/gms/internal/ads/k1;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/k1;->a(Landroid/view/MotionEvent;)V

    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->g:Lcom/google/android/gms/internal/ads/eq1;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/eq1;->a(Landroid/view/MotionEvent;)V

    :cond_2
    :goto_0
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/av;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final declared-synchronized p()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->i:Lcom/google/android/gms/ads/internal/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->i:Lcom/google/android/gms/ads/internal/i;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/i;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized q()Lcom/google/android/gms/ads/internal/overlay/c;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->J:Lcom/google/android/gms/ads/internal/overlay/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized r()Lcom/google/android/gms/internal/ads/pi2;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->C:Lcom/google/android/gms/internal/ads/pi2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final s()I
    .locals 1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getMeasuredHeight()I

    move-result v0

    return v0
.end method

.method public final setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-super {p0, p1}, Landroid/webkit/WebView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final declared-synchronized setRequestedOrientation(I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/uu;->u:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->o:Lcom/google/android/gms/ads/internal/overlay/c;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/c;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final stopLoading()V
    .locals 2

    :try_start_0
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/av;->stopLoading()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not stop loading webview."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final declared-synchronized u()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uu;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized v()Lcom/google/android/gms/internal/ads/k1;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uu;->A:Lcom/google/android/gms/internal/ads/k1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final w()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/uu;->M()Lcom/google/android/gms/ads/internal/overlay/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/c;->g2()V

    :cond_0
    return-void
.end method

.method public final x()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->h()Lcom/google/android/gms/internal/ads/yl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/yl;->b()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "app_muted"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->h()Lcom/google/android/gms/internal/ads/yl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/yl;->a()F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    const-string v2, "app_volume"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/yl;->a(Landroid/content/Context;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    const-string v2, "device_volume"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "volume"

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/ads/l7;->a(Lcom/google/android/gms/internal/ads/m7;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
