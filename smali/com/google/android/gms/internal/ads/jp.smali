.class final Lcom/google/android/gms/internal/ads/jp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/dp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/dp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jp;->b:Lcom/google/android/gms/internal/ads/dp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jp;->b:Lcom/google/android/gms/internal/ads/dp;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/dp;->a(Lcom/google/android/gms/internal/ads/dp;)Lcom/google/android/gms/internal/ads/op;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jp;->b:Lcom/google/android/gms/internal/ads/dp;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/dp;->a(Lcom/google/android/gms/internal/ads/dp;)Lcom/google/android/gms/internal/ads/op;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/op;->c()V

    :cond_0
    return-void
.end method
