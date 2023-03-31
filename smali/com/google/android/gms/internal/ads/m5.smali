.class final Lcom/google/android/gms/internal/ads/m5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/l5;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ro;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/j5;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/m5;->a:Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m5;->a:Lcom/google/android/gms/internal/ads/ro;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ro;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m5;->a:Lcom/google/android/gms/internal/ads/ro;

    new-instance v1, Lcom/google/android/gms/internal/ads/f9;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/f9;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    return-void
.end method
