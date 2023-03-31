.class public final Lcom/google/android/gms/internal/ads/tm;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field private static a:Lcom/google/android/gms/internal/ads/hm2;

.field private static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/tm;->b:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/sm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/sm;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/tm;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/hm2;

    return-void
.end method

.method private static a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/hm2;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/tm;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/tm;->a:Lcom/google/android/gms/internal/ads/hm2;

    if-nez v1, :cond_2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zr2;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/common/util/c;->a()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->Q1:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/im;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/hm2;

    move-result-object p0

    goto :goto_1

    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ho;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/hm2;

    move-result-object p0

    :goto_1
    sput-object p0, Lcom/google/android/gms/internal/ads/tm;->a:Lcom/google/android/gms/internal/ads/hm2;

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/tm;->a:Lcom/google/android/gms/internal/ads/hm2;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/ef2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ro;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/ads/tm;->a:Lcom/google/android/gms/internal/ads/hm2;

    new-instance v2, Lcom/google/android/gms/internal/ads/ym;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/ym;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ro;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/hm2;->a(Lcom/google/android/gms/internal/ads/gh2;)Lcom/google/android/gms/internal/ads/gh2;

    return-object v0
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/util/Map;[B)Lcom/google/android/gms/internal/ads/lo1;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    new-instance v10, Lcom/google/android/gms/internal/ads/wm;

    const/4 v1, 0x0

    invoke-direct {v10, v1}, Lcom/google/android/gms/internal/ads/wm;-><init>(Lcom/google/android/gms/internal/ads/sm;)V

    new-instance v6, Lcom/google/android/gms/internal/ads/vm;

    move-object v11, p0

    invoke-direct {v6, p0, v0, v10}, Lcom/google/android/gms/internal/ads/vm;-><init>(Lcom/google/android/gms/internal/ads/tm;Ljava/lang/String;Lcom/google/android/gms/internal/ads/wm;)V

    new-instance v12, Lcom/google/android/gms/internal/ads/wn;

    invoke-direct {v12, v1}, Lcom/google/android/gms/internal/ads/wn;-><init>(Ljava/lang/String;)V

    new-instance v13, Lcom/google/android/gms/internal/ads/um;

    move-object v1, v13

    move-object v2, p0

    move v3, p1

    move-object/from16 v4, p2

    move-object v5, v10

    move-object/from16 v7, p4

    move-object/from16 v8, p3

    move-object v9, v12

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/um;-><init>(Lcom/google/android/gms/internal/ads/tm;ILjava/lang/String;Lcom/google/android/gms/internal/ads/c0;Lcom/google/android/gms/internal/ads/gq2;[BLjava/util/Map;Lcom/google/android/gms/internal/ads/wn;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/wn;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    const-string v1, "GET"

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/um;->b()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/um;->m()[B

    move-result-object v3

    invoke-virtual {v12, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/wn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/go; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/tm;->a:Lcom/google/android/gms/internal/ads/hm2;

    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/ads/hm2;->a(Lcom/google/android/gms/internal/ads/gh2;)Lcom/google/android/gms/internal/ads/gh2;

    return-object v10
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/tm;->a(ILjava/lang/String;Ljava/util/Map;[B)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method
