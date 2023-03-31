.class final Lcom/google/android/gms/internal/ads/nq1;
.super Lcom/google/android/gms/internal/ads/pp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/pp1<",
        "Lcom/google/android/gms/internal/ads/ss1;",
        "Lcom/google/android/gms/internal/ads/rs1;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/mq1;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/pp1;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/c12;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->a()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ss1;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/ss1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/c12;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/ss1;

    new-instance v0, Lcom/google/android/gms/internal/ads/qq1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/qq1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/qq1;->f()Lcom/google/android/gms/internal/ads/pp1;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ss1;->p()Lcom/google/android/gms/internal/ads/ws1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pp1;->a(Lcom/google/android/gms/internal/ads/c12;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/bs1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bs1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bs1;->f()Lcom/google/android/gms/internal/ads/pp1;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ss1;->q()Lcom/google/android/gms/internal/ads/ku1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pp1;->a(Lcom/google/android/gms/internal/ads/c12;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ss1;->p()Lcom/google/android/gms/internal/ads/ws1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ws1;->p()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/jx1;->a(I)V

    return-void
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/c12;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/ss1;

    new-instance v0, Lcom/google/android/gms/internal/ads/qq1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/qq1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/qq1;->f()Lcom/google/android/gms/internal/ads/pp1;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ss1;->p()Lcom/google/android/gms/internal/ads/ws1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pp1;->b(Lcom/google/android/gms/internal/ads/c12;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/vs1;

    new-instance v1, Lcom/google/android/gms/internal/ads/bs1;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/bs1;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bs1;->f()Lcom/google/android/gms/internal/ads/pp1;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ss1;->q()Lcom/google/android/gms/internal/ads/ku1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/pp1;->b(Lcom/google/android/gms/internal/ads/c12;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/ju1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/rs1;->s()Lcom/google/android/gms/internal/ads/rs1$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/rs1$a;->a(Lcom/google/android/gms/internal/ads/vs1;)Lcom/google/android/gms/internal/ads/rs1$a;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/rs1$a;->a(Lcom/google/android/gms/internal/ads/ju1;)Lcom/google/android/gms/internal/ads/rs1$a;

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/rs1$a;->a(I)Lcom/google/android/gms/internal/ads/rs1$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/rs1;

    return-object p1
.end method
