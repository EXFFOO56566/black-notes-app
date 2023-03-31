.class final Lcom/google/android/gms/internal/ads/ar1;
.super Lcom/google/android/gms/internal/ads/sp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/sp1<",
        "Lcom/google/android/gms/internal/ads/fp1;",
        "Lcom/google/android/gms/internal/ads/mt1;",
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
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/mt1;

    new-instance v0, Lcom/google/android/gms/internal/ads/dw1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/mt1;->q()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->a()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/dw1;-><init>([B)V

    return-object v0
.end method
