.class final synthetic Lcom/google/android/gms/internal/ads/fp0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/cp0;

.field private final c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/cp0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fp0;->b:Lcom/google/android/gms/internal/ads/cp0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fp0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fp0;->b:Lcom/google/android/gms/internal/ads/cp0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fp0;->c:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/cp0;->a:Lcom/google/android/gms/internal/ads/uo0;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/uo0;->a(Lcom/google/android/gms/internal/ads/uo0;Ljava/lang/String;)V

    return-void
.end method
