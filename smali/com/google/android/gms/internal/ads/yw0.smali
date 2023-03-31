.class public final Lcom/google/android/gms/internal/ads/yw0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/mt0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/mt0<",
        "Lcom/google/android/gms/internal/ads/ck0;",
        "Lcom/google/android/gms/internal/ads/qc;",
        "Lcom/google/android/gms/internal/ads/uu0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/fk0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fk0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yw0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yw0;->b:Lcom/google/android/gms/internal/ads/fk0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)V
    .locals 10
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

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zd1;->n:Lcom/google/android/gms/internal/ads/ld1;

    iget v0, v0, Lcom/google/android/gms/internal/ads/ld1;->a:I

    sget v1, Lcom/google/android/gms/internal/ads/qd1;->c:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/lt0;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/qc;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/id1;->K:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/id1;->s:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/yw0;->a:Landroid/content/Context;

    invoke-static {p1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/ax0;

    invoke-direct {v8, p0, p3, v2}, Lcom/google/android/gms/internal/ads/ax0;-><init>(Lcom/google/android/gms/internal/ads/yw0;Lcom/google/android/gms/internal/ads/lt0;Lcom/google/android/gms/internal/ads/xw0;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    move-object v9, p1

    check-cast v9, Lcom/google/android/gms/internal/ads/xa;

    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/qc;->b(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/lc;Lcom/google/android/gms/internal/ads/xa;)V

    return-void

    :cond_0
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/lt0;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/qc;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/id1;->K:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/id1;->s:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/yw0;->a:Landroid/content/Context;

    invoke-static {p1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/ax0;

    invoke-direct {v8, p0, p3, v2}, Lcom/google/android/gms/internal/ads/ax0;-><init>(Lcom/google/android/gms/internal/ads/yw0;Lcom/google/android/gms/internal/ads/lt0;Lcom/google/android/gms/internal/ads/xw0;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    move-object v9, p1

    check-cast v9, Lcom/google/android/gms/internal/ads/xa;

    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/qc;->a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/lc;Lcom/google/android/gms/internal/ads/xa;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Remote exception loading a rewarded RTB ad"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/fv0;

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/lt0;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/qc;

    const/4 v2, 0x1

    invoke-direct {v0, p2, v1, v2}, Lcom/google/android/gms/internal/ads/fv0;-><init>(Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/qc;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yw0;->b:Lcom/google/android/gms/internal/ads/fk0;

    new-instance v2, Lcom/google/android/gms/internal/ads/d30;

    iget-object v3, p3, Lcom/google/android/gms/internal/ads/lt0;->a:Ljava/lang/String;

    invoke-direct {v2, p1, p2, v3}, Lcom/google/android/gms/internal/ads/d30;-><init>(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/dk0;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/dk0;-><init>(Lcom/google/android/gms/internal/ads/id0;)V

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ads/fk0;->a(Lcom/google/android/gms/internal/ads/d30;Lcom/google/android/gms/internal/ads/dk0;)Lcom/google/android/gms/internal/ads/ek0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/m20;->d()Lcom/google/android/gms/internal/ads/m60;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/fv0;->a(Lcom/google/android/gms/internal/ads/m60;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    check-cast p2, Lcom/google/android/gms/internal/ads/uu0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ek0;->n()Lcom/google/android/gms/internal/ads/wx0;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/uu0;->a(Lcom/google/android/gms/internal/ads/xa;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ek0;->k()Lcom/google/android/gms/internal/ads/ck0;

    move-result-object p1

    return-object p1
.end method
