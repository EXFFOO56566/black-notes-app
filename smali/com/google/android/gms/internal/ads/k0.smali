.class public final Lcom/google/android/gms/internal/ads/k0;
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

.field public static b:Lcom/google/android/gms/internal/ads/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/b0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static c:Lcom/google/android/gms/internal/ads/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/b0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static d:Lcom/google/android/gms/internal/ads/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/b0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static e:Lcom/google/android/gms/internal/ads/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/b0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static f:Lcom/google/android/gms/internal/ads/b0;
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
    .locals 6

    const-wide/16 v0, 0x1

    const-string v2, "gads:content_age_weight"

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/b0;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/ads/k0;->a:Lcom/google/android/gms/internal/ads/b0;

    const-string v2, "gads:enable_content_fetching"

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/b0;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/ads/k0;->b:Lcom/google/android/gms/internal/ads/b0;

    const-wide/16 v2, 0xa

    const-string v4, "gads:fingerprint_number"

    invoke-static {v4, v2, v3}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/b0;

    move-result-object v4

    sput-object v4, Lcom/google/android/gms/internal/ads/k0;->c:Lcom/google/android/gms/internal/ads/b0;

    const-string v4, "gads:content_length_weight"

    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/b0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/k0;->d:Lcom/google/android/gms/internal/ads/b0;

    const-string v0, "gads:min_content_len"

    const-wide/16 v4, 0xb

    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/b0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/k0;->e:Lcom/google/android/gms/internal/ads/b0;

    const-string v0, "gads:sleep_sec"

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/ads/b0;->a(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/b0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/k0;->f:Lcom/google/android/gms/internal/ads/b0;

    return-void
.end method
