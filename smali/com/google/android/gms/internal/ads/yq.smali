.class final synthetic Lcom/google/android/gms/internal/ads/yq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/oq;

.field private final c:Z

.field private final d:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/oq;ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yq;->b:Lcom/google/android/gms/internal/ads/oq;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/yq;->c:Z

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/yq;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yq;->b:Lcom/google/android/gms/internal/ads/oq;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/yq;->c:Z

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/yq;->d:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/oq;->b(ZJ)V

    return-void
.end method
