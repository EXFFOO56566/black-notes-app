.class public final Lcom/google/android/gms/internal/ads/nv0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/kt0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/kt0<",
        "Lcom/google/android/gms/internal/ads/le1;",
        "Lcom/google/android/gms/internal/ads/uu0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rl0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rl0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nv0;->a:Lcom/google/android/gms/internal/ads/rl0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lt0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/internal/ads/lt0<",
            "Lcom/google/android/gms/internal/ads/le1;",
            "Lcom/google/android/gms/internal/ads/uu0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nv0;->a:Lcom/google/android/gms/internal/ads/rl0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rl0;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/le1;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/uu0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/uu0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/lt0;

    invoke-direct {v1, p2, v0, p1}, Lcom/google/android/gms/internal/ads/lt0;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/e70;Ljava/lang/String;)V

    return-object v1
.end method
