.class public Lcom/google/android/gms/ads/internal/ClientApi;
.super Lcom/google/android/gms/internal/ads/ro2;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ro2;-><init>()V

    return-void
.end method


# virtual methods
.method public final I(Lb/c/b/a/d/a;)Lcom/google/android/gms/internal/ads/vo2;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;I)Lcom/google/android/gms/internal/ads/eo2;
    .locals 4

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/internal/ads/fo;

    const v1, 0xbfb13e0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, p4, v2, v3}, Lcom/google/android/gms/internal/ads/fo;-><init>(IIZZ)V

    new-instance p4, Lcom/google/android/gms/ads/internal/l;

    invoke-direct {p4, p1, p2, p3, v0}, Lcom/google/android/gms/ads/internal/l;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/fo;)V

    return-object p4
.end method

.method public final a(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/eo2;
    .locals 0

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p4, p5}, Lcom/google/android/gms/internal/ads/kv;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/kv;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/kv;->j()Lcom/google/android/gms/internal/ads/fa1;

    move-result-object p2

    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/fa1;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/fa1;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/fa1;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/fa1;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/fa1;->a()Lcom/google/android/gms/internal/ads/ca1;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ca1;->a()Lcom/google/android/gms/internal/ads/w91;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/bh;
    .locals 0

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/kv;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/kv;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/kv;->n()Lcom/google/android/gms/internal/ads/zc1;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zc1;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zc1;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zc1;->a()Lcom/google/android/gms/internal/ads/ad1;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ad1;->a()Lcom/google/android/gms/internal/ads/cd1;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/eo2;
    .locals 0

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p4, p5}, Lcom/google/android/gms/internal/ads/kv;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/kv;

    move-result-object p4

    new-instance p5, Lcom/google/android/gms/internal/ads/xz0;

    invoke-direct {p5, p4, p1, p2, p3}, Lcom/google/android/gms/internal/ads/xz0;-><init>(Lcom/google/android/gms/internal/ads/kv;Landroid/content/Context;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;)V

    return-object p5
.end method

.method public final b(Lb/c/b/a/d/a;Lb/c/b/a/d/a;Lb/c/b/a/d/a;)Lcom/google/android/gms/internal/ads/h2;
    .locals 1

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p2}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/HashMap;

    invoke-static {p3}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/HashMap;

    new-instance v0, Lcom/google/android/gms/internal/ads/bg0;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/bg0;-><init>(Landroid/view/View;Ljava/util/HashMap;Ljava/util/HashMap;)V

    return-object v0
.end method

.method public final b(Lb/c/b/a/d/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/xn2;
    .locals 0

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p3, p4}, Lcom/google/android/gms/internal/ads/kv;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/kv;

    move-result-object p3

    new-instance p4, Lcom/google/android/gms/internal/ads/mz0;

    invoke-direct {p4, p3, p1, p2}, Lcom/google/android/gms/internal/ads/mz0;-><init>(Lcom/google/android/gms/internal/ads/kv;Landroid/content/Context;Ljava/lang/String;)V

    return-object p4
.end method

.method public final c(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/eo2;
    .locals 0

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p4, p5}, Lcom/google/android/gms/internal/ads/kv;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/kv;

    move-result-object p4

    new-instance p5, Lcom/google/android/gms/internal/ads/oz0;

    invoke-direct {p5, p4, p1, p2, p3}, Lcom/google/android/gms/internal/ads/oz0;-><init>(Lcom/google/android/gms/internal/ads/kv;Landroid/content/Context;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;)V

    return-object p5
.end method

.method public final c(Lb/c/b/a/d/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/xh;
    .locals 0

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p3, p4}, Lcom/google/android/gms/internal/ads/kv;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/kv;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/kv;->n()Lcom/google/android/gms/internal/ads/zc1;

    move-result-object p3

    invoke-interface {p3, p1}, Lcom/google/android/gms/internal/ads/zc1;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zc1;

    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zc1;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zc1;

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zc1;->a()Lcom/google/android/gms/internal/ads/ad1;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ad1;->b()Lcom/google/android/gms/internal/ads/wc1;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lb/c/b/a/d/a;I)Lcom/google/android/gms/internal/ads/vo2;
    .locals 0

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/kv;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/kv;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/kv;->g()Lcom/google/android/gms/internal/ads/ox;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lb/c/b/a/d/a;Lb/c/b/a/d/a;)Lcom/google/android/gms/internal/ads/z1;
    .locals 2

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    invoke-static {p2}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    new-instance v0, Lcom/google/android/gms/internal/ads/eg0;

    const v1, 0xbfb13e0

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/eg0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;I)V

    return-object v0
.end method

.method public final g(Lb/c/b/a/d/a;)Lcom/google/android/gms/internal/ads/be;
    .locals 3

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->a(Landroid/content/Intent;)Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/r;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/r;-><init>(Landroid/app/Activity;)V

    return-object v0

    :cond_0
    iget v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->l:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/r;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/r;-><init>(Landroid/app/Activity;)V

    return-object v0

    :cond_1
    new-instance v1, Lcom/google/android/gms/ads/internal/overlay/u;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/ads/internal/overlay/u;-><init>(Landroid/app/Activity;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-object v1

    :cond_2
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/z;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/z;-><init>(Landroid/app/Activity;)V

    return-object v0

    :cond_3
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/x;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/x;-><init>(Landroid/app/Activity;)V

    return-object v0

    :cond_4
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/s;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/s;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method public final w(Lb/c/b/a/d/a;)Lcom/google/android/gms/internal/ads/me;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
