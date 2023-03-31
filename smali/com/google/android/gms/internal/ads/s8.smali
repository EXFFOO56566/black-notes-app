.class public final Lcom/google/android/gms/internal/ads/s8;
.super Lcom/google/android/gms/internal/ads/yo;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/yo<",
        "Lcom/google/android/gms/internal/ads/e9;",
        ">;"
    }
.end annotation


# instance fields
.field private final c:Ljava/lang/Object;

.field private final d:Lcom/google/android/gms/internal/ads/w8;

.field private e:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/w8;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/yo;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/s8;->c:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/s8;->d:Lcom/google/android/gms/internal/ads/w8;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/s8;)Lcom/google/android/gms/internal/ads/w8;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/s8;->d:Lcom/google/android/gms/internal/ads/w8;

    return-object p0
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s8;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/s8;->e:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/s8;->e:Z

    new-instance v1, Lcom/google/android/gms/internal/ads/v8;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/v8;-><init>(Lcom/google/android/gms/internal/ads/s8;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/wo;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/wo;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/ads/yo;->a(Lcom/google/android/gms/internal/ads/vo;Lcom/google/android/gms/internal/ads/to;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/u8;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/u8;-><init>(Lcom/google/android/gms/internal/ads/s8;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/x8;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/x8;-><init>(Lcom/google/android/gms/internal/ads/s8;)V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/ads/yo;->a(Lcom/google/android/gms/internal/ads/vo;Lcom/google/android/gms/internal/ads/to;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
