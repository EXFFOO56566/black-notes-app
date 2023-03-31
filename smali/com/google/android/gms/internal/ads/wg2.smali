.class final Lcom/google/android/gms/internal/ads/wg2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/e82;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/rg2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/rg2;Lcom/google/android/gms/internal/ads/e82;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wg2;->c:Lcom/google/android/gms/internal/ads/rg2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wg2;->b:Lcom/google/android/gms/internal/ads/e82;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wg2;->c:Lcom/google/android/gms/internal/ads/rg2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rg2;->a(Lcom/google/android/gms/internal/ads/rg2;)Lcom/google/android/gms/internal/ads/sg2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wg2;->b:Lcom/google/android/gms/internal/ads/e82;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/sg2;->a(Lcom/google/android/gms/internal/ads/e82;)V

    return-void
.end method
