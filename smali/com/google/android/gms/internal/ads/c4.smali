.class public final Lcom/google/android/gms/internal/ads/c4;
.super Lcom/google/android/gms/internal/ads/z2;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/ads/s/g$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/s/g$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/z2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/c4;->b:Lcom/google/android/gms/ads/s/g$a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/k2;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c4;->b:Lcom/google/android/gms/ads/s/g$a;

    new-instance v1, Lcom/google/android/gms/internal/ads/p2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/p2;-><init>(Lcom/google/android/gms/internal/ads/k2;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/s/g$a;->a(Lcom/google/android/gms/ads/s/g;)V

    return-void
.end method
