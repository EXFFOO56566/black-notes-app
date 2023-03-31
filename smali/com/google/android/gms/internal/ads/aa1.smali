.class final Lcom/google/android/gms/internal/ads/aa1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/f01;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/f01<",
        "Lcom/google/android/gms/internal/ads/h00;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/w91;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/w91;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/w91;->l:Lcom/google/android/gms/internal/ads/h00;

    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/h00;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/w91;->l:Lcom/google/android/gms/internal/ads/h00;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k20;->a()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/w91;->l:Lcom/google/android/gms/internal/ads/h00;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/w91;->a(Lcom/google/android/gms/internal/ads/w91;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/w91;->a(Lcom/google/android/gms/internal/ads/w91;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/h00;->k()Landroid/view/View;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/ll;->b()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/h00;->h()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/w91;->b(Lcom/google/android/gms/internal/ads/w91;)Lcom/google/android/gms/internal/ads/fo;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/ads/fo;->d:I

    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->o2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_3

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/w91;->a(Lcom/google/android/gms/internal/ads/w91;Lcom/google/android/gms/internal/ads/h00;)Lcom/google/android/gms/ads/internal/overlay/q;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/w91;->d(Lcom/google/android/gms/internal/ads/h00;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/h00;->l()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/h00;->i()Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/internal/overlay/q;->a(Z)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/w91;->a(Lcom/google/android/gms/internal/ads/w91;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/w91;->b(Lcom/google/android/gms/internal/ads/w91;Lcom/google/android/gms/internal/ads/h00;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/w91;->a(Lcom/google/android/gms/internal/ads/w91;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/w91;->c(Lcom/google/android/gms/internal/ads/w91;)Lcom/google/android/gms/internal/ads/um2;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/internal/ads/um2;->d:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/w91;->a(Lcom/google/android/gms/internal/ads/w91;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/w91;->c(Lcom/google/android/gms/internal/ads/w91;)Lcom/google/android/gms/internal/ads/um2;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/internal/ads/um2;->g:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/w91;->d(Lcom/google/android/gms/internal/ads/w91;)Lcom/google/android/gms/internal/ads/ea1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/j00;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aa1;->a:Lcom/google/android/gms/internal/ads/w91;

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/internal/ads/j00;-><init>(Lcom/google/android/gms/internal/ads/h00;Lcom/google/android/gms/internal/ads/eo2;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ea1;->a(Lcom/google/android/gms/internal/ads/si2;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/k20;->b()V

    return-void
.end method
