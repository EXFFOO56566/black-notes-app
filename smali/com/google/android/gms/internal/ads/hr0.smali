.class final synthetic Lcom/google/android/gms/internal/ads/hr0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/kr0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/tq0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/tq0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hr0;->a:Lcom/google/android/gms/internal/ads/tq0;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ads/tq0;)Lcom/google/android/gms/internal/ads/kr0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/hr0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/hr0;-><init>(Lcom/google/android/gms/internal/ads/tq0;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hr0;->a:Lcom/google/android/gms/internal/ads/tq0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/tq0;->a(Lcom/google/android/gms/internal/ads/zf;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
