.class public Lcom/google/android/gms/ads/internal/overlay/c;
.super Lcom/google/android/gms/internal/ads/ae;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/y;


# static fields
.field private static final v:I


# instance fields
.field protected final b:Landroid/app/Activity;

.field c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

.field d:Lcom/google/android/gms/internal/ads/ws;

.field private e:Lcom/google/android/gms/ads/internal/overlay/i;

.field private f:Lcom/google/android/gms/ads/internal/overlay/q;

.field private g:Z

.field private h:Landroid/widget/FrameLayout;

.field private i:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field private j:Z

.field private k:Z

.field private l:Lcom/google/android/gms/ads/internal/overlay/j;

.field private m:Z

.field n:I

.field private final o:Ljava/lang/Object;

.field private p:Ljava/lang/Runnable;

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lcom/google/android/gms/ads/internal/overlay/c;->v:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ae;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->g:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->j:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->k:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->m:Z

    iput v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->n:I

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->o:Ljava/lang/Object;

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->s:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->t:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->u:Z

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    return-void
.end method

.method private final a(Landroid/content/res/Configuration;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/g;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v3, v4, p1}, Lcom/google/android/gms/internal/ads/ll;->a(Landroid/app/Activity;Landroid/content/res/Configuration;)Z

    move-result p1

    iget-boolean v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->k:Z

    const/16 v4, 0x13

    if-eqz v3, :cond_1

    if-eqz v0, :cond_2

    :cond_1
    if-nez p1, :cond_2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v4, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    if-eqz p1, :cond_3

    iget-boolean p1, p1, Lcom/google/android/gms/ads/internal/g;->h:Z

    if-eqz p1, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->w0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_5

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x100

    if-eqz v1, :cond_4

    const/16 v0, 0x1504

    if-eqz v2, :cond_4

    const/16 v0, 0x1706

    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void

    :cond_5
    const/16 v0, 0x400

    const/16 v3, 0x800

    if-eqz v1, :cond_6

    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p1, v3}, Landroid/view/Window;->clearFlags(I)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_7

    if-eqz v2, :cond_7

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x1002

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void

    :cond_6
    invoke-virtual {p1, v3}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    :cond_7
    return-void
.end method

.method private static a(Lb/c/b/a/d/a;Landroid/view/View;)V
    .locals 1

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->r()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/ads/yd;->a(Lb/c/b/a/d/a;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private final g(Z)V
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->f2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    new-instance v1, Lcom/google/android/gms/ads/internal/overlay/p;

    invoke-direct {v1}, Lcom/google/android/gms/ads/internal/overlay/p;-><init>()V

    const/16 v2, 0x32

    iput v2, v1, Lcom/google/android/gms/ads/internal/overlay/p;->d:I

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iput v3, v1, Lcom/google/android/gms/ads/internal/overlay/p;->a:I

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    iput v2, v1, Lcom/google/android/gms/ads/internal/overlay/p;->b:I

    iput v0, v1, Lcom/google/android/gms/ads/internal/overlay/p;->c:I

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/q;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-direct {v0, v2, v1, p0}, Lcom/google/android/gms/ads/internal/overlay/q;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/p;Lcom/google/android/gms/ads/internal/overlay/y;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->f:Lcom/google/android/gms/ads/internal/overlay/q;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    if-eqz p1, :cond_2

    const/16 v1, 0xb

    goto :goto_2

    :cond_2
    const/16 v1, 0x9

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Z

    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/ads/internal/overlay/c;->a(ZZ)V

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->f:Lcom/google/android/gms/ads/internal/overlay/q;

    invoke-virtual {p1, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private final h(Z)V
    .locals 19

    move-object/from16 v1, p0

    iget-boolean v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->r:Z

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->requestWindowFeature(I)Z

    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ju;->f()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    iput-boolean v5, v1, Lcom/google/android/gms/ads/internal/overlay/c;->m:Z

    if-eqz v3, :cond_5

    iget-object v6, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget v6, v6, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    const/4 v7, 0x6

    if-ne v6, v7, :cond_4

    iget-object v6, v1, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v6}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget v6, v6, Landroid/content/res/Configuration;->orientation:I

    if-ne v6, v2, :cond_3

    :goto_2
    const/4 v5, 0x1

    :cond_3
    iput-boolean v5, v1, Lcom/google/android/gms/ads/internal/overlay/c;->m:Z

    goto :goto_3

    :cond_4
    iget-object v6, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget v6, v6, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    const/4 v7, 0x7

    if-ne v6, v7, :cond_5

    iget-object v6, v1, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v6}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget v6, v6, Landroid/content/res/Configuration;->orientation:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_3

    goto :goto_2

    :cond_5
    :goto_3
    iget-boolean v5, v1, Lcom/google/android/gms/ads/internal/overlay/c;->m:Z

    const/16 v6, 0x2e

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Delay onShow to next orientation change: "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    iget-object v5, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget v5, v5, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:I

    invoke-virtual {v1, v5}, Lcom/google/android/gms/ads/internal/overlay/c;->b(I)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    const/high16 v5, 0x1000000

    invoke-virtual {v0, v5, v5}, Landroid/view/Window;->setFlags(II)V

    const-string v0, "Hardware acceleration on the AdActivity window enabled."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    iget-boolean v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->k:Z

    if-nez v0, :cond_6

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    const/high16 v5, -0x1000000

    goto :goto_4

    :cond_6
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    sget v5, Lcom/google/android/gms/ads/internal/overlay/c;->v:I

    :goto_4
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    iget-object v5, v1, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    invoke-virtual {v0, v5}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    iput-boolean v2, v1, Lcom/google/android/gms/ads/internal/overlay/c;->r:Z

    if-eqz p1, :cond_d

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->d()Lcom/google/android/gms/internal/ads/et;

    iget-object v6, v1, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_7

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v0

    move-object v7, v0

    goto :goto_5

    :cond_7
    move-object v7, v4

    :goto_5
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_8

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->G()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_6

    :cond_8
    move-object v8, v4

    :goto_6
    const/4 v9, 0x1

    const/4 v11, 0x0

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v12, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lcom/google/android/gms/internal/ads/fo;

    const/4 v13, 0x0

    const/4 v14, 0x0

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_9

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->c()Lcom/google/android/gms/ads/internal/a;

    move-result-object v0

    move-object v15, v0

    goto :goto_7

    :cond_9
    move-object v15, v4

    :goto_7
    invoke-static {}, Lcom/google/android/gms/internal/ads/wj2;->a()Lcom/google/android/gms/internal/ads/wj2;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    move v10, v3

    invoke-static/range {v6 .. v18}, Lcom/google/android/gms/internal/ads/et;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/lu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/ads/internal/i;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/yi2;Z)Lcom/google/android/gms/internal/ads/ws;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v5

    const/4 v6, 0x0

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v7, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->q:Lcom/google/android/gms/internal/ads/l4;

    const/4 v8, 0x0

    iget-object v9, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->f:Lcom/google/android/gms/internal/ads/n4;

    iget-object v10, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->j:Lcom/google/android/gms/ads/internal/overlay/t;

    const/4 v11, 0x1

    const/4 v12, 0x0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ju;->b()Lcom/google/android/gms/ads/internal/c;

    move-result-object v0

    move-object v13, v0

    goto :goto_8

    :cond_a
    move-object v13, v4

    :goto_8
    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-interface/range {v5 .. v15}, Lcom/google/android/gms/internal/ads/ju;->a(Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/internal/ads/l4;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/internal/ads/n4;Lcom/google/android/gms/ads/internal/overlay/t;ZLcom/google/android/gms/internal/ads/g5;Lcom/google/android/gms/ads/internal/c;Lcom/google/android/gms/internal/ads/vd;Lcom/google/android/gms/internal/ads/vi;)V

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v0

    new-instance v5, Lcom/google/android/gms/ads/internal/overlay/f;

    invoke-direct {v5, v1}, Lcom/google/android/gms/ads/internal/overlay/f;-><init>(Lcom/google/android/gms/ads/internal/overlay/c;)V

    invoke-interface {v0, v5}, Lcom/google/android/gms/internal/ads/ju;->a(Lcom/google/android/gms/internal/ads/iu;)V

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->m:Ljava/lang/String;

    if-eqz v5, :cond_b

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, v5}, Lcom/google/android/gms/internal/ads/ws;->loadUrl(Ljava/lang/String;)V

    goto :goto_9

    :cond_b
    iget-object v8, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Ljava/lang/String;

    if-eqz v8, :cond_c

    iget-object v6, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    iget-object v7, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->g:Ljava/lang/String;

    const/4 v11, 0x0

    const-string v9, "text/html"

    const-string v10, "UTF-8"

    invoke-interface/range {v6 .. v11}, Lcom/google/android/gms/internal/ads/ws;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_9
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_e

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/ads/internal/overlay/c;)V

    goto :goto_a

    :cond_c
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/g;

    const-string v2, "No URL or HTML to display in ad overlay."

    invoke-direct {v0, v2}, Lcom/google/android/gms/ads/internal/overlay/g;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    const-string v2, "Error obtaining webview."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/g;

    const-string v2, "Could not obtain webview for the overlay."

    invoke-direct {v0, v2}, Lcom/google/android/gms/ads/internal/overlay/g;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    iput-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    iget-object v5, v1, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-interface {v0, v5}, Lcom/google/android/gms/internal/ads/ws;->c(Landroid/content/Context;)V

    :cond_e
    :goto_a
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ws;->b(Lcom/google/android/gms/ads/internal/overlay/c;)V

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_f

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->A()Lb/c/b/a/d/a;

    move-result-object v0

    iget-object v5, v1, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    invoke-static {v0, v5}, Lcom/google/android/gms/ads/internal/overlay/c;->a(Lb/c/b/a/d/a;Landroid/view/View;)V

    :cond_f
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_10

    instance-of v5, v0, Landroid/view/ViewGroup;

    if-eqz v5, :cond_10

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v5, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_10
    iget-boolean v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->k:Z

    if-eqz v0, :cond_11

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->E()V

    :cond_11
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    iget-object v5, v1, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    iget-object v6, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v7, v6, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->g:Ljava/lang/String;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Ljava/lang/String;

    invoke-interface {v0, v4, v5, v7, v6}, Lcom/google/android/gms/internal/ads/ws;->a(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    iget-object v4, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v4

    const/4 v5, -0x1

    invoke-virtual {v0, v4, v5, v5}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    if-nez p1, :cond_12

    iget-boolean v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->m:Z

    if-nez v0, :cond_12

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/ads/internal/overlay/c;->j2()V

    :cond_12
    invoke-direct {v1, v3}, Lcom/google/android/gms/ads/internal/overlay/c;->g(Z)V

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->k()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/ads/internal/overlay/c;->a(ZZ)V

    :cond_13
    return-void

    :cond_14
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/g;

    const-string v2, "Invalid activity, no window available."

    invoke-direct {v0, v2}, Lcom/google/android/gms/ads/internal/overlay/g;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final i2()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->s:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->s:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_2

    iget v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->n:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ws;->b(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->q:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->B()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lcom/google/android/gms/ads/internal/overlay/e;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/internal/overlay/e;-><init>(Lcom/google/android/gms/ads/internal/overlay/c;)V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->p:Ljava/lang/Runnable;

    sget-object v2, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    sget-object v3, Lcom/google/android/gms/internal/ads/zr2;->t0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    monitor-exit v0

    return-void

    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/overlay/c;->e2()V

    :cond_3
    :goto_1
    return-void
.end method

.method private final j2()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->F()V

    return-void
.end method


# virtual methods
.method public final K1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->r:Z

    return-void
.end method

.method public final Q0()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->n:I

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final R0()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->d2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->e:Lcom/google/android/gms/ads/internal/overlay/i;

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ll;->a(Lcom/google/android/gms/internal/ads/ws;)Z

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/overlay/c;->i2()V

    return-void
.end method

.method public final Y1()Z
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->n:I

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->u()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v2

    const-string v3, "onbackblocked"

    invoke-interface {v1, v3, v2}, Lcom/google/android/gms/internal/ads/e7;->a(Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    return v0
.end method

.method public final a(IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public final a(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 2

    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->h:Landroid/widget/FrameLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->h:Landroid/widget/FrameLayout;

    const/4 v1, -0x1

    invoke-virtual {v0, p1, v1, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->h:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->r:Z

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/overlay/c;->i:Landroid/webkit/WebChromeClient$CustomViewCallback;

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->g:Z

    return-void
.end method

.method public final a(ZZ)V
    .locals 6

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->u0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/g;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v3, Lcom/google/android/gms/internal/ads/zr2;->v0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v3, :cond_1

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    if-eqz v3, :cond_1

    iget-boolean v3, v3, Lcom/google/android/gms/ads/internal/g;->j:Z

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    if-eqz v0, :cond_2

    if-nez v3, :cond_2

    new-instance p1, Lcom/google/android/gms/internal/ads/wd;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    const-string v5, "useCustomClose"

    invoke-direct {p1, v4, v5}, Lcom/google/android/gms/internal/ads/wd;-><init>(Lcom/google/android/gms/internal/ads/ws;Ljava/lang/String;)V

    const-string v4, "Custom close has been disabled for interstitial ads in this ad slot."

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->f:Lcom/google/android/gms/ads/internal/overlay/q;

    if-eqz p1, :cond_5

    if-nez v3, :cond_4

    if-eqz p2, :cond_3

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :cond_4
    :goto_2
    invoke-virtual {p1, v1}, Lcom/google/android/gms/ads/internal/overlay/q;->a(Z)V

    :cond_5
    return-void
.end method

.method public final b(I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->O2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->P2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-gt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->Q2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->R2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object v0

    const-string v1, "AdOverlay.setRequestedOrientation"

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/ik;->b(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public final b2()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->n:I

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final c2()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->g:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/overlay/c;->b(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->h:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->r:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->h:Landroid/widget/FrameLayout;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->i:Landroid/webkit/WebChromeClient$CustomViewCallback;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->i:Landroid/webkit/WebChromeClient$CustomViewCallback;

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->g:Z

    return-void
.end method

.method public final d2()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->f:Lcom/google/android/gms/ads/internal/overlay/q;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/overlay/c;->g(Z)V

    return-void
.end method

.method final e2()V
    .locals 5

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->t:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->t:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->e:Lcom/google/android/gms/ads/internal/overlay/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/i;->d:Landroid/content/Context;

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/ws;->c(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/ws;->g(Z)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->e:Lcom/google/android/gms/ads/internal/overlay/i;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/i;->c:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->e:Lcom/google/android/gms/ads/internal/overlay/i;

    iget v4, v3, Lcom/google/android/gms/ads/internal/overlay/i;->a:I

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/i;->b:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v2, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->e:Lcom/google/android/gms/ads/internal/overlay/i;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/ws;->c(Landroid/content/Context;)V

    :cond_2
    :goto_0
    iput-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/o;->I()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->A()Lb/c/b/a/d/a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/overlay/c;->a(Lb/c/b/a/d/a;Landroid/view/View;)V

    :cond_5
    return-void
.end method

.method public final f2()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->m:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->m:Z

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/overlay/c;->j2()V

    :cond_0
    return-void
.end method

.method public final g2()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/ads/internal/overlay/j;->c:Z

    return-void
.end method

.method public final h2()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->o:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->q:Z

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->p:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/overlay/c;->p:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/overlay/c;->p:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j(Landroid/os/Bundle;)V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->j:Z

    const-string v1, "com.google.android.gms.ads.internal.overlay.hasResumed"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public k(Landroid/os/Bundle;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->requestWindowFeature(I)Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v2, "com.google.android.gms.ads.internal.overlay.hasResumed"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Lcom/google/android/gms/ads/internal/overlay/c;->j:Z

    const/4 v2, 0x3

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->a(Landroid/content/Intent;)Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v3, :cond_a

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lcom/google/android/gms/internal/ads/fo;

    iget v3, v3, Lcom/google/android/gms/internal/ads/fo;->d:I

    const v4, 0x7270e0

    if-le v3, v4, :cond_1

    iput v2, p0, Lcom/google/android/gms/ads/internal/overlay/c;->n:I

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "shouldCallOnOverlayOpened"

    invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->u:Z

    :cond_2
    iget-object v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    iget-boolean v3, v3, Lcom/google/android/gms/ads/internal/g;->b:Z

    iput-boolean v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->k:Z

    goto :goto_1

    :cond_3
    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->k:Z

    :goto_1
    iget-boolean v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->k:Z

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    iget v3, v3, Lcom/google/android/gms/ads/internal/g;->g:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_4

    new-instance v3, Lcom/google/android/gms/ads/internal/overlay/l;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/google/android/gms/ads/internal/overlay/l;-><init>(Lcom/google/android/gms/ads/internal/overlay/c;Lcom/google/android/gms/ads/internal/overlay/h;)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sk;->b()Lcom/google/android/gms/internal/ads/lo1;

    :cond_4
    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    if-eqz p1, :cond_5

    iget-boolean p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->u:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    invoke-interface {p1}, Lcom/google/android/gms/ads/internal/overlay/o;->p()V

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->l:I

    if-eq p1, v1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->c:Lcom/google/android/gms/internal/ads/jm2;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->c:Lcom/google/android/gms/internal/ads/jm2;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/jm2;->l()V

    :cond_6
    new-instance p1, Lcom/google/android/gms/ads/internal/overlay/j;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lcom/google/android/gms/internal/ads/fo;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    invoke-direct {p1, v3, v4, v5}, Lcom/google/android/gms/ads/internal/overlay/j;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    const/16 v3, 0x3e8

    invoke-virtual {p1, v3}, Landroid/widget/RelativeLayout;->setId(I)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    move-result-object p1

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/ll;->a(Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->l:I

    if-eq p1, v1, :cond_9

    const/4 v3, 0x2

    if-eq p1, v3, :cond_8

    if-ne p1, v2, :cond_7

    invoke-direct {p0, v1}, Lcom/google/android/gms/ads/internal/overlay/c;->h(Z)V

    return-void

    :cond_7
    new-instance p1, Lcom/google/android/gms/ads/internal/overlay/g;

    const-string v0, "Could not determine ad overlay type."

    invoke-direct {p1, v0}, Lcom/google/android/gms/ads/internal/overlay/g;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Lcom/google/android/gms/ads/internal/overlay/i;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    invoke-direct {p1, v1}, Lcom/google/android/gms/ads/internal/overlay/i;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->e:Lcom/google/android/gms/ads/internal/overlay/i;

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/overlay/c;->h(Z)V

    return-void

    :cond_9
    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/overlay/c;->h(Z)V

    return-void

    :cond_a
    new-instance p1, Lcom/google/android/gms/ads/internal/overlay/g;

    const-string v0, "Could not get info for ad overlay."

    invoke-direct {p1, v0}, Lcom/google/android/gms/ads/internal/overlay/g;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/android/gms/ads/internal/overlay/g; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    iput v2, p0, Lcom/google/android/gms/ads/internal/overlay/c;->n:I

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final k1()V
    .locals 0

    return-void
.end method

.method public final m0()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->d2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ll;->b(Lcom/google/android/gms/internal/ads/ws;)Z

    return-void

    :cond_0
    const-string v0, "The webview does not exist. Ignoring action."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/c;->l:Lcom/google/android/gms/ads/internal/overlay/j;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/overlay/c;->i2()V

    return-void
.end method

.method public final onPause()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/overlay/c;->c2()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/o;->onPause()V

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->d2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->e:Lcom/google/android/gms/ads/internal/overlay/i;

    if-nez v0, :cond_2

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ll;->a(Lcom/google/android/gms/internal/ads/ws;)Z

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/overlay/c;->i2()V

    return-void
.end method

.method public final onResume()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/o;->onResume()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/overlay/c;->a(Landroid/content/res/Configuration;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->d2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->e()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ll;->b(Lcom/google/android/gms/internal/ads/ws;)Z

    return-void

    :cond_1
    const-string v0, "The webview does not exist. Ignoring action."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final v(Lb/c/b/a/d/a;)V
    .locals 0

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Configuration;

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/overlay/c;->a(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public final z1()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/ads/internal/overlay/c;->n:I

    return-void
.end method
