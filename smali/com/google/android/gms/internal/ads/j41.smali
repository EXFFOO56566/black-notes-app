.class public final Lcom/google/android/gms/internal/ads/j41;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/y61;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/y61<",
        "Lcom/google/android/gms/internal/ads/l41;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ko1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ko1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j41;->a:Lcom/google/android/gms/internal/ads/ko1;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/l41;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j41;->a:Lcom/google/android/gms/internal/ads/ko1;

    sget-object v1, Lcom/google/android/gms/internal/ads/n41;->a:Ljava/util/concurrent/Callable;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ko1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    return-object v0
.end method
