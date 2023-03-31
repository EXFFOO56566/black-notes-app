.class final Lcom/google/android/gms/internal/ads/ds1;
.super Lcom/google/android/gms/internal/ads/pp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/pp1<",
        "Lcom/google/android/gms/internal/ads/ku1;",
        "Lcom/google/android/gms/internal/ads/ju1;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bs1;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/pp1;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/c12;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->a()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ku1;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/ku1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/c12;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/ku1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ku1;->p()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ku1;->q()Lcom/google/android/gms/internal/ads/nu1;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/bs1;->b(Lcom/google/android/gms/internal/ads/nu1;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/c12;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/ku1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ju1;->s()Lcom/google/android/gms/internal/ads/ju1$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ju1$a;->a(I)Lcom/google/android/gms/internal/ads/ju1$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ku1;->q()Lcom/google/android/gms/internal/ads/nu1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ju1$a;->a(Lcom/google/android/gms/internal/ads/nu1;)Lcom/google/android/gms/internal/ads/ju1$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ku1;->p()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ex1;->a(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/dy1;->a([B)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ju1$a;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/ju1$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/ju1;

    return-object p1
.end method
