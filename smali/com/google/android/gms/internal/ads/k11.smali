.class public final Lcom/google/android/gms/internal/ads/k11;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/ln1<",
        "Lcom/google/android/gms/internal/ads/zf;",
        "Lcom/google/android/gms/internal/ads/l11;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/concurrent/Executor;

.field private b:Lcom/google/android/gms/internal/ads/sq0;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/sq0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/k11;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/k11;->b:Lcom/google/android/gms/internal/ads/sq0;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/zf;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/k11;->b:Lcom/google/android/gms/internal/ads/sq0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sq0;->a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/j11;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/j11;-><init>(Lcom/google/android/gms/internal/ads/zf;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/k11;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/ln1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
