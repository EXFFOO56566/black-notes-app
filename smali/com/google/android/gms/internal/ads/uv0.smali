.class public final Lcom/google/android/gms/internal/ads/uv0;
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
        "Lcom/google/android/gms/internal/ads/le1;",
        "Lcom/google/android/gms/internal/ads/uu0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/zd0;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zd0;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uv0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uv0;->b:Lcom/google/android/gms/internal/ads/zd0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/uv0;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/ads/vd1;I)Z
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zd1;->g:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
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
            "Lcom/google/android/gms/internal/ads/le1;",
            "Lcom/google/android/gms/internal/ads/uu0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/lt0;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/ads/le1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/uv0;->a:Landroid/content/Context;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/id1;->s:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/id1;->p:Lcom/google/android/gms/internal/ads/md1;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/an;->a(Lcom/google/android/gms/internal/ads/bn;)Ljava/lang/String;

    move-result-object v5

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    move-object v6, p2

    check-cast v6, Lcom/google/android/gms/internal/ads/xa;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v7, p1, Lcom/google/android/gms/internal/ads/zd1;->i:Lcom/google/android/gms/internal/ads/m1;

    iget-object v8, p1, Lcom/google/android/gms/internal/ads/zd1;->g:Ljava/util/ArrayList;

    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/le1;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/rm2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/xa;Lcom/google/android/gms/internal/ads/m1;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/lt0;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/lt0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/le1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/le1;->i()Lcom/google/android/gms/internal/ads/ab;

    move-result-object v0

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/lt0;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/le1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/le1;->j()Lcom/google/android/gms/internal/ads/gb;

    move-result-object v1

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/lt0;->b:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/internal/ads/le1;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/le1;->l()Lcom/google/android/gms/internal/ads/hb;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x6

    if-eqz v2, :cond_0

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/uv0;->a(Lcom/google/android/gms/internal/ads/vd1;I)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/hb;)Lcom/google/android/gms/internal/ads/if0;

    move-result-object v4

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/uv0;->a(Lcom/google/android/gms/internal/ads/vd1;I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/if0;->b(Lcom/google/android/gms/internal/ads/ab;)Lcom/google/android/gms/internal/ads/if0;

    move-result-object v4

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    const/4 v5, 0x2

    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/uv0;->a(Lcom/google/android/gms/internal/ads/vd1;I)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/ab;)Lcom/google/android/gms/internal/ads/if0;

    move-result-object v4

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/uv0;->a(Lcom/google/android/gms/internal/ads/vd1;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/if0;->b(Lcom/google/android/gms/internal/ads/gb;)Lcom/google/android/gms/internal/ads/if0;

    move-result-object v4

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_5

    const/4 v4, 0x1

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/uv0;->a(Lcom/google/android/gms/internal/ads/vd1;I)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/gb;)Lcom/google/android/gms/internal/ads/if0;

    move-result-object v4

    :goto_0
    iget-object v5, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zd1;->g:Ljava/util/ArrayList;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/if0;->o()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/uv0;->b:Lcom/google/android/gms/internal/ads/zd0;

    new-instance v5, Lcom/google/android/gms/internal/ads/d30;

    iget-object v6, p3, Lcom/google/android/gms/internal/ads/lt0;->a:Ljava/lang/String;

    invoke-direct {v5, p1, p2, v6}, Lcom/google/android/gms/internal/ads/d30;-><init>(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/wf0;

    invoke-direct {p1, v4}, Lcom/google/android/gms/internal/ads/wf0;-><init>(Lcom/google/android/gms/internal/ads/if0;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/ah0;

    invoke-direct {p2, v1, v0, v2}, Lcom/google/android/gms/internal/ads/ah0;-><init>(Lcom/google/android/gms/internal/ads/gb;Lcom/google/android/gms/internal/ads/ab;Lcom/google/android/gms/internal/ads/hb;)V

    invoke-virtual {v3, v5, p1, p2}, Lcom/google/android/gms/internal/ads/zd0;->a(Lcom/google/android/gms/internal/ads/d30;Lcom/google/android/gms/internal/ads/wf0;Lcom/google/android/gms/internal/ads/ah0;)Lcom/google/android/gms/internal/ads/jf0;

    move-result-object p1

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    check-cast p2, Lcom/google/android/gms/internal/ads/uu0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/m20;->f()Lcom/google/android/gms/internal/ads/gy0;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/uu0;->a(Lcom/google/android/gms/internal/ads/xa;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/m20;->a()Lcom/google/android/gms/internal/ads/p60;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/ry;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/lt0;->b:Ljava/lang/Object;

    check-cast p3, Lcom/google/android/gms/internal/ads/le1;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ads/ry;-><init>(Lcom/google/android/gms/internal/ads/le1;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/uv0;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, p3}, Lcom/google/android/gms/internal/ads/j90;->a(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hf0;->h()Lcom/google/android/gms/internal/ads/xe0;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/pw0;

    const-string p2, "No corresponding native ad listener"

    invoke-direct {p1, p2, v3}, Lcom/google/android/gms/internal/ads/pw0;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/pw0;

    const-string p2, "No native ad mappers"

    invoke-direct {p1, p2, v3}, Lcom/google/android/gms/internal/ads/pw0;-><init>(Ljava/lang/String;I)V

    throw p1
.end method
