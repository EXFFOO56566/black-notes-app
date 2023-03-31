.class public final Lcom/google/android/gms/internal/ads/tb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/mediation/t;


# instance fields
.field private final a:Ljava/util/Date;

.field private final b:I

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Z

.field private final e:Landroid/location/Location;

.field private final f:I

.field private final g:Lcom/google/android/gms/internal/ads/m1;

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Z

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZILcom/google/android/gms/internal/ads/m1;Ljava/util/List;ZILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "I",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/location/Location;",
            "ZI",
            "Lcom/google/android/gms/internal/ads/m1;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZI",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tb;->a:Ljava/util/Date;

    iput p2, p0, Lcom/google/android/gms/internal/ads/tb;->b:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/tb;->c:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/tb;->e:Landroid/location/Location;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/tb;->d:Z

    iput p6, p0, Lcom/google/android/gms/internal/ads/tb;->f:I

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/tb;->g:Lcom/google/android/gms/internal/ads/m1;

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ads/tb;->i:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tb;->h:Ljava/util/List;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tb;->j:Ljava/util/Map;

    if-eqz p8, :cond_3

    invoke-interface {p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string p3, "custom:"

    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p3, 0x3

    const-string p4, ":"

    invoke-virtual {p2, p4, p3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p2

    array-length p4, p2

    if-ne p4, p3, :cond_0

    const/4 p3, 0x2

    aget-object p4, p2, p3

    const-string p5, "true"

    invoke-virtual {p5, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    const/4 p5, 0x1

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/tb;->j:Ljava/util/Map;

    aget-object p2, p2, p5

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    :goto_1
    invoke-interface {p3, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    aget-object p3, p2, p3

    const-string p4, "false"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/tb;->j:Ljava/util/Map;

    aget-object p2, p2, p5

    const/4 p4, 0x0

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    goto :goto_1

    :cond_2
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/tb;->h:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/tb;->i:Z

    return v0
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    const-string v1, "2"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->h:Ljava/util/List;

    const-string v1, "6"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Ljava/util/Date;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->a:Ljava/util/Date;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/tb;->d:Z

    return v0
.end method

.method public final e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->c:Ljava/util/Set;

    return-object v0
.end method

.method public final f()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->j:Ljava/util/Map;

    return-object v0
.end method

.method public final g()Lcom/google/android/gms/ads/s/d;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->g:Lcom/google/android/gms/internal/ads/m1;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/ads/s/d$a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/s/d$a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tb;->g:Lcom/google/android/gms/internal/ads/m1;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ads/m1;->c:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/s/d$a;->b(Z)Lcom/google/android/gms/ads/s/d$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tb;->g:Lcom/google/android/gms/internal/ads/m1;

    iget v1, v1, Lcom/google/android/gms/internal/ads/m1;->d:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/s/d$a;->b(I)Lcom/google/android/gms/ads/s/d$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tb;->g:Lcom/google/android/gms/internal/ads/m1;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ads/m1;->e:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/s/d$a;->a(Z)Lcom/google/android/gms/ads/s/d$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tb;->g:Lcom/google/android/gms/internal/ads/m1;

    iget v2, v1, Lcom/google/android/gms/internal/ads/m1;->b:I

    const/4 v3, 0x2

    if-lt v2, v3, :cond_1

    iget v1, v1, Lcom/google/android/gms/internal/ads/m1;->f:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/s/d$a;->a(I)Lcom/google/android/gms/ads/s/d$a;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tb;->g:Lcom/google/android/gms/internal/ads/m1;

    iget v2, v1, Lcom/google/android/gms/internal/ads/m1;->b:I

    const/4 v3, 0x3

    if-lt v2, v3, :cond_2

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/m1;->g:Lcom/google/android/gms/internal/ads/er2;

    if-eqz v1, :cond_2

    new-instance v2, Lcom/google/android/gms/ads/q;

    invoke-direct {v2, v1}, Lcom/google/android/gms/ads/q;-><init>(Lcom/google/android/gms/internal/ads/er2;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/s/d$a;->a(Lcom/google/android/gms/ads/q;)Lcom/google/android/gms/ads/s/d$a;

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/ads/s/d$a;->a()Lcom/google/android/gms/ads/s/d;

    move-result-object v0

    return-object v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/tb;->f:I

    return v0
.end method

.method public final i()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    const-string v1, "6"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    const-string v1, "3"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->e:Landroid/location/Location;

    return-object v0
.end method

.method public final l()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    const-string v1, "1"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->h:Ljava/util/List;

    const-string v1, "6"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final m()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/tb;->b:I

    return v0
.end method
