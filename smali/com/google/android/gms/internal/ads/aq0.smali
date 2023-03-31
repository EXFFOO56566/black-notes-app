.class public final Lcom/google/android/gms/internal/ads/aq0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/oq0;",
        ">;"
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/oq0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/oq0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/oq0;-><init>(Landroid/content/Context;)V

    const-string p0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/oq0;

    return-object v0
.end method
