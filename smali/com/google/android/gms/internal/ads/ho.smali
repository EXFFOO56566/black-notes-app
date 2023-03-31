.class public final Lcom/google/android/gms/internal/ads/ho;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/hm2;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/a9;

    new-instance v1, Lcom/google/android/gms/internal/ads/rh;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/rh;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/a9;-><init>(Lcom/google/android/gms/internal/ads/d6;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v1, Lcom/google/android/gms/internal/ads/fn;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/fn;-><init>(Landroid/content/Context;)V

    new-instance p0, Lcom/google/android/gms/internal/ads/hm2;

    new-instance v2, Lcom/google/android/gms/internal/ads/ba;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/ba;-><init>(Lcom/google/android/gms/internal/ads/ud;)V

    invoke-direct {p0, v2, v0}, Lcom/google/android/gms/internal/ads/hm2;-><init>(Lcom/google/android/gms/internal/ads/a;Lcom/google/android/gms/internal/ads/de2;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/hm2;->a()V

    return-object p0
.end method
