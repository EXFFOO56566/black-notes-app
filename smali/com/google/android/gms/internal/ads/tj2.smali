.class final synthetic Lcom/google/android/gms/internal/ads/tj2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/qj2;

.field private final c:Lcom/google/android/gms/internal/ads/jj2;

.field private final d:Lcom/google/android/gms/internal/ads/ij2;

.field private final e:Lcom/google/android/gms/internal/ads/ro;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/qj2;Lcom/google/android/gms/internal/ads/jj2;Lcom/google/android/gms/internal/ads/ij2;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tj2;->b:Lcom/google/android/gms/internal/ads/qj2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/tj2;->c:Lcom/google/android/gms/internal/ads/jj2;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/tj2;->d:Lcom/google/android/gms/internal/ads/ij2;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/tj2;->e:Lcom/google/android/gms/internal/ads/ro;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tj2;->b:Lcom/google/android/gms/internal/ads/qj2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tj2;->c:Lcom/google/android/gms/internal/ads/jj2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tj2;->d:Lcom/google/android/gms/internal/ads/ij2;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/tj2;->e:Lcom/google/android/gms/internal/ads/ro;

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/jj2;->A()Lcom/google/android/gms/internal/ads/nj2;

    move-result-object v1

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/nj2;->a(Lcom/google/android/gms/internal/ads/ij2;)Lcom/google/android/gms/internal/ads/hj2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/hj2;->d()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "No entry contents."

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/qj2;->c:Lcom/google/android/gms/internal/ads/oj2;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/oj2;->a(Lcom/google/android/gms/internal/ads/oj2;)V

    return-void

    :cond_0
    new-instance v2, Lcom/google/android/gms/internal/ads/vj2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/hj2;->e()Ljava/io/InputStream;

    move-result-object v1

    const/4 v4, 0x1

    invoke-direct {v2, v0, v1, v4}, Lcom/google/android/gms/internal/ads/vj2;-><init>(Lcom/google/android/gms/internal/ads/qj2;Ljava/io/InputStream;I)V

    invoke-virtual {v2}, Ljava/io/PushbackInputStream;->read()I

    move-result v1

    const/4 v4, -0x1

    if-eq v1, v4, :cond_1

    invoke-virtual {v2, v1}, Ljava/io/PushbackInputStream;->unread(I)V

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/ro;->b(Ljava/lang/Object;)Z

    return-void

    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Unable to read from cache."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    const-string v2, "Unable to obtain a cache service instance."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/qj2;->c:Lcom/google/android/gms/internal/ads/oj2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/oj2;->a(Lcom/google/android/gms/internal/ads/oj2;)V

    return-void
.end method
