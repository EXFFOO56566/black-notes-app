.class final synthetic Lcom/google/android/gms/internal/ads/ny0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ch1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/oy0;

.field private final b:Lcom/google/android/gms/internal/ads/r;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/oy0;Lcom/google/android/gms/internal/ads/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ny0;->a:Lcom/google/android/gms/internal/ads/oy0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ny0;->b:Lcom/google/android/gms/internal/ads/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ny0;->a:Lcom/google/android/gms/internal/ads/oy0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ny0;->b:Lcom/google/android/gms/internal/ads/r;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/oy0;->a(Lcom/google/android/gms/internal/ads/r;)V

    return-void
.end method
