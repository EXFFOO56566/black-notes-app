.class public final Lcom/google/android/gms/auth/api/signin/internal/o;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static b:Lcom/google/android/gms/auth/api/signin/internal/o;


# instance fields
.field private a:Lcom/google/android/gms/auth/api/signin/internal/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/internal/c;->a(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/c;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/internal/o;->a:Lcom/google/android/gms/auth/api/signin/internal/c;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/internal/c;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    iget-object p1, p0, Lcom/google/android/gms/auth/api/signin/internal/o;->a:Lcom/google/android/gms/auth/api/signin/internal/c;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/internal/c;->c()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/o;
    .locals 1

    const-class v0, Lcom/google/android/gms/auth/api/signin/internal/o;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/internal/o;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/o;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static declared-synchronized b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/o;
    .locals 2

    const-class v0, Lcom/google/android/gms/auth/api/signin/internal/o;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/auth/api/signin/internal/o;->b:Lcom/google/android/gms/auth/api/signin/internal/o;

    if-eqz v1, :cond_0

    sget-object p0, Lcom/google/android/gms/auth/api/signin/internal/o;->b:Lcom/google/android/gms/auth/api/signin/internal/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :cond_0
    :try_start_1
    new-instance v1, Lcom/google/android/gms/auth/api/signin/internal/o;

    invoke-direct {v1, p0}, Lcom/google/android/gms/auth/api/signin/internal/o;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/google/android/gms/auth/api/signin/internal/o;->b:Lcom/google/android/gms/auth/api/signin/internal/o;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/o;->a:Lcom/google/android/gms/auth/api/signin/internal/c;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/o;->a:Lcom/google/android/gms/auth/api/signin/internal/c;

    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/auth/api/signin/internal/c;->a(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
