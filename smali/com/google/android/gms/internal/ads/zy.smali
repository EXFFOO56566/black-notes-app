.class final synthetic Lcom/google/android/gms/internal/ads/zy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/az;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/az;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zy;->b:Lcom/google/android/gms/internal/ads/az;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zy;->b:Lcom/google/android/gms/internal/ads/az;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/az;->a:Lcom/google/android/gms/internal/ads/vy;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vy;->b(Lcom/google/android/gms/internal/ads/vy;)Lcom/google/android/gms/internal/ads/ez;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ez;->l()V

    return-void
.end method
