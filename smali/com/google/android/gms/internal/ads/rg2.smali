.class public final Lcom/google/android/gms/internal/ads/rg2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/sk1;

.field private final b:Lcom/google/android/gms/internal/ads/sg2;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/sk1;Lcom/google/android/gms/internal/ads/sg2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mf2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/sk1;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rg2;->a:Lcom/google/android/gms/internal/ads/sk1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/rg2;->b:Lcom/google/android/gms/internal/ads/sg2;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/rg2;)Lcom/google/android/gms/internal/ads/sg2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/rg2;->b:Lcom/google/android/gms/internal/ads/sg2;

    return-object p0
.end method


# virtual methods
.method public final a(IIIF)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->b:Lcom/google/android/gms/internal/ads/sg2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->a:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v7, Lcom/google/android/gms/internal/ads/yg2;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/yg2;-><init>(Lcom/google/android/gms/internal/ads/rg2;IIIF)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final a(IJ)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->b:Lcom/google/android/gms/internal/ads/sg2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->a:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/vg2;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/vg2;-><init>(Lcom/google/android/gms/internal/ads/rg2;IJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final a(Landroid/view/Surface;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->b:Lcom/google/android/gms/internal/ads/sg2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->a:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/xg2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/xg2;-><init>(Lcom/google/android/gms/internal/ads/rg2;Landroid/view/Surface;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/e82;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->b:Lcom/google/android/gms/internal/ads/sg2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->a:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/wg2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/wg2;-><init>(Lcom/google/android/gms/internal/ads/rg2;Lcom/google/android/gms/internal/ads/e82;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/y92;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->b:Lcom/google/android/gms/internal/ads/sg2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->a:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/ug2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/ug2;-><init>(Lcom/google/android/gms/internal/ads/rg2;Lcom/google/android/gms/internal/ads/y92;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->b:Lcom/google/android/gms/internal/ads/sg2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->a:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v8, Lcom/google/android/gms/internal/ads/tg2;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/tg2;-><init>(Lcom/google/android/gms/internal/ads/rg2;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/y92;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->b:Lcom/google/android/gms/internal/ads/sg2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rg2;->a:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/zg2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zg2;-><init>(Lcom/google/android/gms/internal/ads/rg2;Lcom/google/android/gms/internal/ads/y92;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
