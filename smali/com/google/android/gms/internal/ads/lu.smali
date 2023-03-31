.class public final Lcom/google/android/gms/internal/ads/lu;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:I

.field public final b:I

.field public final c:I


# direct methods
.method private constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/lu;->a:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/lu;->c:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/lu;->b:I

    return-void
.end method

.method public static a(II)Lcom/google/android/gms/internal/ads/lu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/lu;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/internal/ads/lu;-><init>(III)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/um2;)Lcom/google/android/gms/internal/ads/lu;
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/um2;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/ads/lu;

    const/4 v0, 0x3

    invoke-direct {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/lu;-><init>(III)V

    return-object p0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/um2;->j:Z

    if-eqz v0, :cond_1

    new-instance p0, Lcom/google/android/gms/internal/ads/lu;

    const/4 v0, 0x2

    invoke-direct {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/lu;-><init>(III)V

    return-object p0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/um2;->i:Z

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/ads/lu;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object p0

    return-object p0

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/um2;->g:I

    iget p0, p0, Lcom/google/android/gms/internal/ads/um2;->d:I

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/lu;->a(II)Lcom/google/android/gms/internal/ads/lu;

    move-result-object p0

    return-object p0
.end method

.method public static f()Lcom/google/android/gms/internal/ads/lu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/lu;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lcom/google/android/gms/internal/ads/lu;-><init>(III)V

    return-object v0
.end method

.method public static g()Lcom/google/android/gms/internal/ads/lu;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/lu;

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1, v1}, Lcom/google/android/gms/internal/ads/lu;-><init>(III)V

    return-object v0
.end method

.method public static h()Lcom/google/android/gms/internal/ads/lu;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/lu;

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-direct {v0, v2, v1, v1}, Lcom/google/android/gms/internal/ads/lu;-><init>(III)V

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/lu;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/lu;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/lu;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/lu;->a:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/lu;->a:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
