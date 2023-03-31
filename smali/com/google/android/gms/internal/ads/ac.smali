.class public final Lcom/google/android/gms/internal/ads/ac;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lb/c/a/a;)I
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/cc;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v1, 0x3

    if-eq p0, v1, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v1

    :cond_1
    return v0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/rm2;Z)Lcom/google/ads/mediation/a;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rm2;->f:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v4, v0

    new-instance v0, Lcom/google/ads/mediation/a;

    new-instance v2, Ljava/util/Date;

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/rm2;->c:J

    invoke-direct {v2, v5, v6}, Ljava/util/Date;-><init>(J)V

    iget v1, p0, Lcom/google/android/gms/internal/ads/rm2;->e:I

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    sget-object v1, Lb/c/a/b;->b:Lb/c/a/b;

    goto :goto_1

    :cond_1
    sget-object v1, Lb/c/a/b;->d:Lb/c/a/b;

    goto :goto_1

    :cond_2
    sget-object v1, Lb/c/a/b;->c:Lb/c/a/b;

    :goto_1
    move-object v3, v1

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/rm2;->l:Landroid/location/Location;

    move-object v1, v0

    move v5, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/ads/mediation/a;-><init>(Ljava/util/Date;Lb/c/a/b;Ljava/util/Set;ZLandroid/location/Location;)V

    return-object v0
.end method
