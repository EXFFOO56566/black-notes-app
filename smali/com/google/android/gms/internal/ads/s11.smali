.class public final Lcom/google/android/gms/internal/ads/s11;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/v61;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/v61<",
        "Landroid/os/Bundle;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/zd1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zd1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "the targeting must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/s11;->a:Lcom/google/android/gms/internal/ads/zd1;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 13

    check-cast p1, Landroid/os/Bundle;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s11;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zd1;->f:Ljava/lang/String;

    const-string v2, "slotname"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/r11;->a:[I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/s11;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zd1;->n:Lcom/google/android/gms/internal/ads/ld1;

    iget v2, v2, Lcom/google/android/gms/internal/ads/ld1;->a:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    aget v0, v0, v2

    const/4 v2, 0x2

    if-eq v0, v3, :cond_1

    if-eq v0, v2, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "is_rewarded_interstitial"

    goto :goto_0

    :cond_1
    const-string v0, "is_new_rewarded"

    :goto_0
    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :goto_1
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "yyyyMMdd"

    invoke-direct {v0, v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v4, Ljava/util/Date;

    iget-wide v5, v1, Lcom/google/android/gms/internal/ads/rm2;->c:J

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/rm2;->c:J

    const-wide/16 v6, -0x1

    const/4 v8, 0x0

    cmp-long v9, v4, v6

    if-eqz v9, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    const-string v5, "cust_age"

    invoke-static {p1, v5, v0, v4}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/rm2;->d:Landroid/os/Bundle;

    const-string v4, "extras"

    invoke-static {p1, v4, v0}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V

    iget v0, v1, Lcom/google/android/gms/internal/ads/rm2;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v4, v1, Lcom/google/android/gms/internal/ads/rm2;->e:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_3

    const/4 v4, 0x1

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    const-string v6, "cust_gender"

    invoke-static {p1, v6, v0, v4}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Z)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    const-string v4, "kw"

    invoke-static {p1, v4, v0}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    iget v0, v1, Lcom/google/android/gms/internal/ads/rm2;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v4, v1, Lcom/google/android/gms/internal/ads/rm2;->h:I

    if-eq v4, v5, :cond_4

    const/4 v4, 0x1

    goto :goto_4

    :cond_4
    const/4 v4, 0x0

    :goto_4
    const-string v6, "tag_for_child_directed_treatment"

    invoke-static {p1, v6, v0, v4}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Z)V

    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/rm2;->g:Z

    if-eqz v0, :cond_5

    const-string v4, "test_request"

    invoke-virtual {p1, v4, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v4, v1, Lcom/google/android/gms/internal/ads/rm2;->b:I

    if-lt v4, v2, :cond_6

    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/rm2;->i:Z

    if-eqz v4, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    :goto_5
    const-string v6, "d_imp_hdr"

    invoke-static {p1, v6, v0, v4}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Z)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/rm2;->j:Ljava/lang/String;

    iget v4, v1, Lcom/google/android/gms/internal/ads/rm2;->b:I

    if-lt v4, v2, :cond_7

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    const/4 v2, 0x1

    goto :goto_6

    :cond_7
    const/4 v2, 0x0

    :goto_6
    const-string v4, "ppid"

    invoke-static {p1, v4, v0, v2}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/rm2;->l:Landroid/location/Location;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    const/high16 v4, 0x447a0000    # 1000.0f

    mul-float v2, v2, v4

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    const-wide/16 v9, 0x3e8

    mul-long v6, v6, v9

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    const-wide v9, 0x416312d000000000L    # 1.0E7

    mul-double v6, v6, v9

    double-to-long v6, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v11

    mul-double v11, v11, v9

    double-to-long v9, v11

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    const-string v9, "radius"

    invoke-virtual {v7, v9, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    const-string v2, "lat"

    invoke-virtual {v7, v2, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    const-string v0, "long"

    invoke-virtual {v7, v0, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    const-string v0, "time"

    invoke-virtual {v7, v0, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "uule"

    invoke-virtual {p1, v0, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_8
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/rm2;->m:Ljava/lang/String;

    const-string v2, "url"

    invoke-static {p1, v2, v0}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/rm2;->w:Ljava/util/List;

    const-string v2, "neighboring_content_urls"

    invoke-static {p1, v2, v0}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/rm2;->o:Landroid/os/Bundle;

    const-string v2, "custom_targeting"

    invoke-static {p1, v2, v0}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/rm2;->p:Ljava/util/List;

    const-string v2, "category_exclusions"

    invoke-static {p1, v2, v0}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/rm2;->q:Ljava/lang/String;

    const-string v2, "request_agent"

    invoke-static {p1, v2, v0}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/rm2;->r:Ljava/lang/String;

    const-string v2, "request_pkg"

    invoke-static {p1, v2, v0}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/rm2;->s:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget v2, v1, Lcom/google/android/gms/internal/ads/rm2;->b:I

    const/4 v4, 0x7

    if-lt v2, v4, :cond_9

    const/4 v2, 0x1

    goto :goto_7

    :cond_9
    const/4 v2, 0x0

    :goto_7
    const-string v4, "is_designed_for_families"

    invoke-static {p1, v4, v0, v2}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Boolean;Z)V

    iget v0, v1, Lcom/google/android/gms/internal/ads/rm2;->b:I

    const/16 v2, 0x8

    if-lt v0, v2, :cond_b

    iget v0, v1, Lcom/google/android/gms/internal/ads/rm2;->u:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v2, v1, Lcom/google/android/gms/internal/ads/rm2;->u:I

    if-eq v2, v5, :cond_a

    goto :goto_8

    :cond_a
    const/4 v3, 0x0

    :goto_8
    const-string v2, "tag_for_under_age_of_consent"

    invoke-static {p1, v2, v0, v3}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Z)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/rm2;->v:Ljava/lang/String;

    const-string v1, "max_ad_content_rating"

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ee1;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    return-void
.end method
