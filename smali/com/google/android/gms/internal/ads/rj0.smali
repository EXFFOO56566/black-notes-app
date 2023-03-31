.class final synthetic Lcom/google/android/gms/internal/ads/rj0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/t;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/v60;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/v60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rj0;->b:Lcom/google/android/gms/internal/ads/v60;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ads/v60;)Lcom/google/android/gms/ads/internal/overlay/t;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/rj0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/rj0;-><init>(Lcom/google/android/gms/internal/ads/v60;)V

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rj0;->b:Lcom/google/android/gms/internal/ads/v60;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/v60;->S()V

    return-void
.end method
