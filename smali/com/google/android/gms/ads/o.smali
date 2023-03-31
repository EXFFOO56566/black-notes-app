.class public final Lcom/google/android/gms/ads/o;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/mp2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/mp2;)Lcom/google/android/gms/ads/o;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/o;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/o;-><init>(Lcom/google/android/gms/internal/ads/mp2;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
