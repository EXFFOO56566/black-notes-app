.class final Lcom/google/android/gms/internal/ads/mm1;
.super Lcom/google/android/gms/internal/ads/ul1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/ul1<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final transient d:[Ljava/lang/Object;

.field private final transient e:I

.field private final transient f:I


# direct methods
.method constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ul1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mm1;->d:[Ljava/lang/Object;

    iput p2, p0, Lcom/google/android/gms/internal/ads/mm1;->e:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/mm1;->f:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/mm1;->f:I

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/jl1;->a(II)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mm1;->d:[Ljava/lang/Object;

    mul-int/lit8 p1, p1, 0x2

    iget v1, p0, Lcom/google/android/gms/internal/ads/mm1;->e:I

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    return-object p1
.end method

.method final i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/mm1;->f:I

    return v0
.end method
