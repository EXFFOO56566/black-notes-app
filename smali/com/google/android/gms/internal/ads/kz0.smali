.class public final Lcom/google/android/gms/internal/ads/kz0;
.super Lcom/google/android/gms/internal/ads/do2;
.source ""


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/rn2;

.field private final d:Lcom/google/android/gms/internal/ads/zd1;

.field private final e:Lcom/google/android/gms/internal/ads/n00;

.field private final f:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/rn2;Lcom/google/android/gms/internal/ads/zd1;Lcom/google/android/gms/internal/ads/n00;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/do2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kz0;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/kz0;->c:Lcom/google/android/gms/internal/ads/rn2;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/kz0;->d:Lcom/google/android/gms/internal/ads/zd1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    new-instance p1, Landroid/widget/FrameLayout;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/kz0;->b:Landroid/content/Context;

    invoke-direct {p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n00;->h()Landroid/view/View;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/ll;->b()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kz0;->Z1()Lcom/google/android/gms/internal/ads/um2;

    move-result-object p2

    iget p2, p2, Lcom/google/android/gms/internal/ads/um2;->d:I

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setMinimumHeight(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kz0;->Z1()Lcom/google/android/gms/internal/ads/um2;

    move-result-object p2

    iget p2, p2, Lcom/google/android/gms/internal/ads/um2;->g:I

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setMinimumWidth(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kz0;->f:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final D()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final D1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->d:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zd1;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final E1()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/n00;->k()V

    return-void
.end method

.method public final S0()Lcom/google/android/gms/internal/ads/no2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->d:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zd1;->m:Lcom/google/android/gms/internal/ads/no2;

    return-object v0
.end method

.method public final V()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->d()Lcom/google/android/gms/internal/ads/p50;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->d()Lcom/google/android/gms/internal/ads/p50;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p50;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final Z1()Lcom/google/android/gms/internal/ads/um2;
    .locals 2

    const-string v0, "getAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/n00;->g()Lcom/google/android/gms/internal/ads/hd1;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/ce1;->a(Landroid/content/Context;Ljava/util/List;)Lcom/google/android/gms/internal/ads/um2;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->d()Lcom/google/android/gms/internal/ads/p50;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->d()Lcom/google/android/gms/internal/ads/p50;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p50;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/bn2;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/eh;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/er2;)V
    .locals 0

    const-string p1, "setVideoOptions is not supported in Publisher AdView returned by AdLoader."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/io2;)V
    .locals 0

    const-string p1, "setAdMetadataListener is not supported in Publisher AdView returned by AdLoader."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/le;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/lp2;)V
    .locals 0

    const-string p1, "setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/no2;)V
    .locals 0

    const-string p1, "setAppEventListener is not supported in Publisher AdView returned by AdLoader."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/qn2;)V
    .locals 0

    const-string p1, "setAdClickListener is not supported in Publisher AdView returned by AdLoader."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/re;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rn2;)V
    .locals 0

    const-string p1, "setAdListener is not supported in Publisher AdView returned by AdLoader."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ti2;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/u;)V
    .locals 0

    const-string p1, "setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/um2;)V
    .locals 2

    const-string v0, "setAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kz0;->f:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/n00;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ads/um2;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/xp2;)V
    .locals 0

    return-void
.end method

.method public final a(Z)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rm2;)Z
    .locals 0

    const-string p1, "loadAd is not supported for a Publisher AdView returned from AdLoader."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/to2;)V
    .locals 0

    const-string p1, "setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final c(Z)V
    .locals 0

    const-string p1, "setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final destroy()V
    .locals 1

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->a()V

    return-void
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/ads/rp2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/n00;->f()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lcom/google/android/gms/internal/ads/mp2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->d()Lcom/google/android/gms/internal/ads/p50;

    move-result-object v0

    return-object v0
.end method

.method public final m1()Lb/c/b/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->f:Landroid/view/ViewGroup;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v0

    return-object v0
.end method

.method public final p()V
    .locals 2

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->c()Lcom/google/android/gms/internal/ads/p60;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/p60;->a(Landroid/content/Context;)V

    return-void
.end method

.method public final s(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final showInterstitial()V
    .locals 0

    return-void
.end method

.method public final t1()Lcom/google/android/gms/internal/ads/rn2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->c:Lcom/google/android/gms/internal/ads/rn2;

    return-object v0
.end method

.method public final u()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final v()Landroid/os/Bundle;
    .locals 1

    const-string v0, "getAdMetadata is not supported in Publisher AdView returned by AdLoader."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final x0()V
    .locals 0

    return-void
.end method

.method public final z()V
    .locals 2

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kz0;->e:Lcom/google/android/gms/internal/ads/n00;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->c()Lcom/google/android/gms/internal/ads/p60;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/p60;->b(Landroid/content/Context;)V

    return-void
.end method
