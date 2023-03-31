.class final synthetic Lcom/google/android/gms/internal/ads/lr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/oa2;


# static fields
.field static final a:Lcom/google/android/gms/internal/ads/oa2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/lr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/lr;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/lr;->a:Lcom/google/android/gms/internal/ads/oa2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()[Lcom/google/android/gms/internal/ads/na2;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/na2;

    new-instance v1, Lcom/google/android/gms/internal/ads/vb2;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/vb2;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/google/android/gms/internal/ads/eb2;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/eb2;-><init>()V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method
