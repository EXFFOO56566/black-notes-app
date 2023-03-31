.class public final Lcom/google/android/gms/internal/ads/ur1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public static a(Lcom/google/android/gms/internal/ads/rp1;Lcom/google/android/gms/internal/ads/lp1;)Lcom/google/android/gms/internal/ads/mp1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/rp1;",
            "Lcom/google/android/gms/internal/ads/lp1<",
            "Lcom/google/android/gms/internal/ads/mp1;",
            ">;)",
            "Lcom/google/android/gms/internal/ads/mp1;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Lcom/google/android/gms/internal/ads/tr1;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/tr1;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/aq1;)V

    const-class p1, Lcom/google/android/gms/internal/ads/mp1;

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/rp1;Lcom/google/android/gms/internal/ads/lp1;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/yp1;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/yp1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/mp1;

    return-object p0
.end method
