.class public final Lcom/google/android/gms/internal/ads/f4;
.super Lcom/google/android/gms/internal/ads/g3;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/ads/s/i$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/s/i$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/g3;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/f4;->b:Lcom/google/android/gms/ads/s/i$a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/s2;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f4;->b:Lcom/google/android/gms/ads/s/i$a;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/x2;->a(Lcom/google/android/gms/internal/ads/s2;)Lcom/google/android/gms/internal/ads/x2;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/ads/s/i$a;->a(Lcom/google/android/gms/ads/s/i;Ljava/lang/String;)V

    return-void
.end method
