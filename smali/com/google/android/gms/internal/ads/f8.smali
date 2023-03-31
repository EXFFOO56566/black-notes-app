.class public final Lcom/google/android/gms/internal/ads/f8;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/google/android/gms/internal/ads/fo;

.field private e:Lcom/google/android/gms/internal/ads/mm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/mm<",
            "Lcom/google/android/gms/internal/ads/r7;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/android/gms/internal/ads/mm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/mm<",
            "Lcom/google/android/gms/internal/ads/r7;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/android/gms/internal/ads/w8;

.field private h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/f8;->a:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/f8;->h:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/f8;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/f8;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/f8;->d:Lcom/google/android/gms/internal/ads/fo;

    new-instance p1, Lcom/google/android/gms/internal/ads/t8;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/t8;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/f8;->e:Lcom/google/android/gms/internal/ads/mm;

    new-instance p1, Lcom/google/android/gms/internal/ads/t8;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/t8;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/f8;->f:Lcom/google/android/gms/internal/ads/mm;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Ljava/lang/String;Lcom/google/android/gms/internal/ads/mm;Lcom/google/android/gms/internal/ads/mm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/internal/ads/fo;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/mm<",
            "Lcom/google/android/gms/internal/ads/r7;",
            ">;",
            "Lcom/google/android/gms/internal/ads/mm<",
            "Lcom/google/android/gms/internal/ads/r7;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/f8;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/f8;->e:Lcom/google/android/gms/internal/ads/mm;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/f8;->f:Lcom/google/android/gms/internal/ads/mm;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/f8;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/f8;->h:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;)Lcom/google/android/gms/internal/ads/w8;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/f8;->g:Lcom/google/android/gms/internal/ads/w8;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/f8;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/f8;->a:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/f8;)Lcom/google/android/gms/internal/ads/w8;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/f8;->g:Lcom/google/android/gms/internal/ads/w8;

    return-object p0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/f8;)Lcom/google/android/gms/internal/ads/mm;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/f8;->e:Lcom/google/android/gms/internal/ads/mm;

    return-object p0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ads/f8;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/f8;->h:I

    return p0
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/internal/ads/eq1;)Lcom/google/android/gms/internal/ads/w8;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/w8;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/f8;->f:Lcom/google/android/gms/internal/ads/mm;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/w8;-><init>(Lcom/google/android/gms/internal/ads/mm;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/jo;->e:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v2, Lcom/google/android/gms/internal/ads/e8;

    invoke-direct {v2, p0, p1, v0}, Lcom/google/android/gms/internal/ads/e8;-><init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/w8;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/o8;

    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/ads/o8;-><init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/r8;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/r8;-><init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/yo;->a(Lcom/google/android/gms/internal/ads/vo;Lcom/google/android/gms/internal/ads/to;)V

    return-object v0
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/w8;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f8;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/f8;->d:Lcom/google/android/gms/internal/ads/fo;

    sget-object v2, Lcom/google/android/gms/internal/ads/c1;->c:Lcom/google/android/gms/internal/ads/b0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/b0;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lcom/google/android/gms/internal/ads/d7;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/d7;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/google/android/gms/internal/ads/t7;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, p1, v3}, Lcom/google/android/gms/internal/ads/t7;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/ads/internal/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/ads/j8;

    invoke-direct {v0, p0, p2, v2}, Lcom/google/android/gms/internal/ads/j8;-><init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/r7;)V

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/r7;->a(Lcom/google/android/gms/internal/ads/u7;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/k8;

    invoke-direct {v0, p0, p2, v2}, Lcom/google/android/gms/internal/ads/k8;-><init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/r7;)V

    const-string v1, "/jsLoaded"

    invoke-interface {v2, v1, v0}, Lcom/google/android/gms/internal/ads/e9;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/hn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/hn;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/n8;

    invoke-direct {v1, p0, p1, v2, v0}, Lcom/google/android/gms/internal/ads/n8;-><init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/r7;Lcom/google/android/gms/internal/ads/hn;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/hn;->a(Ljava/lang/Object;)V

    const-string p1, "/requestReload"

    invoke-interface {v2, p1, v1}, Lcom/google/android/gms/internal/ads/e9;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/f8;->c:Ljava/lang/String;

    const-string v0, ".js"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/f8;->c:Ljava/lang/String;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/ads/r7;->c(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/f8;->c:Ljava/lang/String;

    const-string v0, "<html>"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/f8;->c:Ljava/lang/String;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/ads/r7;->e(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/f8;->c:Ljava/lang/String;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/ads/r7;->f(Ljava/lang/String;)V

    :goto_1
    sget-object p1, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v0, Lcom/google/android/gms/internal/ads/m8;

    invoke-direct {v0, p0, p2, v2}, Lcom/google/android/gms/internal/ads/m8;-><init>(Lcom/google/android/gms/internal/ads/f8;Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/r7;)V

    sget p2, Lcom/google/android/gms/internal/ads/q8;->a:I

    int-to-long v1, p2

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "Error creating webview."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object v0

    const-string v1, "SdkJavascriptFactory.loadJavascriptEngine"

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/ik;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/yo;->b()V

    return-void
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/r7;)V
    .locals 0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/r7;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/f8;->h:I

    :cond_0
    return-void
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/r7;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f8;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/yo;->a()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/yo;->a()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/yo;->b()V

    sget-object p1, Lcom/google/android/gms/internal/ads/jo;->e:Lcom/google/android/gms/internal/ads/ko1;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/l8;->a(Lcom/google/android/gms/internal/ads/r7;)Ljava/lang/Runnable;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    const-string p1, "Could not receive loaded message in a timely manner. Rejecting."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/eq1;)Lcom/google/android/gms/internal/ads/s8;
    .locals 4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/f8;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f8;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/f8;->g:Lcom/google/android/gms/internal/ads/w8;

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/google/android/gms/internal/ads/f8;->h:I

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/f8;->g:Lcom/google/android/gms/internal/ads/w8;

    new-instance v2, Lcom/google/android/gms/internal/ads/h8;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/h8;-><init>(Lcom/google/android/gms/internal/ads/f8;)V

    sget-object v3, Lcom/google/android/gms/internal/ads/g8;->a:Lcom/google/android/gms/internal/ads/to;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/yo;->a(Lcom/google/android/gms/internal/ads/vo;Lcom/google/android/gms/internal/ads/to;)V

    :cond_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f8;->g:Lcom/google/android/gms/internal/ads/w8;

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f8;->g:Lcom/google/android/gms/internal/ads/w8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/yo;->a()I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/f8;->h:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f8;->g:Lcom/google/android/gms/internal/ads/w8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/w8;->c()Lcom/google/android/gms/internal/ads/s8;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/f8;->h:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_3

    iput v2, p0, Lcom/google/android/gms/internal/ads/f8;->h:I

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/eq1;)Lcom/google/android/gms/internal/ads/w8;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f8;->g:Lcom/google/android/gms/internal/ads/w8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/w8;->c()Lcom/google/android/gms/internal/ads/s8;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/f8;->h:I

    if-ne v0, v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f8;->g:Lcom/google/android/gms/internal/ads/w8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/w8;->c()Lcom/google/android/gms/internal/ads/s8;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f8;->g:Lcom/google/android/gms/internal/ads/w8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/w8;->c()Lcom/google/android/gms/internal/ads/s8;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_5
    :goto_0
    iput v2, p0, Lcom/google/android/gms/internal/ads/f8;->h:I

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/f8;->a(Lcom/google/android/gms/internal/ads/eq1;)Lcom/google/android/gms/internal/ads/w8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/f8;->g:Lcom/google/android/gms/internal/ads/w8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/w8;->c()Lcom/google/android/gms/internal/ads/s8;

    move-result-object v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1

    :catchall_1
    move-exception v0

    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method
