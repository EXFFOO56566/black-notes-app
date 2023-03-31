.class public final Lcom/google/android/gms/internal/ads/ht;
.super Landroid/widget/FrameLayout;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ws;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/ws;

.field private final c:Lcom/google/android/gms/internal/ads/zp;

.field private final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ws;)V
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    new-instance v0, Lcom/google/android/gms/internal/ads/zp;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->D()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1, p0, p0}, Lcom/google/android/gms/internal/ads/zp;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ads/ws;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->c:Lcom/google/android/gms/internal/ads/zp;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ht;->L()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ht;)Lcom/google/android/gms/internal/ads/ws;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    return-object p0
.end method

.method static final synthetic b(Lb/c/b/a/d/a;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->r()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/yd;->b(Lb/c/b/a/d/a;)V

    return-void
.end method


# virtual methods
.method public final A()Lb/c/b/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->A()Lb/c/b/a/d/a;

    move-result-object v0

    return-object v0
.end method

.method public final B()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->B()Z

    move-result v0

    return v0
.end method

.method public final C()Lcom/google/android/gms/internal/ads/m;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gq;->C()Lcom/google/android/gms/internal/ads/m;

    move-result-object v0

    return-object v0
.end method

.method public final D()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->D()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final E()V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/ws;->setBackgroundColor(I)V

    return-void
.end method

.method public final F()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->F()V

    return-void
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->G()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final H()Lcom/google/android/gms/internal/ads/yi2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->H()Lcom/google/android/gms/internal/ads/yi2;

    move-result-object v0

    return-object v0
.end method

.method public final I()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gq;->I()V

    return-void
.end method

.method public final J()Landroid/webkit/WebViewClient;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->J()Landroid/webkit/WebViewClient;

    move-result-object v0

    return-object v0
.end method

.method public final K()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/i;->K()V

    return-void
.end method

.method public final L()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->L()Z

    move-result v0

    return v0
.end method

.method public final M()Lcom/google/android/gms/ads/internal/overlay/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->M()Lcom/google/android/gms/ads/internal/overlay/c;

    move-result-object v0

    return-object v0
.end method

.method public final N()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->N()V

    return-void
.end method

.method public final P()Lcom/google/android/gms/internal/ads/ju;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v0

    return-object v0
.end method

.method public final Q()V
    .locals 4

    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ik;->b()Landroid/content/res/Resources;

    move-result-object v1

    if-eqz v1, :cond_0

    sget v2, Lcom/google/android/gms/ads/u/a;->s7:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "Test Ad"

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const v2, -0xbbbbbc

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v2, 0x41000000    # 8.0f

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x31

    const/4 v3, -0x2

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p0, v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->bringChildToFront(Landroid/view/View;)V

    return-void
.end method

.method public final a()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->a()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {p1, p0, p2, p3, p4}, Lcom/google/android/gms/internal/ads/ws;->a(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lb/c/b/a/d/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->a(Lb/c/b/a/d/a;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/internal/overlay/c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/ads/internal/overlay/c;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/internal/overlay/d;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/du;->a(Lcom/google/android/gms/ads/internal/overlay/d;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/hh2;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/fh2;->a(Lcom/google/android/gms/internal/ads/hh2;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/j1;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/j1;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/k1;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/k1;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/lu;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/lu;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/pi2;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/pi2;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rt;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/rt;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/c8;->a(Ljava/lang/String;)V

    return-void
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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ws;->a(Ljava/lang/String;Lcom/google/android/gms/common/util/m;)V

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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ws;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/wr;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ws;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/wr;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/ws;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/e7;->a(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/e7;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/gq;->a(Z)V

    return-void
.end method

.method public final a(ZI)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/du;->a(ZI)V

    return-void
.end method

.method public final a(ZILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/du;->a(ZILjava/lang/String;)V

    return-void
.end method

.method public final a(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/du;->a(ZILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(ZJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/gq;->a(ZJ)V

    return-void
.end method

.method public final b()Lcom/google/android/gms/internal/ads/fo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->b()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v0

    return-object v0
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->b(I)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/ads/internal/overlay/c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->b(Lcom/google/android/gms/ads/internal/overlay/c;)V

    return-void
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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ws;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/c8;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final b(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->b(Z)V

    return-void
.end method

.method public final b(ZI)Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->i0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ws;->b(ZI)Z

    move-result p1

    return p1
.end method

.method public final c()Lcom/google/android/gms/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->c()Lcom/google/android/gms/ads/internal/a;

    move-result-object v0

    return-object v0
.end method

.method public final c(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->c(Landroid/content/Context;)V

    return-void
.end method

.method public final c(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->c(Z)V

    return-void
.end method

.method public final d()Lcom/google/android/gms/internal/ads/eq1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->d()Lcom/google/android/gms/internal/ads/eq1;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/wr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/gq;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/wr;

    move-result-object p1

    return-object p1
.end method

.method public final destroy()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ht;->A()Lb/c/b/a/d/a;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v2, Lcom/google/android/gms/internal/ads/kt;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/kt;-><init>(Lb/c/b/a/d/a;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object v0, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/jt;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/jt;-><init>(Lcom/google/android/gms/internal/ads/ht;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/zr2;->n2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->destroy()V

    return-void
.end method

.method public final e(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->e(Z)V

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->e()Z

    move-result v0

    return v0
.end method

.method public final f()Lcom/google/android/gms/internal/ads/lu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v0

    return-object v0
.end method

.method public final f(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->f(Z)V

    return-void
.end method

.method public final g()Lcom/google/android/gms/internal/ads/p;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->g()Lcom/google/android/gms/internal/ads/p;

    move-result-object v0

    return-object v0
.end method

.method public final g(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->g(Z)V

    return-void
.end method

.method public final getRequestId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gq;->getRequestId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public final getWebView()Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->h()Z

    move-result v0

    return v0
.end method

.method public final i()Lcom/google/android/gms/internal/ads/rt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->i()Lcom/google/android/gms/internal/ads/rt;

    move-result-object v0

    return-object v0
.end method

.method public final j()I
    .locals 1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredWidth()I

    move-result v0

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->k()Z

    move-result v0

    return v0
.end method

.method public final l()Lcom/google/android/gms/internal/ads/zp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->c:Lcom/google/android/gms/internal/ads/zp;

    return-object v0
.end method

.method public final loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/ws;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/ws;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final loadUrl(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public final m()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->c:Lcom/google/android/gms/internal/ads/zp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zp;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->m()V

    return-void
.end method

.method public final n()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->n()V

    return-void
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->o()V

    return-void
.end method

.method public final onPause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->c:Lcom/google/android/gms/internal/ads/zp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zp;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->onResume()V

    return-void
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/i;->p()V

    return-void
.end method

.method public final q()Lcom/google/android/gms/ads/internal/overlay/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->q()Lcom/google/android/gms/ads/internal/overlay/c;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/google/android/gms/internal/ads/pi2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->r()Lcom/google/android/gms/internal/ads/pi2;

    move-result-object v0

    return-object v0
.end method

.method public final s()I
    .locals 1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result v0

    return v0
.end method

.method public final setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public final setRequestedOrientation(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->setRequestedOrientation(I)V

    return-void
.end method

.method public final setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method public final setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->u()Z

    move-result v0

    return v0
.end method

.method public final v()Lcom/google/android/gms/internal/ads/k1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->v()Lcom/google/android/gms/internal/ads/k1;

    move-result-object v0

    return-object v0
.end method

.method public final w()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gq;->w()V

    return-void
.end method

.method public final x()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->x()V

    return-void
.end method

.method public final y()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ht;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
