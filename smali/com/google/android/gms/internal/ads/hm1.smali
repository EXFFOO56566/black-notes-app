.class final Lcom/google/android/gms/internal/ads/hm1;
.super Lcom/google/android/gms/internal/ads/cm1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/ads/cm1<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field private final transient d:Lcom/google/android/gms/internal/ads/yl1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/yl1<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient e:[Ljava/lang/Object;

.field private final transient f:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/yl1;[Ljava/lang/Object;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/yl1<",
            "TK;TV;>;[",
            "Ljava/lang/Object;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/cm1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hm1;->d:Lcom/google/android/gms/internal/ads/yl1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hm1;->e:[Ljava/lang/Object;

    iput p4, p0, Lcom/google/android/gms/internal/ads/hm1;->f:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/hm1;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/hm1;->f:I

    return p0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/hm1;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/hm1;->e:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method final a([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/cm1;->g()Lcom/google/android/gms/internal/ads/ul1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ul1;->a([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final a()Lcom/google/android/gms/internal/ads/qm1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/qm1<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/cm1;->g()Lcom/google/android/gms/internal/ads/ul1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ul1;->iterator()Ljava/util/Iterator;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/qm1;

    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/hm1;->d:Lcom/google/android/gms/internal/ads/yl1;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/yl1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method final i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/hm1;->a()Lcom/google/android/gms/internal/ads/qm1;

    move-result-object v0

    return-object v0
.end method

.method final l()Lcom/google/android/gms/internal/ads/ul1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/ul1<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/km1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/km1;-><init>(Lcom/google/android/gms/internal/ads/hm1;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/hm1;->f:I

    return v0
.end method
