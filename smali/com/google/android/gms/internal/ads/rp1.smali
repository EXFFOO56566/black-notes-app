.class public final Lcom/google/android/gms/internal/ads/rp1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/yu1;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/yu1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rp1;->a:Lcom/google/android/gms/internal/ads/yu1;

    return-void
.end method

.method static final a(Lcom/google/android/gms/internal/ads/yu1;)Lcom/google/android/gms/internal/ads/rp1;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yu1;->r()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/rp1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/rp1;-><init>(Lcom/google/android/gms/internal/ads/yu1;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method final a()Lcom/google/android/gms/internal/ads/yu1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rp1;->a:Lcom/google/android/gms/internal/ads/yu1;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rp1;->a:Lcom/google/android/gms/internal/ads/yu1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/jq1;->a(Lcom/google/android/gms/internal/ads/yu1;)Lcom/google/android/gms/internal/ads/zu1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
