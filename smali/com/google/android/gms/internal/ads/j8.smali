.class final synthetic Lcom/google/android/gms/internal/ads/j8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/u7;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/f8;

.field private final b:Lcom/google/android/gms/internal/ads/w8;

.field private final c:Lcom/google/android/gms/internal/ads/r7;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/r7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j8;->a:Lcom/google/android/gms/internal/ads/f8;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/j8;->b:Lcom/google/android/gms/internal/ads/w8;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/j8;->c:Lcom/google/android/gms/internal/ads/r7;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j8;->a:Lcom/google/android/gms/internal/ads/f8;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/j8;->b:Lcom/google/android/gms/internal/ads/w8;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/j8;->c:Lcom/google/android/gms/internal/ads/r7;

    sget-object v3, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v4, Lcom/google/android/gms/internal/ads/i8;

    invoke-direct {v4, v0, v1, v2}, Lcom/google/android/gms/internal/ads/i8;-><init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/r7;)V

    sget v0, Lcom/google/android/gms/internal/ads/q8;->b:I

    int-to-long v0, v0

    invoke-virtual {v3, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
