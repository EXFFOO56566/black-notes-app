.class public final Lcom/google/android/gms/internal/ads/s41;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/y61;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/y61<",
        "Lcom/google/android/gms/internal/ads/t41;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ko1;

.field private final b:Lcom/google/android/gms/internal/ads/gd1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ko1;Lcom/google/android/gms/internal/ads/gd1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/s41;->a:Lcom/google/android/gms/internal/ads/ko1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/s41;->b:Lcom/google/android/gms/internal/ads/gd1;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/t41;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s41;->a:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v1, Lcom/google/android/gms/internal/ads/v41;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/v41;-><init>(Lcom/google/android/gms/internal/ads/s41;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ko1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0
.end method

.method final synthetic b()Lcom/google/android/gms/internal/ads/t41;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/t41;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/s41;->b:Lcom/google/android/gms/internal/ads/gd1;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/t41;-><init>(Lcom/google/android/gms/internal/ads/gd1;)V

    return-object v0
.end method
