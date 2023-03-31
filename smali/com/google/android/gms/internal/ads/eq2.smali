.class final synthetic Lcom/google/android/gms/internal/ads/eq2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/cq2;

.field private final c:Lcom/google/android/gms/ads/v/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/cq2;Lcom/google/android/gms/ads/v/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eq2;->b:Lcom/google/android/gms/internal/ads/cq2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eq2;->c:Lcom/google/android/gms/ads/v/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eq2;->b:Lcom/google/android/gms/internal/ads/cq2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eq2;->c:Lcom/google/android/gms/ads/v/c;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/cq2;->a(Lcom/google/android/gms/ads/v/c;)V

    return-void
.end method
