.class public final Lcom/google/android/gms/internal/ads/nr1;
.super Lcom/google/android/gms/internal/ads/cq1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/cq1<",
        "Lcom/google/android/gms/internal/ads/xt1;",
        "Lcom/google/android/gms/internal/ads/au1;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 5

    const-class v0, Lcom/google/android/gms/internal/ads/xt1;

    const-class v1, Lcom/google/android/gms/internal/ads/au1;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/internal/ads/sp1;

    new-instance v3, Lcom/google/android/gms/internal/ads/mr1;

    const-class v4, Lcom/google/android/gms/internal/ads/jp1;

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/mr1;-><init>(Ljava/lang/Class;)V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/cq1;-><init>(Ljava/lang/Class;Ljava/lang/Class;[Lcom/google/android/gms/internal/ads/sp1;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/c12;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->a()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/xt1;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/xt1;

    move-result-object p1

    return-object p1
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    return-object v0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/c12;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/xt1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xt1;->q()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dy1;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xt1;->p()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/jx1;->a(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xt1;->r()Lcom/google/android/gms/internal/ads/au1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/au1;->q()Lcom/google/android/gms/internal/ads/wt1;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/vr1;->a(Lcom/google/android/gms/internal/ads/wt1;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid ECIES private key"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Lcom/google/android/gms/internal/ads/ou1$b;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/ou1$b;->e:Lcom/google/android/gms/internal/ads/ou1$b;

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/internal/ads/pp1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/pp1<",
            "Lcom/google/android/gms/internal/ads/tt1;",
            "Lcom/google/android/gms/internal/ads/xt1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/pr1;

    const-class v1, Lcom/google/android/gms/internal/ads/tt1;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/pr1;-><init>(Lcom/google/android/gms/internal/ads/nr1;Ljava/lang/Class;)V

    return-object v0
.end method
