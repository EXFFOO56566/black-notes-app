.class final Lcom/google/android/gms/internal/ads/oq1;
.super Lcom/google/android/gms/internal/ads/sp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/sp1<",
        "Lcom/google/android/gms/internal/ads/fp1;",
        "Lcom/google/android/gms/internal/ads/rs1;",
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
    .locals 5

    check-cast p1, Lcom/google/android/gms/internal/ads/rs1;

    new-instance v0, Lcom/google/android/gms/internal/ads/qw1;

    new-instance v1, Lcom/google/android/gms/internal/ads/qq1;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/qq1;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/rs1;->q()Lcom/google/android/gms/internal/ads/vs1;

    move-result-object v2

    const-class v3, Lcom/google/android/gms/internal/ads/dx1;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/qp1;->a(Lcom/google/android/gms/internal/ads/c12;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/dx1;

    new-instance v2, Lcom/google/android/gms/internal/ads/bs1;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/bs1;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/rs1;->r()Lcom/google/android/gms/internal/ads/ju1;

    move-result-object v3

    const-class v4, Lcom/google/android/gms/internal/ads/wp1;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/qp1;->a(Lcom/google/android/gms/internal/ads/c12;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/wp1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/rs1;->r()Lcom/google/android/gms/internal/ads/ju1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ju1;->r()Lcom/google/android/gms/internal/ads/nu1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/nu1;->p()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/qw1;-><init>(Lcom/google/android/gms/internal/ads/dx1;Lcom/google/android/gms/internal/ads/wp1;I)V

    return-object v0
.end method
