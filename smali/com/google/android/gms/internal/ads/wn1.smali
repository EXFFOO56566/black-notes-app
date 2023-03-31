.class public Lcom/google/android/gms/internal/ads/wn1;
.super Lcom/google/android/gms/internal/ads/xn1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/ads/xn1<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/lo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/ads/lo1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/xn1;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/jl1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/lo1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wn1;->b:Lcom/google/android/gms/internal/ads/lo1;

    return-void
.end method


# virtual methods
.method protected final synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wn1;->e()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic c()Ljava/util/concurrent/Future;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wn1;->e()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0
.end method

.method protected final e()Lcom/google/android/gms/internal/ads/lo1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wn1;->b:Lcom/google/android/gms/internal/ads/lo1;

    return-object v0
.end method
