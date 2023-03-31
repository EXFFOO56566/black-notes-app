.class public final Lcom/google/android/gms/internal/ads/s52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# static fields
.field private static final n:Landroid/os/Handler;


# instance fields
.field private final b:Landroid/content/Context;

.field private c:Landroid/app/Application;

.field private final d:Landroid/os/PowerManager;

.field private final e:Landroid/app/KeyguardManager;

.field private f:Landroid/content/BroadcastReceiver;

.field private final g:Lcom/google/android/gms/internal/ads/j52;

.field private h:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/ViewTreeObserver;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/google/android/gms/internal/ads/mx1;

.field private k:B

.field private l:I

.field private m:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/s52;->n:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/j52;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/android/gms/internal/ads/s52;->k:B

    iput v0, p0, Lcom/google/android/gms/internal/ads/s52;->l:I

    const-wide/16 v0, -0x3

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s52;->m:J

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/s52;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/s52;->g:Lcom/google/android/gms/internal/ads/j52;

    const-string p2, "power"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/s52;->d:Landroid/os/PowerManager;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/s52;->b:Landroid/content/Context;

    const-string p2, "keyguard"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/KeyguardManager;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/s52;->e:Landroid/app/KeyguardManager;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/s52;->b:Landroid/content/Context;

    instance-of p2, p1, Landroid/app/Application;

    if-eqz p2, :cond_0

    move-object p2, p1

    check-cast p2, Landroid/app/Application;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/s52;->c:Landroid/app/Application;

    new-instance p2, Lcom/google/android/gms/internal/ads/mx1;

    check-cast p1, Landroid/app/Application;

    invoke-direct {p2, p1, p0}, Lcom/google/android/gms/internal/ads/mx1;-><init>(Landroid/app/Application;Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/s52;->j:Lcom/google/android/gms/internal/ads/mx1;

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/s52;->a(Landroid/view/View;)V

    return-void
.end method

.method private final a(Landroid/app/Activity;I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s52;->i:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->b()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    if-ne v0, p1, :cond_2

    iput p2, p0, Lcom/google/android/gms/internal/ads/s52;->l:I

    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/s52;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    return-void
.end method

.method private final b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s52;->i:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final b(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/s52;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/s52;->f:Landroid/content/BroadcastReceiver;

    if-nez p1, :cond_1

    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/u52;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/u52;-><init>(Lcom/google/android/gms/internal/ads/s52;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/s52;->f:Landroid/content/BroadcastReceiver;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/s52;->b:Landroid/content/Context;

    invoke-virtual {v1, v0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/s52;->c:Landroid/app/Application;

    if-eqz p1, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s52;->j:Lcom/google/android/gms/internal/ads/mx1;

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    return-void
.end method

.method private final c()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/s52;->n:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/ads/v52;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/v52;-><init>(Lcom/google/android/gms/internal/ads/s52;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private final c(Landroid/view/View;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/s52;->h:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/s52;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/s52;->h:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    nop

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/s52;->f:Landroid/content/BroadcastReceiver;

    if-eqz p1, :cond_3

    :try_start_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/s52;->b:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/s52;->f:Landroid/content/BroadcastReceiver;

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/s52;->c:Landroid/app/Application;

    if-eqz p1, :cond_4

    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s52;->j:Lcom/google/android/gms/internal/ads/mx1;

    invoke-virtual {p1, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_4
    return-void
.end method

.method private final d()V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s52;->i:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->b()Landroid/view/View;

    move-result-object v0

    const/4 v1, -0x1

    const-wide/16 v2, -0x3

    if-nez v0, :cond_1

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/s52;->m:J

    iput-byte v1, p0, Lcom/google/android/gms/internal/ads/s52;->k:B

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v7

    if-nez v7, :cond_3

    or-int/lit8 v4, v4, 0x2

    int-to-byte v4, v4

    :cond_3
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/s52;->d:Landroid/os/PowerManager;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v7

    if-nez v7, :cond_4

    or-int/lit8 v4, v4, 0x4

    int-to-byte v4, v4

    :cond_4
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/s52;->g:Lcom/google/android/gms/internal/ads/j52;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/j52;->a()Z

    move-result v7

    if-nez v7, :cond_8

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/s52;->e:Landroid/app/KeyguardManager;

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/q52;->a(Landroid/view/View;)Landroid/app/Activity;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v7

    if-nez v7, :cond_5

    const/4 v7, 0x0

    goto :goto_1

    :cond_5
    invoke-virtual {v7}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v7

    :goto_1
    if-eqz v7, :cond_6

    iget v7, v7, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v8, 0x80000

    and-int/2addr v7, v8

    if-eqz v7, :cond_6

    const/4 v7, 0x1

    goto :goto_2

    :cond_6
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_7

    goto :goto_3

    :cond_7
    const/4 v5, 0x0

    :cond_8
    :goto_3
    if-nez v5, :cond_9

    or-int/lit8 v4, v4, 0x8

    int-to-byte v4, v4

    :cond_9
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, v5}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v5

    if-nez v5, :cond_a

    or-int/lit8 v4, v4, 0x10

    int-to-byte v4, v4

    :cond_a
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, v5}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v5

    if-nez v5, :cond_b

    or-int/lit8 v4, v4, 0x20

    int-to-byte v4, v4

    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    iget v5, p0, Lcom/google/android/gms/internal/ads/s52;->l:I

    if-eq v5, v1, :cond_c

    move v0, v5

    :cond_c
    if-eqz v0, :cond_d

    or-int/lit8 v0, v4, 0x40

    int-to-byte v4, v0

    :cond_d
    iget-byte v0, p0, Lcom/google/android/gms/internal/ads/s52;->k:B

    if-eq v0, v4, :cond_f

    iput-byte v4, p0, Lcom/google/android/gms/internal/ads/s52;->k:B

    if-nez v4, :cond_e

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    goto :goto_4

    :cond_e
    int-to-long v0, v4

    sub-long v0, v2, v0

    :goto_4
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s52;->m:J

    :cond_f
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 5

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/s52;->m:J

    const-wide/16 v2, -0x2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->b()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, -0x3

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s52;->m:J

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/s52;->m:J

    return-wide v0
.end method

.method final a(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->b()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/s52;->c(Landroid/view/View;)V

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/s52;->i:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/s52;->b(Landroid/view/View;)V

    :cond_3
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    const-wide/16 v0, -0x2

    :goto_2
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/s52;->m:J

    return-void

    :cond_4
    const-wide/16 v0, -0x3

    goto :goto_2
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/s52;->a(Landroid/app/Activity;I)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/s52;->a(Landroid/app/Activity;I)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/s52;->a(Landroid/app/Activity;I)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->c()V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/s52;->a(Landroid/app/Activity;I)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    return-void
.end method

.method public final onGlobalLayout()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    return-void
.end method

.method public final onScrollChanged()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/s52;->l:I

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/s52;->b(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/s52;->l:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->d()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/s52;->c()V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/s52;->c(Landroid/view/View;)V

    return-void
.end method
