.class final Lcom/google/android/gms/internal/ads/vr1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/google/android/gms/internal/ads/eu1;)Lcom/google/android/gms/internal/ads/ow1;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/yr1;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/ow1;->d:Lcom/google/android/gms/internal/ads/ow1;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "unknown curve type: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/ow1;->c:Lcom/google/android/gms/internal/ads/ow1;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/ow1;->b:Lcom/google/android/gms/internal/ads/ow1;

    return-object p0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/qt1;)Lcom/google/android/gms/internal/ads/rw1;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/yr1;->c:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/rw1;->c:Lcom/google/android/gms/internal/ads/rw1;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x16

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "unknown point format: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/rw1;->d:Lcom/google/android/gms/internal/ads/rw1;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/rw1;->b:Lcom/google/android/gms/internal/ads/rw1;

    return-object p0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/gu1;)Ljava/lang/String;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/yr1;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const-string p0, "HmacSha512"

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "hash unsupported for HMAC: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string p0, "HmacSha256"

    return-object p0

    :cond_2
    const-string p0, "HmacSha1"

    return-object p0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/wt1;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wt1;->p()Lcom/google/android/gms/internal/ads/bu1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bu1;->p()Lcom/google/android/gms/internal/ads/eu1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vr1;->a(Lcom/google/android/gms/internal/ads/eu1;)Lcom/google/android/gms/internal/ads/ow1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mw1;->a(Lcom/google/android/gms/internal/ads/ow1;)Ljava/security/spec/ECParameterSpec;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wt1;->p()Lcom/google/android/gms/internal/ads/bu1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bu1;->q()Lcom/google/android/gms/internal/ads/gu1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vr1;->a(Lcom/google/android/gms/internal/ads/gu1;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wt1;->r()Lcom/google/android/gms/internal/ads/qt1;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/qt1;->c:Lcom/google/android/gms/internal/ads/qt1;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wt1;->q()Lcom/google/android/gms/internal/ads/st1;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/st1;->p()Lcom/google/android/gms/internal/ads/uu1;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/bq1;->a(Lcom/google/android/gms/internal/ads/uu1;)Lcom/google/android/gms/internal/ads/ou1;

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown EC point format"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
