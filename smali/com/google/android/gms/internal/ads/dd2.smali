.class final Lcom/google/android/gms/internal/ads/dd2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/ad2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ad2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dd2;->b:Lcom/google/android/gms/internal/ads/ad2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dd2;->b:Lcom/google/android/gms/internal/ads/ad2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ad2;->b(Lcom/google/android/gms/internal/ads/ad2;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dd2;->b:Lcom/google/android/gms/internal/ads/ad2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ad2;->c(Lcom/google/android/gms/internal/ads/ad2;)Lcom/google/android/gms/internal/ads/kd2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dd2;->b:Lcom/google/android/gms/internal/ads/ad2;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/yd2;->a(Lcom/google/android/gms/internal/ads/zd2;)V

    :cond_0
    return-void
.end method
