.class public final Lcom/google/android/gms/internal/ads/gu0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/mt0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/mt0<",
        "Lcom/google/android/gms/internal/ads/n00;",
        "Lcom/google/android/gms/internal/ads/qc;",
        "Lcom/google/android/gms/internal/ads/uu0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/k10;

.field private c:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/k10;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gu0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gu0;->b:Lcom/google/android/gms/internal/ads/k10;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/gu0;Landroid/view/View;)Landroid/view/View;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gu0;->c:Landroid/view/View;

    return-object p1
.end method

.method static final synthetic a(Lcom/google/android/gms/internal/ads/lt0;)Lcom/google/android/gms/internal/ads/rp2;
    .locals 1

    :try_start_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/lt0;->b:Ljava/lang/Object;

    check-cast p0, Lcom/google/android/gms/internal/ads/qc;

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/qc;->getVideoController()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/android/gms/internal/ads/fe1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/fe1;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/vd1;",
            "Lcom/google/android/gms/internal/ads/id1;",
            "Lcom/google/android/gms/internal/ads/lt0<",
            "Lcom/google/android/gms/internal/ads/qc;",
            "Lcom/google/android/gms/internal/ads/uu0;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/lt0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/qc;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/id1;->Q:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/qc;->r(Ljava/lang/String;)V

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/lt0;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/ads/qc;

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/id1;->K:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/id1;->s:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/gu0;->a:Landroid/content/Context;

    invoke-static {p2}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/internal/ads/hu0;

    const/4 p2, 0x0

    invoke-direct {v6, p0, p3, p2}, Lcom/google/android/gms/internal/ads/hu0;-><init>(Lcom/google/android/gms/internal/ads/gu0;Lcom/google/android/gms/internal/ads/lt0;Lcom/google/android/gms/internal/ads/iu0;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    move-object v7, p2

    check-cast v7, Lcom/google/android/gms/internal/ads/xa;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v8, p1, Lcom/google/android/gms/internal/ads/zd1;->e:Lcom/google/android/gms/internal/ads/um2;

    invoke-interface/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/qc;->a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/ec;Lcom/google/android/gms/internal/ads/xa;Lcom/google/android/gms/internal/ads/um2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/internal/ads/fe1;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/fe1;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gu0;->b:Lcom/google/android/gms/internal/ads/k10;

    new-instance v1, Lcom/google/android/gms/internal/ads/d30;

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/lt0;->a:Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2}, Lcom/google/android/gms/internal/ads/d30;-><init>(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/r00;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gu0;->c:Landroid/view/View;

    new-instance v3, Lcom/google/android/gms/internal/ads/fu0;

    invoke-direct {v3, p3}, Lcom/google/android/gms/internal/ads/fu0;-><init>(Lcom/google/android/gms/internal/ads/lt0;)V

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/id1;->r:Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/hd1;

    const/4 v4, 0x0

    invoke-direct {p1, v2, v4, v3, p2}, Lcom/google/android/gms/internal/ads/r00;-><init>(Landroid/view/View;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/l20;Lcom/google/android/gms/internal/ads/hd1;)V

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/k10;->a(Lcom/google/android/gms/internal/ads/d30;Lcom/google/android/gms/internal/ads/r00;)Lcom/google/android/gms/internal/ads/m00;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/m00;->j()Lcom/google/android/gms/internal/ads/za0;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gu0;->c:Landroid/view/View;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/za0;->a(Landroid/view/View;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    check-cast p2, Lcom/google/android/gms/internal/ads/uu0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/m20;->g()Lcom/google/android/gms/internal/ads/zx0;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/uu0;->a(Lcom/google/android/gms/internal/ads/xa;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/m00;->i()Lcom/google/android/gms/internal/ads/n00;

    move-result-object p1

    return-object p1
.end method
