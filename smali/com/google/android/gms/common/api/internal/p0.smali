.class public final Lcom/google/android/gms/common/api/internal/p0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:La/e/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/e/a<",
            "Lcom/google/android/gms/common/api/internal/b<",
            "*>;",
            "Lb/c/b/a/c/b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:La/e/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/e/a<",
            "Lcom/google/android/gms/common/api/internal/b<",
            "*>;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lb/c/b/a/h/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/c/b/a/h/g<",
            "Ljava/util/Map<",
            "Lcom/google/android/gms/common/api/internal/b<",
            "*>;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Z


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/internal/b<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p0;->a:La/e/a;

    invoke-virtual {v0}, La/e/a;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/common/api/internal/b;Lb/c/b/a/c/b;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/b<",
            "*>;",
            "Lb/c/b/a/c/b;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p0;->a:La/e/a;

    invoke-virtual {v0, p1, p2}, La/e/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p0;->b:La/e/a;

    invoke-virtual {v0, p1, p3}, La/e/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/gms/common/api/internal/p0;->d:I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    iput p1, p0, Lcom/google/android/gms/common/api/internal/p0;->d:I

    invoke-virtual {p2}, Lb/c/b/a/c/b;->j()Z

    move-result p1

    if-nez p1, :cond_0

    iput-boolean p3, p0, Lcom/google/android/gms/common/api/internal/p0;->e:Z

    :cond_0
    iget p1, p0, Lcom/google/android/gms/common/api/internal/p0;->d:I

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/google/android/gms/common/api/internal/p0;->e:Z

    if-eqz p1, :cond_1

    new-instance p1, Lcom/google/android/gms/common/api/c;

    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/p0;->a:La/e/a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/common/api/c;-><init>(La/e/a;)V

    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/p0;->c:Lb/c/b/a/h/g;

    invoke-virtual {p2, p1}, Lb/c/b/a/h/g;->a(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/p0;->c:Lb/c/b/a/h/g;

    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/p0;->b:La/e/a;

    invoke-virtual {p1, p2}, Lb/c/b/a/h/g;->a(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
