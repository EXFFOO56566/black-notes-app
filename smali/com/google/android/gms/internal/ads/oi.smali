.class final synthetic Lcom/google/android/gms/internal/ads/oi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/mi;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/mi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oi;->a:Lcom/google/android/gms/internal/ads/mi;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oi;->a:Lcom/google/android/gms/internal/ads/mi;

    check-cast p1, Ljava/util/Map;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mi;->a(Ljava/util/Map;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
