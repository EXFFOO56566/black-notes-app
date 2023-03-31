.class public final Lcom/google/android/gms/internal/ads/zq2;
.super Lcom/google/android/gms/internal/ads/kp2;
.source ""


# instance fields
.field private final b:Lcom/google/android/gms/ads/l;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/l;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/kp2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zq2;->b:Lcom/google/android/gms/ads/l;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/wm2;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zq2;->b:Lcom/google/android/gms/ads/l;

    if-eqz v0, :cond_0

    iget v0, p1, Lcom/google/android/gms/internal/ads/wm2;->c:I

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/wm2;->d:Ljava/lang/String;

    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/wm2;->e:J

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/ads/f;->a(ILjava/lang/String;J)Lcom/google/android/gms/ads/f;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zq2;->b:Lcom/google/android/gms/ads/l;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/l;->a(Lcom/google/android/gms/ads/f;)V

    :cond_0
    return-void
.end method
