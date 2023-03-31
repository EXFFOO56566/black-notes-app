.class public final Lcom/google/android/gms/internal/ads/qq1;
.super Lcom/google/android/gms/internal/ads/qp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/qp1<",
        "Lcom/google/android/gms/internal/ads/vs1;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/ads/vs1;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/internal/ads/sp1;

    new-instance v2, Lcom/google/android/gms/internal/ads/pq1;

    const-class v3, Lcom/google/android/gms/internal/ads/dx1;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/pq1;-><init>(Ljava/lang/Class;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/qp1;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/ads/sp1;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/qq1;Lcom/google/android/gms/internal/ads/zs1;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/qq1;->a(Lcom/google/android/gms/internal/ads/zs1;)V

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/ads/zs1;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zs1;->p()I

    move-result v0

    const/16 v1, 0xc

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zs1;->p()I

    move-result p0

    const/16 v0, 0x10

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/c12;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->a()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/vs1;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/vs1;

    move-result-object p1

    return-object p1
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrKey"

    return-object v0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/c12;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/vs1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vs1;->p()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/jx1;->a(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vs1;->q()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/jx1;->a(I)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vs1;->r()Lcom/google/android/gms/internal/ads/zs1;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/qq1;->a(Lcom/google/android/gms/internal/ads/zs1;)V

    return-void
.end method

.method public final c()Lcom/google/android/gms/internal/ads/ou1$b;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/ou1$b;->d:Lcom/google/android/gms/internal/ads/ou1$b;

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/internal/ads/pp1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/pp1<",
            "Lcom/google/android/gms/internal/ads/ws1;",
            "Lcom/google/android/gms/internal/ads/vs1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/sq1;

    const-class v1, Lcom/google/android/gms/internal/ads/ws1;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/sq1;-><init>(Lcom/google/android/gms/internal/ads/qq1;Ljava/lang/Class;)V

    return-object v0
.end method
