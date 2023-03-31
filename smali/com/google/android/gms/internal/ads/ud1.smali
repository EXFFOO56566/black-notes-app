.class public Lcom/google/android/gms/internal/ads/ud1;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final c:Landroid/os/ConditionVariable;

.field protected static volatile d:Lcom/google/android/gms/internal/ads/ak2;

.field private static volatile e:Ljava/util/Random;


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/l52;

.field protected volatile b:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0}, Landroid/os/ConditionVariable;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/ud1;->c:Landroid/os/ConditionVariable;

    const/4 v0, 0x0

    sput-object v0, Lcom/google/android/gms/internal/ads/ud1;->d:Lcom/google/android/gms/internal/ads/ak2;

    sput-object v0, Lcom/google/android/gms/internal/ads/ud1;->e:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/l52;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ud1;->a:Lcom/google/android/gms/internal/ads/l52;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/l52;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/xg1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/xg1;-><init>(Lcom/google/android/gms/internal/ads/ud1;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a()I
    .locals 2

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {}, Ljava/util/concurrent/ThreadLocalRandom;->current()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadLocalRandom;->nextInt()I

    move-result v0

    return v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/ud1;->b()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/ud1;->b()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ud1;)Lcom/google/android/gms/internal/ads/l52;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ud1;->a:Lcom/google/android/gms/internal/ads/l52;

    return-object p0
.end method

.method private static b()Ljava/util/Random;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/ud1;->e:Ljava/util/Random;

    if-nez v0, :cond_1

    const-class v0, Lcom/google/android/gms/internal/ads/ud1;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/ud1;->e:Ljava/util/Random;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/ads/ud1;->e:Ljava/util/Random;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/ud1;->e:Ljava/util/Random;

    return-object v0
.end method

.method static synthetic c()Landroid/os/ConditionVariable;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/ud1;->c:Landroid/os/ConditionVariable;

    return-object v0
.end method


# virtual methods
.method public final a(IIJ)V
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-wide v3, p3

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/ud1;->a(IIJLjava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public final a(IIJLjava/lang/String;)V
    .locals 7

    const/4 v2, -0x1

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/ud1;->a(IIJLjava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public final a(IIJLjava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/ud1;->c:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ud1;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/google/android/gms/internal/ads/ud1;->d:Lcom/google/android/gms/internal/ads/ak2;

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/internal/ads/q00;->p()Lcom/google/android/gms/internal/ads/q00$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ud1;->a:Lcom/google/android/gms/internal/ads/l52;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/l52;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/q00$a;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/q00$a;

    invoke-virtual {v0, p3, p4}, Lcom/google/android/gms/internal/ads/q00$a;->a(J)Lcom/google/android/gms/internal/ads/q00$a;

    if-eqz p5, :cond_0

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/ads/q00$a;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/q00$a;

    :cond_0
    if-eqz p6, :cond_1

    new-instance p3, Ljava/io/StringWriter;

    invoke-direct {p3}, Ljava/io/StringWriter;-><init>()V

    new-instance p4, Ljava/io/PrintWriter;

    invoke-direct {p4, p3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-static {p6, p4}, Lcom/google/android/gms/internal/ads/kx1;->a(Ljava/lang/Throwable;Ljava/io/PrintWriter;)V

    invoke-virtual {p3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/q00$a;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/q00$a;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/q00$a;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/q00$a;

    :cond_1
    sget-object p3, Lcom/google/android/gms/internal/ads/ud1;->d:Lcom/google/android/gms/internal/ads/ak2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p4, Lcom/google/android/gms/internal/ads/q00;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/tx1;->f()[B

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/ads/ak2;->a([B)Lcom/google/android/gms/internal/ads/fk2;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/fk2;->b(I)Lcom/google/android/gms/internal/ads/fk2;

    const/4 p1, -0x1

    if-eq p2, p1, :cond_2

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/fk2;->a(I)Lcom/google/android/gms/internal/ads/fk2;

    :cond_2
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/fk2;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-void
.end method
