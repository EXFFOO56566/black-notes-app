.class final synthetic Lcom/google/android/gms/internal/ads/vq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/oq;

.field private final c:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/oq;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vq;->b:Lcom/google/android/gms/internal/ads/oq;

    iput p2, p0, Lcom/google/android/gms/internal/ads/vq;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vq;->b:Lcom/google/android/gms/internal/ads/oq;

    iget v1, p0, Lcom/google/android/gms/internal/ads/vq;->c:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/oq;->h(I)V

    return-void
.end method
