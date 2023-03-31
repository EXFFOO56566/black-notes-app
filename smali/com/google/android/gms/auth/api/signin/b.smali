.class public Lcom/google/android/gms/auth/api/signin/b;
.super Lcom/google/android/gms/common/api/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/auth/api/signin/b$a;,
        Lcom/google/android/gms/auth/api/signin/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/e<",
        "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
        ">;"
    }
.end annotation


# static fields
.field private static i:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/auth/api/signin/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/api/signin/b$a;-><init>(Lcom/google/android/gms/auth/api/signin/h;)V

    sget v0, Lcom/google/android/gms/auth/api/signin/b$b;->a:I

    sput v0, Lcom/google/android/gms/auth/api/signin/b;->i:I

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 2

    sget-object v0, Lb/c/b/a/a/a/a;->e:Lcom/google/android/gms/common/api/a;

    new-instance v1, Lcom/google/android/gms/common/api/internal/a;

    invoke-direct {v1}, Lcom/google/android/gms/common/api/internal/a;-><init>()V

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/google/android/gms/common/api/e;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/internal/n;)V

    return-void
.end method

.method private final declared-synchronized i()I
    .locals 4

    monitor-enter p0

    :try_start_0
    sget v0, Lcom/google/android/gms/auth/api/signin/b;->i:I

    sget v1, Lcom/google/android/gms/auth/api/signin/b$b;->a:I

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/e;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lb/c/b/a/c/e;->a()Lb/c/b/a/c/e;

    move-result-object v1

    const v2, 0xbdfcb8

    invoke-virtual {v1, v0, v2}, Lb/c/b/a/c/e;->a(Landroid/content/Context;I)I

    move-result v2

    if-nez v2, :cond_0

    sget v0, Lcom/google/android/gms/auth/api/signin/b$b;->d:I

    :goto_0
    sput v0, Lcom/google/android/gms/auth/api/signin/b;->i:I

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lb/c/b/a/c/e;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "com.google.android.gms.auth.api.fallback"

    invoke-static {v0, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/google/android/gms/auth/api/signin/b$b;->c:I

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/gms/auth/api/signin/b$b;->b:I

    goto :goto_0

    :cond_2
    :goto_1
    sget v0, Lcom/google/android/gms/auth/api/signin/b;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public g()Lb/c/b/a/h/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb/c/b/a/h/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/e;->a()Lcom/google/android/gms/common/api/f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/e;->d()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/b;->i()I

    move-result v2

    sget v3, Lcom/google/android/gms/auth/api/signin/b$b;->c:I

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/auth/api/signin/internal/i;->b(Lcom/google/android/gms/common/api/f;Landroid/content/Context;Z)Lcom/google/android/gms/common/api/g;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->a(Lcom/google/android/gms/common/api/g;)Lb/c/b/a/h/f;

    move-result-object v0

    return-object v0
.end method

.method public h()Lb/c/b/a/h/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb/c/b/a/h/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/e;->a()Lcom/google/android/gms/common/api/f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/e;->d()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/b;->i()I

    move-result v2

    sget v3, Lcom/google/android/gms/auth/api/signin/b$b;->c:I

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/auth/api/signin/internal/i;->a(Lcom/google/android/gms/common/api/f;Landroid/content/Context;Z)Lcom/google/android/gms/common/api/g;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->a(Lcom/google/android/gms/common/api/g;)Lb/c/b/a/h/f;

    move-result-object v0

    return-object v0
.end method
