.class public final Lcom/google/android/gms/internal/ads/i4;
.super Lcom/google/android/gms/internal/ads/p3;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/ads/s/k$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/s/k$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/p3;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/i4;->b:Lcom/google/android/gms/ads/s/k$a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/w3;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i4;->b:Lcom/google/android/gms/ads/s/k$a;

    new-instance v1, Lcom/google/android/gms/internal/ads/b4;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/b4;-><init>(Lcom/google/android/gms/internal/ads/w3;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/s/k$a;->a(Lcom/google/android/gms/ads/s/k;)V

    return-void
.end method
