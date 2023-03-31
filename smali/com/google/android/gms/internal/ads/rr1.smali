.class final Lcom/google/android/gms/internal/ads/rr1;
.super Lcom/google/android/gms/internal/ads/sp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/sp1<",
        "Lcom/google/android/gms/internal/ads/mp1;",
        "Lcom/google/android/gms/internal/ads/au1;",
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
    .locals 10

    check-cast p1, Lcom/google/android/gms/internal/ads/au1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/au1;->q()Lcom/google/android/gms/internal/ads/wt1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wt1;->p()Lcom/google/android/gms/internal/ads/bu1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bu1;->p()Lcom/google/android/gms/internal/ads/eu1;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/vr1;->a(Lcom/google/android/gms/internal/ads/eu1;)Lcom/google/android/gms/internal/ads/ow1;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/au1;->r()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/dy1;->a()[B

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/au1;->s()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->a()[B

    move-result-object p1

    invoke-static {v2, v3, p1}, Lcom/google/android/gms/internal/ads/mw1;->a(Lcom/google/android/gms/internal/ads/ow1;[B[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v5

    new-instance v9, Lcom/google/android/gms/internal/ads/xr1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wt1;->q()Lcom/google/android/gms/internal/ads/st1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/st1;->p()Lcom/google/android/gms/internal/ads/uu1;

    move-result-object p1

    invoke-direct {v9, p1}, Lcom/google/android/gms/internal/ads/xr1;-><init>(Lcom/google/android/gms/internal/ads/uu1;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/hw1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bu1;->r()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/dy1;->a()[B

    move-result-object v6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bu1;->q()Lcom/google/android/gms/internal/ads/gu1;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/vr1;->a(Lcom/google/android/gms/internal/ads/gu1;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wt1;->r()Lcom/google/android/gms/internal/ads/qt1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vr1;->a(Lcom/google/android/gms/internal/ads/qt1;)Lcom/google/android/gms/internal/ads/rw1;

    move-result-object v8

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/hw1;-><init>(Ljava/security/interfaces/ECPublicKey;[BLjava/lang/String;Lcom/google/android/gms/internal/ads/rw1;Lcom/google/android/gms/internal/ads/fw1;)V

    return-object p1
.end method
