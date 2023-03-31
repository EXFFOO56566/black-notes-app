.class final synthetic Lcom/google/android/gms/internal/ads/dz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/ws;

.field private final c:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ws;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dz;->b:Lcom/google/android/gms/internal/ads/ws;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dz;->c:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dz;->b:Lcom/google/android/gms/internal/ads/ws;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dz;->c:Lorg/json/JSONObject;

    const-string v2, "AFMA_updateActiveView"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/c8;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
