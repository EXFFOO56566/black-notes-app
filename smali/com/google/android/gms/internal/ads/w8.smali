.class public final Lcom/google/android/gms/internal/ads/w8;
.super Lcom/google/android/gms/internal/ads/yo;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/yo<",
        "Lcom/google/android/gms/internal/ads/r7;",
        ">;"
    }
.end annotation


# instance fields
.field private final c:Ljava/lang/Object;

.field private d:Lcom/google/android/gms/internal/ads/mm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/mm<",
            "Lcom/google/android/gms/internal/ads/r7;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/mm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/mm<",
            "Lcom/google/android/gms/internal/ads/r7;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/yo;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/w8;->c:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/w8;->d:Lcom/google/android/gms/internal/ads/mm;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/w8;->e:Z

    iput p1, p0, Lcom/google/android/gms/internal/ads/w8;->f:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/w8;)Lcom/google/android/gms/internal/ads/mm;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/w8;->d:Lcom/google/android/gms/internal/ads/mm;

    return-object p0
.end method

.method private final f()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/w8;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/w8;->f:I

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/common/internal/r;->b(Z)V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/w8;->e:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/ads/w8;->f:I

    if-nez v1, :cond_1

    const-string v1, "No reference is left (including root). Cleaning up engine."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/c9;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/c9;-><init>(Lcom/google/android/gms/internal/ads/w8;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/wo;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/wo;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/ads/yo;->a(Lcom/google/android/gms/internal/ads/vo;Lcom/google/android/gms/internal/ads/to;)V

    goto :goto_1

    :cond_1
    const-string v1, "There are still references to the engine. Not destroying."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/internal/ads/s8;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/s8;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/s8;-><init>(Lcom/google/android/gms/internal/ads/w8;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/w8;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/ads/z8;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/z8;-><init>(Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/s8;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/y8;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/y8;-><init>(Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/s8;)V

    invoke-virtual {p0, v2, v3}, Lcom/google/android/gms/internal/ads/yo;->a(Lcom/google/android/gms/internal/ads/vo;Lcom/google/android/gms/internal/ads/to;)V

    iget v2, p0, Lcom/google/android/gms/internal/ads/w8;->f:I

    const/4 v3, 0x1

    if-ltz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lcom/google/android/gms/common/internal/r;->b(Z)V

    iget v2, p0, Lcom/google/android/gms/internal/ads/w8;->f:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/google/android/gms/internal/ads/w8;->f:I

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected final d()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/w8;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/w8;->f:I

    const/4 v2, 0x1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/common/internal/r;->b(Z)V

    const-string v1, "Releasing 1 reference for JS Engine"

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    iget v1, p0, Lcom/google/android/gms/internal/ads/w8;->f:I

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/google/android/gms/internal/ads/w8;->f:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/w8;->f()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/w8;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/w8;->f:I

    const/4 v2, 0x1

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/common/internal/r;->b(Z)V

    const-string v1, "Releasing root reference. JS Engine will be destroyed once other references are released."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/w8;->e:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/w8;->f()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
