.class final synthetic Lcom/google/android/gms/internal/ads/rz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/nz;

.field private final c:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/nz;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rz;->b:Lcom/google/android/gms/internal/ads/nz;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/rz;->c:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz;->b:Lcom/google/android/gms/internal/ads/nz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rz;->c:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/nz;->a(Lorg/json/JSONObject;)V

    return-void
.end method
