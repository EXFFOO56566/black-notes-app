.class public final Lcom/google/android/gms/internal/ads/ug1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/ko1;",
        ">;"
    }
.end annotation


# direct methods
.method public static a()Lcom/google/android/gms/internal/ads/ko1;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/jo;->b:Lcom/google/android/gms/internal/ads/ko1;

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/ko1;

    return-object v0
.end method
