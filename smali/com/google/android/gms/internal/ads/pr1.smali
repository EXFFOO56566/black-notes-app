.class final Lcom/google/android/gms/internal/ads/pr1;
.super Lcom/google/android/gms/internal/ads/pp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/pp1<",
        "Lcom/google/android/gms/internal/ads/tt1;",
        "Lcom/google/android/gms/internal/ads/xt1;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/nr1;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/pp1;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/c12;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->a()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/tt1;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/tt1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/c12;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/tt1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/tt1;->p()Lcom/google/android/gms/internal/ads/wt1;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/vr1;->a(Lcom/google/android/gms/internal/ads/wt1;)V

    return-void
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/c12;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lcom/google/android/gms/internal/ads/tt1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/tt1;->p()Lcom/google/android/gms/internal/ads/wt1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wt1;->p()Lcom/google/android/gms/internal/ads/bu1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bu1;->p()Lcom/google/android/gms/internal/ads/eu1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vr1;->a(Lcom/google/android/gms/internal/ads/eu1;)Lcom/google/android/gms/internal/ads/ow1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mw1;->a(Lcom/google/android/gms/internal/ads/ow1;)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mw1;->a(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPrivateKey;

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/au1;->t()Lcom/google/android/gms/internal/ads/au1$a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/au1$a;->a(I)Lcom/google/android/gms/internal/ads/au1$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/tt1;->p()Lcom/google/android/gms/internal/ads/wt1;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/au1$a;->a(Lcom/google/android/gms/internal/ads/wt1;)Lcom/google/android/gms/internal/ads/au1$a;

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/dy1;->a([B)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/au1$a;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/au1$a;

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/dy1;->a([B)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/au1$a;->b(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/au1$a;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/au1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/xt1;->s()Lcom/google/android/gms/internal/ads/xt1$a;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/xt1$a;->a(I)Lcom/google/android/gms/internal/ads/xt1$a;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/xt1$a;->a(Lcom/google/android/gms/internal/ads/au1;)Lcom/google/android/gms/internal/ads/xt1$a;

    invoke-interface {v0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/dy1;->a([B)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/xt1$a;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/xt1$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/xt1;

    return-object p1
.end method
