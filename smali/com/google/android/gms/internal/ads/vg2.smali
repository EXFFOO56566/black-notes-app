.class final Lcom/google/android/gms/internal/ads/vg2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:I

.field private final synthetic c:J

.field private final synthetic d:Lcom/google/android/gms/internal/ads/rg2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/rg2;IJ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vg2;->d:Lcom/google/android/gms/internal/ads/rg2;

    iput p2, p0, Lcom/google/android/gms/internal/ads/vg2;->b:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/vg2;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vg2;->d:Lcom/google/android/gms/internal/ads/rg2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rg2;->a(Lcom/google/android/gms/internal/ads/rg2;)Lcom/google/android/gms/internal/ads/sg2;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/vg2;->b:I

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/vg2;->c:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/sg2;->a(IJ)V

    return-void
.end method
