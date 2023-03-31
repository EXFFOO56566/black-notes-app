.class public Lb/c/b/a/c/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/CheckReturnValue;
.end annotation


# static fields
.field private static b:Lb/c/b/a/c/k;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lb/c/b/a/c/k;->a:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lb/c/b/a/c/k;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Lb/c/b/a/c/k;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lb/c/b/a/c/k;->b:Lb/c/b/a/c/k;

    if-nez v1, :cond_0

    invoke-static {p0}, Lb/c/b/a/c/t;->a(Landroid/content/Context;)V

    new-instance v1, Lb/c/b/a/c/k;

    invoke-direct {v1, p0}, Lb/c/b/a/c/k;-><init>(Landroid/content/Context;)V

    sput-object v1, Lb/c/b/a/c/k;->b:Lb/c/b/a/c/k;

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p0, Lb/c/b/a/c/k;->b:Lb/c/b/a/c/k;

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private static varargs a(Landroid/content/pm/PackageInfo;[Lb/c/b/a/c/u;)Lb/c/b/a/c/u;
    .locals 3

    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    array-length v0, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const-string p0, "GoogleSignatureVerifier"

    const-string p1, "Package has more than one signature."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_1
    new-instance v0, Lb/c/b/a/c/w;

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v2, 0x0

    aget-object p0, p0, v2

    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object p0

    invoke-direct {v0, p0}, Lb/c/b/a/c/w;-><init>([B)V

    :goto_0
    array-length p0, p1

    if-ge v2, p0, :cond_3

    aget-object p0, p1, v2

    invoke-virtual {p0, v0}, Lb/c/b/a/c/u;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    aget-object p0, p1, v2

    return-object p0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static a(Landroid/content/pm/PackageInfo;Z)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    iget-object v1, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    sget-object p1, Lb/c/b/a/c/y;->a:[Lb/c/b/a/c/u;

    invoke-static {p0, p1}, Lb/c/b/a/c/k;->a(Landroid/content/pm/PackageInfo;[Lb/c/b/a/c/u;)Lb/c/b/a/c/u;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-array p1, v1, [Lb/c/b/a/c/u;

    sget-object v2, Lb/c/b/a/c/y;->a:[Lb/c/b/a/c/u;

    aget-object v2, v2, v0

    aput-object v2, p1, v0

    invoke-static {p0, p1}, Lb/c/b/a/c/k;->a(Landroid/content/pm/PackageInfo;[Lb/c/b/a/c/u;)Lb/c/b/a/c/u;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    return v1

    :cond_1
    return v0
.end method


# virtual methods
.method public a(Landroid/content/pm/PackageInfo;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p1, v0}, Lb/c/b/a/c/k;->a(Landroid/content/pm/PackageInfo;Z)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    invoke-static {p1, v2}, Lb/c/b/a/c/k;->a(Landroid/content/pm/PackageInfo;Z)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lb/c/b/a/c/k;->a:Landroid/content/Context;

    invoke-static {p1}, Lb/c/b/a/c/j;->d(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    const-string p1, "GoogleSignatureVerifier"

    const-string v1, "Test-keys aren\'t accepted on this build."

    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    return v0
.end method
