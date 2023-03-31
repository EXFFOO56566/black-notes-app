.class final Lcom/google/android/gms/internal/ads/qr;
.super Lcom/google/android/gms/internal/ads/jq;
.source ""


# static fields
.field static final c:Lcom/google/android/gms/internal/ads/qr;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/qr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/qr;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/qr;->c:Lcom/google/android/gms/internal/ads/qr;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/jq;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;[BLjava/lang/String;)Lcom/google/android/gms/internal/ads/mt;
    .locals 0

    const-string p2, "moov"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/lv;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/lv;-><init>()V

    return-object p1

    :cond_0
    const-string p2, "mvhd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/oy;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/oy;-><init>()V

    return-object p1

    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/ads/nx;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/nx;-><init>(Ljava/lang/String;)V

    return-object p2
.end method
