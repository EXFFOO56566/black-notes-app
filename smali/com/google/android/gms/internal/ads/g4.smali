.class public final Lcom/google/android/gms/internal/ads/g4;
.super Lcom/google/android/gms/internal/ads/a3;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/ads/s/h$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/s/h$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/a3;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/g4;->b:Lcom/google/android/gms/ads/s/h$a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/o2;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/g4;->b:Lcom/google/android/gms/ads/s/h$a;

    new-instance v1, Lcom/google/android/gms/internal/ads/t2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/t2;-><init>(Lcom/google/android/gms/internal/ads/o2;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/s/h$a;->a(Lcom/google/android/gms/ads/s/h;)V

    return-void
.end method
