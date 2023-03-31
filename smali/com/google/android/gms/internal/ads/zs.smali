.class final Lcom/google/android/gms/internal/ads/zs;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/vi;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/vs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/vs;Lcom/google/android/gms/internal/ads/vi;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zs;->c:Lcom/google/android/gms/internal/ads/vs;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zs;->b:Lcom/google/android/gms/internal/ads/vi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zs;->c:Lcom/google/android/gms/internal/ads/vs;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zs;->b:Lcom/google/android/gms/internal/ads/vi;

    const/16 v2, 0xa

    invoke-static {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/vs;->a(Lcom/google/android/gms/internal/ads/vs;Landroid/view/View;Lcom/google/android/gms/internal/ads/vi;I)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
