.class public final Lcom/google/android/gms/internal/ads/ji1;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile d:Lcom/google/android/gms/internal/ads/q00$c;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lb/c/b/a/h/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/c/b/a/h/f<",
            "Lcom/google/android/gms/internal/ads/ak2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/q00$c;->c:Lcom/google/android/gms/internal/ads/q00$c;

    sput-object v0, Lcom/google/android/gms/internal/ads/ji1;->d:Lcom/google/android/gms/internal/ads/q00$c;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lb/c/b/a/h/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/concurrent/Executor;",
            "Lb/c/b/a/h/f<",
            "Lcom/google/android/gms/internal/ads/ak2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ji1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ji1;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ji1;->c:Lb/c/b/a/h/f;

    return-void
.end method

.method private final a(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lb/c/b/a/h/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/lang/Exception;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lb/c/b/a/h/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/ads/q00;->p()Lcom/google/android/gms/internal/ads/q00$a;

    move-result-object p6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ji1;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p6, v0}, Lcom/google/android/gms/internal/ads/q00$a;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/q00$a;

    invoke-virtual {p6, p2, p3}, Lcom/google/android/gms/internal/ads/q00$a;->a(J)Lcom/google/android/gms/internal/ads/q00$a;

    sget-object p2, Lcom/google/android/gms/internal/ads/ji1;->d:Lcom/google/android/gms/internal/ads/q00$c;

    invoke-virtual {p6, p2}, Lcom/google/android/gms/internal/ads/q00$a;->a(Lcom/google/android/gms/internal/ads/q00$c;)Lcom/google/android/gms/internal/ads/q00$a;

    if-eqz p4, :cond_0

    invoke-static {p4}, Lcom/google/android/gms/internal/ads/ml1;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p6, p2}, Lcom/google/android/gms/internal/ads/q00$a;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/q00$a;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p6, p2}, Lcom/google/android/gms/internal/ads/q00$a;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/q00$a;

    :cond_0
    if-eqz p7, :cond_1

    invoke-virtual {p6, p7}, Lcom/google/android/gms/internal/ads/q00$a;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/q00$a;

    :cond_1
    if-eqz p5, :cond_2

    invoke-virtual {p6, p5}, Lcom/google/android/gms/internal/ads/q00$a;->e(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/q00$a;

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ji1;->c:Lb/c/b/a/h/f;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/ji1;->b:Ljava/util/concurrent/Executor;

    new-instance p4, Lcom/google/android/gms/internal/ads/ki1;

    invoke-direct {p4, p6, p1}, Lcom/google/android/gms/internal/ads/ki1;-><init>(Lcom/google/android/gms/internal/ads/q00$a;I)V

    invoke-virtual {p2, p3, p4}, Lb/c/b/a/h/f;->a(Ljava/util/concurrent/Executor;Lb/c/b/a/h/a;)Lb/c/b/a/h/f;

    move-result-object p1

    return-object p1
.end method

.method static final synthetic a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/ak2;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/ak2;

    const-string v1, "GLAS"

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/ads/ak2;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ji1;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/li1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/li1;-><init>(Landroid/content/Context;)V

    invoke-static {p1, v0}, Lb/c/b/a/h/i;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lb/c/b/a/h/f;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/ji1;

    invoke-direct {v1, p0, p1, v0}, Lcom/google/android/gms/internal/ads/ji1;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lb/c/b/a/h/f;)V

    return-object v1
.end method

.method static final synthetic a(Lcom/google/android/gms/internal/ads/q00$a;ILb/c/b/a/h/f;)Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p2}, Lb/c/b/a/h/f;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lb/c/b/a/h/f;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/ak2;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p0, Lcom/google/android/gms/internal/ads/q00;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/tx1;->f()[B

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/ak2;->a([B)Lcom/google/android/gms/internal/ads/fk2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/fk2;->b(I)Lcom/google/android/gms/internal/ads/fk2;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/fk2;->a()V

    const/4 p0, 0x1

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    goto :goto_0
.end method

.method static a(Lcom/google/android/gms/internal/ads/q00$c;)V
    .locals 0

    sput-object p0, Lcom/google/android/gms/internal/ads/ji1;->d:Lcom/google/android/gms/internal/ads/q00$c;

    return-void
.end method


# virtual methods
.method public final a(IJ)Lb/c/b/a/h/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ)",
            "Lb/c/b/a/h/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/ji1;->a(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lb/c/b/a/h/f;

    move-result-object p1

    return-object p1
.end method

.method public final a(IJLjava/lang/Exception;)Lb/c/b/a/h/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/lang/Exception;",
            ")",
            "Lb/c/b/a/h/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/ji1;->a(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lb/c/b/a/h/f;

    move-result-object p1

    return-object p1
.end method

.method public final a(IJLjava/lang/String;Ljava/util/Map;)Lb/c/b/a/h/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lb/c/b/a/h/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/ji1;->a(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lb/c/b/a/h/f;

    move-result-object p1

    return-object p1
.end method

.method public final a(ILjava/lang/String;)Lb/c/b/a/h/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Lb/c/b/a/h/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/16 v1, 0xfa7

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/ji1;->a(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lb/c/b/a/h/f;

    move-result-object p1

    return-object p1
.end method
