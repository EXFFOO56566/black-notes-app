.class public final Lcom/google/android/gms/internal/ads/vr;
.super Lcom/google/android/gms/internal/ads/sk;
.source ""


# instance fields
.field final c:Lcom/google/android/gms/internal/ads/gq;

.field final d:Lcom/google/android/gms/internal/ads/wr;

.field private final e:Ljava/lang/String;

.field private final f:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gq;Lcom/google/android/gms/internal/ads/wr;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sk;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vr;->c:Lcom/google/android/gms/internal/ads/gq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/vr;->d:Lcom/google/android/gms/internal/ads/wr;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/vr;->e:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/vr;->f:[Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->y()Lcom/google/android/gms/internal/ads/xr;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/xr;->a(Lcom/google/android/gms/internal/ads/vr;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vr;->d:Lcom/google/android/gms/internal/ads/wr;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vr;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/vr;->f:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/wr;->a(Ljava/lang/String;[Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/ur;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/ur;-><init>(Lcom/google/android/gms/internal/ads/vr;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v2, Lcom/google/android/gms/internal/ads/ur;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/ur;-><init>(Lcom/google/android/gms/internal/ads/vr;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v0
.end method
