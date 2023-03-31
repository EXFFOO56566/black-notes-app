.class final Lcom/google/android/gms/internal/ads/lm1;
.super Lcom/google/android/gms/internal/ads/cm1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/ads/cm1<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final i:Lcom/google/android/gms/internal/ads/lm1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/lm1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final transient d:[Ljava/lang/Object;

.field private final transient e:[Ljava/lang/Object;

.field private final transient f:I

.field private final transient g:I

.field private final transient h:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lcom/google/android/gms/internal/ads/lm1;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/lm1;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v6, Lcom/google/android/gms/internal/ads/lm1;->i:Lcom/google/android/gms/internal/ads/lm1;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/cm1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lm1;->d:[Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/lm1;->e:[Ljava/lang/Object;

    iput p4, p0, Lcom/google/android/gms/internal/ads/lm1;->f:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/lm1;->g:I

    iput p5, p0, Lcom/google/android/gms/internal/ads/lm1;->h:I

    return-void
.end method


# virtual methods
.method final a([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lm1;->d:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/lm1;->h:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/android/gms/internal/ads/lm1;->h:I

    add-int/2addr p2, p1

    return p2
.end method

.method public final a()Lcom/google/android/gms/internal/ads/qm1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/qm1<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/cm1;->g()Lcom/google/android/gms/internal/ads/ul1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ul1;->iterator()Ljava/util/Iterator;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/qm1;

    return-object v0
.end method

.method final b()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lm1;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lm1;->e:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    if-nez p1, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ql1;->a(I)I

    move-result v2

    :goto_1
    iget v3, p0, Lcom/google/android/gms/internal/ads/lm1;->f:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_2

    return v1

    :cond_2
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return v1
.end method

.method final d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/lm1;->h:I

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/lm1;->g:I

    return v0
.end method

.method final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/lm1;->a()Lcom/google/android/gms/internal/ads/qm1;

    move-result-object v0

    return-object v0
.end method

.method final k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method final l()Lcom/google/android/gms/internal/ads/ul1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/ul1<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lm1;->d:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/lm1;->h:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/ul1;->b([Ljava/lang/Object;I)Lcom/google/android/gms/internal/ads/ul1;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/lm1;->h:I

    return v0
.end method
