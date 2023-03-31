.class public final Lcom/google/android/gms/internal/ads/x2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/s/i;


# static fields
.field private static c:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/os/IBinder;",
            "Lcom/google/android/gms/internal/ads/x2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/s2;

.field private final b:Lcom/google/android/gms/ads/s/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/x2;->c:Ljava/util/WeakHashMap;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ads/s2;)V
    .locals 4

    const-string v0, ""

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lcom/google/android/gms/ads/p;

    invoke-direct {v1}, Lcom/google/android/gms/ads/p;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x2;->a:Lcom/google/android/gms/internal/ads/s2;

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/s2;->P0()Lb/c/b/a/d/a;

    move-result-object p1

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_1

    new-instance v2, Lcom/google/android/gms/ads/s/b;

    invoke-direct {v2, p1}, Lcom/google/android/gms/ads/s/b;-><init>(Landroid/content/Context;)V

    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/x2;->a:Lcom/google/android/gms/internal/ads/s2;

    invoke-static {v2}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v3

    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/s2;->O(Lb/c/b/a/d/a;)Z

    move-result p1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    move-object v1, v2

    goto :goto_2

    :catch_2
    move-exception p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/x2;->b:Lcom/google/android/gms/ads/s/b;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/s2;)Lcom/google/android/gms/internal/ads/x2;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/x2;->c:Ljava/util/WeakHashMap;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/x2;->c:Ljava/util/WeakHashMap;

    invoke-interface {p0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/x2;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/x2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/x2;-><init>(Lcom/google/android/gms/internal/ads/s2;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/x2;->c:Ljava/util/WeakHashMap;

    invoke-interface {p0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p0

    invoke-virtual {v2, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final Y()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x2;->a:Lcom/google/android/gms/internal/ads/s2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/s2;->Y()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a()Lcom/google/android/gms/internal/ads/s2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x2;->a:Lcom/google/android/gms/internal/ads/s2;

    return-object v0
.end method
