.class final Lcom/google/android/gms/internal/ads/s12;
.super Lcom/google/android/gms/internal/ads/dy1;
.source ""


# static fields
.field static final j:[I


# instance fields
.field private final e:I

.field private final f:Lcom/google/android/gms/internal/ads/dy1;

.field private final g:Lcom/google/android/gms/internal/ads/dy1;

.field private final h:I

.field private final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/s12;->j:[I

    return-void

    :array_0
    .array-data 4
        0x1
        0x1
        0x2
        0x3
        0x5
        0x8
        0xd
        0x15
        0x22
        0x37
        0x59
        0x90
        0xe9
        0x179
        0x262
        0x3db
        0x63d
        0xa18
        0x1055
        0x1a6d
        0x2ac2
        0x452f
        0x6ff1
        0xb520
        0x12511
        0x1da31
        0x2ff42
        0x4d973
        0x7d8b5
        0xcb228
        0x148add
        0x213d05
        0x35c7e2
        0x5704e7
        0x8cccc9
        0xe3d1b0
        0x1709e79
        0x2547029
        0x3c50ea2
        0x6197ecb
        0x9de8d6d
        0xff80c38
        0x19d699a5
        0x29cea5dd
        0x43a53f82
        0x6d73e55f
        0x7fffffff
    .end array-data
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dy1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/s12;->h:I

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/s12;->e:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->i()I

    move-result p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/dy1;->i()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/s12;->i:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/v12;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/s12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)V

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/dy1;
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x80

    if-ge v0, v1, :cond_2

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/s12;->b(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v2, p0, Lcom/google/android/gms/internal/ads/s12;

    if-eqz v2, :cond_4

    move-object v2, p0

    check-cast v2, Lcom/google/android/gms/internal/ads/s12;

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v4

    add-int/2addr v3, v4

    if-ge v3, v1, :cond_3

    iget-object p0, v2, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/s12;->b(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p0

    new-instance p1, Lcom/google/android/gms/internal/ads/s12;

    iget-object v0, v2, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-direct {p1, v0, p0}, Lcom/google/android/gms/internal/ads/s12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)V

    return-object p1

    :cond_3
    iget-object v1, v2, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/dy1;->i()I

    move-result v1

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/dy1;->i()I

    move-result v3

    if-le v1, v3, :cond_4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/s12;->i()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->i()I

    move-result v3

    if-le v1, v3, :cond_4

    new-instance p0, Lcom/google/android/gms/internal/ads/s12;

    iget-object v0, v2, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ads/s12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/s12;

    iget-object v0, v2, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-direct {p1, v0, p0}, Lcom/google/android/gms/internal/ads/s12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)V

    return-object p1

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/dy1;->i()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->i()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/s12;->i(I)I

    move-result v1

    if-lt v0, v1, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/ads/s12;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/s12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)V

    return-object v0

    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/ads/u12;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/u12;-><init>(Lcom/google/android/gms/internal/ads/v12;)V

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/u12;->a(Lcom/google/android/gms/internal/ads/u12;Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/s12;)Lcom/google/android/gms/internal/ads/dy1;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    return-object p0
.end method

.method private static b(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/dy1;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v1

    add-int v2, v0, v1

    new-array v2, v2, [B

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3, v3, v0}, Lcom/google/android/gms/internal/ads/dy1;->a([BIII)V

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/google/android/gms/internal/ads/dy1;->a([BIII)V

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/dy1;->b([B)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/s12;)Lcom/google/android/gms/internal/ads/dy1;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    return-object p0
.end method

.method static i(I)I
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/s12;->j:[I

    array-length v1, v0

    if-lt p0, v1, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    aget p0, v0, p0

    return p0
.end method


# virtual methods
.method protected final a(III)I
    .locals 2

    add-int v0, p2, p3

    iget v1, p0, Lcom/google/android/gms/internal/ads/s12;->h:I

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/dy1;->a(III)I

    move-result p1

    return p1

    :cond_0
    if-lt p2, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    sub-int/2addr p2, v1

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/dy1;->a(III)I

    move-result p1

    return p1

    :cond_1
    sub-int/2addr v1, p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/dy1;->a(III)I

    move-result p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    const/4 v0, 0x0

    sub-int/2addr p3, v1

    invoke-virtual {p2, p1, v0, p3}, Lcom/google/android/gms/internal/ads/dy1;->a(III)I

    move-result p1

    return p1
.end method

.method public final a(II)Lcom/google/android/gms/internal/ads/dy1;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/s12;->e:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/dy1;->c(III)I

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/dy1;->c:Lcom/google/android/gms/internal/ads/dy1;

    return-object p1

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/s12;->e:I

    if-ne v0, v1, :cond_1

    return-object p0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/s12;->h:I

    if-gt p2, v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/dy1;->a(II)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    return-object p1

    :cond_2
    if-lt p1, v0, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    sub-int/2addr p1, v0

    sub-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/ads/dy1;->a(II)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/dy1;->a(II)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/internal/ads/s12;->h:I

    sub-int/2addr p2, v2

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/ads/dy1;->a(II)Lcom/google/android/gms/internal/ads/dy1;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/s12;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/s12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/dy1;)V

    return-object v0
.end method

.method protected final a(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/dy1;->a()[B

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method final a(Lcom/google/android/gms/internal/ads/ey1;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dy1;->a(Lcom/google/android/gms/internal/ads/ey1;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dy1;->a(Lcom/google/android/gms/internal/ads/ey1;)V

    return-void
.end method

.method protected final b(III)I
    .locals 2

    add-int v0, p2, p3

    iget v1, p0, Lcom/google/android/gms/internal/ads/s12;->h:I

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/dy1;->b(III)I

    move-result p1

    return p1

    :cond_0
    if-lt p2, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    sub-int/2addr p2, v1

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/dy1;->b(III)I

    move-result p1

    return p1

    :cond_1
    sub-int/2addr v1, p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/dy1;->b(III)I

    move-result p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    const/4 v0, 0x0

    sub-int/2addr p3, v1

    invoke-virtual {p2, p1, v0, p3}, Lcom/google/android/gms/internal/ads/dy1;->b(III)I

    move-result p1

    return p1
.end method

.method public final b()Lcom/google/android/gms/internal/ads/my1;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/v12;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/v12;-><init>(Lcom/google/android/gms/internal/ads/s12;)V

    return-object v0
.end method

.method protected final b([BIII)V
    .locals 2

    add-int v0, p2, p4

    iget v1, p0, Lcom/google/android/gms/internal/ads/s12;->h:I

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/dy1;->b([BIII)V

    return-void

    :cond_0
    if-lt p2, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    sub-int/2addr p2, v1

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/dy1;->b([BIII)V

    return-void

    :cond_1
    sub-int/2addr v1, p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/ads/dy1;->b([BIII)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    const/4 v0, 0x0

    add-int/2addr p3, v1

    sub-int/2addr p4, v1

    invoke-virtual {p2, p1, v0, p3, p4}, Lcom/google/android/gms/internal/ads/dy1;->b([BIII)V

    return-void
.end method

.method public final e()Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    iget v1, p0, Lcom/google/android/gms/internal/ads/s12;->h:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1}, Lcom/google/android/gms/internal/ads/dy1;->a(III)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v3

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/internal/ads/dy1;->a(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 12

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/ads/dy1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/dy1;

    iget v1, p0, Lcom/google/android/gms/internal/ads/s12;->e:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/ads/s12;->e:I

    if-nez v1, :cond_3

    return v0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/dy1;->l()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->l()I

    move-result v3

    if-eqz v1, :cond_4

    if-eqz v3, :cond_4

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    new-instance v1, Lcom/google/android/gms/internal/ads/x12;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3}, Lcom/google/android/gms/internal/ads/x12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/v12;)V

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/py1;

    new-instance v5, Lcom/google/android/gms/internal/ads/x12;

    invoke-direct {v5, p1, v3}, Lcom/google/android/gms/internal/ads/x12;-><init>(Lcom/google/android/gms/internal/ads/dy1;Lcom/google/android/gms/internal/ads/v12;)V

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/py1;

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v8

    sub-int/2addr v8, v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dy1;->size()I

    move-result v9

    sub-int/2addr v9, v6

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v10

    if-nez v3, :cond_5

    invoke-virtual {v4, p1, v6, v10}, Lcom/google/android/gms/internal/ads/py1;->a(Lcom/google/android/gms/internal/ads/dy1;II)Z

    move-result v11

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v4, v3, v10}, Lcom/google/android/gms/internal/ads/py1;->a(Lcom/google/android/gms/internal/ads/dy1;II)Z

    move-result v11

    :goto_1
    if-nez v11, :cond_6

    return v2

    :cond_6
    add-int/2addr v7, v10

    iget v11, p0, Lcom/google/android/gms/internal/ads/s12;->e:I

    if-lt v7, v11, :cond_8

    if-ne v7, v11, :cond_7

    return v0

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_8
    if-ne v10, v8, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/py1;

    move-object v4, v3

    const/4 v3, 0x0

    goto :goto_2

    :cond_9
    add-int/2addr v3, v10

    :goto_2
    if-ne v10, v9, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/py1;

    const/4 v6, 0x0

    goto :goto_0

    :cond_a
    add-int/2addr v6, v10

    goto :goto_0
.end method

.method public final f(I)B
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/s12;->e:I

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/dy1;->b(II)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/s12;->g(I)B

    move-result p1

    return p1
.end method

.method final g(I)B
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/s12;->h:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s12;->f:Lcom/google/android/gms/internal/ads/dy1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/dy1;->g(I)B

    move-result p1

    return p1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/s12;->g:Lcom/google/android/gms/internal/ads/dy1;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/dy1;->g(I)B

    move-result p1

    return p1
.end method

.method public final g()Lcom/google/android/gms/internal/ads/ty1;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/w12;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/w12;-><init>(Lcom/google/android/gms/internal/ads/s12;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/uy1;

    const/16 v2, 0x1000

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/gms/internal/ads/uy1;-><init>(Ljava/io/InputStream;ILcom/google/android/gms/internal/ads/sy1;)V

    return-object v1
.end method

.method protected final i()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/s12;->i:I

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/s12;->b()Lcom/google/android/gms/internal/ads/my1;

    move-result-object v0

    return-object v0
.end method

.method protected final k()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/s12;->e:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/s12;->i:I

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/s12;->i(I)I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/s12;->e:I

    return v0
.end method
