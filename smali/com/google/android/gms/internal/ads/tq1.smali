.class final Lcom/google/android/gms/internal/ads/tq1;
.super Lcom/google/android/gms/internal/ads/pp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/pp1<",
        "Lcom/google/android/gms/internal/ads/dt1;",
        "Lcom/google/android/gms/internal/ads/at1;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/rq1;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/pp1;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/c12;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->a()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/dt1;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/dt1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/c12;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/dt1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dt1;->p()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/jx1;->a(I)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dt1;->q()Lcom/google/android/gms/internal/ads/et1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/et1;->p()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dt1;->q()Lcom/google/android/gms/internal/ads/et1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/et1;->p()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/c12;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/dt1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/at1;->s()Lcom/google/android/gms/internal/ads/at1$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dt1;->p()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ex1;->a(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/dy1;->a([B)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/at1$a;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/at1$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dt1;->q()Lcom/google/android/gms/internal/ads/et1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/at1$a;->a(Lcom/google/android/gms/internal/ads/et1;)Lcom/google/android/gms/internal/ads/at1$a;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/at1$a;->a(I)Lcom/google/android/gms/internal/ads/at1$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/at1;

    return-object p1
.end method
