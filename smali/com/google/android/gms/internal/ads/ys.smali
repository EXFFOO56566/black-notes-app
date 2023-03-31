.class final synthetic Lcom/google/android/gms/internal/ads/ys;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/vs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/vs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->b:Lcom/google/android/gms/internal/ads/vs;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->b:Lcom/google/android/gms/internal/ads/vs;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/vs;->a:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->N()V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/vs;->a:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->M()Lcom/google/android/gms/ads/internal/overlay/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/c;->d2()V

    :cond_0
    return-void
.end method
