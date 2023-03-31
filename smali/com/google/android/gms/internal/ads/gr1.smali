.class final Lcom/google/android/gms/internal/ads/gr1;
.super Lcom/google/android/gms/internal/ads/sp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/sp1<",
        "Lcom/google/android/gms/internal/ads/fp1;",
        "Lcom/google/android/gms/internal/ads/gv1;",
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
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/gv1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gv1;->q()Lcom/google/android/gms/internal/ads/hv1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/hv1;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/tp1;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/up1;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/up1;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/fp1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/dr1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gv1;->q()Lcom/google/android/gms/internal/ads/hv1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hv1;->q()Lcom/google/android/gms/internal/ads/uu1;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/dr1;-><init>(Lcom/google/android/gms/internal/ads/uu1;Lcom/google/android/gms/internal/ads/fp1;)V

    return-object v1
.end method
