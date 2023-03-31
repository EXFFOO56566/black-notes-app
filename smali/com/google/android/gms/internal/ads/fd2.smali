.class final Lcom/google/android/gms/internal/ads/fd2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Ljava/io/IOException;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/ad2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ad2;Ljava/io/IOException;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fd2;->c:Lcom/google/android/gms/internal/ads/ad2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fd2;->b:Ljava/io/IOException;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fd2;->c:Lcom/google/android/gms/internal/ads/ad2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ad2;->e(Lcom/google/android/gms/internal/ads/ad2;)Lcom/google/android/gms/internal/ads/id2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fd2;->b:Ljava/io/IOException;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/id2;->a(Ljava/io/IOException;)V

    return-void
.end method
