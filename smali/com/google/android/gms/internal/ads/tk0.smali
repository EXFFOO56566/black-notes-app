.class final Lcom/google/android/gms/internal/ads/tk0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/i;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/pk0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/pk0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tk0;->b:Lcom/google/android/gms/internal/ads/pk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final K()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tk0;->b:Lcom/google/android/gms/internal/ads/pk0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/pk0;->a(Lcom/google/android/gms/internal/ads/pk0;)Lcom/google/android/gms/internal/ads/e80;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/e80;->onPause()V

    return-void
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tk0;->b:Lcom/google/android/gms/internal/ads/pk0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/pk0;->a(Lcom/google/android/gms/internal/ads/pk0;)Lcom/google/android/gms/internal/ads/e80;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/e80;->onResume()V

    return-void
.end method
