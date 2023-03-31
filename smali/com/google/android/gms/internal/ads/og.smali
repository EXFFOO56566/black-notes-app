.class final synthetic Lcom/google/android/gms/internal/ads/og;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/xk1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/lg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/lg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/og;->a:Lcom/google/android/gms/internal/ads/lg;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/og;->a:Lcom/google/android/gms/internal/ads/lg;

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/lg;->a(Lorg/json/JSONObject;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
