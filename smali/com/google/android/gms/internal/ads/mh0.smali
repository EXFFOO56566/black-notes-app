.class final synthetic Lcom/google/android/gms/internal/ads/mh0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/kh0;

.field private final b:Lcom/google/android/gms/internal/ads/lo1;

.field private final c:Lcom/google/android/gms/internal/ads/lo1;

.field private final d:Lcom/google/android/gms/internal/ads/lo1;

.field private final e:Lcom/google/android/gms/internal/ads/lo1;

.field private final f:Lcom/google/android/gms/internal/ads/lo1;

.field private final g:Lorg/json/JSONObject;

.field private final h:Lcom/google/android/gms/internal/ads/lo1;

.field private final i:Lcom/google/android/gms/internal/ads/lo1;

.field private final j:Lcom/google/android/gms/internal/ads/lo1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/kh0;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;Lcom/google/android/gms/internal/ads/lo1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mh0;->a:Lcom/google/android/gms/internal/ads/kh0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/mh0;->b:Lcom/google/android/gms/internal/ads/lo1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/mh0;->c:Lcom/google/android/gms/internal/ads/lo1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/mh0;->d:Lcom/google/android/gms/internal/ads/lo1;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/mh0;->e:Lcom/google/android/gms/internal/ads/lo1;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/mh0;->f:Lcom/google/android/gms/internal/ads/lo1;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/mh0;->g:Lorg/json/JSONObject;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/mh0;->h:Lcom/google/android/gms/internal/ads/lo1;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/mh0;->i:Lcom/google/android/gms/internal/ads/lo1;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/mh0;->j:Lcom/google/android/gms/internal/ads/lo1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mh0;->b:Lcom/google/android/gms/internal/ads/lo1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mh0;->c:Lcom/google/android/gms/internal/ads/lo1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/mh0;->d:Lcom/google/android/gms/internal/ads/lo1;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/mh0;->e:Lcom/google/android/gms/internal/ads/lo1;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/mh0;->f:Lcom/google/android/gms/internal/ads/lo1;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/mh0;->g:Lorg/json/JSONObject;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/mh0;->h:Lcom/google/android/gms/internal/ads/lo1;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/mh0;->i:Lcom/google/android/gms/internal/ads/lo1;

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/mh0;->j:Lcom/google/android/gms/internal/ads/lo1;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/if0;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/util/List;)V

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/v1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/v1;)V

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/v1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->b(Lcom/google/android/gms/internal/ads/v1;)V

    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/o1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/o1;)V

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/ph0;->b(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->b(Ljava/util/List;)V

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/ph0;->c(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/lq2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/lq2;)V

    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/ws;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/ws;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/if0;->a(Landroid/view/View;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->i()Lcom/google/android/gms/internal/ads/rt;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->a(Lcom/google/android/gms/internal/ads/rp2;)V

    :cond_0
    invoke-interface {v7}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/ws;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/if0;->b(Lcom/google/android/gms/internal/ads/ws;)V

    :cond_1
    invoke-interface {v8}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/ei0;

    iget v3, v2, Lcom/google/android/gms/internal/ads/ei0;->a:I

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    goto :goto_0

    :cond_2
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/ei0;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/ei0;->d:Lcom/google/android/gms/internal/ads/i1;

    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/i1;)V

    goto :goto_0

    :cond_3
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/ei0;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/ei0;->c:Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/internal/ads/if0;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    return-object v0
.end method
