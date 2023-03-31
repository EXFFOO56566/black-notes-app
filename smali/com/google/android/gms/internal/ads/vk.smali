.class final Lcom/google/android/gms/internal/ads/vk;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/sk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/sk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vk;->b:Lcom/google/android/gms/internal/ads/sk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vk;->b:Lcom/google/android/gms/internal/ads/sk;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/sk;->a(Lcom/google/android/gms/internal/ads/sk;Ljava/lang/Thread;)Ljava/lang/Thread;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vk;->b:Lcom/google/android/gms/internal/ads/sk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sk;->a()V

    return-void
.end method
