.class public abstract Lcom/google/android/gms/internal/ads/me2;
.super Lcom/google/android/gms/internal/ads/se2;
.source ""


# instance fields
.field private final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lcom/google/android/gms/internal/ads/ee2;",
            "Lcom/google/android/gms/internal/ads/oe2;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Landroid/util/SparseBooleanArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/se2;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/me2;->b:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/me2;->c:Landroid/util/SparseBooleanArray;

    return-void
.end method


# virtual methods
.method public final a([Lcom/google/android/gms/internal/ads/m82;Lcom/google/android/gms/internal/ads/ee2;)Lcom/google/android/gms/internal/ads/ue2;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    array-length v3, v1

    add-int/lit8 v3, v3, 0x1

    new-array v3, v3, [I

    array-length v4, v1

    add-int/lit8 v4, v4, 0x1

    new-array v5, v4, [[Lcom/google/android/gms/internal/ads/ae2;

    array-length v6, v1

    add-int/lit8 v6, v6, 0x1

    new-array v11, v6, [[[I

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v4, :cond_0

    iget v8, v2, Lcom/google/android/gms/internal/ads/ee2;->a:I

    new-array v9, v8, [Lcom/google/android/gms/internal/ads/ae2;

    aput-object v9, v5, v7

    new-array v8, v8, [[I

    aput-object v8, v11, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    array-length v4, v1

    new-array v10, v4, [I

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v4, :cond_1

    aget-object v8, v1, v7

    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/m82;->c()I

    move-result v8

    aput v8, v10, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_2
    iget v7, v2, Lcom/google/android/gms/internal/ads/ee2;->a:I

    if-ge v4, v7, :cond_7

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/ee2;->a(I)Lcom/google/android/gms/internal/ads/ae2;

    move-result-object v7

    array-length v8, v1

    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_3
    array-length v13, v1

    if-ge v9, v13, :cond_4

    aget-object v13, v1, v9

    const/4 v14, 0x0

    :goto_4
    iget v15, v7, Lcom/google/android/gms/internal/ads/ae2;->a:I

    if-ge v14, v15, :cond_3

    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/ads/ae2;->a(I)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v15

    invoke-interface {v13, v15}, Lcom/google/android/gms/internal/ads/m82;->a(Lcom/google/android/gms/internal/ads/e82;)I

    move-result v15

    const/4 v6, 0x3

    and-int/2addr v15, v6

    if-le v15, v12, :cond_2

    move v8, v9

    if-eq v15, v6, :cond_4

    move v12, v15

    :cond_2
    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_4
    array-length v6, v1

    if-ne v8, v6, :cond_5

    iget v6, v7, Lcom/google/android/gms/internal/ads/ae2;->a:I

    new-array v6, v6, [I

    goto :goto_6

    :cond_5
    aget-object v6, v1, v8

    iget v9, v7, Lcom/google/android/gms/internal/ads/ae2;->a:I

    new-array v9, v9, [I

    const/4 v12, 0x0

    :goto_5
    iget v13, v7, Lcom/google/android/gms/internal/ads/ae2;->a:I

    if-ge v12, v13, :cond_6

    invoke-virtual {v7, v12}, Lcom/google/android/gms/internal/ads/ae2;->a(I)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v13

    invoke-interface {v6, v13}, Lcom/google/android/gms/internal/ads/m82;->a(Lcom/google/android/gms/internal/ads/e82;)I

    move-result v13

    aput v13, v9, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_6
    move-object v6, v9

    :goto_6
    aget v9, v3, v8

    aget-object v12, v5, v8

    aput-object v7, v12, v9

    aget-object v7, v11, v8

    aput-object v6, v7, v9

    aget v6, v3, v8

    add-int/lit8 v6, v6, 0x1

    aput v6, v3, v8

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_7
    array-length v4, v1

    new-array v9, v4, [Lcom/google/android/gms/internal/ads/ee2;

    array-length v4, v1

    new-array v8, v4, [I

    const/4 v4, 0x0

    :goto_7
    array-length v6, v1

    if-ge v4, v6, :cond_8

    aget v6, v3, v4

    new-instance v7, Lcom/google/android/gms/internal/ads/ee2;

    aget-object v12, v5, v4

    invoke-static {v12, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Lcom/google/android/gms/internal/ads/ae2;

    invoke-direct {v7, v12}, Lcom/google/android/gms/internal/ads/ee2;-><init>([Lcom/google/android/gms/internal/ads/ae2;)V

    aput-object v7, v9, v4

    aget-object v7, v11, v4

    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [[I

    aput-object v6, v11, v4

    aget-object v6, v1, v4

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/m82;->F()I

    move-result v6

    aput v6, v8, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_8
    array-length v4, v1

    aget v3, v3, v4

    new-instance v12, Lcom/google/android/gms/internal/ads/ee2;

    array-length v4, v1

    aget-object v4, v5, v4

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lcom/google/android/gms/internal/ads/ae2;

    invoke-direct {v12, v3}, Lcom/google/android/gms/internal/ads/ee2;-><init>([Lcom/google/android/gms/internal/ads/ae2;)V

    invoke-virtual {v0, v1, v9, v11}, Lcom/google/android/gms/internal/ads/me2;->a([Lcom/google/android/gms/internal/ads/m82;[Lcom/google/android/gms/internal/ads/ee2;[[[I)[Lcom/google/android/gms/internal/ads/ne2;

    move-result-object v3

    const/4 v4, 0x0

    :goto_8
    array-length v5, v1

    const/4 v6, 0x0

    if-ge v4, v5, :cond_c

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/me2;->c:Landroid/util/SparseBooleanArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v5

    if-eqz v5, :cond_9

    aput-object v6, v3, v4

    goto :goto_a

    :cond_9
    aget-object v5, v9, v4

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/me2;->b:Landroid/util/SparseArray;

    invoke-virtual {v7, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    if-nez v7, :cond_a

    goto :goto_9

    :cond_a
    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/google/android/gms/internal/ads/oe2;

    :goto_9
    if-nez v6, :cond_b

    :goto_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_b
    new-instance v1, Ljava/lang/NoSuchMethodError;

    invoke-direct {v1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw v1

    :cond_c
    new-instance v4, Lcom/google/android/gms/internal/ads/le2;

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/google/android/gms/internal/ads/le2;-><init>([I[Lcom/google/android/gms/internal/ads/ee2;[I[[[ILcom/google/android/gms/internal/ads/ee2;)V

    array-length v5, v1

    new-array v5, v5, [Lcom/google/android/gms/internal/ads/l82;

    const/4 v7, 0x0

    :goto_b
    array-length v8, v1

    if-ge v7, v8, :cond_e

    aget-object v8, v3, v7

    if-eqz v8, :cond_d

    sget-object v8, Lcom/google/android/gms/internal/ads/l82;->b:Lcom/google/android/gms/internal/ads/l82;

    goto :goto_c

    :cond_d
    move-object v8, v6

    :goto_c
    aput-object v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_b

    :cond_e
    new-instance v1, Lcom/google/android/gms/internal/ads/ue2;

    new-instance v6, Lcom/google/android/gms/internal/ads/pe2;

    invoke-direct {v6, v3}, Lcom/google/android/gms/internal/ads/pe2;-><init>([Lcom/google/android/gms/internal/ads/ne2;)V

    invoke-direct {v1, v2, v6, v4, v5}, Lcom/google/android/gms/internal/ads/ue2;-><init>(Lcom/google/android/gms/internal/ads/ee2;Lcom/google/android/gms/internal/ads/pe2;Ljava/lang/Object;[Lcom/google/android/gms/internal/ads/l82;)V

    return-object v1
.end method

.method public final a(IZ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/me2;->c:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v0

    if-ne v0, p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/me2;->c:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseBooleanArray;->put(IZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/se2;->a()V

    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/le2;

    return-void
.end method

.method protected abstract a([Lcom/google/android/gms/internal/ads/m82;[Lcom/google/android/gms/internal/ads/ee2;[[[I)[Lcom/google/android/gms/internal/ads/ne2;
.end method
