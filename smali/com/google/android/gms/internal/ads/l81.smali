.class final synthetic Lcom/google/android/gms/internal/ads/l81;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/v61;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/i81;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/i81;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/l81;->a:Lcom/google/android/gms/internal/ads/i81;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/l81;->a:Lcom/google/android/gms/internal/ads/i81;

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/i81;->a(Lorg/json/JSONObject;)V

    return-void
.end method
