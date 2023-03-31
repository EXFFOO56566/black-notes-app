.class public final Lcom/google/android/gms/internal/ads/j00;
.super Lcom/google/android/gms/internal/ads/ri2;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/h00;

.field private final c:Lcom/google/android/gms/internal/ads/eo2;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/h00;Lcom/google/android/gms/internal/ads/eo2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ri2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j00;->b:Lcom/google/android/gms/internal/ads/h00;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/j00;->c:Lcom/google/android/gms/internal/ads/eo2;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/wi2;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j00;->b:Lcom/google/android/gms/internal/ads/h00;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/h00;->a(Lcom/google/android/gms/internal/ads/wi2;)V

    return-void
.end method

.method public final a1()Lcom/google/android/gms/internal/ads/eo2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j00;->c:Lcom/google/android/gms/internal/ads/eo2;

    return-object v0
.end method
