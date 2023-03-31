.class public final Lcom/google/android/gms/internal/ads/qj1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/ji1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ji1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qj1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/qj1;->b:Lcom/google/android/gms/internal/ads/ji1;

    return-void
.end method

.method private final a([B)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qj1;->b:Lcom/google/android/gms/internal/ads/ji1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "os.arch:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/google/android/gms/internal/ads/ll1;->w:Lcom/google/android/gms/internal/ads/ll1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ll1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :try_start_0
    const-class v2, Landroid/os/Build;

    const-string v3, "SUPPORTED_ABIS"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    if-eqz v2, :cond_1

    const-string v3, "supported_abis:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_1
    :goto_0
    const-string v2, "CPU_ABI:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "CPU_ABI2:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Landroid/os/Build;->CPU_ABI2:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_2

    const-string v2, "ELF:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qj1;->b:Lcom/google/android/gms/internal/ads/ji1;

    const/16 v1, 0xfa7

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/ji1;->a(ILjava/lang/String;)Lb/c/b/a/h/f;

    return-void
.end method

.method private final b()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    const-string v1, "i686"

    const-string v2, "armv71"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/ll1;->w:Lcom/google/android/gms/internal/ads/ll1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ll1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const-wide/16 v0, 0x0

    const/16 v2, 0x7e8

    :try_start_0
    const-class v3, Landroid/os/Build;

    const-string v4, "SUPPORTED_ABIS"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    if-eqz v3, :cond_1

    array-length v4, v3

    if-lez v4, :cond_1

    const/4 v4, 0x0

    aget-object v0, v3, v4
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/qj1;->b:Lcom/google/android/gms/internal/ads/ji1;

    if-eqz v4, :cond_1

    :goto_0
    invoke-virtual {v4, v2, v0, v1, v3}, Lcom/google/android/gms/internal/ads/ji1;->a(IJLjava/lang/Exception;)Lb/c/b/a/h/f;

    goto :goto_1

    :catch_1
    move-exception v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/qj1;->b:Lcom/google/android/gms/internal/ads/ji1;

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    sget-object v0, Landroid/os/Build;->CPU_ABI2:Ljava/lang/String;

    return-object v0
.end method

.method private final c()Lcom/google/android/gms/internal/ads/a72;
    .locals 7

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qj1;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v2, "lib"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->c:Lcom/google/android/gms/internal/ads/a72;

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/um1;

    const/4 v2, 0x2

    const-string v3, ".*\\.so$"

    invoke-static {v3, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/ads/um1;-><init>(Ljava/util/regex/Pattern;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_8

    array-length v1, v0

    if-nez v1, :cond_1

    goto/16 :goto_2

    :cond_1
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    const/4 v3, 0x0

    aget-object v0, v0, v3

    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x14

    :try_start_1
    new-array v4, v0, [B

    invoke-virtual {v1, v4}, Ljava/io/FileInputStream;->read([B)I

    move-result v5

    if-ne v5, v0, :cond_7

    new-array v0, v2, [B

    aput-byte v3, v0, v3

    const/4 v5, 0x1

    aput-byte v3, v0, v5

    const/4 v6, 0x5

    aget-byte v6, v4, v6

    if-ne v6, v2, :cond_2

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/qj1;->a([B)V

    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->c:Lcom/google/android/gms/internal/ads/a72;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :cond_2
    const/16 v2, 0x13

    :try_start_3
    aget-byte v2, v4, v2

    aput-byte v2, v0, v3

    const/16 v2, 0x12

    aget-byte v2, v4, v2

    aput-byte v2, v0, v5

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_6

    const/16 v2, 0x28

    if-eq v0, v2, :cond_5

    const/16 v2, 0x3e

    if-eq v0, v2, :cond_4

    const/16 v2, 0xb7

    if-eq v0, v2, :cond_3

    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->c:Lcom/google/android/gms/internal/ads/a72;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    return-object v0

    :cond_3
    :try_start_5
    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->f:Lcom/google/android/gms/internal/ads/a72;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    return-object v0

    :cond_4
    :try_start_7
    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->g:Lcom/google/android/gms/internal/ads/a72;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    return-object v0

    :cond_5
    :try_start_9
    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->d:Lcom/google/android/gms/internal/ads/a72;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    return-object v0

    :cond_6
    :try_start_b
    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->e:Lcom/google/android/gms/internal/ads/a72;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    return-object v0

    :cond_7
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_d
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_e
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/kx1;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    :catch_0
    :goto_1
    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->c:Lcom/google/android/gms/internal/ads/a72;

    return-object v0

    :cond_8
    :goto_2
    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->c:Lcom/google/android/gms/internal/ads/a72;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/a72;
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qj1;->c()Lcom/google/android/gms/internal/ads/a72;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/a72;->c:Lcom/google/android/gms/internal/ads/a72;

    if-ne v0, v1, :cond_6

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/qj1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "i686"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "x86"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "x86_64"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->g:Lcom/google/android/gms/internal/ads/a72;

    return-object v0

    :cond_1
    const-string v1, "arm64-v8a"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->f:Lcom/google/android/gms/internal/ads/a72;

    return-object v0

    :cond_2
    const-string v1, "armeabi-v7a"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "armv71"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->d:Lcom/google/android/gms/internal/ads/a72;

    return-object v0

    :cond_4
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->e:Lcom/google/android/gms/internal/ads/a72;

    return-object v0

    :cond_5
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/qj1;->a([B)V

    sget-object v0, Lcom/google/android/gms/internal/ads/a72;->c:Lcom/google/android/gms/internal/ads/a72;

    :cond_6
    return-object v0
.end method
