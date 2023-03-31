.class public final Lcom/google/android/gms/internal/ads/ft0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/wj2;

.field private b:Landroid/content/Context;

.field private c:Lcom/google/android/gms/internal/ads/os0;

.field private d:Lcom/google/android/gms/internal/ads/fo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/os0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ft0;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ft0;->d:Lcom/google/android/gms/internal/ads/fo;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ft0;->a:Lcom/google/android/gms/internal/ads/wj2;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/ft0;->c:Lcom/google/android/gms/internal/ads/os0;

    return-void
.end method


# virtual methods
.method final synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/ct0;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/ads/bl2;->p()Lcom/google/android/gms/internal/ads/bl2$b;

    move-result-object v3

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/ft0;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/bl2$b;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/bl2$b;

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/bl2$b;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/bl2$b;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v4}, Lcom/google/android/gms/internal/ads/ct0;->a(Landroid/database/sqlite/SQLiteDatabase;I)I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/bl2$b;->a(I)Lcom/google/android/gms/internal/ads/bl2$b;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/bl2$b;->a(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/bl2$b;

    const/4 v6, 0x1

    invoke-static {v1, v6}, Lcom/google/android/gms/internal/ads/ct0;->a(Landroid/database/sqlite/SQLiteDatabase;I)I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/bl2$b;->b(I)Lcom/google/android/gms/internal/ads/bl2$b;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v6

    invoke-interface {v6}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Lcom/google/android/gms/internal/ads/bl2$b;->a(J)Lcom/google/android/gms/internal/ads/bl2$b;

    const/4 v6, 0x2

    invoke-static {v1, v6}, Lcom/google/android/gms/internal/ads/ct0;->b(Landroid/database/sqlite/SQLiteDatabase;I)J

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Lcom/google/android/gms/internal/ads/bl2$b;->b(J)Lcom/google/android/gms/internal/ads/bl2$b;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/rz1;

    check-cast v3, Lcom/google/android/gms/internal/ads/bl2;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    const-wide/16 v8, 0x0

    move-wide v11, v8

    const/4 v10, 0x0

    :cond_0
    :goto_0
    if-ge v10, v7, :cond_1

    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v10, v10, 0x1

    check-cast v13, Lcom/google/android/gms/internal/ads/bl2$a;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/bl2$a;->q()Lcom/google/android/gms/internal/ads/wl2;

    move-result-object v14

    sget-object v15, Lcom/google/android/gms/internal/ads/wl2;->d:Lcom/google/android/gms/internal/ads/wl2;

    if-ne v14, v15, :cond_0

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/bl2$a;->p()J

    move-result-wide v14

    cmp-long v16, v14, v11

    if-lez v16, :cond_0

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/bl2$a;->p()J

    move-result-wide v11

    goto :goto_0

    :cond_1
    const-string v2, "offline_signal_statistics"

    const-string v7, "value"

    const/4 v10, 0x0

    cmp-long v13, v11, v8

    if-eqz v13, :cond_2

    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v8, v7, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v9, "statistic_name = \'last_successful_request_time\'"

    invoke-virtual {v1, v2, v8, v9, v10}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    :cond_2
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/ft0;->a:Lcom/google/android/gms/internal/ads/wj2;

    new-instance v9, Lcom/google/android/gms/internal/ads/ht0;

    invoke-direct {v9, v3}, Lcom/google/android/gms/internal/ads/ht0;-><init>(Lcom/google/android/gms/internal/ads/bl2;)V

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/ads/wj2;->a(Lcom/google/android/gms/internal/ads/zj2;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/hl2;->p()Lcom/google/android/gms/internal/ads/hl2$a;

    move-result-object v3

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/ft0;->d:Lcom/google/android/gms/internal/ads/fo;

    iget v8, v8, Lcom/google/android/gms/internal/ads/fo;->c:I

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/hl2$a;->a(I)Lcom/google/android/gms/internal/ads/hl2$a;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/ft0;->d:Lcom/google/android/gms/internal/ads/fo;

    iget v8, v8, Lcom/google/android/gms/internal/ads/fo;->d:I

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/hl2$a;->b(I)Lcom/google/android/gms/internal/ads/hl2$a;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/ft0;->d:Lcom/google/android/gms/internal/ads/fo;

    iget-boolean v8, v8, Lcom/google/android/gms/internal/ads/fo;->e:Z

    if-eqz v8, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x2

    :goto_1
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/hl2$a;->c(I)Lcom/google/android/gms/internal/ads/hl2$a;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/rz1;

    check-cast v3, Lcom/google/android/gms/internal/ads/hl2;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/ft0;->a:Lcom/google/android/gms/internal/ads/wj2;

    new-instance v6, Lcom/google/android/gms/internal/ads/gt0;

    invoke-direct {v6, v3}, Lcom/google/android/gms/internal/ads/gt0;-><init>(Lcom/google/android/gms/internal/ads/hl2;)V

    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/ads/wj2;->a(Lcom/google/android/gms/internal/ads/zj2;)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/ft0;->a:Lcom/google/android/gms/internal/ads/wj2;

    sget-object v4, Lcom/google/android/gms/internal/ads/yj2;->W:Lcom/google/android/gms/internal/ads/yj2;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/wj2;->a(Lcom/google/android/gms/internal/ads/yj2;)V

    const-string v3, "offline_signal_contents"

    invoke-virtual {v1, v3, v10, v10}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v3, v7, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v4, "failed_requests"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    const-string v6, "statistic_name = ?"

    invoke-virtual {v1, v2, v3, v6, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v3, v7, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v4, "total_requests"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v6, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    return-object v10
.end method

.method public final a()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ft0;->c:Lcom/google/android/gms/internal/ads/os0;

    new-instance v1, Lcom/google/android/gms/internal/ads/et0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/et0;-><init>(Lcom/google/android/gms/internal/ads/ft0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/os0;->a(Lcom/google/android/gms/internal/ads/zg1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Error in offline signals database startup: "

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    return-void
.end method
