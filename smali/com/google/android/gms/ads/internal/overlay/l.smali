.class final Lcom/google/android/gms/ads/internal/overlay/l;
.super Lcom/google/android/gms/internal/ads/sk;
.source ""


# instance fields
.field final synthetic c:Lcom/google/android/gms/ads/internal/overlay/c;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/ads/internal/overlay/c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/l;->c:Lcom/google/android/gms/ads/internal/overlay/c;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sk;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/ads/internal/overlay/c;Lcom/google/android/gms/ads/internal/overlay/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/overlay/l;-><init>(Lcom/google/android/gms/ads/internal/overlay/c;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->v()Lcom/google/android/gms/internal/ads/cn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/l;->c:Lcom/google/android/gms/ads/internal/overlay/c;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    iget v1, v1, Lcom/google/android/gms/ads/internal/g;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/cn;->a(Ljava/lang/Integer;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/overlay/l;->c:Lcom/google/android/gms/ads/internal/overlay/c;

    iget-object v3, v2, Lcom/google/android/gms/ads/internal/overlay/c;->b:Landroid/app/Activity;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/overlay/c;->c:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    iget-boolean v4, v2, Lcom/google/android/gms/ads/internal/g;->e:Z

    iget v2, v2, Lcom/google/android/gms/ads/internal/g;->f:F

    invoke-virtual {v1, v3, v0, v4, v2}, Lcom/google/android/gms/internal/ads/ll;->a(Landroid/content/Context;Landroid/graphics/Bitmap;ZF)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v2, Lcom/google/android/gms/ads/internal/overlay/k;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/ads/internal/overlay/k;-><init>(Lcom/google/android/gms/ads/internal/overlay/l;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
