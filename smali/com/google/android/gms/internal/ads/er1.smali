.class final Lcom/google/android/gms/internal/ads/er1;
.super Lcom/google/android/gms/internal/ads/pp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/pp1<",
        "Lcom/google/android/gms/internal/ads/dv1;",
        "Lcom/google/android/gms/internal/ads/cv1;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/cr1;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/pp1;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/c12;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/dz1;->a()Lcom/google/android/gms/internal/ads/dz1;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/dv1;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dz1;)Lcom/google/android/gms/internal/ads/dv1;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic a(Lcom/google/android/gms/internal/ads/c12;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/dv1;

    return-void
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/c12;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/dv1;

    invoke-static {}, Lcom/google/android/gms/internal/ads/cv1;->r()Lcom/google/android/gms/internal/ads/cv1$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/cv1$a;->a(Lcom/google/android/gms/internal/ads/dv1;)Lcom/google/android/gms/internal/ads/cv1$a;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/cv1$a;->a(I)Lcom/google/android/gms/internal/ads/cv1$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/cv1;

    return-object p1
.end method
