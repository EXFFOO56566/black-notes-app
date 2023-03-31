.class final Lcom/google/android/gms/internal/ads/tu;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/o;


# instance fields
.field private b:Lcom/google/android/gms/internal/ads/ws;

.field private c:Lcom/google/android/gms/ads/internal/overlay/o;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/ads/internal/overlay/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tu;->b:Lcom/google/android/gms/internal/ads/ws;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/tu;->c:Lcom/google/android/gms/ads/internal/overlay/o;

    return-void
.end method


# virtual methods
.method public final I()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tu;->c:Lcom/google/android/gms/ads/internal/overlay/o;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/o;->I()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tu;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->o()V

    return-void
.end method

.method public final onPause()V
    .locals 0

    return-void
.end method

.method public final onResume()V
    .locals 0

    return-void
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tu;->c:Lcom/google/android/gms/ads/internal/overlay/o;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/o;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tu;->b:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->F()V

    return-void
.end method
