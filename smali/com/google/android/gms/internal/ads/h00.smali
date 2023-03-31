.class public final Lcom/google/android/gms/internal/ads/h00;
.super Lcom/google/android/gms/internal/ads/k20;
.source ""


# instance fields
.field private final g:Landroid/view/View;

.field private final h:Lcom/google/android/gms/internal/ads/ws;

.field private final i:Lcom/google/android/gms/internal/ads/hd1;

.field private final j:I

.field private final k:Z

.field private final l:Z

.field private m:Lcom/google/android/gms/internal/ads/wi2;

.field private final n:Lcom/google/android/gms/internal/ads/yz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/n20;Landroid/view/View;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/hd1;IZZLcom/google/android/gms/internal/ads/yz;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/k20;-><init>(Lcom/google/android/gms/internal/ads/n20;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/h00;->g:Landroid/view/View;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/h00;->h:Lcom/google/android/gms/internal/ads/ws;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/h00;->i:Lcom/google/android/gms/internal/ads/hd1;

    iput p5, p0, Lcom/google/android/gms/internal/ads/h00;->j:I

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ads/h00;->k:Z

    iput-boolean p7, p0, Lcom/google/android/gms/internal/ads/h00;->l:Z

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/h00;->n:Lcom/google/android/gms/internal/ads/yz;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h00;->n:Lcom/google/android/gms/internal/ads/yz;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/yz;->a(J)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/pi2;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h00;->h:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/pi2;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/wi2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/h00;->m:Lcom/google/android/gms/internal/ads/wi2;

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h00;->h:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h00;->h:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ju;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/h00;->j:I

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/h00;->k:Z

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/h00;->l:Z

    return v0
.end method

.method public final j()Lcom/google/android/gms/internal/ads/hd1;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k20;->b:Lcom/google/android/gms/internal/ads/id1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/id1;->o:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/h00;->i:Lcom/google/android/gms/internal/ads/hd1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/ce1;->a(Ljava/util/List;Lcom/google/android/gms/internal/ads/hd1;)Lcom/google/android/gms/internal/ads/hd1;

    move-result-object v0

    return-object v0
.end method

.method public final k()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h00;->g:Landroid/view/View;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h00;->h:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final m()Lcom/google/android/gms/internal/ads/wi2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h00;->m:Lcom/google/android/gms/internal/ads/wi2;

    return-object v0
.end method
