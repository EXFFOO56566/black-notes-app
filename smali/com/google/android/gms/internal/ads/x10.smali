.class final synthetic Lcom/google/android/gms/internal/ads/x10;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/v10;

.field private final c:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/v10;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x10;->b:Lcom/google/android/gms/internal/ads/v10;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/x10;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x10;->b:Lcom/google/android/gms/internal/ads/v10;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/x10;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/v10;->a(Ljava/lang/Runnable;)V

    return-void
.end method
