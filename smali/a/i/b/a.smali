.class public abstract La/i/b/a;
.super La/g/l/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/i/b/a$c;
    }
.end annotation


# static fields
.field private static final n:Landroid/graphics/Rect;

.field private static final o:La/i/b/b$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/i/b/b$a<",
            "La/g/l/d0/c;",
            ">;"
        }
    .end annotation
.end field

.field private static final p:La/i/b/b$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/i/b/b$b<",
            "La/e/h<",
            "La/g/l/d0/c;",
            ">;",
            "La/g/l/d0/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final d:Landroid/graphics/Rect;

.field private final e:Landroid/graphics/Rect;

.field private final f:Landroid/graphics/Rect;

.field private final g:[I

.field private final h:Landroid/view/accessibility/AccessibilityManager;

.field private final i:Landroid/view/View;

.field private j:La/i/b/a$c;

.field k:I

.field l:I

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/graphics/Rect;

    const/high16 v1, -0x80000000

    const v2, 0x7fffffff

    invoke-direct {v0, v2, v2, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    sput-object v0, La/i/b/a;->n:Landroid/graphics/Rect;

    new-instance v0, La/i/b/a$a;

    invoke-direct {v0}, La/i/b/a$a;-><init>()V

    sput-object v0, La/i/b/a;->o:La/i/b/b$a;

    new-instance v0, La/i/b/a$b;

    invoke-direct {v0}, La/i/b/a$b;-><init>()V

    sput-object v0, La/i/b/a;->p:La/i/b/b$b;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, La/g/l/a;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, La/i/b/a;->d:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, La/i/b/a;->e:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, La/i/b/a;->f:Landroid/graphics/Rect;

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, La/i/b/a;->g:[I

    const/high16 v0, -0x80000000

    iput v0, p0, La/i/b/a;->k:I

    iput v0, p0, La/i/b/a;->l:I

    iput v0, p0, La/i/b/a;->m:I

    if-eqz p1, :cond_1

    iput-object p1, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, La/i/b/a;->h:Landroid/view/accessibility/AccessibilityManager;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    invoke-static {p1}, La/g/l/u;->m(Landroid/view/View;)I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1, v0}, La/g/l/u;->h(Landroid/view/View;I)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "View may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static a(Landroid/view/View;ILandroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    const/16 v1, 0x11

    const/4 v2, 0x0

    if-eq p1, v1, :cond_3

    const/16 v1, 0x21

    if-eq p1, v1, :cond_2

    const/16 v1, 0x42

    const/4 v3, -0x1

    if-eq p1, v1, :cond_1

    const/16 p0, 0x82

    if-ne p1, p0, :cond_0

    invoke-virtual {p2, v2, v3, v0, v3}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p2, v3, v2, v3, p0}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_2
    invoke-virtual {p2, v2, p0, v0, p0}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_3
    invoke-virtual {p2, v0, v2, v0, p0}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    return-object p2
.end method

.method private a(ILandroid/graphics/Rect;)V
    .locals 0

    invoke-virtual {p0, p1}, La/i/b/a;->b(I)La/g/l/d0/c;

    move-result-object p1

    invoke-virtual {p1, p2}, La/g/l/d0/c;->a(Landroid/graphics/Rect;)V

    return-void
.end method

.method private a(ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-static {v0, p1, p2}, La/g/l/u;->a(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method private a(Landroid/graphics/Rect;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getWindowVisibility()I

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    iget-object p1, p0, La/i/b/a;->i:Landroid/view/View;

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v1, p1, Landroid/view/View;

    if-eqz v1, :cond_4

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-lez v1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_2

    :cond_3
    return v0

    :cond_4
    if-eqz p1, :cond_5

    const/4 v0, 0x1

    :cond_5
    :goto_0
    return v0
.end method

.method private b(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-direct {p0, p1, p2}, La/i/b/a;->c(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p2}, La/i/b/a;->e(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    return-object p1
.end method

.method private b(ILandroid/graphics/Rect;)Z
    .locals 9

    invoke-direct {p0}, La/i/b/a;->f()La/e/h;

    move-result-object v7

    iget v0, p0, La/i/b/a;->l:I

    const/high16 v8, -0x80000000

    if-ne v0, v8, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, La/e/h;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/g/l/d0/c;

    :goto_0
    move-object v3, v0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_5

    const/16 v0, 0x11

    if-eq p1, v0, :cond_2

    const/16 v0, 0x21

    if-eq p1, v0, :cond_2

    const/16 v0, 0x42

    if-eq p1, v0, :cond_2

    const/16 v0, 0x82

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iget v0, p0, La/i/b/a;->l:I

    if-eq v0, v8, :cond_3

    invoke-direct {p0, v0, v4}, La/i/b/a;->a(ILandroid/graphics/Rect;)V

    goto :goto_2

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {v4, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_2

    :cond_4
    iget-object p2, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-static {p2, p1, v4}, La/i/b/a;->a(Landroid/view/View;ILandroid/graphics/Rect;)Landroid/graphics/Rect;

    :goto_2
    sget-object v1, La/i/b/a;->p:La/i/b/b$b;

    sget-object v2, La/i/b/a;->o:La/i/b/b$a;

    move-object v0, v7

    move v5, p1

    invoke-static/range {v0 .. v5}, La/i/b/b;->a(Ljava/lang/Object;La/i/b/b$b;La/i/b/b$a;Ljava/lang/Object;Landroid/graphics/Rect;I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_5
    iget-object p2, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-static {p2}, La/g/l/u;->o(Landroid/view/View;)I

    move-result p2

    if-ne p2, v0, :cond_6

    const/4 v5, 0x1

    goto :goto_3

    :cond_6
    const/4 p2, 0x0

    const/4 v5, 0x0

    :goto_3
    sget-object v1, La/i/b/a;->p:La/i/b/b$b;

    sget-object v2, La/i/b/a;->o:La/i/b/b$a;

    const/4 v6, 0x0

    move-object v0, v7

    move v4, p1

    invoke-static/range {v0 .. v6}, La/i/b/b;->a(Ljava/lang/Object;La/i/b/b$b;La/i/b/b$a;Ljava/lang/Object;IZZ)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    check-cast p1, La/g/l/d0/c;

    if-nez p1, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v7, p1}, La/e/h;->a(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {v7, p1}, La/e/h;->b(I)I

    move-result v8

    :goto_5
    invoke-virtual {p0, v8}, La/i/b/a;->c(I)Z

    move-result p1

    return p1
.end method

.method private c(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 3

    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p2

    invoke-virtual {p0, p1}, La/i/b/a;->b(I)La/g/l/d0/c;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, La/g/l/d0/c;->g()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, La/g/l/d0/c;->d()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setContentDescription(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, La/g/l/d0/c;->q()Z

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V

    invoke-virtual {v0}, La/g/l/d0/c;->p()Z

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setPassword(Z)V

    invoke-virtual {v0}, La/g/l/d0/c;->l()Z

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setEnabled(Z)V

    invoke-virtual {v0}, La/g/l/d0/c;->j()Z

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setChecked(Z)V

    invoke-virtual {p0, p1, p2}, La/i/b/a;->a(ILandroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Callbacks must add text or a content description in populateEventForVirtualViewId()"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {v0}, La/g/l/d0/c;->c()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    iget-object v0, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-static {p2, v0, p1}, La/g/l/d0/e;->a(Landroid/view/accessibility/AccessibilityRecord;Landroid/view/View;I)V

    iget-object p1, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    return-object p2
.end method

.method private c(IILandroid/os/Bundle;)Z
    .locals 1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/16 v0, 0x40

    if-eq p2, v0, :cond_1

    const/16 v0, 0x80

    if-eq p2, v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, La/i/b/a;->a(IILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p1}, La/i/b/a;->d(I)Z

    move-result p1

    return p1

    :cond_1
    invoke-direct {p0, p1}, La/i/b/a;->h(I)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0, p1}, La/i/b/a;->a(I)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p0, p1}, La/i/b/a;->c(I)Z

    move-result p1

    return p1
.end method

.method private d()Z
    .locals 3

    iget v0, p0, La/i/b/a;->l:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, La/i/b/a;->a(IILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d(I)Z
    .locals 1

    iget v0, p0, La/i/b/a;->k:I

    if-ne v0, p1, :cond_0

    const/high16 v0, -0x80000000

    iput v0, p0, La/i/b/a;->k:I

    iget-object v0, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const/high16 v0, 0x10000

    invoke-virtual {p0, p1, v0}, La/i/b/a;->a(II)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private e()La/g/l/d0/c;
    .locals 6

    iget-object v0, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-static {v0}, La/g/l/d0/c;->d(Landroid/view/View;)La/g/l/d0/c;

    move-result-object v0

    iget-object v1, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-static {v1, v0}, La/g/l/u;->a(Landroid/view/View;La/g/l/d0/c;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v1}, La/i/b/a;->a(Ljava/util/List;)V

    invoke-virtual {v0}, La/g/l/d0/c;->b()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Views cannot have both real and virtual children"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v2, 0x0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    :goto_1
    if-ge v2, v3, :cond_2

    iget-object v4, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v0, v4, v5}, La/g/l/d0/c;->a(Landroid/view/View;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method private e(I)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    invoke-static {p1}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    iget-object v0, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    return-object p1
.end method

.method private f()La/e/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/e/h<",
            "La/g/l/d0/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, La/i/b/a;->a(Ljava/util/List;)V

    new-instance v1, La/e/h;

    invoke-direct {v1}, La/e/h;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-direct {p0, v2}, La/i/b/a;->f(I)La/g/l/d0/c;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, La/e/h;->c(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private f(I)La/g/l/d0/c;
    .locals 7

    invoke-static {}, La/g/l/d0/c;->x()La/g/l/d0/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, La/g/l/d0/c;->f(Z)V

    invoke-virtual {v0, v1}, La/g/l/d0/c;->g(Z)V

    const-string v2, "android.view.View"

    invoke-virtual {v0, v2}, La/g/l/d0/c;->a(Ljava/lang/CharSequence;)V

    sget-object v2, La/i/b/a;->n:Landroid/graphics/Rect;

    invoke-virtual {v0, v2}, La/g/l/d0/c;->c(Landroid/graphics/Rect;)V

    sget-object v2, La/i/b/a;->n:Landroid/graphics/Rect;

    invoke-virtual {v0, v2}, La/g/l/d0/c;->d(Landroid/graphics/Rect;)V

    iget-object v2, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v0, v2}, La/g/l/d0/c;->a(Landroid/view/View;)V

    invoke-virtual {p0, p1, v0}, La/i/b/a;->a(ILa/g/l/d0/c;)V

    invoke-virtual {v0}, La/g/l/d0/c;->g()Ljava/lang/CharSequence;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, La/g/l/d0/c;->d()Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Callbacks must add text or a content description in populateNodeForVirtualViewId()"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v2, p0, La/i/b/a;->e:Landroid/graphics/Rect;

    invoke-virtual {v0, v2}, La/g/l/d0/c;->a(Landroid/graphics/Rect;)V

    iget-object v2, p0, La/i/b/a;->e:Landroid/graphics/Rect;

    sget-object v3, La/i/b/a;->n:Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    invoke-virtual {v0}, La/g/l/d0/c;->a()I

    move-result v2

    and-int/lit8 v3, v2, 0x40

    if-nez v3, :cond_b

    const/16 v3, 0x80

    and-int/2addr v2, v3

    if-nez v2, :cond_a

    iget-object v2, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, La/g/l/d0/c;->e(Ljava/lang/CharSequence;)V

    iget-object v2, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v0, v2, p1}, La/g/l/d0/c;->c(Landroid/view/View;I)V

    iget v2, p0, La/i/b/a;->k:I

    const/4 v4, 0x0

    if-ne v2, p1, :cond_2

    invoke-virtual {v0, v1}, La/g/l/d0/c;->a(Z)V

    invoke-virtual {v0, v3}, La/g/l/d0/c;->a(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v4}, La/g/l/d0/c;->a(Z)V

    const/16 v2, 0x40

    invoke-virtual {v0, v2}, La/g/l/d0/c;->a(I)V

    :goto_1
    iget v2, p0, La/i/b/a;->l:I

    if-ne v2, p1, :cond_3

    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_4

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, La/g/l/d0/c;->a(I)V

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, La/g/l/d0/c;->m()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0, v1}, La/g/l/d0/c;->a(I)V

    :cond_5
    :goto_3
    invoke-virtual {v0, p1}, La/g/l/d0/c;->h(Z)V

    iget-object p1, p0, La/i/b/a;->i:Landroid/view/View;

    iget-object v2, p0, La/i/b/a;->g:[I

    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p0, La/i/b/a;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, La/g/l/d0/c;->b(Landroid/graphics/Rect;)V

    iget-object p1, p0, La/i/b/a;->d:Landroid/graphics/Rect;

    sget-object v2, La/i/b/a;->n:Landroid/graphics/Rect;

    invoke-virtual {p1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, La/i/b/a;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, La/g/l/d0/c;->a(Landroid/graphics/Rect;)V

    iget p1, v0, La/g/l/d0/c;->b:I

    const/4 v2, -0x1

    if-eq p1, v2, :cond_7

    invoke-static {}, La/g/l/d0/c;->x()La/g/l/d0/c;

    move-result-object p1

    iget v3, v0, La/g/l/d0/c;->b:I

    :goto_4
    if-eq v3, v2, :cond_6

    iget-object v5, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {p1, v5, v2}, La/g/l/d0/c;->b(Landroid/view/View;I)V

    sget-object v5, La/i/b/a;->n:Landroid/graphics/Rect;

    invoke-virtual {p1, v5}, La/g/l/d0/c;->c(Landroid/graphics/Rect;)V

    invoke-virtual {p0, v3, p1}, La/i/b/a;->a(ILa/g/l/d0/c;)V

    iget-object v3, p0, La/i/b/a;->e:Landroid/graphics/Rect;

    invoke-virtual {p1, v3}, La/g/l/d0/c;->a(Landroid/graphics/Rect;)V

    iget-object v3, p0, La/i/b/a;->d:Landroid/graphics/Rect;

    iget-object v5, p0, La/i/b/a;->e:Landroid/graphics/Rect;

    iget v6, v5, Landroid/graphics/Rect;->left:I

    iget v5, v5, Landroid/graphics/Rect;->top:I

    invoke-virtual {v3, v6, v5}, Landroid/graphics/Rect;->offset(II)V

    iget v3, p1, La/g/l/d0/c;->b:I

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, La/g/l/d0/c;->t()V

    :cond_7
    iget-object p1, p0, La/i/b/a;->d:Landroid/graphics/Rect;

    iget-object v2, p0, La/i/b/a;->g:[I

    aget v2, v2, v4

    iget-object v3, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getScrollX()I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, La/i/b/a;->g:[I

    aget v3, v3, v1

    iget-object v5, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getScrollY()I

    move-result v5

    sub-int/2addr v3, v5

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Rect;->offset(II)V

    :cond_8
    iget-object p1, p0, La/i/b/a;->i:Landroid/view/View;

    iget-object v2, p0, La/i/b/a;->f:Landroid/graphics/Rect;

    invoke-virtual {p1, v2}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, La/i/b/a;->f:Landroid/graphics/Rect;

    iget-object v2, p0, La/i/b/a;->g:[I

    aget v2, v2, v4

    iget-object v3, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getScrollX()I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, La/i/b/a;->g:[I

    aget v3, v3, v1

    iget-object v4, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Rect;->offset(II)V

    iget-object p1, p0, La/i/b/a;->d:Landroid/graphics/Rect;

    iget-object v2, p0, La/i/b/a;->f:Landroid/graphics/Rect;

    invoke-virtual {p1, v2}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, La/i/b/a;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, La/g/l/d0/c;->d(Landroid/graphics/Rect;)V

    iget-object p1, p0, La/i/b/a;->d:Landroid/graphics/Rect;

    invoke-direct {p0, p1}, La/i/b/a;->a(Landroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {v0, v1}, La/g/l/d0/c;->m(Z)V

    :cond_9
    return-object v0

    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Callbacks must set parent bounds in populateNodeForVirtualViewId()"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static g(I)I
    .locals 1

    const/16 v0, 0x13

    if-eq p0, v0, :cond_2

    const/16 v0, 0x15

    if-eq p0, v0, :cond_1

    const/16 v0, 0x16

    if-eq p0, v0, :cond_0

    const/16 p0, 0x82

    return p0

    :cond_0
    const/16 p0, 0x42

    return p0

    :cond_1
    const/16 p0, 0x11

    return p0

    :cond_2
    const/16 p0, 0x21

    return p0
.end method

.method private h(I)Z
    .locals 2

    iget-object v0, p0, La/i/b/a;->h:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, La/i/b/a;->h:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, La/i/b/a;->k:I

    if-eq v0, p1, :cond_2

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    invoke-direct {p0, v0}, La/i/b/a;->d(I)Z

    :cond_1
    iput p1, p0, La/i/b/a;->k:I

    iget-object v0, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const v0, 0x8000

    invoke-virtual {p0, p1, v0}, La/i/b/a;->a(II)Z

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method private i(I)V
    .locals 2

    iget v0, p0, La/i/b/a;->m:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, La/i/b/a;->m:I

    const/16 v1, 0x80

    invoke-virtual {p0, p1, v1}, La/i/b/a;->a(II)Z

    const/16 p1, 0x100

    invoke-virtual {p0, v0, p1}, La/i/b/a;->a(II)Z

    return-void
.end method


# virtual methods
.method protected abstract a(FF)I
.end method

.method public a(Landroid/view/View;)La/g/l/d0/d;
    .locals 0

    iget-object p1, p0, La/i/b/a;->j:La/i/b/a$c;

    if-nez p1, :cond_0

    new-instance p1, La/i/b/a$c;

    invoke-direct {p1, p0}, La/i/b/a$c;-><init>(La/i/b/a;)V

    iput-object p1, p0, La/i/b/a;->j:La/i/b/a$c;

    :cond_0
    iget-object p1, p0, La/i/b/a;->j:La/i/b/a$c;

    return-object p1
.end method

.method protected abstract a(ILa/g/l/d0/c;)V
.end method

.method protected a(ILandroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    return-void
.end method

.method protected a(IZ)V
    .locals 0

    return-void
.end method

.method protected a(La/g/l/d0/c;)V
    .locals 0

    return-void
.end method

.method public a(Landroid/view/View;La/g/l/d0/c;)V
    .locals 0

    invoke-super {p0, p1, p2}, La/g/l/a;->a(Landroid/view/View;La/g/l/d0/c;)V

    invoke-virtual {p0, p2}, La/i/b/a;->a(La/g/l/d0/c;)V

    return-void
.end method

.method protected a(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    return-void
.end method

.method protected abstract a(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

.method public final a(ZILandroid/graphics/Rect;)V
    .locals 2

    iget v0, p0, La/i/b/a;->l:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, La/i/b/a;->a(I)Z

    :cond_0
    if-eqz p1, :cond_1

    invoke-direct {p0, p2, p3}, La/i/b/a;->b(ILandroid/graphics/Rect;)Z

    :cond_1
    return-void
.end method

.method public final a(I)Z
    .locals 2

    iget v0, p0, La/i/b/a;->l:I

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    return v1

    :cond_0
    const/high16 v0, -0x80000000

    iput v0, p0, La/i/b/a;->l:I

    invoke-virtual {p0, p1, v1}, La/i/b/a;->a(IZ)V

    const/16 v0, 0x8

    invoke-virtual {p0, p1, v0}, La/i/b/a;->a(II)Z

    const/4 p1, 0x1

    return p1
.end method

.method public final a(II)Z
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, -0x80000000

    if-eq p1, v1, :cond_2

    iget-object v1, p0, La/i/b/a;->h:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    :cond_1
    invoke-direct {p0, p1, p2}, La/i/b/a;->b(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    iget-object p2, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-static {v1, p2, p1}, La/g/l/x;->a(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method protected abstract a(IILandroid/os/Bundle;)Z
.end method

.method public final a(Landroid/view/KeyEvent;)Z
    .locals 6

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v3, 0x3d

    const/4 v4, 0x0

    if-eq v0, v3, :cond_2

    const/16 v3, 0x42

    if-eq v0, v3, :cond_1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {v0}, La/i/b/a;->g(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    add-int/2addr p1, v2

    const/4 v3, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    invoke-direct {p0, v0, v4}, La/i/b/a;->b(ILandroid/graphics/Rect;)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v1, v1, 0x1

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v1, v3

    goto :goto_1

    :cond_1
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    if-nez p1, :cond_4

    invoke-direct {p0}, La/i/b/a;->d()Z

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p1, 0x2

    invoke-direct {p0, p1, v4}, La/i/b/a;->b(ILandroid/graphics/Rect;)Z

    move-result v1

    goto :goto_1

    :cond_3
    invoke-virtual {p1, v2}, Landroid/view/KeyEvent;->hasModifiers(I)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0, v2, v4}, La/i/b/a;->b(ILandroid/graphics/Rect;)Z

    move-result v1

    :cond_4
    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Landroid/view/MotionEvent;)Z
    .locals 5

    iget-object v0, p0, La/i/b/a;->h:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, La/i/b/a;->h:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x7

    const/4 v3, 0x1

    const/high16 v4, -0x80000000

    if-eq v0, v2, :cond_3

    const/16 v2, 0x9

    if-eq v0, v2, :cond_3

    const/16 p1, 0xa

    if-eq v0, p1, :cond_1

    return v1

    :cond_1
    iget p1, p0, La/i/b/a;->m:I

    if-eq p1, v4, :cond_2

    invoke-direct {p0, v4}, La/i/b/a;->i(I)V

    return v3

    :cond_2
    return v1

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {p0, v0, p1}, La/i/b/a;->a(FF)I

    move-result p1

    invoke-direct {p0, p1}, La/i/b/a;->i(I)V

    if-eq p1, v4, :cond_4

    const/4 v1, 0x1

    :cond_4
    :goto_0
    return v1
.end method

.method public final b()I
    .locals 1

    iget v0, p0, La/i/b/a;->k:I

    return v0
.end method

.method b(I)La/g/l/d0/c;
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, La/i/b/a;->e()La/g/l/d0/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, La/i/b/a;->f(I)La/g/l/d0/c;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    invoke-super {p0, p1, p2}, La/g/l/a;->b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0, p2}, La/i/b/a;->a(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method b(IILandroid/os/Bundle;)Z
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-direct {p0, p1, p2, p3}, La/i/b/a;->c(IILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p2, p3}, La/i/b/a;->a(ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final c()I
    .locals 1

    iget v0, p0, La/i/b/a;->l:I

    return v0
.end method

.method public final c(I)Z
    .locals 2

    iget-object v0, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, La/i/b/a;->i:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, La/i/b/a;->l:I

    if-ne v0, p1, :cond_1

    return v1

    :cond_1
    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_2

    invoke-virtual {p0, v0}, La/i/b/a;->a(I)Z

    :cond_2
    iput p1, p0, La/i/b/a;->l:I

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, La/i/b/a;->a(IZ)V

    const/16 v1, 0x8

    invoke-virtual {p0, p1, v1}, La/i/b/a;->a(II)Z

    return v0
.end method
