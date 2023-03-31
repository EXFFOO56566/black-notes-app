.class public final Lcom/google/android/gms/internal/ads/bc;
.super Lcom/google/android/gms/internal/ads/kb;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/ads/mediation/w;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/mediation/w;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/kb;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    return-void
.end method


# virtual methods
.method public final C()Lb/c/b/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->a()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v0

    return-object v0
.end method

.method public final E()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->m()Z

    move-result v0

    return v0
.end method

.method public final F()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->l()Z

    move-result v0

    return v0
.end method

.method public final L0()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->k()F

    move-result v0

    return v0
.end method

.method public final a(Lb/c/b/a/d/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/mediation/w;->b(Landroid/view/View;)V

    return-void
.end method

.method public final a(Lb/c/b/a/d/a;Lb/c/b/a/d/a;Lb/c/b/a/d/a;)V
    .locals 1

    invoke-static {p2}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/HashMap;

    invoke-static {p3}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/HashMap;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/ads/mediation/w;->a(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lb/c/b/a/d/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/mediation/w;->a(Landroid/view/View;)V

    return-void
.end method

.method public final c()Lb/c/b/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->u()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/o1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->g()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final g1()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->e()F

    move-result v0

    return v0
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/ads/rp2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->q()Lcom/google/android/gms/ads/p;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->q()Lcom/google/android/gms/ads/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/p;->a()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 11

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->j()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/s/c$b;

    new-instance v10, Lcom/google/android/gms/internal/ads/i1;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/s/c$b;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/gms/ads/s/c$b;->d()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v2}, Lcom/google/android/gms/ads/s/c$b;->c()D

    move-result-wide v6

    invoke-virtual {v2}, Lcom/google/android/gms/ads/s/c$b;->e()I

    move-result v8

    invoke-virtual {v2}, Lcom/google/android/gms/ads/s/c$b;->b()I

    move-result v9

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/i1;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;DII)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->s()V

    return-void
.end method

.method public final k()D
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->o()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->o()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    return-wide v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->p()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final r1()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->f()F

    move-result v0

    return v0
.end method

.method public final t()Lcom/google/android/gms/internal/ads/v1;
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->i()Lcom/google/android/gms/ads/s/c$b;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v8, Lcom/google/android/gms/internal/ads/i1;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/s/c$b;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/ads/s/c$b;->d()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/ads/s/c$b;->c()D

    move-result-wide v4

    invoke-virtual {v0}, Lcom/google/android/gms/ads/s/c$b;->e()I

    move-result v6

    invoke-virtual {v0}, Lcom/google/android/gms/ads/s/c$b;->b()I

    move-result v7

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/i1;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;DII)V

    return-object v8

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final w()Lb/c/b/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bc;->b:Lcom/google/android/gms/ads/mediation/w;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/w;->t()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v0

    return-object v0
.end method
