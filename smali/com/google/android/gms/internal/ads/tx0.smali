.class final synthetic Lcom/google/android/gms/internal/ads/tx0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/qx0;

.field private final c:Lcom/google/android/gms/internal/ads/vd1;

.field private final d:Lcom/google/android/gms/internal/ads/id1;

.field private final e:Lcom/google/android/gms/internal/ads/lt0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/qx0;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tx0;->b:Lcom/google/android/gms/internal/ads/qx0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/tx0;->c:Lcom/google/android/gms/internal/ads/vd1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/tx0;->d:Lcom/google/android/gms/internal/ads/id1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/tx0;->e:Lcom/google/android/gms/internal/ads/lt0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tx0;->b:Lcom/google/android/gms/internal/ads/qx0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tx0;->c:Lcom/google/android/gms/internal/ads/vd1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tx0;->d:Lcom/google/android/gms/internal/ads/id1;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/tx0;->e:Lcom/google/android/gms/internal/ads/lt0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/qx0;->d:Lcom/google/android/gms/internal/ads/ox0;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/ox0;->a(Lcom/google/android/gms/internal/ads/ox0;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)V

    return-void
.end method
