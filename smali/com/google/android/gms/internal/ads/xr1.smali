.class final Lcom/google/android/gms/internal/ads/xr1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/fw1;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private c:Lcom/google/android/gms/internal/ads/it1;

.field private d:Lcom/google/android/gms/internal/ads/rs1;

.field private e:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/uu1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/uu1;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/xr1;->a:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/ads/iq1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/uu1;->q()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->a()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/jt1;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/jt1;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/bq1;->b(Lcom/google/android/gms/internal/ads/uu1;)Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/it1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xr1;->c:Lcom/google/android/gms/internal/ads/it1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/jt1;->p()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/xr1;->b:I
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/b02; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "invalid KeyFormat protobuf, expected AesGcmKeyFormat"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xr1;->a:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/ads/iq1;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/uu1;->q()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->a()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/ss1;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/ss1;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/bq1;->b(Lcom/google/android/gms/internal/ads/uu1;)Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rs1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xr1;->d:Lcom/google/android/gms/internal/ads/rs1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ss1;->p()Lcom/google/android/gms/internal/ads/ws1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ws1;->p()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/xr1;->e:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ss1;->q()Lcom/google/android/gms/internal/ads/ku1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ku1;->p()I

    move-result p1

    iget v0, p0, Lcom/google/android/gms/internal/ads/xr1;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/ads/xr1;->b:I
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/b02; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "unsupported AEAD DEM key type: "

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xr1;->a:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/xr1;->b:I

    return v0
.end method

.method public final a([B)Lcom/google/android/gms/internal/ads/fp1;
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/ads/fp1;

    array-length v1, p1

    iget v2, p0, Lcom/google/android/gms/internal/ads/xr1;->b:I

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xr1;->a:Ljava/lang/String;

    sget-object v2, Lcom/google/android/gms/internal/ads/iq1;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/it1;->r()Lcom/google/android/gms/internal/ads/it1$a;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/xr1;->c:Lcom/google/android/gms/internal/ads/it1;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/rz1$a;->a(Lcom/google/android/gms/internal/ads/rz1;)Lcom/google/android/gms/internal/ads/rz1$a;

    check-cast v1, Lcom/google/android/gms/internal/ads/it1$a;

    iget v3, p0, Lcom/google/android/gms/internal/ads/xr1;->b:I

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/dy1;->a([BII)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/it1$a;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/it1$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/it1;

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xr1;->a:Ljava/lang/String;

    invoke-static {v1, p1, v0}, Lcom/google/android/gms/internal/ads/bq1;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/c12;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/fp1;

    return-object p1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xr1;->a:Ljava/lang/String;

    sget-object v3, Lcom/google/android/gms/internal/ads/iq1;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/ads/xr1;->e:I

    invoke-static {p1, v2, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/xr1;->e:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/xr1;->b:I

    invoke-static {p1, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/vs1;->s()Lcom/google/android/gms/internal/ads/vs1$a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/xr1;->d:Lcom/google/android/gms/internal/ads/rs1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/rs1;->q()Lcom/google/android/gms/internal/ads/vs1;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/rz1$a;->a(Lcom/google/android/gms/internal/ads/rz1;)Lcom/google/android/gms/internal/ads/rz1$a;

    check-cast v2, Lcom/google/android/gms/internal/ads/vs1$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/dy1;->a([B)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/vs1$a;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/vs1$a;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast v1, Lcom/google/android/gms/internal/ads/vs1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ju1;->s()Lcom/google/android/gms/internal/ads/ju1$a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/xr1;->d:Lcom/google/android/gms/internal/ads/rs1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/rs1;->r()Lcom/google/android/gms/internal/ads/ju1;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/rz1$a;->a(Lcom/google/android/gms/internal/ads/rz1;)Lcom/google/android/gms/internal/ads/rz1$a;

    check-cast v2, Lcom/google/android/gms/internal/ads/ju1$a;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/dy1;->a([B)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/ju1$a;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/ju1$a;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/ju1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/rs1;->s()Lcom/google/android/gms/internal/ads/rs1$a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/xr1;->d:Lcom/google/android/gms/internal/ads/rs1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/rs1;->p()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/rs1$a;->a(I)Lcom/google/android/gms/internal/ads/rs1$a;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/rs1$a;->a(Lcom/google/android/gms/internal/ads/vs1;)Lcom/google/android/gms/internal/ads/rs1$a;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/rs1$a;->a(Lcom/google/android/gms/internal/ads/ju1;)Lcom/google/android/gms/internal/ads/rs1$a;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/rs1;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown DEM key type"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Symmetric key has incorrect length"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
