.class final synthetic Lcom/google/android/gms/internal/ads/pu0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/nu0;

.field private final c:Lcom/google/android/gms/internal/ads/vd1;

.field private final d:Lcom/google/android/gms/internal/ads/id1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/nu0;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pu0;->b:Lcom/google/android/gms/internal/ads/nu0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pu0;->c:Lcom/google/android/gms/internal/ads/vd1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/pu0;->d:Lcom/google/android/gms/internal/ads/id1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu0;->b:Lcom/google/android/gms/internal/ads/nu0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu0;->c:Lcom/google/android/gms/internal/ads/vd1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/pu0;->d:Lcom/google/android/gms/internal/ads/id1;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/nu0;->d(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;)V

    return-void
.end method
