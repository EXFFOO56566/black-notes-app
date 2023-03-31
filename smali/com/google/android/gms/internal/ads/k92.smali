.class final Lcom/google/android/gms/internal/ads/k92;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/k82;

.field private final b:J

.field private final c:J


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/k82;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/k92;->a:Lcom/google/android/gms/internal/ads/k82;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/k92;->b:J

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/k92;->c:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/k82;JJLcom/google/android/gms/internal/ads/e92;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/internal/ads/k92;-><init>(Lcom/google/android/gms/internal/ads/k82;JJ)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/k92;)Lcom/google/android/gms/internal/ads/k82;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/k92;->a:Lcom/google/android/gms/internal/ads/k82;

    return-object p0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/k92;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/k92;->c:J

    return-wide v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/k92;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/k92;->b:J

    return-wide v0
.end method
