.class final synthetic Lcom/google/android/gms/internal/ads/p7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/q7;

.field private final c:Lcom/google/android/gms/internal/ads/d5;

.field private final d:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/q7;Lcom/google/android/gms/internal/ads/d5;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/p7;->b:Lcom/google/android/gms/internal/ads/q7;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/p7;->c:Lcom/google/android/gms/internal/ads/d5;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/p7;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p7;->b:Lcom/google/android/gms/internal/ads/q7;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/p7;->c:Lcom/google/android/gms/internal/ads/d5;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/p7;->d:Ljava/util/Map;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/q7;->a(Lcom/google/android/gms/internal/ads/d5;Ljava/util/Map;)V

    return-void
.end method
