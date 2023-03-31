.class public final Lcom/google/android/gms/ads/AdView;
.super Lcom/google/android/gms/ads/g;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/ads/g;-><init>(Landroid/content/Context;I)V

    const-string v0, "Context cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/ads/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/ads/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic getAdListener()Lcom/google/android/gms/ads/b;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/g;->getAdListener()Lcom/google/android/gms/ads/b;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getAdSize()Lcom/google/android/gms/ads/e;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/g;->getAdSize()Lcom/google/android/gms/ads/e;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getAdUnitId()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/g;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getMediationAdapterClassName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0}, Lcom/google/android/gms/ads/g;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getResponseInfo()Lcom/google/android/gms/ads/o;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/g;->getResponseInfo()Lcom/google/android/gms/ads/o;

    move-result-object v0

    return-object v0
.end method

.method public final getVideoController()Lcom/google/android/gms/ads/p;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bq2;->j()Lcom/google/android/gms/ads/p;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic setAdListener(Lcom/google/android/gms/ads/b;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/g;->setAdListener(Lcom/google/android/gms/ads/b;)V

    return-void
.end method

.method public final bridge synthetic setAdSize(Lcom/google/android/gms/ads/e;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/g;->setAdSize(Lcom/google/android/gms/ads/e;)V

    return-void
.end method

.method public final bridge synthetic setAdUnitId(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/g;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic setOnPaidEventListener(Lcom/google/android/gms/ads/l;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/g;->setOnPaidEventListener(Lcom/google/android/gms/ads/l;)V

    return-void
.end method
