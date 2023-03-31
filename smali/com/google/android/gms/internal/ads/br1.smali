.class final Lcom/google/android/gms/internal/ads/br1;
.super Lcom/google/android/gms/internal/ads/sp1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/sp1<",
        "Lcom/google/android/gms/internal/ads/fp1;",
        "Lcom/google/android/gms/internal/ads/cv1;",
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

    check-cast p1, Lcom/google/android/gms/internal/ads/cv1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/cv1;->q()Lcom/google/android/gms/internal/ads/dv1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dv1;->p()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/tp1;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/up1;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/up1;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/fp1;

    move-result-object p1

    return-object p1
.end method
