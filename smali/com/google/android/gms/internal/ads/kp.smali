.class final Lcom/google/android/gms/internal/ads/kp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:I

.field private final synthetic c:I

.field private final synthetic d:Lcom/google/android/gms/internal/ads/dp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/dp;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kp;->d:Lcom/google/android/gms/internal/ads/dp;

    iput p2, p0, Lcom/google/android/gms/internal/ads/kp;->b:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/kp;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kp;->d:Lcom/google/android/gms/internal/ads/dp;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/dp;->a(Lcom/google/android/gms/internal/ads/dp;)Lcom/google/android/gms/internal/ads/op;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kp;->d:Lcom/google/android/gms/internal/ads/dp;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/dp;->a(Lcom/google/android/gms/internal/ads/dp;)Lcom/google/android/gms/internal/ads/op;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/kp;->b:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/kp;->c:I

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/op;->a(II)V

    :cond_0
    return-void
.end method
