.class public Lb/c/b/a/c/q/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static b:Lb/c/b/a/c/q/c;


# instance fields
.field private a:Lb/c/b/a/c/q/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/c/b/a/c/q/c;

    invoke-direct {v0}, Lb/c/b/a/c/q/c;-><init>()V

    sput-object v0, Lb/c/b/a/c/q/c;->b:Lb/c/b/a/c/q/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lb/c/b/a/c/q/c;->a:Lb/c/b/a/c/q/b;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lb/c/b/a/c/q/b;
    .locals 1

    sget-object v0, Lb/c/b/a/c/q/c;->b:Lb/c/b/a/c/q/c;

    invoke-direct {v0, p0}, Lb/c/b/a/c/q/c;->b(Landroid/content/Context;)Lb/c/b/a/c/q/b;

    move-result-object p0

    return-object p0
.end method

.method private final declared-synchronized b(Landroid/content/Context;)Lb/c/b/a/c/q/b;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb/c/b/a/c/q/c;->a:Lb/c/b/a/c/q/b;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :goto_0
    new-instance v0, Lb/c/b/a/c/q/b;

    invoke-direct {v0, p1}, Lb/c/b/a/c/q/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lb/c/b/a/c/q/c;->a:Lb/c/b/a/c/q/b;

    :cond_1
    iget-object p1, p0, Lb/c/b/a/c/q/c;->a:Lb/c/b/a/c/q/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
