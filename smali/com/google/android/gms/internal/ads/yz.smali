.class public final Lcom/google/android/gms/internal/ads/yz;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/tn0;

.field private final b:Lcom/google/android/gms/internal/ads/vd1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/tn0;Lcom/google/android/gms/internal/ads/vd1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yz;->a:Lcom/google/android/gms/internal/ads/tn0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yz;->b:Lcom/google/android/gms/internal/ads/vd1;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yz;->a:Lcom/google/android/gms/internal/ads/tn0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/tn0;->a()Lcom/google/android/gms/internal/ads/sn0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yz;->b:Lcom/google/android/gms/internal/ads/vd1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/vd1;->b:Lcom/google/android/gms/internal/ads/sd1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/sd1;->b:Lcom/google/android/gms/internal/ads/kd1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sn0;->a(Lcom/google/android/gms/internal/ads/kd1;)Lcom/google/android/gms/internal/ads/sn0;

    const-string v1, "action"

    const-string v2, "ad_closed"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/sn0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const-string p2, "show_time"

    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/sn0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    const-string p1, "ad_format"

    const-string p2, "appopen"

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/sn0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/sn0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sn0;->a()V

    return-void
.end method
