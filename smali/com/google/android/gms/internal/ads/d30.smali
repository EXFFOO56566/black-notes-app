.class public final Lcom/google/android/gms/internal/ads/d30;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/vd1;

.field private final b:Lcom/google/android/gms/internal/ads/id1;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d30;->a:Lcom/google/android/gms/internal/ads/vd1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/d30;->b:Lcom/google/android/gms/internal/ads/id1;

    if-nez p3, :cond_0

    const-string p3, "com.google.ads.mediation.admob.AdMobAdapter"

    :cond_0
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/d30;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/vd1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d30;->a:Lcom/google/android/gms/internal/ads/vd1;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/ads/id1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d30;->b:Lcom/google/android/gms/internal/ads/id1;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d30;->c:Ljava/lang/String;

    return-object v0
.end method
