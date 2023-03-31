.class final synthetic Lcom/google/android/gms/internal/ads/b9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/c9;

.field private final c:Lcom/google/android/gms/internal/ads/r7;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/c9;Lcom/google/android/gms/internal/ads/r7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/b9;->b:Lcom/google/android/gms/internal/ads/c9;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/b9;->c:Lcom/google/android/gms/internal/ads/r7;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/b9;->b:Lcom/google/android/gms/internal/ads/c9;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/b9;->c:Lcom/google/android/gms/internal/ads/r7;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c9;->a:Lcom/google/android/gms/internal/ads/w8;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/w8;->a(Lcom/google/android/gms/internal/ads/w8;)Lcom/google/android/gms/internal/ads/mm;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/mm;->a(Ljava/lang/Object;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/r7;->destroy()V

    return-void
.end method
