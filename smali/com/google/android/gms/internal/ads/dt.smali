.class final synthetic Lcom/google/android/gms/internal/ads/dt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ln1;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/eq1;

.field private final c:Lcom/google/android/gms/internal/ads/fo;

.field private final d:Lcom/google/android/gms/ads/internal/a;

.field private final e:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/ads/internal/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dt;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dt;->b:Lcom/google/android/gms/internal/ads/eq1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/dt;->c:Lcom/google/android/gms/internal/ads/fo;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/dt;->d:Lcom/google/android/gms/ads/internal/a;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/dt;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 13

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dt;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/dt;->b:Lcom/google/android/gms/internal/ads/eq1;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/dt;->c:Lcom/google/android/gms/internal/ads/fo;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/dt;->d:Lcom/google/android/gms/ads/internal/a;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dt;->e:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->d()Lcom/google/android/gms/internal/ads/et;

    invoke-static {}, Lcom/google/android/gms/internal/ads/lu;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/wj2;->a()Lcom/google/android/gms/internal/ads/wj2;

    move-result-object v10

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v0 .. v12}, Lcom/google/android/gms/internal/ads/et;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/lu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/ads/internal/i;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/yi2;Z)Lcom/google/android/gms/internal/ads/ws;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/so;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/so;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->P()Lcom/google/android/gms/internal/ads/ju;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/ft;

    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/ads/ft;-><init>(Lcom/google/android/gms/internal/ads/so;)V

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/ju;->a(Lcom/google/android/gms/internal/ads/iu;)V

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ws;->loadUrl(Ljava/lang/String;)V

    return-object v1
.end method
