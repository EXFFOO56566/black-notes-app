.class final Lcom/google/android/gms/internal/ads/x12;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lcom/google/android/gms/internal/ads/py1;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/google/android/gms/internal/ads/s12;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/internal/ads/py1;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/dy1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/s12;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ads/s12;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/s12;->i()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/x12;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/s12;->a(Lcom/google/android/gms/internal/ads/s12;)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/x12;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/py1;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x12;->c:Lcom/google/android/gms/internal/ads/py1;

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/x12;->b:Ljava/util/ArrayDeque;

    check-cast p1, Lcom/google/android/gms/internal/ads/py1;

    goto :goto_0
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/v12;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/x12;-><init>(Lcom/google/android/gms/internal/ads/dy1;)V

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/py1;
    .locals 1

    :goto_0
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/s12;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ads/s12;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x12;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/s12;->a(Lcom/google/android/gms/internal/ads/s12;)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/ads/py1;

    return-object p1
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x12;->c:Lcom/google/android/gms/internal/ads/py1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x12;->c:Lcom/google/android/gms/internal/ads/py1;

    if-eqz v0, :cond_3

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/x12;->b:Ljava/util/ArrayDeque;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/x12;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/s12;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/s12;->b(Lcom/google/android/gms/internal/ads/s12;)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/x12;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/py1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/dy1;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/x12;->c:Lcom/google/android/gms/internal/ads/py1;

    return-object v0

    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
