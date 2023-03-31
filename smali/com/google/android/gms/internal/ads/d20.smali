.class public final Lcom/google/android/gms/internal/ads/d20;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/n60;
.implements Lcom/google/android/gms/internal/ads/l70;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/ws;

.field private final d:Lcom/google/android/gms/internal/ads/id1;

.field private final e:Lcom/google/android/gms/internal/ads/fo;

.field private f:Lb/c/b/a/d/a;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private g:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/fo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d20;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/d20;->c:Lcom/google/android/gms/internal/ads/ws;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/d20;->d:Lcom/google/android/gms/internal/ads/id1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/d20;->e:Lcom/google/android/gms/internal/ads/fo;

    return-void
.end method

.method private final declared-synchronized a()V
    .locals 10

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->d:Lcom/google/android/gms/internal/ads/id1;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/id1;->J:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->c:Lcom/google/android/gms/internal/ads/ws;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->r()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/d20;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/yd;->b(Landroid/content/Context;)Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->e:Lcom/google/android/gms/internal/ads/fo;

    iget v0, v0, Lcom/google/android/gms/internal/ads/fo;->c:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/d20;->e:Lcom/google/android/gms/internal/ads/fo;

    iget v1, v1, Lcom/google/android/gms/internal/ads/fo;->d:I

    const/16 v2, 0x17

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->d:Lcom/google/android/gms/internal/ads/id1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/id1;->L:Lorg/json/JSONObject;

    const-string v1, "media_type"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    const-string v0, "javascript"

    :goto_0
    move-object v9, v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->r()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getWebView()Landroid/webkit/WebView;

    move-result-object v6

    const-string v7, ""

    const-string v8, "javascript"

    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/yd;->a(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lb/c/b/a/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->f:Lb/c/b/a/d/a;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/d20;->f:Lb/c/b/a/d/a;

    if-eqz v1, :cond_4

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->r()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/d20;->f:Lb/c/b/a/d/a;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/yd;->a(Lb/c/b/a/d/a;Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->c:Lcom/google/android/gms/internal/ads/ws;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/d20;->f:Lb/c/b/a/d/a;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ws;->a(Lb/c/b/a/d/a;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->r()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/d20;->f:Lb/c/b/a/d/a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/yd;->a(Lb/c/b/a/d/a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/d20;->g:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized K()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/d20;->g:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/d20;->a()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->d:Lcom/google/android/gms/internal/ads/id1;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/id1;->J:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->f:Lb/c/b/a/d/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->c:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d20;->c:Lcom/google/android/gms/internal/ads/ws;

    const-string v1, "onSdkImpression"

    new-instance v2, La/e/a;

    invoke-direct {v2}, La/e/a;-><init>()V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/e7;->a(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized s()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/d20;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/d20;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
