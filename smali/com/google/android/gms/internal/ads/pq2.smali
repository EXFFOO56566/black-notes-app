.class final Lcom/google/android/gms/internal/ads/pq2;
.super Lcom/google/android/gms/internal/ads/vn2;
.source ""


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/ads/nq2;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/nq2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pq2;->b:Lcom/google/android/gms/internal/ads/nq2;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/vn2;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/nq2;Lcom/google/android/gms/internal/ads/qq2;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/pq2;-><init>(Lcom/google/android/gms/internal/ads/nq2;)V

    return-void
.end method


# virtual methods
.method public final V()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rm2;I)V
    .locals 0

    const-string p1, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/sn;->b:Landroid/os/Handler;

    new-instance p2, Lcom/google/android/gms/internal/ads/sq2;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/sq2;-><init>(Lcom/google/android/gms/internal/ads/pq2;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/rm2;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/pq2;->a(Lcom/google/android/gms/internal/ads/rm2;I)V

    return-void
.end method

.method public final u()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
