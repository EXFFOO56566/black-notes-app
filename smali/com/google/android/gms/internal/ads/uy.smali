.class public final Lcom/google/android/gms/internal/ads/uy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/a60;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/kd1;

.field private final c:Lcom/google/android/gms/internal/ads/vd1;

.field private final d:Lcom/google/android/gms/internal/ads/ci1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/ci1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uy;->c:Lcom/google/android/gms/internal/ads/vd1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uy;->d:Lcom/google/android/gms/internal/ads/ci1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/vd1;->b:Lcom/google/android/gms/internal/ads/sd1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/sd1;->b:Lcom/google/android/gms/internal/ads/kd1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uy;->b:Lcom/google/android/gms/internal/ads/kd1;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uy;->d:Lcom/google/android/gms/internal/ads/ci1;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uy;->c:Lcom/google/android/gms/internal/ads/vd1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uy;->b:Lcom/google/android/gms/internal/ads/kd1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/kd1;->a:Ljava/util/List;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Lcom/google/android/gms/internal/ads/ci1;->a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Ljava/util/List;)V

    return-void
.end method
