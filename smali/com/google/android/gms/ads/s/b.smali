.class public Lcom/google/android/gms/ads/s/b;
.super Landroid/widget/FrameLayout;
.source ""


# instance fields
.field private b:Lcom/google/android/gms/ads/j;

.field private c:Z

.field private d:Lcom/google/android/gms/internal/ads/l1;

.field private e:Landroid/widget/ImageView$ScaleType;

.field private f:Z

.field private g:Lcom/google/android/gms/internal/ads/n1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected final declared-synchronized a(Lcom/google/android/gms/internal/ads/l1;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/s/b;->d:Lcom/google/android/gms/internal/ads/l1;

    iget-boolean v0, p0, Lcom/google/android/gms/ads/s/b;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/s/b;->b:Lcom/google/android/gms/ads/j;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/l1;->a(Lcom/google/android/gms/ads/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected final declared-synchronized a(Lcom/google/android/gms/internal/ads/n1;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/s/b;->g:Lcom/google/android/gms/internal/ads/n1;

    iget-boolean v0, p0, Lcom/google/android/gms/ads/s/b;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/s/b;->e:Landroid/widget/ImageView$ScaleType;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/n1;->a(Landroid/widget/ImageView$ScaleType;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setImageScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/s/b;->f:Z

    iput-object p1, p0, Lcom/google/android/gms/ads/s/b;->e:Landroid/widget/ImageView$ScaleType;

    iget-object v0, p0, Lcom/google/android/gms/ads/s/b;->g:Lcom/google/android/gms/internal/ads/n1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/n1;->a(Landroid/widget/ImageView$ScaleType;)V

    :cond_0
    return-void
.end method

.method public setMediaContent(Lcom/google/android/gms/ads/j;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/s/b;->c:Z

    iput-object p1, p0, Lcom/google/android/gms/ads/s/b;->b:Lcom/google/android/gms/ads/j;

    iget-object v0, p0, Lcom/google/android/gms/ads/s/b;->d:Lcom/google/android/gms/internal/ads/l1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/l1;->a(Lcom/google/android/gms/ads/j;)V

    :cond_0
    return-void
.end method
