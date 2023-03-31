.class final Lcom/google/android/gms/internal/ads/hg0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/k1;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/xg0;

.field private final synthetic b:Landroid/view/ViewGroup;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/gg0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gg0;Lcom/google/android/gms/internal/ads/xg0;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hg0;->c:Lcom/google/android/gms/internal/ads/gg0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hg0;->a:Lcom/google/android/gms/internal/ads/xg0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/hg0;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hg0;->c:Lcom/google/android/gms/internal/ads/gg0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hg0;->a:Lcom/google/android/gms/internal/ads/xg0;

    sget-object v2, Lcom/google/android/gms/internal/ads/eg0;->o:[Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/gg0;->a(Lcom/google/android/gms/internal/ads/gg0;Lcom/google/android/gms/internal/ads/xg0;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hg0;->a:Lcom/google/android/gms/internal/ads/xg0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hg0;->b:Landroid/view/ViewGroup;

    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final a(Landroid/view/MotionEvent;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hg0;->a:Lcom/google/android/gms/internal/ads/xg0;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    return-void
.end method
