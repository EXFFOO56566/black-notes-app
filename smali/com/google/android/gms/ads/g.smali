.class Lcom/google/android/gms/ads/g;
.super Landroid/view/ViewGroup;
.source ""


# instance fields
.field protected final b:Lcom/google/android/gms/internal/ads/bq2;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/bq2;

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/ads/bq2;-><init>(Landroid/view/ViewGroup;I)V

    iput-object p1, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/bq2;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0, p3}, Lcom/google/android/gms/internal/ads/bq2;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZI)V

    iput-object p1, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lcom/google/android/gms/internal/ads/bq2;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p2, p3, p4}, Lcom/google/android/gms/internal/ads/bq2;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZI)V

    iput-object p1, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bq2;->a()V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/d;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/d;->a()Lcom/google/android/gms/internal/ads/zp2;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/bq2;->a(Lcom/google/android/gms/internal/ads/zp2;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bq2;->l()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bq2;->m()V

    return-void
.end method

.method public getAdListener()Lcom/google/android/gms/ads/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bq2;->b()Lcom/google/android/gms/ads/b;

    move-result-object v0

    return-object v0
.end method

.method public getAdSize()Lcom/google/android/gms/ads/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bq2;->c()Lcom/google/android/gms/ads/e;

    move-result-object v0

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bq2;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMediationAdapterClassName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bq2;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResponseInfo()Lcom/google/android/gms/ads/o;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bq2;->i()Lcom/google/android/gms/ads/o;

    move-result-object v0

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr p4, p2

    sub-int/2addr p4, v0

    div-int/lit8 p4, p4, 0x2

    sub-int/2addr p5, p3

    sub-int/2addr p5, v1

    div-int/lit8 p5, p5, 0x2

    add-int/2addr v0, p4

    add-int/2addr v1, p5

    invoke-virtual {p1, p4, p5, v0, v1}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    invoke-virtual {p0, v1, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/ads/g;->getAdSize()Lcom/google/android/gms/ads/e;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Unable to retrieve ad size."

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/e;->b(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/e;->a(Landroid/content/Context;)I

    move-result v0

    move v1, v0

    move v0, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public setAdListener(Lcom/google/android/gms/ads/b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/bq2;->a(Lcom/google/android/gms/ads/b;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/bq2;->a(Lcom/google/android/gms/internal/ads/jm2;)V

    iget-object p1, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/bq2;->a(Lcom/google/android/gms/ads/r/a;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/jm2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/internal/ads/jm2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/bq2;->a(Lcom/google/android/gms/internal/ads/jm2;)V

    :cond_1
    instance-of v0, p1, Lcom/google/android/gms/ads/r/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    check-cast p1, Lcom/google/android/gms/ads/r/a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/bq2;->a(Lcom/google/android/gms/ads/r/a;)V

    :cond_2
    return-void
.end method

.method public setAdSize(Lcom/google/android/gms/ads/e;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/ads/e;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/bq2;->a([Lcom/google/android/gms/ads/e;)V

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/bq2;->a(Ljava/lang/String;)V

    return-void
.end method

.method public setOnPaidEventListener(Lcom/google/android/gms/ads/l;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/g;->b:Lcom/google/android/gms/internal/ads/bq2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/bq2;->a(Lcom/google/android/gms/ads/l;)V

    return-void
.end method
