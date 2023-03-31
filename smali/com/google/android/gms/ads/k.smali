.class public Lcom/google/android/gms/ads/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/k$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0, v0}, Lcom/google/android/gms/ads/k;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/k$a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/k$a;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/ads/cq2;->c()Lcom/google/android/gms/internal/ads/cq2;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p0, p1, v0}, Lcom/google/android/gms/internal/ads/cq2;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/v/c;)V

    return-void
.end method
