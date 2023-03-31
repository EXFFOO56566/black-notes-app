.class public final Lcom/google/android/gms/internal/ads/nz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/fh2;


# instance fields
.field private b:Lcom/google/android/gms/internal/ads/ws;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Lcom/google/android/gms/internal/ads/cz;

.field private final e:Lcom/google/android/gms/common/util/d;

.field private f:Z

.field private g:Z

.field private h:Lcom/google/android/gms/internal/ads/gz;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/cz;Lcom/google/android/gms/common/util/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/nz;->f:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/nz;->g:Z

    new-instance v0, Lcom/google/android/gms/internal/ads/gz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/gz;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/nz;->h:Lcom/google/android/gms/internal/ads/gz;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nz;->c:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nz;->d:Lcom/google/android/gms/internal/ads/cz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/nz;->e:Lcom/google/android/gms/common/util/d;

    return-void
.end method

.method private final p()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nz;->d:Lcom/google/android/gms/internal/ads/cz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nz;->h:Lcom/google/android/gms/internal/ads/gz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/cz;->a(Lcom/google/android/gms/internal/ads/gz;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nz;->b:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nz;->c:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/rz;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/rz;-><init>(Lcom/google/android/gms/internal/ads/nz;Lorg/json/JSONObject;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to call video active view js"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/hh2;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nz;->h:Lcom/google/android/gms/internal/ads/gz;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/nz;->g:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v1, p1, Lcom/google/android/gms/internal/ads/hh2;->j:Z

    :goto_0
    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/gz;->a:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nz;->h:Lcom/google/android/gms/internal/ads/gz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nz;->e:Lcom/google/android/gms/common/util/d;

    invoke-interface {v1}, Lcom/google/android/gms/common/util/d;->b()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/gz;->c:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nz;->h:Lcom/google/android/gms/internal/ads/gz;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/gz;->e:Lcom/google/android/gms/internal/ads/hh2;

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/nz;->f:Z

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/nz;->p()V

    :cond_1
    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ws;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nz;->b:Lcom/google/android/gms/internal/ads/ws;

    return-void
.end method

.method final synthetic a(Lorg/json/JSONObject;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nz;->b:Lcom/google/android/gms/internal/ads/ws;

    const-string v1, "AFMA_updateActiveView"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/c8;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/nz;->g:Z

    return-void
.end method

.method public final j()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/nz;->f:Z

    return-void
.end method

.method public final l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/nz;->f:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/nz;->p()V

    return-void
.end method
