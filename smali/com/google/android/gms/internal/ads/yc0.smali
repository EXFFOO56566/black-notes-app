.class public final Lcom/google/android/gms/internal/ads/yc0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/o;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/t70;

.field private final c:Lcom/google/android/gms/internal/ads/wa0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/t70;Lcom/google/android/gms/internal/ads/wa0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yc0;->b:Lcom/google/android/gms/internal/ads/t70;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yc0;->c:Lcom/google/android/gms/internal/ads/wa0;

    return-void
.end method


# virtual methods
.method public final I()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yc0;->b:Lcom/google/android/gms/internal/ads/t70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/t70;->I()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yc0;->c:Lcom/google/android/gms/internal/ads/wa0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wa0;->R()V

    return-void
.end method

.method public final onPause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yc0;->b:Lcom/google/android/gms/internal/ads/t70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/t70;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yc0;->b:Lcom/google/android/gms/internal/ads/t70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/t70;->onResume()V

    return-void
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yc0;->b:Lcom/google/android/gms/internal/ads/t70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/t70;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yc0;->c:Lcom/google/android/gms/internal/ads/wa0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wa0;->S()V

    return-void
.end method
