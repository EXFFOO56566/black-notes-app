.class public Lcom/google/android/gms/internal/ads/ge2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ne2;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ae2;

.field private final b:I

.field private final c:[I

.field private final d:[Lcom/google/android/gms/internal/ads/e82;

.field private e:I


# direct methods
.method public varargs constructor <init>(Lcom/google/android/gms/internal/ads/ae2;[I)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p2

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mf2;->b(Z)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mf2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/ae2;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ge2;->a:Lcom/google/android/gms/internal/ads/ae2;

    array-length v0, p2

    iput v0, p0, Lcom/google/android/gms/internal/ads/ge2;->b:I

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/e82;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ge2;->d:[Lcom/google/android/gms/internal/ads/e82;

    const/4 v0, 0x0

    :goto_1
    array-length v2, p2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ge2;->d:[Lcom/google/android/gms/internal/ads/e82;

    aget v3, p2, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/ae2;->a(I)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ge2;->d:[Lcom/google/android/gms/internal/ads/e82;

    new-instance v0, Lcom/google/android/gms/internal/ads/ie2;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/ie2;-><init>(Lcom/google/android/gms/internal/ads/fe2;)V

    invoke-static {p2, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    iget p2, p0, Lcom/google/android/gms/internal/ads/ge2;->b:I

    new-array p2, p2, [I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ge2;->c:[I

    :goto_2
    iget p2, p0, Lcom/google/android/gms/internal/ads/ge2;->b:I

    if-ge v1, p2, :cond_2

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ge2;->c:[I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ge2;->d:[Lcom/google/android/gms/internal/ads/e82;

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/ae2;->a(Lcom/google/android/gms/internal/ads/e82;)I

    move-result v0

    aput v0, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    new-array p1, p2, [J

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ge2;->c:[I

    const/4 v0, 0x0

    aget p1, p1, v0

    return p1
.end method

.method public final a()Lcom/google/android/gms/internal/ads/ae2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ge2;->a:Lcom/google/android/gms/internal/ads/ae2;

    return-object v0
.end method

.method public final b(I)Lcom/google/android/gms/internal/ads/e82;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ge2;->d:[Lcom/google/android/gms/internal/ads/e82;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/ge2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ge2;->a:Lcom/google/android/gms/internal/ads/ae2;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/ge2;->a:Lcom/google/android/gms/internal/ads/ae2;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ge2;->c:[I

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/ge2;->c:[I

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/ge2;->e:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ge2;->a:Lcom/google/android/gms/internal/ads/ae2;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ge2;->c:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/ge2;->e:I

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/ge2;->e:I

    return v0
.end method

.method public final length()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ge2;->c:[I

    array-length v0, v0

    return v0
.end method
