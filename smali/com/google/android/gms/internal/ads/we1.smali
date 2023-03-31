.class public final Lcom/google/android/gms/internal/ads/we1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/ye1;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/ik;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/ik;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/we1;->a:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/we1;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/we1;->c:Lcom/google/android/gms/internal/ads/ik;

    return-void
.end method

.method private final a()Lcom/google/android/gms/internal/ads/ye1;
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/ads/ye1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/we1;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/we1;->c:Lcom/google/android/gms/internal/ads/ik;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/ik;->i()Lcom/google/android/gms/internal/ads/yk;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/we1;->c:Lcom/google/android/gms/internal/ads/ik;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/ik;->k()Lcom/google/android/gms/internal/ads/tk;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/ye1;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/yk;Lcom/google/android/gms/internal/ads/tk;Lcom/google/android/gms/internal/ads/ue1;)V

    return-object v0
.end method

.method private final b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ye1;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/we1;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vg;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/vg;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/vg;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Lcom/google/android/gms/internal/ads/bl;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/bl;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/we1;->b:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Lcom/google/android/gms/internal/ads/bl;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    new-instance p1, Lcom/google/android/gms/internal/ads/cl;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/we1;->c:Lcom/google/android/gms/internal/ads/ik;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/ik;->i()Lcom/google/android/gms/internal/ads/yk;

    move-result-object v2

    invoke-direct {p1, v2, v1}, Lcom/google/android/gms/internal/ads/cl;-><init>(Lcom/google/android/gms/internal/ads/yk;Lcom/google/android/gms/internal/ads/yk;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/tk;

    invoke-static {}, Lcom/google/android/gms/internal/ads/sn;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/ads/tk;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/yk;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/ye1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, v1, v3}, Lcom/google/android/gms/internal/ads/ye1;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/yk;Lcom/google/android/gms/internal/ads/tk;Lcom/google/android/gms/internal/ads/ue1;)V

    return-object v2

    :catch_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/we1;->a()Lcom/google/android/gms/internal/ads/ye1;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ye1;
    .locals 2

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/we1;->a()Lcom/google/android/gms/internal/ads/ye1;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/we1;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/we1;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/ye1;

    return-object p1

    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/we1;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ye1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/we1;->a:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
