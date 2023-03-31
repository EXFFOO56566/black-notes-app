.class final Lcom/google/android/gms/internal/ads/iq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private b:Lcom/google/android/gms/internal/ads/tp;

.field private c:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/tp;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/iq;->c:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iq;->b:Lcom/google/android/gms/internal/ads/tp;

    return-void
.end method

.method private final c()V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/iq;->c:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iq;->b:Lcom/google/android/gms/internal/ads/tp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/tp;->o()V

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/iq;->c:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iq;->c()V

    return-void
.end method

.method public final run()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/iq;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iq;->b:Lcom/google/android/gms/internal/ads/tp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/tp;->o()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iq;->c()V

    :cond_0
    return-void
.end method
