.class public final Lcom/google/android/gms/internal/ads/l0;
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

.field public static b:Lcom/google/android/gms/internal/ads/b0;
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

    const/4 v0, 0x0

    const-string v1, "gads:debug_logging_feature:enable"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/b0;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/l0;->a:Lcom/google/android/gms/internal/ads/b0;

    const-string v1, "gads:debug_logging_feature:intercept_web_view"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/b0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/l0;->b:Lcom/google/android/gms/internal/ads/b0;

    return-void
.end method
