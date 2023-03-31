.class public final Lcom/google/android/gms/internal/ads/z;
.super Lcom/google/android/gms/internal/ads/x;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/ads/r/c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/r/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/x;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/z;->b:Lcom/google/android/gms/ads/r/c;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/t;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z;->b:Lcom/google/android/gms/ads/r/c;

    new-instance v1, Lcom/google/android/gms/internal/ads/q;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/q;-><init>(Lcom/google/android/gms/internal/ads/t;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/r/c;->a(Lcom/google/android/gms/ads/r/b;)V

    return-void
.end method
