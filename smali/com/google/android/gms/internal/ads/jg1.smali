.class final Lcom/google/android/gms/internal/ads/jg1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:J

.field private final b:Lcom/google/android/gms/internal/ads/ig1;

.field private c:J

.field private d:I

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/ig1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ig1;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/jg1;->b:Lcom/google/android/gms/internal/ads/ig1;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/jg1;->d:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/jg1;->e:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/jg1;->f:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/jg1;->a:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/jg1;->c:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/jg1;->a:J

    return-wide v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/jg1;->c:J

    return-wide v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/jg1;->d:I

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Created: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/jg1;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " Last accessed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/jg1;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " Accesses: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/gms/internal/ads/jg1;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\nEntries retrieved: Valid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/gms/internal/ads/jg1;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Stale: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/gms/internal/ads/jg1;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/jg1;->c:J

    iget v0, p0, Lcom/google/android/gms/internal/ads/jg1;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/jg1;->d:I

    return-void
.end method

.method public final f()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/jg1;->e:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/jg1;->e:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jg1;->b:Lcom/google/android/gms/internal/ads/ig1;

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/ig1;->b:Z

    return-void
.end method

.method public final g()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/jg1;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/jg1;->f:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jg1;->b:Lcom/google/android/gms/internal/ads/ig1;

    iget v1, v0, Lcom/google/android/gms/internal/ads/ig1;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/google/android/gms/internal/ads/ig1;->c:I

    return-void
.end method

.method public final h()Lcom/google/android/gms/internal/ads/ig1;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jg1;->b:Lcom/google/android/gms/internal/ads/ig1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ig1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/ig1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/jg1;->b:Lcom/google/android/gms/internal/ads/ig1;

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/google/android/gms/internal/ads/ig1;->b:Z

    iput v2, v1, Lcom/google/android/gms/internal/ads/ig1;->c:I

    return-object v0
.end method
