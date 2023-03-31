.class public final Lcom/google/android/gms/internal/ads/dj0;
.super Lcom/google/android/gms/internal/ads/v2;
.source ""


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/if0;

.field private d:Lcom/google/android/gms/internal/ads/gg0;

.field private e:Lcom/google/android/gms/internal/ads/xe0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/if0;Lcom/google/android/gms/internal/ads/gg0;Lcom/google/android/gms/internal/ads/xe0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/v2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dj0;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/dj0;->d:Lcom/google/android/gms/internal/ads/gg0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/dj0;->e:Lcom/google/android/gms/internal/ads/xe0;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/dj0;)Lcom/google/android/gms/internal/ads/xe0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/dj0;->e:Lcom/google/android/gms/internal/ads/xe0;

    return-object p0
.end method


# virtual methods
.method public final C1()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->v()Lb/c/b/a/d/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->r()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yd;->a(Lb/c/b/a/d/a;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const-string v0, "Trying to start OMID session before creation."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method

.method public final D(Lb/c/b/a/d/a;)V
    .locals 1

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->v()Lb/c/b/a/d/a;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->e:Lcom/google/android/gms/internal/ads/xe0;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/View;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/xe0;->c(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final O(Lb/c/b/a/d/a;)Z
    .locals 3

    invoke-static {p1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->d:Lcom/google/android/gms/internal/ads/gg0;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/gg0;->a(Landroid/view/ViewGroup;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    return v1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/if0;->t()Lcom/google/android/gms/internal/ads/ws;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/cj0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/cj0;-><init>(Lcom/google/android/gms/internal/ads/dj0;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/ws;->a(Lcom/google/android/gms/internal/ads/k1;)V

    return v2
.end method

.method public final P0()Lb/c/b/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->b:Landroid/content/Context;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v0

    return-object v0
.end method

.method public final X1()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->e:Lcom/google/android/gms/internal/ads/xe0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xe0;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->u()Lcom/google/android/gms/internal/ads/ws;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->t()Lcom/google/android/gms/internal/ads/ws;

    move-result-object v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final Y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final destroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->e:Lcom/google/android/gms/internal/ads/xe0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xe0;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->e:Lcom/google/android/gms/internal/ads/xe0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->d:Lcom/google/android/gms/internal/ads/gg0;

    return-void
.end method

.method public final g(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/v1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->w()La/e/g;

    move-result-object v0

    invoke-virtual {v0, p1}, La/e/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/v1;

    return-object p1
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/ads/rp2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->n()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0

    return-object v0
.end method

.method public final h1()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->x()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Google"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "Illegal argument specified for omid partner name."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dj0;->e:Lcom/google/android/gms/internal/ads/xe0;

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/xe0;->a(Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->e:Lcom/google/android/gms/internal/ads/xe0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xe0;->i()V

    :cond_0
    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->e:Lcom/google/android/gms/internal/ads/xe0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/xe0;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final n()Lb/c/b/a/d/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final p0()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->w()La/e/g;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/if0;->y()La/e/g;

    move-result-object v1

    invoke-virtual {v0}, La/e/g;->size()I

    move-result v2

    invoke-virtual {v1}, La/e/g;->size()I

    move-result v3

    add-int/2addr v2, v3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v0}, La/e/g;->size()I

    move-result v6

    if-ge v4, v6, :cond_0

    invoke-virtual {v0, v4}, La/e/g;->b(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    aput-object v6, v2, v5

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    invoke-virtual {v1}, La/e/g;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    invoke-virtual {v1, v3}, La/e/g;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v2, v5

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final w(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dj0;->c:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->y()La/e/g;

    move-result-object v0

    invoke-virtual {v0, p1}, La/e/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
