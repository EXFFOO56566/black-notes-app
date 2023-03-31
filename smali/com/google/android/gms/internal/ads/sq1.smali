.class final Lcom/google/android/gms/internal/ads/sq1;
.super Lcom/google/android/gms/internal/ads/pp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/pp1<",
        "Lcom/google/android/gms/internal/ads/ws1;",
        "Lcom/google/android/gms/internal/ads/vs1;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/qq1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/qq1;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sq1;->b:Lcom/google/android/gms/internal/ads/qq1;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/pp1;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/c12;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->a()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ws1;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/ws1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/c12;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/ws1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ws1;->p()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/jx1;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sq1;->b:Lcom/google/android/gms/internal/ads/qq1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ws1;->q()Lcom/google/android/gms/internal/ads/zs1;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/qq1;->a(Lcom/google/android/gms/internal/ads/qq1;Lcom/google/android/gms/internal/ads/zs1;)V

    return-void
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/c12;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/ws1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/vs1;->s()Lcom/google/android/gms/internal/ads/vs1$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ws1;->q()Lcom/google/android/gms/internal/ads/zs1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vs1$a;->a(Lcom/google/android/gms/internal/ads/zs1;)Lcom/google/android/gms/internal/ads/vs1$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ws1;->p()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ex1;->a(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/dy1;->a([B)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/vs1$a;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/vs1$a;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/vs1$a;->a(I)Lcom/google/android/gms/internal/ads/vs1$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/vs1;

    return-object p1
.end method
