.class public final Lcom/google/android/gms/internal/ads/sm2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/google/android/gms/internal/ads/sm2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/sm2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/sm2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/sm2;->a:Lcom/google/android/gms/internal/ads/sm2;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static final synthetic a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lcom/google/android/gms/ads/n;->e:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p0

    sget-object v0, Lcom/google/android/gms/ads/n;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    sub-int/2addr p0, p1

    return p0
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zp2;)Lcom/google/android/gms/internal/ads/rm2;
    .locals 27

    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->a()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/16 v1, -0x1

    :goto_0
    move-wide v5, v1

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->b()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->d()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->e()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    move-object v9, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move-object v9, v3

    :goto_1
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zp2;->a(Landroid/content/Context;)Z

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->f()Landroid/location/Location;

    move-result-object v15

    const-class v2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zp2;->a(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v7

    const/16 v23, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->r()Lcom/google/android/gms/ads/w/a;

    move-result-object v2

    if-nez v2, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->g()Z

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->i()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->m()Lcom/google/android/gms/ads/y/a;

    move-result-object v2

    if-nez v2, :cond_3

    const/4 v14, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/sn;->a([Ljava/lang/StackTraceElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v21, v1

    goto :goto_2

    :cond_2
    move-object/from16 v21, v3

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->j()Z

    move-result v22

    invoke-static {}, Lcom/google/android/gms/internal/ads/cq2;->c()Lcom/google/android/gms/internal/ads/cq2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/cq2;->a()Lcom/google/android/gms/ads/n;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->p()I

    move-result v2

    invoke-virtual {v1}, Lcom/google/android/gms/ads/n;->b()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->s()I

    move-result v2

    invoke-virtual {v1}, Lcom/google/android/gms/ads/n;->c()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v24

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->h()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v1}, Lcom/google/android/gms/ads/n;->a()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/vm2;->b:Ljava/util/Comparator;

    invoke-static {v1, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v25, v1

    check-cast v25, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->k()Ljava/util/List;

    move-result-object v26

    new-instance v1, Lcom/google/android/gms/internal/ads/rm2;

    move-object v3, v1

    const/16 v4, 0x8

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->o()Landroid/os/Bundle;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->c()Landroid/os/Bundle;

    move-result-object v18

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->q()Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->l()Ljava/lang/String;

    move-result-object v20

    const/16 v4, 0x8

    invoke-direct/range {v3 .. v26}, Lcom/google/android/gms/internal/ads/rm2;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/internal/ads/br2;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/ads/lm2;ILjava/lang/String;Ljava/util/List;)V

    return-object v1

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/ads/br2;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/br2;-><init>(Lcom/google/android/gms/ads/y/a;)V

    throw v3

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->i()Ljava/util/WeakHashMap;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zp2;->r()Lcom/google/android/gms/ads/w/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/w/a;->a()Lcom/google/android/gms/ads/w/b;

    throw v3
.end method
