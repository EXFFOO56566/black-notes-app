.class public final Lcom/google/android/gms/internal/ads/fr1;
.super Lcom/google/android/gms/internal/ads/yh1;
.source ""


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;ZI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/yh1;-><init>(Landroid/content/Context;Ljava/lang/String;ZI)V

    return-void
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;Z)Lcom/google/android/gms/internal/ads/fr1;
    .locals 1

    sget p2, Lcom/google/android/gms/internal/ads/yr0;->a:I

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/fr1;->b(Ljava/lang/String;Landroid/content/Context;ZI)Lcom/google/android/gms/internal/ads/fr1;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Landroid/content/Context;ZI)Lcom/google/android/gms/internal/ads/fr1;
    .locals 1

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/yh1;->a(Landroid/content/Context;Z)V

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/yh1;->a(Ljava/lang/String;Landroid/content/Context;ZI)V

    new-instance v0, Lcom/google/android/gms/internal/ads/fr1;

    invoke-direct {v0, p1, p0, p2, p3}, Lcom/google/android/gms/internal/ads/fr1;-><init>(Landroid/content/Context;Ljava/lang/String;ZI)V

    return-object v0
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/internal/ads/l52;Landroid/content/Context;Lcom/google/android/gms/internal/ads/ba0$a;Lcom/google/android/gms/internal/ads/s20;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/l52;",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/internal/ads/ba0$a;",
            "Lcom/google/android/gms/internal/ads/s20;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/l52;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/yh1;->v:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/l52;->c()I

    move-result v6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/yh1;->a(Lcom/google/android/gms/internal/ads/l52;Landroid/content/Context;Lcom/google/android/gms/internal/ads/ba0$a;Lcom/google/android/gms/internal/ads/s20;)Ljava/util/List;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance p2, Lcom/google/android/gms/internal/ads/g62;

    const/16 v7, 0x18

    const-string v3, "hYPTVQdTm2q1YMo1lUce4yXfJpjfBpohGFUC3CCt6OsJQwu7mUSAt5mBInaYKugO"

    const-string v4, "pf4sJGlvLCh5M9DSeQtdmDF5FY3IMGGhi6Z7oCoKXow="

    move-object v1, p2

    move-object v2, p1

    move-object v5, p3

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/g62;-><init>(Lcom/google/android/gms/internal/ads/l52;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ba0$a;II)V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/yh1;->a(Lcom/google/android/gms/internal/ads/l52;Landroid/content/Context;Lcom/google/android/gms/internal/ads/ba0$a;Lcom/google/android/gms/internal/ads/s20;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
