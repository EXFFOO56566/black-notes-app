.class final Lcom/google/android/gms/internal/ads/zl1;
.super Lcom/google/android/gms/internal/ads/ul1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/ul1<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final transient d:I

.field private final transient e:I

.field private final synthetic f:Lcom/google/android/gms/internal/ads/ul1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ul1;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zl1;->f:Lcom/google/android/gms/internal/ads/ul1;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ul1;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/ads/zl1;->d:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zl1;->e:I

    return-void
.end method


# virtual methods
.method public final a(II)Lcom/google/android/gms/internal/ads/ul1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/android/gms/internal/ads/ul1<",
            "TE;>;"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zl1;->e:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/jl1;->a(III)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zl1;->f:Lcom/google/android/gms/internal/ads/ul1;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zl1;->d:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ul1;->subList(II)Ljava/util/List;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/ul1;

    return-object p1
.end method

.method final b()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zl1;->f:Lcom/google/android/gms/internal/ads/ul1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/tl1;->b()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method final d()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zl1;->f:Lcom/google/android/gms/internal/ads/ul1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/tl1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zl1;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method final e()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zl1;->f:Lcom/google/android/gms/internal/ads/ul1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/tl1;->d()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zl1;->d:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zl1;->e:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zl1;->e:I

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/jl1;->a(II)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zl1;->f:Lcom/google/android/gms/internal/ads/ul1;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zl1;->d:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zl1;->e:I

    return v0
.end method

.method public final synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zl1;->a(II)Lcom/google/android/gms/internal/ads/ul1;

    move-result-object p1

    return-object p1
.end method
