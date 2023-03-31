.class public final Lcom/google/android/gms/internal/ads/a1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Lcom/google/android/gms/internal/ads/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/b0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-wide/32 v0, 0xea60

    const-string v2, "gads:ad_loader:timeout_ms"

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/b0;

    const-string v2, "gads:rendering:timeout_ms"

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/b0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/a1;->a:Lcom/google/android/gms/internal/ads/b0;

    const-string v0, "gads:resolve_future:default_timeout_ms"

    const-wide/16 v1, 0x7530

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/b0;

    return-void
.end method
