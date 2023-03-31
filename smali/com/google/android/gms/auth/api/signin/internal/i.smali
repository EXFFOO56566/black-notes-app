.class public final Lcom/google/android/gms/auth/api/signin/internal/i;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Lb/c/b/a/c/o/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb/c/b/a/c/o/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "GoogleSignInCommon"

    invoke-direct {v0, v2, v1}, Lb/c/b/a/c/o/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/auth/api/signin/internal/i;->a:Lb/c/b/a/c/o/a;

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/f;Landroid/content/Context;Z)Lcom/google/android/gms/common/api/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/f;",
            "Landroid/content/Context;",
            "Z)",
            "Lcom/google/android/gms/common/api/g<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/auth/api/signin/internal/i;->a:Lb/c/b/a/c/o/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Signing out"

    invoke-virtual {v0, v2, v1}, Lb/c/b/a/c/o/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/internal/i;->a(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->f:Lcom/google/android/gms/common/api/Status;

    invoke-static {p1, p0}, Lcom/google/android/gms/common/api/h;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/api/f;)Lcom/google/android/gms/common/api/g;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Lcom/google/android/gms/auth/api/signin/internal/l;

    invoke-direct {p1, p0}, Lcom/google/android/gms/auth/api/signin/internal/l;-><init>(Lcom/google/android/gms/common/api/f;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/f;->a(Lcom/google/android/gms/common/api/internal/d;)Lcom/google/android/gms/common/api/internal/d;

    move-result-object p0

    return-object p0
.end method

.method private static a(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/internal/o;->a(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/o;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/signin/internal/o;->a()V

    invoke-static {}, Lcom/google/android/gms/common/api/f;->c()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/common/api/internal/f;->c()V

    return-void

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/common/api/f;

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/f;->b()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static b(Lcom/google/android/gms/common/api/f;Landroid/content/Context;Z)Lcom/google/android/gms/common/api/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/f;",
            "Landroid/content/Context;",
            "Z)",
            "Lcom/google/android/gms/common/api/g<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/auth/api/signin/internal/i;->a:Lb/c/b/a/c/o/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Revoking access"

    invoke-virtual {v0, v2, v1}, Lb/c/b/a/c/o/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/internal/c;->a(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/internal/i;->a(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/internal/e;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/g;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Lcom/google/android/gms/auth/api/signin/internal/n;

    invoke-direct {p1, p0}, Lcom/google/android/gms/auth/api/signin/internal/n;-><init>(Lcom/google/android/gms/common/api/f;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/f;->a(Lcom/google/android/gms/common/api/internal/d;)Lcom/google/android/gms/common/api/internal/d;

    move-result-object p0

    return-object p0
.end method
