.class public final Lcom/google/android/gms/internal/ads/ld0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/o;
.implements Lcom/google/android/gms/internal/ads/l70;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/ws;

.field private final d:Lcom/google/android/gms/internal/ads/id1;

.field private final e:Lcom/google/android/gms/internal/ads/fo;

.field private final f:Lcom/google/android/gms/internal/ads/ik2$a;

.field private g:Lb/c/b/a/d/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/ik2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ld0;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ld0;->c:Lcom/google/android/gms/internal/ads/ws;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ld0;->d:Lcom/google/android/gms/internal/ads/id1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/ld0;->e:Lcom/google/android/gms/internal/ads/fo;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/ld0;->f:Lcom/google/android/gms/internal/ads/ik2$a;

    return-void
.end method


# virtual methods
.method public final I()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->g:Lb/c/b/a/d/a;

    return-void
.end method

.method public final onPause()V
    .locals 0

    return-void
.end method

.method public final onResume()V
    .locals 0

    return-void
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->g:Lb/c/b/a/d/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->c:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "onSdkImpression"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/e7;->a(Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final s()V
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->f:Lcom/google/android/gms/internal/ads/ik2$a;

    sget-object v1, Lcom/google/android/gms/internal/ads/ik2$a;->j:Lcom/google/android/gms/internal/ads/ik2$a;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/ik2$a;->f:Lcom/google/android/gms/internal/ads/ik2$a;

    if-ne v0, v1, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->d:Lcom/google/android/gms/internal/ads/id1;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/id1;->J:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->c:Lcom/google/android/gms/internal/ads/ws;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->r()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld0;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/yd;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->e:Lcom/google/android/gms/internal/ads/fo;

    iget v1, v0, Lcom/google/android/gms/internal/ads/fo;->c:I

    iget v0, v0, Lcom/google/android/gms/internal/ads/fo;->d:I

    const/16 v2, 0x17

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->d:Lcom/google/android/gms/internal/ads/id1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/id1;->L:Lorg/json/JSONObject;

    const/4 v1, -0x1

    const-string v2, "media_type"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const-string v0, "javascript"

    :goto_0
    move-object v9, v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->r()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getWebView()Landroid/webkit/WebView;

    move-result-object v6

    const-string v7, ""

    const-string v8, "javascript"

    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/yd;->a(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lb/c/b/a/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->g:Lb/c/b/a/d/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->r()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld0;->g:Lb/c/b/a/d/a;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ld0;->c:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/yd;->a(Lb/c/b/a/d/a;Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ld0;->c:Lcom/google/android/gms/internal/ads/ws;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld0;->g:Lb/c/b/a/d/a;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ws;->a(Lb/c/b/a/d/a;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->r()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ld0;->g:Lb/c/b/a/d/a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/yd;->a(Lb/c/b/a/d/a;)V

    :cond_2
    return-void
.end method
