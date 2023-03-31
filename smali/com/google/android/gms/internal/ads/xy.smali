.class final synthetic Lcom/google/android/gms/internal/ads/xy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/yy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/yy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xy;->b:Lcom/google/android/gms/internal/ads/yy;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xy;->b:Lcom/google/android/gms/internal/ads/yy;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/yy;->a:Lcom/google/android/gms/internal/ads/vy;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vy;->b(Lcom/google/android/gms/internal/ads/vy;)Lcom/google/android/gms/internal/ads/ez;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ez;->j()V

    return-void
.end method
