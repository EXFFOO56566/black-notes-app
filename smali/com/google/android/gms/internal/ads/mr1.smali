.class final Lcom/google/android/gms/internal/ads/mr1;
.super Lcom/google/android/gms/internal/ads/sp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/sp1<",
        "Lcom/google/android/gms/internal/ads/jp1;",
        "Lcom/google/android/gms/internal/ads/xt1;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/sp1;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Lcom/google/android/gms/internal/ads/xt1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xt1;->r()Lcom/google/android/gms/internal/ads/au1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/au1;->q()Lcom/google/android/gms/internal/ads/wt1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wt1;->p()Lcom/google/android/gms/internal/ads/bu1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bu1;->p()Lcom/google/android/gms/internal/ads/eu1;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/vr1;->a(Lcom/google/android/gms/internal/ads/eu1;)Lcom/google/android/gms/internal/ads/ow1;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xt1;->q()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->a()[B

    move-result-object p1

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/mw1;->a(Lcom/google/android/gms/internal/ads/ow1;)Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    new-instance v3, Ljava/math/BigInteger;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance p1, Ljava/security/spec/ECPrivateKeySpec;

    invoke-direct {p1, v3, v2}, Ljava/security/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/tw1;->j:Lcom/google/android/gms/internal/ads/tw1;

    const-string v3, "EC"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/tw1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/KeyFactory;

    invoke-virtual {v2, p1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/security/interfaces/ECPrivateKey;

    new-instance v7, Lcom/google/android/gms/internal/ads/xr1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wt1;->q()Lcom/google/android/gms/internal/ads/st1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/st1;->p()Lcom/google/android/gms/internal/ads/uu1;

    move-result-object p1

    invoke-direct {v7, p1}, Lcom/google/android/gms/internal/ads/xr1;-><init>(Lcom/google/android/gms/internal/ads/uu1;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/iw1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bu1;->r()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/dy1;->a()[B

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bu1;->q()Lcom/google/android/gms/internal/ads/gu1;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/vr1;->a(Lcom/google/android/gms/internal/ads/gu1;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wt1;->r()Lcom/google/android/gms/internal/ads/qt1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vr1;->a(Lcom/google/android/gms/internal/ads/qt1;)Lcom/google/android/gms/internal/ads/rw1;

    move-result-object v6

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/iw1;-><init>(Ljava/security/interfaces/ECPrivateKey;[BLjava/lang/String;Lcom/google/android/gms/internal/ads/rw1;Lcom/google/android/gms/internal/ads/fw1;)V

    return-object p1
.end method
