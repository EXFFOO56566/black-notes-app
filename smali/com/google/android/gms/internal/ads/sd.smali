.class public final Lcom/google/android/gms/internal/ads/sd;
.super Lcom/google/android/gms/internal/ads/wd;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/d5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/wd;",
        "Lcom/google/android/gms/internal/ads/d5<",
        "Lcom/google/android/gms/internal/ads/ws;",
        ">;"
    }
.end annotation


# instance fields
.field private final c:Lcom/google/android/gms/internal/ads/ws;

.field private final d:Landroid/content/Context;

.field private final e:Landroid/view/WindowManager;

.field private final f:Lcom/google/android/gms/internal/ads/gr2;

.field private g:Landroid/util/DisplayMetrics;

.field private h:F

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ws;Landroid/content/Context;Lcom/google/android/gms/internal/ads/gr2;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/wd;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/sd;->i:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/sd;->j:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/sd;->l:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/sd;->m:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/sd;->n:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/sd;->o:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sd;->d:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/sd;->f:Lcom/google/android/gms/internal/ads/gr2;

    const-string p1, "window"

    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->e:Landroid/view/WindowManager;

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->d:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sd;->d:Landroid/content/Context;

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/gl;->b(Landroid/app/Activity;)[I

    move-result-object v0

    aget v1, v0, v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lu;->b()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getWidth()I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/ws;->getHeight()I

    move-result v2

    sget-object v3, Lcom/google/android/gms/internal/ads/zr2;->H:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez v0, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/ads/lu;->c:I

    :cond_2
    if-nez v2, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/internal/ads/lu;->b:I

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/sd;->d:Landroid/content/Context;

    invoke-virtual {v3, v4, v0}, Lcom/google/android/gms/internal/ads/sn;->a(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/sd;->n:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sd;->d:Landroid/content/Context;

    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/internal/ads/sn;->a(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/sd;->o:I

    :cond_4
    sub-int v0, p2, v1

    iget v1, p0, Lcom/google/android/gms/internal/ads/sd;->n:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/sd;->o:I

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/wd;->b(IIII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ju;->a(II)V

    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 8

    check-cast p1, Lcom/google/android/gms/internal/ads/ws;

    new-instance p1, Landroid/util/DisplayMetrics;

    invoke-direct {p1}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->g:Landroid/util/DisplayMetrics;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->e:Landroid/view/WindowManager;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/sd;->g:Landroid/util/DisplayMetrics;

    invoke-virtual {p1, p2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/sd;->g:Landroid/util/DisplayMetrics;

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/sd;->h:F

    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/sd;->k:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->g:Landroid/util/DisplayMetrics;

    iget p2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/util/DisplayMetrics;I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/sd;->i:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->g:Landroid/util/DisplayMetrics;

    iget p2, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/util/DisplayMetrics;I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/sd;->j:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->a()Landroid/app/Activity;

    move-result-object p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/gl;->c(Landroid/app/Activity;)[I

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sd;->g:Landroid/util/DisplayMetrics;

    aget v2, p1, v0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/util/DisplayMetrics;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/sd;->l:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sd;->g:Landroid/util/DisplayMetrics;

    aget p1, p1, p2

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/sn;->b(Landroid/util/DisplayMetrics;I)I

    move-result p1

    goto :goto_1

    :cond_1
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/ads/sd;->i:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/sd;->l:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/sd;->j:I

    :goto_1
    iput p1, p0, Lcom/google/android/gms/internal/ads/sd;->m:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lu;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/google/android/gms/internal/ads/sd;->i:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/sd;->n:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/sd;->j:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/sd;->o:I

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {p1, v0, v0}, Lcom/google/android/gms/internal/ads/ws;->measure(II)V

    :goto_2
    iget v2, p0, Lcom/google/android/gms/internal/ads/sd;->i:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/sd;->j:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/sd;->l:I

    iget v5, p0, Lcom/google/android/gms/internal/ads/sd;->m:I

    iget v6, p0, Lcom/google/android/gms/internal/ads/sd;->h:F

    iget v7, p0, Lcom/google/android/gms/internal/ads/sd;->k:I

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/wd;->a(IIIIFI)V

    new-instance p1, Lcom/google/android/gms/internal/ads/td;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/td;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sd;->f:Lcom/google/android/gms/internal/ads/gr2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gr2;->a()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/td;->b(Z)Lcom/google/android/gms/internal/ads/td;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sd;->f:Lcom/google/android/gms/internal/ads/gr2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gr2;->b()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/td;->a(Z)Lcom/google/android/gms/internal/ads/td;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sd;->f:Lcom/google/android/gms/internal/ads/gr2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gr2;->d()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/td;->c(Z)Lcom/google/android/gms/internal/ads/td;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sd;->f:Lcom/google/android/gms/internal/ads/gr2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gr2;->c()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/td;->d(Z)Lcom/google/android/gms/internal/ads/td;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/td;->e(Z)Lcom/google/android/gms/internal/ads/td;

    new-instance v1, Lcom/google/android/gms/internal/ads/rd;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/internal/ads/rd;-><init>(Lcom/google/android/gms/internal/ads/td;Lcom/google/android/gms/internal/ads/qd;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rd;->a()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "onDeviceFeaturesReceived"

    invoke-interface {p1, v2, v1}, Lcom/google/android/gms/internal/ads/e7;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    const/4 p1, 0x2

    new-array v1, p1, [I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/ws;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sd;->d:Landroid/content/Context;

    aget v0, v1, v0

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/ads/sn;->a(Landroid/content/Context;I)I

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sd;->d:Landroid/content/Context;

    aget p2, v1, p2

    invoke-virtual {v2, v3, p2}, Lcom/google/android/gms/internal/ads/sn;->a(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/ads/sd;->a(II)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->a(I)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "Dispatching Ready Event."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->b()Lcom/google/android/gms/internal/ads/fo;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/wd;->b(Ljava/lang/String;)V

    return-void
.end method
