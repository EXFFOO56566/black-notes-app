.class final synthetic Lcom/google/android/gms/internal/ads/al0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/rb0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ws;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/ws;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/al0;->a:Lcom/google/android/gms/internal/ads/ws;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ads/ws;)Lcom/google/android/gms/internal/ads/rb0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/al0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/al0;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/al0;->a:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->destroy()V

    return-void
.end method
