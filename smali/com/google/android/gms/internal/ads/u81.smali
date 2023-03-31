.class final synthetic Lcom/google/android/gms/internal/ads/u81;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/r81;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/r81;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/u81;->a:Lcom/google/android/gms/internal/ads/r81;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u81;->a:Lcom/google/android/gms/internal/ads/r81;

    new-instance v1, Lcom/google/android/gms/internal/ads/s81;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/r81;->a:Lcom/google/android/gms/internal/ads/lr2;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/r81;->c:Ljava/util/List;

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/lr2;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/s81;-><init>(Ljava/util/List;)V

    return-object v1
.end method
