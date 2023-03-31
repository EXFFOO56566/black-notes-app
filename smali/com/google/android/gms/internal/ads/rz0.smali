.class final Lcom/google/android/gms/internal/ads/rz0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "Lcom/google/android/gms/internal/ads/n00;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/k10;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/oz0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/oz0;Lcom/google/android/gms/internal/ads/k10;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/rz0;->a:Lcom/google/android/gms/internal/ads/k10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    check-cast p1, Lcom/google/android/gms/internal/ads/n00;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/oz0;->a(Lcom/google/android/gms/internal/ads/oz0;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/lo1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/oz0;->a(Lcom/google/android/gms/internal/ads/oz0;)Lcom/google/android/gms/internal/ads/n00;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/oz0;->a(Lcom/google/android/gms/internal/ads/oz0;)Lcom/google/android/gms/internal/ads/n00;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/k20;->a()V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/oz0;->a(Lcom/google/android/gms/internal/ads/oz0;Lcom/google/android/gms/internal/ads/n00;)Lcom/google/android/gms/internal/ads/n00;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/oz0;->b(Lcom/google/android/gms/internal/ads/oz0;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/n00;->h()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/n00;->h()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/oz0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x4e

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Banner view provided from "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " already has a parent view. Removing its old parent."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/n00;->h()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/oz0;->b(Lcom/google/android/gms/internal/ads/oz0;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/n00;->h()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/k20;->b()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/oz0;->c(Lcom/google/android/gms/internal/ads/oz0;)Lcom/google/android/gms/internal/ads/e80;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/n00;->j()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/e80;->c(I)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/oz0;->a(Lcom/google/android/gms/internal/ads/oz0;Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/lo1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rz0;->a:Lcom/google/android/gms/internal/ads/k10;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/k10;->b()Lcom/google/android/gms/internal/ads/y50;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/gp0;->a(Ljava/lang/Throwable;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/y50;->a(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rz0;->b:Lcom/google/android/gms/internal/ads/oz0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/oz0;->c(Lcom/google/android/gms/internal/ads/oz0;)Lcom/google/android/gms/internal/ads/e80;

    move-result-object v1

    const/16 v2, 0x3c

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/e80;->c(I)V

    const-string v1, "BannerAdManagerShim.onFailure"

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/ie1;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
