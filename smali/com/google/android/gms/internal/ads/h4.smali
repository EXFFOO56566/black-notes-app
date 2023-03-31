.class public final Lcom/google/android/gms/internal/ads/h4;
.super Lcom/google/android/gms/internal/ads/h3;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/ads/s/i$b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/s/i$b;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/h3;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/h4;->b:Lcom/google/android/gms/ads/s/i$b;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/s2;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h4;->b:Lcom/google/android/gms/ads/s/i$b;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/x2;->a(Lcom/google/android/gms/internal/ads/s2;)Lcom/google/android/gms/internal/ads/x2;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/s/i$b;->a(Lcom/google/android/gms/ads/s/i;)V

    return-void
.end method
