.class final Lcom/google/android/gms/internal/ads/nh1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "TO;>;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/bh1;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/kh1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/kh1;Lcom/google/android/gms/internal/ads/bh1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nh1;->b:Lcom/google/android/gms/internal/ads/kh1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nh1;->a:Lcom/google/android/gms/internal/ads/bh1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TO;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/nh1;->b:Lcom/google/android/gms/internal/ads/kh1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/eh1;->c(Lcom/google/android/gms/internal/ads/eh1;)Lcom/google/android/gms/internal/ads/qh1;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nh1;->a:Lcom/google/android/gms/internal/ads/bh1;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/qh1;->b(Lcom/google/android/gms/internal/ads/bh1;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nh1;->b:Lcom/google/android/gms/internal/ads/kh1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/kh1;->f:Lcom/google/android/gms/internal/ads/eh1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/eh1;->c(Lcom/google/android/gms/internal/ads/eh1;)Lcom/google/android/gms/internal/ads/qh1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nh1;->a:Lcom/google/android/gms/internal/ads/bh1;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/qh1;->a(Lcom/google/android/gms/internal/ads/bh1;Ljava/lang/Throwable;)V

    return-void
.end method
