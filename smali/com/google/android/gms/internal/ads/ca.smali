.class final synthetic Lcom/google/android/gms/internal/ads/ca;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/da;

.field private final b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/da;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ca;->a:Lcom/google/android/gms/internal/ads/da;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ca;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ca;->a:Lcom/google/android/gms/internal/ads/da;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ca;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/e9;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/da;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/e9;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
