.class final synthetic Lcom/google/android/gms/internal/ads/aa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/google/android/gms/internal/ads/d5;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aa;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/aa;->b:Lcom/google/android/gms/internal/ads/d5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aa;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aa;->b:Lcom/google/android/gms/internal/ads/d5;

    check-cast p1, Lcom/google/android/gms/internal/ads/e9;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/e9;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yn1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
