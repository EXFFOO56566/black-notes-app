.class public final Lcom/google/android/gms/internal/ads/u0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Lcom/google/android/gms/internal/ads/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/b0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "gads:rewarded_sku:enabled"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/b0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/u0;->a:Lcom/google/android/gms/internal/ads/b0;

    const-string v0, "gads:rewarded_sku:override_test:enabled"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/b0;

    return-void
.end method
