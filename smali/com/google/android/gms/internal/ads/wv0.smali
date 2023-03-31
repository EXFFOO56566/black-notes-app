.class public final Lcom/google/android/gms/internal/ads/wv0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/mt0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/mt0<",
        "Lcom/google/android/gms/internal/ads/xe0;",
        "Lcom/google/android/gms/internal/ads/qc;",
        "Lcom/google/android/gms/internal/ads/uu0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/zd0;

.field private c:Lcom/google/android/gms/internal/ads/hb;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zd0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wv0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wv0;->b:Lcom/google/android/gms/internal/ads/zd0;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/wv0;Lcom/google/android/gms/internal/ads/hb;)Lcom/google/android/gms/internal/ads/hb;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wv0;->c:Lcom/google/android/gms/internal/ads/hb;

    return-object p1
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)V
    .locals 8
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

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wv0;->a:Landroid/content/Context;

    invoke-static {p1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/internal/ads/yv0;

    const/4 p1, 0x0

    invoke-direct {v6, p0, p3, p1}, Lcom/google/android/gms/internal/ads/yv0;-><init>(Lcom/google/android/gms/internal/ads/wv0;Lcom/google/android/gms/internal/ads/lt0;Lcom/google/android/gms/internal/ads/zv0;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    move-object v7, p1

    check-cast v7, Lcom/google/android/gms/internal/ads/xa;

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/qc;->a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/rm2;Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/kc;Lcom/google/android/gms/internal/ads/xa;)V
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
    .locals 4

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zd1;->g:Ljava/util/ArrayList;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wv0;->c:Lcom/google/android/gms/internal/ads/hb;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/hb;)Lcom/google/android/gms/internal/ads/if0;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zd1;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->o()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wv0;->b:Lcom/google/android/gms/internal/ads/zd0;

    new-instance v2, Lcom/google/android/gms/internal/ads/d30;

    iget-object v3, p3, Lcom/google/android/gms/internal/ads/lt0;->a:Ljava/lang/String;

    invoke-direct {v2, p1, p2, v3}, Lcom/google/android/gms/internal/ads/d30;-><init>(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/wf0;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/wf0;-><init>(Lcom/google/android/gms/internal/ads/if0;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/ah0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wv0;->c:Lcom/google/android/gms/internal/ads/hb;

    const/4 v3, 0x0

    invoke-direct {p2, v3, v3, v0}, Lcom/google/android/gms/internal/ads/ah0;-><init>(Lcom/google/android/gms/internal/ads/gb;Lcom/google/android/gms/internal/ads/ab;Lcom/google/android/gms/internal/ads/hb;)V

    invoke-virtual {v1, v2, p1, p2}, Lcom/google/android/gms/internal/ads/zd0;->a(Lcom/google/android/gms/internal/ads/d30;Lcom/google/android/gms/internal/ads/wf0;Lcom/google/android/gms/internal/ads/ah0;)Lcom/google/android/gms/internal/ads/jf0;

    move-result-object p1

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    check-cast p2, Lcom/google/android/gms/internal/ads/uu0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/m20;->g()Lcom/google/android/gms/internal/ads/zx0;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/uu0;->a(Lcom/google/android/gms/internal/ads/xa;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hf0;->h()Lcom/google/android/gms/internal/ads/xe0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/pw0;

    const/4 p2, 0x0

    const-string p3, "No corresponding native ad listener"

    invoke-direct {p1, p3, p2}, Lcom/google/android/gms/internal/ads/pw0;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/pw0;

    const/4 p2, 0x1

    const-string p3, "Unified must be used for RTB."

    invoke-direct {p1, p3, p2}, Lcom/google/android/gms/internal/ads/pw0;-><init>(Ljava/lang/String;I)V

    throw p1
.end method
