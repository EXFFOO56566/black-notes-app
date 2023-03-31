.class final synthetic Lcom/google/android/gms/internal/ads/xt0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/n60;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/ws;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ws;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xt0;->b:Lcom/google/android/gms/internal/ads/ws;

    return-void
.end method


# virtual methods
.method public final K()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xt0;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ju;->a()V

    :cond_0
    return-void
.end method
