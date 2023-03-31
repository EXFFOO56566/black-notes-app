.class final Lcom/google/android/gms/internal/ads/gk;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:J

.field private b:J

.field private final synthetic c:Lcom/google/android/gms/internal/ads/hk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/hk;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gk;->c:Lcom/google/android/gms/internal/ads/hk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/gk;->a:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/gk;->b:J

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/gk;->a:J

    const-string v3, "topen"

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/gk;->b:J

    const-string v3, "tclose"

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/gk;->b:J

    return-wide v0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gk;->c:Lcom/google/android/gms/internal/ads/hk;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hk;->a(Lcom/google/android/gms/internal/ads/hk;)Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/gk;->b:J

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gk;->c:Lcom/google/android/gms/internal/ads/hk;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hk;->a(Lcom/google/android/gms/internal/ads/hk;)Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/gk;->a:J

    return-void
.end method
