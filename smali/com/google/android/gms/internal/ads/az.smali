.class final Lcom/google/android/gms/internal/ads/az;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/d5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/d5<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/vy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/vy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/az;->a:Lcom/google/android/gms/internal/ads/vy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/az;->a:Lcom/google/android/gms/internal/ads/vy;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/vy;->a(Lcom/google/android/gms/internal/ads/vy;Ljava/util/Map;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/az;->a:Lcom/google/android/gms/internal/ads/vy;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/vy;->a(Lcom/google/android/gms/internal/ads/vy;)Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zy;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zy;-><init>(Lcom/google/android/gms/internal/ads/az;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
