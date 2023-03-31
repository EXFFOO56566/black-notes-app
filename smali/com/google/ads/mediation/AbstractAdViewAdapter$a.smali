.class final Lcom/google/ads/mediation/AbstractAdViewAdapter$a;
.super Lcom/google/android/gms/ads/mediation/s;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ads/mediation/AbstractAdViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final n:Lcom/google/android/gms/ads/s/h;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/s/h;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/mediation/s;-><init>()V

    iput-object p1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$a;->n:Lcom/google/android/gms/ads/s/h;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/h;->e()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/s;->d(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/h;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/s;->a(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/h;->c()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/s;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/h;->g()Lcom/google/android/gms/ads/s/c$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/h;->g()Lcom/google/android/gms/ads/s/c$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/s;->a(Lcom/google/android/gms/ads/s/c$b;)V

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/h;->d()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/s;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/h;->b()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/s;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/q;->b(Z)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/mediation/q;->a(Z)V

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/h;->h()Lcom/google/android/gms/ads/p;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/mediation/q;->a(Lcom/google/android/gms/ads/p;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/ads/s/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/ads/s/e;

    iget-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$a;->n:Lcom/google/android/gms/ads/s/h;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/s/e;->setNativeAd(Lcom/google/android/gms/ads/s/c;)V

    :cond_0
    sget-object v0, Lcom/google/android/gms/ads/s/f;->c:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/s/f;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter$a;->n:Lcom/google/android/gms/ads/s/h;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/s/f;->a(Lcom/google/android/gms/ads/s/c;)V

    :cond_1
    return-void
.end method
