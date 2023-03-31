.class final Lcom/google/android/gms/internal/ads/u12;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/google/android/gms/internal/ads/dy1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/v12;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/u12;-><init>()V

    return-void
.end method

.method private static a(I)I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/s12;->j:[I

    invoke-static {v0, p0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result p0

    if-gez p0, :cond_0

    add-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    add-int/lit8 p0, p0, -0x1

    :cond_0
    return p0
.end method

.method private final a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/dy1;
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/u12;->a(Lcom/google/android/gms/internal/ads/dy1;)V

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/u12;->a(Lcom/google/android/gms/internal/ads/dy1;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/dy1;

    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/dy1;

    new-instance v0, Lcom/google/android/gms/internal/ads/s12;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p1, v1}, Lcom/google/android/gms/internal/ads/s12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/v12;)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/u12;Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/dy1;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/u12;->a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p0

    return-object p0
.end method

.method private final a(Lcom/google/android/gms/internal/ads/dy1;)V
    .locals 5

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/u12;->a(I)I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/s12;->i(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v2

    if-lt v2, v1, :cond_0

    goto :goto_3

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/s12;->i(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/dy1;

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v2

    if-ge v2, v0, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/dy1;

    new-instance v4, Lcom/google/android/gms/internal/ads/s12;

    invoke-direct {v4, v2, v1, v3}, Lcom/google/android/gms/internal/ads/s12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/v12;)V

    move-object v1, v4

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/s12;

    invoke-direct {v0, v1, p1, v3}, Lcom/google/android/gms/internal/ads/s12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/v12;)V

    :goto_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/s12;->size()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/u12;->a(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/s12;->i(I)I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v1

    if-ge v1, p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/dy1;

    new-instance v1, Lcom/google/android/gms/internal/ads/s12;

    invoke-direct {v1, p1, v0, v3}, Lcom/google/android/gms/internal/ads/s12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/v12;)V

    move-object v0, v1

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    return-void

    :cond_3
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u12;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    return-void

    :cond_4
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/s12;

    if-eqz v0, :cond_5

    check-cast p1, Lcom/google/android/gms/internal/ads/s12;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/s12;->a(Lcom/google/android/gms/internal/ads/s12;)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/u12;->a(Lcom/google/android/gms/internal/ads/dy1;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/s12;->b(Lcom/google/android/gms/internal/ads/s12;)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    goto/16 :goto_0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x31

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Has a new type of ByteString been created? Found "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
