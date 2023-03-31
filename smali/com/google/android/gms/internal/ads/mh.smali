.class public final Lcom/google/android/gms/internal/ads/mh;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/x/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/bh;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/lh;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/lh;-><init>(Lcom/google/android/gms/ads/x/d;)V

    if-nez p2, :cond_0

    new-instance p2, Lcom/google/android/gms/internal/ads/wq2;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/wq2;-><init>()V

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    return-void
.end method
