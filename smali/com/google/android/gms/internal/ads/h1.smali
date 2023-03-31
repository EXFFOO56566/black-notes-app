.class public final Lcom/google/android/gms/internal/ads/h1;
.super Lcom/google/android/gms/internal/ads/r1;
.source ""


# static fields
.field private static final j:I

.field private static final k:I

.field private static final l:I


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/i1;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/v1;",
            ">;"
        }
    .end annotation
.end field

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xc

    const/16 v1, 0xae

    const/16 v2, 0xce

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/ads/h1;->j:I

    const/16 v0, 0xcc

    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/ads/h1;->k:I

    sget v0, Lcom/google/android/gms/internal/ads/h1;->j:I

    sput v0, Lcom/google/android/gms/internal/ads/h1;->l:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/i1;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "IIZ)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/r1;-><init>()V

    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/h1;->c:Ljava/util/List;

    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/h1;->d:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/h1;->b:Ljava/lang/String;

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p8

    if-ge p1, p8, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p8

    check-cast p8, Lcom/google/android/gms/internal/ads/i1;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h1;->c:Ljava/util/List;

    invoke-interface {v0, p8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h1;->d:Ljava/util/List;

    invoke-interface {v0, p8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    sget p1, Lcom/google/android/gms/internal/ads/h1;->k:I

    :goto_1
    iput p1, p0, Lcom/google/android/gms/internal/ads/h1;->e:I

    if-eqz p4, :cond_2

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_2
    sget p1, Lcom/google/android/gms/internal/ads/h1;->l:I

    :goto_2
    iput p1, p0, Lcom/google/android/gms/internal/ads/h1;->f:I

    if-eqz p5, :cond_3

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_3

    :cond_3
    const/16 p1, 0xc

    :goto_3
    iput p1, p0, Lcom/google/android/gms/internal/ads/h1;->g:I

    iput p6, p0, Lcom/google/android/gms/internal/ads/h1;->h:I

    iput p7, p0, Lcom/google/android/gms/internal/ads/h1;->i:I

    return-void
.end method


# virtual methods
.method public final D0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b2()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/h1;->e:I

    return v0
.end method

.method public final c2()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/h1;->f:I

    return v0
.end method

.method public final d2()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/h1;->g:I

    return v0
.end method

.method public final e2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/i1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h1;->c:Ljava/util/List;

    return-object v0
.end method

.method public final f2()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/h1;->h:I

    return v0
.end method

.method public final g2()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/h1;->i:I

    return v0
.end method

.method public final q0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/v1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h1;->d:Ljava/util/List;

    return-object v0
.end method
