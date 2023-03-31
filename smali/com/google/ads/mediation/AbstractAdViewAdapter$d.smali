.class final Lcom/google/ads/mediation/AbstractAdViewAdapter$d;
.super Lcom/google/android/gms/ads/mediation/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ads/mediation/AbstractAdViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private final s:Lcom/google/android/gms/ads/s/k;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/s/k;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/mediation/w;-><init>()V

    iput-object p1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$d;->s:Lcom/google/android/gms/ads/s/k;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->d(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->a(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->e()Lcom/google/android/gms/ads/s/c$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->a(Lcom/google/android/gms/ads/s/c$b;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->h()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->a(Ljava/lang/Double;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->f(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->e(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->l()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->a(Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->b(Z)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/w;->a(Z)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->j()Lcom/google/android/gms/ads/p;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/mediation/w;->a(Lcom/google/android/gms/ads/p;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    instance-of p2, p1, Lcom/google/android/gms/ads/s/l;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/google/android/gms/ads/s/l;

    iget-object p2, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$d;->s:Lcom/google/android/gms/ads/s/k;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/s/l;->setNativeAd(Lcom/google/android/gms/ads/s/k;)V

    return-void

    :cond_0
    sget-object p2, Lcom/google/android/gms/ads/s/f;->c:Ljava/util/WeakHashMap;

    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/s/f;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$d;->s:Lcom/google/android/gms/ads/s/k;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/s/f;->a(Lcom/google/android/gms/ads/s/k;)V

    :cond_1
    return-void
.end method
