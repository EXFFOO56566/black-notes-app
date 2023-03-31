.class public final Lcom/google/android/gms/internal/ads/dk1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/io/File;

.field private final b:Ljava/io/File;

.field private final c:Landroid/content/SharedPreferences;

.field private final d:Lcom/google/android/gms/internal/ads/a72;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/a72;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "pcvmspf"

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/dk1;->c:Landroid/content/SharedPreferences;

    const-string v1, "pccache"

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/io/File;Z)Ljava/io/File;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/dk1;->a:Ljava/io/File;

    const-string v1, "tmppccache"

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/io/File;Z)Ljava/io/File;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dk1;->b:Ljava/io/File;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dk1;->d:Lcom/google/android/gms/internal/ads/a72;

    return-void
.end method

.method private final a()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dk1;->a:Ljava/io/File;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dk1;->d:Lcom/google/android/gms/internal/ads/a72;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/a72;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    :cond_0
    return-object v0
.end method

.method private static a(Lcom/google/android/gms/internal/ads/g72;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/tx1;->d()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/dy1;->a()[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/common/util/i;->a([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final b(I)Lcom/google/android/gms/internal/ads/g72;
    .locals 5

    sget v0, Lcom/google/android/gms/internal/ads/ik1;->a:I

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dk1;->c:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->c()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    sget v0, Lcom/google/android/gms/internal/ads/ik1;->b:I

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dk1;->c:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object v1

    :cond_2
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/common/util/i;->a(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/dy1;->a([B)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/g72;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/g72;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object v0

    const-string v2, "pcam"

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->a()Ljava/io/File;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v2

    const-string v3, "pcbc"

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->a()Ljava/io/File;

    move-result-object v4

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/b02; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_4

    return-object p1

    :catch_0
    :cond_4
    return-object v1
.end method

.method private final b()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dk1;->d:Lcom/google/android/gms/internal/ads/a72;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/a72;->a()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "FBAMTD"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final c()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dk1;->d:Lcom/google/android/gms/internal/ads/a72;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/a72;->a()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "LATMTD"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/internal/ads/zj1;
    .locals 5

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/dk1;->b(I)Lcom/google/android/gms/internal/ads/g72;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->a()Ljava/io/File;

    move-result-object v1

    const-string v2, "pcam"

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->a()Ljava/io/File;

    move-result-object v2

    const-string v3, "pcopt"

    invoke-static {v0, v3, v2}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->a()Ljava/io/File;

    move-result-object v3

    const-string v4, "pcbc"

    invoke-static {v0, v4, v3}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/ads/zj1;

    invoke-direct {v3, p1, v1, v0, v2}, Lcom/google/android/gms/internal/ads/zj1;-><init>(Lcom/google/android/gms/internal/ads/g72;Ljava/io/File;Ljava/io/File;Ljava/io/File;)V

    return-object v3
.end method

.method public final a(Lcom/google/android/gms/internal/ads/c72;Lcom/google/android/gms/internal/ads/jk1;)Z
    .locals 7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/c72;->q()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dy1;->a()[B

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/c72;->r()Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/dy1;->a()[B

    move-result-object v1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, "pcbc"

    const-string v4, "pcam"

    const/4 v5, 0x0

    if-nez v2, :cond_2

    if-eqz v1, :cond_2

    array-length v2, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dk1;->b:Ljava/io/File;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/io/File;)Z

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dk1;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dk1;->b:Ljava/io/File;

    invoke-static {p2, v2}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dk1;->b:Ljava/io/File;

    invoke-static {p2, v4, v2}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v2

    if-eqz v0, :cond_1

    array-length v6, v0

    if-lez v6, :cond_1

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/io/File;[B)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dk1;->b:Ljava/io/File;

    invoke-static {p2, v3, v0}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p2

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/io/File;[B)Z

    move-result p2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x0

    :goto_1
    if-nez p2, :cond_3

    return v5

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dk1;->b:Ljava/io/File;

    invoke-static {p2, v4, v0}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dk1;->b:Ljava/io/File;

    invoke-static {p2, v4, v0}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dk1;->b:Ljava/io/File;

    invoke-static {p2, v3, v2}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->a()Ljava/io/File;

    move-result-object v6

    invoke-static {p2, v4, v6}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v4

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->a()Ljava/io/File;

    move-result-object v6

    invoke-static {p2, v3, v6}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p2

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v2, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p2

    if-eqz p2, :cond_5

    const/4 p2, 0x1

    goto :goto_2

    :cond_5
    const/4 p2, 0x0

    :goto_2
    if-eqz p2, :cond_7

    invoke-static {}, Lcom/google/android/gms/internal/ads/g72;->u()Lcom/google/android/gms/internal/ads/g72$a;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/g72$a;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/g72$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/g72;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/g72$a;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/g72$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/g72;->s()J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/ads/g72$a;->b(J)Lcom/google/android/gms/internal/ads/g72$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/g72;->t()J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/ads/g72$a;->c(J)Lcom/google/android/gms/internal/ads/g72$a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/c72;->p()Lcom/google/android/gms/internal/ads/g72;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/g72;->r()J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/ads/g72$a;->a(J)Lcom/google/android/gms/internal/ads/g72$a;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/g72;

    sget p2, Lcom/google/android/gms/internal/ads/ik1;->a:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/dk1;->b(I)Lcom/google/android/gms/internal/ads/g72;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dk1;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/dk1;->a(Lcom/google/android/gms/internal/ads/g72;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, v2, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_6
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->c()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/dk1;->a(Lcom/google/android/gms/internal/ads/g72;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    :goto_3
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    sget p2, Lcom/google/android/gms/internal/ads/ik1;->a:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/dk1;->b(I)Lcom/google/android/gms/internal/ads/g72;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_8
    sget p2, Lcom/google/android/gms/internal/ads/ik1;->b:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/dk1;->b(I)Lcom/google/android/gms/internal/ads/g72;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/g72;->p()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->a()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p2

    array-length v0, p2

    :goto_4
    if-ge v5, v0, :cond_b

    aget-object v2, p2, v5

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dk1;->a()Ljava/io/File;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ck1;->a(Ljava/io/File;)Z

    :cond_a
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_b
    return v1
.end method
