.class final synthetic Lcom/google/android/gms/internal/ads/c50;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/z40;

.field private final b:Lcom/google/android/gms/internal/ads/lo1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/z40;Lcom/google/android/gms/internal/ads/lo1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/c50;->a:Lcom/google/android/gms/internal/ads/z40;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/c50;->b:Lcom/google/android/gms/internal/ads/lo1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c50;->a:Lcom/google/android/gms/internal/ads/z40;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c50;->b:Lcom/google/android/gms/internal/ads/lo1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/z40;->a(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/zf;

    move-result-object v0

    return-object v0
.end method
