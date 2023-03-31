.class public final Lcom/google/android/gms/internal/ads/z40;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/sh1;

.field private final b:Lcom/google/android/gms/internal/ads/fo;

.field private final c:Landroid/content/pm/ApplicationInfo;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Landroid/content/pm/PackageInfo;

.field private final g:Lcom/google/android/gms/internal/ads/l42;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l42<",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final h:Lcom/google/android/gms/internal/ads/yk;

.field private final i:Ljava/lang/String;

.field private final j:Lcom/google/android/gms/internal/ads/x61;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/x61<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/sh1;Lcom/google/android/gms/internal/ads/fo;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Lcom/google/android/gms/internal/ads/l42;Lcom/google/android/gms/internal/ads/yk;Ljava/lang/String;Lcom/google/android/gms/internal/ads/x61;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/sh1;",
            "Lcom/google/android/gms/internal/ads/fo;",
            "Landroid/content/pm/ApplicationInfo;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/pm/PackageInfo;",
            "Lcom/google/android/gms/internal/ads/l42<",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Ljava/lang/String;",
            ">;>;",
            "Lcom/google/android/gms/internal/ads/yk;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/x61<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/z40;->a:Lcom/google/android/gms/internal/ads/sh1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/z40;->b:Lcom/google/android/gms/internal/ads/fo;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/z40;->c:Landroid/content/pm/ApplicationInfo;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/z40;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/z40;->e:Ljava/util/List;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/z40;->f:Landroid/content/pm/PackageInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/z40;->g:Lcom/google/android/gms/internal/ads/l42;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/z40;->h:Lcom/google/android/gms/internal/ads/yk;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/z40;->i:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/z40;->j:Lcom/google/android/gms/internal/ads/x61;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z40;->a:Lcom/google/android/gms/internal/ads/sh1;

    sget-object v1, Lcom/google/android/gms/internal/ads/ph1;->c:Lcom/google/android/gms/internal/ads/ph1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ih1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/z40;->j:Lcom/google/android/gms/internal/ads/x61;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/x61;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ih1;->a(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object v0

    return-object v0
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/zf;
    .locals 13

    new-instance v12, Lcom/google/android/gms/internal/ads/zf;

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/os/Bundle;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/z40;->b:Lcom/google/android/gms/internal/ads/fo;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/z40;->c:Landroid/content/pm/ApplicationInfo;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/z40;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/z40;->e:Ljava/util/List;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/z40;->f:Landroid/content/pm/PackageInfo;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/z40;->g:Lcom/google/android/gms/internal/ads/l42;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/l42;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/lo1;

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/z40;->h:Lcom/google/android/gms/internal/ads/yk;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/yk;->b()Z

    move-result v8

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/z40;->i:Ljava/lang/String;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/ads/zf;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/fo;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Ljava/lang/String;ZLjava/lang/String;Lcom/google/android/gms/internal/ads/nf1;Ljava/lang/String;)V

    return-object v12
.end method

.method public final b()Lcom/google/android/gms/internal/ads/lo1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/zf;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/z40;->a()Lcom/google/android/gms/internal/ads/lo1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/z40;->a:Lcom/google/android/gms/internal/ads/sh1;

    sget-object v2, Lcom/google/android/gms/internal/ads/ph1;->d:Lcom/google/android/gms/internal/ads/ph1;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/android/gms/internal/ads/lo1;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/z40;->g:Lcom/google/android/gms/internal/ads/l42;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/l42;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/lo1;

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/eh1;->a(Ljava/lang/Object;[Lcom/google/android/gms/internal/ads/lo1;)Lcom/google/android/gms/internal/ads/gh1;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/c50;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/c50;-><init>(Lcom/google/android/gms/internal/ads/z40;Lcom/google/android/gms/internal/ads/lo1;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/gh1;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/kh1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kh1;->a()Lcom/google/android/gms/internal/ads/bh1;

    move-result-object v0

    return-object v0
.end method
