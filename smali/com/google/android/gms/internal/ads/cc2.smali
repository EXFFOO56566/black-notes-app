.class final Lcom/google/android/gms/internal/ads/cc2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/gh2;

.field private final c:Lcom/google/android/gms/internal/ads/ar2;

.field private final d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/gh2;Lcom/google/android/gms/internal/ads/ar2;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cc2;->b:Lcom/google/android/gms/internal/ads/gh2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cc2;->c:Lcom/google/android/gms/internal/ads/ar2;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/cc2;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cc2;->b:Lcom/google/android/gms/internal/ads/gh2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gh2;->f()Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cc2;->c:Lcom/google/android/gms/internal/ads/ar2;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ar2;->c:Lcom/google/android/gms/internal/ads/e3;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cc2;->b:Lcom/google/android/gms/internal/ads/gh2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cc2;->c:Lcom/google/android/gms/internal/ads/ar2;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/ar2;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/gh2;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cc2;->b:Lcom/google/android/gms/internal/ads/gh2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cc2;->c:Lcom/google/android/gms/internal/ads/ar2;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/ar2;->c:Lcom/google/android/gms/internal/ads/e3;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/gh2;->a(Lcom/google/android/gms/internal/ads/e3;)V

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cc2;->c:Lcom/google/android/gms/internal/ads/ar2;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/ar2;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cc2;->b:Lcom/google/android/gms/internal/ads/gh2;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/gh2;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cc2;->b:Lcom/google/android/gms/internal/ads/gh2;

    const-string v1, "done"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/gh2;->b(Ljava/lang/String;)V

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cc2;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-void
.end method
