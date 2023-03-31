.class final synthetic Lcom/google/android/gms/internal/ads/y7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ku;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/u7;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/u7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/y7;->a:Lcom/google/android/gms/internal/ads/u7;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ads/u7;)Lcom/google/android/gms/internal/ads/ku;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/y7;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/y7;-><init>(Lcom/google/android/gms/internal/ads/u7;)V

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y7;->a:Lcom/google/android/gms/internal/ads/u7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/u7;->a()V

    return-void
.end method
