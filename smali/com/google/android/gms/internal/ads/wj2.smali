.class public final Lcom/google/android/gms/internal/ads/wj2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ak2;

.field private final b:Lcom/google/android/gms/internal/ads/vk2$a;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final c:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/vk2;->t()Lcom/google/android/gms/internal/ads/vk2$a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wj2;->b:Lcom/google/android/gms/internal/ads/vk2$a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/wj2;->c:Z

    new-instance v0, Lcom/google/android/gms/internal/ads/ak2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ak2;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wj2;->a:Lcom/google/android/gms/internal/ads/ak2;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/ak2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/vk2;->t()Lcom/google/android/gms/internal/ads/vk2$a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wj2;->b:Lcom/google/android/gms/internal/ads/vk2$a;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wj2;->a:Lcom/google/android/gms/internal/ads/ak2;

    sget-object p1, Lcom/google/android/gms/internal/ads/zr2;->g2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/wj2;->c:Z

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/wj2;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/wj2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/wj2;-><init>()V

    return-object v0
.end method

.method private static b()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/ads/zr2;->b()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    :try_start_0
    invoke-static {v5}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v5, "Experiment ID is not a number"

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private final declared-synchronized b(Lcom/google/android/gms/internal/ads/yj2;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj2;->b:Lcom/google/android/gms/internal/ads/vk2$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/vk2$a;->p()Lcom/google/android/gms/internal/ads/vk2$a;

    invoke-static {}, Lcom/google/android/gms/internal/ads/wj2;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vk2$a;->a(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/vk2$a;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj2;->a:Lcom/google/android/gms/internal/ads/ak2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wj2;->b:Lcom/google/android/gms/internal/ads/vk2$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast v1, Lcom/google/android/gms/internal/ads/vk2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/tx1;->f()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ak2;->a([B)Lcom/google/android/gms/internal/ads/fk2;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/yj2;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/fk2;->b(I)Lcom/google/android/gms/internal/ads/fk2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fk2;->a()V

    const-string v0, "Logging Event with event code : "

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/yj2;->a()I

    move-result p1

    const/16 v1, 0xa

    invoke-static {p1, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final declared-synchronized c(Lcom/google/android/gms/internal/ads/yj2;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/File;

    const-string v2, "clearcut_events.txt"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v0, Ljava/io/FileOutputStream;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/wj2;->d(Lcom/google/android/gms/internal/ads/yj2;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    return-void

    :catch_0
    :try_start_5
    const-string p1, "Could not close Clearcut output stream."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_1
    :try_start_6
    const-string p1, "Could not write Clearcut to file."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    monitor-exit p0

    return-void

    :catch_2
    :try_start_8
    const-string p1, "Could not close Clearcut output stream."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    monitor-exit p0

    return-void

    :goto_0
    :try_start_9
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_1

    :catch_3
    :try_start_a
    const-string v0, "Could not close Clearcut output stream."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    :goto_1
    throw p1
    :try_end_a
    .catch Ljava/io/FileNotFoundException; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :catch_4
    :try_start_b
    const-string p1, "Could not find file for Clearcut"

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final declared-synchronized d(Lcom/google/android/gms/internal/ads/yj2;)Ljava/lang/String;
    .locals 5

    monitor-enter p0

    :try_start_0
    const-string v0, "id=%s,timestamp=%s,event=%s,data=%s\n"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/wj2;->b:Lcom/google/android/gms/internal/ads/vk2$a;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/vk2$a;->m()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/d;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/yj2;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wj2;->b:Lcom/google/android/gms/internal/ads/vk2$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/vk2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/tx1;->f()[B

    move-result-object p1

    const/4 v2, 0x3

    invoke-static {p1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/yj2;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/wj2;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->h2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/wj2;->c(Lcom/google/android/gms/internal/ads/yj2;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/wj2;->b(Lcom/google/android/gms/internal/ads/yj2;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/zj2;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/wj2;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wj2;->b:Lcom/google/android/gms/internal/ads/vk2$a;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zj2;->a(Lcom/google/android/gms/internal/ads/vk2$a;)V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object v0

    const-string v1, "AdMobClearcutLogger.modify"

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/ik;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
