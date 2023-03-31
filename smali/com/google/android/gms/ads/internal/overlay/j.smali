.class final Lcom/google/android/gms/ads/internal/overlay/j;
.super Landroid/widget/RelativeLayout;
.source ""


# instance fields
.field private b:Lcom/google/android/gms/internal/ads/xl;

.field c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/xl;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/xl;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/j;->b:Lcom/google/android/gms/internal/ads/xl;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/xl;->b(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/overlay/j;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/j;->b:Lcom/google/android/gms/internal/ads/xl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/xl;->a(Landroid/view/MotionEvent;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
