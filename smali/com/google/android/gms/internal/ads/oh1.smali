.class final synthetic Lcom/google/android/gms/internal/ads/oh1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/kh1;

.field private final c:Lcom/google/android/gms/internal/ads/bh1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/kh1;Lcom/google/android/gms/internal/ads/bh1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oh1;->b:Lcom/google/android/gms/internal/ads/kh1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/oh1;->c:Lcom/google/android/gms/internal/ads/bh1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oh1;->b:Lcom/google/android/gms/internal/ads/kh1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/oh1;->c:Lcom/google/android/gms/internal/ads/bh1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/eh1;->c(Lcom/google/android/gms/internal/ads/eh1;)Lcom/google/android/gms/internal/ads/qh1;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/qh1;->c(Lcom/google/android/gms/internal/ads/bh1;)V

    return-void
.end method
